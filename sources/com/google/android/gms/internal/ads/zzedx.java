package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzedx extends zzedz {
    private final zzcgd zza;
    private final zzden zzb;
    private final zzctx zzc;
    private final zzdab zzd;
    private final zzeeh zze;

    public zzedx(zzcgd zzcgd, zzden zzden, zzctx zzctx, zzdab zzdab, zzeeh zzeeh) {
        this.zza = zzcgd;
        this.zzb = zzden;
        this.zzc = zzctx;
        this.zzd = zzdab;
        this.zze = zzeeh;
    }

    /* access modifiers changed from: protected */
    public final zzfut zzc(zzeyx zzeyx, Bundle bundle, zzeyc zzeyc, zzeyo zzeyo) {
        zzder zzg = this.zza.zzg();
        zzctx zzctx = this.zzc;
        zzctx.zzh(zzeyx);
        zzctx.zze(bundle);
        zzctx.zzf(new zzctr(zzeyo, zzeyc, this.zze));
        zzg.zzf(zzctx.zzi());
        zzg.zze(this.zzd);
        zzg.zzd(this.zzb);
        zzg.zzc(new zzcoh((ViewGroup) null));
        zzcrt zza2 = zzg.zzg().zza();
        return zza2.zzi(zza2.zzj());
    }
}
