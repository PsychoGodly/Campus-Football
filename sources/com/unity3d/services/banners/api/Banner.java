package com.unity3d.services.banners.api;

import bb.c;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.load.ILoadOperation;
import com.unity3d.services.ads.operation.load.LoadBannerModule;
import com.unity3d.services.ads.operation.load.LoadBannerOperationState;
import com.unity3d.services.ads.operation.load.LoadOperationState;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.properties.BannerRefreshInfo;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class Banner {

    /* renamed from: com.unity3d.services.banners.api.Banner$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$banners$api$Banner$BannerViewType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.unity3d.services.banners.api.Banner$BannerViewType[] r0 = com.unity3d.services.banners.api.Banner.BannerViewType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$unity3d$services$banners$api$Banner$BannerViewType = r0
                com.unity3d.services.banners.api.Banner$BannerViewType r1 = com.unity3d.services.banners.api.Banner.BannerViewType.WEB_PLAYER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$unity3d$services$banners$api$Banner$BannerViewType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.banners.api.Banner$BannerViewType r1 = com.unity3d.services.banners.api.Banner.BannerViewType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.banners.api.Banner.AnonymousClass1.<clinit>():void");
        }
    }

    private enum BannerViewType {
        WEB_PLAYER,
        UNKNOWN;

        public static BannerViewType fromString(String str) {
            try {
                return valueOf(str);
            } catch (IllegalArgumentException unused) {
                return UNKNOWN;
            }
        }
    }

    private static LoadBannerOperationState getBannerOperationState(String str) {
        ILoadOperation iLoadOperation = (ILoadOperation) LoadBannerModule.getInstance().get(str);
        if (iLoadOperation == null || iLoadOperation.getLoadOperationState() == null) {
            LoadBannerModule.getInstance().onUnityAdsFailedToLoad(str, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "No operation found for requested banner");
            return null;
        }
        LoadOperationState loadOperationState = iLoadOperation.getLoadOperationState();
        if (loadOperationState instanceof LoadBannerOperationState) {
            return (LoadBannerOperationState) loadOperationState;
        }
        LoadBannerModule.getInstance().onUnityAdsFailedToLoad(str, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "Operation state found is not for banner ad");
        return null;
    }

    @WebViewExposed
    public static void load(String str, Integer num, Integer num2, String str2, WebViewCallback webViewCallback) {
        int i10 = AnonymousClass1.$SwitchMap$com$unity3d$services$banners$api$Banner$BannerViewType[BannerViewType.fromString(str).ordinal()];
        if (i10 == 1) {
            LoadBannerOperationState bannerOperationState = getBannerOperationState(str2);
            if (bannerOperationState != null) {
                bannerOperationState.setSize(new UnityBannerSize(num.intValue(), num2.intValue()));
                BannerViewCache.getInstance().loadBanner(bannerOperationState);
            }
        } else if (i10 == 2) {
            LoadBannerModule.getInstance().onUnityAdsFailedToLoad(str2, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "Unknown banner type");
        }
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void loadScar(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, WebViewCallback webViewCallback) {
        LoadBannerOperationState bannerOperationState = getBannerOperationState(str);
        if (bannerOperationState == null) {
            webViewCallback.invoke(new Object[0]);
            return;
        }
        bannerOperationState.setSize(new UnityBannerSize(num.intValue(), num2.intValue()));
        bannerOperationState.setScarAdMetadata(new c(str2, str3, str4, str5, 0));
        BannerViewCache.getInstance().loadBanner(bannerOperationState);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void setRefreshRate(String str, Integer num, WebViewCallback webViewCallback) {
        if (!(str == null || num == null)) {
            BannerRefreshInfo.getInstance().setRefreshRate(str, num);
        }
        webViewCallback.invoke(new Object[0]);
    }
}
