package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzhm extends zzdb {
    private final zza zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhm$zza */
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

    private zzhm(zza zza2) {
        this.zza = zza2;
    }

    public static zzhm zza(zza zza2) {
        return new zzhm(zza2);
    }

    public static zzhm zzc() {
        return new zzhm(zza.zzc);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof zzhm) && ((zzhm) obj).zza == this.zza) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzhm.class, this.zza});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        return "XChaCha20Poly1305 Parameters (variant: " + valueOf + ")";
    }

    public final zza zzb() {
        return this.zza;
    }

    public final boolean zza() {
        return this.zza != zza.zzc;
    }
}
