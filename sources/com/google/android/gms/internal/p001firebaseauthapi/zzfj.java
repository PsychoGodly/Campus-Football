package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzfj extends zzdb {
    private final int zza;
    private final zzb zzb;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfj$zzb */
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

    private zzfj(int i10, zzb zzb2) {
        this.zza = i10;
        this.zzb = zzb2;
    }

    public static zza zzc() {
        return new zza();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfj)) {
            return false;
        }
        zzfj zzfj = (zzfj) obj;
        if (zzfj.zza == this.zza && zzfj.zzb == this.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzfj.class, Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        int i10 = this.zza;
        return "AesGcmSiv Parameters (variant: " + valueOf + ", " + i10 + "-byte key)";
    }

    public final boolean zza() {
        return this.zzb != zzb.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzb zzd() {
        return this.zzb;
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfj$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza {
        private Integer zza;
        private zzb zzb;

        private zza() {
            this.zza = null;
            this.zzb = zzb.zzc;
        }

        public final zza zza(int i10) throws GeneralSecurityException {
            if (i10 == 16 || i10 == 32) {
                this.zza = Integer.valueOf(i10);
                return this;
            }
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i10)}));
        }

        public final zza zza(zzb zzb2) {
            this.zzb = zzb2;
            return this;
        }

        public final zzfj zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            } else if (this.zzb != null) {
                return new zzfj(num.intValue(), this.zzb);
            } else {
                throw new GeneralSecurityException("Variant is not set");
            }
        }
    }
}
