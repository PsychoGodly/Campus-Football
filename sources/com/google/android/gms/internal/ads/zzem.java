package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzem {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzem() {
        this.zza = zzew.zzf;
    }

    public zzem(byte[] bArr, int i10) {
        this.zza = bArr;
        this.zzd = i10;
    }

    private final void zzo() {
        int i10;
        int i11 = this.zzb;
        boolean z10 = true;
        if (i11 < 0 || (i11 >= (i10 = this.zzd) && !(i11 == i10 && this.zzc == 0))) {
            z10 = false;
        }
        zzdl.zzf(z10);
    }

    public final int zza() {
        return ((this.zzd - this.zzb) * 8) - this.zzc;
    }

    public final int zzb() {
        zzdl.zzf(this.zzc == 0);
        return this.zzb;
    }

    public final int zzc() {
        return (this.zzb * 8) + this.zzc;
    }

    public final int zzd(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.zzc += i10;
        int i12 = 0;
        while (true) {
            i11 = this.zzc;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.zzc = i13;
            byte[] bArr = this.zza;
            int i14 = this.zzb;
            this.zzb = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.zza;
        int i15 = this.zzb;
        int i16 = i12 | ((bArr2[i15] & 255) >> (8 - i11));
        int i17 = 32 - i10;
        if (i11 == 8) {
            this.zzc = 0;
            this.zzb = i15 + 1;
        }
        int i18 = (-1 >>> i17) & i16;
        zzo();
        return i18;
    }

    public final void zze() {
        if (this.zzc != 0) {
            this.zzc = 0;
            this.zzb++;
            zzo();
        }
    }

    public final void zzf(int i10, int i11) {
        int min = Math.min(8 - this.zzc, 14);
        int i12 = this.zzc;
        int i13 = (8 - i12) - min;
        byte[] bArr = this.zza;
        int i14 = this.zzb;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = 14 - min;
        int i16 = i10 & 16383;
        bArr[i14] = (byte) (b10 | ((i16 >>> i15) << i13));
        int i17 = i14 + 1;
        while (i15 > 8) {
            i15 -= 8;
            this.zza[i17] = (byte) (i16 >>> i15);
            i17++;
        }
        int i18 = 8 - i15;
        byte[] bArr2 = this.zza;
        byte b11 = (byte) (bArr2[i17] & ((1 << i18) - 1));
        bArr2[i17] = b11;
        bArr2[i17] = (byte) (((i16 & ((1 << i15) - 1)) << i18) | b11);
        zzl(14);
        zzo();
    }

    public final void zzg(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = 0;
        while (true) {
            i12 = i11 >> 3;
            if (i13 >= i12) {
                break;
            }
            byte[] bArr2 = this.zza;
            int i14 = this.zzb;
            int i15 = i14 + 1;
            this.zzb = i15;
            byte b10 = bArr2[i14];
            int i16 = this.zzc;
            byte b11 = (byte) (b10 << i16);
            bArr[i13] = b11;
            bArr[i13] = (byte) (((bArr2[i15] & 255) >> (8 - i16)) | b11);
            i13++;
        }
        int i17 = i11 & 7;
        if (i17 != 0) {
            byte b12 = (byte) (bArr[i12] & (255 >> i17));
            bArr[i12] = b12;
            int i18 = this.zzc;
            if (i18 + i17 > 8) {
                byte[] bArr3 = this.zza;
                int i19 = this.zzb;
                this.zzb = i19 + 1;
                b12 = (byte) (b12 | ((bArr3[i19] & 255) << i18));
                bArr[i12] = b12;
                i18 -= 8;
            }
            int i20 = i18 + i17;
            this.zzc = i20;
            byte[] bArr4 = this.zza;
            int i21 = this.zzb;
            bArr[i12] = (byte) (((byte) (((255 & bArr4[i21]) >> (8 - i20)) << (8 - i17))) | b12);
            if (i20 == 8) {
                this.zzc = 0;
                this.zzb = i21 + 1;
            }
            zzo();
        }
    }

    public final void zzh(zzen zzen) {
        zzi(zzen.zzH(), zzen.zzd());
        zzj(zzen.zzc() * 8);
    }

    public final void zzi(byte[] bArr, int i10) {
        this.zza = bArr;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = i10;
    }

    public final void zzj(int i10) {
        int i11 = i10 / 8;
        this.zzb = i11;
        this.zzc = i10 - (i11 * 8);
        zzo();
    }

    public final void zzk() {
        int i10 = this.zzc + 1;
        this.zzc = i10;
        if (i10 == 8) {
            this.zzc = 0;
            this.zzb++;
        }
        zzo();
    }

    public final void zzl(int i10) {
        int i11 = i10 / 8;
        int i12 = this.zzb + i11;
        this.zzb = i12;
        int i13 = this.zzc + (i10 - (i11 * 8));
        this.zzc = i13;
        if (i13 > 7) {
            this.zzb = i12 + 1;
            this.zzc = i13 - 8;
        }
        zzo();
    }

    public final void zzm(int i10) {
        zzdl.zzf(this.zzc == 0);
        this.zzb += i10;
        zzo();
    }

    public final boolean zzn() {
        byte b10 = this.zza[this.zzb] & (128 >> this.zzc);
        zzk();
        return b10 != 0;
    }
}
