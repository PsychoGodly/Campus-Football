package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzlv implements zzlj {
    private final zzwo zza;
    private final zzla zzb;

    private zzlv(zzla zzla, zzwo zzwo) {
        this.zzb = zzla;
        this.zza = zzwo;
    }

    static zzlv zza(zzwo zzwo) throws GeneralSecurityException {
        int i10 = zzlu.zza[zzwo.ordinal()];
        if (i10 == 1) {
            return new zzlv(new zzla("HmacSha256"), zzwo.NIST_P256);
        }
        if (i10 == 2) {
            return new zzlv(new zzla("HmacSha384"), zzwo.NIST_P384);
        }
        if (i10 == 3) {
            return new zzlv(new zzla("HmacSha512"), zzwo.NIST_P521);
        }
        String valueOf = String.valueOf(zzwo);
        throw new GeneralSecurityException("invalid curve type: " + valueOf);
    }

    public final byte[] zza(byte[] bArr, zzll zzll) throws GeneralSecurityException {
        byte[] zza2 = zzwp.zza(zzwp.zza(this.zza, zzll.zza().zzb()), zzwp.zza(this.zza, zzwr.UNCOMPRESSED, bArr));
        byte[] zza3 = zzwg.zza(bArr, zzll.zzb().zzb());
        byte[] zza4 = zzlt.zza(zza());
        zzla zzla = this.zzb;
        return zzla.zza((byte[]) null, zza2, "eae_prk", zza3, "shared_secret", zza4, zzla.zza());
    }

    public final byte[] zza() throws GeneralSecurityException {
        int i10 = zzlu.zza[this.zza.ordinal()];
        if (i10 == 1) {
            return zzlt.zzc;
        }
        if (i10 == 2) {
            return zzlt.zzd;
        }
        if (i10 == 3) {
            return zzlt.zze;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
