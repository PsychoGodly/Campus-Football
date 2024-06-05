package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzauh implements Comparator {
    zzauh(zzauj zzauj) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzaun zzaun = (zzaun) obj;
        zzaun zzaun2 = (zzaun) obj2;
        int i10 = zzaun.zzc - zzaun2.zzc;
        if (i10 != 0) {
            return i10;
        }
        return (zzaun.zza > zzaun2.zza ? 1 : (zzaun.zza == zzaun2.zza ? 0 : -1));
    }
}
