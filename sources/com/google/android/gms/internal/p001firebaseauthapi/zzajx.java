package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzajx extends zzajs {
    private zzajx() {
        super();
    }

    private static <E> zzajj<E> zzc(Object obj, long j10) {
        return (zzajj) zzamk.zze(obj, j10);
    }

    /* access modifiers changed from: package-private */
    public final <L> List<L> zza(Object obj, long j10) {
        zzajj zzc = zzc(obj, j10);
        if (zzc.zzc()) {
            return zzc;
        }
        int size = zzc.size();
        zzajj zza = zzc.zza(size == 0 ? 10 : size << 1);
        zzamk.zza(obj, j10, (Object) zza);
        return zza;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j10) {
        zzc(obj, j10).zzb();
    }

    /* access modifiers changed from: package-private */
    public final <E> void zza(Object obj, Object obj2, long j10) {
        zzajj zzc = zzc(obj, j10);
        zzajj zzc2 = zzc(obj2, j10);
        int size = zzc.size();
        int size2 = zzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzc.zzc()) {
                zzc = zzc.zza(size2 + size);
            }
            zzc.addAll(zzc2);
        }
        if (size > 0) {
            zzc2 = zzc;
        }
        zzamk.zza(obj, j10, (Object) zzc2);
    }
}
