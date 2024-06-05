package com.unity3d.ads.core.domain;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.unity3d.ads.adplayer.GetWebViewAssetLoaderKt;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.m;

/* compiled from: GetCachedAsset.kt */
public final class GetCachedAsset {
    private final CacheRepository cacheRepository;
    private final Context context;

    public GetCachedAsset(CacheRepository cacheRepository2, Context context2) {
        m.e(cacheRepository2, "cacheRepository");
        m.e(context2, "context");
        this.cacheRepository = cacheRepository2;
        this.context = context2;
    }

    private final WebResourceResponse getBundledAsset(Uri uri) {
        String o02 = p.o0(String.valueOf(uri.getPath()), UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, (String) null, 2, (Object) null);
        try {
            InputStream open = this.context.getAssets().open(o02);
            m.d(open, "context.assets.open(fileName)");
            return new WebResourceResponse(GetWebViewAssetLoaderKt.guessMimeType(o02), (String) null, open);
        } catch (Exception unused) {
            return null;
        }
    }

    private final WebResourceResponse getCachedAsset(Uri uri) {
        String uri2 = uri.toString();
        m.d(uri2, "uri.toString()");
        CacheResult retrieveFile = this.cacheRepository.retrieveFile(p.y0(p.s0(uri2, UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, (String) null, 2, (Object) null), ".", (String) null, 2, (Object) null));
        if (!(retrieveFile instanceof CacheResult.Success)) {
            return null;
        }
        CacheResult.Success success = (CacheResult.Success) retrieveFile;
        File file = success.getCachedFile().getFile();
        if (file == null) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        return new WebResourceResponse(GetWebViewAssetLoaderKt.guessMimeType(file.getAbsolutePath() + '.' + success.getCachedFile().getExtension()), (String) null, fileInputStream);
    }

    public final WebResourceResponse invoke(Uri uri) {
        m.e(uri, "uri");
        String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -1921537799) {
                if (hashCode == -1920242293 && host.equals(UnityAdsConstants.DefaultUrls.AD_CACHE_DOMAIN)) {
                    return getCachedAsset(uri);
                }
            } else if (host.equals(UnityAdsConstants.DefaultUrls.AD_ASSET_DOMAIN)) {
                return getBundledAsset(uri);
            }
        }
        return null;
    }
}
