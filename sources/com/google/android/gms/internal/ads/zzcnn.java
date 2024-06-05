package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcnn implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzcnn(zzgxl zzgxl, zzgxl zzgxl2, zzgxl zzgxl3) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
        this.zzc = zzgxl3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzcng zzcng = (zzcng) this.zza.zzb();
        zzfuu zzfuu = zzbzn.zza;
        zzgxg.zzb(zzfuu);
        if (((JSONObject) this.zzc.zzb()) == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new zzdbu(zzcng, zzfuu));
        }
        zzgxg.zzb(set);
        return set;
    }
}
