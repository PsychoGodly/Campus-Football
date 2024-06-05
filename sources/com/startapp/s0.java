package com.startapp;

import android.content.Context;
import android.content.Intent;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.b;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.adsbase.model.GetAdResponse;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.z5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: Sta */
public abstract class s0 extends b {

    /* renamed from: g  reason: collision with root package name */
    public int f16369g = 0;

    /* renamed from: h  reason: collision with root package name */
    public Set<String> f16370h = new HashSet();

    /* compiled from: Sta */
    public class a implements g2<Throwable, Void> {
        public a() {
        }

        public Object a(Object obj) {
            Throwable th = (Throwable) obj;
            s0.this.f16914f = th != null ? th.getMessage() : null;
            return null;
        }
    }

    public s0(Context context, Ad ad2, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement) {
        super(context, ad2, adPreferences, adEventListener, placement);
    }

    public abstract void a(Ad ad2);

    public boolean a(Object obj) {
        int i10;
        GetAdResponse getAdResponse = (GetAdResponse) obj;
        boolean z10 = false;
        if (obj == null) {
            this.f16914f = "Empty Response";
            return false;
        } else if (!getAdResponse.b()) {
            this.f16914f = getAdResponse.a();
            return false;
        } else {
            JsonAd jsonAd = (JsonAd) this.f16910b;
            List<AdDetails> a10 = d0.a(this.f16909a, getAdResponse.d(), this.f16369g, this.f16370h, true);
            jsonAd.a(a10);
            jsonAd.setAdInfoOverride(getAdResponse.c());
            if (getAdResponse.d() != null && getAdResponse.d().size() > 0) {
                z10 = true;
            }
            if (!z10) {
                this.f16914f = "Empty Response";
            } else if (((ArrayList) a10).size() == 0 && (i10 = this.f16369g) == 0) {
                this.f16369g = i10 + 1;
                return b();
            }
            return z10;
        }
    }

    public Object e() {
        z5.a aVar;
        GetAdRequest d10 = d();
        if (d10 == null) {
            return null;
        }
        if (this.f16370h.size() == 0) {
            this.f16370h.add(this.f16909a.getPackageName());
        }
        int i10 = this.f16369g;
        boolean z10 = false;
        if (i10 > 0) {
            d10.J0 = false;
        }
        d10.F0 = this.f16370h;
        if (i10 == 0) {
            z10 = true;
        }
        d10.J0 = z10;
        a3 m10 = ComponentLocator.a(this.f16909a).m();
        Class cls = GetAdResponse.class;
        try {
            aVar = m10.a(AdsConstants.a(AdsConstants.AdApiType.JSON, this.f16913e), d10, new a());
        } catch (Throwable th) {
            if (m10.a(1)) {
                i3.a(th);
            }
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        try {
            return g4.a(aVar.f17586b, cls);
        } catch (Throwable th2) {
            i3.a(th2);
            return null;
        }
    }

    public void a(boolean z10) {
        super.a(z10);
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f16910b.hashCode());
        intent.putExtra("adResult", z10);
        w4.a(this.f16909a).a(intent);
        if (z10) {
            a((Ad) (JsonAd) this.f16910b);
            k.b(this.f16909a, a(), this.f16910b, false);
        }
    }
}
