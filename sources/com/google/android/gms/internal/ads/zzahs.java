package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzahs implements zzahn {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzajc zzb;
    private final zzen zzc;
    private final boolean[] zzd;
    private final zzahq zze;
    private final zzaic zzf;
    private zzahr zzg;
    private long zzh;
    private String zzi;
    private zzabb zzj;
    private boolean zzk;
    private long zzl;

    public zzahs() {
        this((zzajc) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzen r18) {
        /*
            r17 = this;
            r0 = r17
            com.google.android.gms.internal.ads.zzahr r1 = r0.zzg
            com.google.android.gms.internal.ads.zzdl.zzb(r1)
            com.google.android.gms.internal.ads.zzabb r1 = r0.zzj
            com.google.android.gms.internal.ads.zzdl.zzb(r1)
            int r1 = r18.zzc()
            int r2 = r18.zzd()
            byte[] r3 = r18.zzH()
            long r4 = r0.zzh
            int r6 = r18.zza()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.zzh = r4
            com.google.android.gms.internal.ads.zzabb r4 = r0.zzj
            int r5 = r18.zza()
            r6 = r18
            r4.zzq(r6, r5)
        L_0x002d:
            boolean[] r4 = r0.zzd
            int r4 = com.google.android.gms.internal.ads.zzaar.zza(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0049
            boolean r4 = r0.zzk
            if (r4 != 0) goto L_0x003e
            com.google.android.gms.internal.ads.zzahq r4 = r0.zze
            r4.zza(r3, r1, r2)
        L_0x003e:
            com.google.android.gms.internal.ads.zzahr r4 = r0.zzg
            r4.zza(r3, r1, r2)
            com.google.android.gms.internal.ads.zzaic r4 = r0.zzf
            r4.zza(r3, r1, r2)
            return
        L_0x0049:
            byte[] r5 = r18.zzH()
            int r7 = r4 + 3
            byte r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.zzk
            if (r9 != 0) goto L_0x017e
            if (r8 <= 0) goto L_0x0060
            com.google.android.gms.internal.ads.zzahq r9 = r0.zze
            r9.zza(r3, r1, r4)
        L_0x0060:
            if (r8 >= 0) goto L_0x0064
            int r9 = -r8
            goto L_0x0065
        L_0x0064:
            r9 = 0
        L_0x0065:
            com.google.android.gms.internal.ads.zzahq r12 = r0.zze
            boolean r9 = r12.zzc(r5, r9)
            if (r9 == 0) goto L_0x017e
            com.google.android.gms.internal.ads.zzabb r9 = r0.zzj
            com.google.android.gms.internal.ads.zzahq r12 = r0.zze
            int r13 = r12.zzb
            java.lang.String r14 = r0.zzi
            java.util.Objects.requireNonNull(r14)
            byte[] r15 = r12.zzc
            int r12 = r12.zza
            byte[] r12 = java.util.Arrays.copyOf(r15, r12)
            com.google.android.gms.internal.ads.zzem r15 = new com.google.android.gms.internal.ads.zzem
            int r10 = r12.length
            r15.<init>(r12, r10)
            r15.zzm(r13)
            r10 = 4
            r15.zzm(r10)
            r15.zzk()
            r13 = 8
            r15.zzl(r13)
            boolean r16 = r15.zzn()
            r11 = 3
            if (r16 == 0) goto L_0x00a2
            r15.zzl(r10)
            r15.zzl(r11)
        L_0x00a2:
            int r10 = r15.zzd(r10)
            r16 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r11 = "Invalid aspect ratio"
            java.lang.String r13 = "H263Reader"
            r6 = 15
            if (r10 != r6) goto L_0x00c5
            r6 = 8
            int r10 = r15.zzd(r6)
            int r6 = r15.zzd(r6)
            if (r6 != 0) goto L_0x00c0
            com.google.android.gms.internal.ads.zzee.zze(r13, r11)
            goto L_0x00d2
        L_0x00c0:
            float r10 = (float) r10
            float r6 = (float) r6
            float r16 = r10 / r6
            goto L_0x00cc
        L_0x00c5:
            r6 = 7
            if (r10 >= r6) goto L_0x00cf
            float[] r6 = zza
            r16 = r6[r10]
        L_0x00cc:
            r6 = r16
            goto L_0x00d4
        L_0x00cf:
            com.google.android.gms.internal.ads.zzee.zze(r13, r11)
        L_0x00d2:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x00d4:
            boolean r10 = r15.zzn()
            r11 = 2
            if (r10 == 0) goto L_0x010e
            r15.zzl(r11)
            r10 = 1
            r15.zzl(r10)
            boolean r10 = r15.zzn()
            if (r10 == 0) goto L_0x010e
            r10 = 15
            r15.zzl(r10)
            r15.zzk()
            r15.zzl(r10)
            r15.zzk()
            r15.zzl(r10)
            r15.zzk()
            r11 = 3
            r15.zzl(r11)
            r11 = 11
            r15.zzl(r11)
            r15.zzk()
            r15.zzl(r10)
            r15.zzk()
        L_0x010e:
            r10 = 2
            int r10 = r15.zzd(r10)
            if (r10 == 0) goto L_0x011a
            java.lang.String r10 = "Unhandled video object layer shape"
            com.google.android.gms.internal.ads.zzee.zze(r13, r10)
        L_0x011a:
            r15.zzk()
            r10 = 16
            int r10 = r15.zzd(r10)
            r15.zzk()
            boolean r11 = r15.zzn()
            if (r11 == 0) goto L_0x0141
            if (r10 != 0) goto L_0x0134
            java.lang.String r10 = "Invalid vop_increment_time_resolution"
            com.google.android.gms.internal.ads.zzee.zze(r13, r10)
            goto L_0x0141
        L_0x0134:
            int r10 = r10 + -1
            r11 = 0
        L_0x0137:
            if (r10 <= 0) goto L_0x013e
            int r10 = r10 >> 1
            int r11 = r11 + 1
            goto L_0x0137
        L_0x013e:
            r15.zzl(r11)
        L_0x0141:
            r15.zzk()
            r10 = 13
            int r11 = r15.zzd(r10)
            r15.zzk()
            int r10 = r15.zzd(r10)
            r15.zzk()
            r15.zzk()
            com.google.android.gms.internal.ads.zzad r13 = new com.google.android.gms.internal.ads.zzad
            r13.<init>()
            r13.zzH(r14)
            java.lang.String r14 = "video/mp4v-es"
            r13.zzS(r14)
            r13.zzX(r11)
            r13.zzF(r10)
            r13.zzP(r6)
            java.util.List r6 = java.util.Collections.singletonList(r12)
            r13.zzI(r6)
            com.google.android.gms.internal.ads.zzaf r6 = r13.zzY()
            r9.zzk(r6)
            r6 = 1
            r0.zzk = r6
        L_0x017e:
            com.google.android.gms.internal.ads.zzahr r6 = r0.zzg
            r6.zza(r3, r1, r4)
            com.google.android.gms.internal.ads.zzaic r6 = r0.zzf
            if (r8 <= 0) goto L_0x018c
            r6.zza(r3, r1, r4)
            r10 = 0
            goto L_0x018d
        L_0x018c:
            int r10 = -r8
        L_0x018d:
            com.google.android.gms.internal.ads.zzaic r1 = r0.zzf
            boolean r1 = r1.zzd(r10)
            if (r1 == 0) goto L_0x01b3
            com.google.android.gms.internal.ads.zzaic r1 = r0.zzf
            byte[] r6 = r1.zza
            int r1 = r1.zzb
            int r1 = com.google.android.gms.internal.ads.zzaar.zzb(r6, r1)
            com.google.android.gms.internal.ads.zzen r6 = r0.zzc
            int r8 = com.google.android.gms.internal.ads.zzew.zza
            com.google.android.gms.internal.ads.zzaic r8 = r0.zzf
            byte[] r8 = r8.zza
            r6.zzD(r8, r1)
            com.google.android.gms.internal.ads.zzajc r1 = r0.zzb
            long r8 = r0.zzl
            com.google.android.gms.internal.ads.zzen r6 = r0.zzc
            r1.zza(r8, r6)
        L_0x01b3:
            r1 = 178(0xb2, float:2.5E-43)
            if (r5 != r1) goto L_0x01c9
            byte[] r5 = r18.zzH()
            int r6 = r4 + 2
            byte r5 = r5[r6]
            r6 = 1
            if (r5 != r6) goto L_0x01c7
            com.google.android.gms.internal.ads.zzaic r5 = r0.zzf
            r5.zzc(r1)
        L_0x01c7:
            r5 = 178(0xb2, float:2.5E-43)
        L_0x01c9:
            int r1 = r2 - r4
            long r8 = r0.zzh
            long r10 = (long) r1
            long r8 = r8 - r10
            com.google.android.gms.internal.ads.zzahr r4 = r0.zzg
            boolean r6 = r0.zzk
            r4.zzb(r8, r1, r6)
            com.google.android.gms.internal.ads.zzahr r1 = r0.zzg
            long r8 = r0.zzl
            r1.zzc(r5, r8)
            r6 = r18
            r1 = r7
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahs.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    public final void zzb(zzzx zzzx, zzaiz zzaiz) {
        zzaiz.zzc();
        this.zzi = zzaiz.zzb();
        zzabb zzv = zzzx.zzv(zzaiz.zza(), 2);
        this.zzj = zzv;
        this.zzg = new zzahr(zzv);
        this.zzb.zzb(zzzx, zzaiz);
    }

    public final void zzc() {
    }

    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzl = j10;
        }
    }

    public final void zze() {
        zzaar.zze(this.zzd);
        this.zze.zzb();
        zzahr zzahr = this.zzg;
        if (zzahr != null) {
            zzahr.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0;
        this.zzl = -9223372036854775807L;
    }

    zzahs(zzajc zzajc) {
        this.zzb = zzajc;
        this.zzd = new boolean[4];
        this.zze = new zzahq(128);
        this.zzl = -9223372036854775807L;
        this.zzf = new zzaic(178, 128);
        this.zzc = new zzen();
    }
}
