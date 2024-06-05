package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgri extends zzgrk {
    private zzgri() {
        super((zzgrj) null);
    }

    /* synthetic */ zzgri(zzgrh zzgrh) {
        super((zzgrj) null);
    }

    /* access modifiers changed from: package-private */
    public final List zza(Object obj, long j10) {
        zzgqv zzgqv = (zzgqv) zzgtq.zzh(obj, j10);
        if (zzgqv.zzc()) {
            return zzgqv;
        }
        int size = zzgqv.size();
        zzgqv zzd = zzgqv.zzd(size == 0 ? 10 : size + size);
        zzgtq.zzv(obj, j10, zzd);
        return zzd;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j10) {
        ((zzgqv) zzgtq.zzh(obj, j10)).zzb();
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Object obj, Object obj2, long j10) {
        zzgqv zzgqv = (zzgqv) zzgtq.zzh(obj, j10);
        zzgqv zzgqv2 = (zzgqv) zzgtq.zzh(obj2, j10);
        int size = zzgqv.size();
        int size2 = zzgqv2.size();
        if (size > 0 && size2 > 0) {
            if (!zzgqv.zzc()) {
                zzgqv = zzgqv.zzd(size2 + size);
            }
            zzgqv.addAll(zzgqv2);
        }
        if (size > 0) {
            zzgqv2 = zzgqv;
        }
        zzgtq.zzv(obj, j10, zzgqv2);
    }
}
