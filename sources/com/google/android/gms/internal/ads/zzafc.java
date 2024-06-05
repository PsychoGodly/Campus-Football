package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzafc implements zzzu {
    public static final zzaab zza = zzafa.zza;
    private static final zzadm zzb = zzafb.zza;
    private final zzen zzc;
    private final zzaan zzd;
    private final zzaaj zze;
    private final zzaal zzf;
    private final zzabb zzg;
    private zzzx zzh;
    private zzabb zzi;
    private zzabb zzj;
    private int zzk;
    private zzbq zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzafe zzq;
    private boolean zzr;

    public zzafc() {
        this(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzf(com.google.android.gms.internal.ads.zzzv r17) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.zzk
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.zzk(r1, r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            com.google.android.gms.internal.ads.zzafe r2 = r0.zzq
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 1
            if (r2 != 0) goto L_0x01c3
            com.google.android.gms.internal.ads.zzen r14 = new com.google.android.gms.internal.ads.zzen
            com.google.android.gms.internal.ads.zzaan r2 = r0.zzd
            int r2 = r2.zzc
            r14.<init>((int) r2)
            byte[] r2 = r14.zzH()
            com.google.android.gms.internal.ads.zzaan r9 = r0.zzd
            int r9 = r9.zzc
            r10 = r1
            com.google.android.gms.internal.ads.zzzk r10 = (com.google.android.gms.internal.ads.zzzk) r10
            r10.zzm(r2, r4, r9, r4)
            com.google.android.gms.internal.ads.zzaan r2 = r0.zzd
            int r9 = r2.zza
            r9 = r9 & r8
            r10 = 36
            r11 = 21
            if (r9 == 0) goto L_0x0042
            int r2 = r2.zze
            if (r2 == r8) goto L_0x0046
            r2 = 36
            goto L_0x004d
        L_0x0042:
            int r2 = r2.zze
            if (r2 == r8) goto L_0x0049
        L_0x0046:
            r2 = 21
            goto L_0x004d
        L_0x0049:
            r11 = 13
            r2 = 13
        L_0x004d:
            int r9 = r14.zzd()
            int r11 = r2 + 4
            r12 = 1483304551(0x58696e67, float:1.02664153E15)
            r13 = 1447187017(0x56425249, float:5.3414667E13)
            r15 = 1231971951(0x496e666f, float:976486.94)
            if (r9 < r11) goto L_0x006f
            r14.zzF(r2)
            int r9 = r14.zze()
            if (r9 == r12) goto L_0x006d
            if (r9 != r15) goto L_0x006f
            r11 = 1231971951(0x496e666f, float:976486.94)
            goto L_0x0085
        L_0x006d:
            r11 = r9
            goto L_0x0085
        L_0x006f:
            int r9 = r14.zzd()
            r11 = 40
            if (r9 < r11) goto L_0x0084
            r14.zzF(r10)
            int r9 = r14.zze()
            if (r9 != r13) goto L_0x0084
            r11 = 1447187017(0x56425249, float:5.3414667E13)
            goto L_0x0085
        L_0x0084:
            r11 = 0
        L_0x0085:
            if (r11 == r12) goto L_0x00aa
            if (r11 != r15) goto L_0x008a
            goto L_0x00aa
        L_0x008a:
            if (r11 != r13) goto L_0x00a5
            long r9 = r17.zzd()
            long r11 = r17.zzf()
            com.google.android.gms.internal.ads.zzaan r13 = r0.zzd
            com.google.android.gms.internal.ads.zzaff r2 = com.google.android.gms.internal.ads.zzaff.zza(r9, r11, r13, r14)
            com.google.android.gms.internal.ads.zzaan r9 = r0.zzd
            int r9 = r9.zzc
            r10 = r1
            com.google.android.gms.internal.ads.zzzk r10 = (com.google.android.gms.internal.ads.zzzk) r10
            r10.zzo(r9, r4)
            goto L_0x010d
        L_0x00a5:
            r17.zzj()
            r2 = 0
            goto L_0x010d
        L_0x00aa:
            long r9 = r17.zzd()
            long r12 = r17.zzf()
            com.google.android.gms.internal.ads.zzaan r8 = r0.zzd
            r7 = r11
            r11 = r12
            r13 = r8
            com.google.android.gms.internal.ads.zzafg r8 = com.google.android.gms.internal.ads.zzafg.zza(r9, r11, r13, r14)
            if (r8 == 0) goto L_0x00f3
            com.google.android.gms.internal.ads.zzaaj r9 = r0.zze
            boolean r9 = r9.zza()
            if (r9 != 0) goto L_0x00f3
            r17.zzj()
            int r2 = r2 + 141
            r9 = r1
            com.google.android.gms.internal.ads.zzzk r9 = (com.google.android.gms.internal.ads.zzzk) r9
            r9.zzl(r2, r4)
            com.google.android.gms.internal.ads.zzen r2 = r0.zzc
            byte[] r2 = r2.zzH()
            r10 = 3
            r9.zzm(r2, r4, r10, r4)
            com.google.android.gms.internal.ads.zzen r2 = r0.zzc
            r2.zzF(r4)
            com.google.android.gms.internal.ads.zzaaj r2 = r0.zze
            com.google.android.gms.internal.ads.zzen r9 = r0.zzc
            int r9 = r9.zzm()
            int r10 = r9 >> 12
            r9 = r9 & 4095(0xfff, float:5.738E-42)
            if (r10 > 0) goto L_0x00ef
            if (r9 <= 0) goto L_0x00f3
        L_0x00ef:
            r2.zza = r10
            r2.zzb = r9
        L_0x00f3:
            com.google.android.gms.internal.ads.zzaan r2 = r0.zzd
            int r2 = r2.zzc
            r9 = r1
            com.google.android.gms.internal.ads.zzzk r9 = (com.google.android.gms.internal.ads.zzzk) r9
            r9.zzo(r2, r4)
            if (r8 == 0) goto L_0x010c
            boolean r2 = r8.zzh()
            if (r2 != 0) goto L_0x010c
            if (r7 != r15) goto L_0x010c
            com.google.android.gms.internal.ads.zzafe r2 = r0.zzh(r1, r4)
            goto L_0x010d
        L_0x010c:
            r2 = r8
        L_0x010d:
            com.google.android.gms.internal.ads.zzbq r7 = r0.zzl
            long r8 = r17.zzf()
            if (r7 == 0) goto L_0x015e
            int r10 = r7.zza()
            r11 = 0
        L_0x011a:
            if (r11 >= r10) goto L_0x015e
            com.google.android.gms.internal.ads.zzbp r12 = r7.zzb(r11)
            boolean r13 = r12 instanceof com.google.android.gms.internal.ads.zzadt
            if (r13 == 0) goto L_0x015b
            com.google.android.gms.internal.ads.zzadt r12 = (com.google.android.gms.internal.ads.zzadt) r12
            int r10 = r7.zza()
            r11 = 0
        L_0x012b:
            if (r11 >= r10) goto L_0x0155
            com.google.android.gms.internal.ads.zzbp r13 = r7.zzb(r11)
            boolean r14 = r13 instanceof com.google.android.gms.internal.ads.zzadx
            if (r14 == 0) goto L_0x0152
            com.google.android.gms.internal.ads.zzadx r13 = (com.google.android.gms.internal.ads.zzadx) r13
            java.lang.String r14 = r13.zzf
            java.lang.String r15 = "TLEN"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0152
            com.google.android.gms.internal.ads.zzfqk r7 = r13.zzc
            java.lang.Object r7 = r7.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            long r10 = java.lang.Long.parseLong(r7)
            long r10 = com.google.android.gms.internal.ads.zzew.zzv(r10)
            goto L_0x0156
        L_0x0152:
            int r11 = r11 + 1
            goto L_0x012b
        L_0x0155:
            r10 = r5
        L_0x0156:
            com.google.android.gms.internal.ads.zzaez r7 = com.google.android.gms.internal.ads.zzaez.zza(r8, r12, r10)
            goto L_0x015f
        L_0x015b:
            int r11 = r11 + 1
            goto L_0x011a
        L_0x015e:
            r7 = 0
        L_0x015f:
            boolean r8 = r0.zzr
            if (r8 == 0) goto L_0x0169
            com.google.android.gms.internal.ads.zzafd r2 = new com.google.android.gms.internal.ads.zzafd
            r2.<init>()
            goto L_0x017a
        L_0x0169:
            if (r7 == 0) goto L_0x016d
            r2 = r7
            goto L_0x0170
        L_0x016d:
            if (r2 != 0) goto L_0x0170
            r2 = 0
        L_0x0170:
            if (r2 == 0) goto L_0x0176
            r2.zzh()
            goto L_0x017a
        L_0x0176:
            com.google.android.gms.internal.ads.zzafe r2 = r0.zzh(r1, r4)
        L_0x017a:
            r0.zzq = r2
            com.google.android.gms.internal.ads.zzzx r7 = r0.zzh
            r7.zzN(r2)
            com.google.android.gms.internal.ads.zzabb r2 = r0.zzj
            com.google.android.gms.internal.ads.zzad r7 = new com.google.android.gms.internal.ads.zzad
            r7.<init>()
            com.google.android.gms.internal.ads.zzaan r8 = r0.zzd
            java.lang.String r8 = r8.zzb
            r7.zzS(r8)
            r8 = 4096(0x1000, float:5.74E-42)
            r7.zzL(r8)
            com.google.android.gms.internal.ads.zzaan r8 = r0.zzd
            int r8 = r8.zze
            r7.zzw(r8)
            com.google.android.gms.internal.ads.zzaan r8 = r0.zzd
            int r8 = r8.zzd
            r7.zzT(r8)
            com.google.android.gms.internal.ads.zzaaj r8 = r0.zze
            int r8 = r8.zza
            r7.zzC(r8)
            com.google.android.gms.internal.ads.zzaaj r8 = r0.zze
            int r8 = r8.zzb
            r7.zzD(r8)
            com.google.android.gms.internal.ads.zzbq r8 = r0.zzl
            r7.zzM(r8)
            com.google.android.gms.internal.ads.zzaf r7 = r7.zzY()
            r2.zzk(r7)
            long r7 = r17.zzf()
            r0.zzo = r7
            goto L_0x01db
        L_0x01c3:
            long r7 = r0.zzo
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x01db
            long r9 = r17.zzf()
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x01db
            long r7 = r7 - r9
            r2 = r1
            com.google.android.gms.internal.ads.zzzk r2 = (com.google.android.gms.internal.ads.zzzk) r2
            int r8 = (int) r7
            r2.zzo(r8, r4)
        L_0x01db:
            int r2 = r0.zzp
            if (r2 != 0) goto L_0x023f
            r17.zzj()
            boolean r2 = r16.zzj(r17)
            if (r2 == 0) goto L_0x01e9
            goto L_0x0251
        L_0x01e9:
            com.google.android.gms.internal.ads.zzen r2 = r0.zzc
            r2.zzF(r4)
            com.google.android.gms.internal.ads.zzen r2 = r0.zzc
            int r2 = r2.zze()
            int r7 = r0.zzk
            long r7 = (long) r7
            boolean r7 = zzi(r2, r7)
            if (r7 == 0) goto L_0x0236
            int r7 = com.google.android.gms.internal.ads.zzaao.zzb(r2)
            if (r7 != r3) goto L_0x0204
            goto L_0x0236
        L_0x0204:
            com.google.android.gms.internal.ads.zzaan r7 = r0.zzd
            r7.zza(r2)
            long r7 = r0.zzm
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x021b
            com.google.android.gms.internal.ads.zzafe r2 = r0.zzq
            long r5 = r17.zzf()
            long r5 = r2.zzc(r5)
            r0.zzm = r5
        L_0x021b:
            com.google.android.gms.internal.ads.zzaan r2 = r0.zzd
            int r5 = r2.zzc
            r0.zzp = r5
            com.google.android.gms.internal.ads.zzafe r6 = r0.zzq
            boolean r7 = r6 instanceof com.google.android.gms.internal.ads.zzaey
            if (r7 != 0) goto L_0x0229
            r2 = r5
            goto L_0x023f
        L_0x0229:
            com.google.android.gms.internal.ads.zzaey r6 = (com.google.android.gms.internal.ads.zzaey) r6
            long r3 = r0.zzn
            int r1 = r2.zzg
            long r1 = (long) r1
            long r3 = r3 + r1
            r0.zzg(r3)
            r1 = 0
            throw r1
        L_0x0236:
            com.google.android.gms.internal.ads.zzzk r1 = (com.google.android.gms.internal.ads.zzzk) r1
            r5 = 1
            r1.zzo(r5, r4)
            r0.zzk = r4
            goto L_0x0250
        L_0x023f:
            r5 = 1
            com.google.android.gms.internal.ads.zzabb r6 = r0.zzj
            int r1 = r6.zze(r1, r2, r5)
            if (r1 != r3) goto L_0x0249
            goto L_0x0251
        L_0x0249:
            int r2 = r0.zzp
            int r2 = r2 - r1
            r0.zzp = r2
            if (r2 <= 0) goto L_0x0252
        L_0x0250:
            r3 = 0
        L_0x0251:
            return r3
        L_0x0252:
            com.google.android.gms.internal.ads.zzabb r5 = r0.zzj
            long r1 = r0.zzn
            long r6 = r0.zzg(r1)
            r8 = 1
            com.google.android.gms.internal.ads.zzaan r1 = r0.zzd
            int r9 = r1.zzc
            r10 = 0
            r11 = 0
            r5.zzs(r6, r8, r9, r10, r11)
            long r1 = r0.zzn
            com.google.android.gms.internal.ads.zzaan r3 = r0.zzd
            int r3 = r3.zzg
            long r5 = (long) r3
            long r1 = r1 + r5
            r0.zzn = r1
            r0.zzp = r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafc.zzf(com.google.android.gms.internal.ads.zzzv):int");
    }

    private final long zzg(long j10) {
        return this.zzm + ((j10 * 1000000) / ((long) this.zzd.zzd));
    }

    private final zzafe zzh(zzzv zzzv, boolean z10) throws IOException {
        ((zzzk) zzzv).zzm(this.zzc.zzH(), 0, 4, false);
        this.zzc.zzF(0);
        this.zzd.zza(this.zzc.zze());
        return new zzaex(zzzv.zzd(), zzzv.zzf(), this.zzd, false);
    }

    private static boolean zzi(int i10, long j10) {
        return ((long) (i10 & -128000)) == (j10 & -128000);
    }

    private final boolean zzj(zzzv zzzv) throws IOException {
        zzafe zzafe = this.zzq;
        if (zzafe != null) {
            long zzb2 = zzafe.zzb();
            if (zzb2 != -1 && zzzv.zze() > zzb2 - 4) {
                return true;
            }
        }
        try {
            return !zzzv.zzm(this.zzc.zzH(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzk(zzzv zzzv, boolean z10) throws IOException {
        int i10;
        int i11;
        int zzb2;
        zzzv.zzj();
        if (zzzv.zzf() == 0) {
            zzbq zza2 = this.zzf.zza(zzzv, (zzadm) null);
            this.zzl = zza2;
            if (zza2 != null) {
                this.zze.zzb(zza2);
            }
            i10 = (int) zzzv.zze();
            if (!z10) {
                ((zzzk) zzzv).zzo(i10, false);
            }
            i11 = 0;
        } else {
            i11 = 0;
            i10 = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (!zzj(zzzv)) {
                this.zzc.zzF(0);
                int zze2 = this.zzc.zze();
                if ((i11 == 0 || zzi(zze2, (long) i11)) && (zzb2 = zzaao.zzb(zze2)) != -1) {
                    i12++;
                    if (i12 != 1) {
                        if (i12 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(zze2);
                        i11 = zze2;
                    }
                    ((zzzk) zzzv).zzl(zzb2 - 4, false);
                } else {
                    int i14 = i13 + 1;
                    if (i13 != (true != z10 ? 131072 : 32768)) {
                        if (z10) {
                            zzzv.zzj();
                            ((zzzk) zzzv).zzl(i10 + i14, false);
                        } else {
                            ((zzzk) zzzv).zzo(1, false);
                        }
                        i13 = i14;
                        i11 = 0;
                        i12 = 0;
                    } else if (z10) {
                        return false;
                    } else {
                        throw zzbu.zza("Searched too many bytes.", (Throwable) null);
                    }
                }
            } else if (i12 <= 0) {
                throw new EOFException();
            }
        }
        if (z10) {
            ((zzzk) zzzv).zzo(i10 + i13, false);
        } else {
            zzzv.zzj();
        }
        this.zzk = i11;
        return true;
    }

    public final int zza(zzzv zzzv, zzaau zzaau) throws IOException {
        zzdl.zzb(this.zzi);
        int i10 = zzew.zza;
        int zzf2 = zzf(zzzv);
        if (zzf2 == -1 && (this.zzq instanceof zzaey)) {
            if (this.zzq.zze() != zzg(this.zzn)) {
                zzaey zzaey = (zzaey) this.zzq;
                throw null;
            }
        }
        return zzf2;
    }

    public final void zzb(zzzx zzzx) {
        this.zzh = zzzx;
        zzabb zzv = zzzx.zzv(0, 1);
        this.zzi = zzv;
        this.zzj = zzv;
        this.zzh.zzC();
    }

    public final void zzc(long j10, long j11) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0;
        this.zzp = 0;
        zzafe zzafe = this.zzq;
        if (zzafe instanceof zzaey) {
            zzaey zzaey = (zzaey) zzafe;
            throw null;
        }
    }

    public final boolean zzd(zzzv zzzv) throws IOException {
        return zzk(zzzv, true);
    }

    public final void zze() {
        this.zzr = true;
    }

    public zzafc(int i10) {
        this.zzc = new zzen(10);
        this.zzd = new zzaan();
        this.zze = new zzaaj();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzaal();
        zzzt zzzt = new zzzt();
        this.zzg = zzzt;
        this.zzj = zzzt;
    }
}
