package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdpn extends zzdpp {
    private final zzfds zzf;

    public zzdpn(Executor executor, zzbzf zzbzf, zzfds zzfds, zzfdu zzfdu) {
        super(executor, zzbzf, zzfdu);
        this.zzf = zzfds;
        zzfds.zza(this.zzb);
    }

    public final Map zza() {
        return new HashMap(this.zzb);
    }
}
