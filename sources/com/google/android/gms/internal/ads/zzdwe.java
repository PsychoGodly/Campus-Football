package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdwe {
    private final zzfuu zza;
    private final zzfuu zzb;
    private final zzdww zzc;

    zzdwe(zzfuu zzfuu, zzfuu zzfuu2, zzdww zzdww) {
        this.zza = zzfuu;
        this.zzb = zzfuu2;
        this.zzc = zzdww;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zza(zzbsr zzbsr) throws Exception {
        return this.zzc.zza(zzbsr, ((Long) a0.c().zzb(zzbar.zzjH)).longValue());
    }

    public final zzfut zzb(zzbsr zzbsr) {
        zzfut zzfut;
        String str = zzbsr.zzb;
        t.r();
        if (b2.X(str)) {
            zzfut = zzfuj.zzg(new zzdvi(1, "Ads signal service force local"));
        } else {
            zzfut = zzfuj.zzf(zzfuj.zzk(new zzdwa(this, zzbsr), this.zza), ExecutionException.class, zzdwb.zza, this.zzb);
        }
        return zzfuj.zzm(zzfuj.zzf(zzfua.zzv(zzfut), zzdvi.class, zzdwc.zza, this.zzb), zzdwd.zza, this.zzb);
    }
}
