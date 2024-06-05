package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdji implements zzftq {
    public final /* synthetic */ zzfut zza;

    public /* synthetic */ zzdji(zzfut zzfut) {
        this.zza = zzfut;
    }

    public final zzfut zza(Object obj) {
        zzfut zzfut = this.zza;
        zzcei zzcei = (zzcei) obj;
        if (zzcei != null && zzcei.zzq() != null) {
            return zzfut;
        }
        throw new zzeek(1, "Retrieve video view in html5 ad response failed.");
    }
}
