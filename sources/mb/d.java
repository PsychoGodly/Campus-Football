package mb;

import com.unity3d.scar.adapter.common.g;
import n4.n;

/* compiled from: ScarBannerAdListener */
public class d extends b {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final g f36316b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final c f36317c;

    /* renamed from: d  reason: collision with root package name */
    private final n4.d f36318d = new a();

    /* compiled from: ScarBannerAdListener */
    class a extends n4.d {
        a() {
        }

        public void onAdClicked() {
            super.onAdClicked();
            d.this.f36316b.onAdClicked();
        }

        public void onAdClosed() {
            super.onAdClosed();
            d.this.f36316b.onAdClosed();
        }

        public void onAdFailedToLoad(n nVar) {
            super.onAdFailedToLoad(nVar);
            d.this.f36317c.e();
            d.this.f36316b.onAdFailedToLoad(nVar.a(), nVar.c());
        }

        public void onAdImpression() {
            super.onAdImpression();
            d.this.f36316b.onAdImpression();
        }

        public void onAdLoaded() {
            super.onAdLoaded();
            d.this.f36316b.onAdLoaded();
        }

        public void onAdOpened() {
            super.onAdOpened();
            d.this.f36316b.onAdOpened();
        }
    }

    public d(g gVar, c cVar) {
        this.f36316b = gVar;
        this.f36317c = cVar;
    }

    public n4.d d() {
        return this.f36318d;
    }
}
