package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdfo implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzdfo(zzgxl zzgxl, zzgxl zzgxl2) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbzg zza2 = ((zzcgu) this.zza).zza();
        t.r();
        return new zzatb(UUID.randomUUID().toString(), zza2, "native", new JSONObject(), false, true);
    }
}
