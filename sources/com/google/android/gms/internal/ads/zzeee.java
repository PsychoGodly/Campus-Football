package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeee extends zzedz {
    private final zzcgd zza;
    private final zzctx zzb;
    private final zzdab zzc;
    private final zzeeh zzd;
    private final zzeyp zze;

    public zzeee(zzcgd zzcgd, zzctx zzctx, zzdab zzdab, zzeyp zzeyp, zzeeh zzeeh) {
        this.zza = zzcgd;
        this.zzb = zzctx;
        this.zzc = zzdab;
        this.zze = zzeyp;
        this.zzd = zzeeh;
    }

    /* access modifiers changed from: protected */
    public final zzfut zzc(zzeyx zzeyx, Bundle bundle, zzeyc zzeyc, zzeyo zzeyo) {
        zzeyp zzeyp;
        zzctx zzctx = this.zzb;
        zzctx.zzh(zzeyx);
        zzctx.zze(bundle);
        zzctx.zzf(new zzctr(zzeyo, zzeyc, this.zzd));
        if (((Boolean) a0.c().zzb(zzbar.zzdc)).booleanValue() && (zzeyp = this.zze) != null) {
            this.zzb.zzg(zzeyp);
        }
        zzdly zzh = this.zza.zzh();
        zzh.zzd(this.zzb.zzi());
        zzh.zzc(this.zzc);
        zzcrt zzb2 = zzh.zze().zzb();
        return zzb2.zzi(zzb2.zzj());
    }
}
