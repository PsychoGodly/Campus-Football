package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbbh {
    private final Map zza = new HashMap();
    private final zzbbj zzb;

    public zzbbh(zzbbj zzbbj) {
        this.zzb = zzbbj;
    }

    public final zzbbj zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbbg zzbbg) {
        this.zza.put(str, zzbbg);
    }

    public final void zzc(String str, String str2, long j10) {
        zzbbj zzbbj = this.zzb;
        zzbbg zzbbg = (zzbbg) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbbg != null) {
            zzbbj.zze(zzbbg, j10, strArr);
        }
        this.zza.put(str, new zzbbg(j10, (String) null, (zzbbg) null));
    }
}
