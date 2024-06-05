package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public abstract class zzig extends zzhn {
    private static final Logger zzb = Logger.getLogger(zzig.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzc = zzmg.zzc();
    zzij zza;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
    private static class zza extends zzig {
        private final byte[] zzb;
        private final int zzc;
        private final int zzd;
        private int zze;

        zza(byte[] bArr, int i10, int i11) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            if ((i11 | 0 | (bArr.length - i11)) >= 0) {
                this.zzb = bArr;
                this.zzc = 0;
                this.zze = 0;
                this.zzd = i11;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i11)}));
        }

        private final void zzc(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.zzb, this.zze, i11);
                this.zze += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i11)}), e10);
            }
        }

        public final int zza() {
            return this.zzd - this.zze;
        }

        public final void zzb(byte[] bArr, int i10, int i11) throws IOException {
            zzc(i11);
            zzc(bArr, 0, i11);
        }

        public final void zzd(int i10, int i11) throws IOException {
            zzc(i10, 0);
            zzc(i11);
        }

        public final void zza(byte b10) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zze;
                this.zze = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1}), e10);
            }
        }

        public final void zzb(int i10, int i11) throws IOException {
            zzc(i10, 0);
            zzb(i11);
        }

        public final void zza(int i10, boolean z10) throws IOException {
            zzc(i10, 0);
            zza(z10 ? (byte) 1 : 0);
        }

        public final void zzb(int i10) throws IOException {
            if (i10 >= 0) {
                zzc(i10);
            } else {
                zzb((long) i10);
            }
        }

        public final void zzc(int i10, int i11) throws IOException {
            zzc((i10 << 3) | i11);
        }

        public final void zzc(int i10) throws IOException {
            while ((i10 & -128) != 0) {
                byte[] bArr = this.zzb;
                int i11 = this.zze;
                this.zze = i11 + 1;
                bArr[i11] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            }
            try {
                byte[] bArr2 = this.zzb;
                int i12 = this.zze;
                this.zze = i12 + 1;
                bArr2[i12] = (byte) i10;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1}), e10);
            }
        }

        public final void zza(int i10, zzhm zzhm) throws IOException {
            zzc(i10, 2);
            zza(zzhm);
        }

        public final void zzb(int i10, zzhm zzhm) throws IOException {
            zzc(1, 3);
            zzd(2, i10);
            zza(3, zzhm);
            zzc(1, 4);
        }

        public final void zza(zzhm zzhm) throws IOException {
            zzc(zzhm.zzb());
            zzhm.zza((zzhn) this);
        }

        public final void zza(int i10, int i11) throws IOException {
            zzc(i10, 5);
            zza(i11);
        }

        public final void zzb(int i10, long j10) throws IOException {
            zzc(i10, 0);
            zzb(j10);
        }

        public final void zza(int i10) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i11 = this.zze;
                int i12 = i11 + 1;
                this.zze = i12;
                bArr[i11] = (byte) i10;
                int i13 = i12 + 1;
                this.zze = i13;
                bArr[i12] = (byte) (i10 >> 8);
                int i14 = i13 + 1;
                this.zze = i14;
                bArr[i13] = (byte) (i10 >> 16);
                this.zze = i14 + 1;
                bArr[i14] = (byte) (i10 >>> 24);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1}), e10);
            }
        }

        public final void zzb(long j10) throws IOException {
            if (!zzig.zzc || zza() < 10) {
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.zzb;
                    int i10 = this.zze;
                    this.zze = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.zzb;
                    int i11 = this.zze;
                    this.zze = i11 + 1;
                    bArr2[i11] = (byte) ((int) j10);
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1}), e10);
                }
            } else {
                while ((j10 & -128) != 0) {
                    byte[] bArr3 = this.zzb;
                    int i12 = this.zze;
                    this.zze = i12 + 1;
                    zzmg.zza(bArr3, (long) i12, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr4 = this.zzb;
                int i13 = this.zze;
                this.zze = i13 + 1;
                zzmg.zza(bArr4, (long) i13, (byte) ((int) j10));
            }
        }

        public final void zza(int i10, long j10) throws IOException {
            zzc(i10, 1);
            zza(j10);
        }

        public final void zza(long j10) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zze;
                int i11 = i10 + 1;
                this.zze = i11;
                bArr[i10] = (byte) ((int) j10);
                int i12 = i11 + 1;
                this.zze = i12;
                bArr[i11] = (byte) ((int) (j10 >> 8));
                int i13 = i12 + 1;
                this.zze = i13;
                bArr[i12] = (byte) ((int) (j10 >> 16));
                int i14 = i13 + 1;
                this.zze = i14;
                bArr[i13] = (byte) ((int) (j10 >> 24));
                int i15 = i14 + 1;
                this.zze = i15;
                bArr[i14] = (byte) ((int) (j10 >> 32));
                int i16 = i15 + 1;
                this.zze = i16;
                bArr[i15] = (byte) ((int) (j10 >> 40));
                int i17 = i16 + 1;
                this.zze = i17;
                bArr[i16] = (byte) ((int) (j10 >> 48));
                this.zze = i17 + 1;
                bArr[i17] = (byte) ((int) (j10 >> 56));
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1}), e10);
            }
        }

        public final void zza(byte[] bArr, int i10, int i11) throws IOException {
            zzc(bArr, i10, i11);
        }

        /* access modifiers changed from: package-private */
        public final void zza(int i10, zzkj zzkj, zzlb zzlb) throws IOException {
            zzc(i10, 2);
            zzc(((zzhd) zzkj).zza(zzlb));
            zzlb.zza(zzkj, (zzmw) this.zza);
        }

        public final void zza(zzkj zzkj) throws IOException {
            zzc(zzkj.zzbw());
            zzkj.zza(this);
        }

        public final void zza(int i10, zzkj zzkj) throws IOException {
            zzc(1, 3);
            zzd(2, i10);
            zzc(3, 2);
            zza(zzkj);
            zzc(1, 4);
        }

        public final void zza(int i10, String str) throws IOException {
            zzc(i10, 2);
            zza(str);
        }

        public final void zza(String str) throws IOException {
            int i10 = this.zze;
            try {
                int zzj = zzig.zzj(str.length() * 3);
                int zzj2 = zzig.zzj(str.length());
                if (zzj2 == zzj) {
                    int i11 = i10 + zzj2;
                    this.zze = i11;
                    int zza = zzmh.zza(str, this.zzb, i11, zza());
                    this.zze = i10;
                    zzc((zza - i10) - zzj2);
                    this.zze = zza;
                    return;
                }
                zzc(zzmh.zza((CharSequence) str));
                this.zze = zzmh.zza(str, this.zzb, this.zze, zza());
            } catch (zzmk e10) {
                this.zze = i10;
                zza(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new zzb(e11);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        zzb(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    private zzig() {
    }

    public static int zza(double d10) {
        return 8;
    }

    public static int zza(float f10) {
        return 4;
    }

    public static int zza(boolean z10) {
        return 1;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    public static int zzb(int i10, boolean z10) {
        return zzj(i10 << 3) + 1;
    }

    public static int zzc(int i10, zzhm zzhm) {
        int zzj = zzj(i10 << 3);
        int zzb2 = zzhm.zzb();
        return zzj + zzj(zzb2) + zzb2;
    }

    public static int zzc(long j10) {
        return 8;
    }

    public static int zzd(int i10) {
        return zzf(i10);
    }

    public static int zze(int i10) {
        return 4;
    }

    public static int zze(int i10, int i11) {
        return zzj(i10 << 3) + zzf(i11);
    }

    public static int zze(long j10) {
        return 8;
    }

    public static int zzf(int i10, int i11) {
        return zzj(i10 << 3) + 4;
    }

    public static int zzg(int i10) {
        return 4;
    }

    public static int zzg(int i10, int i11) {
        return zzj(i10 << 3) + zzf(i11);
    }

    public static int zzg(long j10) {
        int i10;
        if ((-128 & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if ((-34359738368L & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        if ((-2097152 & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & -16384) != 0 ? i10 + 1 : i10;
    }

    public static int zzh(int i10, int i11) {
        return zzj(i10 << 3) + 4;
    }

    public static int zzi(int i10, int i11) {
        return zzj(i10 << 3) + zzj(zzl(i11));
    }

    private static long zzi(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int zzj(int i10) {
        if ((i10 & -128) == 0) {
            return 1;
        }
        if ((i10 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i10) == 0) {
            return 3;
        }
        return (i10 & -268435456) == 0 ? 4 : 5;
    }

    public static int zzj(int i10, int i11) {
        return zzj(i10 << 3) + zzj(i11);
    }

    private static int zzl(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b10) throws IOException;

    public abstract void zza(int i10) throws IOException;

    public abstract void zza(int i10, int i11) throws IOException;

    public abstract void zza(int i10, long j10) throws IOException;

    public abstract void zza(int i10, zzhm zzhm) throws IOException;

    public abstract void zza(int i10, zzkj zzkj) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void zza(int i10, zzkj zzkj, zzlb zzlb) throws IOException;

    public abstract void zza(int i10, String str) throws IOException;

    public abstract void zza(int i10, boolean z10) throws IOException;

    public abstract void zza(long j10) throws IOException;

    public abstract void zza(zzhm zzhm) throws IOException;

    public abstract void zza(zzkj zzkj) throws IOException;

    public abstract void zza(String str) throws IOException;

    public abstract void zzb(int i10) throws IOException;

    public abstract void zzb(int i10, int i11) throws IOException;

    public abstract void zzb(int i10, long j10) throws IOException;

    public abstract void zzb(int i10, zzhm zzhm) throws IOException;

    public abstract void zzb(long j10) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void zzb(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void zzc(int i10) throws IOException;

    public abstract void zzc(int i10, int i11) throws IOException;

    public abstract void zzd(int i10, int i11) throws IOException;

    public final void zzk(int i10, int i11) throws IOException {
        zzd(i10, zzl(i11));
    }

    public static int zzb(zzhm zzhm) {
        int zzb2 = zzhm.zzb();
        return zzj(zzb2) + zzb2;
    }

    public static int zzd(int i10, long j10) {
        return zzj(i10 << 3) + zzg(j10);
    }

    public static int zzf(int i10) {
        if (i10 >= 0) {
            return zzj(i10);
        }
        return 10;
    }

    public static int zzh(int i10) {
        return zzj(zzl(i10));
    }

    public final void zzk(int i10) throws IOException {
        zzc(zzl(i10));
    }

    public static int zza(int i10, double d10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zze(int i10, long j10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zzf(int i10, long j10) {
        return zzj(i10 << 3) + zzg(zzi(j10));
    }

    public static int zzg(int i10, long j10) {
        return zzj(i10 << 3) + zzg(j10);
    }

    public static int zzi(int i10) {
        return zzj(i10 << 3);
    }

    public final void zzh(int i10, long j10) throws IOException {
        zzb(i10, zzi(j10));
    }

    public static int zza(int i10, float f10) {
        return zzj(i10 << 3) + 4;
    }

    @Deprecated
    static int zzb(int i10, zzkj zzkj, zzlb zzlb) {
        return (zzj(i10 << 3) << 1) + ((zzhd) zzkj).zza(zzlb);
    }

    public static int zzc(int i10, long j10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zzd(long j10) {
        return zzg(j10);
    }

    public final void zzh(long j10) throws IOException {
        zzb(zzi(j10));
    }

    public static int zza(int i10, zzjn zzjn) {
        return (zzj(8) << 1) + zzj(2, i10) + zzb(3, zzjn);
    }

    static int zzc(int i10, zzkj zzkj, zzlb zzlb) {
        return zzj(i10 << 3) + zza(zzkj, zzlb);
    }

    public static int zzd(int i10, zzhm zzhm) {
        return (zzj(8) << 1) + zzj(2, i10) + zzc(3, zzhm);
    }

    public static int zzf(long j10) {
        return zzg(zzi(j10));
    }

    @Deprecated
    public static int zzb(zzkj zzkj) {
        return zzkj.zzbw();
    }

    public static int zzb(int i10, zzjn zzjn) {
        int zzj = zzj(i10 << 3);
        int zzb2 = zzjn.zzb();
        return zzj + zzj(zzb2) + zzb2;
    }

    public static int zzc(zzkj zzkj) {
        int zzbw = zzkj.zzbw();
        return zzj(zzbw) + zzbw;
    }

    public static int zza(zzjn zzjn) {
        int zzb2 = zzjn.zzb();
        return zzj(zzb2) + zzb2;
    }

    static int zza(zzkj zzkj, zzlb zzlb) {
        int zza2 = ((zzhd) zzkj).zza(zzlb);
        return zzj(zza2) + zza2;
    }

    public static int zzb(int i10, zzkj zzkj) {
        return (zzj(8) << 1) + zzj(2, i10) + zzj(24) + zzc(zzkj);
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, zzmk zzmk) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzmk);
        byte[] bytes = str.getBytes(zziz.zza);
        try {
            zzc(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzb(e10);
        }
    }

    public static int zzb(int i10, String str) {
        return zzj(i10 << 3) + zzb(str);
    }

    public static int zzb(String str) {
        int i10;
        try {
            i10 = zzmh.zza((CharSequence) str);
        } catch (zzmk unused) {
            i10 = str.getBytes(zziz.zza).length;
        }
        return zzj(i10) + i10;
    }

    public static zzig zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzb(boolean z10) throws IOException {
        zza(z10 ? (byte) 1 : 0);
    }

    public final void zzb(int i10, double d10) throws IOException {
        zza(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzb(double d10) throws IOException {
        zza(Double.doubleToRawLongBits(d10));
    }

    public final void zzb(int i10, float f10) throws IOException {
        zza(i10, Float.floatToRawIntBits(f10));
    }

    public final void zzb(float f10) throws IOException {
        zza(Float.floatToRawIntBits(f10));
    }
}
