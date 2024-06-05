package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zznf implements zzlb {
    private final zzdm zza;
    private final zzck zzb;
    private final zzcm zzc = new zzcm();
    private final zzne zzd;
    private final SparseArray zze;
    private zzeb zzf;
    private zzcg zzg;
    private zzdv zzh;
    private boolean zzi;

    public zznf(zzdm zzdm) {
        Objects.requireNonNull(zzdm);
        this.zza = zzdm;
        this.zzf = new zzeb(zzew.zzE(), zzdm, zzll.zza);
        zzck zzck = new zzck();
        this.zzb = zzck;
        this.zzd = new zzne(zzck);
        this.zze = new SparseArray();
    }

    public static /* synthetic */ void zzW(zznf zznf) {
        zzlc zzU = zznf.zzU();
        zznf.zzZ(zzU, 1028, new zzmb(zzU));
        zznf.zzf.zze();
    }

    private final zzlc zzaa(zzss zzss) {
        zzcn zzcn;
        Objects.requireNonNull(this.zzg);
        if (zzss == null) {
            zzcn = null;
        } else {
            zzcn = this.zzd.zza(zzss);
        }
        if (zzss != null && zzcn != null) {
            return zzV(zzcn, zzcn.zzn(zzss.zza, this.zzb).zzd, zzss);
        }
        int zzg2 = this.zzg.zzg();
        zzcn zzq = this.zzg.zzq();
        if (zzg2 >= zzq.zzc()) {
            zzq = zzcn.zza;
        }
        return zzV(zzq, zzg2, (zzss) null);
    }

    private final zzlc zzab(int i10, zzss zzss) {
        zzcg zzcg = this.zzg;
        Objects.requireNonNull(zzcg);
        if (zzss == null) {
            zzcn zzq = zzcg.zzq();
            if (i10 >= zzq.zzc()) {
                zzq = zzcn.zza;
            }
            return zzV(zzq, i10, (zzss) null);
        } else if (this.zzd.zza(zzss) != null) {
            return zzaa(zzss);
        } else {
            return zzV(zzcn.zza, i10, zzss);
        }
    }

    private final zzlc zzac() {
        return zzaa(this.zzd.zzd());
    }

    private final zzlc zzad() {
        return zzaa(this.zzd.zze());
    }

    private final zzlc zzae(zzbw zzbw) {
        zzbn zzbn;
        if (!(zzbw instanceof zzhj) || (zzbn = ((zzhj) zzbw).zzj) == null) {
            return zzU();
        }
        return zzaa(new zzss(zzbn));
    }

    public final void zzA(String str) {
        zzlc zzad = zzad();
        zzZ(zzad, 1012, new zznd(zzad, str));
    }

    public final void zzB(zzhb zzhb) {
        zzlc zzac = zzac();
        zzZ(zzac, 1013, new zzmt(zzac, zzhb));
    }

    public final void zzC(zzhb zzhb) {
        zzlc zzad = zzad();
        zzZ(zzad, 1007, new zzmi(zzad, zzhb));
    }

    public final void zzD(zzaf zzaf, zzhc zzhc) {
        zzlc zzad = zzad();
        zzZ(zzad, 1009, new zzms(zzad, zzaf, zzhc));
    }

    public final void zzE(long j10) {
        zzlc zzad = zzad();
        zzZ(zzad, 1010, new zzmv(zzad, j10));
    }

    public final void zzF(Exception exc) {
        zzlc zzad = zzad();
        zzZ(zzad, 1014, new zzlq(zzad, exc));
    }

    public final void zzG(int i10, long j10, long j11) {
        zzlc zzad = zzad();
        zzZ(zzad, 1011, new zzli(zzad, i10, j10, j11));
    }

    public final void zzH(int i10, long j10) {
        zzlc zzac = zzac();
        zzZ(zzac, 1018, new zzmd(zzac, i10, j10));
    }

    public final void zzI(Object obj, long j10) {
        zzlc zzad = zzad();
        zzZ(zzad, 26, new zzmz(zzad, obj, j10));
    }

    public final void zzJ(Exception exc) {
        zzlc zzad = zzad();
        zzZ(zzad, 1030, new zzlo(zzad, exc));
    }

    public final void zzK(String str, long j10, long j11) {
        zzlc zzad = zzad();
        zzZ(zzad, 1016, new zzlz(zzad, str, j11, j10));
    }

    public final void zzL(String str) {
        zzlc zzad = zzad();
        zzZ(zzad, 1019, new zzlh(zzad, str));
    }

    public final void zzM(zzhb zzhb) {
        zzlc zzac = zzac();
        zzZ(zzac, 1020, new zzmy(zzac, zzhb));
    }

    public final void zzN(zzhb zzhb) {
        zzlc zzad = zzad();
        zzZ(zzad, 1015, new zzme(zzad, zzhb));
    }

    public final void zzO(long j10, int i10) {
        zzlc zzac = zzac();
        zzZ(zzac, 1021, new zzlr(zzac, j10, i10));
    }

    public final void zzP(zzaf zzaf, zzhc zzhc) {
        zzlc zzad = zzad();
        zzZ(zzad, 1017, new zzlg(zzad, zzaf, zzhc));
    }

    public final void zzQ() {
        zzdv zzdv = this.zzh;
        zzdl.zzb(zzdv);
        zzdv.zzh(new zzmu(this));
    }

    public final void zzR(zzle zzle) {
        this.zzf.zzf(zzle);
    }

    public final void zzS(zzcg zzcg, Looper looper) {
        boolean z10 = true;
        if (this.zzg != null && !this.zzd.zzb.isEmpty()) {
            z10 = false;
        }
        zzdl.zzf(z10);
        Objects.requireNonNull(zzcg);
        this.zzg = zzcg;
        this.zzh = this.zza.zzb(looper, (Handler.Callback) null);
        this.zzf = this.zzf.zza(looper, new zzly(this, zzcg));
    }

    public final void zzT(List list, zzss zzss) {
        zzne zzne = this.zzd;
        zzcg zzcg = this.zzg;
        Objects.requireNonNull(zzcg);
        zzne.zzh(list, zzss, zzcg);
    }

    /* access modifiers changed from: protected */
    public final zzlc zzU() {
        return zzaa(this.zzd.zzb());
    }

    /* access modifiers changed from: protected */
    public final zzlc zzV(zzcn zzcn, int i10, zzss zzss) {
        zzcn zzcn2 = zzcn;
        int i11 = i10;
        boolean z10 = true;
        zzss zzss2 = true == zzcn.zzo() ? null : zzss;
        long zza2 = this.zza.zza();
        if (!zzcn2.equals(this.zzg.zzq()) || i11 != this.zzg.zzg()) {
            z10 = false;
        }
        long j10 = 0;
        if (zzss2 == null || !zzss2.zzb()) {
            if (z10) {
                j10 = this.zzg.zzm();
            } else if (!zzcn.zzo()) {
                long j11 = zzcn2.zze(i11, this.zzc, 0).zzm;
                j10 = zzew.zzz(0);
            }
        } else if (z10 && this.zzg.zze() == zzss2.zzb && this.zzg.zzf() == zzss2.zzc) {
            j10 = this.zzg.zzn();
        }
        return new zzlc(zza2, zzcn, i10, zzss2, j10, this.zzg.zzq(), this.zzg.zzg(), this.zzd.zzb(), this.zzg.zzn(), this.zzg.zzp());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzX(zzcg zzcg, zzle zzle, zzaa zzaa) {
        zzle.zzi(zzcg, new zzld(zzaa, this.zze));
    }

    public final void zzY(int i10, long j10, long j11) {
        zzlc zzaa = zzaa(this.zzd.zzc());
        zzZ(zzaa, 1006, new zzlp(zzaa, i10, j10, j11));
    }

    /* access modifiers changed from: protected */
    public final void zzZ(zzlc zzlc, int i10, zzdy zzdy) {
        this.zze.put(i10, zzlc);
        zzeb zzeb = this.zzf;
        zzeb.zzd(i10, zzdy);
        zzeb.zzc();
    }

    public final void zza(zzcc zzcc) {
        zzlc zzU = zzU();
        zzZ(zzU, 13, new zzlt(zzU, zzcc));
    }

    public final void zzaf(int i10, zzss zzss, zzso zzso) {
        zzlc zzab = zzab(i10, zzss);
        zzZ(zzab, 1004, new zzln(zzab, zzso));
    }

    public final void zzag(int i10, zzss zzss, zzsj zzsj, zzso zzso) {
        zzlc zzab = zzab(i10, zzss);
        zzZ(zzab, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, new zzmf(zzab, zzsj, zzso));
    }

    public final void zzah(int i10, zzss zzss, zzsj zzsj, zzso zzso) {
        zzlc zzab = zzab(i10, zzss);
        zzZ(zzab, AdError.NO_FILL_ERROR_CODE, new zzmp(zzab, zzsj, zzso));
    }

    public final void zzai(int i10, zzss zzss, zzsj zzsj, zzso zzso, IOException iOException, boolean z10) {
        zzlc zzab = zzab(i10, zzss);
        zzZ(zzab, 1003, new zzma(zzab, zzsj, zzso, iOException, z10));
    }

    public final void zzaj(int i10, zzss zzss, zzsj zzsj, zzso zzso) {
        zzlc zzab = zzab(i10, zzss);
        zzZ(zzab, 1000, new zzmj(zzab, zzsj, zzso));
    }

    public final void zzb(zzt zzt) {
        zzlc zzU = zzU();
        zzZ(zzU, 29, new zzlu(zzU, zzt));
    }

    public final void zzc(int i10, boolean z10) {
        zzlc zzU = zzU();
        zzZ(zzU, 30, new zzlx(zzU, i10, z10));
    }

    public final void zzd(boolean z10) {
        zzlc zzU = zzU();
        zzZ(zzU, 3, new zznc(zzU, z10));
    }

    public final void zze(boolean z10) {
        zzlc zzU = zzU();
        zzZ(zzU, 7, new zzml(zzU, z10));
    }

    public final void zzf(zzbg zzbg, int i10) {
        zzlc zzU = zzU();
        zzZ(zzU, 1, new zzmo(zzU, zzbg, i10));
    }

    public final void zzg(zzbm zzbm) {
        zzlc zzU = zzU();
        zzZ(zzU, 14, new zzmr(zzU, zzbm));
    }

    public final void zzh(boolean z10, int i10) {
        zzlc zzU = zzU();
        zzZ(zzU, 5, new zzmk(zzU, z10, i10));
    }

    public final void zzi(zzby zzby) {
        zzlc zzU = zzU();
        zzZ(zzU, 12, new zzlk(zzU, zzby));
    }

    public final void zzj(int i10) {
        zzlc zzU = zzU();
        zzZ(zzU, 4, new zzmn(zzU, i10));
    }

    public final void zzk(int i10) {
        zzlc zzU = zzU();
        zzZ(zzU, 6, new zznb(zzU, i10));
    }

    public final void zzl(zzbw zzbw) {
        zzlc zzae = zzae(zzbw);
        zzZ(zzae, 10, new zzmg(zzae, zzbw));
    }

    public final void zzm(zzbw zzbw) {
        zzlc zzae = zzae(zzbw);
        zzZ(zzae, 10, new zzmq(zzae, zzbw));
    }

    public final void zzn(boolean z10, int i10) {
        zzlc zzU = zzU();
        zzZ(zzU, -1, new zzlf(zzU, z10, i10));
    }

    public final void zzo(zzcf zzcf, zzcf zzcf2, int i10) {
        if (i10 == 1) {
            this.zzi = false;
            i10 = 1;
        }
        zzne zzne = this.zzd;
        zzcg zzcg = this.zzg;
        Objects.requireNonNull(zzcg);
        zzne.zzg(zzcg);
        zzlc zzU = zzU();
        zzZ(zzU, 11, new zzls(zzU, i10, zzcf, zzcf2));
    }

    public final void zzp() {
        zzlc zzU = zzU();
        zzZ(zzU, -1, new zzlm(zzU));
    }

    public final void zzq(boolean z10) {
        zzlc zzad = zzad();
        zzZ(zzad, 23, new zzmm(zzad, z10));
    }

    public final void zzr(int i10, int i11) {
        zzlc zzad = zzad();
        zzZ(zzad, 24, new zzna(zzad, i10, i11));
    }

    public final void zzs(zzcn zzcn, int i10) {
        zzne zzne = this.zzd;
        zzcg zzcg = this.zzg;
        Objects.requireNonNull(zzcg);
        zzne.zzi(zzcg);
        zzlc zzU = zzU();
        zzZ(zzU, 0, new zzmc(zzU, i10));
    }

    public final void zzt(zzcy zzcy) {
        zzlc zzU = zzU();
        zzZ(zzU, 2, new zzlv(zzU, zzcy));
    }

    public final void zzu(zzda zzda) {
        zzlc zzad = zzad();
        zzZ(zzad, 25, new zzmx(zzad, zzda));
    }

    public final void zzv(float f10) {
        zzlc zzad = zzad();
        zzZ(zzad, 22, new zzlj(zzad, f10));
    }

    public final void zzw(zzle zzle) {
        this.zzf.zzb(zzle);
    }

    public final void zzx() {
        if (!this.zzi) {
            zzlc zzU = zzU();
            this.zzi = true;
            zzZ(zzU, -1, new zzmw(zzU));
        }
    }

    public final void zzy(Exception exc) {
        zzlc zzad = zzad();
        zzZ(zzad, 1029, new zzlw(zzad, exc));
    }

    public final void zzz(String str, long j10, long j11) {
        zzlc zzad = zzad();
        zzZ(zzad, 1008, new zzmh(zzad, str, j11, j10));
    }
}
