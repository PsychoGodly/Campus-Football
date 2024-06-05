package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcfk extends zzcfl {
    public zzcfk(zzcei zzcei, zzawe zzawe, boolean z10) {
        super(zzcei, zzawe, z10);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzN(webView, str, (Map) null);
    }
}
