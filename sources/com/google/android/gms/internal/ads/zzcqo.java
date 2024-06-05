package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcqo implements zzcqp {
    private final Map zza;

    zzcqo(Map map) {
        this.zza = map;
    }

    public final zzeat zza(int i10, String str) {
        return (zzeat) this.zza.get(str);
    }
}
