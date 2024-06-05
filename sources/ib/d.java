package ib;

import com.unity3d.scar.adapter.common.g;
import n4.n;

/* compiled from: ScarBannerAdListener */
public class d extends b {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final g f33303b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final c f33304c;

    /* renamed from: d  reason: collision with root package name */
    private final n4.d f33305d = new a();

    /* compiled from: ScarBannerAdListener */
    class a extends n4.d {
        a() {
        }

        public void onAdClicked() {
            super.onAdClicked();
            d.this.f33303b.onAdClicked();
        }

        public void onAdClosed() {
            super.onAdClosed();
            d.this.f33303b.onAdClosed();
        }

        public void onAdFailedToLoad(n nVar) {
            super.onAdFailedToLoad(nVar);
            d.this.f33304c.e();
            d.this.f33303b.onAdFailedToLoad(nVar.a(), nVar.c());
        }

        public void onAdImpression() {
            super.onAdImpression();
            d.this.f33303b.onAdImpression();
        }

        public void onAdLoaded() {
            super.onAdLoaded();
            d.this.f33303b.onAdLoaded();
        }

        public void onAdOpened() {
            super.onAdOpened();
            d.this.f33303b.onAdOpened();
        }
    }

    public d(g gVar, c cVar) {
        this.f33303b = gVar;
        this.f33304c = cVar;
    }

    public n4.d d() {
        return this.f33305d;
    }
}
