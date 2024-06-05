package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfax {
    private final HashMap zza = new HashMap();

    public final zzfaw zza(zzfan zzfan, Context context, zzfaf zzfaf, zzfbd zzfbd) {
        zzfaw zzfaw = (zzfaw) this.zza.get(zzfan);
        if (zzfaw != null) {
            return zzfaw;
        }
        zzfak zzfak = new zzfak(zzfaq.zza(zzfan, context));
        zzfaw zzfaw2 = new zzfaw(zzfak, new zzfbf(zzfak, zzfaf, zzfbd));
        this.zza.put(zzfan, zzfaw2);
        return zzfaw2;
    }
}
