package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzdl;
import com.google.android.gms.internal.p001firebaseauthapi.zzes;
import com.google.android.gms.internal.p001firebaseauthapi.zzir;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzjl extends zzks {
    /* access modifiers changed from: private */
    public static final Set<zzch> zza = ((Set) zzpd.zza(zzjn.zza));
    private final zzc zzb;
    private final zzb zzc;
    private final zze zzd;
    private final zzd zze;
    private final zzch zzf;
    private final zzxt zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjl$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza {
        private zzc zza;
        private zzb zzb;
        private zze zzc;
        private zzch zzd;
        private zzd zze;
        private zzxt zzf;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = zzd.zzc;
            this.zzf = null;
        }

        public final zza zza(zzc zzc2) {
            this.zza = zzc2;
            return this;
        }

        public final zza zza(zzch zzch) throws GeneralSecurityException {
            if (zzjl.zza.contains(zzch)) {
                this.zzd = zzch;
                return this;
            }
            String valueOf = String.valueOf(zzch);
            throw new GeneralSecurityException("Invalid DEM parameters " + valueOf + "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported.");
        }

        public final zza zza(zzb zzb2) {
            this.zzb = zzb2;
            return this;
        }

        public final zza zza(zze zze2) {
            this.zzc = zze2;
            return this;
        }

        public final zza zza(zzxt zzxt) {
            if (zzxt.zza() == 0) {
                this.zzf = null;
                return this;
            }
            this.zzf = zzxt;
            return this;
        }

        public final zza zza(zzd zzd2) {
            this.zze = zzd2;
            return this;
        }

        public final zzjl zza() throws GeneralSecurityException {
            zzc zzc2 = this.zza;
            if (zzc2 == null) {
                throw new GeneralSecurityException("Elliptic curve type is not set");
            } else if (this.zzb == null) {
                throw new GeneralSecurityException("Hash type is not set");
            } else if (this.zzd == null) {
                throw new GeneralSecurityException("DEM parameters are not set");
            } else if (this.zze != null) {
                zzc zzc3 = zzc.zzd;
                if (zzc2 != zzc3 && this.zzc == null) {
                    throw new GeneralSecurityException("Point format is not set");
                } else if (zzc2 != zzc3 || this.zzc == null) {
                    return new zzjl(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
                } else {
                    throw new GeneralSecurityException("For Curve25519 point format must not be set");
                }
            } else {
                throw new GeneralSecurityException("Variant is not set");
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjl$zzb */
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

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjl$zzc */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zzc {
        public static final zzc zza = new zzc("NIST_P256");
        public static final zzc zzb = new zzc("NIST_P384");
        public static final zzc zzc = new zzc("NIST_P521");
        public static final zzc zzd = new zzc("X25519");
        private final String zze;

        private zzc(String str) {
            this.zze = str;
        }

        public final String toString() {
            return this.zze;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjl$zzd */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zzd {
        public static final zzd zza = new zzd("TINK");
        public static final zzd zzb = new zzd("CRUNCHY");
        public static final zzd zzc = new zzd("NO_PREFIX");
        private final String zzd;

        private zzd(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjl$zze */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zze {
        public static final zze zza = new zze("COMPRESSED");
        public static final zze zzb = new zze("UNCOMPRESSED");
        public static final zze zzc = new zze("LEGACY_UNCOMPRESSED");
        private final String zzd;

        private zze(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    private zzjl(zzc zzc2, zzb zzb2, zze zze2, zzch zzch, zzd zzd2, zzxt zzxt) {
        this.zzb = zzc2;
        this.zzc = zzb2;
        this.zzd = zze2;
        this.zzf = zzch;
        this.zze = zzd2;
        this.zzg = zzxt;
    }

    public static zza zzc() {
        return new zza();
    }

    static /* synthetic */ Set zzj() throws Exception {
        HashSet hashSet = new HashSet();
        zzes.zza zzc2 = zzes.zze().zza(12).zzb(16).zzc(16);
        zzes.zzb zzb2 = zzes.zzb.zzc;
        hashSet.add(zzc2.zza(zzb2).zza());
        hashSet.add(zzes.zze().zza(12).zzb(32).zzc(16).zza(zzb2).zza());
        zzdl.zza zzc3 = zzdl.zzf().zza(16).zzb(32).zzd(16).zzc(16);
        zzdl.zzb zzb3 = zzdl.zzb.zzc;
        zzdl.zza zza2 = zzc3.zza(zzb3);
        zzdl.zzc zzc4 = zzdl.zzc.zzc;
        hashSet.add(zza2.zza(zzc4).zza());
        hashSet.add(zzdl.zzf().zza(32).zzb(32).zzd(32).zzc(16).zza(zzb3).zza(zzc4).zza());
        hashSet.add(zzhm.zzc());
        hashSet.add(zzir.zzc().zza(64).zza(zzir.zzb.zzc).zza());
        return Collections.unmodifiableSet(hashSet);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjl)) {
            return false;
        }
        zzjl zzjl = (zzjl) obj;
        if (!zzjo.zza(zzjl.zzb, this.zzb) || !zzjo.zza(zzjl.zzc, this.zzc) || !zzjo.zza(zzjl.zzd, this.zzd) || !zzjo.zza(zzjl.zzf, this.zzf) || !zzjo.zza(zzjl.zze, this.zze) || !zzjo.zza(zzjl.zzg, this.zzg)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzjl.class, this.zzb, this.zzc, this.zzd, this.zzf, this.zze, this.zzg});
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", new Object[]{this.zzb, this.zzc, this.zzd, this.zzf, this.zze, this.zzg});
    }

    public final boolean zza() {
        return this.zze != zzd.zzc;
    }

    public final zzch zzb() {
        return this.zzf;
    }

    public final zzc zzd() {
        return this.zzb;
    }

    public final zzb zze() {
        return this.zzc;
    }

    public final zze zzf() {
        return this.zzd;
    }

    public final zzd zzg() {
        return this.zze;
    }

    public final zzxt zzh() {
        return this.zzg;
    }
}
