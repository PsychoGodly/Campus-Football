package eb;

import com.unity3d.scar.adapter.common.g;
import n4.n;

/* compiled from: ScarBannerAdListener */
public class d extends b {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final g f32497b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final c f32498c;

    /* renamed from: d  reason: collision with root package name */
    private final n4.d f32499d = new a();

    /* compiled from: ScarBannerAdListener */
    class a extends n4.d {
        a() {
        }

        public void onAdClicked() {
            super.onAdClicked();
            d.this.f32497b.onAdClicked();
        }

        public void onAdClosed() {
            super.onAdClosed();
            d.this.f32497b.onAdClosed();
        }

        public void onAdFailedToLoad(n nVar) {
            super.onAdFailedToLoad(nVar);
            d.this.f32498c.e();
            d.this.f32497b.onAdFailedToLoad(nVar.a(), nVar.c());
        }

        public void onAdImpression() {
            super.onAdImpression();
            d.this.f32497b.onAdImpression();
        }

        public void onAdLoaded() {
            super.onAdLoaded();
            d.this.f32497b.onAdLoaded();
        }

        public void onAdOpened() {
            super.onAdOpened();
            d.this.f32497b.onAdOpened();
        }
    }

    public d(g gVar, c cVar) {
        this.f32497b = gVar;
        this.f32498c = cVar;
    }

    public n4.d d() {
        return this.f32499d;
    }
}
