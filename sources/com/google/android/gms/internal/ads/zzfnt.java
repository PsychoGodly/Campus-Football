package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class zzfnt {
    private static final Logger zza = Logger.getLogger(zzfnt.class.getName());
    private static final zzfns zzb = new zzfns((zzfnr) null);

    private zzfnt() {
    }

    static String zza(String str) {
        return str == null ? MaxReward.DEFAULT_LABEL : str;
    }

    static boolean zzb(String str) {
        return str == null || str.isEmpty();
    }
}
