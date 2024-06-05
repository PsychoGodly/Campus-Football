package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzed  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzed extends zzdb {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final zzb zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzed$zzb */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zzb {
        public static final zzb zza = new zzb("TINK");
        public static final zzb zzb = new zzb("CRUNCHY");
        public static final zzb zzc = new zzb("NO_PREFIX");
        private final String zzd;

        private zzb(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    private zzed(int i10, int i11, int i12, zzb zzb2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = zzb2;
    }

    public static zza zze() {
        return new zza();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzed)) {
            return false;
        }
        zzed zzed = (zzed) obj;
        if (zzed.zza == this.zza && zzed.zzb == this.zzb && zzed.zzc == this.zzc && zzed.zzd == this.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzed.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int i10 = this.zzb;
        int i11 = this.zzc;
        int i12 = this.zza;
        return "AesEax Parameters (variant: " + valueOf + ", " + i10 + "-byte IV, " + i11 + "-byte tag, and " + i12 + "-byte key)";
    }

    public final boolean zza() {
        return this.zzd != zzb.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final zzb zzf() {
        return this.zzd;
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzed$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza {
        private Integer zza;
        private Integer zzb;
        private Integer zzc;
        private zzb zzd;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zzb.zzc;
        }

        public final zza zza(int i10) throws GeneralSecurityException {
            if (i10 == 12 || i10 == 16) {
                this.zzb = Integer.valueOf(i10);
                return this;
            }
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[]{Integer.valueOf(i10)}));
        }

        public final zza zzb(int i10) throws GeneralSecurityException {
            if (i10 == 16 || i10 == 24 || i10 == 32) {
                this.zza = Integer.valueOf(i10);
                return this;
            }
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i10)}));
        }

        public final zza zzc(int i10) throws GeneralSecurityException {
            this.zzc = 16;
            return this;
        }

        public final zza zza(zzb zzb2) {
            this.zzd = zzb2;
            return this;
        }

        public final zzed zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            } else if (this.zzb == null) {
                throw new GeneralSecurityException("IV size is not set");
            } else if (this.zzd == null) {
                throw new GeneralSecurityException("Variant is not set");
            } else if (this.zzc != null) {
                return new zzed(num.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd);
            } else {
                throw new GeneralSecurityException("Tag size is not set");
            }
        }
    }
}
