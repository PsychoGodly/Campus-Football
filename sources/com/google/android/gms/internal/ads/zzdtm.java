package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdtm implements Callable {
    public final /* synthetic */ CookieManager zza;

    public /* synthetic */ zzdtm(CookieManager cookieManager) {
        this.zza = cookieManager;
    }

    public final Object call() {
        CookieManager cookieManager = this.zza;
        if (cookieManager == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        return cookieManager.getCookie((String) a0.c().zzb(zzbar.zzaH));
    }
}
