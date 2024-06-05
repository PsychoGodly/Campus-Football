package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzalh {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzalh(java.lang.String r14, com.google.android.gms.internal.ads.zzajx r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.zzb
            long r3 = r15.zzc
            long r5 = r15.zzd
            long r7 = r15.zze
            long r9 = r15.zzf
            java.util.List r0 = r15.zzh
            if (r0 == 0) goto L_0x0010
        L_0x000e:
            r11 = r0
            goto L_0x0044
        L_0x0010:
            java.util.Map r15 = r15.zzg
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x0023:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x000e
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.zzakg r11 = new com.google.android.gms.internal.ads.zzakg
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L_0x0023
        L_0x0044:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalh.<init>(java.lang.String, com.google.android.gms.internal.ads.zzajx):void");
    }

    static zzalh zza(zzali zzali) throws IOException {
        List list;
        if (zzalk.zze(zzali) == 538247942) {
            String zzh2 = zzalk.zzh(zzali);
            String zzh3 = zzalk.zzh(zzali);
            long zzf2 = zzalk.zzf(zzali);
            long zzf3 = zzalk.zzf(zzali);
            long zzf4 = zzalk.zzf(zzali);
            long zzf5 = zzalk.zzf(zzali);
            int zze2 = zzalk.zze(zzali);
            if (zze2 >= 0) {
                if (zze2 == 0) {
                    list = Collections.emptyList();
                } else {
                    list = new ArrayList();
                }
                List list2 = list;
                for (int i10 = 0; i10 < zze2; i10++) {
                    list2.add(new zzakg(zzalk.zzh(zzali).intern(), zzalk.zzh(zzali).intern()));
                }
                return new zzalh(zzh2, zzh3, zzf2, zzf3, zzf4, zzf5, list2);
            }
            throw new IOException("readHeaderList size=" + zze2);
        }
        throw new IOException();
    }

    private zzalh(String str, String str2, long j10, long j11, long j12, long j13, List list) {
        this.zzb = str;
        this.zzc = true == MaxReward.DEFAULT_LABEL.equals(str2) ? null : str2;
        this.zzd = j10;
        this.zze = j11;
        this.zzf = j12;
        this.zzg = j13;
        this.zzh = list;
    }
}