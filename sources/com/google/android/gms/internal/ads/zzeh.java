package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzeh implements Runnable {
    public final /* synthetic */ zzel zza;
    public final /* synthetic */ zzwu zzb;

    public /* synthetic */ zzeh(zzel zzel, zzwu zzwu, byte[] bArr) {
        this.zza = zzel;
        this.zzb = zzwu;
    }

    public final void run() {
        zzel zzel = this.zza;
        zzwu zzwu = this.zzb;
        zzwu.zza.zzk(zzel.zza());
    }
}
