package com.startapp;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.startapp.j9;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.z5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: Sta */
public abstract class r0 extends com.startapp.sdk.adsbase.b {

    /* renamed from: g  reason: collision with root package name */
    public Set<String> f16331g = new HashSet();

    /* renamed from: h  reason: collision with root package name */
    public Set<String> f16332h = new HashSet();

    /* renamed from: i  reason: collision with root package name */
    public GetAdRequest f16333i;

    /* renamed from: j  reason: collision with root package name */
    public int f16334j = 0;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f16335k;

    /* renamed from: l  reason: collision with root package name */
    public n f16336l;

    /* compiled from: Sta */
    public class a implements g2<Throwable, Void> {
        public a() {
        }

        public Object a(Object obj) {
            Throwable th = (Throwable) obj;
            r0.this.f16914f = th != null ? th.getMessage() : null;
            return null;
        }
    }

    public r0(Context context, Ad ad2, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, boolean z10) {
        super(context, ad2, adPreferences, adEventListener, placement);
        this.f16335k = z10;
    }

    public boolean a(Object obj) {
        if (obj == null) {
            if (this.f16914f == null) {
                this.f16914f = "No response";
            }
            return false;
        } else if (!(obj instanceof z5.a)) {
            if (this.f16914f == null) {
                this.f16914f = "Unknown error";
            }
            return false;
        } else {
            z5.a aVar = (z5.a) obj;
            String str = aVar.f17586b;
            try {
                ArrayList arrayList = new ArrayList();
                if (TextUtils.isEmpty(str)) {
                    if (this.f16914f == null) {
                        GetAdRequest getAdRequest = this.f16333i;
                        if (getAdRequest == null || !getAdRequest.b()) {
                            this.f16914f = "Empty Ad";
                        } else {
                            this.f16914f = "Video isn't available";
                        }
                    }
                    return false;
                }
                boolean H = AdsCommonMetaData.f16770h.H();
                String a10 = j9.a(str, "@adId@", "@adId@");
                if (a10 != null && a10.length() > 0) {
                    this.f16336l = new n(a10, aVar, this.f16335k, H);
                }
                List<AppPresenceDetails> a11 = d0.a(str, this.f16334j);
                boolean z10 = H && d0.a(this.f16909a, a11, this.f16334j, this.f16331g, (List<AppPresenceDetails>) arrayList).booleanValue();
                n nVar = this.f16336l;
                if (nVar != null) {
                    nVar.f16156f = z10;
                }
                if (z10) {
                    new c0(this.f16909a, arrayList).a();
                } else {
                    HtmlAd htmlAd = (HtmlAd) this.f16910b;
                    htmlAd.a(a11);
                    htmlAd.setRequestUrl(aVar.f17585a);
                    htmlAd.c(str);
                }
                n nVar2 = this.f16336l;
                if (nVar2 != null) {
                    nVar2.f16157g = j9.a();
                }
                if (!z10) {
                    return true;
                }
                f();
                this.f16334j++;
                return b();
            } catch (Throwable th) {
                i3.a(th);
                return false;
            }
        }
    }

    public void b(boolean z10) {
        this.f16910b.setState(z10 ? Ad.AdState.READY : Ad.AdState.UN_INITIALIZED);
    }

    public boolean b(GetAdRequest getAdRequest) {
        return getAdRequest != null;
    }

    public void c(boolean z10) {
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f16910b.hashCode());
        intent.putExtra("adResult", z10);
        w4.a(this.f16909a).a(intent);
        if (!z10) {
            k.a(this.f16909a, a(), this.f16910b, false);
            f();
        } else if (this.f16335k) {
            n nVar = this.f16336l;
            if (nVar != null) {
                nVar.f16158h = j9.a();
            }
            ComponentLocator.a(this.f16909a).f17139b.a().a(((HtmlAd) this.f16910b).k(), new b());
        } else {
            k.b(this.f16909a, a(), this.f16910b, false);
            f();
        }
    }

    public Object e() {
        GetAdRequest d10 = d();
        this.f16333i = d10;
        if (!b(d10)) {
            return null;
        }
        if (this.f16331g.size() == 0) {
            this.f16331g.add(this.f16909a.getPackageName());
        }
        GetAdRequest getAdRequest = this.f16333i;
        getAdRequest.F0 = this.f16331g;
        getAdRequest.H0 = this.f16332h;
        if (this.f16334j > 0) {
            getAdRequest.J0 = false;
            if (MetaData.f17070k.K().a(this.f16909a)) {
                SimpleTokenUtils.e(this.f16909a);
            }
        }
        a3 m10 = ComponentLocator.a(this.f16909a).m();
        try {
            return m10.a(AdsConstants.a(AdsConstants.AdApiType.HTML, this.f16913e), this.f16333i, new a());
        } catch (Throwable th) {
            if (!m10.a(1)) {
                return null;
            }
            i3.a(th);
            return null;
        }
    }

    public final void f() {
        n nVar = this.f16336l;
        if (nVar != null) {
            try {
                ComponentLocator.a(this.f16909a).H.a().a(nVar);
            } catch (Throwable th) {
                i3.a(th);
            }
            this.f16336l = null;
        }
    }

    /* compiled from: Sta */
    public class b implements j9.b {
        public b() {
        }

        public void a(boolean z10, long j10, long j11, boolean z11) {
            r0 r0Var = r0.this;
            k.b(r0Var.f16909a, r0Var.a(), r0.this.f16910b, false);
            r0 r0Var2 = r0.this;
            n nVar = r0Var2.f16336l;
            if (nVar != null) {
                nVar.f16155e = z10;
                nVar.f16159i = j10;
                nVar.f16160j = j11;
                nVar.f16162l = z11;
                r0Var2.f();
            }
        }

        public void a(int i10, String str) {
            r0.this.f16910b.setErrorMessage(str);
            r0 r0Var = r0.this;
            k.a(r0Var.f16909a, r0Var.a(), r0.this.f16910b, false);
            r0 r0Var2 = r0.this;
            n nVar = r0Var2.f16336l;
            if (nVar != null) {
                nVar.f16161k = i10;
                r0Var2.f();
            }
        }
    }
}
