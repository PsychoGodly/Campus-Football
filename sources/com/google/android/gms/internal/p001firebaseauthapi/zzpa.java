package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpa  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzpa {
    private final Class<? extends zzov> zza;
    private final zzxt zzb;

    private zzpa(Class<? extends zzov> cls, zzxt zzxt) {
        this.zza = cls;
        this.zzb = zzxt;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpa)) {
            return false;
        }
        zzpa zzpa = (zzpa) obj;
        if (!zzpa.zza.equals(this.zza) || !zzpa.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        String simpleName = this.zza.getSimpleName();
        String valueOf = String.valueOf(this.zzb);
        return simpleName + ", object identifier: " + valueOf;
    }
}
