package com.startapp.sdk.ads.interstitials;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.applovin.mediation.MaxReward;
import com.startapp.i3;
import com.startapp.j9;
import com.startapp.p0;
import com.startapp.sdk.ads.splash.SplashAd;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.a;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.d;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.u1;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.Map;

/* compiled from: Sta */
public abstract class InterstitialAd extends HtmlAd implements d {
    private static final long serialVersionUID = -8158520010577551438L;

    public InterstitialAd(Context context, AdPreferences.Placement placement) {
        super(context, placement);
    }

    /* JADX WARNING: type inference failed for: r11v8, types: [java.lang.Boolean[], java.io.Serializable] */
    @Deprecated
    public boolean a(String str) {
        String a10 = a.a();
        if (!v() || !AdsCommonMetaData.f16770h.G().a().equals(VideoConfig.BackMode.DISABLED) || !a10.equals("back")) {
            if (!AdsConstants.f16776f.booleanValue()) {
                setState(Ad.AdState.UN_INITIALIZED);
            }
            if (k() == null) {
                a(NotDisplayedReason.INTERNAL_ERROR);
                return false;
            } else if (super.d()) {
                a(NotDisplayedReason.AD_EXPIRED);
                return false;
            } else {
                ActivityExtra activityExtra = this.activityExtra;
                boolean z10 = activityExtra != null && activityExtra.a();
                Intent intent = new Intent(this.f16757a, OverlayActivity.class);
                intent.putExtra("fileUrl", "exit.html");
                String[] strArr = this.trackingUrls;
                StringBuilder a11 = p0.a("&position=");
                a11.append(a.a());
                String sb2 = a11.toString();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    if (strArr[i10] != null && !MaxReward.DEFAULT_LABEL.equals(strArr[i10])) {
                        strArr[i10] = strArr[i10] + sb2;
                    }
                }
                intent.putExtra("tracking", strArr);
                intent.putExtra("trackingClickUrl", p());
                intent.putExtra("packageNames", n());
                intent.putExtra("htmlUuid", l());
                intent.putExtra("smartRedirect", this.smartRedirect);
                intent.putExtra("browserEnabled", this.inAppBrowserEnabled);
                intent.putExtra("placement", this.placement.a());
                intent.putExtra("adInfoOverride", getAdInfoOverride());
                intent.putExtra("ad", this);
                intent.putExtra("videoAd", v());
                intent.putExtra("fullscreen", z10);
                intent.putExtra(AdUnitActivity.EXTRA_ORIENTATION, m() == 0 ? this.f16757a.getResources().getConfiguration().orientation : m());
                intent.putExtra("adTag", str);
                intent.putExtra("lastLoadTime", super.b());
                intent.putExtra("adCacheTtl", super.c());
                intent.putExtra("closingUrl", g());
                intent.putExtra("rewardDuration", o());
                intent.putExtra("rewardedHideTimer", t());
                if (i() != null) {
                    intent.putExtra("delayImpressionSeconds", i());
                }
                if (h() != null) {
                    intent.putExtra("delayCloseInterval", h());
                }
                intent.putExtra("sendRedirectHops", u());
                intent.putExtra("mraidAd", s());
                if (s()) {
                    intent.putExtra("activityShouldLockOrientation", false);
                }
                Map<Activity, Integer> map = j9.f15982a;
                if (this instanceof SplashAd) {
                    intent.putExtra("isSplash", true);
                }
                intent.putExtra("position", a10);
                intent.addFlags(343932928);
                u1 g10 = ComponentLocator.a(this.f16757a).g();
                if (g10.f17358d) {
                    g10.f17357c = intent;
                } else {
                    try {
                        this.f16757a.startActivity(intent);
                    } catch (Throwable th) {
                        i3.a(th);
                        return false;
                    }
                }
                return true;
            }
        } else {
            a(NotDisplayedReason.VIDEO_BACK);
            return false;
        }
    }

    public Long b() {
        return super.b();
    }

    public Long c() {
        return super.c();
    }

    public boolean d() {
        return super.d();
    }

    public boolean v() {
        return false;
    }

    public boolean a() {
        return super.a();
    }

    public void a(boolean z10) {
        super.a(z10);
    }
}
