package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzahy implements zzahn {
    private final zzaio zza;
    private String zzb;
    private zzabb zzc;
    private zzahx zzd;
    private boolean zze;
    private final boolean[] zzf = new boolean[3];
    private final zzaic zzg = new zzaic(32, 128);
    private final zzaic zzh = new zzaic(33, 128);
    private final zzaic zzi = new zzaic(34, 128);
    private final zzaic zzj = new zzaic(39, 128);
    private final zzaic zzk = new zzaic(40, 128);
    private long zzl;
    private long zzm = -9223372036854775807L;
    private final zzen zzn = new zzen();

    public zzahy(zzaio zzaio) {
        this.zza = zzaio;
    }

    private final void zzf(byte[] bArr, int i10, int i11) {
        this.zzd.zzb(bArr, i10, i11);
        if (!this.zze) {
            this.zzg.zza(bArr, i10, i11);
            this.zzh.zza(bArr, i10, i11);
            this.zzi.zza(bArr, i10, i11);
        }
        this.zzj.zza(bArr, i10, i11);
        this.zzk.zza(bArr, i10, i11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:150:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzen r38) {
        /*
            r37 = this;
            r0 = r37
            com.google.android.gms.internal.ads.zzabb r1 = r0.zzc
            com.google.android.gms.internal.ads.zzdl.zzb(r1)
            int r1 = com.google.android.gms.internal.ads.zzew.zza
        L_0x0009:
            int r1 = r38.zza()
            if (r1 <= 0) goto L_0x03cb
            int r1 = r38.zzc()
            int r2 = r38.zzd()
            byte[] r3 = r38.zzH()
            long r4 = r0.zzl
            int r6 = r38.zza()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.zzl = r4
            com.google.android.gms.internal.ads.zzabb r4 = r0.zzc
            int r5 = r38.zza()
            r6 = r38
            r4.zzq(r6, r5)
        L_0x0030:
            if (r1 >= r2) goto L_0x0009
            boolean[] r4 = r0.zzf
            int r4 = com.google.android.gms.internal.ads.zzaar.zza(r3, r1, r2, r4)
            if (r4 == r2) goto L_0x03c8
            int r5 = r4 + 3
            byte r7 = r3[r5]
            r7 = r7 & 126(0x7e, float:1.77E-43)
            int r8 = r4 - r1
            if (r8 <= 0) goto L_0x0047
            r0.zzf(r3, r1, r4)
        L_0x0047:
            int r12 = r2 - r4
            long r9 = r0.zzl
            long r13 = (long) r12
            long r10 = r9 - r13
            if (r8 >= 0) goto L_0x0052
            int r4 = -r8
            goto L_0x0053
        L_0x0052:
            r4 = 0
        L_0x0053:
            long r8 = r0.zzm
            com.google.android.gms.internal.ads.zzahx r13 = r0.zzd
            boolean r14 = r0.zze
            r13.zza(r10, r12, r14)
            boolean r13 = r0.zze
            if (r13 != 0) goto L_0x0332
            com.google.android.gms.internal.ads.zzaic r13 = r0.zzg
            r13.zzd(r4)
            com.google.android.gms.internal.ads.zzaic r13 = r0.zzh
            r13.zzd(r4)
            com.google.android.gms.internal.ads.zzaic r13 = r0.zzi
            r13.zzd(r4)
            com.google.android.gms.internal.ads.zzaic r13 = r0.zzg
            boolean r16 = r13.zze()
            if (r16 == 0) goto L_0x0332
            com.google.android.gms.internal.ads.zzaic r15 = r0.zzh
            boolean r17 = r15.zze()
            if (r17 == 0) goto L_0x0332
            com.google.android.gms.internal.ads.zzaic r14 = r0.zzi
            boolean r18 = r14.zze()
            if (r18 == 0) goto L_0x0332
            com.google.android.gms.internal.ads.zzabb r1 = r0.zzc
            r19 = r5
            java.lang.String r5 = r0.zzb
            int r6 = r13.zzb
            r20 = r2
            int r2 = r15.zzb
            int r2 = r2 + r6
            r21 = r3
            int r3 = r14.zzb
            int r2 = r2 + r3
            byte[] r2 = new byte[r2]
            byte[] r3 = r13.zza
            r22 = r12
            r12 = 0
            java.lang.System.arraycopy(r3, r12, r2, r12, r6)
            byte[] r3 = r15.zza
            int r6 = r13.zzb
            r23 = r10
            int r10 = r15.zzb
            java.lang.System.arraycopy(r3, r12, r2, r6, r10)
            byte[] r3 = r14.zza
            int r6 = r13.zzb
            int r10 = r15.zzb
            int r6 = r6 + r10
            int r10 = r14.zzb
            java.lang.System.arraycopy(r3, r12, r2, r6, r10)
            com.google.android.gms.internal.ads.zzaat r3 = new com.google.android.gms.internal.ads.zzaat
            byte[] r6 = r15.zza
            int r10 = r15.zzb
            r3.<init>(r6, r12, r10)
            r6 = 44
            r3.zze(r6)
            r6 = 3
            int r10 = r3.zza(r6)
            r3.zzd()
            r11 = 2
            int r25 = r3.zza(r11)
            boolean r26 = r3.zzf()
            r13 = 5
            int r27 = r3.zza(r13)
            r13 = 0
            r28 = 0
        L_0x00e1:
            r14 = 32
            if (r13 >= r14) goto L_0x00f3
            boolean r14 = r3.zzf()
            if (r14 == 0) goto L_0x00f0
            r14 = 1
            int r15 = r14 << r13
            r28 = r28 | r15
        L_0x00f0:
            int r13 = r13 + 1
            goto L_0x00e1
        L_0x00f3:
            r13 = 6
            int[] r14 = new int[r13]
            r15 = 0
        L_0x00f7:
            r12 = 8
            if (r15 >= r13) goto L_0x0104
            int r12 = r3.zza(r12)
            r14[r15] = r12
            int r15 = r15 + 1
            goto L_0x00f7
        L_0x0104:
            int r30 = r3.zza(r12)
            r12 = 0
            r15 = 0
        L_0x010a:
            if (r15 >= r10) goto L_0x011f
            boolean r31 = r3.zzf()
            if (r31 == 0) goto L_0x0114
            int r12 = r12 + 89
        L_0x0114:
            boolean r31 = r3.zzf()
            if (r31 == 0) goto L_0x011c
            int r12 = r12 + 8
        L_0x011c:
            int r15 = r15 + 1
            goto L_0x010a
        L_0x011f:
            r3.zze(r12)
            if (r10 <= 0) goto L_0x012a
            int r12 = 8 - r10
            int r12 = r12 + r12
            r3.zze(r12)
        L_0x012a:
            r3.zzc()
            int r12 = r3.zzc()
            if (r12 != r6) goto L_0x0137
            r3.zzd()
            r12 = 3
        L_0x0137:
            int r15 = r3.zzc()
            int r31 = r3.zzc()
            boolean r32 = r3.zzf()
            if (r32 == 0) goto L_0x0172
            int r32 = r3.zzc()
            int r33 = r3.zzc()
            int r34 = r3.zzc()
            int r35 = r3.zzc()
            r6 = 1
            if (r12 == r6) goto L_0x015f
            if (r12 != r11) goto L_0x015c
            r12 = 2
            goto L_0x015f
        L_0x015c:
            r36 = 1
            goto L_0x0161
        L_0x015f:
            r36 = 2
        L_0x0161:
            if (r12 != r6) goto L_0x0165
            r6 = 2
            goto L_0x0166
        L_0x0165:
            r6 = 1
        L_0x0166:
            int r32 = r32 + r33
            int r36 = r36 * r32
            int r15 = r15 - r36
            int r34 = r34 + r35
            int r6 = r6 * r34
            int r31 = r31 - r6
        L_0x0172:
            r3.zzc()
            r3.zzc()
            int r6 = r3.zzc()
            boolean r12 = r3.zzf()
            r11 = 1
            if (r11 == r12) goto L_0x0185
            r11 = r10
            goto L_0x0186
        L_0x0185:
            r11 = 0
        L_0x0186:
            if (r11 > r10) goto L_0x0194
            r3.zzc()
            r3.zzc()
            r3.zzc()
            int r11 = r11 + 1
            goto L_0x0186
        L_0x0194:
            r3.zzc()
            r3.zzc()
            r3.zzc()
            r3.zzc()
            r3.zzc()
            r3.zzc()
            boolean r10 = r3.zzf()
            r11 = 4
            if (r10 == 0) goto L_0x01f8
            boolean r10 = r3.zzf()
            if (r10 == 0) goto L_0x01f8
            r10 = 0
        L_0x01b4:
            if (r10 >= r11) goto L_0x01f8
            r12 = 0
        L_0x01b7:
            if (r12 >= r13) goto L_0x01ee
            boolean r33 = r3.zzf()
            if (r33 != 0) goto L_0x01c6
            r3.zzc()
            r36 = r7
        L_0x01c4:
            r7 = 3
            goto L_0x01e3
        L_0x01c6:
            r13 = 64
            int r34 = r10 + r10
            int r34 = r34 + 4
            r36 = r7
            r11 = 1
            int r7 = r11 << r34
            int r7 = java.lang.Math.min(r13, r7)
            if (r10 <= r11) goto L_0x01da
            r3.zzb()
        L_0x01da:
            r11 = 0
        L_0x01db:
            if (r11 >= r7) goto L_0x01c4
            r3.zzb()
            int r11 = r11 + 1
            goto L_0x01db
        L_0x01e3:
            if (r10 != r7) goto L_0x01e7
            r11 = 3
            goto L_0x01e8
        L_0x01e7:
            r11 = 1
        L_0x01e8:
            int r12 = r12 + r11
            r7 = r36
            r11 = 4
            r13 = 6
            goto L_0x01b7
        L_0x01ee:
            r36 = r7
            r7 = 3
            int r10 = r10 + 1
            r7 = r36
            r11 = 4
            r13 = 6
            goto L_0x01b4
        L_0x01f8:
            r36 = r7
            r7 = 2
            r3.zze(r7)
            boolean r7 = r3.zzf()
            if (r7 == 0) goto L_0x0212
            r7 = 8
            r3.zze(r7)
            r3.zzc()
            r3.zzc()
            r3.zzd()
        L_0x0212:
            int r7 = r3.zzc()
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x0219:
            if (r10 >= r7) goto L_0x0266
            if (r10 == 0) goto L_0x0221
            boolean r11 = r3.zzf()
        L_0x0221:
            if (r11 == 0) goto L_0x023b
            r3.zzd()
            r3.zzc()
            r13 = 0
        L_0x022a:
            if (r13 > r12) goto L_0x0238
            boolean r33 = r3.zzf()
            if (r33 == 0) goto L_0x0235
            r3.zzd()
        L_0x0235:
            int r13 = r13 + 1
            goto L_0x022a
        L_0x0238:
            r34 = r7
            goto L_0x0261
        L_0x023b:
            int r12 = r3.zzc()
            int r13 = r3.zzc()
            int r33 = r12 + r13
            r34 = r7
            r7 = 0
        L_0x0248:
            if (r7 >= r12) goto L_0x0253
            r3.zzc()
            r3.zzd()
            int r7 = r7 + 1
            goto L_0x0248
        L_0x0253:
            r7 = 0
        L_0x0254:
            if (r7 >= r13) goto L_0x025f
            r3.zzc()
            r3.zzd()
            int r7 = r7 + 1
            goto L_0x0254
        L_0x025f:
            r12 = r33
        L_0x0261:
            int r10 = r10 + 1
            r7 = r34
            goto L_0x0219
        L_0x0266:
            boolean r7 = r3.zzf()
            if (r7 == 0) goto L_0x027c
            r7 = 0
        L_0x026d:
            int r10 = r3.zzc()
            if (r7 >= r10) goto L_0x027c
            r10 = 5
            int r11 = r6 + 5
            r3.zze(r11)
            int r7 = r7 + 1
            goto L_0x026d
        L_0x027c:
            r6 = 2
            r3.zze(r6)
            boolean r6 = r3.zzf()
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L_0x02ff
            boolean r6 = r3.zzf()
            if (r6 == 0) goto L_0x02ca
            r6 = 8
            int r6 = r3.zza(r6)
            r10 = 255(0xff, float:3.57E-43)
            if (r6 != r10) goto L_0x02aa
            r6 = 16
            int r10 = r3.zza(r6)
            int r6 = r3.zza(r6)
            if (r10 == 0) goto L_0x02ca
            if (r6 == 0) goto L_0x02ca
            float r7 = (float) r10
            float r6 = (float) r6
            float r7 = r7 / r6
            goto L_0x02ca
        L_0x02aa:
            r10 = 17
            if (r6 >= r10) goto L_0x02b4
            float[] r7 = com.google.android.gms.internal.ads.zzaar.zzb
            r6 = r7[r6]
            r7 = r6
            goto L_0x02ca
        L_0x02b4:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Unexpected aspect_ratio_idc value: "
            r10.append(r11)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            java.lang.String r10 = "H265Reader"
            com.google.android.gms.internal.ads.zzee.zze(r10, r6)
        L_0x02ca:
            boolean r6 = r3.zzf()
            if (r6 == 0) goto L_0x02d3
            r3.zzd()
        L_0x02d3:
            boolean r6 = r3.zzf()
            if (r6 == 0) goto L_0x02e8
            r6 = 4
            r3.zze(r6)
            boolean r6 = r3.zzf()
            if (r6 == 0) goto L_0x02e8
            r6 = 24
            r3.zze(r6)
        L_0x02e8:
            boolean r6 = r3.zzf()
            if (r6 == 0) goto L_0x02f4
            r3.zzc()
            r3.zzc()
        L_0x02f4:
            r3.zzd()
            boolean r3 = r3.zzf()
            if (r3 == 0) goto L_0x02ff
            int r31 = r31 + r31
        L_0x02ff:
            r3 = r31
            r29 = r14
            java.lang.String r6 = com.google.android.gms.internal.ads.zzdn.zzb(r25, r26, r27, r28, r29, r30)
            com.google.android.gms.internal.ads.zzad r10 = new com.google.android.gms.internal.ads.zzad
            r10.<init>()
            r10.zzH(r5)
            java.lang.String r5 = "video/hevc"
            r10.zzS(r5)
            r10.zzx(r6)
            r10.zzX(r15)
            r10.zzF(r3)
            r10.zzP(r7)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r10.zzI(r2)
            com.google.android.gms.internal.ads.zzaf r2 = r10.zzY()
            r1.zzk(r2)
            r1 = 1
            r0.zze = r1
            goto L_0x033e
        L_0x0332:
            r20 = r2
            r21 = r3
            r19 = r5
            r36 = r7
            r23 = r10
            r22 = r12
        L_0x033e:
            com.google.android.gms.internal.ads.zzaic r1 = r0.zzj
            boolean r1 = r1.zzd(r4)
            if (r1 == 0) goto L_0x0366
            com.google.android.gms.internal.ads.zzaic r1 = r0.zzj
            byte[] r2 = r1.zza
            int r1 = r1.zzb
            int r1 = com.google.android.gms.internal.ads.zzaar.zzb(r2, r1)
            com.google.android.gms.internal.ads.zzen r2 = r0.zzn
            com.google.android.gms.internal.ads.zzaic r3 = r0.zzj
            byte[] r3 = r3.zza
            r2.zzD(r3, r1)
            com.google.android.gms.internal.ads.zzen r1 = r0.zzn
            r2 = 5
            r1.zzG(r2)
            com.google.android.gms.internal.ads.zzaio r1 = r0.zza
            com.google.android.gms.internal.ads.zzen r2 = r0.zzn
            r1.zza(r8, r2)
        L_0x0366:
            com.google.android.gms.internal.ads.zzaic r1 = r0.zzk
            boolean r1 = r1.zzd(r4)
            if (r1 == 0) goto L_0x038e
            com.google.android.gms.internal.ads.zzaic r1 = r0.zzk
            byte[] r2 = r1.zza
            int r1 = r1.zzb
            int r1 = com.google.android.gms.internal.ads.zzaar.zzb(r2, r1)
            com.google.android.gms.internal.ads.zzen r2 = r0.zzn
            com.google.android.gms.internal.ads.zzaic r3 = r0.zzk
            byte[] r3 = r3.zza
            r2.zzD(r3, r1)
            com.google.android.gms.internal.ads.zzen r1 = r0.zzn
            r2 = 5
            r1.zzG(r2)
            com.google.android.gms.internal.ads.zzaio r1 = r0.zza
            com.google.android.gms.internal.ads.zzen r2 = r0.zzn
            r1.zza(r8, r2)
        L_0x038e:
            r1 = 1
            int r1 = r36 >> 1
            long r14 = r0.zzm
            com.google.android.gms.internal.ads.zzahx r9 = r0.zzd
            boolean r2 = r0.zze
            r10 = r23
            r12 = r22
            r13 = r1
            r16 = r2
            r9.zzd(r10, r12, r13, r14, r16)
            boolean r2 = r0.zze
            if (r2 != 0) goto L_0x03b4
            com.google.android.gms.internal.ads.zzaic r2 = r0.zzg
            r2.zzc(r1)
            com.google.android.gms.internal.ads.zzaic r2 = r0.zzh
            r2.zzc(r1)
            com.google.android.gms.internal.ads.zzaic r2 = r0.zzi
            r2.zzc(r1)
        L_0x03b4:
            com.google.android.gms.internal.ads.zzaic r2 = r0.zzj
            r2.zzc(r1)
            com.google.android.gms.internal.ads.zzaic r2 = r0.zzk
            r2.zzc(r1)
            r6 = r38
            r1 = r19
            r2 = r20
            r3 = r21
            goto L_0x0030
        L_0x03c8:
            r0.zzf(r3, r1, r2)
        L_0x03cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    public final void zzb(zzzx zzzx, zzaiz zzaiz) {
        zzaiz.zzc();
        this.zzb = zzaiz.zzb();
        zzabb zzv = zzzx.zzv(zzaiz.zza(), 2);
        this.zzc = zzv;
        this.zzd = new zzahx(zzv);
        this.zza.zzb(zzzx, zzaiz);
    }

    public final void zzc() {
    }

    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzm = j10;
        }
    }

    public final void zze() {
        this.zzl = 0;
        this.zzm = -9223372036854775807L;
        zzaar.zze(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzahx zzahx = this.zzd;
        if (zzahx != null) {
            zzahx.zzc();
        }
    }
}
