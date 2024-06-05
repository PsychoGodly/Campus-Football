package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.p1;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzclu implements zzcls {
    private final p1 zza;

    public zzclu(p1 p1Var) {
        this.zza = p1Var;
    }

    public final void zza(Map map) {
        this.zza.r(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
