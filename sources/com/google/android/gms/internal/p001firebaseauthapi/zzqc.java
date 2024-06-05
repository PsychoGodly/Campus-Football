package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzql;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzqc extends zzqr {
    private final zzql zza;
    private final zzxu zzb;
    private final zzxt zzc;
    private final Integer zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqc$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static class zza {
        private zzql zza;
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

        public final zza zza(zzql zzql) {
            this.zza = zzql;
            return this;
        }

        public final zzqc zza() throws GeneralSecurityException {
            zzxt zza2;
            zzql zzql = this.zza;
            if (zzql == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            } else if (zzql.zzc() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            } else if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.zza.zza() || this.zzc == null) {
                if (this.zza.zzf() == zzql.zzb.zzd) {
                    zza2 = zzxt.zza(new byte[0]);
                } else if (this.zza.zzf() == zzql.zzb.zzc || this.zza.zzf() == zzql.zzb.zzb) {
                    zza2 = zzxt.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                } else if (this.zza.zzf() == zzql.zzb.zza) {
                    zza2 = zzxt.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                } else {
                    String valueOf = String.valueOf(this.zza.zzf());
                    throw new IllegalStateException("Unknown HmacParameters.Variant: " + valueOf);
                }
                return new zzqc(this.zza, this.zzb, zza2, this.zzc);
            } else {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
        }
    }

    private zzqc(zzql zzql, zzxu zzxu, zzxt zzxt, Integer num) {
        this.zza = zzql;
        this.zzb = zzxu;
        this.zzc = zzxt;
        this.zzd = num;
    }

    public static zza zzc() {
        return new zza();
    }

    public final /* synthetic */ zzqq zza() {
        return this.zza;
    }

    public final zzxt zzb() {
        return this.zzc;
    }

    public final zzxu zzd() {
        return this.zzb;
    }
}
