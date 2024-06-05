package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgsk {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgsk() {
    }

    static /* bridge */ /* synthetic */ zzgpe zza(zzgsk zzgsk, zzgpe zzgpe, zzgpe zzgpe2) {
        zzgsk.zzb(zzgpe);
        zzgsk.zzb(zzgpe2);
        zzgpe zzgpe3 = (zzgpe) zzgsk.zza.pop();
        while (!zzgsk.zza.isEmpty()) {
            zzgpe3 = new zzgso((zzgpe) zzgsk.zza.pop(), zzgpe3);
        }
        return zzgpe3;
    }

    private final void zzb(zzgpe zzgpe) {
        if (zzgpe.zzh()) {
            int zzc = zzc(zzgpe.zzd());
            int zzc2 = zzgso.zzc(zzc + 1);
            if (this.zza.isEmpty() || ((zzgpe) this.zza.peek()).zzd() >= zzc2) {
                this.zza.push(zzgpe);
                return;
            }
            int zzc3 = zzgso.zzc(zzc);
            zzgpe zzgpe2 = (zzgpe) this.zza.pop();
            while (!this.zza.isEmpty() && ((zzgpe) this.zza.peek()).zzd() < zzc3) {
                zzgpe2 = new zzgso((zzgpe) this.zza.pop(), zzgpe2);
            }
            zzgso zzgso = new zzgso(zzgpe2, zzgpe);
            while (!this.zza.isEmpty() && ((zzgpe) this.zza.peek()).zzd() < zzgso.zzc(zzc(zzgso.zzd()) + 1)) {
                zzgso = new zzgso((zzgpe) this.zza.pop(), zzgso);
            }
            this.zza.push(zzgso);
        } else if (zzgpe instanceof zzgso) {
            zzgso zzgso2 = (zzgso) zzgpe;
            zzb(zzgso2.zzd);
            zzb(zzgso2.zze);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgpe.getClass())));
        }
    }

    private static final int zzc(int i10) {
        int binarySearch = Arrays.binarySearch(zzgso.zza, i10);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* synthetic */ zzgsk(zzgsj zzgsj) {
    }
}
