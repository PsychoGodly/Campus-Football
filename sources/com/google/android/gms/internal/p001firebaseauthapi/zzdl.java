package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzdl extends zzdb {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzc zze;
    private final zzb zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdl$zzb */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zzb {
        public static final zzb zza = new zzb("SHA1");
        public static final zzb zzb = new zzb("SHA224");
        public static final zzb zzc = new zzb("SHA256");
        public static final zzb zzd = new zzb("SHA384");
        public static final zzb zze = new zzb("SHA512");
        private final String zzf;

        private zzb(String str) {
            this.zzf = str;
        }

        public final String toString() {
            return this.zzf;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdl$zzc */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zzc {
        public static final zzc zza = new zzc("TINK");
        public static final zzc zzb = new zzc("CRUNCHY");
        public static final zzc zzc = new zzc("NO_PREFIX");
        private final String zzd;

        private zzc(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    private zzdl(int i10, int i11, int i12, int i13, zzc zzc2, zzb zzb2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = zzc2;
        this.zzf = zzb2;
    }

    public static zza zzf() {
        return new zza();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdl)) {
            return false;
        }
        zzdl zzdl = (zzdl) obj;
        if (zzdl.zza == this.zza && zzdl.zzb == this.zzb && zzdl.zzc == this.zzc && zzdl.zzd == this.zzd && zzdl.zze == this.zze && zzdl.zzf == this.zzf) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzdl.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zze);
        String valueOf2 = String.valueOf(this.zzf);
        int i10 = this.zzc;
        int i11 = this.zzd;
        int i12 = this.zza;
        int i13 = this.zzb;
        return "AesCtrHmacAead Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + i10 + "-byte IV, and " + i11 + "-byte tags, and " + i12 + "-byte AES key, and " + i13 + "-byte HMAC key)";
    }

    public final boolean zza() {
        return this.zze != zzc.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zzb zzg() {
        return this.zzf;
    }

    public final zzc zzh() {
        return this.zze;
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdl$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza {
        private Integer zza;
        private Integer zzb;
        private Integer zzc;
        private Integer zzd;
        private zzb zze;
        private zzc zzf;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzf = zzc.zzc;
        }

        public final zza zza(int i10) throws GeneralSecurityException {
            if (i10 == 16 || i10 == 24 || i10 == 32) {
                this.zza = Integer.valueOf(i10);
                return this;
            }
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i10)}));
        }

        public final zza zzb(int i10) throws GeneralSecurityException {
            if (i10 >= 16) {
                this.zzb = Integer.valueOf(i10);
                return this;
            }
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", new Object[]{Integer.valueOf(i10)}));
        }

        public final zza zzc(int i10) throws GeneralSecurityException {
            if (i10 < 12 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", new Object[]{Integer.valueOf(i10)}));
            }
            this.zzc = Integer.valueOf(i10);
            return this;
        }

        public final zza zzd(int i10) throws GeneralSecurityException {
            if (i10 >= 10) {
                this.zzd = Integer.valueOf(i10);
                return this;
            }
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(i10)}));
        }

        public final zza zza(zzb zzb2) {
            this.zze = zzb2;
            return this;
        }

        public final zza zza(zzc zzc2) {
            this.zzf = zzc2;
            return this;
        }

        public final zzdl zza() throws GeneralSecurityException {
            if (this.zza == null) {
                throw new GeneralSecurityException("AES key size is not set");
            } else if (this.zzb == null) {
                throw new GeneralSecurityException("HMAC key size is not set");
            } else if (this.zzc != null) {
                Integer num = this.zzd;
                if (num == null) {
                    throw new GeneralSecurityException("tag size is not set");
                } else if (this.zze == null) {
                    throw new GeneralSecurityException("hash type is not set");
                } else if (this.zzf != null) {
                    int intValue = num.intValue();
                    zzb zzb2 = this.zze;
                    if (zzb2 == zzb.zza) {
                        if (intValue > 20) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{Integer.valueOf(intValue)}));
                        }
                    } else if (zzb2 == zzb.zzb) {
                        if (intValue > 28) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{Integer.valueOf(intValue)}));
                        }
                    } else if (zzb2 == zzb.zzc) {
                        if (intValue > 32) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{Integer.valueOf(intValue)}));
                        }
                    } else if (zzb2 == zzb.zzd) {
                        if (intValue > 48) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{Integer.valueOf(intValue)}));
                        }
                    } else if (zzb2 != zzb.zze) {
                        throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                    } else if (intValue > 64) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{Integer.valueOf(intValue)}));
                    }
                    return new zzdl(this.zza.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd.intValue(), this.zzf, this.zze);
                } else {
                    throw new GeneralSecurityException("variant is not set");
                }
            } else {
                throw new GeneralSecurityException("iv size is not set");
            }
        }
    }
}
