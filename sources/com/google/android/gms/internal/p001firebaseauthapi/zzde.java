package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzdl;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzde  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzde extends zzcz {
    private final zzdl zza;
    private final zzxu zzb;
    private final zzxu zzc;
    private final zzxt zzd;
    private final Integer zze;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzde$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static class zza {
        private zzdl zza;
        private zzxu zzb;
        private zzxu zzc;
        private Integer zzd;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
        }

        public final zza zza(zzxu zzxu) {
            this.zzb = zzxu;
            return this;
        }

        public final zza zzb(zzxu zzxu) {
            this.zzc = zzxu;
            return this;
        }

        public final zza zza(Integer num) {
            this.zzd = num;
            return this;
        }

        public final zza zza(zzdl zzdl) {
            this.zza = zzdl;
            return this;
        }

        public final zzde zza() throws GeneralSecurityException {
            zzxt zza2;
            zzdl zzdl = this.zza;
            if (zzdl == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            } else if (this.zzb == null || this.zzc == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            } else if (zzdl.zzb() != this.zzb.zza()) {
                throw new GeneralSecurityException("AES key size mismatch");
            } else if (this.zza.zzc() != this.zzc.zza()) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            } else if (this.zza.zza() && this.zzd == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.zza.zza() || this.zzd == null) {
                if (this.zza.zzh() == zzdl.zzc.zzc) {
                    zza2 = zzxt.zza(new byte[0]);
                } else if (this.zza.zzh() == zzdl.zzc.zzb) {
                    zza2 = zzxt.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzd.intValue()).array());
                } else if (this.zza.zzh() == zzdl.zzc.zza) {
                    zza2 = zzxt.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzd.intValue()).array());
                } else {
                    String valueOf = String.valueOf(this.zza.zzh());
                    throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + valueOf);
                }
                return new zzde(this.zza, this.zzb, this.zzc, zza2, this.zzd);
            } else {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
        }
    }

    private zzde(zzdl zzdl, zzxu zzxu, zzxu zzxu2, zzxt zzxt, Integer num) {
        this.zza = zzdl;
        this.zzb = zzxu;
        this.zzc = zzxu2;
        this.zzd = zzxt;
        this.zze = num;
    }
}
