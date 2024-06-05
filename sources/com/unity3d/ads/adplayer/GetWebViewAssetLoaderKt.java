package com.unity3d.ads.adplayer;

import android.content.Context;
import android.webkit.WebResourceResponse;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.log.DeviceLog;
import j1.q;
import java.io.InputStream;
import java.net.URLConnection;
import kotlin.jvm.internal.m;

/* compiled from: GetWebViewAssetLoader.kt */
public final class GetWebViewAssetLoaderKt {
    public static final String guessMimeType(String str) {
        m.e(str, "filePath");
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        m.d(guessContentTypeFromName, "guessContentTypeFromName(filePath)");
        return guessContentTypeFromName;
    }

    public static final GetWebViewCacheAssetLoader provideGetWebViewCacheAssetLoader(Context context) {
        m.e(context, "context");
        return new c(context);
    }

    /* access modifiers changed from: private */
    public static final q provideGetWebViewCacheAssetLoader$lambda$1(Context context) {
        m.e(context, "$context");
        q b10 = new q.b().a(UnityAdsConstants.DefaultUrls.WEBVIEW_ASSET_PATH, new d(context)).c(UnityAdsConstants.DefaultUrls.WEBVIEW_DOMAIN).b();
        m.d(b10, "Builder()\n        .addPa…_DOMAIN)\n        .build()");
        return b10;
    }

    /* access modifiers changed from: private */
    public static final WebResourceResponse provideGetWebViewCacheAssetLoader$lambda$1$lambda$0(Context context, String str) {
        m.e(context, "$context");
        m.e(str, "path");
        try {
            InputStream open = context.getAssets().open(str);
            m.d(open, "context.assets.open(path)");
            return new WebResourceResponse(guessMimeType(str), (String) null, open);
        } catch (Exception unused) {
            DeviceLog.debug("Webview Asset not found: %s", str);
            return null;
        }
    }
}
