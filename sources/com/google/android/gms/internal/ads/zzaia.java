package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaia implements zzahn {
    private final String zza;
    private final zzen zzb;
    private final zzem zzc;
    private zzabb zzd;
    private String zze;
    private zzaf zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk = -9223372036854775807L;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private String zzu;

    public zzaia(String str) {
        this.zza = str;
        zzen zzen = new zzen(1024);
        this.zzb = zzen;
        byte[] zzH = zzen.zzH();
        this.zzc = new zzem(zzH, zzH.length);
    }

    private final int zzf(zzem zzem) throws zzbu {
        int zza2 = zzem.zza();
        zzyr zzb2 = zzys.zzb(zzem, true);
        this.zzu = zzb2.zzc;
        this.zzr = zzb2.zza;
        this.zzt = zzb2.zzb;
        return zza2 - zzem.zza();
    }

    private static long zzg(zzem zzem) {
        return (long) zzem.zzd((zzem.zzd(2) + 1) * 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0154, code lost:
        if (r14.zzl == false) goto L_0x01b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzen r15) throws com.google.android.gms.internal.ads.zzbu {
        /*
            r14 = this;
            com.google.android.gms.internal.ads.zzabb r0 = r14.zzd
            com.google.android.gms.internal.ads.zzdl.zzb(r0)
        L_0x0005:
            int r0 = r15.zza()
            if (r0 <= 0) goto L_0x0218
            int r0 = r14.zzg
            r1 = 86
            r2 = 1
            if (r0 == 0) goto L_0x020e
            r3 = 2
            r4 = 0
            if (r0 == r2) goto L_0x01f8
            r1 = 3
            r5 = 8
            if (r0 == r3) goto L_0x01ce
            int r0 = r15.zza()
            int r3 = r14.zzi
            int r6 = r14.zzh
            int r3 = r3 - r6
            int r0 = java.lang.Math.min(r0, r3)
            com.google.android.gms.internal.ads.zzem r3 = r14.zzc
            byte[] r3 = r3.zza
            int r6 = r14.zzh
            r15.zzB(r3, r6, r0)
            int r3 = r14.zzh
            int r3 = r3 + r0
            r14.zzh = r3
            int r0 = r14.zzi
            if (r3 != r0) goto L_0x0005
            com.google.android.gms.internal.ads.zzem r0 = r14.zzc
            r0.zzj(r4)
            com.google.android.gms.internal.ads.zzem r0 = r14.zzc
            boolean r3 = r0.zzn()
            r6 = 0
            if (r3 != 0) goto L_0x0152
            r14.zzl = r2
            int r3 = r0.zzd(r2)
            if (r3 != r2) goto L_0x0056
            int r3 = r0.zzd(r2)
            r7 = 1
            goto L_0x0058
        L_0x0056:
            r7 = r3
            r3 = 0
        L_0x0058:
            r14.zzm = r3
            if (r3 != 0) goto L_0x014d
            if (r7 != r2) goto L_0x0062
            zzg(r0)
            r7 = 1
        L_0x0062:
            boolean r3 = r0.zzn()
            if (r3 == 0) goto L_0x0148
            r3 = 6
            int r8 = r0.zzd(r3)
            r14.zzn = r8
            r8 = 4
            int r9 = r0.zzd(r8)
            int r10 = r0.zzd(r1)
            if (r9 != 0) goto L_0x0143
            if (r10 != 0) goto L_0x0143
            if (r7 != 0) goto L_0x00d8
            int r9 = r0.zzc()
            int r10 = r14.zzf(r0)
            r0.zzj(r9)
            int r9 = r10 + 7
            int r9 = r9 / r5
            byte[] r9 = new byte[r9]
            r0.zzg(r9, r4, r10)
            com.google.android.gms.internal.ads.zzad r10 = new com.google.android.gms.internal.ads.zzad
            r10.<init>()
            java.lang.String r11 = r14.zze
            r10.zzH(r11)
            java.lang.String r11 = "audio/mp4a-latm"
            r10.zzS(r11)
            java.lang.String r11 = r14.zzu
            r10.zzx(r11)
            int r11 = r14.zzt
            r10.zzw(r11)
            int r11 = r14.zzr
            r10.zzT(r11)
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r10.zzI(r9)
            java.lang.String r9 = r14.zza
            r10.zzK(r9)
            com.google.android.gms.internal.ads.zzaf r9 = r10.zzY()
            com.google.android.gms.internal.ads.zzaf r10 = r14.zzf
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L_0x00e5
            r14.zzf = r9
            r10 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r12 = r9.zzA
            long r12 = (long) r12
            long r10 = r10 / r12
            r14.zzs = r10
            com.google.android.gms.internal.ads.zzabb r10 = r14.zzd
            r10.zzk(r9)
            goto L_0x00e5
        L_0x00d8:
            long r9 = zzg(r0)
            int r10 = (int) r9
            int r9 = r14.zzf(r0)
            int r10 = r10 - r9
            r0.zzl(r10)
        L_0x00e5:
            int r9 = r0.zzd(r1)
            r14.zzo = r9
            if (r9 == 0) goto L_0x0110
            if (r9 == r2) goto L_0x010a
            if (r9 == r1) goto L_0x0106
            if (r9 == r8) goto L_0x0106
            r1 = 5
            if (r9 == r1) goto L_0x0106
            if (r9 == r3) goto L_0x0102
            r1 = 7
            if (r9 != r1) goto L_0x00fc
            goto L_0x0102
        L_0x00fc:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>()
            throw r15
        L_0x0102:
            r0.zzl(r2)
            goto L_0x0113
        L_0x0106:
            r0.zzl(r3)
            goto L_0x0113
        L_0x010a:
            r1 = 9
            r0.zzl(r1)
            goto L_0x0113
        L_0x0110:
            r0.zzl(r5)
        L_0x0113:
            boolean r1 = r0.zzn()
            r14.zzp = r1
            r8 = 0
            r14.zzq = r8
            if (r1 == 0) goto L_0x0139
            if (r7 == r2) goto L_0x0133
        L_0x0121:
            boolean r1 = r0.zzn()
            long r2 = r14.zzq
            long r2 = r2 << r5
            int r7 = r0.zzd(r5)
            long r7 = (long) r7
            long r2 = r2 + r7
            r14.zzq = r2
            if (r1 != 0) goto L_0x0121
            goto L_0x0139
        L_0x0133:
            long r1 = zzg(r0)
            r14.zzq = r1
        L_0x0139:
            boolean r1 = r0.zzn()
            if (r1 == 0) goto L_0x0157
            r0.zzl(r5)
            goto L_0x0157
        L_0x0143:
            com.google.android.gms.internal.ads.zzbu r15 = com.google.android.gms.internal.ads.zzbu.zza(r6, r6)
            throw r15
        L_0x0148:
            com.google.android.gms.internal.ads.zzbu r15 = com.google.android.gms.internal.ads.zzbu.zza(r6, r6)
            throw r15
        L_0x014d:
            com.google.android.gms.internal.ads.zzbu r15 = com.google.android.gms.internal.ads.zzbu.zza(r6, r6)
            throw r15
        L_0x0152:
            boolean r1 = r14.zzl
            if (r1 != 0) goto L_0x0157
            goto L_0x01b9
        L_0x0157:
            int r1 = r14.zzm
            if (r1 != 0) goto L_0x01c9
            int r1 = r14.zzn
            if (r1 != 0) goto L_0x01c4
            int r1 = r14.zzo
            if (r1 != 0) goto L_0x01bf
            r1 = 0
        L_0x0164:
            int r2 = r0.zzd(r5)
            int r10 = r1 + r2
            r1 = 255(0xff, float:3.57E-43)
            if (r2 == r1) goto L_0x01bd
            int r1 = r0.zzc()
            r2 = r1 & 7
            if (r2 != 0) goto L_0x017e
            com.google.android.gms.internal.ads.zzen r2 = r14.zzb
            int r1 = r1 >> 3
            r2.zzF(r1)
            goto L_0x018e
        L_0x017e:
            com.google.android.gms.internal.ads.zzen r1 = r14.zzb
            byte[] r1 = r1.zzH()
            int r2 = r10 * 8
            r0.zzg(r1, r4, r2)
            com.google.android.gms.internal.ads.zzen r1 = r14.zzb
            r1.zzF(r4)
        L_0x018e:
            com.google.android.gms.internal.ads.zzabb r1 = r14.zzd
            com.google.android.gms.internal.ads.zzen r2 = r14.zzb
            r1.zzq(r2, r10)
            long r7 = r14.zzk
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x01af
            com.google.android.gms.internal.ads.zzabb r6 = r14.zzd
            r9 = 1
            r11 = 0
            r12 = 0
            r6.zzs(r7, r9, r10, r11, r12)
            long r1 = r14.zzk
            long r5 = r14.zzs
            long r1 = r1 + r5
            r14.zzk = r1
        L_0x01af:
            boolean r1 = r14.zzp
            if (r1 == 0) goto L_0x01b9
            long r1 = r14.zzq
            int r2 = (int) r1
            r0.zzl(r2)
        L_0x01b9:
            r14.zzg = r4
            goto L_0x0005
        L_0x01bd:
            r1 = r10
            goto L_0x0164
        L_0x01bf:
            com.google.android.gms.internal.ads.zzbu r15 = com.google.android.gms.internal.ads.zzbu.zza(r6, r6)
            throw r15
        L_0x01c4:
            com.google.android.gms.internal.ads.zzbu r15 = com.google.android.gms.internal.ads.zzbu.zza(r6, r6)
            throw r15
        L_0x01c9:
            com.google.android.gms.internal.ads.zzbu r15 = com.google.android.gms.internal.ads.zzbu.zza(r6, r6)
            throw r15
        L_0x01ce:
            int r0 = r14.zzj
            r0 = r0 & -225(0xffffffffffffff1f, float:NaN)
            int r0 = r0 << r5
            int r2 = r15.zzk()
            r0 = r0 | r2
            r14.zzi = r0
            com.google.android.gms.internal.ads.zzen r2 = r14.zzb
            byte[] r3 = r2.zzH()
            int r3 = r3.length
            if (r0 <= r3) goto L_0x01f2
            r2.zzC(r0)
            com.google.android.gms.internal.ads.zzem r0 = r14.zzc
            com.google.android.gms.internal.ads.zzen r2 = r14.zzb
            byte[] r2 = r2.zzH()
            int r3 = r2.length
            r0.zzi(r2, r3)
        L_0x01f2:
            r14.zzh = r4
            r14.zzg = r1
            goto L_0x0005
        L_0x01f8:
            int r0 = r15.zzk()
            r2 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r2 != r5) goto L_0x0208
            r14.zzj = r0
            r14.zzg = r3
            goto L_0x0005
        L_0x0208:
            if (r0 == r1) goto L_0x0005
            r14.zzg = r4
            goto L_0x0005
        L_0x020e:
            int r0 = r15.zzk()
            if (r0 != r1) goto L_0x0005
            r14.zzg = r2
            goto L_0x0005
        L_0x0218:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaia.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    public final void zzb(zzzx zzzx, zzaiz zzaiz) {
        zzaiz.zzc();
        this.zzd = zzzx.zzv(zzaiz.zza(), 1);
        this.zze = zzaiz.zzb();
    }

    public final void zzc() {
    }

    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzk = j10;
        }
    }

    public final void zze() {
        this.zzg = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = false;
    }
}
