package com.unity3d.services.ads.gmascar.handlers;

import cb.b;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import org.json.JSONException;
import org.json.JSONObject;

public class BiddingSignalsHandler implements b {
    private final boolean isBannerEnabled;
    private final IBiddingSignalsListener listener;

    public BiddingSignalsHandler(boolean z10, IBiddingSignalsListener iBiddingSignalsListener) {
        this.listener = iBiddingSignalsListener;
        this.isBannerEnabled = z10;
    }

    private String getSignalFromJson(JSONObject jSONObject, String str) {
        return jSONObject.optString(str);
    }

    private BiddingSignals getSignals(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.isBannerEnabled) {
                return new BiddingSignals(getSignalFromJson(jSONObject, "gmaScarBiddingRewardedSignal"), getSignalFromJson(jSONObject, "gmaScarBiddingInterstitialSignal"), getSignalFromJson(jSONObject, "gmaScarBiddingBannerSignal"));
            }
            return new BiddingSignals(getSignalFromJson(jSONObject, "gmaScarBiddingRewardedSignal"), getSignalFromJson(jSONObject, "gmaScarBiddingInterstitialSignal"));
        } catch (JSONException unused) {
            return null;
        }
    }

    public void onSignalsCollected(String str) {
        this.listener.onSignalsReady(getSignals(str));
    }

    public void onSignalsCollectionFailed(String str) {
        this.listener.onSignalsFailure(str);
    }
}
