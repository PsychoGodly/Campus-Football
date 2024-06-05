package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzekp implements zzfnj {
    public static final /* synthetic */ zzekp zza = new zzekp();

    private /* synthetic */ zzekp() {
    }

    public final Object apply(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return new zzekt(appSetIdInfo.getId(), appSetIdInfo.getScope());
    }
}
