package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzfnn {
    private final String zza;
    private final zzfnm zzb;
    private zzfnm zzc;

    /* synthetic */ zzfnn(String str, zzfnl zzfnl) {
        zzfnm zzfnm = new zzfnm((zzfnl) null);
        this.zzb = zzfnm;
        this.zzc = zzfnm;
        Objects.requireNonNull(str);
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzfnm zzfnm = this.zzb.zzb;
        String str = MaxReward.DEFAULT_LABEL;
        while (zzfnm != null) {
            Object obj = zzfnm.zza;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append(deepToString, 1, deepToString.length() - 1);
            }
            zzfnm = zzfnm.zzb;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzfnn zza(Object obj) {
        zzfnm zzfnm = new zzfnm((zzfnl) null);
        this.zzc.zzb = zzfnm;
        this.zzc = zzfnm;
        zzfnm.zza = obj;
        return this;
    }
}
