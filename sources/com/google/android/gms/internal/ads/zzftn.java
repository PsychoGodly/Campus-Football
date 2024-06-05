package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzftn extends zzftk {
    private zzftn() {
        super((zzftj) null);
    }

    /* synthetic */ zzftn(zzftm zzftm) {
        super((zzftj) null);
    }

    /* access modifiers changed from: package-private */
    public final int zza(zzfto zzfto) {
        int zzA;
        synchronized (zzfto) {
            zzA = zzfto.remaining - 1;
            zzfto.remaining = zzA;
        }
        return zzA;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzfto zzfto, Set set, Set set2) {
        synchronized (zzfto) {
            if (zzfto.seenExceptions == null) {
                zzfto.seenExceptions = set2;
            }
        }
    }
}
