package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzfj;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzfc extends zzcz {
    private final zzfj zza;
    private final zzxu zzb;
    private final zzxt zzc;
    private final Integer zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfc$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static class zza {
        private zzfj zza;
        private zzxu zzb;
        private Integer zzc;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(Integer num) {
            this.zzc = num;
            return this;
        }

        public final zza zza(zzxu zzxu) {
            this.zzb = zzxu;
            return this;
        }

        public final zza zza(zzfj zzfj) {
            this.zza = zzfj;
            return this;
        }

        public final zzfc zza() throws GeneralSecurityException {
            zzxt zza2;
            zzfj zzfj = this.zza;
            if (zzfj == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            } else if (zzfj.zzb() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            } else if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.zza.zza() || this.zzc == null) {
                if (this.zza.zzd() == zzfj.zzb.zzc) {
                    zza2 = zzxt.zza(new byte[0]);
                } else if (this.zza.zzd() == zzfj.zzb.zzb) {
                    zza2 = zzxt.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                } else if (this.zza.zzd() == zzfj.zzb.zza) {
                    zza2 = zzxt.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                } else {
                    String valueOf = String.valueOf(this.zza.zzd());
                    throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + valueOf);
                }
                return new zzfc(this.zza, this.zzb, zza2, this.zzc);
            } else {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
        }
    }

    private zzfc(zzfj zzfj, zzxu zzxu, zzxt zzxt, Integer num) {
        this.zza = zzfj;
        this.zzb = zzxu;
        this.zzc = zzxt;
        this.zzd = num;
    }
}
