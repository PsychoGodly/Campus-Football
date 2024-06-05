package com.google.android.gms.internal.measurement;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class zzgr extends zzgn<Long> {
    zzgr(zzgv zzgv, String str, Long l10, boolean z10) {
        super(zzgv, str, l10);
    }

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final Long zza(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String zzb = super.zzb();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid long value for " + zzb + ": " + valueOf);
        return null;
    }
}
