package mb;

import a5.d;
import com.unity3d.scar.adapter.common.i;
import n4.m;
import n4.n;
import n4.t;

/* compiled from: ScarRewardedAdListener */
public class h extends b {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final g f36326b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final i f36327c;

    /* renamed from: d  reason: collision with root package name */
    private final d f36328d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final t f36329e = new b();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final m f36330f = new c();

    /* compiled from: ScarRewardedAdListener */
    class a extends d {
        a() {
        }

        /* renamed from: a */
        public void onAdLoaded(a5.c cVar) {
            super.onAdLoaded(cVar);
            h.this.f36327c.onAdLoaded();
            cVar.setFullScreenContentCallback(h.this.f36330f);
            h.this.f36326b.d(cVar);
            bb.b bVar = h.this.f36311a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        public void onAdFailedToLoad(n nVar) {
            super.onAdFailedToLoad(nVar);
            h.this.f36327c.onAdFailedToLoad(nVar.a(), nVar.toString());
        }
    }

    /* compiled from: ScarRewardedAdListener */
    class b implements t {
        b() {
        }

        public void onUserEarnedReward(a5.b bVar) {
            h.this.f36327c.onUserEarnedReward();
        }
    }

    /* compiled from: ScarRewardedAdListener */
    class c extends m {
        c() {
        }

        public void a() {
            super.a();
            h.this.f36327c.onAdClicked();
        }

        public void b() {
            super.b();
            h.this.f36327c.onAdClosed();
        }

        public void c(n4.a aVar) {
            super.c(aVar);
            h.this.f36327c.onAdFailedToShow(aVar.a(), aVar.toString());
        }

        public void d() {
            super.d();
            h.this.f36327c.onAdImpression();
        }

        public void e() {
            super.e();
            h.this.f36327c.onAdOpened();
        }
    }

    public h(i iVar, g gVar) {
        this.f36327c = iVar;
        this.f36326b = gVar;
    }

    public d e() {
        return this.f36328d;
    }

    public t f() {
        return this.f36329e;
    }
}