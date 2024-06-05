package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzfv extends zzdb {
    private final zza zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfv$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("NO_PREFIX");
        private final String zzd;

        private zza(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    private zzfv(zza zza2) {
        this.zza = zza2;
    }

    public static zzfv zza(zza zza2) {
        return new zzfv(zza2);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof zzfv) && ((zzfv) obj).zza == this.zza) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzfv.class, this.zza});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        return "ChaCha20Poly1305 Parameters (variant: " + valueOf + ")";
    }

    public final zza zzb() {
        return this.zza;
    }

    public final boolean zza() {
        return this.zza != zza.zzc;
    }
}
