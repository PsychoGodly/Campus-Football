package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbvv implements zzfuf {
    final /* synthetic */ zzfut zza;

    zzbvv(zzbvw zzbvw, zzfut zzfut) {
        this.zza = zzfut;
    }

    public final void zza(Throwable th) {
        zzbvw.zzc.remove(this.zza);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Void voidR = (Void) obj;
        zzbvw.zzc.remove(this.zza);
    }
}
