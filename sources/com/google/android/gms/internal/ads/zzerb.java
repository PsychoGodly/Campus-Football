package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzerb implements zzftq {
    public static final /* synthetic */ zzerb zza = new zzerb();

    private /* synthetic */ zzerb() {
    }

    public final zzfut zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        if (appSetIdInfo == null) {
            return zzfuj.zzh(new zzere((String) null, -1));
        }
        return zzfuj.zzh(new zzere(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
