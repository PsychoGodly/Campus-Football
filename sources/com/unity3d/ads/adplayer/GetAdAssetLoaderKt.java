package com.unity3d.ads.adplayer;

import android.content.Context;
import android.webkit.WebResourceResponse;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.log.DeviceLog;
import j1.q;
import java.io.File;
import java.io.FileInputStream;
import kotlin.jvm.internal.m;

/* compiled from: GetAdAssetLoader.kt */
public final class GetAdAssetLoaderKt {
    public static final GetAdAssetLoader provideGetAdCacheAssetLoader(Context context) {
        m.e(context, "context");
        return new a(context);
    }

    /* access modifiers changed from: private */
    public static final q provideGetAdCacheAssetLoader$lambda$1(Context context) {
        m.e(context, "$context");
        q b10 = new q.b().a(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, new b(context)).c("cdn-creatives-cf-prd.acquire.unity3dusercontent.com").b();
        m.d(b10, "Builder()\n        .addPa…_DOMAIN)\n        .build()");
        return b10;
    }

    /* access modifiers changed from: private */
    public static final WebResourceResponse provideGetAdCacheAssetLoader$lambda$1$lambda$0(Context context, String str) {
        m.e(context, "$context");
        m.e(str, "path");
        try {
            File filesDir = context.getFilesDir();
            return new WebResourceResponse(GetWebViewAssetLoaderKt.guessMimeType(str), (String) null, new FileInputStream(new File(filesDir, "unityads/" + str)));
        } catch (Exception unused) {
            DeviceLog.debug("Ad Asset not found: %s", str);
            return null;
        }
    }
}
