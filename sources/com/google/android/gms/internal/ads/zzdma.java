package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdma implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzdma(zzgxl zzgxl, zzgxl zzgxl2, zzgxl zzgxl3) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
        this.zzc = zzgxl3;
    }

    public final /* synthetic */ Object zzb() {
        zzgxl zzgxl = this.zza;
        zzgxl zzgxl2 = this.zzb;
        int i10 = ((zzcuf) this.zzc).zza().zzo.zza;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        } else if (i11 != 0) {
            return ((zzefx) zzgxl2).zzb();
        } else {
            return ((zzefx) zzgxl).zzb();
        }
    }
}
