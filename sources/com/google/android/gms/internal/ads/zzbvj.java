package com.google.android.gms.internal.ads;

import a5.c;
import a5.d;
import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbvj extends zzbvc {
    private final d zza;
    private final c zzb;

    public zzbvj(d dVar, c cVar) {
        this.zza = dVar;
        this.zzb = cVar;
    }

    public final void zze(int i10) {
    }

    public final void zzf(c3 c3Var) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(c3Var.w());
        }
    }

    public final void zzg() {
        d dVar = this.zza;
        if (dVar != null) {
            dVar.onAdLoaded(this.zzb);
        }
    }
}
