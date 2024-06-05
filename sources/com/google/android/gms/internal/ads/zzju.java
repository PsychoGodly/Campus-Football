package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzju {
    private final zzck zza = new zzck();
    private final zzcm zzb = new zzcm();
    private final zzlb zzc;
    private final zzdv zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjr zzh;
    private zzjr zzi;
    private zzjr zzj;
    private int zzk;
    private Object zzl;
    private long zzm;

    public zzju(zzlb zzlb, zzdv zzdv) {
        this.zzc = zzlb;
        this.zzd = zzdv;
    }

    private final boolean zzA(zzcn zzcn, zzss zzss) {
        if (!zzC(zzss)) {
            return false;
        }
        int i10 = zzcn.zzn(zzss.zza, this.zza).zzd;
        if (zzcn.zze(i10, this.zzb, 0).zzp == zzcn.zza(zzss.zza)) {
            return true;
        }
        return false;
    }

    private final boolean zzB(zzcn zzcn) {
        zzjr zzjr = this.zzh;
        if (zzjr == null) {
            return true;
        }
        int zza2 = zzcn.zza(zzjr.zzb);
        while (true) {
            zza2 = zzcn.zzi(zza2, this.zza, this.zzb, this.zzf, this.zzg);
            while (zzjr.zzg() != null && !zzjr.zzf.zzg) {
                zzjr = zzjr.zzg();
            }
            zzjr zzg2 = zzjr.zzg();
            if (zza2 == -1 || zzg2 == null || zzcn.zza(zzg2.zzb) != zza2) {
                boolean zzm2 = zzm(zzjr);
                zzjr.zzf = zzg(zzcn, zzjr.zzf);
            } else {
                zzjr = zzg2;
            }
        }
        boolean zzm22 = zzm(zzjr);
        zzjr.zzf = zzg(zzcn, zzjr.zzf);
        if (!zzm22) {
            return true;
        }
        return false;
    }

    private static final boolean zzC(zzss zzss) {
        return !zzss.zzb() && zzss.zze == -1;
    }

    private final long zzs(zzcn zzcn, Object obj, int i10) {
        zzcn.zzn(obj, this.zza);
        this.zza.zzh(i10);
        this.zza.zzj(i10);
        return 0;
    }

    private final zzjs zzt(zzcn zzcn, zzjr zzjr, long j10) {
        long j11;
        zzcn zzcn2 = zzcn;
        zzjs zzjs = zzjr.zzf;
        long zze2 = (zzjr.zze() + zzjs.zze) - j10;
        if (zzjs.zzg) {
            long j12 = 0;
            int zzi2 = zzcn.zzi(zzcn2.zza(zzjs.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzi2 == -1) {
                return null;
            }
            int i10 = zzcn2.zzd(zzi2, this.zza, true).zzd;
            Object obj = this.zza.zzc;
            Objects.requireNonNull(obj);
            long j13 = zzjs.zza.zzd;
            if (zzcn2.zze(i10, this.zzb, 0).zzo == zzi2) {
                Pair zzm2 = zzcn.zzm(this.zzb, this.zza, i10, -9223372036854775807L, Math.max(0, zze2));
                if (zzm2 == null) {
                    return null;
                }
                obj = zzm2.first;
                long longValue = ((Long) zzm2.second).longValue();
                zzjr zzg2 = zzjr.zzg();
                if (zzg2 == null || !zzg2.zzb.equals(obj)) {
                    j13 = this.zze;
                    this.zze = 1 + j13;
                } else {
                    j13 = zzg2.zzf.zza.zzd;
                }
                j11 = longValue;
                j12 = -9223372036854775807L;
            } else {
                j11 = 0;
            }
            zzss zzx = zzx(zzcn, obj, j11, j13, this.zzb, this.zza);
            if (!(j12 == -9223372036854775807L || zzjs.zzc == -9223372036854775807L)) {
                zzcn2.zzn(zzjs.zza.zza, this.zza).zzb();
            }
            return zzu(zzcn, zzx, j12, j11);
        }
        zzss zzss = zzjs.zza;
        zzcn2.zzn(zzss.zza, this.zza);
        if (zzss.zzb()) {
            int i11 = zzss.zzb;
            if (this.zza.zza(i11) == -1) {
                return null;
            }
            int zzf2 = this.zza.zzf(i11, zzss.zzc);
            if (zzf2 < 0) {
                return zzv(zzcn, zzss.zza, i11, zzf2, zzjs.zzc, zzss.zzd);
            }
            long j14 = zzjs.zzc;
            if (j14 == -9223372036854775807L) {
                zzcm zzcm = this.zzb;
                zzck zzck = this.zza;
                Pair zzm3 = zzcn.zzm(zzcm, zzck, zzck.zzd, -9223372036854775807L, Math.max(0, zze2));
                if (zzm3 == null) {
                    return null;
                }
                j14 = ((Long) zzm3.second).longValue();
            }
            zzs(zzcn2, zzss.zza, zzss.zzb);
            return zzw(zzcn, zzss.zza, Math.max(0, j14), zzjs.zzc, zzss.zzd);
        }
        int zze3 = this.zza.zze(zzss.zze);
        this.zza.zzl(zzss.zze);
        if (zze3 != this.zza.zza(zzss.zze)) {
            return zzv(zzcn, zzss.zza, zzss.zze, zze3, zzjs.zze, zzss.zzd);
        }
        zzs(zzcn2, zzss.zza, zzss.zze);
        return zzw(zzcn, zzss.zza, 0, zzjs.zze, zzss.zzd);
    }

    private final zzjs zzu(zzcn zzcn, zzss zzss, long j10, long j11) {
        zzss zzss2 = zzss;
        zzcn zzcn2 = zzcn;
        zzcn.zzn(zzss2.zza, this.zza);
        if (zzss.zzb()) {
            return zzv(zzcn, zzss2.zza, zzss2.zzb, zzss2.zzc, j10, zzss2.zzd);
        }
        return zzw(zzcn, zzss2.zza, j11, j10, zzss2.zzd);
    }

    private final zzjs zzv(zzcn zzcn, Object obj, int i10, int i11, long j10, long j11) {
        zzss zzss = new zzss(obj, i10, i11, j11);
        long zzg2 = zzcn.zzn(zzss.zza, this.zza).zzg(zzss.zzb, zzss.zzc);
        if (i11 == this.zza.zze(i10)) {
            this.zza.zzi();
        }
        this.zza.zzl(zzss.zzb);
        long j12 = 0;
        if (zzg2 != -9223372036854775807L && zzg2 <= 0) {
            j12 = Math.max(0, -1 + zzg2);
        }
        return new zzjs(zzss, j12, j10, -9223372036854775807L, zzg2, false, false, false, false);
    }

    private final zzjs zzw(zzcn zzcn, Object obj, long j10, long j11, long j12) {
        long j13;
        long j14;
        long j15;
        zzcn zzcn2 = zzcn;
        Object obj2 = obj;
        long j16 = j10;
        zzcn2.zzn(obj2, this.zza);
        int zzc2 = this.zza.zzc(j16);
        if (zzc2 == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzl(zzc2);
        }
        zzss zzss = new zzss(obj2, j12, zzc2);
        boolean zzC = zzC(zzss);
        boolean zzA = zzA(zzcn2, zzss);
        boolean zzz = zzz(zzcn2, zzss, zzC);
        if (zzc2 != -1) {
            this.zza.zzl(zzc2);
        }
        if (zzc2 != -1) {
            this.zza.zzh(zzc2);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        if (j13 != -9223372036854775807L) {
            j15 = j13;
            j14 = j15;
        } else {
            j14 = this.zza.zze;
            j15 = -9223372036854775807L;
        }
        if (j14 != -9223372036854775807L && j16 >= j14) {
            j16 = Math.max(0, j14 - 1);
        }
        return new zzjs(zzss, j16, j11, j15, j14, false, zzC, zzA, zzz);
    }

    private static zzss zzx(zzcn zzcn, Object obj, long j10, long j11, zzcm zzcm, zzck zzck) {
        zzcn.zzn(obj, zzck);
        zzcn.zze(zzck.zzd, zzcm, 0);
        zzcn.zza(obj);
        if (zzck.zze == 0) {
            zzck.zzb();
        }
        zzcn.zzn(obj, zzck);
        int zzd2 = zzck.zzd(j10);
        if (zzd2 == -1) {
            return new zzss(obj, j11, zzck.zzc(j10));
        }
        return new zzss(obj, zzd2, zzck.zze(zzd2), j11);
    }

    private final void zzy() {
        zzss zzss;
        zzfqh zzi2 = zzfqk.zzi();
        for (zzjr zzjr = this.zzh; zzjr != null; zzjr = zzjr.zzg()) {
            zzi2.zzf(zzjr.zzf.zza);
        }
        zzjr zzjr2 = this.zzi;
        if (zzjr2 == null) {
            zzss = null;
        } else {
            zzss = zzjr2.zzf.zza;
        }
        this.zzd.zzh(new zzjt(this, zzi2, zzss));
    }

    private final boolean zzz(zzcn zzcn, zzss zzss, boolean z10) {
        int zza2 = zzcn.zza(zzss.zza);
        if (!zzcn.zze(zzcn.zzd(zza2, this.zza, false).zzd, this.zzb, 0).zzi) {
            if (zzcn.zzi(zza2, this.zza, this.zzb, this.zzf, this.zzg) != -1 || !z10) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final zzjr zza() {
        zzjr zzjr = this.zzh;
        if (zzjr == null) {
            return null;
        }
        if (zzjr == this.zzi) {
            this.zzi = zzjr.zzg();
        }
        zzjr.zzn();
        int i10 = this.zzk - 1;
        this.zzk = i10;
        if (i10 == 0) {
            this.zzj = null;
            zzjr zzjr2 = this.zzh;
            this.zzl = zzjr2.zzb;
            this.zzm = zzjr2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzjr zzb() {
        zzjr zzjr = this.zzi;
        boolean z10 = false;
        if (!(zzjr == null || zzjr.zzg() == null)) {
            z10 = true;
        }
        zzdl.zzf(z10);
        this.zzi = this.zzi.zzg();
        zzy();
        return this.zzi;
    }

    public final zzjr zzc() {
        return this.zzj;
    }

    public final zzjr zzd() {
        return this.zzh;
    }

    public final zzjr zze() {
        return this.zzi;
    }

    public final zzjs zzf(long j10, zzkh zzkh) {
        zzjr zzjr = this.zzj;
        if (zzjr != null) {
            return zzt(zzkh.zza, zzjr, j10);
        }
        return zzu(zzkh.zza, zzkh.zzb, zzkh.zzc, zzkh.zzr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzjs zzg(com.google.android.gms.internal.ads.zzcn r19, com.google.android.gms.internal.ads.zzjs r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzss r3 = r2.zza
            boolean r12 = zzC(r3)
            boolean r13 = r0.zzA(r1, r3)
            boolean r14 = r0.zzz(r1, r3, r12)
            com.google.android.gms.internal.ads.zzss r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzck r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0037
            int r1 = r3.zze
            if (r1 != r4) goto L_0x0030
            goto L_0x0037
        L_0x0030:
            com.google.android.gms.internal.ads.zzck r9 = r0.zza
            r9.zzh(r1)
            r9 = r5
            goto L_0x0038
        L_0x0037:
            r9 = r7
        L_0x0038:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzck r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzg(r5, r6)
        L_0x0048:
            r7 = r9
            r9 = r5
            goto L_0x0057
        L_0x004b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0052
            r7 = r5
            r9 = r7
            goto L_0x0057
        L_0x0052:
            com.google.android.gms.internal.ads.zzck r1 = r0.zza
            long r5 = r1.zze
            goto L_0x0048
        L_0x0057:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L_0x0065
            com.google.android.gms.internal.ads.zzck r1 = r0.zza
            int r4 = r3.zzb
            r1.zzl(r4)
            goto L_0x006e
        L_0x0065:
            int r1 = r3.zze
            if (r1 == r4) goto L_0x006e
            com.google.android.gms.internal.ads.zzck r4 = r0.zza
            r4.zzl(r1)
        L_0x006e:
            com.google.android.gms.internal.ads.zzjs r15 = new com.google.android.gms.internal.ads.zzjs
            long r4 = r2.zzb
            long r1 = r2.zzc
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzju.zzg(com.google.android.gms.internal.ads.zzcn, com.google.android.gms.internal.ads.zzjs):com.google.android.gms.internal.ads.zzjs");
    }

    public final zzss zzh(zzcn zzcn, Object obj, long j10) {
        long j11;
        int zza2;
        int i10 = zzcn.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 == null || (zza2 = zzcn.zza(obj2)) == -1 || zzcn.zzd(zza2, this.zza, false).zzd != i10) {
            zzjr zzjr = this.zzh;
            while (true) {
                if (zzjr == null) {
                    zzjr zzjr2 = this.zzh;
                    while (true) {
                        if (zzjr2 != null) {
                            int zza3 = zzcn.zza(zzjr2.zzb);
                            if (zza3 != -1 && zzcn.zzd(zza3, this.zza, false).zzd == i10) {
                                j11 = zzjr2.zzf.zza.zzd;
                                break;
                            }
                            zzjr2 = zzjr2.zzg();
                        } else {
                            j11 = this.zze;
                            this.zze = 1 + j11;
                            if (this.zzh == null) {
                                this.zzl = obj;
                                this.zzm = j11;
                            }
                        }
                    }
                } else if (zzjr.zzb.equals(obj)) {
                    j11 = zzjr.zzf.zza.zzd;
                    break;
                } else {
                    zzjr = zzjr.zzg();
                }
            }
        } else {
            j11 = this.zzm;
        }
        long j12 = j11;
        zzcn.zzn(obj, this.zza);
        zzcn.zze(this.zza.zzd, this.zzb, 0);
        int zza4 = zzcn.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzcm zzcm = this.zzb;
            if (zza4 < zzcm.zzo) {
                return zzx(zzcn, obj3, j10, j12, zzcm, this.zza);
            }
            zzcn.zzd(zza4, this.zza, true);
            this.zza.zzb();
            zzck zzck = this.zza;
            if (zzck.zzd(zzck.zze) != -1) {
                obj3 = this.zza.zzc;
                Objects.requireNonNull(obj3);
            }
            zza4--;
        }
    }

    public final void zzi() {
        if (this.zzk != 0) {
            zzjr zzjr = this.zzh;
            zzdl.zzb(zzjr);
            this.zzl = zzjr.zzb;
            this.zzm = zzjr.zzf.zza.zzd;
            while (zzjr != null) {
                zzjr.zzn();
                zzjr = zzjr.zzg();
            }
            this.zzh = null;
            this.zzj = null;
            this.zzi = null;
            this.zzk = 0;
            zzy();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(zzfqh zzfqh, zzss zzss) {
        this.zzc.zzT(zzfqh.zzi(), zzss);
    }

    public final void zzk(long j10) {
        zzjr zzjr = this.zzj;
        if (zzjr != null) {
            zzjr.zzm(j10);
        }
    }

    public final boolean zzl(zzsq zzsq) {
        zzjr zzjr = this.zzj;
        return zzjr != null && zzjr.zza == zzsq;
    }

    public final boolean zzm(zzjr zzjr) {
        boolean z10 = false;
        zzdl.zzf(zzjr != null);
        if (zzjr.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzjr;
        while (zzjr.zzg() != null) {
            zzjr = zzjr.zzg();
            if (zzjr == this.zzi) {
                this.zzi = this.zzh;
                z10 = true;
            }
            zzjr.zzn();
            this.zzk--;
        }
        this.zzj.zzo((zzjr) null);
        zzy();
        return z10;
    }

    public final boolean zzn() {
        zzjr zzjr = this.zzj;
        if (zzjr != null) {
            return !zzjr.zzf.zzi && zzjr.zzr() && this.zzj.zzf.zze != -9223372036854775807L && this.zzk < 100;
        }
        return true;
    }

    public final boolean zzo(zzcn zzcn, long j10, long j11) {
        zzjs zzjs;
        long j12;
        boolean z10;
        zzcn zzcn2 = zzcn;
        zzjr zzjr = this.zzh;
        zzjr zzjr2 = null;
        while (zzjr != null) {
            zzjs zzjs2 = zzjr.zzf;
            if (zzjr2 == null) {
                zzjs = zzg(zzcn2, zzjs2);
                long j13 = j10;
            } else {
                zzjs zzt = zzt(zzcn2, zzjr2, j10);
                if (zzt == null) {
                    return !zzm(zzjr2);
                }
                if (zzjs2.zzb != zzt.zzb || !zzjs2.zza.equals(zzt.zza)) {
                    return !zzm(zzjr2);
                }
                zzjs = zzt;
            }
            zzjr.zzf = zzjs.zza(zzjs2.zzc);
            long j14 = zzjs2.zze;
            int i10 = (j14 > -9223372036854775807L ? 1 : (j14 == -9223372036854775807L ? 0 : -1));
            long j15 = zzjs.zze;
            if (i10 == 0 || j14 == j15) {
                zzjr2 = zzjr;
                zzjr = zzjr.zzg();
            } else {
                zzjr.zzq();
                long j16 = zzjs.zze;
                if (j16 == -9223372036854775807L) {
                    j12 = Long.MAX_VALUE;
                } else {
                    j12 = j16 + zzjr.zze();
                }
                if (zzjr == this.zzi) {
                    boolean z11 = zzjr.zzf.zzf;
                    if (j11 == Long.MIN_VALUE || j11 >= j12) {
                        z10 = true;
                        return zzm(zzjr) && !z10;
                    }
                }
                z10 = false;
                if (zzm(zzjr)) {
                }
            }
        }
        return true;
    }

    public final boolean zzp(zzcn zzcn, int i10) {
        this.zzf = i10;
        return zzB(zzcn);
    }

    public final boolean zzq(zzcn zzcn, boolean z10) {
        this.zzg = z10;
        return zzB(zzcn);
    }

    public final zzjr zzr(zzko[] zzkoArr, zzwk zzwk, zzwt zzwt, zzkg zzkg, zzjs zzjs, zzwl zzwl) {
        long j10;
        zzjr zzjr = this.zzj;
        if (zzjr == null) {
            j10 = 1000000000000L;
            zzjs zzjs2 = zzjs;
        } else {
            j10 = (zzjr.zze() + zzjr.zzf.zze) - zzjs.zzb;
        }
        zzjr zzjr2 = new zzjr(zzkoArr, j10, zzwk, zzwt, zzkg, zzjs, zzwl, (byte[]) null);
        zzjr zzjr3 = this.zzj;
        if (zzjr3 != null) {
            zzjr3.zzo(zzjr2);
        } else {
            this.zzh = zzjr2;
            this.zzi = zzjr2;
        }
        this.zzl = null;
        this.zzj = zzjr2;
        this.zzk++;
        zzy();
        return zzjr2;
    }
}
