package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzekq implements zzftq {
    public static final /* synthetic */ zzekq zza = new zzekq();

    private /* synthetic */ zzekq() {
    }

    public final zzfut zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        if (appSetIdInfo == null) {
            return zzfuj.zzh(new zzekt((String) null, -1));
        }
        return zzfuj.zzh(new zzekt(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
