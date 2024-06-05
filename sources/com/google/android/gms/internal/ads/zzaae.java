package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaae {
    public static zzbq zza(zzzv zzzv, boolean z10) throws IOException {
        zzbq zza = new zzaal().zza(zzzv, z10 ? null : zzado.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }

    public static zzaag zzb(zzen zzen) {
        zzen.zzG(1);
        int zzm = zzen.zzm();
        long zzc = (long) zzen.zzc();
        long j10 = (long) zzm;
        int i10 = zzm / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long zzr = zzen.zzr();
            if (zzr == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = zzr;
            jArr2[i11] = zzen.zzr();
            zzen.zzG(2);
            i11++;
        }
        zzen.zzG((int) ((zzc + j10) - ((long) zzen.zzc())));
        return new zzaag(jArr, jArr2);
    }
}
