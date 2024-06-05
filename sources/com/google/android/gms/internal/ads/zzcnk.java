package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcnk implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;

    public zzcnk(zzgxl zzgxl, zzgxl zzgxl2, zzgxl zzgxl3, zzgxl zzgxl4) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
        this.zzc = zzgxl3;
        this.zzd = zzgxl4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        ((zzcrc) this.zza).zza();
        String str = (String) this.zzd.zzb();
        boolean equals = "native".equals(str);
        t.r();
        return new zzatb(UUID.randomUUID().toString(), ((zzcgu) this.zzb).zza(), str, (JSONObject) this.zzc.zzb(), false, equals);
    }
}
