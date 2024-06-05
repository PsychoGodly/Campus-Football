package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcmk implements zzcls {
    private final zzdsf zza;

    zzcmk(zzdsf zzdsf) {
        this.zza = zzdsf;
    }

    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzm(str.equals("true"));
        }
    }
}
