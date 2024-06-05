package com.google.android.gms.internal.ads;

import b5.b;
import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbvp extends zzbvc {
    private final b zza;
    private final zzbvq zzb;

    public zzbvp(b bVar, zzbvq zzbvq) {
        this.zza = bVar;
        this.zzb = zzbvq;
    }

    public final void zze(int i10) {
    }

    public final void zzf(c3 c3Var) {
        b bVar = this.zza;
        if (bVar != null) {
            bVar.onAdFailedToLoad(c3Var.w());
        }
    }

    public final void zzg() {
        zzbvq zzbvq;
        b bVar = this.zza;
        if (bVar != null && (zzbvq = this.zzb) != null) {
            bVar.onAdLoaded(zzbvq);
        }
    }
}
