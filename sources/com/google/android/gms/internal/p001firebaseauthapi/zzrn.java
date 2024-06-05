package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzrn {
    public static final zzrn zza = new zzrm().zza();
    private final Map<String, String> zzb;

    private zzrn(Map<String, String> map) {
        this.zzb = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzrn)) {
            return false;
        }
        return this.zzb.equals(((zzrn) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map<String, String> zza() {
        return this.zzb;
    }
}
