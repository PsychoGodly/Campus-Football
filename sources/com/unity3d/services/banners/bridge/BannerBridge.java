package com.unity3d.services.banners.bridge;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.ads.operation.load.LoadBannerModule;
import com.unity3d.services.ads.operation.load.LoadBannerOperationState;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInvoker;
import java.util.HashMap;
import org.json.JSONObject;

public class BannerBridge {

    public enum BannerEvent {
        BANNER_VISIBILITY_CHANGED,
        BANNER_RESIZED,
        BANNER_LOADED,
        BANNER_DESTROYED,
        BANNER_ATTACHED,
        BANNER_DETACHED,
        BANNER_LOAD_PLACEMENT,
        BANNER_DESTROY_BANNER,
        SCAR_BANNER_LOADED,
        SCAR_BANNER_LOAD_FAILED,
        SCAR_BANNER_ATTACHED,
        SCAR_BANNER_DETACHED,
        SCAR_BANNER_OPENED,
        SCAR_BANNER_CLOSED,
        SCAR_BANNER_IMPRESSION,
        SCAR_BANNER_CLICKED
    }

    public static void destroy(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_DESTROY_BANNER, str);
        }
    }

    public static void didAttach(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_ATTACHED, str);
        }
    }

    public static void didAttachScarBanner(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.SCAR_BANNER_ATTACHED, str);
        }
    }

    public static void didDestroy(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_DESTROYED, str);
        }
    }

    public static void didDetach(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_DETACHED, str);
        }
    }

    public static void didDetachScarBanner(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.SCAR_BANNER_DETACHED, str);
        }
    }

    public static void didLoad(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_LOADED, str);
        }
    }

    private static boolean isHeaderBidding(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.has(LegacyLoadUseCase.KEY_AD_MARKUP);
    }

    public static void load(String str, String str2, UnityBannerSize unityBannerSize) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_LOAD_PLACEMENT, str, str2, Integer.valueOf(unityBannerSize.getWidth()), Integer.valueOf(unityBannerSize.getHeight()));
            return;
        }
        BannerView bannerView = BannerViewCache.getInstance().getBannerView(str2);
        if (bannerView != null && bannerView.getListener() != null) {
            bannerView.getListener().onBannerFailedToLoad(bannerView, new BannerErrorInfo("WebViewApp was not available, this is likely because UnityAds has not been initialized", BannerErrorCode.WEBVIEW_ERROR));
        }
    }

    public static void resize(String str, int i10, int i11, int i12, int i13, float f10) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_RESIZED, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Float.valueOf(f10));
        }
    }

    public static void visibilityChanged(String str, int i10) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_VISIBILITY_CHANGED, str, Integer.valueOf(i10));
        }
    }

    public static void load(String str, String str2, UnityBannerSize unityBannerSize, UnityAdsLoadOptions unityAdsLoadOptions) {
        String str3 = str2;
        UnityAdsLoadOptions unityAdsLoadOptions2 = unityAdsLoadOptions;
        final SDKMetricsSender sDKMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
        final AnonymousClass1 r32 = new HashMap<String, String>(isHeaderBidding(unityAdsLoadOptions.getData())) {
            final /* synthetic */ boolean val$isHB;

            {
                this.val$isHB = r2;
                put("is_header_bidding", String.valueOf(r2));
            }
        };
        final BannerView bannerView = BannerViewCache.getInstance().getBannerView(str2);
        if (bannerView == null) {
            sDKMetricsSender.sendMetricWithInitState(new Metric("native_banner_load_not_found", (Object) null, r32));
            return;
        }
        boolean invoke = ((AlternativeFlowReader) Utilities.getService(AlternativeFlowReader.class)).invoke();
        boolean z10 = unityAdsLoadOptions.getObjectId() != null;
        if (invoke && !z10) {
            unityAdsLoadOptions2.setObjectId(str2);
        }
        final BannerView.IListener listener = bannerView.getListener();
        final boolean z11 = invoke;
        final UnityAdsLoadOptions unityAdsLoadOptions3 = unityAdsLoadOptions;
        final String str4 = str2;
        AnonymousClass2 r02 = new IUnityAdsLoadListener() {
            public void onUnityAdsAdLoaded(String str) {
                if (BannerView.IListener.this == null) {
                    sDKMetricsSender.sendMetricWithInitState(new Metric("native_banner_listener_loaded_not_found", (Object) null, r32));
                }
                if (z11) {
                    BannerView.IListener iListener = BannerView.IListener.this;
                    if (iListener != null) {
                        iListener.onBannerLoaded(bannerView);
                    }
                    UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
                    unityAdsShowOptions.setObjectId(unityAdsLoadOptions3.getObjectId());
                    UnityAdsSDK.INSTANCE.show(str, unityAdsShowOptions, new Listeners() {
                        public void onClick(String str) {
                            AnonymousClass2 r22 = AnonymousClass2.this;
                            BannerView.IListener iListener = BannerView.IListener.this;
                            if (iListener != null) {
                                iListener.onBannerClick(bannerView);
                            }
                        }

                        public void onComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                        }

                        public void onError(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
                        }

                        public void onLeftApplication(String str) {
                            AnonymousClass2 r22 = AnonymousClass2.this;
                            BannerView.IListener iListener = BannerView.IListener.this;
                            if (iListener != null) {
                                iListener.onBannerLeftApplication(bannerView);
                            }
                        }

                        public void onStart(String str) {
                            AnonymousClass2 r22 = AnonymousClass2.this;
                            BannerView.IListener iListener = BannerView.IListener.this;
                            if (iListener != null) {
                                iListener.onBannerShown(bannerView);
                            }
                        }
                    });
                }
            }

            public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
                BannerView bannerView = BannerViewCache.getInstance().getBannerView(str4);
                if (bannerView == null || bannerView.getListener() == null) {
                    sDKMetricsSender.sendMetricWithInitState(new Metric("native_banner_listener_load_fail_not_found", (Object) null, r32));
                    return;
                }
                bannerView.getListener().onBannerFailedToLoad(bannerView, BannerErrorInfo.fromLoadError(unityAdsLoadError, str2));
            }
        };
        if (invoke) {
            String str5 = str;
            UnityBannerSize unityBannerSize2 = unityBannerSize;
            UnityAdsSDK.INSTANCE.load(str, unityAdsLoadOptions2, r02, unityBannerSize);
            return;
        }
        LoadBannerModule.getInstance().executeAdOperation(new WebViewBridgeInvoker(), new LoadBannerOperationState(str, str2, unityBannerSize, r02, unityAdsLoadOptions, new ConfigurationReader().getCurrentConfiguration()));
    }
}
