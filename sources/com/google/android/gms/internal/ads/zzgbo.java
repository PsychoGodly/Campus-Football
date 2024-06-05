package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgbo {
    private final String zza;

    zzgbo(String str) {
        this.zza = str;
    }

    private final byte[] zzf(byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
        Mac mac = (Mac) zzgnn.zzb.zza(this.zza);
        if (i10 <= mac.getMacLength() * 255) {
            byte[] bArr3 = new byte[i10];
            mac.init(new SecretKeySpec(bArr, this.zza));
            byte[] bArr4 = new byte[0];
            int i11 = 1;
            int i12 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i11);
                bArr4 = mac.doFinal();
                int length = bArr4.length;
                int i13 = i12 + length;
                if (i13 < i10) {
                    System.arraycopy(bArr4, 0, bArr3, i12, length);
                    i11++;
                    i12 = i13;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i12, i10 - i12);
                    return bArr3;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    private final byte[] zzg(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Mac mac = (Mac) zzgnn.zzb.zza(this.zza);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.zza));
        } else {
            mac.init(new SecretKeySpec(bArr2, this.zza));
        }
        return mac.doFinal(bArr);
    }

    /* access modifiers changed from: package-private */
    public final int zza() throws GeneralSecurityException {
        return Mac.getInstance(this.zza).getMacLength();
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i10) throws GeneralSecurityException {
        return zzf(zzg(zzgcc.zze("eae_prk", bArr2, bArr4), (byte[]) null), zzgcc.zzf("shared_secret", bArr3, bArr4, i10), i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] zzc() throws java.security.GeneralSecurityException {
        /*
            r5 = this;
            java.lang.String r0 = r5.zza
            int r1 = r0.hashCode()
            r2 = 984523022(0x3aaea10e, float:0.0013323145)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002c
            r2 = 984524074(0x3aaea52a, float:0.0013324369)
            if (r1 == r2) goto L_0x0022
            r2 = 984525777(0x3aaeabd1, float:0.0013326352)
            if (r1 == r2) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r1 = "HmacSha512"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "HmacSha384"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "HmacSha256"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x004b
            if (r0 == r4) goto L_0x0048
            if (r0 != r3) goto L_0x0040
            byte[] r0 = com.google.android.gms.internal.ads.zzgcc.zzh
            return r0
        L_0x0040:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Could not determine HPKE KDF ID"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            byte[] r0 = com.google.android.gms.internal.ads.zzgcc.zzg
            return r0
        L_0x004b:
            byte[] r0 = com.google.android.gms.internal.ads.zzgcc.zzf
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgbo.zzc():byte[]");
    }

    public final byte[] zzd(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i10) throws GeneralSecurityException {
        return zzf(bArr, zzgcc.zzf(str, bArr2, bArr3, i10), i10);
    }

    public final byte[] zze(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) throws GeneralSecurityException {
        return zzg(zzgcc.zze(str, bArr2, bArr3), bArr);
    }
}
