package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgs  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzgs extends zzdb {
    private final String zza;
    private final zzb zzb;
    private final zzdb zzc;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgs$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static class zza {
        private String zza;
        private zzb zzb;
        private zzdb zzc;

        private zza() {
        }

        public final zza zza(zzdb zzdb) {
            this.zzc = zzdb;
            return this;
        }

        public final zza zza(zzb zzb2) {
            this.zzb = zzb2;
            return this;
        }

        public final zza zza(String str) {
            this.zza = str;
            return this;
        }

        public final zzgs zza() throws GeneralSecurityException {
            if (this.zza == null) {
                throw new GeneralSecurityException("kekUri must be set");
            } else if (this.zzb != null) {
                zzdb zzdb = this.zzc;
                if (zzdb == null) {
                    throw new GeneralSecurityException("dekParametersForNewKeys must be set");
                } else if (!zzdb.zza()) {
                    zzb zzb2 = this.zzb;
                    zzdb zzdb2 = this.zzc;
                    boolean z10 = true;
                    if ((!zzb2.equals(zzb.zza) || !(zzdb2 instanceof zzes)) && ((!zzb2.equals(zzb.zzc) || !(zzdb2 instanceof zzfv)) && ((!zzb2.equals(zzb.zzb) || !(zzdb2 instanceof zzhm)) && ((!zzb2.equals(zzb.zzd) || !(zzdb2 instanceof zzdl)) && ((!zzb2.equals(zzb.zze) || !(zzdb2 instanceof zzed)) && (!zzb2.equals(zzb.zzf) || !(zzdb2 instanceof zzfj))))))) {
                        z10 = false;
                    }
                    if (z10) {
                        return new zzgs(this.zza, this.zzb, this.zzc);
                    }
                    String zzb3 = this.zzb.toString();
                    String valueOf = String.valueOf(this.zzc);
                    throw new GeneralSecurityException("Cannot use parsing strategy " + zzb3 + " when new keys are picked according to " + valueOf + ".");
                } else {
                    throw new GeneralSecurityException("dekParametersForNewKeys must note have ID Requirements");
                }
            } else {
                throw new GeneralSecurityException("dekParsingStrategy must be set");
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgs$zzb */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zzb {
        public static final zzb zza = new zzb("ASSUME_AES_GCM");
        public static final zzb zzb = new zzb("ASSUME_XCHACHA20POLY1305");
        public static final zzb zzc = new zzb("ASSUME_CHACHA20POLY1305");
        public static final zzb zzd = new zzb("ASSUME_AES_CTR_HMAC");
        public static final zzb zze = new zzb("ASSUME_AES_EAX");
        public static final zzb zzf = new zzb("ASSUME_AES_GCM_SIV");
        private final String zzg;

        private zzb(String str) {
            this.zzg = str;
        }

        public final String toString() {
            return this.zzg;
        }
    }

    private zzgs(String str, zzb zzb2, zzdb zzdb) {
        this.zza = str;
        this.zzb = zzb2;
        this.zzc = zzdb;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgs)) {
            return false;
        }
        zzgs zzgs = (zzgs) obj;
        if (!zzgs.zzb.equals(this.zzb) || !zzgs.zzc.equals(this.zzc) || !zzgs.zza.equals(this.zza)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgs.class, this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        String str = this.zza;
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + str + ", dekParsingStrategy: " + valueOf + ", dekParametersForNewKeys: " + valueOf2 + ")";
    }

    public final boolean zza() {
        return false;
    }

    public final zzdb zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zza;
    }
}
