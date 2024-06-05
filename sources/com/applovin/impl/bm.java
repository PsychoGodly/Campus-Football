package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.am;
import com.applovin.impl.e1;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bm extends am {
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final com.applovin.impl.sdk.ad.a f6739r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f6740s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f6741t;

    class a implements e1.a {
        a() {
        }

        public void a(Uri uri) {
            if (uri != null) {
                if (bm.this.f6739r.I0()) {
                    bm.this.f6739r.b(bm.this.f6739r.e1().replaceFirst(bm.this.f6739r.h1(), uri.toString()));
                    t tVar = bm.this.f13423c;
                    if (t.a()) {
                        bm bmVar = bm.this;
                        bmVar.f13423c.a(bmVar.f13422b, "Replaced video URL with cached video URI in HTML for web video ad");
                    }
                }
                bm.this.f6739r.l1();
                bm.this.f6739r.d(uri);
            }
        }
    }

    class b implements am.e {
        b() {
        }

        public void a(String str) {
            bm.this.f6739r.b(bm.this.d(str));
            bm.this.f6739r.b(true);
            t tVar = bm.this.f13423c;
            if (t.a()) {
                bm bmVar = bm.this;
                t tVar2 = bmVar.f13423c;
                String str2 = bmVar.f13422b;
                tVar2.a(str2, "Finish caching non-video resources for ad #" + bm.this.f6739r.getAdIdNumber());
            }
            bm bmVar2 = bm.this;
            t tVar3 = bmVar2.f13423c;
            String str3 = bmVar2.f13422b;
            tVar3.f(str3, "Ad updated with cachedHTML = " + bm.this.f6739r.e1());
        }
    }

    public bm(com.applovin.impl.sdk.ad.a aVar, k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, kVar, appLovinAdLoadListener);
        this.f6739r = aVar;
    }

    /* access modifiers changed from: private */
    public String d(String str) {
        if (zp.h(k.k())) {
            str = zp.b(str);
        }
        return this.f6739r.isOpenMeasurementEnabled() ? this.f13421a.Y().a(str) : str;
    }

    private void m() {
        if (t.a()) {
            this.f13423c.a(this.f13422b, "Caching HTML resources...");
        }
        this.f6739r.b(d(a(a(this.f6739r.e1(), this.f6739r.f1(), this.f6739r.m1(), this.f6739r.X(), this.f6739r.n1()), this.f6739r.X(), (com.applovin.impl.sdk.ad.b) this.f6739r)));
        this.f6739r.b(true);
        a((com.applovin.impl.sdk.ad.b) this.f6739r);
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.a(str, "Finish caching non-video resources for ad #" + this.f6739r.getAdIdNumber());
        }
        t tVar2 = this.f13423c;
        String str2 = this.f13422b;
        tVar2.f(str2, "Ad updated with cachedHTML = " + this.f6739r.e1());
    }

    private void n() {
        Uri c10;
        if (!l() && (c10 = c(this.f6739r.j1())) != null) {
            if (this.f6739r.I0()) {
                this.f6739r.b(this.f6739r.e1().replaceFirst(this.f6739r.h1(), c10.toString()));
                if (t.a()) {
                    this.f13423c.a(this.f13422b, "Replaced video URL with cached video URI in HTML for web video ad");
                }
            }
            this.f6739r.l1();
            this.f6739r.d(c10);
        }
    }

    private d1 o() {
        if (t.a()) {
            this.f13423c.a(this.f13422b, "Caching HTML resources...");
        }
        return a(this.f6739r.e1(), this.f6739r.X(), (am.e) new b());
    }

    private e1 p() {
        return b(this.f6739r.j1(), new a());
    }

    public void b(boolean z10) {
        this.f6741t = z10;
    }

    public void c(boolean z10) {
        this.f6740s = z10;
    }

    public void run() {
        super.run();
        boolean G0 = this.f6739r.G0();
        boolean z10 = this.f6741t;
        if (G0 || z10) {
            if (t.a()) {
                t tVar = this.f13423c;
                String str = this.f13422b;
                tVar.a(str, "Begin caching for streaming ad #" + this.f6739r.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f13421a.a(oj.f10274c1)).booleanValue()) {
                if (!x3.f()) {
                    a(e());
                }
                ArrayList arrayList = new ArrayList();
                if (!G0) {
                    f();
                    d1 o10 = o();
                    if (o10 != null) {
                        arrayList.add(o10);
                    }
                } else if (this.f6740s) {
                    f();
                    d1 o11 = o();
                    if (o11 != null) {
                        arrayList.add(o11);
                    }
                    e1 p10 = p();
                    if (p10 != null) {
                        arrayList.add(p10);
                    }
                } else {
                    d1 o12 = o();
                    if (o12 != null) {
                        a(Arrays.asList(new c1[]{o12}));
                    }
                    f();
                    e1 p11 = p();
                    if (p11 != null) {
                        arrayList.add(p11);
                    }
                }
                a((List) arrayList);
                f();
            } else {
                j();
                if (G0) {
                    if (this.f6740s) {
                        f();
                    }
                    m();
                    if (!this.f6740s) {
                        f();
                    }
                    n();
                } else {
                    f();
                    m();
                }
            }
        } else {
            if (t.a()) {
                t tVar2 = this.f13423c;
                String str2 = this.f13422b;
                tVar2.a(str2, "Begin processing for non-streaming ad #" + this.f6739r.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f13421a.a(oj.f10274c1)).booleanValue()) {
                ArrayList arrayList2 = new ArrayList();
                if (!x3.f()) {
                    arrayList2.addAll(e());
                }
                d1 o13 = o();
                if (o13 != null) {
                    arrayList2.add(o13);
                }
                e1 p12 = p();
                if (p12 != null) {
                    arrayList2.add(p12);
                }
                a((List) arrayList2);
                f();
            } else {
                j();
                m();
                n();
                f();
            }
        }
        k();
    }
}
