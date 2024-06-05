package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
abstract class zzacg {
    protected final zzabb zza;

    protected zzacg(zzabb zzabb) {
        this.zza = zzabb;
    }

    /* access modifiers changed from: protected */
    public abstract boolean zza(zzen zzen) throws zzbu;

    /* access modifiers changed from: protected */
    public abstract boolean zzb(zzen zzen, long j10) throws zzbu;

    public final boolean zzf(zzen zzen, long j10) throws zzbu {
        return zza(zzen) && zzb(zzen, j10);
    }
}
