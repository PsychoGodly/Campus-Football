package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
abstract class zzagy {
    private final zzagr zza = new zzagr();
    private zzabb zzb;
    private zzzx zzc;
    private zzagt zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private zzagv zzj = new zzagv();
    private long zzk;
    private boolean zzl;
    private boolean zzm;

    /* access modifiers changed from: protected */
    public abstract long zza(zzen zzen);

    /* access modifiers changed from: protected */
    public void zzb(boolean z10) {
        int i10;
        if (z10) {
            this.zzj = new zzagv();
            this.zzf = 0;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.zzh = i10;
        this.zze = -1;
        this.zzg = 0;
    }

    /* access modifiers changed from: protected */
    public abstract boolean zzc(zzen zzen, long j10, zzagv zzagv) throws IOException;

    /* access modifiers changed from: package-private */
    public final int zze(zzzv zzzv, zzaau zzaau) throws IOException {
        zzzv zzzv2 = zzzv;
        zzdl.zzb(this.zzb);
        int i10 = zzew.zza;
        int i11 = this.zzh;
        if (i11 == 0) {
            while (this.zza.zze(zzzv2)) {
                long zzf2 = zzzv.zzf();
                long j10 = this.zzf;
                this.zzk = zzf2 - j10;
                if (zzc(this.zza.zza(), j10, this.zzj)) {
                    this.zzf = zzzv.zzf();
                } else {
                    zzaf zzaf = this.zzj.zza;
                    this.zzi = zzaf.zzA;
                    if (!this.zzm) {
                        this.zzb.zzk(zzaf);
                        this.zzm = true;
                    }
                    zzagt zzagt = this.zzj.zzb;
                    if (zzagt != null) {
                        this.zzd = zzagt;
                    } else if (zzzv.zzd() == -1) {
                        this.zzd = new zzagx((zzagw) null);
                    } else {
                        zzags zzb2 = this.zza.zzb();
                        this.zzd = new zzagm(this, this.zzf, zzzv.zzd(), (long) (zzb2.zzd + zzb2.zze), zzb2.zzb, (zzb2.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                    return 0;
                }
            }
            this.zzh = 3;
            return -1;
        } else if (i11 == 1) {
            ((zzzk) zzzv2).zzo((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        } else if (i11 != 2) {
            return -1;
        } else {
            long zzd2 = this.zzd.zzd(zzzv2);
            if (zzd2 >= 0) {
                zzaau.zza = zzd2;
                return 1;
            }
            if (zzd2 < -1) {
                zzi(-(zzd2 + 2));
            }
            if (!this.zzl) {
                zzaax zze2 = this.zzd.zze();
                zzdl.zzb(zze2);
                this.zzc.zzN(zze2);
                this.zzl = true;
            }
            if (this.zzk > 0 || this.zza.zze(zzzv2)) {
                this.zzk = 0;
                zzen zza2 = this.zza.zza();
                long zza3 = zza(zza2);
                if (zza3 >= 0) {
                    long j11 = this.zzg;
                    if (j11 + zza3 >= this.zze) {
                        long zzf3 = zzf(j11);
                        zzaaz.zzb(this.zzb, zza2, zza2.zzd());
                        this.zzb.zzs(zzf3, 1, zza2.zzd(), 0, (zzaba) null);
                        this.zze = -1;
                    }
                }
                this.zzg += zza3;
                return 0;
            }
            this.zzh = 3;
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    public final long zzf(long j10) {
        return (j10 * 1000000) / ((long) this.zzi);
    }

    /* access modifiers changed from: protected */
    public final long zzg(long j10) {
        return (((long) this.zzi) * j10) / 1000000;
    }

    /* access modifiers changed from: package-private */
    public final void zzh(zzzx zzzx, zzabb zzabb) {
        this.zzc = zzzx;
        this.zzb = zzabb;
        zzb(true);
    }

    /* access modifiers changed from: protected */
    public void zzi(long j10) {
        this.zzg = j10;
    }

    /* access modifiers changed from: package-private */
    public final void zzj(long j10, long j11) {
        this.zza.zzc();
        if (j10 == 0) {
            zzb(!this.zzl);
        } else if (this.zzh != 0) {
            long zzg2 = zzg(j11);
            this.zze = zzg2;
            zzagt zzagt = this.zzd;
            int i10 = zzew.zza;
            zzagt.zzg(zzg2);
            this.zzh = 2;
        }
    }
}
