package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfcr {
    final /* synthetic */ zzfcs zza;
    private final Object zzb;
    private final String zzc;
    private final zzfut zzd;
    private final List zze;
    private final zzfut zzf;

    private zzfcr(zzfcs zzfcs, Object obj, String str, zzfut zzfut, List list, zzfut zzfut2) {
        this.zza = zzfcs;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = zzfut;
        this.zze = list;
        this.zzf = zzfut2;
    }

    /* synthetic */ zzfcr(zzfcs zzfcs, Object obj, String str, zzfut zzfut, List list, zzfut zzfut2, zzfcq zzfcq) {
        this(zzfcs, obj, (String) null, zzfut, list, zzfut2);
    }

    public final zzfcf zza() {
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        zzfcf zzfcf = new zzfcf(obj, str, this.zzf);
        this.zza.zzd.zza(zzfcf);
        zzfut zzfut = this.zzd;
        zzfcl zzfcl = new zzfcl(this, zzfcf);
        zzfuu zzfuu = zzbzn.zzf;
        zzfut.zzc(zzfcl, zzfuu);
        zzfuj.zzq(zzfcf, new zzfcp(this, zzfcf), zzfuu);
        return zzfcf;
    }

    public final zzfcr zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfcr zzc(Class cls, zzftq zzftq) {
        zzfcs zzfcs = this.zza;
        return new zzfcr(zzfcs, this.zzb, this.zzc, this.zzd, this.zze, zzfuj.zzf(this.zzf, cls, zzftq, zzfcs.zzb));
    }

    public final zzfcr zzd(zzfut zzfut) {
        return zzg(new zzfcm(zzfut), zzbzn.zzf);
    }

    public final zzfcr zze(zzfcd zzfcd) {
        return zzf(new zzfco(zzfcd));
    }

    public final zzfcr zzf(zzftq zzftq) {
        return zzg(zzftq, this.zza.zzb);
    }

    public final zzfcr zzg(zzftq zzftq, Executor executor) {
        return new zzfcr(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfuj.zzm(this.zzf, zzftq, executor));
    }

    public final zzfcr zzh(String str) {
        return new zzfcr(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfcr zzi(long j10, TimeUnit timeUnit) {
        zzfcs zzfcs = this.zza;
        return new zzfcr(zzfcs, this.zzb, this.zzc, this.zzd, this.zze, zzfuj.zzn(this.zzf, j10, timeUnit, zzfcs.zzc));
    }
}
