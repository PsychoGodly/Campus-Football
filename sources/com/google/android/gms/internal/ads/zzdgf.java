package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdgf {
    private zzbdu zza;

    public zzdgf(zzdfr zzdfr) {
        this.zza = zzdfr;
    }

    public final synchronized zzbdu zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbdu zzbdu) {
        this.zza = zzbdu;
    }
}
