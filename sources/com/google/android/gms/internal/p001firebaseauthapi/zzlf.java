package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzlf implements zzbo {
    private static final byte[] zza = new byte[0];
    private final zzll zzb;
    private final zzlj zzc;
    private final zzlg zzd;
    private final zzld zze;
    private final int zzf;

    private zzlf(zzll zzll, zzlj zzlj, zzlg zzlg, zzld zzld, int i10) {
        this.zzb = zzll;
        this.zzc = zzlj;
        this.zzd = zzlg;
        this.zze = zzld;
        this.zzf = i10;
    }

    static zzlf zza(zzuu zzuu) throws GeneralSecurityException {
        int i10;
        zzll zzll;
        if (!zzuu.zzf()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        } else if (!zzuu.zzd().zzg()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        } else if (!zzuu.zze().zze()) {
            zzur zzb2 = zzuu.zzd().zzb();
            zzlj zzc2 = zzlk.zzc(zzb2);
            zzlg zzb3 = zzlk.zzb(zzb2);
            zzld zza2 = zzlk.zza(zzb2);
            zzuo zzc3 = zzb2.zzc();
            int i11 = zzle.zza[zzc3.ordinal()];
            if (i11 == 1) {
                i10 = 32;
            } else if (i11 == 2) {
                i10 = 65;
            } else if (i11 == 3) {
                i10 = 97;
            } else if (i11 == 4) {
                i10 = 133;
            } else {
                String name = zzc3.name();
                throw new IllegalArgumentException("Unable to determine KEM-encoding length for " + name);
            }
            int i12 = zzli.zza[zzuu.zzd().zzb().zzc().ordinal()];
            if (i12 == 1) {
                zzll = zzlz.zza(zzuu.zze().zzg());
            } else if (i12 == 2 || i12 == 3 || i12 == 4) {
                zzll = zzlx.zza(zzuu.zze().zzg(), zzuu.zzd().zzf().zzg(), zzlt.zzc(zzuu.zzd().zzb().zzc()));
            } else {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            return new zzlf(zzll, zzc2, zzb3, zza2, i10);
        } else {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.zzf;
        if (length >= i10) {
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] copyOf = Arrays.copyOf(bArr, i10);
            return zzlc.zza(copyOf, this.zzb, this.zzc, this.zzd, this.zze, bArr3).zza(Arrays.copyOfRange(bArr, this.zzf, bArr.length), zza);
        }
        throw new GeneralSecurityException("Ciphertext is too short.");
    }
}
