package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.p1;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzclw implements zzcls {
    private final p1 zza;

    public zzclw(p1 p1Var) {
        this.zza = p1Var;
    }

    public final void zza(Map map) {
        this.zza.zzz(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
