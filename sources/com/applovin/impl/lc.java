package com.applovin.impl;

import android.os.Bundle;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.ad.a;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.core.domain.InitializeAndroidBoldSDK;

public class lc {

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f9214a = new StringBuilder();

    public lc a(b bVar) {
        boolean z10 = bVar instanceof bq;
        a("Format", bVar.getAdZone().d() != null ? bVar.getAdZone().d().getLabel() : null).a("Ad ID", Long.valueOf(bVar.getAdIdNumber())).a("Zone ID", bVar.getAdZone().e()).a("Ad Class", z10 ? "VastAd" : "AdServerAd");
        String dspName = bVar.getDspName();
        if (StringUtils.isValidString(dspName)) {
            a("DSP Name", dspName);
        }
        if (z10) {
            a("VAST DSP", ((bq) bVar).m1());
        }
        return this;
    }

    public lc b(b bVar) {
        a("Target", bVar.d0()).a("close_style", bVar.n()).a("close_delay_graphic", Long.valueOf(bVar.p()), "s");
        if (bVar instanceof a) {
            a aVar = (a) bVar;
            a("HTML", aVar.e1().substring(0, Math.min(aVar.e1().length(), 64)));
        }
        if (bVar.hasVideoUrl()) {
            a("close_delay", Long.valueOf(bVar.k0()), "s").a("skip_style", bVar.b0()).a("Streaming", Boolean.valueOf(bVar.G0())).a("Video Location", bVar.P()).a("video_button_properties", bVar.i0());
        }
        return this;
    }

    public String toString() {
        return this.f9214a.toString();
    }

    public lc a(AppLovinAdView appLovinAdView) {
        return a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).a("Visibility", ar.a(appLovinAdView.getVisibility()));
    }

    public lc a(Bundle bundle) {
        if (bundle == null) {
            return this;
        }
        for (String str : bundle.keySet()) {
            a(str, bundle.get(str));
        }
        return this;
    }

    public lc a() {
        this.f9214a.append("\n========================================");
        return this;
    }

    public lc b(String str) {
        this.f9214a.append(str);
        return this;
    }

    public lc a(be beVar) {
        String str = "None";
        lc a10 = a(InitializeAndroidBoldSDK.MSG_NETWORK, beVar.c()).a("Adapter Version", beVar.y()).a("Format", beVar.getFormat().getLabel()).a("Ad Unit ID", beVar.getAdUnitId()).a("Placement", beVar.getPlacement()).a("Network Placement", beVar.S()).a("Serve ID", beVar.Q()).a("Creative ID", StringUtils.isValidString(beVar.getCreativeId()) ? beVar.getCreativeId() : str).a("Ad Review Creative ID", StringUtils.isValidString(beVar.getAdReviewCreativeId()) ? beVar.getAdReviewCreativeId() : str).a("Ad Domain", StringUtils.isValidString(beVar.u()) ? beVar.u() : str).a("DSP Name", StringUtils.isValidString(beVar.getDspName()) ? beVar.getDspName() : str);
        if (StringUtils.isValidString(beVar.getDspId())) {
            str = beVar.getDspId();
        }
        return a10.a("DSP ID", str).a("Server Parameters", beVar.l());
    }

    public lc a(k kVar) {
        return a("Muted", Boolean.valueOf(kVar.g0().isMuted()));
    }

    public lc a(String str) {
        StringBuilder sb2 = this.f9214a;
        sb2.append("\n");
        sb2.append(str);
        return this;
    }

    public lc a(String str, Object obj) {
        return a(str, obj, MaxReward.DEFAULT_LABEL);
    }

    public lc a(String str, Object obj, String str2) {
        StringBuilder sb2 = this.f9214a;
        sb2.append("\n");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append(str2);
        return this;
    }
}
