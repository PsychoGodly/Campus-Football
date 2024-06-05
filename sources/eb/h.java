package eb;

import a5.d;
import com.unity3d.scar.adapter.common.i;
import n4.m;
import n4.n;
import n4.t;

/* compiled from: ScarRewardedAdListener */
public class h extends b {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final g f32507b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final i f32508c;

    /* renamed from: d  reason: collision with root package name */
    private final d f32509d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final t f32510e = new b();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final m f32511f = new c();

    /* compiled from: ScarRewardedAdListener */
    class a extends d {
        a() {
        }

        /* renamed from: a */
        public void onAdLoaded(a5.c cVar) {
            super.onAdLoaded(cVar);
            h.this.f32508c.onAdLoaded();
            cVar.setFullScreenContentCallback(h.this.f32511f);
            h.this.f32507b.d(cVar);
            bb.b bVar = h.this.f32492a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        public void onAdFailedToLoad(n nVar) {
            super.onAdFailedToLoad(nVar);
            h.this.f32508c.onAdFailedToLoad(nVar.a(), nVar.toString());
        }
    }

    /* compiled from: ScarRewardedAdListener */
    class b implements t {
        b() {
        }

        public void onUserEarnedReward(a5.b bVar) {
            h.this.f32508c.onUserEarnedReward();
        }
    }

    /* compiled from: ScarRewardedAdListener */
    class c extends m {
        c() {
        }

        public void b() {
            super.b();
            h.this.f32508c.onAdClosed();
        }

        public void c(n4.a aVar) {
            super.c(aVar);
            h.this.f32508c.onAdFailedToShow(aVar.a(), aVar.toString());
        }

        public void d() {
            super.d();
            h.this.f32508c.onAdImpression();
        }

        public void e() {
            super.e();
            h.this.f32508c.onAdOpened();
        }
    }

    public h(i iVar, g gVar) {
        this.f32508c = iVar;
        this.f32507b = gVar;
    }

    public d e() {
        return this.f32509d;
    }

    public t f() {
        return this.f32510e;
    }
}
