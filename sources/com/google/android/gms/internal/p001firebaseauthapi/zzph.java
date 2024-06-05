package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzpo;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzph  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzph extends zzqr {
    private final zzpo zza;
    private final zzxu zzb;
    private final zzxt zzc;
    private final Integer zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzph$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static class zza {
        private zzpo zza;
        private zzxu zzb;
        private Integer zzc;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(zzxu zzxu) throws GeneralSecurityException {
            this.zzb = zzxu;
            return this;
        }

        public final zza zza(Integer num) {
            this.zzc = num;
            return this;
        }

        public final zza zza(zzpo zzpo) {
            this.zza = zzpo;
            return this;
        }

        public final zzph zza() throws GeneralSecurityException {
            zzxt zza2;
            zzpo zzpo = this.zza;
            if (zzpo == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            } else if (zzpo.zzc() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            } else if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.zza.zza() || this.zzc == null) {
                if (this.zza.zze() == zzpo.zzb.zzd) {
                    zza2 = zzxt.zza(new byte[0]);
                } else if (this.zza.zze() == zzpo.zzb.zzc || this.zza.zze() == zzpo.zzb.zzb) {
                    zza2 = zzxt.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                } else if (this.zza.zze() == zzpo.zzb.zza) {
                    zza2 = zzxt.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                } else {
                    String valueOf = String.valueOf(this.zza.zze());
                    throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + valueOf);
                }
                return new zzph(this.zza, this.zzb, zza2, this.zzc);
            } else {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
        }
    }

    private zzph(zzpo zzpo, zzxu zzxu, zzxt zzxt, Integer num) {
        this.zza = zzpo;
        this.zzb = zzxu;
        this.zzc = zzxt;
        this.zzd = num;
    }

    public final /* synthetic */ zzqq zza() {
        return this.zza;
    }

    public final zzxt zzb() {
        return this.zzc;
    }

    public final zzxu zzc() {
        return this.zzb;
    }
}
