package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzla  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzla implements zzlg {
    private final String zza;

    zzla(String str) {
        this.zza = str;
    }

    /* access modifiers changed from: package-private */
    public final int zza() throws GeneralSecurityException {
        return Mac.getInstance(this.zza).getMacLength();
    }

    public final byte[] zzb() throws GeneralSecurityException {
        String str = this.zza;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 984523022:
                if (str.equals("HmacSha256")) {
                    c10 = 0;
                    break;
                }
                break;
            case 984524074:
                if (str.equals("HmacSha384")) {
                    c10 = 1;
                    break;
                }
                break;
            case 984525777:
                if (str.equals("HmacSha512")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return zzlt.zzf;
            case 1:
                return zzlt.zzg;
            case 2:
                return zzlt.zzh;
            default:
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
        }
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
        Mac zza2 = zzwt.zzb.zza(this.zza);
        if (i10 <= zza2.getMacLength() * 255) {
            byte[] bArr3 = new byte[i10];
            zza2.init(new SecretKeySpec(bArr, this.zza));
            byte[] bArr4 = new byte[0];
            int i11 = 1;
            int i12 = 0;
            while (true) {
                zza2.update(bArr4);
                zza2.update(bArr2);
                zza2.update((byte) i11);
                bArr4 = zza2.doFinal();
                if (bArr4.length + i12 < i10) {
                    System.arraycopy(bArr4, 0, bArr3, i12, bArr4.length);
                    i12 += bArr4.length;
                    i11++;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i12, i10 - i12);
                    return bArr3;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Mac zza2 = zzwt.zzb.zza(this.zza);
        if (bArr2 == null || bArr2.length == 0) {
            zza2.init(new SecretKeySpec(new byte[zza2.getMacLength()], this.zza));
        } else {
            zza2.init(new SecretKeySpec(bArr2, this.zza));
        }
        return zza2.doFinal(bArr);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i10) throws GeneralSecurityException {
        return zza(zza(zzlt.zza(str, bArr2, bArr4), (byte[]) null), zzlt.zza(str2, bArr3, bArr4, i10), i10);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i10) throws GeneralSecurityException {
        return zza(bArr, zzlt.zza(str, bArr2, bArr3, i10), i10);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) throws GeneralSecurityException {
        return zza(zzlt.zza(str, bArr2, bArr3), bArr);
    }
}
