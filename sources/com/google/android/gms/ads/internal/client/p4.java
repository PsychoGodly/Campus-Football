package com.google.android.gms.ads.internal.client;

import n4.d;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class p4 extends g0 {

    /* renamed from: a  reason: collision with root package name */
    private final d f14526a;

    public p4(d dVar) {
        this.f14526a = dVar;
    }

    public final d M0() {
        return this.f14526a;
    }

    public final void zzc() {
        d dVar = this.f14526a;
        if (dVar != null) {
            dVar.onAdClicked();
        }
    }

    public final void zzd() {
        d dVar = this.f14526a;
        if (dVar != null) {
            dVar.onAdClosed();
        }
    }

    public final void zze(int i10) {
    }

    public final void zzf(c3 c3Var) {
        d dVar = this.f14526a;
        if (dVar != null) {
            dVar.onAdFailedToLoad(c3Var.w());
        }
    }

    public final void zzg() {
        d dVar = this.f14526a;
        if (dVar != null) {
            dVar.onAdImpression();
        }
    }

    public final void zzh() {
    }

    public final void zzi() {
        d dVar = this.f14526a;
        if (dVar != null) {
            dVar.onAdLoaded();
        }
    }

    public final void zzj() {
        d dVar = this.f14526a;
        if (dVar != null) {
            dVar.onAdOpened();
        }
    }

    public final void zzk() {
        d dVar = this.f14526a;
        if (dVar != null) {
            dVar.onAdSwipeGestureClicked();
        }
    }
}
