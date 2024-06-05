package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzql  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzql extends zzqq {
    private final int zza;
    private final int zzb;
    private final zzb zzc;
    private final zzc zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzql$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza {
        private Integer zza;
        private Integer zzb;
        private zzc zzc;
        private zzb zzd;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zzb.zzd;
        }

        public final zza zza(zzc zzc2) {
            this.zzc = zzc2;
            return this;
        }

        public final zza zzb(int i10) throws GeneralSecurityException {
            this.zzb = Integer.valueOf(i10);
            return this;
        }

        public final zza zza(int i10) throws GeneralSecurityException {
            this.zza = Integer.valueOf(i10);
            return this;
        }

        public final zza zza(zzb zzb2) {
            this.zzd = zzb2;
            return this;
        }

        public final zzql zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            } else if (this.zzb == null) {
                throw new GeneralSecurityException("tag size is not set");
            } else if (this.zzc == null) {
                throw new GeneralSecurityException("hash type is not set");
            } else if (this.zzd == null) {
                throw new GeneralSecurityException("variant is not set");
            } else if (num.intValue() >= 16) {
                int intValue = this.zzb.intValue();
                zzc zzc2 = this.zzc;
                if (intValue >= 10) {
                    if (zzc2 == zzc.zza) {
                        if (intValue > 20) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{Integer.valueOf(intValue)}));
                        }
                    } else if (zzc2 == zzc.zzb) {
                        if (intValue > 28) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{Integer.valueOf(intValue)}));
                        }
                    } else if (zzc2 == zzc.zzc) {
                        if (intValue > 32) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{Integer.valueOf(intValue)}));
                        }
                    } else if (zzc2 == zzc.zzd) {
                        if (intValue > 48) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{Integer.valueOf(intValue)}));
                        }
                    } else if (zzc2 != zzc.zze) {
                        throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                    } else if (intValue > 64) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{Integer.valueOf(intValue)}));
                    }
                    return new zzql(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc);
                }
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(intValue)}));
            } else {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", new Object[]{this.zza}));
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzql$zzb */
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

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzql$zzc */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zzc {
        public static final zzc zza = new zzc("SHA1");
        public static final zzc zzb = new zzc("SHA224");
        public static final zzc zzc = new zzc("SHA256");
        public static final zzc zzd = new zzc("SHA384");
        public static final zzc zze = new zzc("SHA512");
        private final String zzf;

        private zzc(String str) {
            this.zzf = str;
        }

        public final String toString() {
            return this.zzf;
        }
    }

    private zzql(int i10, int i11, zzb zzb2, zzc zzc2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzb2;
        this.zzd = zzc2;
    }

    public static zza zzd() {
        return new zza();
    }

    private final int zzg() {
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
        if (!(obj instanceof zzql)) {
            return false;
        }
        zzql zzql = (zzql) obj;
        if (zzql.zza == this.zza && zzql.zzg() == zzg() && zzql.zzc == this.zzc && zzql.zzd == this.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzql.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        int i10 = this.zzb;
        int i11 = this.zza;
        return "HMAC Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + i10 + "-byte tags, and " + i11 + "-byte key)";
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

    public final zzc zze() {
        return this.zzd;
    }

    public final zzb zzf() {
        return this.zzc;
    }
}
