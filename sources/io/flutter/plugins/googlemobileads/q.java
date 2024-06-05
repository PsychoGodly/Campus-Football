package io.flutter.plugins.googlemobileads;

import bd.c;
import io.flutter.plugin.platform.f;
import n4.j;

/* compiled from: FlutterBannerAd */
class q extends e implements g {

    /* renamed from: b  reason: collision with root package name */
    private final a f34121b;

    /* renamed from: c  reason: collision with root package name */
    private final String f34122c;

    /* renamed from: d  reason: collision with root package name */
    private final m f34123d;

    /* renamed from: e  reason: collision with root package name */
    private final l f34124e;

    /* renamed from: f  reason: collision with root package name */
    private final c f34125f;

    /* renamed from: g  reason: collision with root package name */
    private j f34126g;

    public q(int i10, a aVar, String str, l lVar, m mVar, c cVar) {
        super(i10);
        c.a(aVar);
        c.a(str);
        c.a(lVar);
        c.a(mVar);
        this.f34121b = aVar;
        this.f34122c = str;
        this.f34124e = lVar;
        this.f34123d = mVar;
        this.f34125f = cVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        j jVar = this.f34126g;
        if (jVar != null) {
            jVar.a();
            this.f34126g = null;
        }
    }

    public f b() {
        j jVar = this.f34126g;
        if (jVar == null) {
            return null;
        }
        return new b0(jVar);
    }

    /* access modifiers changed from: package-private */
    public m c() {
        j jVar = this.f34126g;
        if (jVar == null || jVar.getAdSize() == null) {
            return null;
        }
        return new m(this.f34126g.getAdSize());
    }

    /* access modifiers changed from: package-private */
    public void d() {
        j b10 = this.f34125f.b();
        this.f34126g = b10;
        b10.setAdUnitId(this.f34122c);
        this.f34126g.setAdSize(this.f34123d.a());
        this.f34126g.setOnPaidEventListener(new a0(this.f34121b, this));
        this.f34126g.setAdListener(new r(this.f33956a, this.f34121b, this));
        this.f34126g.b(this.f34124e.b(this.f34122c));
    }

    public void onAdLoaded() {
        j jVar = this.f34126g;
        if (jVar != null) {
            this.f34121b.m(this.f33956a, jVar.getResponseInfo());
        }
    }
}
