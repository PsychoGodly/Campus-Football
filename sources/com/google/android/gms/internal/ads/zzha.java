package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzha implements zzkn, zzko {
    private final int zza;
    private final zzjo zzb = new zzjo();
    private zzkp zzc;
    private int zzd;
    private zzno zze;
    private int zzf;
    private zzuj zzg;
    private zzaf[] zzh;
    private long zzi;
    private long zzj = Long.MIN_VALUE;
    private boolean zzk;
    private boolean zzl;

    public zzha(int i10) {
        this.zza = i10;
    }

    private final void zzP(long j10, boolean z10) throws zzhj {
        this.zzk = false;
        this.zzj = j10;
        zzu(j10, z10);
    }

    public final void zzA() {
        zzdl.zzf(this.zzf == 0);
        zzjo zzjo = this.zzb;
        zzjo.zzb = null;
        zzjo.zza = null;
        zzv();
    }

    public final void zzB(long j10) throws zzhj {
        zzP(j10, false);
    }

    public final void zzC() {
        this.zzk = true;
    }

    public /* synthetic */ void zzD(float f10, float f11) {
    }

    public final void zzE() throws zzhj {
        boolean z10 = true;
        if (this.zzf != 1) {
            z10 = false;
        }
        zzdl.zzf(z10);
        this.zzf = 2;
        zzw();
    }

    public final void zzF() {
        zzdl.zzf(this.zzf == 2);
        this.zzf = 1;
        zzx();
    }

    public final boolean zzG() {
        return this.zzj == Long.MIN_VALUE;
    }

    public final boolean zzH() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    public final boolean zzI() {
        if (zzG()) {
            return this.zzk;
        }
        zzuj zzuj = this.zzg;
        Objects.requireNonNull(zzuj);
        return zzuj.zze();
    }

    /* access modifiers changed from: protected */
    public final zzaf[] zzJ() {
        zzaf[] zzafArr = this.zzh;
        Objects.requireNonNull(zzafArr);
        return zzafArr;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzbc() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final int zzbd(zzjo zzjo, zzgr zzgr, int i10) {
        zzuj zzuj = this.zzg;
        Objects.requireNonNull(zzuj);
        int zza2 = zzuj.zza(zzjo, zzgr, i10);
        if (zza2 == -4) {
            if (zzgr.zzg()) {
                this.zzj = Long.MIN_VALUE;
                return this.zzk ? -4 : -3;
            }
            long j10 = zzgr.zzd + this.zzi;
            zzgr.zzd = j10;
            this.zzj = Math.max(this.zzj, j10);
        } else if (zza2 == -5) {
            zzaf zzaf = zzjo.zza;
            Objects.requireNonNull(zzaf);
            long j11 = zzaf.zzq;
            if (j11 != Long.MAX_VALUE) {
                zzad zzb2 = zzaf.zzb();
                zzb2.zzW(j11 + this.zzi);
                zzjo.zza = zzb2.zzY();
                return -5;
            }
        }
        return zza2;
    }

    /* access modifiers changed from: protected */
    public final zzhj zzbe(Throwable th, zzaf zzaf, boolean z10, int i10) {
        int i11;
        if (zzaf != null && !this.zzl) {
            this.zzl = true;
            try {
                int zzO = zzO(zzaf) & 7;
                this.zzl = false;
                i11 = zzO;
            } catch (zzhj unused) {
                this.zzl = false;
            } catch (Throwable th2) {
                this.zzl = false;
                throw th2;
            }
            return zzhj.zzb(th, zzK(), this.zzd, zzaf, i11, z10, i10);
        }
        i11 = 4;
        return zzhj.zzb(th, zzK(), this.zzd, zzaf, i11, z10, i10);
    }

    /* access modifiers changed from: protected */
    public final int zzd(long j10) {
        zzuj zzuj = this.zzg;
        Objects.requireNonNull(zzuj);
        return zzuj.zzb(j10 - this.zzi);
    }

    public int zze() throws zzhj {
        return 0;
    }

    public final long zzf() {
        return this.zzj;
    }

    /* access modifiers changed from: protected */
    public final zzjo zzh() {
        zzjo zzjo = this.zzb;
        zzjo.zzb = null;
        zzjo.zza = null;
        return zzjo;
    }

    public zzjq zzi() {
        return null;
    }

    public final zzko zzj() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final zzkp zzk() {
        zzkp zzkp = this.zzc;
        Objects.requireNonNull(zzkp);
        return zzkp;
    }

    /* access modifiers changed from: protected */
    public final zzno zzl() {
        zzno zzno = this.zze;
        Objects.requireNonNull(zzno);
        return zzno;
    }

    public final zzuj zzm() {
        return this.zzg;
    }

    public final void zzn() {
        boolean z10 = true;
        if (this.zzf != 1) {
            z10 = false;
        }
        zzdl.zzf(z10);
        zzjo zzjo = this.zzb;
        zzjo.zzb = null;
        zzjo.zza = null;
        this.zzf = 0;
        this.zzg = null;
        this.zzh = null;
        this.zzk = false;
        zzs();
    }

    public final void zzo(zzkp zzkp, zzaf[] zzafArr, zzuj zzuj, long j10, boolean z10, boolean z11, long j11, long j12) throws zzhj {
        boolean z12 = z10;
        zzdl.zzf(this.zzf == 0);
        this.zzc = zzkp;
        this.zzf = 1;
        zzt(z10, z11);
        zzz(zzafArr, zzuj, j11, j12);
        long j13 = j10;
        zzP(j10, z10);
    }

    public void zzp(int i10, Object obj) throws zzhj {
    }

    public final void zzq(int i10, zzno zzno) {
        this.zzd = i10;
        this.zze = zzno;
    }

    public final void zzr() throws IOException {
        zzuj zzuj = this.zzg;
        Objects.requireNonNull(zzuj);
        zzuj.zzd();
    }

    /* access modifiers changed from: protected */
    public void zzs() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzt(boolean z10, boolean z11) throws zzhj {
    }

    /* access modifiers changed from: protected */
    public void zzu(long j10, boolean z10) throws zzhj {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzv() {
    }

    /* access modifiers changed from: protected */
    public void zzw() throws zzhj {
    }

    /* access modifiers changed from: protected */
    public void zzx() {
    }

    /* access modifiers changed from: protected */
    public void zzy(zzaf[] zzafArr, long j10, long j11) throws zzhj {
        throw null;
    }

    public final void zzz(zzaf[] zzafArr, zzuj zzuj, long j10, long j11) throws zzhj {
        zzdl.zzf(!this.zzk);
        this.zzg = zzuj;
        if (this.zzj == Long.MIN_VALUE) {
            this.zzj = j10;
        }
        this.zzh = zzafArr;
        this.zzi = j11;
        zzy(zzafArr, j10, j11);
    }
}
