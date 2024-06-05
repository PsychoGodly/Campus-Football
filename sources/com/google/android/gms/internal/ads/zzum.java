package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzum {
    private final Random zza;
    private final int[] zzb;
    private final int[] zzc;

    public zzum(int i10) {
        this(0, new Random());
    }

    public final int zza() {
        int[] iArr = this.zzb;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final int zzb() {
        int[] iArr = this.zzb;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int zzc() {
        return this.zzb.length;
    }

    public final int zzd(int i10) {
        int i11 = this.zzc[i10] + 1;
        int[] iArr = this.zzb;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    public final int zze(int i10) {
        int i11 = this.zzc[i10] - 1;
        if (i11 >= 0) {
            return this.zzb[i11];
        }
        return -1;
    }

    public final zzum zzf() {
        return new zzum(0, new Random(this.zza.nextLong()));
    }

    public final zzum zzg(int i10, int i11) {
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        int i12 = 0;
        int i13 = 0;
        while (i13 < i11) {
            iArr[i13] = this.zza.nextInt(this.zzb.length + 1);
            int i14 = i13 + 1;
            int nextInt = this.zza.nextInt(i14);
            iArr2[i13] = iArr2[nextInt];
            iArr2[nextInt] = i13;
            i13 = i14;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[(this.zzb.length + i11)];
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr4 = this.zzb;
            if (i12 >= iArr4.length + i11) {
                return new zzum(iArr3, new Random(this.zza.nextLong()));
            }
            if (i15 >= i11 || i16 != iArr[i15]) {
                int i17 = i16 + 1;
                int i18 = iArr4[i16];
                iArr3[i12] = i18;
                if (i18 >= 0) {
                    iArr3[i12] = i18 + i11;
                }
                i16 = i17;
            } else {
                iArr3[i12] = iArr2[i15];
                i15++;
            }
            i12++;
        }
    }

    public final zzum zzh(int i10, int i11) {
        int[] iArr = new int[(this.zzb.length - i11)];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr2 = this.zzb;
            if (i12 >= iArr2.length) {
                return new zzum(iArr, new Random(this.zza.nextLong()));
            }
            int i14 = iArr2[i12];
            if (i14 < 0 || i14 >= i11) {
                int i15 = i12 - i13;
                if (i14 >= 0) {
                    i14 -= i11;
                }
                iArr[i15] = i14;
            } else {
                i13++;
            }
            i12++;
        }
    }

    private zzum(int i10, Random random) {
        this(new int[0], random);
    }

    private zzum(int[] iArr, Random random) {
        this.zzb = iArr;
        this.zza = random;
        this.zzc = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.zzc[iArr[i10]] = i10;
        }
    }
}
