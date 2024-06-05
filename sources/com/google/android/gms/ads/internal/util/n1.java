package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbco;
import com.google.android.gms.internal.ads.zzbza;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class n1 extends zzbza {
    public static void a(String str) {
        if (!c()) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.v("Ads", str);
            return;
        }
        boolean z10 = true;
        for (String str2 : zzbza.zza.zzd(str)) {
            if (z10) {
                Log.v("Ads", str2);
            } else {
                Log.v("Ads-cont", str2);
            }
            z10 = false;
        }
    }

    public static void b(String str, Throwable th) {
        if (c()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean c() {
        return zzbza.zzm(2) && ((Boolean) zzbco.zza.zze()).booleanValue();
    }
}
