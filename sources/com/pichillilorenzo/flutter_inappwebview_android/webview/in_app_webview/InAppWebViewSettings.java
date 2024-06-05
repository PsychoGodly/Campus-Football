package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.os.Build;
import android.webkit.WebSettings;
import com.applovin.mediation.MaxReward;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import j1.p;
import j1.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InAppWebViewSettings implements ISettings<InAppWebViewInterface> {
    public static final String LOG_TAG = "InAppWebViewSettings";
    public Boolean algorithmicDarkeningAllowed;
    public Boolean allowBackgroundAudioPlaying;
    public Boolean allowContentAccess;
    public Boolean allowFileAccess;
    public Boolean allowFileAccessFromFileURLs;
    public Boolean allowUniversalAccessFromFileURLs;
    public String appCachePath;
    public String applicationNameForUserAgent = MaxReward.DEFAULT_LABEL;
    public Boolean blockNetworkImage;
    public Boolean blockNetworkLoads;
    public Boolean builtInZoomControls;
    public Boolean cacheEnabled;
    public Integer cacheMode;
    @Deprecated
    public Boolean clearCache;
    @Deprecated
    public Boolean clearSessionCache;
    public List<Map<String, Map<String, Object>>> contentBlockers;
    public String cursiveFontFamily;
    public Boolean databaseEnabled;
    public Integer defaultFixedFontSize;
    public Integer defaultFontSize;
    public String defaultTextEncodingName;
    public byte[] defaultVideoPoster;
    public Boolean disableContextMenu;
    public Boolean disableDefaultErrorPage;
    public Boolean disableHorizontalScroll;
    public Boolean disableVerticalScroll;
    public Integer disabledActionModeMenuItems;
    public Boolean displayZoomControls;
    public Boolean domStorageEnabled;
    public Boolean enterpriseAuthenticationAppLinkPolicyEnabled;
    public String fantasyFontFamily;
    public String fixedFontFamily;
    public Integer forceDark;
    public Integer forceDarkStrategy;
    public Boolean geolocationEnabled;
    public Boolean hardwareAcceleration;
    public Boolean horizontalScrollBarEnabled;
    public String horizontalScrollbarThumbColor;
    public String horizontalScrollbarTrackColor;
    public Boolean incognito;
    public Integer initialScale;
    public Boolean interceptOnlyAsyncAjaxRequests;
    public Boolean javaScriptCanOpenWindowsAutomatically;
    public Boolean javaScriptEnabled;
    public WebSettings.LayoutAlgorithm layoutAlgorithm;
    public Boolean loadWithOverviewMode;
    public Boolean loadsImagesAutomatically;
    public Boolean mediaPlaybackRequiresUserGesture;
    public Integer minimumFontSize;
    public Integer minimumLogicalFontSize;
    public Integer mixedContentMode;
    public Boolean needInitialFocus;
    public Boolean networkAvailable;
    public Boolean offscreenPreRaster;
    public Integer overScrollMode;
    public Integer preferredContentMode;
    public String regexToCancelSubFramesLoading;
    public Map<String, Object> rendererPriorityPolicy;
    public Set<String> requestedWithHeaderOriginAllowList;
    public List<String> resourceCustomSchemes;
    public Boolean safeBrowsingEnabled;
    public String sansSerifFontFamily;
    public Boolean saveFormData;
    public Integer scrollBarDefaultDelayBeforeFade;
    public Integer scrollBarFadeDuration;
    public Integer scrollBarStyle;
    public Boolean scrollbarFadingEnabled;
    public String serifFontFamily;
    public String standardFontFamily;
    public Boolean supportMultipleWindows;
    public Boolean supportZoom;
    public Integer textZoom;
    public Boolean thirdPartyCookiesEnabled;
    public Boolean transparentBackground;
    public Boolean useHybridComposition;
    public Boolean useOnDownloadStart;
    public Boolean useOnLoadResource;
    public Boolean useOnRenderProcessGone;
    public Boolean useShouldInterceptAjaxRequest;
    public Boolean useShouldInterceptFetchRequest;
    public Boolean useShouldInterceptRequest;
    public Boolean useShouldOverrideUrlLoading;
    public Boolean useWideViewPort;
    public String userAgent = MaxReward.DEFAULT_LABEL;
    public Boolean verticalScrollBarEnabled;
    public Integer verticalScrollbarPosition;
    public String verticalScrollbarThumbColor;
    public String verticalScrollbarTrackColor;
    public Map<String, Object> webViewAssetLoader;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                android.webkit.WebSettings$LayoutAlgorithm[] r0 = android.webkit.WebSettings.LayoutAlgorithm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm = r0
                android.webkit.WebSettings$LayoutAlgorithm r1 = android.webkit.WebSettings.LayoutAlgorithm.NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm     // Catch:{ NoSuchFieldError -> 0x001d }
                android.webkit.WebSettings$LayoutAlgorithm r1 = android.webkit.WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.webkit.WebSettings$LayoutAlgorithm r1 = android.webkit.WebSettings.LayoutAlgorithm.NARROW_COLUMNS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings.AnonymousClass1.<clinit>():void");
        }
    }

    public InAppWebViewSettings() {
        Boolean bool = Boolean.FALSE;
        this.useShouldOverrideUrlLoading = bool;
        this.useOnLoadResource = bool;
        this.useOnDownloadStart = bool;
        this.clearCache = bool;
        Boolean bool2 = Boolean.TRUE;
        this.javaScriptEnabled = bool2;
        this.javaScriptCanOpenWindowsAutomatically = bool;
        this.mediaPlaybackRequiresUserGesture = bool2;
        this.minimumFontSize = 8;
        this.verticalScrollBarEnabled = bool2;
        this.horizontalScrollBarEnabled = bool2;
        this.resourceCustomSchemes = new ArrayList();
        this.contentBlockers = new ArrayList();
        this.preferredContentMode = Integer.valueOf(PreferredContentModeOptionType.RECOMMENDED.toValue());
        this.useShouldInterceptAjaxRequest = bool;
        this.interceptOnlyAsyncAjaxRequests = bool2;
        this.useShouldInterceptFetchRequest = bool;
        this.incognito = bool;
        this.cacheEnabled = bool2;
        this.transparentBackground = bool;
        this.disableVerticalScroll = bool;
        this.disableHorizontalScroll = bool;
        this.disableContextMenu = bool;
        this.supportZoom = bool2;
        this.allowFileAccessFromFileURLs = bool;
        this.allowUniversalAccessFromFileURLs = bool;
        this.allowBackgroundAudioPlaying = bool;
        this.textZoom = 100;
        this.clearSessionCache = bool;
        this.builtInZoomControls = bool2;
        this.displayZoomControls = bool;
        this.databaseEnabled = bool;
        this.domStorageEnabled = bool2;
        this.useWideViewPort = bool2;
        this.safeBrowsingEnabled = bool2;
        this.allowContentAccess = bool2;
        this.allowFileAccess = bool2;
        this.blockNetworkImage = bool;
        this.blockNetworkLoads = bool;
        this.cacheMode = -1;
        this.cursiveFontFamily = "cursive";
        this.defaultFixedFontSize = 16;
        this.defaultFontSize = 16;
        this.defaultTextEncodingName = "UTF-8";
        this.fantasyFontFamily = "fantasy";
        this.fixedFontFamily = "monospace";
        this.forceDark = 0;
        this.forceDarkStrategy = 2;
        this.geolocationEnabled = bool2;
        this.loadWithOverviewMode = bool2;
        this.loadsImagesAutomatically = bool2;
        this.minimumLogicalFontSize = 8;
        this.initialScale = 0;
        this.needInitialFocus = bool2;
        this.offscreenPreRaster = bool;
        this.sansSerifFontFamily = "sans-serif";
        this.serifFontFamily = "sans-serif";
        this.standardFontFamily = "sans-serif";
        this.saveFormData = bool2;
        this.thirdPartyCookiesEnabled = bool2;
        this.hardwareAcceleration = bool2;
        this.supportMultipleWindows = bool;
        this.overScrollMode = 1;
        this.networkAvailable = null;
        this.scrollBarStyle = 0;
        this.verticalScrollbarPosition = 0;
        this.scrollBarDefaultDelayBeforeFade = null;
        this.scrollbarFadingEnabled = bool2;
        this.scrollBarFadeDuration = null;
        this.rendererPriorityPolicy = null;
        this.useShouldInterceptRequest = bool;
        this.useOnRenderProcessGone = bool;
        this.disableDefaultErrorPage = bool;
        this.useHybridComposition = bool2;
        this.algorithmicDarkeningAllowed = bool;
        this.enterpriseAuthenticationAppLinkPolicyEnabled = bool2;
    }

    private String getLayoutAlgorithm() {
        WebSettings.LayoutAlgorithm layoutAlgorithm2 = this.layoutAlgorithm;
        if (layoutAlgorithm2 == null) {
            return null;
        }
        int i10 = AnonymousClass1.$SwitchMap$android$webkit$WebSettings$LayoutAlgorithm[layoutAlgorithm2.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return null;
                }
                return "NARROW_COLUMNS";
            } else if (Build.VERSION.SDK_INT >= 19) {
                return "TEXT_AUTOSIZING";
            }
        }
        return "NORMAL";
    }

    private void setLayoutAlgorithm(String str) {
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1986416409:
                    if (str.equals("NORMAL")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 1055046617:
                    if (str.equals("NARROW_COLUMNS")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1561826623:
                    if (str.equals("TEXT_AUTOSIZING")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    break;
                case 1:
                    this.layoutAlgorithm = WebSettings.LayoutAlgorithm.NARROW_COLUMNS;
                    break;
                case 2:
                    break;
                default:
                    return;
            }
            this.layoutAlgorithm = WebSettings.LayoutAlgorithm.NORMAL;
            if (Build.VERSION.SDK_INT >= 19) {
                this.layoutAlgorithm = WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING;
            } else {
                this.layoutAlgorithm = WebSettings.LayoutAlgorithm.NORMAL;
            }
        }
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("useShouldOverrideUrlLoading", this.useShouldOverrideUrlLoading);
        hashMap.put("useOnLoadResource", this.useOnLoadResource);
        hashMap.put("useOnDownloadStart", this.useOnDownloadStart);
        hashMap.put("clearCache", this.clearCache);
        hashMap.put("userAgent", this.userAgent);
        hashMap.put("applicationNameForUserAgent", this.applicationNameForUserAgent);
        hashMap.put("javaScriptEnabled", this.javaScriptEnabled);
        hashMap.put("javaScriptCanOpenWindowsAutomatically", this.javaScriptCanOpenWindowsAutomatically);
        hashMap.put("mediaPlaybackRequiresUserGesture", this.mediaPlaybackRequiresUserGesture);
        hashMap.put("minimumFontSize", this.minimumFontSize);
        hashMap.put("verticalScrollBarEnabled", this.verticalScrollBarEnabled);
        hashMap.put("horizontalScrollBarEnabled", this.horizontalScrollBarEnabled);
        hashMap.put("resourceCustomSchemes", this.resourceCustomSchemes);
        hashMap.put("contentBlockers", this.contentBlockers);
        hashMap.put("preferredContentMode", this.preferredContentMode);
        hashMap.put("useShouldInterceptAjaxRequest", this.useShouldInterceptAjaxRequest);
        hashMap.put("interceptOnlyAsyncAjaxRequests", this.interceptOnlyAsyncAjaxRequests);
        hashMap.put("useShouldInterceptFetchRequest", this.useShouldInterceptFetchRequest);
        hashMap.put("incognito", this.incognito);
        hashMap.put("cacheEnabled", this.cacheEnabled);
        hashMap.put("transparentBackground", this.transparentBackground);
        hashMap.put("disableVerticalScroll", this.disableVerticalScroll);
        hashMap.put("disableHorizontalScroll", this.disableHorizontalScroll);
        hashMap.put("disableContextMenu", this.disableContextMenu);
        hashMap.put("textZoom", this.textZoom);
        hashMap.put("clearSessionCache", this.clearSessionCache);
        hashMap.put("builtInZoomControls", this.builtInZoomControls);
        hashMap.put("displayZoomControls", this.displayZoomControls);
        hashMap.put("supportZoom", this.supportZoom);
        hashMap.put("databaseEnabled", this.databaseEnabled);
        hashMap.put("domStorageEnabled", this.domStorageEnabled);
        hashMap.put("useWideViewPort", this.useWideViewPort);
        hashMap.put("safeBrowsingEnabled", this.safeBrowsingEnabled);
        hashMap.put("mixedContentMode", this.mixedContentMode);
        hashMap.put("allowContentAccess", this.allowContentAccess);
        hashMap.put("allowFileAccess", this.allowFileAccess);
        hashMap.put("allowFileAccessFromFileURLs", this.allowFileAccessFromFileURLs);
        hashMap.put("allowUniversalAccessFromFileURLs", this.allowUniversalAccessFromFileURLs);
        hashMap.put("appCachePath", this.appCachePath);
        hashMap.put("blockNetworkImage", this.blockNetworkImage);
        hashMap.put("blockNetworkLoads", this.blockNetworkLoads);
        hashMap.put("cacheMode", this.cacheMode);
        hashMap.put("cursiveFontFamily", this.cursiveFontFamily);
        hashMap.put("defaultFixedFontSize", this.defaultFixedFontSize);
        hashMap.put("defaultFontSize", this.defaultFontSize);
        hashMap.put("defaultTextEncodingName", this.defaultTextEncodingName);
        hashMap.put("disabledActionModeMenuItems", this.disabledActionModeMenuItems);
        hashMap.put("fantasyFontFamily", this.fantasyFontFamily);
        hashMap.put("fixedFontFamily", this.fixedFontFamily);
        hashMap.put("forceDark", this.forceDark);
        hashMap.put("forceDarkStrategy", this.forceDarkStrategy);
        hashMap.put("geolocationEnabled", this.geolocationEnabled);
        hashMap.put("layoutAlgorithm", getLayoutAlgorithm());
        hashMap.put("loadWithOverviewMode", this.loadWithOverviewMode);
        hashMap.put("loadsImagesAutomatically", this.loadsImagesAutomatically);
        hashMap.put("minimumLogicalFontSize", this.minimumLogicalFontSize);
        hashMap.put("initialScale", this.initialScale);
        hashMap.put("needInitialFocus", this.needInitialFocus);
        hashMap.put("offscreenPreRaster", this.offscreenPreRaster);
        hashMap.put("sansSerifFontFamily", this.sansSerifFontFamily);
        hashMap.put("serifFontFamily", this.serifFontFamily);
        hashMap.put("standardFontFamily", this.standardFontFamily);
        hashMap.put("saveFormData", this.saveFormData);
        hashMap.put("thirdPartyCookiesEnabled", this.thirdPartyCookiesEnabled);
        hashMap.put("hardwareAcceleration", this.hardwareAcceleration);
        hashMap.put("supportMultipleWindows", this.supportMultipleWindows);
        hashMap.put("regexToCancelSubFramesLoading", this.regexToCancelSubFramesLoading);
        hashMap.put("overScrollMode", this.overScrollMode);
        hashMap.put("networkAvailable", this.networkAvailable);
        hashMap.put("scrollBarStyle", this.scrollBarStyle);
        hashMap.put("verticalScrollbarPosition", this.verticalScrollbarPosition);
        hashMap.put("scrollBarDefaultDelayBeforeFade", this.scrollBarDefaultDelayBeforeFade);
        hashMap.put("scrollbarFadingEnabled", this.scrollbarFadingEnabled);
        hashMap.put("scrollBarFadeDuration", this.scrollBarFadeDuration);
        hashMap.put("rendererPriorityPolicy", this.rendererPriorityPolicy);
        hashMap.put("useShouldInterceptRequest", this.useShouldInterceptRequest);
        hashMap.put("useOnRenderProcessGone", this.useOnRenderProcessGone);
        hashMap.put("disableDefaultErrorPage", this.disableDefaultErrorPage);
        hashMap.put("useHybridComposition", this.useHybridComposition);
        hashMap.put("verticalScrollbarThumbColor", this.verticalScrollbarThumbColor);
        hashMap.put("verticalScrollbarTrackColor", this.verticalScrollbarTrackColor);
        hashMap.put("horizontalScrollbarThumbColor", this.horizontalScrollbarThumbColor);
        hashMap.put("horizontalScrollbarTrackColor", this.horizontalScrollbarTrackColor);
        hashMap.put("algorithmicDarkeningAllowed", this.algorithmicDarkeningAllowed);
        hashMap.put("enterpriseAuthenticationAppLinkPolicyEnabled", this.enterpriseAuthenticationAppLinkPolicyEnabled);
        hashMap.put("allowBackgroundAudioPlaying", this.allowBackgroundAudioPlaying);
        hashMap.put("defaultVideoPoster", this.defaultVideoPoster);
        hashMap.put("requestedWithHeaderOriginAllowList", this.requestedWithHeaderOriginAllowList != null ? new ArrayList(this.requestedWithHeaderOriginAllowList) : null);
        return hashMap;
    }

    public Map<String, Object> getRealSettings(InAppWebViewInterface inAppWebViewInterface) {
        Map<String, Object> map = toMap();
        if (inAppWebViewInterface instanceof InAppWebView) {
            InAppWebView inAppWebView = (InAppWebView) inAppWebViewInterface;
            WebSettings settings = inAppWebView.getSettings();
            map.put("userAgent", settings.getUserAgentString());
            map.put("javaScriptEnabled", Boolean.valueOf(settings.getJavaScriptEnabled()));
            map.put("javaScriptCanOpenWindowsAutomatically", Boolean.valueOf(settings.getJavaScriptCanOpenWindowsAutomatically()));
            map.put("mediaPlaybackRequiresUserGesture", Boolean.valueOf(settings.getMediaPlaybackRequiresUserGesture()));
            map.put("minimumFontSize", Integer.valueOf(settings.getMinimumFontSize()));
            map.put("verticalScrollBarEnabled", Boolean.valueOf(inAppWebView.isVerticalScrollBarEnabled()));
            map.put("horizontalScrollBarEnabled", Boolean.valueOf(inAppWebView.isHorizontalScrollBarEnabled()));
            map.put("textZoom", Integer.valueOf(settings.getTextZoom()));
            map.put("builtInZoomControls", Boolean.valueOf(settings.getBuiltInZoomControls()));
            map.put("supportZoom", Boolean.valueOf(settings.supportZoom()));
            map.put("displayZoomControls", Boolean.valueOf(settings.getDisplayZoomControls()));
            map.put("databaseEnabled", Boolean.valueOf(settings.getDatabaseEnabled()));
            map.put("domStorageEnabled", Boolean.valueOf(settings.getDomStorageEnabled()));
            map.put("useWideViewPort", Boolean.valueOf(settings.getUseWideViewPort()));
            if (s.a("SAFE_BROWSING_ENABLE")) {
                map.put("safeBrowsingEnabled", Boolean.valueOf(p.h(settings)));
            } else if (Build.VERSION.SDK_INT >= 26) {
                map.put("safeBrowsingEnabled", Boolean.valueOf(settings.getSafeBrowsingEnabled()));
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                map.put("mixedContentMode", Integer.valueOf(settings.getMixedContentMode()));
            }
            map.put("allowContentAccess", Boolean.valueOf(settings.getAllowContentAccess()));
            map.put("allowFileAccess", Boolean.valueOf(settings.getAllowFileAccess()));
            map.put("allowFileAccessFromFileURLs", Boolean.valueOf(settings.getAllowFileAccessFromFileURLs()));
            map.put("allowUniversalAccessFromFileURLs", Boolean.valueOf(settings.getAllowUniversalAccessFromFileURLs()));
            map.put("blockNetworkImage", Boolean.valueOf(settings.getBlockNetworkImage()));
            map.put("blockNetworkLoads", Boolean.valueOf(settings.getBlockNetworkLoads()));
            map.put("cacheMode", Integer.valueOf(settings.getCacheMode()));
            map.put("cursiveFontFamily", settings.getCursiveFontFamily());
            map.put("defaultFixedFontSize", Integer.valueOf(settings.getDefaultFixedFontSize()));
            map.put("defaultFontSize", Integer.valueOf(settings.getDefaultFontSize()));
            map.put("defaultTextEncodingName", settings.getDefaultTextEncodingName());
            if (s.a("DISABLED_ACTION_MODE_MENU_ITEMS")) {
                map.put("disabledActionModeMenuItems", Integer.valueOf(p.b(settings)));
            }
            if (i10 >= 24) {
                map.put("disabledActionModeMenuItems", Integer.valueOf(settings.getDisabledActionModeMenuItems()));
            }
            map.put("fantasyFontFamily", settings.getFantasyFontFamily());
            map.put("fixedFontFamily", settings.getFixedFontFamily());
            if (s.a("FORCE_DARK")) {
                map.put("forceDark", Integer.valueOf(p.d(settings)));
            } else if (i10 >= 29) {
                map.put("forceDark", Integer.valueOf(settings.getForceDark()));
            }
            if (s.a("FORCE_DARK_STRATEGY")) {
                map.put("forceDarkStrategy", Integer.valueOf(p.e(settings)));
            }
            map.put("layoutAlgorithm", settings.getLayoutAlgorithm().name());
            map.put("loadWithOverviewMode", Boolean.valueOf(settings.getLoadWithOverviewMode()));
            map.put("loadsImagesAutomatically", Boolean.valueOf(settings.getLoadsImagesAutomatically()));
            map.put("minimumLogicalFontSize", Integer.valueOf(settings.getMinimumLogicalFontSize()));
            if (s.a("OFF_SCREEN_PRERASTER")) {
                map.put("offscreenPreRaster", Boolean.valueOf(p.f(settings)));
            } else if (i10 >= 23) {
                map.put("offscreenPreRaster", Boolean.valueOf(settings.getOffscreenPreRaster()));
            }
            map.put("sansSerifFontFamily", settings.getSansSerifFontFamily());
            map.put("serifFontFamily", settings.getSerifFontFamily());
            map.put("standardFontFamily", settings.getStandardFontFamily());
            map.put("saveFormData", Boolean.valueOf(settings.getSaveFormData()));
            map.put("supportMultipleWindows", Boolean.valueOf(settings.supportMultipleWindows()));
            map.put("overScrollMode", Integer.valueOf(inAppWebView.getOverScrollMode()));
            map.put("scrollBarStyle", Integer.valueOf(inAppWebView.getScrollBarStyle()));
            map.put("verticalScrollbarPosition", Integer.valueOf(inAppWebView.getVerticalScrollbarPosition()));
            map.put("scrollBarDefaultDelayBeforeFade", Integer.valueOf(inAppWebView.getScrollBarDefaultDelayBeforeFade()));
            map.put("scrollbarFadingEnabled", Boolean.valueOf(inAppWebView.isScrollbarFadingEnabled()));
            map.put("scrollBarFadeDuration", Integer.valueOf(inAppWebView.getScrollBarFadeDuration()));
            if (i10 >= 26) {
                HashMap hashMap = new HashMap();
                hashMap.put("rendererRequestedPriority", Integer.valueOf(inAppWebView.getRendererRequestedPriority()));
                hashMap.put("waivedWhenNotVisible", Boolean.valueOf(inAppWebView.getRendererPriorityWaivedWhenNotVisible()));
                map.put("rendererPriorityPolicy", hashMap);
            }
            if (s.a("SUPPRESS_ERROR_PAGE")) {
                map.put("disableDefaultErrorPage", Boolean.valueOf(p.s(settings)));
            }
            if (s.a("ALGORITHMIC_DARKENING") && i10 >= 29) {
                map.put("algorithmicDarkeningAllowed", Boolean.valueOf(p.i(settings)));
            }
            if (s.a("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY")) {
                map.put("enterpriseAuthenticationAppLinkPolicyEnabled", Boolean.valueOf(p.c(settings)));
            }
            if (s.a("REQUESTED_WITH_HEADER_ALLOW_LIST")) {
                map.put("requestedWithHeaderOriginAllowList", new ArrayList(p.g(settings)));
            }
        }
        return map;
    }

    public InAppWebViewSettings parse(Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value != null) {
                str.hashCode();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -2116596967:
                        if (str.equals("disableHorizontalScroll")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -2095822429:
                        if (str.equals("scrollBarDefaultDelayBeforeFade")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -2020146208:
                        if (str.equals("useWideViewPort")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -2014672109:
                        if (str.equals("allowFileAccessFromFileURLs")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case -1931277743:
                        if (str.equals("defaultFontSize")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case -1851090878:
                        if (str.equals("supportZoom")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case -1845480382:
                        if (str.equals("scrollbarFadingEnabled")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case -1834028884:
                        if (str.equals("defaultTextEncodingName")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case -1746033750:
                        if (str.equals("needInitialFocus")) {
                            c10 = 8;
                            break;
                        }
                        break;
                    case -1712086669:
                        if (str.equals("useShouldOverrideUrlLoading")) {
                            c10 = 9;
                            break;
                        }
                        break;
                    case -1673892229:
                        if (str.equals("preferredContentMode")) {
                            c10 = 10;
                            break;
                        }
                        break;
                    case -1657552268:
                        if (str.equals("allowContentAccess")) {
                            c10 = 11;
                            break;
                        }
                        break;
                    case -1626497241:
                        if (str.equals("fixedFontFamily")) {
                            c10 = 12;
                            break;
                        }
                        break;
                    case -1615103092:
                        if (str.equals("builtInZoomControls")) {
                            c10 = 13;
                            break;
                        }
                        break;
                    case -1607633676:
                        if (str.equals("javaScriptEnabled")) {
                            c10 = 14;
                            break;
                        }
                        break;
                    case -1578962296:
                        if (str.equals("hardwareAcceleration")) {
                            c10 = 15;
                            break;
                        }
                        break;
                    case -1578507205:
                        if (str.equals("networkAvailable")) {
                            c10 = 16;
                            break;
                        }
                        break;
                    case -1574470051:
                        if (str.equals("useShouldInterceptFetchRequest")) {
                            c10 = 17;
                            break;
                        }
                        break;
                    case -1480607106:
                        if (str.equals("loadsImagesAutomatically")) {
                            c10 = 18;
                            break;
                        }
                        break;
                    case -1455624881:
                        if (str.equals("resourceCustomSchemes")) {
                            c10 = 19;
                            break;
                        }
                        break;
                    case -1443655540:
                        if (str.equals("disabledActionModeMenuItems")) {
                            c10 = 20;
                            break;
                        }
                        break;
                    case -1423657812:
                        if (str.equals("incognito")) {
                            c10 = 21;
                            break;
                        }
                        break;
                    case -1410791825:
                        if (str.equals("allowBackgroundAudioPlaying")) {
                            c10 = 22;
                            break;
                        }
                        break;
                    case -1349570230:
                        if (str.equals("webViewAssetLoader")) {
                            c10 = 23;
                            break;
                        }
                        break;
                    case -1321236988:
                        if (str.equals("overScrollMode")) {
                            c10 = 24;
                            break;
                        }
                        break;
                    case -1146673624:
                        if (str.equals("domStorageEnabled")) {
                            c10 = 25;
                            break;
                        }
                        break;
                    case -1143245914:
                        if (str.equals("disableContextMenu")) {
                            c10 = 26;
                            break;
                        }
                        break;
                    case -1038715033:
                        if (str.equals("useShouldInterceptAjaxRequest")) {
                            c10 = 27;
                            break;
                        }
                        break;
                    case -1003454816:
                        if (str.equals("textZoom")) {
                            c10 = 28;
                            break;
                        }
                        break;
                    case -868328270:
                        if (str.equals("interceptOnlyAsyncAjaxRequests")) {
                            c10 = 29;
                            break;
                        }
                        break;
                    case -800676066:
                        if (str.equals("minimumFontSize")) {
                            c10 = 30;
                            break;
                        }
                        break;
                    case -767637403:
                        if (str.equals("layoutAlgorithm")) {
                            c10 = 31;
                            break;
                        }
                        break;
                    case -759238347:
                        if (str.equals("clearCache")) {
                            c10 = ' ';
                            break;
                        }
                        break;
                    case -742944736:
                        if (str.equals("transparentBackground")) {
                            c10 = '!';
                            break;
                        }
                        break;
                    case -741649011:
                        if (str.equals("enterpriseAuthenticationAppLinkPolicyEnabled")) {
                            c10 = '\"';
                            break;
                        }
                        break;
                    case -728016272:
                        if (str.equals("allowUniversalAccessFromFileURLs")) {
                            c10 = '#';
                            break;
                        }
                        break;
                    case -710246074:
                        if (str.equals("databaseEnabled")) {
                            c10 = '$';
                            break;
                        }
                        break;
                    case -706772569:
                        if (str.equals("useShouldInterceptRequest")) {
                            c10 = '%';
                            break;
                        }
                        break;
                    case -553792443:
                        if (str.equals("cacheMode")) {
                            c10 = '&';
                            break;
                        }
                        break;
                    case -443422049:
                        if (str.equals("horizontalScrollBarEnabled")) {
                            c10 = '\'';
                            break;
                        }
                        break;
                    case -435719349:
                        if (str.equals("scrollBarStyle")) {
                            c10 = '(';
                            break;
                        }
                        break;
                    case -421090202:
                        if (str.equals("initialScale")) {
                            c10 = ')';
                            break;
                        }
                        break;
                    case -321425255:
                        if (str.equals("verticalScrollbarPosition")) {
                            c10 = '*';
                            break;
                        }
                        break;
                    case -229178645:
                        if (str.equals("disableVerticalScroll")) {
                            c10 = '+';
                            break;
                        }
                        break;
                    case -227577491:
                        if (str.equals("javaScriptCanOpenWindowsAutomatically")) {
                            c10 = ',';
                            break;
                        }
                        break;
                    case -225496870:
                        if (str.equals("horizontalScrollbarTrackColor")) {
                            c10 = '-';
                            break;
                        }
                        break;
                    case -225165915:
                        if (str.equals("offscreenPreRaster")) {
                            c10 = '.';
                            break;
                        }
                        break;
                    case -216514471:
                        if (str.equals("fantasyFontFamily")) {
                            c10 = '/';
                            break;
                        }
                        break;
                    case -158057575:
                        if (str.equals("rendererPriorityPolicy")) {
                            c10 = '0';
                            break;
                        }
                        break;
                    case -98561827:
                        if (str.equals("sansSerifFontFamily")) {
                            c10 = '1';
                            break;
                        }
                        break;
                    case 57717170:
                        if (str.equals("regexToCancelSubFramesLoading")) {
                            c10 = '2';
                            break;
                        }
                        break;
                    case 100868168:
                        if (str.equals("verticalScrollbarTrackColor")) {
                            c10 = '3';
                            break;
                        }
                        break;
                    case 174479508:
                        if (str.equals("useOnDownloadStart")) {
                            c10 = '4';
                            break;
                        }
                        break;
                    case 229242772:
                        if (str.equals("forceDarkStrategy")) {
                            c10 = '5';
                            break;
                        }
                        break;
                    case 257886264:
                        if (str.equals("cursiveFontFamily")) {
                            c10 = '6';
                            break;
                        }
                        break;
                    case 273267153:
                        if (str.equals("mediaPlaybackRequiresUserGesture")) {
                            c10 = '7';
                            break;
                        }
                        break;
                    case 296040698:
                        if (str.equals("blockNetworkImage")) {
                            c10 = '8';
                            break;
                        }
                        break;
                    case 298870764:
                        if (str.equals("blockNetworkLoads")) {
                            c10 = '9';
                            break;
                        }
                        break;
                    case 311430650:
                        if (str.equals("userAgent")) {
                            c10 = ':';
                            break;
                        }
                        break;
                    case 387230482:
                        if (str.equals("useOnRenderProcessGone")) {
                            c10 = ';';
                            break;
                        }
                        break;
                    case 393481210:
                        if (str.equals("useOnLoadResource")) {
                            c10 = '<';
                            break;
                        }
                        break;
                    case 397237599:
                        if (str.equals("cacheEnabled")) {
                            c10 = '=';
                            break;
                        }
                        break;
                    case 408799019:
                        if (str.equals("saveFormData")) {
                            c10 = '>';
                            break;
                        }
                        break;
                    case 477312960:
                        if (str.equals("requestedWithHeaderOriginAllowList")) {
                            c10 = '?';
                            break;
                        }
                        break;
                    case 487904071:
                        if (str.equals("useHybridComposition")) {
                            c10 = '@';
                            break;
                        }
                        break;
                    case 590869196:
                        if (str.equals("applicationNameForUserAgent")) {
                            c10 = 'A';
                            break;
                        }
                        break;
                    case 760962753:
                        if (str.equals("mixedContentMode")) {
                            c10 = 'B';
                            break;
                        }
                        break;
                    case 849171798:
                        if (str.equals("scrollBarFadeDuration")) {
                            c10 = 'C';
                            break;
                        }
                        break;
                    case 1138246185:
                        if (str.equals("allowFileAccess")) {
                            c10 = 'D';
                            break;
                        }
                        break;
                    case 1156608422:
                        if (str.equals("appCachePath")) {
                            c10 = 'E';
                            break;
                        }
                        break;
                    case 1193086767:
                        if (str.equals("horizontalScrollbarThumbColor")) {
                            c10 = 'F';
                            break;
                        }
                        break;
                    case 1301942064:
                        if (str.equals("standardFontFamily")) {
                            c10 = 'G';
                            break;
                        }
                        break;
                    case 1320461707:
                        if (str.equals("displayZoomControls")) {
                            c10 = 'H';
                            break;
                        }
                        break;
                    case 1344414299:
                        if (str.equals("geolocationEnabled")) {
                            c10 = 'I';
                            break;
                        }
                        break;
                    case 1409728424:
                        if (str.equals("loadWithOverviewMode")) {
                            c10 = 'J';
                            break;
                        }
                        break;
                    case 1474890029:
                        if (str.equals("safeBrowsingEnabled")) {
                            c10 = 'K';
                            break;
                        }
                        break;
                    case 1496887792:
                        if (str.equals("serifFontFamily")) {
                            c10 = 'L';
                            break;
                        }
                        break;
                    case 1519451805:
                        if (str.equals("verticalScrollbarThumbColor")) {
                            c10 = 'M';
                            break;
                        }
                        break;
                    case 1527546113:
                        if (str.equals("forceDark")) {
                            c10 = 'N';
                            break;
                        }
                        break;
                    case 1583791742:
                        if (str.equals("disableDefaultErrorPage")) {
                            c10 = 'O';
                            break;
                        }
                        break;
                    case 1759079762:
                        if (str.equals("contentBlockers")) {
                            c10 = 'P';
                            break;
                        }
                        break;
                    case 1774215812:
                        if (str.equals("supportMultipleWindows")) {
                            c10 = 'Q';
                            break;
                        }
                        break;
                    case 1793491907:
                        if (str.equals("defaultFixedFontSize")) {
                            c10 = 'R';
                            break;
                        }
                        break;
                    case 1812525393:
                        if (str.equals("thirdPartyCookiesEnabled")) {
                            c10 = 'S';
                            break;
                        }
                        break;
                    case 1956631083:
                        if (str.equals("minimumLogicalFontSize")) {
                            c10 = 'T';
                            break;
                        }
                        break;
                    case 2011947505:
                        if (str.equals("verticalScrollBarEnabled")) {
                            c10 = 'U';
                            break;
                        }
                        break;
                    case 2038327673:
                        if (str.equals("clearSessionCache")) {
                            c10 = 'V';
                            break;
                        }
                        break;
                    case 2056553639:
                        if (str.equals("defaultVideoPoster")) {
                            c10 = 'W';
                            break;
                        }
                        break;
                    case 2086547246:
                        if (str.equals("algorithmicDarkeningAllowed")) {
                            c10 = 'X';
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        this.disableHorizontalScroll = (Boolean) value;
                        break;
                    case 1:
                        this.scrollBarDefaultDelayBeforeFade = (Integer) value;
                        break;
                    case 2:
                        this.useWideViewPort = (Boolean) value;
                        break;
                    case 3:
                        this.allowFileAccessFromFileURLs = (Boolean) value;
                        break;
                    case 4:
                        this.defaultFontSize = (Integer) value;
                        break;
                    case 5:
                        this.supportZoom = (Boolean) value;
                        break;
                    case 6:
                        this.scrollbarFadingEnabled = (Boolean) value;
                        break;
                    case 7:
                        this.defaultTextEncodingName = (String) value;
                        break;
                    case 8:
                        this.needInitialFocus = (Boolean) value;
                        break;
                    case 9:
                        this.useShouldOverrideUrlLoading = (Boolean) value;
                        break;
                    case 10:
                        this.preferredContentMode = (Integer) value;
                        break;
                    case 11:
                        this.allowContentAccess = (Boolean) value;
                        break;
                    case 12:
                        this.fixedFontFamily = (String) value;
                        break;
                    case 13:
                        this.builtInZoomControls = (Boolean) value;
                        break;
                    case 14:
                        this.javaScriptEnabled = (Boolean) value;
                        break;
                    case 15:
                        this.hardwareAcceleration = (Boolean) value;
                        break;
                    case 16:
                        this.networkAvailable = (Boolean) value;
                        break;
                    case 17:
                        this.useShouldInterceptFetchRequest = (Boolean) value;
                        break;
                    case 18:
                        this.loadsImagesAutomatically = (Boolean) value;
                        break;
                    case 19:
                        this.resourceCustomSchemes = (List) value;
                        break;
                    case 20:
                        this.disabledActionModeMenuItems = (Integer) value;
                        break;
                    case 21:
                        this.incognito = (Boolean) value;
                        break;
                    case 22:
                        this.allowBackgroundAudioPlaying = (Boolean) value;
                        break;
                    case 23:
                        this.webViewAssetLoader = (Map) value;
                        break;
                    case 24:
                        this.overScrollMode = (Integer) value;
                        break;
                    case 25:
                        this.domStorageEnabled = (Boolean) value;
                        break;
                    case 26:
                        this.disableContextMenu = (Boolean) value;
                        break;
                    case 27:
                        this.useShouldInterceptAjaxRequest = (Boolean) value;
                        break;
                    case 28:
                        this.textZoom = (Integer) value;
                        break;
                    case 29:
                        this.interceptOnlyAsyncAjaxRequests = (Boolean) value;
                        break;
                    case 30:
                        this.minimumFontSize = (Integer) value;
                        break;
                    case 31:
                        setLayoutAlgorithm((String) value);
                        break;
                    case ' ':
                        this.clearCache = (Boolean) value;
                        break;
                    case '!':
                        this.transparentBackground = (Boolean) value;
                        break;
                    case '\"':
                        this.enterpriseAuthenticationAppLinkPolicyEnabled = (Boolean) value;
                        break;
                    case '#':
                        this.allowUniversalAccessFromFileURLs = (Boolean) value;
                        break;
                    case '$':
                        this.databaseEnabled = (Boolean) value;
                        break;
                    case '%':
                        this.useShouldInterceptRequest = (Boolean) value;
                        break;
                    case '&':
                        this.cacheMode = (Integer) value;
                        break;
                    case '\'':
                        this.horizontalScrollBarEnabled = (Boolean) value;
                        break;
                    case '(':
                        this.scrollBarStyle = (Integer) value;
                        break;
                    case ')':
                        this.initialScale = (Integer) value;
                        break;
                    case '*':
                        this.verticalScrollbarPosition = (Integer) value;
                        break;
                    case '+':
                        this.disableVerticalScroll = (Boolean) value;
                        break;
                    case ',':
                        this.javaScriptCanOpenWindowsAutomatically = (Boolean) value;
                        break;
                    case '-':
                        this.horizontalScrollbarTrackColor = (String) value;
                        break;
                    case '.':
                        this.offscreenPreRaster = (Boolean) value;
                        break;
                    case '/':
                        this.fantasyFontFamily = (String) value;
                        break;
                    case '0':
                        this.rendererPriorityPolicy = (Map) value;
                        break;
                    case '1':
                        this.sansSerifFontFamily = (String) value;
                        break;
                    case '2':
                        this.regexToCancelSubFramesLoading = (String) value;
                        break;
                    case '3':
                        this.verticalScrollbarTrackColor = (String) value;
                        break;
                    case '4':
                        this.useOnDownloadStart = (Boolean) value;
                        break;
                    case '5':
                        this.forceDarkStrategy = (Integer) value;
                        break;
                    case '6':
                        this.cursiveFontFamily = (String) value;
                        break;
                    case '7':
                        this.mediaPlaybackRequiresUserGesture = (Boolean) value;
                        break;
                    case '8':
                        this.blockNetworkImage = (Boolean) value;
                        break;
                    case '9':
                        this.blockNetworkLoads = (Boolean) value;
                        break;
                    case ':':
                        this.userAgent = (String) value;
                        break;
                    case ';':
                        this.useOnRenderProcessGone = (Boolean) value;
                        break;
                    case '<':
                        this.useOnLoadResource = (Boolean) value;
                        break;
                    case '=':
                        this.cacheEnabled = (Boolean) value;
                        break;
                    case '>':
                        this.saveFormData = (Boolean) value;
                        break;
                    case '?':
                        this.requestedWithHeaderOriginAllowList = new HashSet((List) value);
                        break;
                    case '@':
                        this.useHybridComposition = (Boolean) value;
                        break;
                    case 'A':
                        this.applicationNameForUserAgent = (String) value;
                        break;
                    case 'B':
                        this.mixedContentMode = (Integer) value;
                        break;
                    case 'C':
                        this.scrollBarFadeDuration = (Integer) value;
                        break;
                    case 'D':
                        this.allowFileAccess = (Boolean) value;
                        break;
                    case 'E':
                        this.appCachePath = (String) value;
                        break;
                    case 'F':
                        this.horizontalScrollbarThumbColor = (String) value;
                        break;
                    case 'G':
                        this.standardFontFamily = (String) value;
                        break;
                    case 'H':
                        this.displayZoomControls = (Boolean) value;
                        break;
                    case 'I':
                        this.geolocationEnabled = (Boolean) value;
                        break;
                    case 'J':
                        this.loadWithOverviewMode = (Boolean) value;
                        break;
                    case 'K':
                        this.safeBrowsingEnabled = (Boolean) value;
                        break;
                    case 'L':
                        this.serifFontFamily = (String) value;
                        break;
                    case 'M':
                        this.verticalScrollbarThumbColor = (String) value;
                        break;
                    case 'N':
                        this.forceDark = (Integer) value;
                        break;
                    case 'O':
                        this.disableDefaultErrorPage = (Boolean) value;
                        break;
                    case 'P':
                        this.contentBlockers = (List) value;
                        break;
                    case 'Q':
                        this.supportMultipleWindows = (Boolean) value;
                        break;
                    case 'R':
                        this.defaultFixedFontSize = (Integer) value;
                        break;
                    case 'S':
                        this.thirdPartyCookiesEnabled = (Boolean) value;
                        break;
                    case 'T':
                        this.minimumLogicalFontSize = (Integer) value;
                        break;
                    case 'U':
                        this.verticalScrollBarEnabled = (Boolean) value;
                        break;
                    case 'V':
                        this.clearSessionCache = (Boolean) value;
                        break;
                    case 'W':
                        this.defaultVideoPoster = (byte[]) value;
                        break;
                    case 'X':
                        this.algorithmicDarkeningAllowed = (Boolean) value;
                        break;
                }
            }
        }
        return this;
    }
}
