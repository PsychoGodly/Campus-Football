package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzkh {
    private static final zzss zzs = new zzss(new Object());
    public final zzcn zza;
    public final zzss zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzhj zzf;
    public final boolean zzg;
    public final zzur zzh;
    public final zzwl zzi;
    public final List zzj;
    public final zzss zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzby zzn;
    public final boolean zzo;
    public volatile long zzp;
    public volatile long zzq;
    public volatile long zzr;

    public zzkh(zzcn zzcn, zzss zzss, long j10, long j11, int i10, zzhj zzhj, boolean z10, zzur zzur, zzwl zzwl, List list, zzss zzss2, boolean z11, int i11, zzby zzby, long j12, long j13, long j14, boolean z12) {
        this.zza = zzcn;
        this.zzb = zzss;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = i10;
        this.zzf = zzhj;
        this.zzg = z10;
        this.zzh = zzur;
        this.zzi = zzwl;
        this.zzj = list;
        this.zzk = zzss2;
        this.zzl = z11;
        this.zzm = i11;
        this.zzn = zzby;
        this.zzp = j12;
        this.zzq = j13;
        this.zzr = j14;
        this.zzo = z12;
    }

    public static zzkh zzg(zzwl zzwl) {
        zzcn zzcn = zzcn.zza;
        zzss zzss = zzs;
        return new zzkh(zzcn, zzss, -9223372036854775807L, 0, 1, (zzhj) null, false, zzur.zza, zzwl, zzfqk.zzo(), zzss, false, 0, zzby.zza, 0, 0, 0, false);
    }

    public static zzss zzh() {
        return zzs;
    }

    public final zzkh zza(zzss zzss) {
        zzcn zzcn = this.zza;
        return new zzkh(zzcn, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzss, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzo);
    }

    public final zzkh zzb(zzss zzss, long j10, long j11, long j12, long j13, zzur zzur, zzwl zzwl, List list) {
        long j14 = j10;
        zzur zzur2 = zzur;
        zzwl zzwl2 = zzwl;
        List list2 = list;
        zzcn zzcn = this.zza;
        return new zzkh(zzcn, zzss, j11, j12, this.zze, this.zzf, this.zzg, zzur2, zzwl2, list2, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, j13, j14, this.zzo);
    }

    public final zzkh zzc(boolean z10, int i10) {
        zzcn zzcn = this.zza;
        return new zzkh(zzcn, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z10, i10, this.zzn, this.zzp, this.zzq, this.zzr, this.zzo);
    }

    public final zzkh zzd(zzhj zzhj) {
        zzcn zzcn = this.zza;
        return new zzkh(zzcn, this.zzb, this.zzc, this.zzd, this.zze, zzhj, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzo);
    }

    public final zzkh zze(int i10) {
        zzcn zzcn = this.zza;
        return new zzkh(zzcn, this.zzb, this.zzc, this.zzd, i10, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzo);
    }

    public final zzkh zzf(zzcn zzcn) {
        return new zzkh(zzcn, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzo);
    }
}
