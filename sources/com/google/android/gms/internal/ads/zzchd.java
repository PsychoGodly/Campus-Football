package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzchd implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzchd(zzgxl zzgxl, zzgxl zzgxl2) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
    }

    /* renamed from: zza */
    public final zzbty zzb() {
        Context zza2 = ((zzcgj) this.zza).zza();
        zzfep zzfep = (zzfep) this.zzb.zzb();
        zzbmf zzb2 = t.h().zzb(zza2, zzbzg.zza(), zzfep);
        zzblz zzblz = zzbmc.zza;
        zzb2.zza("google.afma.request.getAdDictionary", zzblz, zzblz);
        return new zzbtx(zza2, t.h().zzb(zza2, zzbzg.zza(), zzfep).zza("google.afma.sdkConstants.getSdkConstants", zzblz, zzblz));
    }
}
