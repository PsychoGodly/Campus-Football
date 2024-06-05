package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.InitializationStatusReader;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SDKMetrics {
    private static final String NULL_INSTANCE_METRICS_URL = "nullInstanceMetricsUrl";
    private static MetricSenderWithBatch _batchedSender;
    private static final AtomicBoolean _configurationIsSet = new AtomicBoolean(false);
    private static SDKMetricsSender _instance;

    private static final class NullInstance implements SDKMetricsSender {
        private final String _metricEndpoint;

        public NullInstance(String str) {
            this._metricEndpoint = str;
        }

        public String getMetricEndPoint() {
            return this._metricEndpoint;
        }

        public void sendEvent(String str) {
            DeviceLog.debug("Metric " + str + " was skipped from being sent");
        }

        public void sendMetric(Metric metric) {
            DeviceLog.debug("Metric " + metric + " was skipped from being sent");
        }

        public void sendMetricWithInitState(Metric metric) {
            sendMetric(metric);
        }

        public void sendMetrics(List<Metric> list) {
            DeviceLog.debug("Metrics: " + list + " was skipped from being sent");
        }

        public void sendEvent(String str, String str2, Map<String, String> map) {
            sendEvent(str);
        }

        public void sendEvent(String str, Map<String, String> map) {
            sendEvent(str);
        }
    }

    public static synchronized SDKMetricsSender getInstance() {
        MetricSenderWithBatch metricSenderWithBatch;
        synchronized (SDKMetrics.class) {
            if (_instance == null) {
                _instance = new NullInstance((String) null);
            }
            if (_batchedSender == null) {
                _batchedSender = new MetricSenderWithBatch(_instance, new InitializationStatusReader());
            }
            metricSenderWithBatch = _batchedSender;
        }
        return metricSenderWithBatch;
    }

    private static boolean isAllowedToSetConfiguration(Configuration configuration) {
        if (TextUtils.isEmpty(configuration.getMetricsUrl()) || !_configurationIsSet.compareAndSet(false, true)) {
            return false;
        }
        return true;
    }

    public static void setConfiguration(Configuration configuration) {
        if (configuration == null) {
            DeviceLog.debug("Metrics will not be sent from the device for this session due to misconfiguration");
        } else if (isAllowedToSetConfiguration(configuration)) {
            SDKMetricsSender sDKMetricsSender = _instance;
            if (sDKMetricsSender instanceof MetricSender) {
                ((MetricSender) sDKMetricsSender).shutdown();
            }
            if (configuration.areMetricsEnabledForCurrentSession().booleanValue()) {
                _instance = new MetricSender(configuration, new InitializationStatusReader());
            } else {
                DeviceLog.debug("Metrics will not be sent from the device for this session");
                _instance = new NullInstance(NULL_INSTANCE_METRICS_URL);
            }
            MetricSenderWithBatch metricSenderWithBatch = _batchedSender;
            if (metricSenderWithBatch == null) {
                _batchedSender = new MetricSenderWithBatch(_instance, new InitializationStatusReader());
            } else {
                metricSenderWithBatch.updateOriginal(_instance);
            }
            _batchedSender.sendQueueIfNeeded();
        }
    }
}
