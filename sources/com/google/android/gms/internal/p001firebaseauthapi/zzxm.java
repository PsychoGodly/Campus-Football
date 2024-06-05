package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzpo;
import com.google.android.gms.internal.p001firebaseauthapi.zzql;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzxm implements zzce {
    private static final byte[] zza = {0};
    private final zzrx zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzxm(zzph zzph) throws GeneralSecurityException {
        this.zzb = new zzxl(zzph.zzc().zza(zzbq.zza()));
        this.zzc = ((zzpo) zzph.zza()).zzb();
        this.zzd = zzph.zzb().zzb();
        if (((zzpo) zzph.zza()).zze().equals(zzpo.zzb.zzc)) {
            byte[] bArr = zza;
            this.zze = Arrays.copyOf(bArr, bArr.length);
            return;
        }
        this.zze = new byte[0];
    }

    public static zzce zza(zzph zzph) throws GeneralSecurityException {
        return new zzxm(zzph);
    }

    public static zzce zza(zzqc zzqc) throws GeneralSecurityException {
        return new zzxm(zzqc);
    }

    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!MessageDigest.isEqual(zza(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.zze;
        if (bArr2.length > 0) {
            return zzwg.zza(this.zzd, this.zzb.zza(zzwg.zza(bArr, bArr2), this.zzc));
        }
        return zzwg.zza(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzxm(zzqc zzqc) throws GeneralSecurityException {
        String valueOf = String.valueOf(((zzql) zzqc.zza()).zze());
        this.zzb = new zzxk("HMAC" + valueOf, new SecretKeySpec(zzqc.zzd().zza(zzbq.zza()), "HMAC"));
        this.zzc = ((zzql) zzqc.zza()).zzb();
        this.zzd = zzqc.zzb().zzb();
        if (((zzql) zzqc.zza()).zzf().equals(zzql.zzb.zzc)) {
            byte[] bArr = zza;
            this.zze = Arrays.copyOf(bArr, bArr.length);
            return;
        }
        this.zze = new byte[0];
    }

    public zzxm(zzrx zzrx, int i10) throws GeneralSecurityException {
        this.zzb = zzrx;
        this.zzc = i10;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        if (i10 >= 10) {
            zzrx.zza(new byte[0], i10);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }
}
