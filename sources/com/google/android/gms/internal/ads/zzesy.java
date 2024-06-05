package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.k1;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzesy implements Callable {
    public static final /* synthetic */ zzesy zza = new zzesy();

    private /* synthetic */ zzesy() {
    }

    public final Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) a0.c().zzb(zzbar.zzI);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) a0.c().zzb(zzbar.zzJ)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, k1.a(str2));
                }
            }
        }
        return new zzeta(hashMap);
    }
}
