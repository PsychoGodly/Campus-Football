package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzauo {
    static long zza(long j10, int i10) {
        if (i10 == 1) {
            return j10;
        }
        return ((i10 & 1) == 0 ? zza((j10 * j10) % 1073807359, i10 >> 1) : j10 * (zza((j10 * j10) % 1073807359, i10 >> 1) % 1073807359)) % 1073807359;
    }

    static String zzb(String[] strArr, int i10, int i11) {
        int i12 = i11 + i10;
        if (strArr.length < i12) {
            zzbza.zzg("Unable to construct shingle");
            return MaxReward.DEFAULT_LABEL;
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i13 = i12 - 1;
            if (i10 < i13) {
                sb2.append(strArr[i10]);
                sb2.append(' ');
                i10++;
            } else {
                sb2.append(strArr[i13]);
                return sb2.toString();
            }
        }
    }

    public static void zzc(String[] strArr, int i10, int i11, PriorityQueue priorityQueue) {
        String[] strArr2 = strArr;
        int length = strArr2.length;
        int i12 = 6;
        if (length < 6) {
            zzd(i10, zze(strArr2, 0, length), zzb(strArr2, 0, length), length, priorityQueue);
            return;
        }
        long zze = zze(strArr2, 0, 6);
        zzd(i10, zze, zzb(strArr2, 0, 6), 6, priorityQueue);
        int i13 = 1;
        while (true) {
            int length2 = strArr2.length;
            if (i13 < length2 - 5) {
                String zzb = zzb(strArr2, i13, i12);
                zze = ((((((zze + 1073807359) - ((zza(16785407, 5) * ((((long) zzauk.zza(strArr2[i13 - 1])) + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) zzauk.zza(strArr2[i13 + 5])) + 2147483647L) % 1073807359)) % 1073807359;
                zzd(i10, zze, zzb, length2, priorityQueue);
                i13++;
                i12 = 6;
            } else {
                return;
            }
        }
    }

    static void zzd(int i10, long j10, String str, int i11, PriorityQueue priorityQueue) {
        zzaun zzaun = new zzaun(j10, str, i11);
        if ((priorityQueue.size() != i10 || (((zzaun) priorityQueue.peek()).zzc <= zzaun.zzc && ((zzaun) priorityQueue.peek()).zza <= zzaun.zza)) && !priorityQueue.contains(zzaun)) {
            priorityQueue.add(zzaun);
            if (priorityQueue.size() > i10) {
                priorityQueue.poll();
            }
        }
    }

    private static long zze(String[] strArr, int i10, int i11) {
        long zza = (((long) zzauk.zza(strArr[0])) + 2147483647L) % 1073807359;
        for (int i12 = 1; i12 < i11; i12++) {
            zza = (((zza * 16785407) % 1073807359) + ((((long) zzauk.zza(strArr[i12])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return zza;
    }
}
