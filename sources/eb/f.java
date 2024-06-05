package eb;

import com.unity3d.scar.adapter.common.h;
import n4.m;
import n4.n;

/* compiled from: ScarInterstitialAdListener */
public class f extends b {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final e f32501b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final h f32502c;

    /* renamed from: d  reason: collision with root package name */
    private final u4.b f32503d = new a();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final m f32504e = new b();

    /* compiled from: ScarInterstitialAdListener */
    class a extends u4.b {
        a() {
        }

        /* renamed from: a */
        public void onAdLoaded(u4.a aVar) {
            super.onAdLoaded(aVar);
            f.this.f32502c.onAdLoaded();
            aVar.setFullScreenContentCallback(f.this.f32504e);
            f.this.f32501b.d(aVar);
            bb.b bVar = f.this.f32492a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        public void onAdFailedToLoad(n nVar) {
            super.onAdFailedToLoad(nVar);
            f.this.f32502c.onAdFailedToLoad(nVar.a(), nVar.toString());
        }
    }

    /* compiled from: ScarInterstitialAdListener */
    class b extends m {
        b() {
        }

        public void b() {
            super.b();
            f.this.f32502c.onAdClosed();
        }

        public void c(n4.a aVar) {
            super.c(aVar);
            f.this.f32502c.onAdFailedToShow(aVar.a(), aVar.toString());
        }

        public void d() {
            super.d();
            f.this.f32502c.onAdImpression();
        }

        public void e() {
            super.e();
            f.this.f32502c.onAdOpened();
        }
    }

    public f(h hVar, e eVar) {
        this.f32502c = hVar;
        this.f32501b = eVar;
    }

    public u4.b e() {
        return this.f32503d;
    }
}
