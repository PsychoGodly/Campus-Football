package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpo  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzpo extends zzqq {
    private final int zza;
    private final int zzb;
    private final zzb zzc;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpo$zzb */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zzb {
        public static final zzb zza = new zzb("TINK");
        public static final zzb zzb = new zzb("CRUNCHY");
        public static final zzb zzc = new zzb("LEGACY");
        public static final zzb zzd = new zzb("NO_PREFIX");
        private final String zze;

        private zzb(String str) {
            this.zze = str;
        }

        public final String toString() {
            return this.zze;
        }
    }

    private zzpo(int i10, int i11, zzb zzb2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzb2;
    }

    public static zza zzd() {
        return new zza();
    }

    private final int zzf() {
        int i10;
        zzb zzb2 = this.zzc;
        if (zzb2 == zzb.zzd) {
            return this.zzb;
        }
        if (zzb2 == zzb.zza) {
            i10 = this.zzb;
        } else if (zzb2 == zzb.zzb) {
            i10 = this.zzb;
        } else if (zzb2 == zzb.zzc) {
            i10 = this.zzb;
        } else {
            throw new IllegalStateException("Unknown variant");
        }
        return i10 + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpo)) {
            return false;
        }
        zzpo zzpo = (zzpo) obj;
        if (zzpo.zza == this.zza && zzpo.zzf() == zzf() && zzpo.zzc == this.zzc) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzpo.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        int i10 = this.zzb;
        int i11 = this.zza;
        return "AES-CMAC Parameters (variant: " + valueOf + ", " + i10 + "-byte tags, and " + i11 + "-byte key)";
    }

    public final boolean zza() {
        return this.zzc != zzb.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzb zze() {
        return this.zzc;
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpo$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza {
        private Integer zza;
        private Integer zzb;
        private zzb zzc;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = zzb.zzd;
        }

        public final zza zza(int i10) throws GeneralSecurityException {
            if (i10 == 16 || i10 == 32) {
                this.zza = Integer.valueOf(i10);
                return this;
            }
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(i10 << 3)}));
        }

        public final zza zzb(int i10) throws GeneralSecurityException {
            if (i10 < 10 || 16 < i10) {
                throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
            }
            this.zzb = Integer.valueOf(i10);
            return this;
        }

        public final zza zza(zzb zzb2) {
            this.zzc = zzb2;
            return this;
        }

        public final zzpo zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            } else if (this.zzb == null) {
                throw new GeneralSecurityException("tag size not set");
            } else if (this.zzc != null) {
                return new zzpo(num.intValue(), this.zzb.intValue(), this.zzc);
            } else {
                throw new GeneralSecurityException("variant not set");
            }
        }
    }
}
