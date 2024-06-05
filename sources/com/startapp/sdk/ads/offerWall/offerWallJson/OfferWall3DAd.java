package com.startapp.sdk.ads.offerWall.offerWallJson;

import android.content.Context;
import android.content.Intent;
import com.startapp.i3;
import com.startapp.j9;
import com.startapp.p0;
import com.startapp.q2;
import com.startapp.sdk.ads.list3d.List3DActivity;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.a;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.d;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.u4;
import com.startapp.v4;
import java.util.UUID;

/* compiled from: Sta */
public class OfferWall3DAd extends JsonAd implements d {

    /* renamed from: c  reason: collision with root package name */
    public static String f16559c = null;
    private static final long serialVersionUID = 1;
    private final String uuid = UUID.randomUUID().toString();

    public OfferWall3DAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_OFFER_WALL);
        if (f16559c == null) {
            f16559c = j9.a(context);
        }
    }

    @Deprecated
    public boolean a(String str) {
        u4 a10 = v4.f17398b.a(this.uuid);
        StringBuilder a11 = p0.a("&position=");
        a11.append(a.a());
        a10.f17365c = a11.toString();
        ActivityExtra activityExtra = this.activityExtra;
        boolean a12 = activityExtra != null ? activityExtra.a() : false;
        if (super.d()) {
            a(NotDisplayedReason.AD_EXPIRED);
            return false;
        }
        Intent intent = new Intent(this.f16757a, List3DActivity.class);
        intent.putExtra("adInfoOverride", getAdInfoOverride());
        intent.putExtra("fullscreen", a12);
        intent.putExtra("adTag", str);
        intent.putExtra("lastLoadTime", super.b());
        intent.putExtra("adCacheTtl", super.c());
        intent.putExtra("position", a.a());
        intent.putExtra("listModelUuid", this.uuid);
        intent.addFlags(343932928);
        try {
            this.f16757a.startActivity(intent);
            if (AdsConstants.f16776f.booleanValue()) {
                return true;
            }
            setState(Ad.AdState.UN_INITIALIZED);
            return true;
        } catch (Throwable th) {
            i3.a(th);
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

    public String h() {
        return this.uuid;
    }

    public void a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new q2(this.f16757a, this, adPreferences, adEventListener).c();
    }

    public boolean a() {
        return super.a();
    }

    public void a(boolean z10) {
        super.a(z10);
    }
}
