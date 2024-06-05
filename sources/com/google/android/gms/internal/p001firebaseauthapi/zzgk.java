package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzgk extends zzdb {
    private final String zza;

    private zzgk(String str) {
        this.zza = str;
    }

    public static zzgk zza(String str) throws GeneralSecurityException {
        return new zzgk(str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgk)) {
            return false;
        }
        return ((zzgk) obj).zza.equals(this.zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgk.class, this.zza});
    }

    public final String toString() {
        String str = this.zza;
        return "LegacyKmsAead Parameters (keyUri: " + str + ")";
    }

    public final boolean zza() {
        return false;
    }

    public final String zzb() {
        return this.zza;
    }
}
