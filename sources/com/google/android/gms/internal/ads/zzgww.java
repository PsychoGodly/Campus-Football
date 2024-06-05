package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgww implements zzgwy {
    private zzgxl zza;

    public static void zza(zzgxl zzgxl, zzgxl zzgxl2) {
        zzgww zzgww = (zzgww) zzgxl;
        if (zzgww.zza == null) {
            zzgww.zza = zzgxl2;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object zzb() {
        zzgxl zzgxl = this.zza;
        if (zzgxl != null) {
            return zzgxl.zzb();
        }
        throw new IllegalStateException();
    }
}
