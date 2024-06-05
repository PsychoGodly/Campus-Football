package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzahp implements zzahn {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzabb zzc;
    private final zzajc zzd;
    private final zzen zze;
    private final zzaic zzf;
    private final boolean[] zzg;
    private final zzaho zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzahp() {
        this((zzajc) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzen r21) {
        /*
            r20 = this;
            r0 = r20
            com.google.android.gms.internal.ads.zzabb r1 = r0.zzc
            com.google.android.gms.internal.ads.zzdl.zzb(r1)
            int r1 = r21.zzc()
            int r2 = r21.zzd()
            byte[] r3 = r21.zzH()
            long r4 = r0.zzi
            int r6 = r21.zza()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.zzi = r4
            com.google.android.gms.internal.ads.zzabb r4 = r0.zzc
            int r5 = r21.zza()
            r6 = r21
            r4.zzq(r6, r5)
        L_0x0028:
            boolean[] r4 = r0.zzg
            int r4 = com.google.android.gms.internal.ads.zzaar.zza(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0041
            boolean r4 = r0.zzk
            if (r4 != 0) goto L_0x0039
            com.google.android.gms.internal.ads.zzaho r4 = r0.zzh
            r4.zza(r3, r1, r2)
        L_0x0039:
            com.google.android.gms.internal.ads.zzaic r4 = r0.zzf
            if (r4 == 0) goto L_0x0040
            r4.zza(r3, r1, r2)
        L_0x0040:
            return
        L_0x0041:
            byte[] r5 = r21.zzH()
            int r7 = r4 + 3
            byte r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.zzk
            if (r9 != 0) goto L_0x0124
            if (r8 <= 0) goto L_0x0058
            com.google.android.gms.internal.ads.zzaho r9 = r0.zzh
            r9.zza(r3, r1, r4)
        L_0x0058:
            if (r8 >= 0) goto L_0x005c
            int r9 = -r8
            goto L_0x005d
        L_0x005c:
            r9 = 0
        L_0x005d:
            com.google.android.gms.internal.ads.zzaho r12 = r0.zzh
            boolean r9 = r12.zzc(r5, r9)
            if (r9 == 0) goto L_0x0124
            com.google.android.gms.internal.ads.zzaho r9 = r0.zzh
            java.lang.String r12 = r0.zzb
            java.util.Objects.requireNonNull(r12)
            byte[] r13 = r9.zzc
            int r14 = r9.zza
            byte[] r13 = java.util.Arrays.copyOf(r13, r14)
            r14 = 4
            byte r15 = r13[r14]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r16 = 5
            byte r10 = r13[r16]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r17 = 6
            byte r11 = r13[r17]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r17 = 7
            byte r14 = r13[r17]
            r14 = r14 & 240(0xf0, float:3.36E-43)
            r19 = r10 & 15
            r6 = 4
            int r15 = r15 << r6
            int r10 = r10 >> r6
            r10 = r10 | r15
            int r14 = r14 >> r6
            r15 = 8
            int r18 = r19 << 8
            r11 = r18 | r11
            r15 = 2
            if (r14 == r15) goto L_0x00ad
            r15 = 3
            if (r14 == r15) goto L_0x00a8
            if (r14 == r6) goto L_0x00a3
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00b4
        L_0x00a3:
            int r6 = r11 * 121
            int r14 = r10 * 100
            goto L_0x00b1
        L_0x00a8:
            int r6 = r11 * 16
            int r14 = r10 * 9
            goto L_0x00b1
        L_0x00ad:
            int r6 = r11 * 4
            int r14 = r10 * 3
        L_0x00b1:
            float r6 = (float) r6
            float r14 = (float) r14
            float r6 = r6 / r14
        L_0x00b4:
            com.google.android.gms.internal.ads.zzad r14 = new com.google.android.gms.internal.ads.zzad
            r14.<init>()
            r14.zzH(r12)
            java.lang.String r12 = "video/mpeg2"
            r14.zzS(r12)
            r14.zzX(r10)
            r14.zzF(r11)
            r14.zzP(r6)
            java.util.List r6 = java.util.Collections.singletonList(r13)
            r14.zzI(r6)
            com.google.android.gms.internal.ads.zzaf r6 = r14.zzY()
            byte r10 = r13[r17]
            r10 = r10 & 15
            int r10 = r10 + -1
            r11 = 0
            if (r10 < 0) goto L_0x0106
            r14 = 8
            if (r10 >= r14) goto L_0x0106
            double[] r11 = zza
            r10 = r11[r10]
            int r9 = r9.zzb
            int r9 = r9 + 9
            byte r9 = r13[r9]
            r12 = r9 & 96
            int r12 = r12 >> 5
            r9 = r9 & 31
            if (r12 == r9) goto L_0x00ff
            double r12 = (double) r12
            int r9 = r9 + 1
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r12 + r14
            double r14 = (double) r9
            double r12 = r12 / r14
            double r10 = r10 * r12
        L_0x00ff:
            r12 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r12 = r12 / r10
            long r11 = (long) r12
        L_0x0106:
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            android.util.Pair r6 = android.util.Pair.create(r6, r9)
            com.google.android.gms.internal.ads.zzabb r9 = r0.zzc
            java.lang.Object r10 = r6.first
            com.google.android.gms.internal.ads.zzaf r10 = (com.google.android.gms.internal.ads.zzaf) r10
            r9.zzk(r10)
            java.lang.Object r6 = r6.second
            java.lang.Long r6 = (java.lang.Long) r6
            long r9 = r6.longValue()
            r0.zzl = r9
            r6 = 1
            r0.zzk = r6
        L_0x0124:
            com.google.android.gms.internal.ads.zzaic r6 = r0.zzf
            r9 = 178(0xb2, float:2.5E-43)
            if (r6 == 0) goto L_0x016c
            if (r8 <= 0) goto L_0x0131
            r6.zza(r3, r1, r4)
            r1 = 0
            goto L_0x0132
        L_0x0131:
            int r1 = -r8
        L_0x0132:
            com.google.android.gms.internal.ads.zzaic r6 = r0.zzf
            boolean r1 = r6.zzd(r1)
            if (r1 == 0) goto L_0x0158
            com.google.android.gms.internal.ads.zzaic r1 = r0.zzf
            byte[] r6 = r1.zza
            int r1 = r1.zzb
            int r1 = com.google.android.gms.internal.ads.zzaar.zzb(r6, r1)
            com.google.android.gms.internal.ads.zzen r6 = r0.zze
            int r8 = com.google.android.gms.internal.ads.zzew.zza
            com.google.android.gms.internal.ads.zzaic r8 = r0.zzf
            byte[] r8 = r8.zza
            r6.zzD(r8, r1)
            com.google.android.gms.internal.ads.zzajc r1 = r0.zzd
            long r10 = r0.zzo
            com.google.android.gms.internal.ads.zzen r6 = r0.zze
            r1.zza(r10, r6)
        L_0x0158:
            if (r5 != r9) goto L_0x016c
            byte[] r1 = r21.zzH()
            int r5 = r4 + 2
            byte r1 = r1[r5]
            r5 = 1
            if (r1 != r5) goto L_0x016a
            com.google.android.gms.internal.ads.zzaic r1 = r0.zzf
            r1.zzc(r9)
        L_0x016a:
            r5 = 178(0xb2, float:2.5E-43)
        L_0x016c:
            if (r5 == 0) goto L_0x017e
            r1 = 179(0xb3, float:2.51E-43)
            if (r5 != r1) goto L_0x0173
            goto L_0x017e
        L_0x0173:
            r1 = 184(0xb8, float:2.58E-43)
            if (r5 != r1) goto L_0x017a
            r1 = 1
            r0.zzp = r1
        L_0x017a:
            r4 = r2
            r6 = r3
            goto L_0x01e5
        L_0x017e:
            int r1 = r2 - r4
            boolean r4 = r0.zzq
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x01ac
            boolean r4 = r0.zzk
            if (r4 == 0) goto L_0x01ac
            long r9 = r0.zzo
            int r4 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x01ac
            boolean r11 = r0.zzp
            long r12 = r0.zzi
            long r14 = r0.zzn
            long r12 = r12 - r14
            int r4 = (int) r12
            int r12 = r4 - r1
            com.google.android.gms.internal.ads.zzabb r8 = r0.zzc
            r14 = 0
            r13 = r1
            r4 = r2
            r6 = r3
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.zzs(r9, r11, r12, r13, r14)
            goto L_0x01af
        L_0x01ac:
            r4 = r2
            r6 = r3
            r2 = r14
        L_0x01af:
            boolean r8 = r0.zzj
            if (r8 == 0) goto L_0x01bb
            boolean r8 = r0.zzq
            if (r8 == 0) goto L_0x01b8
            goto L_0x01bb
        L_0x01b8:
            r1 = 0
            r2 = 1
            goto L_0x01de
        L_0x01bb:
            long r8 = r0.zzi
            long r10 = (long) r1
            long r8 = r8 - r10
            r0.zzn = r8
            long r14 = r0.zzm
            int r1 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x01c8
            goto L_0x01d4
        L_0x01c8:
            long r8 = r0.zzo
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x01d3
            long r10 = r0.zzl
            long r14 = r8 + r10
            goto L_0x01d4
        L_0x01d3:
            r14 = r2
        L_0x01d4:
            r0.zzo = r14
            r1 = 0
            r0.zzp = r1
            r0.zzm = r2
            r2 = 1
            r0.zzj = r2
        L_0x01de:
            if (r5 != 0) goto L_0x01e2
            r10 = 1
            goto L_0x01e3
        L_0x01e2:
            r10 = 0
        L_0x01e3:
            r0.zzq = r10
        L_0x01e5:
            r2 = r4
            r3 = r6
            r1 = r7
            r6 = r21
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahp.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    public final void zzb(zzzx zzzx, zzaiz zzaiz) {
        zzaiz.zzc();
        this.zzb = zzaiz.zzb();
        this.zzc = zzzx.zzv(zzaiz.zza(), 2);
        zzajc zzajc = this.zzd;
        if (zzajc != null) {
            zzajc.zzb(zzzx, zzaiz);
        }
    }

    public final void zzc() {
    }

    public final void zzd(long j10, int i10) {
        this.zzm = j10;
    }

    public final void zze() {
        zzaar.zze(this.zzg);
        this.zzh.zzb();
        zzaic zzaic = this.zzf;
        if (zzaic != null) {
            zzaic.zzb();
        }
        this.zzi = 0;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    zzahp(zzajc zzajc) {
        zzen zzen;
        this.zzd = zzajc;
        this.zzg = new boolean[4];
        this.zzh = new zzaho(128);
        if (zzajc != null) {
            this.zzf = new zzaic(178, 128);
            zzen = new zzen();
        } else {
            zzen = null;
            this.zzf = null;
        }
        this.zze = zzen;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }
}
