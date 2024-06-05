package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzfkr;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class v1 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebSettings f14908a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f14909b;

    public /* synthetic */ v1(WebSettings webSettings, Context context) {
        this.f14908a = webSettings;
        this.f14909b = context;
    }

    public final Object call() {
        WebSettings webSettings = this.f14908a;
        Context context = this.f14909b;
        zzfkr zzfkr = b2.f14773i;
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        if (((Boolean) a0.c().zzb(zzbar.zzaE)).booleanValue()) {
            webSettings.setTextZoom(100);
        }
        webSettings.setAllowContentAccess(false);
        return Boolean.TRUE;
    }
}
