package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzdel implements zzcqp {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzgxl zzd;
    private final zzdgt zze;

    zzdel(Map map, Map map2, Map map3, zzgxl zzgxl, zzdgt zzdgt) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzgxl;
        this.zze = zzdgt;
    }

    public final zzeat zza(int i10, String str) {
        zzeat zza2;
        zzeat zzeat = (zzeat) this.zza.get(str);
        if (zzeat != null) {
            return zzeat;
        }
        if (i10 != 1) {
            if (i10 != 4) {
                return null;
            }
            zzedi zzedi = (zzedi) this.zzc.get(str);
            if (zzedi != null) {
                return new zzeau(zzedi, zzcqr.zza);
            }
            zzeat zzeat2 = (zzeat) this.zzb.get(str);
            if (zzeat2 == null) {
                return null;
            }
            return zzcqt.zza(zzeat2);
        } else if (this.zze.zze() == null || (zza2 = ((zzcqp) this.zzd.zzb()).zza(i10, str)) == null) {
            return null;
        } else {
            return zzcqt.zza(zza2);
        }
    }
}
