package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaci implements zzzu {
    private final zzen zza = new zzen(6);
    private zzzx zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf = -1;
    private zzaef zzg;
    private zzzv zzh;
    private zzacl zzi;
    private zzagc zzj;

    private final int zze(zzzv zzzv) throws IOException {
        this.zza.zzC(2);
        ((zzzk) zzzv).zzm(this.zza.zzH(), 0, 2, false);
        return this.zza.zzo();
    }

    private final void zzf() {
        zzg(new zzbp[0]);
        zzzx zzzx = this.zzb;
        Objects.requireNonNull(zzzx);
        zzzx.zzC();
        this.zzb.zzN(new zzaaw(-9223372036854775807L, 0));
        this.zzc = 6;
    }

    private final void zzg(zzbp... zzbpArr) {
        zzzx zzzx = this.zzb;
        Objects.requireNonNull(zzzx);
        zzabb zzv = zzzx.zzv(1024, 4);
        zzad zzad = new zzad();
        zzad.zzz("image/jpeg");
        zzad.zzM(new zzbq(-9223372036854775807L, zzbpArr));
        zzv.zzk(zzad.zzY());
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzzv r24, com.google.android.gms.internal.ads.zzaau r25) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r0.zzc
            r4 = 4
            r5 = -1
            r7 = 2
            r8 = 1
            r9 = 0
            if (r3 == 0) goto L_0x018c
            if (r3 == r8) goto L_0x016e
            r10 = -1
            if (r3 == r7) goto L_0x00ac
            r5 = 5
            if (r3 == r4) goto L_0x004c
            if (r3 == r5) goto L_0x0024
            r1 = 6
            if (r3 != r1) goto L_0x001e
            return r10
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0024:
            com.google.android.gms.internal.ads.zzacl r3 = r0.zzi
            if (r3 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.zzzv r3 = r0.zzh
            if (r1 == r3) goto L_0x0037
        L_0x002c:
            r0.zzh = r1
            com.google.android.gms.internal.ads.zzacl r3 = new com.google.android.gms.internal.ads.zzacl
            long r4 = r0.zzf
            r3.<init>(r1, r4)
            r0.zzi = r3
        L_0x0037:
            com.google.android.gms.internal.ads.zzagc r1 = r0.zzj
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.zzacl r3 = r0.zzi
            int r1 = r1.zza(r3, r2)
            if (r1 != r8) goto L_0x004b
            long r3 = r2.zza
            long r5 = r0.zzf
            long r3 = r3 + r5
            r2.zza = r3
        L_0x004b:
            return r1
        L_0x004c:
            long r3 = r24.zzf()
            long r6 = r0.zzf
            int r10 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x00a9
            com.google.android.gms.internal.ads.zzen r2 = r0.zza
            byte[] r2 = r2.zzH()
            boolean r2 = r1.zzm(r2, r9, r8, r8)
            if (r2 != 0) goto L_0x0066
            r23.zzf()
            goto L_0x00a8
        L_0x0066:
            r24.zzj()
            com.google.android.gms.internal.ads.zzagc r2 = r0.zzj
            if (r2 != 0) goto L_0x0074
            com.google.android.gms.internal.ads.zzagc r2 = new com.google.android.gms.internal.ads.zzagc
            r2.<init>(r9)
            r0.zzj = r2
        L_0x0074:
            com.google.android.gms.internal.ads.zzacl r2 = new com.google.android.gms.internal.ads.zzacl
            long r3 = r0.zzf
            r2.<init>(r1, r3)
            r0.zzi = r2
            com.google.android.gms.internal.ads.zzagc r1 = r0.zzj
            boolean r1 = r1.zzd(r2)
            if (r1 == 0) goto L_0x00a5
            com.google.android.gms.internal.ads.zzagc r1 = r0.zzj
            com.google.android.gms.internal.ads.zzacn r2 = new com.google.android.gms.internal.ads.zzacn
            long r3 = r0.zzf
            com.google.android.gms.internal.ads.zzzx r6 = r0.zzb
            java.util.Objects.requireNonNull(r6)
            r2.<init>(r3, r6)
            r1.zzb(r2)
            com.google.android.gms.internal.ads.zzbp[] r1 = new com.google.android.gms.internal.ads.zzbp[r8]
            com.google.android.gms.internal.ads.zzaef r2 = r0.zzg
            java.util.Objects.requireNonNull(r2)
            r1[r9] = r2
            r0.zzg(r1)
            r0.zzc = r5
            goto L_0x00a8
        L_0x00a5:
            r23.zzf()
        L_0x00a8:
            return r9
        L_0x00a9:
            r2.zza = r6
            return r8
        L_0x00ac:
            int r2 = r0.zzd
            r3 = 65505(0xffe1, float:9.1792E-41)
            if (r2 != r3) goto L_0x0163
            com.google.android.gms.internal.ads.zzen r2 = new com.google.android.gms.internal.ads.zzen
            int r3 = r0.zze
            r2.<init>((int) r3)
            byte[] r3 = r2.zzH()
            int r4 = r0.zze
            r8 = r1
            com.google.android.gms.internal.ads.zzzk r8 = (com.google.android.gms.internal.ads.zzzk) r8
            r8.zzn(r3, r9, r4, r9)
            com.google.android.gms.internal.ads.zzaef r3 = r0.zzg
            if (r3 != 0) goto L_0x0161
            java.lang.String r3 = r2.zzv(r9)
            java.lang.String r4 = "http://ns.adobe.com/xap/1.0/"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0161
            java.lang.String r2 = r2.zzv(r9)
            if (r2 == 0) goto L_0x0161
            long r3 = r24.zzd()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x00e7
        L_0x00e4:
            r1 = 0
            goto L_0x0159
        L_0x00e7:
            com.google.android.gms.internal.ads.zzack r2 = com.google.android.gms.internal.ads.zzaco.zza(r2)
            if (r2 != 0) goto L_0x00ee
            goto L_0x00e4
        L_0x00ee:
            java.util.List r8 = r2.zzb
            int r8 = r8.size()
            if (r8 >= r7) goto L_0x00f7
            goto L_0x00e4
        L_0x00f7:
            java.util.List r7 = r2.zzb
            int r7 = r7.size()
            int r7 = r7 + r10
            r11 = r5
            r13 = r11
            r17 = r13
            r19 = r17
            r8 = 0
        L_0x0105:
            if (r7 < 0) goto L_0x013f
            java.util.List r10 = r2.zzb
            java.lang.Object r10 = r10.get(r7)
            com.google.android.gms.internal.ads.zzacj r10 = (com.google.android.gms.internal.ads.zzacj) r10
            java.lang.String r15 = r10.zza
            java.lang.String r1 = "video/mp4"
            boolean r1 = r1.equals(r15)
            r1 = r1 | r8
            if (r7 != 0) goto L_0x0120
            long r9 = r10.zzd
            long r3 = r3 - r9
            r8 = 0
            goto L_0x0124
        L_0x0120:
            long r8 = r10.zzc
            long r8 = r3 - r8
        L_0x0124:
            r21 = r3
            r3 = r8
            r8 = r21
            if (r1 == 0) goto L_0x0134
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0134
            long r19 = r8 - r3
            r17 = r3
            r1 = 0
        L_0x0134:
            if (r7 != 0) goto L_0x0137
            r13 = r8
        L_0x0137:
            if (r7 != 0) goto L_0x013a
            r11 = r3
        L_0x013a:
            int r7 = r7 + -1
            r8 = r1
            r9 = 0
            goto L_0x0105
        L_0x013f:
            int r1 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r19 > r5 ? 1 : (r19 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0150
            goto L_0x00e4
        L_0x0150:
            com.google.android.gms.internal.ads.zzaef r1 = new com.google.android.gms.internal.ads.zzaef
            long r2 = r2.zza
            r10 = r1
            r15 = r2
            r10.<init>(r11, r13, r15, r17, r19)
        L_0x0159:
            r0.zzg = r1
            if (r1 == 0) goto L_0x0161
            long r1 = r1.zzd
            r0.zzf = r1
        L_0x0161:
            r3 = 0
            goto L_0x016b
        L_0x0163:
            int r2 = r0.zze
            com.google.android.gms.internal.ads.zzzk r1 = (com.google.android.gms.internal.ads.zzzk) r1
            r3 = 0
            r1.zzo(r2, r3)
        L_0x016b:
            r0.zzc = r3
            return r3
        L_0x016e:
            r3 = 0
            com.google.android.gms.internal.ads.zzen r2 = r0.zza
            r2.zzC(r7)
            com.google.android.gms.internal.ads.zzen r2 = r0.zza
            byte[] r2 = r2.zzH()
            com.google.android.gms.internal.ads.zzzk r1 = (com.google.android.gms.internal.ads.zzzk) r1
            r1.zzn(r2, r3, r7, r3)
            com.google.android.gms.internal.ads.zzen r1 = r0.zza
            int r1 = r1.zzo()
            int r1 = r1 + -2
            r0.zze = r1
            r0.zzc = r7
            return r3
        L_0x018c:
            r3 = 0
            com.google.android.gms.internal.ads.zzen r2 = r0.zza
            r2.zzC(r7)
            com.google.android.gms.internal.ads.zzen r2 = r0.zza
            byte[] r2 = r2.zzH()
            com.google.android.gms.internal.ads.zzzk r1 = (com.google.android.gms.internal.ads.zzzk) r1
            r1.zzn(r2, r3, r7, r3)
            com.google.android.gms.internal.ads.zzen r1 = r0.zza
            int r1 = r1.zzo()
            r0.zzd = r1
            r2 = 65498(0xffda, float:9.1782E-41)
            if (r1 != r2) goto L_0x01b7
            long r1 = r0.zzf
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x01b3
            r0.zzc = r4
            goto L_0x01c8
        L_0x01b3:
            r23.zzf()
            goto L_0x01c8
        L_0x01b7:
            r2 = 65488(0xffd0, float:9.1768E-41)
            if (r1 < r2) goto L_0x01c1
            r2 = 65497(0xffd9, float:9.1781E-41)
            if (r1 <= r2) goto L_0x01c8
        L_0x01c1:
            r2 = 65281(0xff01, float:9.1478E-41)
            if (r1 == r2) goto L_0x01c8
            r0.zzc = r8
        L_0x01c8:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaci.zza(com.google.android.gms.internal.ads.zzzv, com.google.android.gms.internal.ads.zzaau):int");
    }

    public final void zzb(zzzx zzzx) {
        this.zzb = zzzx;
    }

    public final void zzc(long j10, long j11) {
        if (j10 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzagc zzagc = this.zzj;
            Objects.requireNonNull(zzagc);
            zzagc.zzc(j10, j11);
        }
    }

    public final boolean zzd(zzzv zzzv) throws IOException {
        if (zze(zzzv) != 65496) {
            return false;
        }
        int zze2 = zze(zzzv);
        this.zzd = zze2;
        if (zze2 == 65504) {
            this.zza.zzC(2);
            zzzk zzzk = (zzzk) zzzv;
            zzzk.zzm(this.zza.zzH(), 0, 2, false);
            zzzk.zzl(this.zza.zzo() - 2, false);
            zze2 = zze(zzzv);
            this.zzd = zze2;
        }
        if (zze2 == 65505) {
            zzzk zzzk2 = (zzzk) zzzv;
            zzzk2.zzl(2, false);
            this.zza.zzC(6);
            zzzk2.zzm(this.zza.zzH(), 0, 6, false);
            if (this.zza.zzs() == 1165519206 && this.zza.zzo() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
