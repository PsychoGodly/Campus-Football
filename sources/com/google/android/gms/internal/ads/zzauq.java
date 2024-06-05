package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzauq implements Comparator {
    public zzauq(zzaur zzaur) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzauf zzauf = (zzauf) obj;
        zzauf zzauf2 = (zzauf) obj2;
        if (zzauf.zzd() >= zzauf2.zzd()) {
            if (zzauf.zzd() > zzauf2.zzd()) {
                return 1;
            }
            if (zzauf.zzb() >= zzauf2.zzb()) {
                if (zzauf.zzb() > zzauf2.zzb()) {
                    return 1;
                }
                float zza = (zzauf.zza() - zzauf.zzd()) * (zzauf.zzc() - zzauf.zzb());
                float zza2 = (zzauf2.zza() - zzauf2.zzd()) * (zzauf2.zzc() - zzauf2.zzb());
                if (zza <= zza2) {
                    if (zza < zza2) {
                        return 1;
                    }
                    return 0;
                }
            }
        }
        return -1;
    }
}
