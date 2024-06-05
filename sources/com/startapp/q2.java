package com.startapp;

import android.content.Context;
import com.applovin.mediation.MaxReward;
import com.startapp.sdk.ads.offerWall.offerWallJson.OfferWall3DAd;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Sta */
public class q2 extends s0 {
    public q2(Context context, OfferWall3DAd offerWall3DAd, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, offerWall3DAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OFFER_WALL);
    }

    public void a(Ad ad2) {
        OfferWall3DAd offerWall3DAd = (OfferWall3DAd) ad2;
        List<AdDetails> g10 = offerWall3DAd.g();
        u4 a10 = v4.f17398b.a(offerWall3DAd.h());
        a10.getClass();
        a10.f17364b = new ArrayList();
        a10.f17365c = MaxReward.DEFAULT_LABEL;
        if (g10 != null) {
            for (AdDetails a11 : g10) {
                a10.a(a11);
            }
        }
    }

    public GetAdRequest d() {
        GetAdRequest d10 = super.d();
        if (d10 == null) {
            return null;
        }
        d10.f17038s0 = AdsCommonMetaData.f16770h.t();
        return d10;
    }
}
