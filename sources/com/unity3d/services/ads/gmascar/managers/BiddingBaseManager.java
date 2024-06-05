package com.unity3d.services.ads.gmascar.managers;

import com.applovin.mediation.MaxReward;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.ads.gmascar.utils.ScarRequestHandler;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.ScarMetric;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BiddingBaseManager implements IBiddingManager {
    private final boolean _isAsyncTokenCall;
    private final boolean _isBannerEnabled;
    private final ScarRequestHandler _scarRequestHandler;
    protected final AtomicBoolean isUploadPermitted;
    private final AtomicReference<BiddingSignals> signals;
    private final String tokenIdentifier;
    private final IUnityAdsTokenListener unityAdsTokenListener;

    public BiddingBaseManager(boolean z10, IUnityAdsTokenListener iUnityAdsTokenListener) {
        this(z10, iUnityAdsTokenListener, new ScarRequestHandler());
    }

    private synchronized void attemptUpload() {
        if (this.signals.get() != null && this.isUploadPermitted.compareAndSet(true, false)) {
            uploadSignals();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchSignals$1() {
        GMA.getInstance().getSCARBiddingSignals(this._isBannerEnabled, new IBiddingSignalsListener() {
            public void onSignalsFailure(String str) {
                BiddingBaseManager.this.sendFetchResult(str);
            }

            public void onSignalsReady(BiddingSignals biddingSignals) {
                BiddingBaseManager.this.onSignalsReady(biddingSignals);
                BiddingBaseManager.this.sendFetchResult(MaxReward.DEFAULT_LABEL);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onUnityAdsTokenReady$0(String str) {
        this.unityAdsTokenListener.onUnityAdsTokenReady(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$uploadSignals$2(BiddingSignals biddingSignals) {
        try {
            this._scarRequestHandler.makeUploadRequest(this.tokenIdentifier, biddingSignals, new ConfigurationReader().getCurrentConfiguration().getScarBiddingUrl());
            getMetricSender().sendMetric(ScarMetric.hbSignalsUploadSuccess(this._isAsyncTokenCall));
        } catch (Exception e10) {
            getMetricSender().sendMetric(ScarMetric.hbSignalsUploadFailure(this._isAsyncTokenCall, e10.getLocalizedMessage()));
        }
    }

    public void fetchSignals() {
        getMetricSender().sendMetric(ScarMetric.hbSignalsFetchStart(this._isAsyncTokenCall));
        new Thread(new a(this)).start();
    }

    public String getFormattedToken(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String tokenIdentifier2 = getTokenIdentifier();
        if (tokenIdentifier2 == null || tokenIdentifier2.isEmpty()) {
            return str;
        }
        return String.format(ScarConstants.TOKEN_WITH_SCAR_FORMAT, new Object[]{tokenIdentifier2, str});
    }

    public SDKMetricsSender getMetricSender() {
        return (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
    }

    public String getTokenIdentifier() {
        return this.tokenIdentifier;
    }

    public void onSignalsReady(BiddingSignals biddingSignals) {
        this.signals.set(biddingSignals);
        attemptUpload();
    }

    public final void onUnityAdsTokenReady(String str) {
        if (this.unityAdsTokenListener != null) {
            Utilities.wrapCustomerListener(new c(this, str));
        }
    }

    public void permitSignalsUpload() {
        this.isUploadPermitted.set(true);
        attemptUpload();
    }

    public void permitUpload() {
        this.isUploadPermitted.set(true);
    }

    public void sendFetchResult(String str) {
        if (str != MaxReward.DEFAULT_LABEL) {
            getMetricSender().sendMetric(ScarMetric.hbSignalsFetchFailure(this._isAsyncTokenCall, str));
        } else {
            getMetricSender().sendMetric(ScarMetric.hbSignalsFetchSuccess(this._isAsyncTokenCall));
        }
    }

    public abstract void start();

    public void uploadSignals() {
        getMetricSender().sendMetric(ScarMetric.hbSignalsUploadStart(this._isAsyncTokenCall));
        BiddingSignals biddingSignals = this.signals.get();
        if (biddingSignals == null || biddingSignals.isEmpty()) {
            getMetricSender().sendMetric(ScarMetric.hbSignalsUploadFailure(this._isAsyncTokenCall, "null or empty signals"));
        } else {
            new Thread(new b(this, biddingSignals)).start();
        }
    }

    public BiddingBaseManager(boolean z10, IUnityAdsTokenListener iUnityAdsTokenListener, ScarRequestHandler scarRequestHandler) {
        boolean z11 = false;
        this.isUploadPermitted = new AtomicBoolean(false);
        this.signals = new AtomicReference<>();
        this.tokenIdentifier = UUID.randomUUID().toString();
        this._isBannerEnabled = z10;
        this.unityAdsTokenListener = iUnityAdsTokenListener;
        this._isAsyncTokenCall = iUnityAdsTokenListener != null ? true : z11;
        this._scarRequestHandler = scarRequestHandler;
    }
}
