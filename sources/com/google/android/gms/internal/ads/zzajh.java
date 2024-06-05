package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzajh implements zzzu {
    public static final zzaab zza = zzajd.zza;
    private zzzx zzb;
    private zzabb zzc;
    private int zzd = 0;
    private long zze = -1;
    private zzajf zzf;
    private int zzg = -1;
    private long zzh = -1;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e9, code lost:
        if (r1 != 65534) goto L_0x00eb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzzv r19, com.google.android.gms.internal.ads.zzaau r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.google.android.gms.internal.ads.zzabb r2 = r0.zzc
            com.google.android.gms.internal.ads.zzdl.zzb(r2)
            int r2 = com.google.android.gms.internal.ads.zzew.zza
            int r2 = r0.zzd
            r3 = -1
            r4 = 4
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0159
            r7 = 2
            r8 = -1
            if (r2 == r5) goto L_0x0124
            r10 = 3
            if (r2 == r7) goto L_0x00a2
            if (r2 == r10) goto L_0x003c
            long r10 = r0.zzh
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r5 = 0
        L_0x0025:
            com.google.android.gms.internal.ads.zzdl.zzf(r5)
            long r4 = r0.zzh
            long r7 = r19.zzf()
            long r4 = r4 - r7
            com.google.android.gms.internal.ads.zzajf r2 = r0.zzf
            java.util.Objects.requireNonNull(r2)
            boolean r1 = r2.zzc(r1, r4)
            if (r1 == 0) goto L_0x003b
            return r3
        L_0x003b:
            return r6
        L_0x003c:
            android.util.Pair r2 = com.google.android.gms.internal.ads.zzajk.zza(r19)
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            int r3 = r3.intValue()
            r0.zzg = r3
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r10 = r0.zze
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x0062
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x0062
            r2 = r10
        L_0x0062:
            int r5 = r0.zzg
            long r10 = (long) r5
            long r10 = r10 + r2
            r0.zzh = r10
            long r1 = r19.zzd()
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x0095
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0095
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Data exceeds input length: "
            r3.append(r5)
            r3.append(r10)
            java.lang.String r5 = ", "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "WavExtractor"
            com.google.android.gms.internal.ads.zzee.zze(r5, r3)
            r0.zzh = r1
            r10 = r1
        L_0x0095:
            com.google.android.gms.internal.ads.zzajf r1 = r0.zzf
            java.util.Objects.requireNonNull(r1)
            int r2 = r0.zzg
            r1.zza(r2, r10)
            r0.zzd = r4
            return r6
        L_0x00a2:
            com.google.android.gms.internal.ads.zzaji r15 = com.google.android.gms.internal.ads.zzajk.zzb(r19)
            int r1 = r15.zza
            r2 = 17
            if (r1 != r2) goto L_0x00b8
            com.google.android.gms.internal.ads.zzaje r1 = new com.google.android.gms.internal.ads.zzaje
            com.google.android.gms.internal.ads.zzzx r2 = r0.zzb
            com.google.android.gms.internal.ads.zzabb r3 = r0.zzc
            r1.<init>(r2, r3, r15)
            r0.zzf = r1
            goto L_0x010b
        L_0x00b8:
            r2 = 6
            if (r1 != r2) goto L_0x00cc
            com.google.android.gms.internal.ads.zzajg r1 = new com.google.android.gms.internal.ads.zzajg
            com.google.android.gms.internal.ads.zzzx r13 = r0.zzb
            com.google.android.gms.internal.ads.zzabb r14 = r0.zzc
            r17 = -1
            java.lang.String r16 = "audio/g711-alaw"
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.zzf = r1
            goto L_0x010b
        L_0x00cc:
            r2 = 7
            if (r1 != r2) goto L_0x00e0
            com.google.android.gms.internal.ads.zzajg r1 = new com.google.android.gms.internal.ads.zzajg
            com.google.android.gms.internal.ads.zzzx r13 = r0.zzb
            com.google.android.gms.internal.ads.zzabb r14 = r0.zzc
            r17 = -1
            java.lang.String r16 = "audio/g711-mlaw"
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.zzf = r1
            goto L_0x010b
        L_0x00e0:
            int r2 = r15.zze
            if (r1 == r5) goto L_0x00f5
            if (r1 == r10) goto L_0x00ee
            r3 = 65534(0xfffe, float:9.1833E-41)
            if (r1 == r3) goto L_0x00f5
        L_0x00eb:
            r17 = 0
            goto L_0x00fb
        L_0x00ee:
            r3 = 32
            if (r2 != r3) goto L_0x00eb
            r17 = 4
            goto L_0x00fb
        L_0x00f5:
            int r4 = com.google.android.gms.internal.ads.zzew.zzn(r2)
            r17 = r4
        L_0x00fb:
            if (r17 == 0) goto L_0x010e
            com.google.android.gms.internal.ads.zzajg r1 = new com.google.android.gms.internal.ads.zzajg
            com.google.android.gms.internal.ads.zzzx r13 = r0.zzb
            com.google.android.gms.internal.ads.zzabb r14 = r0.zzc
            java.lang.String r16 = "audio/raw"
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.zzf = r1
        L_0x010b:
            r0.zzd = r10
            return r6
        L_0x010e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported WAV format type: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zzc(r1)
            throw r1
        L_0x0124:
            com.google.android.gms.internal.ads.zzen r2 = new com.google.android.gms.internal.ads.zzen
            r3 = 8
            r2.<init>((int) r3)
            com.google.android.gms.internal.ads.zzajj r4 = com.google.android.gms.internal.ads.zzajj.zza(r1, r2)
            int r5 = r4.zza
            r10 = 1685272116(0x64733634, float:1.7945858E22)
            if (r5 == r10) goto L_0x013a
            r19.zzj()
            goto L_0x0154
        L_0x013a:
            com.google.android.gms.internal.ads.zzzk r1 = (com.google.android.gms.internal.ads.zzzk) r1
            r1.zzl(r3, r6)
            r2.zzF(r6)
            byte[] r5 = r2.zzH()
            r1.zzm(r5, r6, r3, r6)
            long r8 = r2.zzp()
            long r4 = r4.zzb
            int r2 = (int) r4
            int r2 = r2 + r3
            r1.zzo(r2, r6)
        L_0x0154:
            r0.zze = r8
            r0.zzd = r7
            return r6
        L_0x0159:
            long r7 = r19.zzf()
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0165
            r2 = 1
            goto L_0x0166
        L_0x0165:
            r2 = 0
        L_0x0166:
            com.google.android.gms.internal.ads.zzdl.zzf(r2)
            int r2 = r0.zzg
            if (r2 == r3) goto L_0x0175
            com.google.android.gms.internal.ads.zzzk r1 = (com.google.android.gms.internal.ads.zzzk) r1
            r1.zzo(r2, r6)
            r0.zzd = r4
            goto L_0x018c
        L_0x0175:
            boolean r2 = com.google.android.gms.internal.ads.zzajk.zzc(r19)
            if (r2 == 0) goto L_0x018d
            long r2 = r19.zze()
            long r7 = r19.zzf()
            long r2 = r2 - r7
            com.google.android.gms.internal.ads.zzzk r1 = (com.google.android.gms.internal.ads.zzzk) r1
            int r3 = (int) r2
            r1.zzo(r3, r6)
            r0.zzd = r5
        L_0x018c:
            return r6
        L_0x018d:
            r1 = 0
            java.lang.String r2 = "Unsupported or unrecognized wav file type."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zza(r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajh.zza(com.google.android.gms.internal.ads.zzzv, com.google.android.gms.internal.ads.zzaau):int");
    }

    public final void zzb(zzzx zzzx) {
        this.zzb = zzzx;
        this.zzc = zzzx.zzv(0, 1);
        zzzx.zzC();
    }

    public final void zzc(long j10, long j11) {
        this.zzd = j10 == 0 ? 0 : 4;
        zzajf zzajf = this.zzf;
        if (zzajf != null) {
            zzajf.zzb(j11);
        }
    }

    public final boolean zzd(zzzv zzzv) throws IOException {
        return zzajk.zzc(zzzv);
    }
}
