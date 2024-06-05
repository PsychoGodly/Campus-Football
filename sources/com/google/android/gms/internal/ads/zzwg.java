package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzwg {
    private final String[] zza;
    private final int[] zzb;
    private final zzur[] zzc;
    private final int[] zzd;
    private final int[][][] zze;
    private final zzur zzf;

    zzwg(String[] strArr, int[] iArr, zzur[] zzurArr, int[] iArr2, int[][][] iArr3, zzur zzur) {
        this.zza = strArr;
        this.zzb = iArr;
        this.zzc = zzurArr;
        this.zze = iArr3;
        this.zzd = iArr2;
        this.zzf = zzur;
    }

    public final int zza(int i10, int i11, boolean z10) {
        int i12 = this.zzc[i10].zzb(i11).zzb;
        int[] iArr = new int[1];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 <= 0; i15++) {
            if ((this.zze[i10][i11][i15] & 7) == 4) {
                iArr[i14] = i15;
                i14++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i14);
        String str = null;
        boolean z11 = false;
        int i16 = 0;
        int i17 = 16;
        while (i13 < copyOf.length) {
            String str2 = this.zzc[i10].zzb(i11).zzb(copyOf[i13]).zzm;
            int i18 = i16 + 1;
            if (i16 == 0) {
                str = str2;
            } else {
                z11 |= !zzew.zzU(str, str2);
            }
            i17 = Math.min(i17, this.zze[i10][i11][i13] & 24);
            i13++;
            i16 = i18;
        }
        return z11 ? Math.min(i17, this.zzd[i10]) : i17;
    }

    public final int zzb(int i10, int i11, int i12) {
        return this.zze[i10][i11][i12];
    }

    public final int zzc(int i10) {
        return this.zzb[i10];
    }

    public final zzur zzd(int i10) {
        return this.zzc[i10];
    }

    public final zzur zze() {
        return this.zzf;
    }
}
