package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.q;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbih implements zzbhp {
    private final zzdsf zza;

    public zzbih(zzdsf zzdsf) {
        q.l(zzdsf, "The Inspector Manager must not be null");
        this.zza = zzdsf;
    }

    public final void zza(Object obj, Map map) {
        if (map != null && map.containsKey("extras")) {
            long j10 = Long.MAX_VALUE;
            if (map.containsKey("expires")) {
                try {
                    j10 = Long.parseLong((String) map.get("expires"));
                } catch (NumberFormatException unused) {
                }
            }
            this.zza.zzi((String) map.get("extras"), j10);
        }
    }
}
