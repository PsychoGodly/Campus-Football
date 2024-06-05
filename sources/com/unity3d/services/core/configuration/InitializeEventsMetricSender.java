package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class InitializeEventsMetricSender implements IInitializeEventsMetricSender, IInitializationListener {
    private static InitializeEventsMetricSender _instance;
    private long _configEndTime = 0;
    /* access modifiers changed from: private */
    public int _configRetryCount = 0;
    private long _configStartTime = 0;
    private boolean _initMetricSent = false;
    private long _privacyConfigEndTime = 0;
    private long _privacyConfigStartTime = 0;
    private final SDKMetricsSender _sdkMetricsSender = ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class));
    private long _startTime = 0;
    private boolean _tokenMetricSent = false;
    /* access modifiers changed from: private */
    public int _webviewRetryCount = 0;

    private InitializeEventsMetricSender() {
        InitializationNotificationCenter.getInstance().addListener(this);
    }

    public static IInitializeEventsMetricSender getInstance() {
        if (_instance == null) {
            _instance = new InitializeEventsMetricSender();
        }
        return _instance;
    }

    private Metric getPrivacyRequestMetric(boolean z10) {
        if (z10) {
            return TSIMetric.newPrivacyRequestLatencySuccess(privacyConfigDuration());
        }
        return TSIMetric.newPrivacyRequestLatencyFailure(privacyConfigDuration());
    }

    private void sendConfigResolutionRequestIfNeeded(boolean z10) {
        if (this._configStartTime == 0 || this._configEndTime == 0) {
            DeviceLog.debug("sendConfigResolutionRequestIfNeeded called with invalid timestamps, skipping metric");
        } else if (z10) {
            sendMetric(TSIMetric.newConfigRequestLatencySuccess(configRequestDuration()));
        } else {
            sendMetric(TSIMetric.newConfigRequestLatencyFailure(configRequestDuration()));
        }
    }

    private void sendPrivacyResolutionRequestIfNeeded(boolean z10) {
        if (this._privacyConfigStartTime == 0 || this._privacyConfigEndTime == 0) {
            DeviceLog.debug("sendPrivacyResolutionRequestIfNeeded called with invalid timestamps, skipping metric");
        } else {
            sendMetric(getPrivacyRequestMetric(z10));
        }
    }

    private void sendTokenAvailabilityMetricWithConfig(boolean z10) {
        Metric metric;
        if (this._startTime == 0) {
            DeviceLog.debug("sendTokenAvailabilityMetricWithConfig called before didInitStart, skipping metric");
            return;
        }
        Long valueOf = Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._startTime));
        Map<String, String> retryTags = getRetryTags();
        if (z10) {
            metric = TSIMetric.newTokenAvailabilityLatencyConfig(valueOf, retryTags);
        } else {
            metric = TSIMetric.newTokenAvailabilityLatencyWebview(valueOf, retryTags);
        }
        sendMetric(metric);
    }

    private void sendTokenResolutionRequestMetricIfNeeded() {
        if (this._configStartTime == 0) {
            DeviceLog.debug("sendTokenResolutionRequestMetricIfNeeded called before didInitStart, skipping metric");
        } else {
            sendMetric(TSIMetric.newTokenResolutionRequestLatency(tokenDuration(), getRetryTags()));
        }
    }

    public Long configRequestDuration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(this._configEndTime - this._configStartTime));
    }

    public void didConfigRequestEnd(boolean z10) {
        this._configEndTime = System.nanoTime();
        sendConfigResolutionRequestIfNeeded(z10);
    }

    public void didConfigRequestStart() {
        this._configStartTime = System.nanoTime();
    }

    public void didInitStart() {
        this._startTime = System.nanoTime();
        this._configRetryCount = 0;
        this._webviewRetryCount = 0;
        sendMetric(TSIMetric.newInitStarted());
    }

    public void didPrivacyConfigRequestEnd(boolean z10) {
        this._privacyConfigEndTime = System.nanoTime();
        sendPrivacyResolutionRequestIfNeeded(z10);
    }

    public void didPrivacyConfigRequestStart() {
        this._privacyConfigStartTime = System.nanoTime();
    }

    public Long duration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._startTime));
    }

    public Map<String, String> getErrorStateTags(ErrorState errorState) {
        Map<String, String> retryTags = getRetryTags();
        retryTags.put("stt", errorState.getMetricName());
        return retryTags;
    }

    public Map<String, String> getRetryTags() {
        return new HashMap<String, String>() {
            {
                put("c_retry", String.valueOf(InitializeEventsMetricSender.this._configRetryCount));
                put("wv_retry", String.valueOf(InitializeEventsMetricSender.this._webviewRetryCount));
            }
        };
    }

    public Long initializationStartTimeStamp() {
        return Long.valueOf(this._startTime);
    }

    public void onRetryConfig() {
        this._configRetryCount++;
    }

    public void onRetryWebview() {
        this._webviewRetryCount++;
    }

    public void onSdkInitializationFailed(String str, ErrorState errorState, int i10) {
        sdkInitializeFailed(str, errorState);
    }

    public void onSdkInitialized() {
        sdkDidInitialize();
    }

    public Long privacyConfigDuration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(this._privacyConfigEndTime - this._privacyConfigStartTime));
    }

    public synchronized void sdkDidInitialize() {
        if (initializationStartTimeStamp().longValue() == 0) {
            DeviceLog.debug("sdkDidInitialize called before didInitStart, skipping metric");
        }
    }

    public synchronized void sdkInitializeFailed(String str, ErrorState errorState) {
        if (this._startTime == 0) {
            DeviceLog.debug("sdkInitializeFailed called before didInitStart, skipping metric");
        }
    }

    public synchronized void sdkTokenDidBecomeAvailableWithConfig(boolean z10) {
        if (!this._tokenMetricSent) {
            sendTokenAvailabilityMetricWithConfig(z10);
            if (z10) {
                sendTokenResolutionRequestMetricIfNeeded();
            }
            this._tokenMetricSent = true;
        }
    }

    public void sendMetric(Metric metric) {
        this._sdkMetricsSender.sendMetric(metric);
    }

    public Long tokenDuration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._configStartTime));
    }
}
