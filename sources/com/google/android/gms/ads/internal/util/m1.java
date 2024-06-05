package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzfut;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class m1 {
    public static void a(Context context) {
        if (zzbyz.zzk(context) && !zzbyz.zzm()) {
            zzfut zzb = new c1(context).zzb();
            zzbza.zzi("Updating ad debug logging enablement.");
            zzbzq.zza(zzb, "AdDebugLogUpdater.updateEnablement");
        }
    }
}
