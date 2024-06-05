package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.x;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbya {
    public final zzfut zza(Context context, int i10) {
        zzbzs zzbzs = new zzbzs();
        x.b();
        if (zzbyt.zzu(context)) {
            zzbzn.zza.execute(new zzbxz(this, context, zzbzs));
        }
        return zzbzs;
    }
}
