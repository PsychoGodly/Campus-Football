package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgov implements Comparator {
    zzgov() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgpe zzgpe = (zzgpe) obj;
        zzgpe zzgpe2 = (zzgpe) obj2;
        zzgoy zzs = zzgpe.iterator();
        zzgoy zzs2 = zzgpe2.iterator();
        while (zzs.hasNext() && zzs2.hasNext()) {
            int compareTo = Integer.valueOf(zzs.zza() & 255).compareTo(Integer.valueOf(zzs2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzgpe.zzd()).compareTo(Integer.valueOf(zzgpe2.zzd()));
    }
}
