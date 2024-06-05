package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzfh extends zzfk {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    zzfh(byte[] bArr, int i10, int i11) {
        super((zzfj) null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i11) | i11) >= 0) {
            this.zzc = bArr;
            this.zze = 0;
            this.zzd = i11;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i11)}));
    }

    public final int zza() {
        return this.zzd - this.zze;
    }

    public final void zzb(byte b10) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i10 = this.zze;
            this.zze = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzfi(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1}), e10);
        }
    }

    public final void zzc(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i11);
            this.zze += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzfi(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i11)}), e10);
        }
    }

    public final void zzd(int i10, boolean z10) throws IOException {
        zzq(i10 << 3);
        zzb(z10 ? (byte) 1 : 0);
    }

    public final void zze(int i10, zzez zzez) throws IOException {
        zzq((i10 << 3) | 2);
        zzq(zzez.zzd());
        zzez.zzi(this);
    }

    public final void zzf(int i10, int i11) throws IOException {
        zzq((i10 << 3) | 5);
        zzg(i11);
    }

    public final void zzg(int i10) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i11 = this.zze;
            int i12 = i11 + 1;
            this.zze = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            this.zze = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            this.zze = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.zze = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzfi(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1}), e10);
        }
    }

    public final void zzh(int i10, long j10) throws IOException {
        zzq((i10 << 3) | 1);
        zzi(j10);
    }

    public final void zzi(long j10) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i10 = this.zze;
            int i11 = i10 + 1;
            this.zze = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i11 + 1;
            this.zze = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i12 + 1;
            this.zze = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i13 + 1;
            this.zze = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i14 + 1;
            this.zze = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            this.zze = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            this.zze = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.zze = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzfi(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1}), e10);
        }
    }

    public final void zzj(int i10, int i11) throws IOException {
        zzq(i10 << 3);
        zzk(i11);
    }

    public final void zzk(int i10) throws IOException {
        if (i10 >= 0) {
            zzq(i10);
        } else {
            zzs((long) i10);
        }
    }

    public final void zzl(byte[] bArr, int i10, int i11) throws IOException {
        zzc(bArr, 0, i11);
    }

    public final void zzm(int i10, String str) throws IOException {
        zzq((i10 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws IOException {
        int i10 = this.zze;
        try {
            int zzy = zzfk.zzy(str.length() * 3);
            int zzy2 = zzfk.zzy(str.length());
            if (zzy2 == zzy) {
                int i11 = i10 + zzy2;
                this.zze = i11;
                int zzb = zzju.zzb(str, this.zzc, i11, this.zzd - i11);
                this.zze = i10;
                zzq((zzb - i10) - zzy2);
                this.zze = zzb;
                return;
            }
            zzq(zzju.zzc(str));
            byte[] bArr = this.zzc;
            int i12 = this.zze;
            this.zze = zzju.zzb(str, bArr, i12, this.zzd - i12);
        } catch (zzjt e10) {
            this.zze = i10;
            zzC(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzfi(e11);
        }
    }

    public final void zzo(int i10, int i11) throws IOException {
        zzq((i10 << 3) | i11);
    }

    public final void zzp(int i10, int i11) throws IOException {
        zzq(i10 << 3);
        zzq(i11);
    }

    public final void zzq(int i10) throws IOException {
        while ((i10 & -128) != 0) {
            byte[] bArr = this.zzc;
            int i11 = this.zze;
            this.zze = i11 + 1;
            bArr[i11] = (byte) ((i10 & 127) | 128);
            i10 >>>= 7;
        }
        try {
            byte[] bArr2 = this.zzc;
            int i12 = this.zze;
            this.zze = i12 + 1;
            bArr2[i12] = (byte) i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzfi(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1}), e10);
        }
    }

    public final void zzr(int i10, long j10) throws IOException {
        zzq(i10 << 3);
        zzs(j10);
    }

    public final void zzs(long j10) throws IOException {
        if (!zzfk.zzd || this.zzd - this.zze < 10) {
            while ((j10 & -128) != 0) {
                byte[] bArr = this.zzc;
                int i10 = this.zze;
                this.zze = i10 + 1;
                bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
            try {
                byte[] bArr2 = this.zzc;
                int i11 = this.zze;
                this.zze = i11 + 1;
                bArr2[i11] = (byte) ((int) j10);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzfi(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1}), e10);
            }
        } else {
            while ((j10 & -128) != 0) {
                byte[] bArr3 = this.zzc;
                int i12 = this.zze;
                this.zze = i12 + 1;
                zzjp.zzn(bArr3, (long) i12, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.zzc;
            int i13 = this.zze;
            this.zze = i13 + 1;
            zzjp.zzn(bArr4, (long) i13, (byte) ((int) j10));
        }
    }
}
