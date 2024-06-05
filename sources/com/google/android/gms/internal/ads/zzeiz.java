package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.a;
import com.google.android.gms.ads.internal.client.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeiz implements zzepn {
    private final Context zza;

    zzeiz(Context context) {
        this.zza = context;
    }

    public final int zza() {
        return 2;
    }

    public final zzfut zzb() {
        if (!((Boolean) a0.c().zzb(zzbar.zzcx)).booleanValue()) {
            return zzfuj.zzh((Object) null);
        }
        return zzfuj.zzh(new zzeja(a.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }
}
