package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzir;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzik  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzik extends zzjc {
    private final zzir zza;
    private final zzxu zzb;
    private final zzxt zzc;
    private final Integer zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzik$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static class zza {
        private zzir zza;
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

        public final zza zza(zzir zzir) {
            this.zza = zzir;
            return this;
        }

        public final zzik zza() throws GeneralSecurityException {
            zzxt zza2;
            zzir zzir = this.zza;
            if (zzir == null || this.zzb == null) {
                throw new IllegalArgumentException("Cannot build without parameters and/or key material");
            } else if (zzir.zzb() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            } else if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.zza.zza() || this.zzc == null) {
                if (this.zza.zzd() == zzir.zzb.zzc) {
                    zza2 = zzxt.zza(new byte[0]);
                } else if (this.zza.zzd() == zzir.zzb.zzb) {
                    zza2 = zzxt.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                } else if (this.zza.zzd() == zzir.zzb.zza) {
                    zza2 = zzxt.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                } else {
                    String valueOf = String.valueOf(this.zza.zzd());
                    throw new IllegalStateException("Unknown AesSivParameters.Variant: " + valueOf);
                }
                return new zzik(this.zza, this.zzb, zza2, this.zzc);
            } else {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
        }
    }

    private zzik(zzir zzir, zzxu zzxu, zzxt zzxt, Integer num) {
        this.zza = zzir;
        this.zzb = zzxu;
        this.zzc = zzxt;
        this.zzd = num;
    }
}
