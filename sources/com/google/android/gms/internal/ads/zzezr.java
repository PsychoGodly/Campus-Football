package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.n1;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzezr {
    public static void zza(Context context, boolean z10) {
        if (z10) {
            zzbza.zzi("This request is sent from a test device.");
            return;
        }
        x.b();
        String zzz = zzbyt.zzz(context);
        zzbza.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzz + "\")) to get test ads on this device.");
    }

    public static void zzb(int i10, Throwable th, String str) {
        zzbza.zzi("Ad failed to load : " + i10);
        n1.b(str, th);
        if (i10 != 3) {
            t.q().zzt(th, str);
        }
    }
}
