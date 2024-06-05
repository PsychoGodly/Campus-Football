package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgol {
    private final byte[] zza = new byte[256];
    private int zzb;
    private int zzc;

    public zzgol(byte[] bArr) {
        for (int i10 = 0; i10 < 256; i10++) {
            this.zza[i10] = (byte) i10;
        }
        byte b10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            byte[] bArr2 = this.zza;
            byte b11 = bArr2[i11];
            b10 = (b10 + b11 + bArr[i11 % bArr.length]) & 255;
            bArr2[i11] = bArr2[b10];
            bArr2[b10] = b11;
        }
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zza(byte[] bArr) {
        int i10 = this.zzb;
        int i11 = this.zzc;
        for (int i12 = 0; i12 < 256; i12++) {
            byte[] bArr2 = this.zza;
            i10 = (i10 + 1) & 255;
            byte b10 = bArr2[i10];
            i11 = (i11 + b10) & 255;
            bArr2[i10] = bArr2[i11];
            bArr2[i11] = b10;
            bArr[i12] = (byte) (bArr2[(bArr2[i10] + b10) & 255] ^ bArr[i12]);
        }
        this.zzb = i10;
        this.zzc = i11;
    }
}
