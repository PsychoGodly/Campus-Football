package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzuy extends zzva {
    private final zzws zzd;
    private final zzfqk zze;
    private final zzdm zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected zzuy(zzcp zzcp, int[] iArr, int i10, zzws zzws, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List list, zzdm zzdm) {
        super(zzcp, iArr, 0);
        zzcp zzcp2 = zzcp;
        int[] iArr2 = iArr;
        this.zzd = zzws;
        this.zze = zzfqk.zzm(list);
        this.zzf = zzdm;
    }

    static /* bridge */ /* synthetic */ zzfqk zzf(zzwd[] zzwdArr) {
        int i10;
        int i11;
        double d10;
        ArrayList arrayList = new ArrayList();
        char c10 = 0;
        int i12 = 0;
        while (true) {
            i10 = 2;
            i11 = 1;
            if (i12 >= 2) {
                break;
            }
            zzwd zzwd = zzwdArr[i12];
            if (zzwd == null || zzwd.zzb.length <= 1) {
                arrayList.add((Object) null);
            } else {
                zzfqh zzi = zzfqk.zzi();
                zzi.zzf(new zzuw(0, 0));
                arrayList.add(zzi);
            }
            i12++;
        }
        long[][] jArr = new long[2][];
        for (int i13 = 0; i13 < 2; i13++) {
            zzwd zzwd2 = zzwdArr[i13];
            if (zzwd2 == null) {
                jArr[i13] = new long[0];
            } else {
                jArr[i13] = new long[zzwd2.zzb.length];
                int i14 = 0;
                while (true) {
                    int[] iArr = zzwd2.zzb;
                    if (i14 >= iArr.length) {
                        break;
                    }
                    long j10 = (long) zzwd2.zza.zzb(iArr[i14]).zzi;
                    long[] jArr2 = jArr[i13];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i14] = j10;
                    i14++;
                }
                Arrays.sort(jArr[i13]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i15 = 0; i15 < 2; i15++) {
            long[] jArr4 = jArr[i15];
            jArr3[i15] = jArr4.length == 0 ? 0 : jArr4[0];
        }
        zzg(arrayList, jArr3);
        zzfqv zza = zzfrn.zzc(zzfrs.zzc()).zzb(2).zza();
        int i16 = 0;
        while (i16 < i10) {
            int length = jArr[i16].length;
            if (length > i11) {
                double[] dArr = new double[length];
                int i17 = 0;
                while (true) {
                    long[] jArr5 = jArr[i16];
                    double d11 = 0.0d;
                    if (i17 >= jArr5.length) {
                        break;
                    }
                    long j11 = jArr5[i17];
                    if (j11 != -1) {
                        d11 = Math.log((double) j11);
                    }
                    dArr[i17] = d11;
                    i17++;
                }
                int i18 = length - 1;
                double d12 = dArr[i18] - dArr[c10];
                int i19 = 0;
                while (i19 < i18) {
                    double d13 = dArr[i19];
                    i19++;
                    double d14 = d13 + dArr[i19];
                    if (d12 == 0.0d) {
                        d10 = 1.0d;
                    } else {
                        d10 = ((d14 * 0.5d) - dArr[c10]) / d12;
                    }
                    zza.zzs(Double.valueOf(d10), Integer.valueOf(i16));
                    c10 = 0;
                }
            }
            i16++;
            c10 = 0;
            i10 = 2;
            i11 = 1;
        }
        zzfqk zzm = zzfqk.zzm(zza.zzt());
        for (int i20 = 0; i20 < zzm.size(); i20++) {
            int intValue = ((Integer) zzm.get(i20)).intValue();
            int i21 = iArr2[intValue] + 1;
            iArr2[intValue] = i21;
            jArr3[intValue] = jArr[intValue][i21];
            zzg(arrayList, jArr3);
        }
        for (int i22 = 0; i22 < 2; i22++) {
            if (arrayList.get(i22) != null) {
                long j12 = jArr3[i22];
                jArr3[i22] = j12 + j12;
            }
        }
        zzg(arrayList, jArr3);
        zzfqh zzi2 = zzfqk.zzi();
        for (int i23 = 0; i23 < arrayList.size(); i23++) {
            zzfqh zzfqh = (zzfqh) arrayList.get(i23);
            zzi2.zzf(zzfqh == null ? zzfqk.zzo() : zzfqh.zzi());
        }
        return zzi2.zzi();
    }

    private static void zzg(List list, long[] jArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            j10 += jArr[i10];
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzfqh zzfqh = (zzfqh) list.get(i11);
            if (zzfqh != null) {
                zzfqh.zzf(new zzuw(j10, jArr[i11]));
            }
        }
    }
}
