package com.google.android.gms.ads.internal.client;

import n4.d;
import n4.n;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public class y extends d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f14605a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private d f14606b;

    public final void d(d dVar) {
        synchronized (this.f14605a) {
            this.f14606b = dVar;
        }
    }

    public final void onAdClicked() {
        synchronized (this.f14605a) {
            d dVar = this.f14606b;
            if (dVar != null) {
                dVar.onAdClicked();
            }
        }
    }

    public final void onAdClosed() {
        synchronized (this.f14605a) {
            d dVar = this.f14606b;
            if (dVar != null) {
                dVar.onAdClosed();
            }
        }
    }

    public void onAdFailedToLoad(n nVar) {
        synchronized (this.f14605a) {
            d dVar = this.f14606b;
            if (dVar != null) {
                dVar.onAdFailedToLoad(nVar);
            }
        }
    }

    public final void onAdImpression() {
        synchronized (this.f14605a) {
            d dVar = this.f14606b;
            if (dVar != null) {
                dVar.onAdImpression();
            }
        }
    }

    public void onAdLoaded() {
        synchronized (this.f14605a) {
            d dVar = this.f14606b;
            if (dVar != null) {
                dVar.onAdLoaded();
            }
        }
    }

    public final void onAdOpened() {
        synchronized (this.f14605a) {
            d dVar = this.f14606b;
            if (dVar != null) {
                dVar.onAdOpened();
            }
        }
    }
}
