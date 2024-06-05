package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfdz implements zzdbl, zzcve, zzdbp {
    private final zzfen zza;
    private final zzfec zzb;

    zzfdz(Context context, zzfen zzfen) {
        this.zza = zzfen;
        this.zzb = zzfeb.zza(context, 13);
    }

    public final void zza() {
    }

    public final void zzb() {
        if (((Boolean) zzbcd.zzd.zze()).booleanValue()) {
            zzfen zzfen = this.zza;
            zzfec zzfec = this.zzb;
            zzfec.zzf(true);
            zzfen.zza(zzfec);
        }
    }

    public final void zzf() {
    }

    public final void zzg() {
        if (((Boolean) zzbcd.zzd.zze()).booleanValue()) {
            this.zzb.zzh();
        }
    }

    public final void zzk(c3 c3Var) {
        if (((Boolean) zzbcd.zzd.zze()).booleanValue()) {
            zzfen zzfen = this.zza;
            zzfec zzfec = this.zzb;
            zzfec.zzc(c3Var.v().toString());
            zzfec.zzf(false);
            zzfen.zza(zzfec);
        }
    }
}
