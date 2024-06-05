package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeec extends zzedz {
    private final zzcgd zza;
    private final zzctx zzb;
    private final zzegk zzc;
    private final zzdab zzd;
    private final zzeeh zze;

    public zzeec(zzcgd zzcgd, zzctx zzctx, zzegk zzegk, zzdab zzdab, zzeeh zzeeh) {
        this.zza = zzcgd;
        this.zzb = zzctx;
        this.zzc = zzegk;
        this.zzd = zzdab;
        this.zze = zzeeh;
    }

    /* access modifiers changed from: protected */
    public final zzfut zzc(zzeyx zzeyx, Bundle bundle, zzeyc zzeyc, zzeyo zzeyo) {
        zzddv zzf = this.zza.zzf();
        zzctx zzctx = this.zzb;
        zzctx.zzh(zzeyx);
        zzctx.zze(bundle);
        zzctx.zzf(new zzctr(zzeyo, zzeyc, this.zze));
        zzf.zze(zzctx.zzi());
        zzf.zzd(this.zzd);
        zzf.zzc(this.zzc);
        zzcrt zza2 = zzf.zzf().zza();
        return zza2.zzi(zza2.zzj());
    }
}
