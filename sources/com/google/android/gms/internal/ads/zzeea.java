package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeea extends zzedz {
    private final zzcgd zza;
    private final zzctx zzb;
    private final zzegk zzc;
    private final zzdab zzd;
    private final zzden zze;
    private final zzcxd zzf;
    private final ViewGroup zzg;
    private final zzczk zzh;
    private final zzeeh zzi;

    public zzeea(zzcgd zzcgd, zzctx zzctx, zzegk zzegk, zzdab zzdab, zzden zzden, zzcxd zzcxd, ViewGroup viewGroup, zzczk zzczk, zzeeh zzeeh) {
        this.zza = zzcgd;
        this.zzb = zzctx;
        this.zzc = zzegk;
        this.zzd = zzdab;
        this.zze = zzden;
        this.zzf = zzcxd;
        this.zzg = viewGroup;
        this.zzh = zzczk;
        this.zzi = zzeeh;
    }

    /* access modifiers changed from: protected */
    public final zzfut zzc(zzeyx zzeyx, Bundle bundle, zzeyc zzeyc, zzeyo zzeyo) {
        zzcpg zzd2 = this.zza.zzd();
        zzctx zzctx = this.zzb;
        zzctx.zzh(zzeyx);
        zzctx.zze(bundle);
        zzctx.zzf(new zzctr(zzeyo, zzeyc, this.zzi));
        zzd2.zzi(zzctx.zzi());
        zzd2.zzf(this.zzd);
        zzd2.zze(this.zzc);
        zzd2.zzd(this.zze);
        zzd2.zzg(new zzcqe(this.zzf, this.zzh));
        zzd2.zzc(new zzcoh(this.zzg));
        zzcrt zzd3 = zzd2.zzj().zzd();
        return zzd3.zzi(zzd3.zzj());
    }
}
