package io.flutter.plugins.googlemobileads;

import android.view.ViewGroup;
import bd.c;
import io.flutter.plugin.platform.f;
import java.util.List;
import n4.h;
import o4.b;
import o4.e;

/* compiled from: FlutterAdManagerBannerAd */
class j extends e implements g {

    /* renamed from: b  reason: collision with root package name */
    protected final a f34013b;

    /* renamed from: c  reason: collision with root package name */
    private final String f34014c;

    /* renamed from: d  reason: collision with root package name */
    private final List<m> f34015d;

    /* renamed from: e  reason: collision with root package name */
    private final i f34016e;

    /* renamed from: f  reason: collision with root package name */
    private final c f34017f;

    /* renamed from: g  reason: collision with root package name */
    protected b f34018g;

    /* compiled from: FlutterAdManagerBannerAd */
    class a implements e {
        a() {
        }

        public void onAppEvent(String str, String str2) {
            j jVar = j.this;
            jVar.f34013b.q(jVar.f33956a, str, str2);
        }
    }

    public j(int i10, a aVar, String str, List<m> list, i iVar, c cVar) {
        super(i10);
        c.a(aVar);
        c.a(str);
        c.a(list);
        c.a(iVar);
        this.f34013b = aVar;
        this.f34014c = str;
        this.f34015d = list;
        this.f34016e = iVar;
        this.f34017f = cVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        b bVar = this.f34018g;
        if (bVar != null) {
            bVar.a();
            this.f34018g = null;
        }
    }

    /* access modifiers changed from: package-private */
    public f b() {
        b bVar = this.f34018g;
        if (bVar == null) {
            return null;
        }
        return new b0(bVar);
    }

    /* access modifiers changed from: package-private */
    public m c() {
        b bVar = this.f34018g;
        if (bVar == null || bVar.getAdSize() == null) {
            return null;
        }
        return new m(this.f34018g.getAdSize());
    }

    /* access modifiers changed from: package-private */
    public void d() {
        b a10 = this.f34017f.a();
        this.f34018g = a10;
        if (this instanceof d) {
            a10.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        this.f34018g.setAdUnitId(this.f34014c);
        this.f34018g.setAppEventListener(new a());
        h[] hVarArr = new h[this.f34015d.size()];
        for (int i10 = 0; i10 < this.f34015d.size(); i10++) {
            hVarArr[i10] = this.f34015d.get(i10).a();
        }
        this.f34018g.setAdSizes(hVarArr);
        this.f34018g.setAdListener(new r(this.f33956a, this.f34013b, this));
        this.f34018g.e(this.f34016e.k(this.f34014c));
    }

    public void onAdLoaded() {
        b bVar = this.f34018g;
        if (bVar != null) {
            this.f34013b.m(this.f33956a, bVar.getResponseInfo());
        }
    }
}
