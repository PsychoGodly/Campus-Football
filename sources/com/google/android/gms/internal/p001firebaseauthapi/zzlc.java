package com.google.android.gms.internal.p001firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzlc {
    private static final byte[] zza = new byte[0];
    private final zzld zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private BigInteger zzg = BigInteger.ZERO;

    private zzlc(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzld zzld) {
        this.zzf = bArr;
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzld;
    }

    public static zzlc zza(byte[] bArr, zzll zzll, zzlj zzlj, zzlg zzlg, zzld zzld, byte[] bArr2) throws GeneralSecurityException {
        byte[] zza2 = zzlj.zza(bArr, zzll);
        byte[] bArr3 = zzlt.zza;
        byte[] zza3 = zzlt.zza(zzlj.zza(), zzlg.zzb(), zzld.zzc());
        byte[] bArr4 = zzlt.zzl;
        byte[] bArr5 = zza;
        byte[] zza4 = zzwg.zza(bArr3, zzlg.zza(bArr4, bArr5, "psk_id_hash", zza3), zzlg.zza(bArr4, bArr2, "info_hash", zza3));
        zzlg zzlg2 = zzlg;
        byte[] zza5 = zzlg.zza(zza2, bArr5, "secret", zza3);
        byte[] bArr6 = zza4;
        byte[] bArr7 = zza3;
        byte[] zza6 = zzlg2.zza(zza5, bArr6, "key", bArr7, zzld.zza());
        byte[] zza7 = zzlg2.zza(zza5, bArr6, "base_nonce", bArr7, zzld.zzb());
        zzld.zzb();
        BigInteger bigInteger = BigInteger.ONE;
        return new zzlc(bArr, zza6, zza7, bigInteger.shiftLeft(96).subtract(bigInteger), zzld);
    }

    private final synchronized byte[] zza() throws GeneralSecurityException {
        byte[] zza2;
        zza2 = zzwg.zza(this.zze, zzme.zza(this.zzg, this.zzb.zzb()));
        if (this.zzg.compareTo(this.zzc) < 0) {
            this.zzg = this.zzg.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return zza2;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.zzb.zza(this.zzd, zza(), bArr, bArr2);
    }
}
