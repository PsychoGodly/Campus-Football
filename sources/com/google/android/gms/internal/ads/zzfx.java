package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzfx implements zzfnv {
    public static final /* synthetic */ zzfx zza = new zzfx();

    private /* synthetic */ zzfx() {
    }

    public final boolean zza(Object obj) {
        String str = (String) obj;
        if (str == null) {
            return false;
        }
        String zza2 = zzfnb.zza(str);
        if (!TextUtils.isEmpty(zza2)) {
            return (!zza2.contains("text") || zza2.contains("text/vtt")) && !zza2.contains("html") && !zza2.contains("xml");
        }
        return false;
    }
}
