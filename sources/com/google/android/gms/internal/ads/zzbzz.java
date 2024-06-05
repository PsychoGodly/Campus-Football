package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzbzz {
    private final zzbzs zza;
    /* access modifiers changed from: private */
    public final AtomicInteger zzb = new AtomicInteger(0);

    public zzbzz() {
        zzbzs zzbzs = new zzbzs();
        this.zza = zzbzs;
        zzfuj.zzq(zzbzs, new zzbzx(this), zzbzn.zzf);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zze(new Exception());
    }

    @Deprecated
    public final void zzh(Object obj) {
        this.zza.zzd(obj);
    }

    @Deprecated
    public final void zzi(zzbzw zzbzw, zzbzu zzbzu) {
        zzfuj.zzq(this.zza, new zzbzy(this, zzbzw, zzbzu), zzbzn.zzf);
    }
}
