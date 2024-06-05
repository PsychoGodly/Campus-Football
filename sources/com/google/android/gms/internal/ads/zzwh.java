package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzwh extends zzwk {
    private zzwg zza;

    /* access modifiers changed from: protected */
    public abstract Pair zzb(zzwg zzwg, int[][][] iArr, int[] iArr2, zzss zzss, zzcn zzcn) throws zzhj;

    public final zzwl zzn(zzko[] zzkoArr, zzur zzur, zzss zzss, zzcn zzcn) throws zzhj {
        boolean z10;
        int[] iArr;
        zzur zzur2 = zzur;
        int[] iArr2 = new int[3];
        zzcp[][] zzcpArr = new zzcp[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = zzur2.zzc;
            zzcpArr[i10] = new zzcp[i11];
            iArr3[i10] = new int[i11][];
        }
        int i12 = 2;
        int[] iArr4 = new int[2];
        for (int i13 = 0; i13 < 2; i13++) {
            iArr4[i13] = zzkoArr[i13].zze();
        }
        int i14 = 0;
        while (i14 < zzur2.zzc) {
            zzcp zzb = zzur2.zzb(i14);
            int i15 = zzb.zzd;
            int i16 = 0;
            int i17 = 2;
            int i18 = 0;
            boolean z11 = true;
            while (i16 < i12) {
                zzko zzko = zzkoArr[i16];
                int i19 = 0;
                for (int i20 = 0; i20 <= 0; i20++) {
                    i19 = Math.max(i19, zzko.zzO(zzb.zzb(i20)) & 7);
                }
                boolean z12 = iArr2[i16] == 0;
                if (i19 > i18) {
                    z11 = z12;
                    i17 = i16;
                    i18 = i19;
                } else if (i19 == i18 && i15 == 5 && !z11 && z12) {
                    i17 = i16;
                    i18 = i19;
                    z11 = true;
                }
                i16++;
                i12 = 2;
            }
            if (i17 == i12) {
                iArr = new int[1];
            } else {
                zzko zzko2 = zzkoArr[i17];
                int[] iArr5 = new int[1];
                for (int i21 = 0; i21 <= 0; i21++) {
                    iArr5[i21] = zzko2.zzO(zzb.zzb(i21));
                }
                iArr = iArr5;
            }
            int i22 = iArr2[i17];
            zzcpArr[i17][i22] = zzb;
            iArr3[i17][i22] = iArr;
            iArr2[i17] = i22 + 1;
            i14++;
            i12 = 2;
        }
        zzur[] zzurArr = new zzur[i12];
        String[] strArr = new String[i12];
        int[] iArr6 = new int[i12];
        int i23 = 0;
        while (i23 < i12) {
            int i24 = iArr2[i23];
            zzurArr[i23] = new zzur((zzcp[]) zzew.zzaf(zzcpArr[i23], i24));
            iArr3[i23] = (int[][]) zzew.zzaf(iArr3[i23], i24);
            strArr[i23] = zzkoArr[i23].zzK();
            iArr6[i23] = zzkoArr[i23].zzb();
            i23++;
            i12 = 2;
        }
        zzwg zzwg = new zzwg(strArr, iArr6, zzurArr, iArr4, iArr3, new zzur((zzcp[]) zzew.zzaf(zzcpArr[2], iArr2[2])));
        Pair zzb2 = zzb(zzwg, iArr3, iArr4, zzss, zzcn);
        zzwi[] zzwiArr = (zzwi[]) zzb2.second;
        List[] listArr = new List[zzwiArr.length];
        for (int i25 = 0; i25 < zzwiArr.length; i25++) {
            zzwi zzwi = zzwiArr[i25];
            listArr[i25] = zzwi != null ? zzfqk.zzp(zzwi) : zzfqk.zzo();
        }
        zzfqh zzfqh = new zzfqh();
        for (int i26 = 0; i26 < 2; i26++) {
            zzur zzd = zzwg.zzd(i26);
            List list = listArr[i26];
            for (int i27 = 0; i27 < zzd.zzc; i27++) {
                zzcp zzb3 = zzd.zzb(i27);
                boolean z13 = zzwg.zza(i26, i27, false) != 0;
                int i28 = zzb3.zzb;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i29 = 0; i29 <= 0; i29++) {
                    iArr7[i29] = zzwg.zzb(i26, i27, i29) & 7;
                    int i30 = 0;
                    while (true) {
                        if (i30 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        zzwi zzwi2 = (zzwi) list.get(i30);
                        if (zzwi2.zze().equals(zzb3) && zzwi2.zzb(i29) != -1) {
                            z10 = true;
                            break;
                        }
                        i30++;
                    }
                    zArr[i29] = z10;
                }
                zzfqh.zzf(new zzcx(zzb3, z13, iArr7, zArr));
            }
        }
        zzur zze = zzwg.zze();
        for (int i31 = 0; i31 < zze.zzc; i31++) {
            zzcp zzb4 = zze.zzb(i31);
            int i32 = zzb4.zzb;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            zzfqh.zzf(new zzcx(zzb4, false, iArr8, new boolean[1]));
        }
        return new zzwl((zzkp[]) zzb2.first, (zzwe[]) zzb2.second, new zzcy(zzfqh.zzi()), zzwg);
    }

    public final void zzo(Object obj) {
        this.zza = (zzwg) obj;
    }
}
