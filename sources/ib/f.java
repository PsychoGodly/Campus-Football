package ib;

import com.unity3d.scar.adapter.common.h;
import n4.m;
import n4.n;

/* compiled from: ScarInterstitialAdListener */
public class f extends b {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final e f33307b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final h f33308c;

    /* renamed from: d  reason: collision with root package name */
    private final u4.b f33309d = new a();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final m f33310e = new b();

    /* compiled from: ScarInterstitialAdListener */
    class a extends u4.b {
        a() {
        }

        /* renamed from: a */
        public void onAdLoaded(u4.a aVar) {
            super.onAdLoaded(aVar);
            f.this.f33308c.onAdLoaded();
            aVar.setFullScreenContentCallback(f.this.f33310e);
            f.this.f33307b.d(aVar);
            bb.b bVar = f.this.f33298a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        public void onAdFailedToLoad(n nVar) {
            super.onAdFailedToLoad(nVar);
            f.this.f33308c.onAdFailedToLoad(nVar.a(), nVar.toString());
        }
    }

    /* compiled from: ScarInterstitialAdListener */
    class b extends m {
        b() {
        }

        public void a() {
            super.a();
            f.this.f33308c.onAdClicked();
        }

        public void b() {
            super.b();
            f.this.f33308c.onAdClosed();
        }

        public void c(n4.a aVar) {
            super.c(aVar);
            f.this.f33308c.onAdFailedToShow(aVar.a(), aVar.toString());
        }

        public void d() {
            super.d();
            f.this.f33308c.onAdImpression();
        }

        public void e() {
            super.e();
            f.this.f33308c.onAdOpened();
        }
    }

    public f(h hVar, e eVar) {
        this.f33308c = hVar;
        this.f33307b = eVar;
    }

    public u4.b e() {
        return this.f33309d;
    }
}
