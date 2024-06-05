package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzwl {
    public final int zza;
    public final zzkp[] zzb;
    public final zzwe[] zzc;
    public final zzcy zzd;
    public final Object zze;

    public zzwl(zzkp[] zzkpArr, zzwe[] zzweArr, zzcy zzcy, Object obj) {
        this.zzb = zzkpArr;
        this.zzc = (zzwe[]) zzweArr.clone();
        this.zzd = zzcy;
        this.zze = obj;
        this.zza = zzkpArr.length;
    }

    public final boolean zza(zzwl zzwl, int i10) {
        if (zzwl != null && zzew.zzU(this.zzb[i10], zzwl.zzb[i10]) && zzew.zzU(this.zzc[i10], zzwl.zzc[i10])) {
            return true;
        }
        return false;
    }

    public final boolean zzb(int i10) {
        return this.zzb[i10] != null;
    }
}
