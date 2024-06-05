package ib;

import a5.d;
import com.unity3d.scar.adapter.common.i;
import n4.m;
import n4.n;
import n4.t;

/* compiled from: ScarRewardedAdListener */
public class h extends b {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final g f33313b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final i f33314c;

    /* renamed from: d  reason: collision with root package name */
    private final d f33315d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final t f33316e = new b();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final m f33317f = new c();

    /* compiled from: ScarRewardedAdListener */
    class a extends d {
        a() {
        }

        /* renamed from: a */
        public void onAdLoaded(a5.c cVar) {
            super.onAdLoaded(cVar);
            h.this.f33314c.onAdLoaded();
            cVar.setFullScreenContentCallback(h.this.f33317f);
            h.this.f33313b.d(cVar);
            bb.b bVar = h.this.f33298a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        public void onAdFailedToLoad(n nVar) {
            super.onAdFailedToLoad(nVar);
            h.this.f33314c.onAdFailedToLoad(nVar.a(), nVar.toString());
        }
    }

    /* compiled from: ScarRewardedAdListener */
    class b implements t {
        b() {
        }

        public void onUserEarnedReward(a5.b bVar) {
            h.this.f33314c.onUserEarnedReward();
        }
    }

    /* compiled from: ScarRewardedAdListener */
    class c extends m {
        c() {
        }

        public void a() {
            super.a();
            h.this.f33314c.onAdClicked();
        }

        public void b() {
            super.b();
            h.this.f33314c.onAdClosed();
        }

        public void c(n4.a aVar) {
            super.c(aVar);
            h.this.f33314c.onAdFailedToShow(aVar.a(), aVar.toString());
        }

        public void d() {
            super.d();
            h.this.f33314c.onAdImpression();
        }

        public void e() {
            super.e();
            h.this.f33314c.onAdOpened();
        }
    }

    public h(i iVar, g gVar) {
        this.f33314c = iVar;
        this.f33313b = gVar;
    }

    public d e() {
        return this.f33315d;
    }

    public t f() {
        return this.f33316e;
    }
}
