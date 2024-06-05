package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintJob;
import android.print.PrintManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsoluteLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.mediation.MaxReward;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlocker;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerAction;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerTrigger;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionController;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.ConsoleLogJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.InterceptAjaxRequestJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.InterceptFetchRequestJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnLoadResourceJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnWindowBlurEventJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnWindowFocusEventJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PluginScriptsUtil;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PrintJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PromisePolyfillJS;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobController;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview_android.types.DownloadStartRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.HitTestResult;
import com.pichillilorenzo.flutter_inappwebview_android.types.MediaSizeExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType;
import com.pichillilorenzo.flutter_inappwebview_android.types.ResolutionExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessage;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebViewAssetLoaderExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.ContextMenuSettings;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import j1.p;
import j1.r;
import j1.s;
import j1.u;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import lc.c;
import lc.k;
import org.json.JSONArray;
import org.json.JSONObject;

public final class InAppWebView extends InputAwareWebView implements InAppWebViewInterface {
    protected static final String LOG_TAG = "InAppWebView";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_";
    static Handler mHandler = new Handler();
    public Map<String, ValueCallback<String>> callAsyncJavaScriptCallbacks = new HashMap();
    public WebViewChannelDelegate channelDelegate;
    public Runnable checkContextMenuShouldBeClosedTask;
    public Runnable checkScrollStoppedTask;
    public ContentBlockerHandler contentBlockerHandler = new ContentBlockerHandler();
    public Map<String, Object> contextMenu = null;
    /* access modifiers changed from: private */
    public Point contextMenuPoint = new Point(0, 0);
    public InAppWebViewSettings customSettings = new InAppWebViewSettings();
    public Map<String, ValueCallback<String>> evaluateJavaScriptContentWorldCallbacks = new HashMap();
    public FindInteractionController findInteractionController;
    public LinearLayout floatingContextMenu = null;
    public GestureDetector gestureDetector = null;

    /* renamed from: id  reason: collision with root package name */
    public Object f28503id;
    public InAppBrowserDelegate inAppBrowserDelegate;
    public InAppWebViewChromeClient inAppWebViewChromeClient;
    public InAppWebViewClient inAppWebViewClient;
    public InAppWebViewClientCompat inAppWebViewClientCompat;
    public InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient;
    private boolean inFullscreen = false;
    public int initialPositionScrollStoppedTask;
    private List<UserScript> initialUserOnlyScripts = new ArrayList();
    private PluginScript interceptOnlyAsyncAjaxRequestsPluginScript;
    public boolean isLoading = false;
    public JavaScriptBridgeInterface javaScriptBridgeInterface;
    private Point lastTouch = new Point(0, 0);
    public Handler mainLooperHandler = new Handler(getWebViewLooper());
    public int newCheckContextMenuShouldBeClosedTaskTask = 100;
    public int newCheckScrollStoppedTask = 100;
    public InAppWebViewFlutterPlugin plugin;
    public Pattern regexToCancelSubFramesLoadingCompiled;
    public UserContentController userContentController = new UserContentController(this);
    public Map<String, WebMessageChannel> webMessageChannels = new HashMap();
    public List<WebMessageListener> webMessageListeners = new ArrayList();
    public WebViewAssetLoaderExt webViewAssetLoaderExt;
    public Integer windowId;
    public float zoomScale = 1.0f;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView$21  reason: invalid class name */
    static /* synthetic */ class AnonymousClass21 {
        static final /* synthetic */ int[] $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType[] r0 = com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType = r0
                com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType r1 = com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType.DESKTOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType r1 = com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType.MOBILE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType r1 = com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType.RECOMMENDED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.AnonymousClass21.<clinit>():void");
        }
    }

    class DownloadStartListener implements DownloadListener {
        DownloadStartListener() {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
            DownloadStartRequest downloadStartRequest = new DownloadStartRequest(str, str2, str3, str4, j10, URLUtil.guessFileName(str, str3, str4), (String) null);
            WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
            if (webViewChannelDelegate != null) {
                webViewChannelDelegate.onDownloadStartRequest(downloadStartRequest);
            }
        }
    }

    public InAppWebView(Context context) {
        super(context);
    }

    @Deprecated
    private void clearCookies() {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().removeAllCookies(new ValueCallback<Boolean>() {
                public void onReceiveValue(Boolean bool) {
                }
            });
        } else {
            CookieManager.getInstance().removeAllCookie();
        }
    }

    private void sendOnCreateContextMenuEvent() {
        HitTestResult fromWebViewHitTestResult = HitTestResult.fromWebViewHitTestResult(getHitTestResult());
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onCreateContextMenu(fromWebViewHitTestResult);
        }
    }

    public void addWebMessageListener(WebMessageListener webMessageListener) throws Exception {
        if (s.a("WEB_MESSAGE_LISTENER")) {
            r.b(this, webMessageListener.jsObjectName, webMessageListener.allowedOriginRules, webMessageListener.listener);
            this.webMessageListeners.add(webMessageListener);
        }
    }

    public void adjustFloatingContextMenuPosition() {
        evaluateJavascript("(function(){  var selection = window.getSelection();  var rangeY = null;  if (selection != null && selection.rangeCount > 0) {    var range = selection.getRangeAt(0);    var clientRect = range.getClientRects();    if (clientRect.length > 0) {      rangeY = clientRect[0].y;    } else if (document.activeElement != null && document.activeElement.tagName.toLowerCase() !== 'iframe') {      var boundingClientRect = document.activeElement.getBoundingClientRect();      rangeY = boundingClientRect.y;    }  }  return rangeY;})();", new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                if (InAppWebView.this.floatingContextMenu == null) {
                    return;
                }
                if (str == null || str.equalsIgnoreCase("null")) {
                    InAppWebView.this.floatingContextMenu.setVisibility(0);
                    InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100).setListener((Animator.AnimatorListener) null);
                    InAppWebView inAppWebView = InAppWebView.this;
                    inAppWebView.onFloatingActionGlobalLayout(inAppWebView.contextMenuPoint.x, InAppWebView.this.contextMenuPoint.y);
                    return;
                }
                int i10 = InAppWebView.this.contextMenuPoint.x;
                int parseFloat = (int) (((double) (Float.parseFloat(str) * Util.getPixelDensity(InAppWebView.this.getContext()))) + (((double) InAppWebView.this.floatingContextMenu.getHeight()) / 3.5d));
                InAppWebView.this.contextMenuPoint.y = parseFloat;
                InAppWebView.this.onFloatingActionGlobalLayout(i10, parseFloat);
            }
        });
    }

    public void callAsyncJavaScript(String str, Map<String, Object> map, ContentWorld contentWorld, ValueCallback<String> valueCallback) {
        String uuid = UUID.randomUUID().toString();
        if (valueCallback != null) {
            this.callAsyncJavaScriptCallbacks.put(uuid, valueCallback);
        }
        Iterator<String> keys = new JSONObject(map).keys();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (keys.hasNext()) {
            String next = keys.next();
            arrayList.add(next);
            arrayList2.add("obj." + next);
        }
        String join = TextUtils.join(", ", arrayList);
        String join2 = TextUtils.join(", ", arrayList2);
        evaluateJavascript(this.userContentController.generateCodeForScriptEvaluation(PluginScriptsUtil.CALL_ASYNC_JAVA_SCRIPT_WRAPPER_JS_SOURCE.replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENT_NAMES, join).replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENT_VALUES, join2).replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENTS_OBJ, Util.JSONStringify(map)).replace(PluginScriptsUtil.VAR_FUNCTION_BODY, str).replace(PluginScriptsUtil.VAR_RESULT_UUID, uuid).replace(PluginScriptsUtil.VAR_RESULT_UUID, uuid), contentWorld), (ValueCallback) null);
    }

    public boolean canScrollHorizontally() {
        return computeHorizontalScrollRange() > computeHorizontalScrollExtent();
    }

    public boolean canScrollVertically() {
        return computeVerticalScrollRange() > computeVerticalScrollExtent();
    }

    @Deprecated
    public void clearAllCache() {
        clearCache(true);
        clearCookies();
        clearFormData();
        WebStorage.getInstance().deleteAllData();
    }

    public WebMessageChannel createCompatWebMessageChannel() {
        String uuid = UUID.randomUUID().toString();
        WebMessageChannel webMessageChannel = new WebMessageChannel(uuid, this);
        this.webMessageChannels.put(uuid, webMessageChannel);
        return webMessageChannel;
    }

    public WebMessageChannel createWebMessageChannel(ValueCallback<WebMessageChannel> valueCallback) {
        WebMessageChannel createCompatWebMessageChannel = createCompatWebMessageChannel();
        valueCallback.onReceiveValue(createCompatWebMessageChannel);
        return createCompatWebMessageChannel;
    }

    public WebViewClient createWebViewClient(InAppBrowserDelegate inAppBrowserDelegate2) {
        PackageInfo f10 = r.f(getContext());
        if (f10 == null) {
            Log.d(LOG_TAG, "Using InAppWebViewClient implementation");
            return new InAppWebViewClient(inAppBrowserDelegate2);
        }
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = "com.android.webview".equals(f10.packageName) || "com.google.android.webview".equals(f10.packageName) || "com.android.chrome".equals(f10.packageName);
        if (z12) {
            String str = f10.versionName;
            if (str == null) {
                str = MaxReward.DEFAULT_LABEL;
            }
            try {
                if ((str.contains(".") ? Integer.parseInt(str.split("\\.")[0]) : 0) < 73) {
                    z10 = false;
                }
                z11 = z10;
            } catch (NumberFormatException unused) {
            }
        }
        if (z11 || !z12) {
            Log.d(LOG_TAG, "Using InAppWebViewClientCompat implementation");
            return new InAppWebViewClientCompat(inAppBrowserDelegate2);
        }
        Log.d(LOG_TAG, "Using InAppWebViewClient implementation");
        return new InAppWebViewClient(inAppBrowserDelegate2);
    }

    public void destroy() {
        super.destroy();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void dispose() {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        InAppWebViewManager inAppWebViewManager;
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        super.dispose();
        getSettings().setJavaScriptEnabled(false);
        removeJavascriptInterface(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME);
        if (Build.VERSION.SDK_INT >= 29 && s.a("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE")) {
            r.r(this, (u) null);
        }
        setWebChromeClient(new WebChromeClient());
        setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView webView, String str) {
                InAppWebView.this.destroy();
            }
        });
        this.interceptOnlyAsyncAjaxRequestsPluginScript = null;
        this.userContentController.dispose();
        FindInteractionController findInteractionController2 = this.findInteractionController;
        if (findInteractionController2 != null) {
            findInteractionController2.dispose();
            this.findInteractionController = null;
        }
        WebViewAssetLoaderExt webViewAssetLoaderExt2 = this.webViewAssetLoaderExt;
        if (webViewAssetLoaderExt2 != null) {
            webViewAssetLoaderExt2.dispose();
            this.webViewAssetLoaderExt = null;
        }
        Integer num = this.windowId;
        if (!(num == null || (inAppWebViewFlutterPlugin = this.plugin) == null || (inAppWebViewManager = inAppWebViewFlutterPlugin.inAppWebViewManager) == null)) {
            inAppWebViewManager.windowWebViewMessages.remove(num);
        }
        this.mainLooperHandler.removeCallbacksAndMessages((Object) null);
        mHandler.removeCallbacksAndMessages((Object) null);
        disposeWebMessageChannels();
        disposeWebMessageListeners();
        removeAllViews();
        Runnable runnable = this.checkContextMenuShouldBeClosedTask;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.checkScrollStoppedTask;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.callAsyncJavaScriptCallbacks.clear();
        this.evaluateJavaScriptContentWorldCallbacks.clear();
        this.inAppBrowserDelegate = null;
        InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient2 = this.inAppWebViewRenderProcessClient;
        if (inAppWebViewRenderProcessClient2 != null) {
            inAppWebViewRenderProcessClient2.dispose();
            this.inAppWebViewRenderProcessClient = null;
        }
        InAppWebViewChromeClient inAppWebViewChromeClient2 = this.inAppWebViewChromeClient;
        if (inAppWebViewChromeClient2 != null) {
            inAppWebViewChromeClient2.dispose();
            this.inAppWebViewChromeClient = null;
        }
        InAppWebViewClientCompat inAppWebViewClientCompat2 = this.inAppWebViewClientCompat;
        if (inAppWebViewClientCompat2 != null) {
            inAppWebViewClientCompat2.dispose();
            this.inAppWebViewClientCompat = null;
        }
        InAppWebViewClient inAppWebViewClient2 = this.inAppWebViewClient;
        if (inAppWebViewClient2 != null) {
            inAppWebViewClient2.dispose();
            this.inAppWebViewClient = null;
        }
        JavaScriptBridgeInterface javaScriptBridgeInterface2 = this.javaScriptBridgeInterface;
        if (javaScriptBridgeInterface2 != null) {
            javaScriptBridgeInterface2.dispose();
            this.javaScriptBridgeInterface = null;
        }
        this.plugin = null;
        loadUrl(AndroidWebViewClient.BLANK_PAGE);
    }

    public void disposeWebMessageChannels() {
        for (WebMessageChannel dispose : this.webMessageChannels.values()) {
            dispose.dispose();
        }
        this.webMessageChannels.clear();
    }

    public void disposeWebMessageListeners() {
        for (WebMessageListener dispose : this.webMessageListeners) {
            dispose.dispose();
        }
        this.webMessageListeners.clear();
    }

    public void enablePluginScriptAtRuntime(final String str, final boolean z10, final PluginScript pluginScript) {
        evaluateJavascript("window." + str, (ContentWorld) null, new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                if (str != null && !str.equalsIgnoreCase("null")) {
                    InAppWebView.this.evaluateJavascript("window." + str + " = " + z10 + ";", (ContentWorld) null, (ValueCallback<String>) null);
                    if (!z10) {
                        InAppWebView.this.userContentController.removePluginScript(pluginScript);
                    }
                } else if (z10) {
                    InAppWebView.this.evaluateJavascript(pluginScript.getSource(), (ContentWorld) null, (ValueCallback<String>) null);
                    InAppWebView.this.userContentController.addPluginScript(pluginScript);
                }
            }
        });
    }

    public void evaluateJavascript(String str, ContentWorld contentWorld, ValueCallback<String> valueCallback) {
        injectDeferredObject(str, contentWorld, (String) null, valueCallback);
    }

    public WebViewChannelDelegate getChannelDelegate() {
        return this.channelDelegate;
    }

    public void getContentHeight(ValueCallback<Integer> valueCallback) {
        valueCallback.onReceiveValue(Integer.valueOf(getContentHeight()));
    }

    public void getContentWidth(final ValueCallback<Integer> valueCallback) {
        evaluateJavascript("document.documentElement.scrollWidth;", new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                valueCallback.onReceiveValue((str == null || str.equalsIgnoreCase("null")) ? null : Integer.valueOf(Integer.parseInt(str)));
            }
        });
    }

    public Map<String, Object> getContextMenu() {
        return this.contextMenu;
    }

    public HashMap<String, Object> getCopyBackForwardList() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        int size = copyBackForwardList.getSize();
        int currentIndex = copyBackForwardList.getCurrentIndex();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i10);
            HashMap hashMap = new HashMap();
            hashMap.put("originalUrl", itemAtIndex.getOriginalUrl());
            hashMap.put("title", itemAtIndex.getTitle());
            hashMap.put("url", itemAtIndex.getUrl());
            arrayList.add(hashMap);
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("list", arrayList);
        hashMap2.put("currentIndex", Integer.valueOf(currentIndex));
        return hashMap2;
    }

    public Map<String, Object> getCustomSettings() {
        InAppWebViewSettings inAppWebViewSettings = this.customSettings;
        if (inAppWebViewSettings != null) {
            return inAppWebViewSettings.getRealSettings((InAppWebViewInterface) this);
        }
        return null;
    }

    public void getHitTestResult(ValueCallback<HitTestResult> valueCallback) {
        valueCallback.onReceiveValue(HitTestResult.fromWebViewHitTestResult(getHitTestResult()));
    }

    public InAppBrowserDelegate getInAppBrowserDelegate() {
        return this.inAppBrowserDelegate;
    }

    public InAppWebViewFlutterPlugin getPlugin() {
        return this.plugin;
    }

    public void getSelectedText(final ValueCallback<String> valueCallback) {
        evaluateJavascript(PluginScriptsUtil.GET_SELECTED_TEXT_JS_SOURCE, new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                valueCallback.onReceiveValue((str == null || str.equalsIgnoreCase("null")) ? null : str.substring(1, str.length() - 1));
            }
        });
    }

    public UserContentController getUserContentController() {
        return this.userContentController;
    }

    public Map<String, WebMessageChannel> getWebMessageChannels() {
        return this.webMessageChannels;
    }

    public Looper getWebViewLooper() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getWebViewLooper();
        }
        return Looper.getMainLooper();
    }

    public float getZoomScale() {
        return this.zoomScale;
    }

    public void hideContextMenu() {
        removeView(this.floatingContextMenu);
        this.floatingContextMenu = null;
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onHideContextMenu();
        }
    }

    public void injectCSSCode(String str) {
        injectDeferredObject(str, (ContentWorld) null, "(function(d) { var style = d.createElement('style'); style.innerHTML = %s; if (d.head != null) { d.head.appendChild(style); } })(document);", (ValueCallback<String>) null);
    }

    public void injectCSSFileFromUrl(String str, Map<String, Object> map) {
        String str2;
        String str3;
        String str4 = MaxReward.DEFAULT_LABEL;
        if (map != null) {
            String str5 = (String) map.get("id");
            if (str5 != null) {
                str3 = str4 + " link.id = '" + str5.replaceAll("'", "\\\\'") + "'; ";
            } else {
                str3 = str4;
            }
            String str6 = (String) map.get("media");
            if (str6 != null) {
                str3 = str3 + " link.media = '" + str6.replaceAll("'", "\\\\'") + "'; ";
            }
            String str7 = (String) map.get("crossOrigin");
            if (str7 != null) {
                str3 = str3 + " link.crossOrigin = '" + str7.replaceAll("'", "\\\\'") + "'; ";
            }
            String str8 = (String) map.get("integrity");
            if (str8 != null) {
                str3 = str3 + " link.integrity = '" + str8.replaceAll("'", "\\\\'") + "'; ";
            }
            String str9 = (String) map.get("referrerPolicy");
            if (str9 != null) {
                str3 = str3 + " link.referrerPolicy = '" + str9.replaceAll("'", "\\\\'") + "'; ";
            }
            Boolean bool = (Boolean) map.get("disabled");
            if (bool != null && bool.booleanValue()) {
                str3 = str3 + " link.disabled = true; ";
            }
            Boolean bool2 = (Boolean) map.get("alternate");
            if (bool2 != null && bool2.booleanValue()) {
                str4 = "alternate ";
            }
            String str10 = (String) map.get("title");
            if (str10 != null) {
                str2 = str3 + " link.title = '" + str10.replaceAll("'", "\\\\'") + "'; ";
            } else {
                str2 = str3;
            }
        } else {
            str2 = str4;
        }
        injectDeferredObject(str, (ContentWorld) null, "(function(d) { var link = d.createElement('link'); link.rel='" + str4 + "stylesheet'; link.type='text/css'; " + str2 + " link.href = %s; if (d.head != null) { d.head.appendChild(link); } })(document);", (ValueCallback<String>) null);
    }

    public void injectDeferredObject(String str, ContentWorld contentWorld, String str2, ValueCallback<String> valueCallback) {
        String str3;
        final String str4;
        final String uuid = (contentWorld == null || contentWorld.equals(ContentWorld.PAGE)) ? null : UUID.randomUUID().toString();
        if (str2 != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            String jSONArray2 = jSONArray.toString();
            str3 = String.format(str2, new Object[]{jSONArray2.substring(1, jSONArray2.length() - 1)});
        } else {
            str3 = str;
        }
        if (uuid == null || valueCallback == null) {
            str4 = str3;
        } else {
            this.evaluateJavaScriptContentWorldCallbacks.put(uuid, valueCallback);
            str4 = Util.replaceAll(PluginScriptsUtil.EVALUATE_JAVASCRIPT_WITH_CONTENT_WORLD_WRAPPER_JS_SOURCE, PluginScriptsUtil.VAR_RANDOM_NAME, "_flutter_inappwebview_" + Math.round(Math.random() * 1000000.0d)).replace(PluginScriptsUtil.VAR_PLACEHOLDER_VALUE, UserContentController.escapeCode(str)).replace(PluginScriptsUtil.VAR_RESULT_UUID, uuid);
        }
        final ContentWorld contentWorld2 = contentWorld;
        final ValueCallback<String> valueCallback2 = valueCallback;
        this.mainLooperHandler.post(new Runnable() {
            public void run() {
                ValueCallback valueCallback;
                String generateCodeForScriptEvaluation = InAppWebView.this.userContentController.generateCodeForScriptEvaluation(str4, contentWorld2);
                if (Build.VERSION.SDK_INT < 19) {
                    InAppWebView inAppWebView = InAppWebView.this;
                    inAppWebView.loadUrl("javascript:" + generateCodeForScriptEvaluation.replaceAll("[\r\n]+", MaxReward.DEFAULT_LABEL));
                    if (contentWorld2 != null && (valueCallback = valueCallback2) != null) {
                        valueCallback.onReceiveValue(MaxReward.DEFAULT_LABEL);
                        return;
                    }
                    return;
                }
                InAppWebView.this.evaluateJavascript(generateCodeForScriptEvaluation, new ValueCallback<String>() {
                    public void onReceiveValue(String str) {
                        ValueCallback valueCallback;
                        AnonymousClass10 r02 = AnonymousClass10.this;
                        if (uuid == null && (valueCallback = valueCallback2) != null) {
                            valueCallback.onReceiveValue(str);
                        }
                    }
                });
            }
        });
    }

    public void injectJavascriptFileFromUrl(String str, Map<String, Object> map) {
        String str2 = MaxReward.DEFAULT_LABEL;
        if (map != null) {
            String str3 = (String) map.get("type");
            if (str3 != null) {
                str2 = str2 + " script.type = '" + str3.replaceAll("'", "\\\\'") + "'; ";
            }
            String str4 = (String) map.get("id");
            if (str4 != null) {
                String replaceAll = str4.replaceAll("'", "\\\\'");
                str2 = ((str2 + " script.id = '" + replaceAll + "'; ") + " script.onload = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptLoaded', '" + replaceAll + "');  }};") + " script.onerror = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptError', '" + replaceAll + "');  }};";
            }
            Boolean bool = (Boolean) map.get("async");
            if (bool != null && bool.booleanValue()) {
                str2 = str2 + " script.async = true; ";
            }
            Boolean bool2 = (Boolean) map.get("defer");
            if (bool2 != null && bool2.booleanValue()) {
                str2 = str2 + " script.defer = true; ";
            }
            String str5 = (String) map.get("crossOrigin");
            if (str5 != null) {
                str2 = str2 + " script.crossOrigin = '" + str5.replaceAll("'", "\\\\'") + "'; ";
            }
            String str6 = (String) map.get("integrity");
            if (str6 != null) {
                str2 = str2 + " script.integrity = '" + str6.replaceAll("'", "\\\\'") + "'; ";
            }
            Boolean bool3 = (Boolean) map.get("noModule");
            if (bool3 != null && bool3.booleanValue()) {
                str2 = str2 + " script.noModule = true; ";
            }
            String str7 = (String) map.get("nonce");
            if (str7 != null) {
                str2 = str2 + " script.nonce = '" + str7.replaceAll("'", "\\\\'") + "'; ";
            }
            String str8 = (String) map.get("referrerPolicy");
            if (str8 != null) {
                str2 = str2 + " script.referrerPolicy = '" + str8.replaceAll("'", "\\\\'") + "'; ";
            }
        }
        injectDeferredObject(str, (ContentWorld) null, "(function(d) { var script = d.createElement('script'); " + str2 + " script.src = %s; if (d.body != null) { d.body.appendChild(script); } })(document);", (ValueCallback<String>) null);
    }

    public boolean isInFullscreen() {
        return this.inFullscreen;
    }

    public boolean isLoading() {
        return this.isLoading;
    }

    public void isSecureContext(final ValueCallback<Boolean> valueCallback) {
        evaluateJavascript("window.isSecureContext", new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                if (str == null || str.isEmpty() || str.equalsIgnoreCase("null") || str.equalsIgnoreCase("false")) {
                    valueCallback.onReceiveValue(Boolean.FALSE);
                } else {
                    valueCallback.onReceiveValue(Boolean.TRUE);
                }
            }
        });
    }

    public void loadFile(String str) throws IOException {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            loadUrl(Util.getUrlAsset(inAppWebViewFlutterPlugin, str));
        }
    }

    public void loadUrl(URLRequest uRLRequest) {
        String url = uRLRequest.getUrl();
        String method = uRLRequest.getMethod();
        if (method == null || !method.equals("POST")) {
            Map<String, String> headers = uRLRequest.getHeaders();
            if (headers != null) {
                loadUrl(url, headers);
            } else {
                loadUrl(url);
            }
        } else {
            postUrl(url, uRLRequest.getBody());
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu2) {
        super.onCreateContextMenu(contextMenu2);
        sendOnCreateContextMenuEvent();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        View view;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null && !this.customSettings.useHybridComposition.booleanValue() && (view = this.containerView) != null) {
            view.getHandler().postDelayed(new Runnable() {
                public void run() {
                    boolean z10;
                    View view;
                    InputMethodManager inputMethodManager = (InputMethodManager) InAppWebView.this.getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        try {
                            z10 = inputMethodManager.isAcceptingText();
                        } catch (Exception unused) {
                        }
                        view = InAppWebView.this.containerView;
                        if (view != null && inputMethodManager != null && !z10) {
                            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
                            return;
                        }
                        return;
                    }
                    z10 = false;
                    view = InAppWebView.this.containerView;
                    if (view != null) {
                    }
                }
            }, 128);
        }
        return onCreateInputConnection;
    }

    public void onFloatingActionGlobalLayout(int i10, int i11) {
        int width = getWidth();
        getHeight();
        int width2 = this.floatingContextMenu.getWidth();
        int height = this.floatingContextMenu.getHeight();
        int i12 = i10 - (width2 / 2);
        if (i12 < 0) {
            i12 = 0;
        } else if (i12 + width2 > width) {
            i12 = width - width2;
        }
        float f10 = ((float) i11) - (((float) height) * 1.5f);
        if (f10 < 0.0f) {
            f10 = (float) (i11 + height);
        }
        updateViewLayout(this.floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, i12 + getScrollX(), ((int) f10) + getScrollY()));
        this.mainLooperHandler.post(new Runnable() {
            public void run() {
                LinearLayout linearLayout = InAppWebView.this.floatingContextMenu;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100).setListener((Animator.AnimatorListener) null);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        WebViewChannelDelegate webViewChannelDelegate;
        super.onOverScrolled(i10, i11, z10, z11);
        boolean z12 = true;
        boolean z13 = canScrollHorizontally() && z10;
        if (!canScrollVertically() || !z11) {
            z12 = false;
        }
        ViewParent parent = getParent();
        if ((parent instanceof PullToRefreshLayout) && z12 && i11 <= 10) {
            PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) parent;
            setOverScrollMode(2);
            pullToRefreshLayout.setEnabled(pullToRefreshLayout.settings.enabled.booleanValue());
            setOverScrollMode(this.customSettings.overScrollMode.intValue());
        }
        if ((z13 || z12) && (webViewChannelDelegate = this.channelDelegate) != null) {
            webViewChannelDelegate.onOverScrolled(i10, i11, z13, z12);
        }
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        LinearLayout linearLayout = this.floatingContextMenu;
        if (linearLayout != null) {
            linearLayout.setAlpha(0.0f);
            this.floatingContextMenu.setVisibility(8);
        }
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onScrollChanged(i10, i11);
        }
    }

    public void onScrollStopped() {
        if (this.floatingContextMenu != null && Build.VERSION.SDK_INT >= 19) {
            adjustFloatingContextMenuPosition();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.lastTouch = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        ViewParent parent = getParent();
        if (parent instanceof PullToRefreshLayout) {
            PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) parent;
            if (motionEvent.getActionMasked() == 0) {
                pullToRefreshLayout.setEnabled(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i10) {
        if (!this.customSettings.allowBackgroundAudioPlaying.booleanValue()) {
            super.onWindowVisibilityChanged(i10);
        } else if (i10 != 8) {
            super.onWindowVisibilityChanged(0);
        }
    }

    public void postWebMessage(WebMessage webMessage, Uri uri, ValueCallback<String> valueCallback) throws Exception {
        throw new UnsupportedOperationException();
    }

    public void prepare() {
        Integer num;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            this.webViewAssetLoaderExt = WebViewAssetLoaderExt.fromMap(this.customSettings.webViewAssetLoader, inAppWebViewFlutterPlugin, getContext());
        }
        JavaScriptBridgeInterface javaScriptBridgeInterface2 = new JavaScriptBridgeInterface(this);
        this.javaScriptBridgeInterface = javaScriptBridgeInterface2;
        addJavascriptInterface(javaScriptBridgeInterface2, JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME);
        InAppWebViewChromeClient inAppWebViewChromeClient2 = new InAppWebViewChromeClient(this.plugin, this, this.inAppBrowserDelegate);
        this.inAppWebViewChromeClient = inAppWebViewChromeClient2;
        setWebChromeClient(inAppWebViewChromeClient2);
        WebViewClient createWebViewClient = createWebViewClient(this.inAppBrowserDelegate);
        if (createWebViewClient instanceof InAppWebViewClientCompat) {
            InAppWebViewClientCompat inAppWebViewClientCompat2 = (InAppWebViewClientCompat) createWebViewClient;
            this.inAppWebViewClientCompat = inAppWebViewClientCompat2;
            setWebViewClient(inAppWebViewClientCompat2);
        } else if (createWebViewClient instanceof InAppWebViewClient) {
            InAppWebViewClient inAppWebViewClient2 = (InAppWebViewClient) createWebViewClient;
            this.inAppWebViewClient = inAppWebViewClient2;
            setWebViewClient(inAppWebViewClient2);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && s.a("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE")) {
            InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient2 = new InAppWebViewRenderProcessClient();
            this.inAppWebViewRenderProcessClient = inAppWebViewRenderProcessClient2;
            r.r(this, inAppWebViewRenderProcessClient2);
        }
        if (this.windowId == null || !s.a("DOCUMENT_START_SCRIPT")) {
            prepareAndAddUserScripts();
        }
        if (this.customSettings.useOnDownloadStart.booleanValue()) {
            setDownloadListener(new DownloadStartListener());
        }
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(this.customSettings.javaScriptEnabled.booleanValue());
        settings.setJavaScriptCanOpenWindowsAutomatically(this.customSettings.javaScriptCanOpenWindowsAutomatically.booleanValue());
        settings.setBuiltInZoomControls(this.customSettings.builtInZoomControls.booleanValue());
        settings.setDisplayZoomControls(this.customSettings.displayZoomControls.booleanValue());
        settings.setSupportMultipleWindows(this.customSettings.supportMultipleWindows.booleanValue());
        if (s.a("SAFE_BROWSING_ENABLE")) {
            p.q(settings, this.customSettings.safeBrowsingEnabled.booleanValue());
        } else if (i10 >= 26) {
            settings.setSafeBrowsingEnabled(this.customSettings.safeBrowsingEnabled.booleanValue());
        }
        settings.setMediaPlaybackRequiresUserGesture(this.customSettings.mediaPlaybackRequiresUserGesture.booleanValue());
        settings.setDatabaseEnabled(this.customSettings.databaseEnabled.booleanValue());
        settings.setDomStorageEnabled(this.customSettings.domStorageEnabled.booleanValue());
        String str = this.customSettings.userAgent;
        if (str != null && !str.isEmpty()) {
            settings.setUserAgentString(this.customSettings.userAgent);
        } else if (i10 >= 17) {
            settings.setUserAgentString(WebSettings.getDefaultUserAgent(getContext()));
        }
        String str2 = this.customSettings.applicationNameForUserAgent;
        if (str2 != null && !str2.isEmpty() && i10 >= 17) {
            String str3 = this.customSettings.userAgent;
            String defaultUserAgent = (str3 == null || str3.isEmpty()) ? WebSettings.getDefaultUserAgent(getContext()) : this.customSettings.userAgent;
            settings.setUserAgentString(defaultUserAgent + " " + this.customSettings.applicationNameForUserAgent);
        }
        if (this.customSettings.clearCache.booleanValue()) {
            clearAllCache();
        } else if (this.customSettings.clearSessionCache.booleanValue()) {
            CookieManager.getInstance().removeSessionCookie();
        }
        if (i10 >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, this.customSettings.thirdPartyCookiesEnabled.booleanValue());
        }
        settings.setLoadWithOverviewMode(this.customSettings.loadWithOverviewMode.booleanValue());
        settings.setUseWideViewPort(this.customSettings.useWideViewPort.booleanValue());
        settings.setSupportZoom(this.customSettings.supportZoom.booleanValue());
        settings.setTextZoom(this.customSettings.textZoom.intValue());
        setVerticalScrollBarEnabled(!this.customSettings.disableVerticalScroll.booleanValue() && this.customSettings.verticalScrollBarEnabled.booleanValue());
        setHorizontalScrollBarEnabled(!this.customSettings.disableHorizontalScroll.booleanValue() && this.customSettings.horizontalScrollBarEnabled.booleanValue());
        if (this.customSettings.transparentBackground.booleanValue()) {
            setBackgroundColor(0);
        }
        if (i10 >= 21 && (num = this.customSettings.mixedContentMode) != null) {
            settings.setMixedContentMode(num.intValue());
        }
        settings.setAllowContentAccess(this.customSettings.allowContentAccess.booleanValue());
        settings.setAllowFileAccess(this.customSettings.allowFileAccess.booleanValue());
        settings.setAllowFileAccessFromFileURLs(this.customSettings.allowFileAccessFromFileURLs.booleanValue());
        settings.setAllowUniversalAccessFromFileURLs(this.customSettings.allowUniversalAccessFromFileURLs.booleanValue());
        setCacheEnabled(this.customSettings.cacheEnabled.booleanValue());
        String str4 = this.customSettings.appCachePath;
        if (str4 != null && !str4.isEmpty() && this.customSettings.cacheEnabled.booleanValue()) {
            Util.invokeMethodIfExists(settings, "setAppCachePath", this.customSettings.appCachePath);
        }
        settings.setBlockNetworkImage(this.customSettings.blockNetworkImage.booleanValue());
        settings.setBlockNetworkLoads(this.customSettings.blockNetworkLoads.booleanValue());
        Integer num2 = this.customSettings.cacheMode;
        if (num2 != null) {
            settings.setCacheMode(num2.intValue());
        }
        settings.setCursiveFontFamily(this.customSettings.cursiveFontFamily);
        settings.setDefaultFixedFontSize(this.customSettings.defaultFixedFontSize.intValue());
        settings.setDefaultFontSize(this.customSettings.defaultFontSize.intValue());
        settings.setDefaultTextEncodingName(this.customSettings.defaultTextEncodingName);
        if (this.customSettings.disabledActionModeMenuItems != null) {
            if (s.a("DISABLED_ACTION_MODE_MENU_ITEMS")) {
                p.k(settings, this.customSettings.disabledActionModeMenuItems.intValue());
            } else if (i10 >= 24) {
                settings.setDisabledActionModeMenuItems(this.customSettings.disabledActionModeMenuItems.intValue());
            }
        }
        settings.setFantasyFontFamily(this.customSettings.fantasyFontFamily);
        settings.setFixedFontFamily(this.customSettings.fixedFontFamily);
        if (this.customSettings.forceDark != null) {
            if (s.a("FORCE_DARK")) {
                p.m(settings, this.customSettings.forceDark.intValue());
            } else if (i10 >= 29) {
                settings.setForceDark(this.customSettings.forceDark.intValue());
            }
        }
        if (this.customSettings.forceDarkStrategy != null && s.a("FORCE_DARK_STRATEGY")) {
            p.n(settings, this.customSettings.forceDarkStrategy.intValue());
        }
        settings.setGeolocationEnabled(this.customSettings.geolocationEnabled.booleanValue());
        WebSettings.LayoutAlgorithm layoutAlgorithm = this.customSettings.layoutAlgorithm;
        if (layoutAlgorithm != null) {
            if (i10 < 19 || !layoutAlgorithm.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING)) {
                settings.setLayoutAlgorithm(this.customSettings.layoutAlgorithm);
            } else {
                settings.setLayoutAlgorithm(this.customSettings.layoutAlgorithm);
            }
        }
        settings.setLoadsImagesAutomatically(this.customSettings.loadsImagesAutomatically.booleanValue());
        settings.setMinimumFontSize(this.customSettings.minimumFontSize.intValue());
        settings.setMinimumLogicalFontSize(this.customSettings.minimumLogicalFontSize.intValue());
        setInitialScale(this.customSettings.initialScale.intValue());
        settings.setNeedInitialFocus(this.customSettings.needInitialFocus.booleanValue());
        if (s.a("OFF_SCREEN_PRERASTER")) {
            p.o(settings, this.customSettings.offscreenPreRaster.booleanValue());
        } else if (i10 >= 23) {
            settings.setOffscreenPreRaster(this.customSettings.offscreenPreRaster.booleanValue());
        }
        settings.setSansSerifFontFamily(this.customSettings.sansSerifFontFamily);
        settings.setSerifFontFamily(this.customSettings.serifFontFamily);
        settings.setStandardFontFamily(this.customSettings.standardFontFamily);
        Integer num3 = this.customSettings.preferredContentMode;
        if (num3 != null && num3.intValue() == PreferredContentModeOptionType.DESKTOP.toValue()) {
            setDesktopMode(true);
        }
        settings.setSaveFormData(this.customSettings.saveFormData.booleanValue());
        if (this.customSettings.incognito.booleanValue()) {
            setIncognito(true);
        }
        if (this.customSettings.useHybridComposition.booleanValue()) {
            if (this.customSettings.hardwareAcceleration.booleanValue()) {
                setLayerType(2, (Paint) null);
            } else {
                setLayerType(0, (Paint) null);
            }
        }
        String str5 = this.customSettings.regexToCancelSubFramesLoading;
        if (str5 != null) {
            this.regexToCancelSubFramesLoadingCompiled = Pattern.compile(str5);
        }
        setScrollBarStyle(this.customSettings.scrollBarStyle.intValue());
        InAppWebViewSettings inAppWebViewSettings = this.customSettings;
        Integer num4 = inAppWebViewSettings.scrollBarDefaultDelayBeforeFade;
        if (num4 != null) {
            setScrollBarDefaultDelayBeforeFade(num4.intValue());
        } else {
            inAppWebViewSettings.scrollBarDefaultDelayBeforeFade = Integer.valueOf(getScrollBarDefaultDelayBeforeFade());
        }
        setScrollbarFadingEnabled(this.customSettings.scrollbarFadingEnabled.booleanValue());
        InAppWebViewSettings inAppWebViewSettings2 = this.customSettings;
        Integer num5 = inAppWebViewSettings2.scrollBarFadeDuration;
        if (num5 != null) {
            setScrollBarFadeDuration(num5.intValue());
        } else {
            inAppWebViewSettings2.scrollBarFadeDuration = Integer.valueOf(getScrollBarFadeDuration());
        }
        setVerticalScrollbarPosition(this.customSettings.verticalScrollbarPosition.intValue());
        if (i10 >= 29) {
            if (this.customSettings.verticalScrollbarThumbColor != null) {
                setVerticalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(this.customSettings.verticalScrollbarThumbColor)));
            }
            if (this.customSettings.verticalScrollbarTrackColor != null) {
                setVerticalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(this.customSettings.verticalScrollbarTrackColor)));
            }
            if (this.customSettings.horizontalScrollbarThumbColor != null) {
                setHorizontalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(this.customSettings.horizontalScrollbarThumbColor)));
            }
            if (this.customSettings.horizontalScrollbarTrackColor != null) {
                setHorizontalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(this.customSettings.horizontalScrollbarTrackColor)));
            }
        }
        setOverScrollMode(this.customSettings.overScrollMode.intValue());
        Boolean bool = this.customSettings.networkAvailable;
        if (bool != null) {
            setNetworkAvailable(bool.booleanValue());
        }
        Map<String, Object> map = this.customSettings.rendererPriorityPolicy;
        if (map != null && !map.isEmpty() && i10 >= 26) {
            setRendererPriorityPolicy(((Integer) this.customSettings.rendererPriorityPolicy.get("rendererRequestedPriority")).intValue(), ((Boolean) this.customSettings.rendererPriorityPolicy.get("waivedWhenNotVisible")).booleanValue());
        }
        if (s.a("SUPPRESS_ERROR_PAGE")) {
            p.r(settings, this.customSettings.disableDefaultErrorPage.booleanValue());
        }
        if (s.a("ALGORITHMIC_DARKENING") && i10 >= 29) {
            p.j(settings, this.customSettings.algorithmicDarkeningAllowed.booleanValue());
        }
        if (s.a("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY")) {
            p.l(settings, this.customSettings.enterpriseAuthenticationAppLinkPolicyEnabled.booleanValue());
        }
        if (this.customSettings.requestedWithHeaderOriginAllowList != null && s.a("REQUESTED_WITH_HEADER_ALLOW_LIST")) {
            p.p(settings, this.customSettings.requestedWithHeaderOriginAllowList);
        }
        this.contentBlockerHandler.getRuleList().clear();
        for (Map next : this.customSettings.contentBlockers) {
            this.contentBlockerHandler.getRuleList().add(new ContentBlocker(ContentBlockerTrigger.fromMap((Map) next.get("trigger")), ContentBlockerAction.fromMap((Map) next.get("action"))));
        }
        setFindListener(new WebView.FindListener() {
            public void onFindResultReceived(int i10, int i11, boolean z10) {
                FindInteractionChannelDelegate findInteractionChannelDelegate;
                FindInteractionController findInteractionController = InAppWebView.this.findInteractionController;
                if (!(findInteractionController == null || (findInteractionChannelDelegate = findInteractionController.channelDelegate) == null)) {
                    findInteractionChannelDelegate.onFindResultReceived(i10, i11, z10);
                }
                WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
                if (webViewChannelDelegate != null) {
                    webViewChannelDelegate.onFindResultReceived(i10, i11, z10);
                }
            }
        });
        this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                InAppWebView inAppWebView = InAppWebView.this;
                if (inAppWebView.floatingContextMenu != null) {
                    inAppWebView.hideContextMenu();
                }
                return super.onSingleTapUp(motionEvent);
            }
        });
        this.checkScrollStoppedTask = new Runnable() {
            public void run() {
                int scrollY = InAppWebView.this.getScrollY();
                InAppWebView inAppWebView = InAppWebView.this;
                if (inAppWebView.initialPositionScrollStoppedTask - scrollY == 0) {
                    inAppWebView.onScrollStopped();
                    return;
                }
                inAppWebView.initialPositionScrollStoppedTask = inAppWebView.getScrollY();
                InAppWebView inAppWebView2 = InAppWebView.this;
                inAppWebView2.mainLooperHandler.postDelayed(inAppWebView2.checkScrollStoppedTask, (long) inAppWebView2.newCheckScrollStoppedTask);
            }
        };
        if (Build.VERSION.SDK_INT >= 19 && !this.customSettings.useHybridComposition.booleanValue()) {
            this.checkContextMenuShouldBeClosedTask = new Runnable() {
                public void run() {
                    InAppWebView inAppWebView = InAppWebView.this;
                    if (inAppWebView.floatingContextMenu != null) {
                        inAppWebView.evaluateJavascript(PluginScriptsUtil.CHECK_CONTEXT_MENU_SHOULD_BE_HIDDEN_JS_SOURCE, new ValueCallback<String>() {
                            public void onReceiveValue(String str) {
                                if (str == null || str.equals("true")) {
                                    InAppWebView inAppWebView = InAppWebView.this;
                                    if (inAppWebView.floatingContextMenu != null) {
                                        inAppWebView.hideContextMenu();
                                        return;
                                    }
                                    return;
                                }
                                InAppWebView inAppWebView2 = InAppWebView.this;
                                inAppWebView2.mainLooperHandler.postDelayed(inAppWebView2.checkContextMenuShouldBeClosedTask, (long) inAppWebView2.newCheckContextMenuShouldBeClosedTaskTask);
                            }
                        });
                    }
                }
            };
        }
        setOnTouchListener(new View.OnTouchListener() {
            float m_downX;
            float m_downY;

            public boolean onTouch(View view, MotionEvent motionEvent) {
                InAppWebView.this.gestureDetector.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1) {
                    InAppWebView.this.checkScrollStoppedTask.run();
                }
                if (!InAppWebView.this.customSettings.disableHorizontalScroll.booleanValue() || !InAppWebView.this.customSettings.disableVerticalScroll.booleanValue()) {
                    if (InAppWebView.this.customSettings.disableHorizontalScroll.booleanValue() || InAppWebView.this.customSettings.disableVerticalScroll.booleanValue()) {
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            this.m_downX = motionEvent.getX();
                            this.m_downY = motionEvent.getY();
                        } else if (action == 1 || action == 2 || action == 3) {
                            if (InAppWebView.this.customSettings.disableHorizontalScroll.booleanValue()) {
                                motionEvent.setLocation(this.m_downX, motionEvent.getY());
                            } else {
                                motionEvent.setLocation(motionEvent.getX(), this.m_downY);
                            }
                        }
                    }
                    return false;
                } else if (motionEvent.getAction() == 2) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View view) {
                HitTestResult fromWebViewHitTestResult = HitTestResult.fromWebViewHitTestResult(InAppWebView.this.getHitTestResult());
                WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
                if (webViewChannelDelegate == null) {
                    return false;
                }
                webViewChannelDelegate.onLongPressHitTestResult(fromWebViewHitTestResult);
                return false;
            }
        });
    }

    public void prepareAndAddUserScripts() {
        this.userContentController.addPluginScript(PromisePolyfillJS.PROMISE_POLYFILL_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(ConsoleLogJS.CONSOLE_LOG_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(PrintJS.PRINT_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(OnWindowBlurEventJS.ON_WINDOW_BLUR_EVENT_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(OnWindowFocusEventJS.ON_WINDOW_FOCUS_EVENT_JS_PLUGIN_SCRIPT);
        this.interceptOnlyAsyncAjaxRequestsPluginScript = InterceptAjaxRequestJS.createInterceptOnlyAsyncAjaxRequestsPluginScript(this.customSettings.interceptOnlyAsyncAjaxRequests.booleanValue());
        if (this.customSettings.useShouldInterceptAjaxRequest.booleanValue()) {
            this.userContentController.addPluginScript(this.interceptOnlyAsyncAjaxRequestsPluginScript);
            this.userContentController.addPluginScript(InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT);
        }
        if (this.customSettings.useShouldInterceptFetchRequest.booleanValue()) {
            this.userContentController.addPluginScript(InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT);
        }
        if (this.customSettings.useOnLoadResource.booleanValue()) {
            this.userContentController.addPluginScript(OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT);
        }
        if (!this.customSettings.useHybridComposition.booleanValue()) {
            this.userContentController.addPluginScript(PluginScriptsUtil.CHECK_GLOBAL_KEY_DOWN_EVENT_TO_HIDE_CONTEXT_MENU_JS_PLUGIN_SCRIPT);
        }
        this.userContentController.addUserOnlyScripts(this.initialUserOnlyScripts);
    }

    public String printCurrentPage(PrintJobSettings printJobSettings) {
        Activity activity;
        PrintDocumentAdapter printDocumentAdapter;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null || (activity = inAppWebViewFlutterPlugin.activity) == null) {
            return null;
        }
        PrintManager printManager = (PrintManager) activity.getSystemService("print");
        if (printManager != null) {
            PrintAttributes.Builder builder = new PrintAttributes.Builder();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getTitle() != null ? getTitle() : getUrl());
            sb2.append(" Document");
            String sb3 = sb2.toString();
            if (printJobSettings != null) {
                String str = printJobSettings.jobName;
                if (str != null && !str.isEmpty()) {
                    sb3 = printJobSettings.jobName;
                }
                Integer num = printJobSettings.orientation;
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue == 0) {
                        builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
                    } else if (intValue == 1) {
                        builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
                    }
                }
                MediaSizeExt mediaSizeExt = printJobSettings.mediaSize;
                if (mediaSizeExt != null) {
                    builder.setMediaSize(mediaSizeExt.toMediaSize());
                }
                Integer num2 = printJobSettings.colorMode;
                if (num2 != null) {
                    builder.setColorMode(num2.intValue());
                }
                Integer num3 = printJobSettings.duplexMode;
                if (num3 != null && Build.VERSION.SDK_INT >= 23) {
                    builder.setDuplexMode(num3.intValue());
                }
                ResolutionExt resolutionExt = printJobSettings.resolution;
                if (resolutionExt != null) {
                    builder.setResolution(resolutionExt.toResolution());
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                printDocumentAdapter = createPrintDocumentAdapter(sb3);
            } else {
                printDocumentAdapter = createPrintDocumentAdapter();
            }
            PrintJob print = printManager.print(sb3, printDocumentAdapter, builder.build());
            if (printJobSettings == null || !printJobSettings.handledByClient.booleanValue() || this.plugin.printJobManager == null) {
                return null;
            }
            String uuid = UUID.randomUUID().toString();
            PrintJobController printJobController = new PrintJobController(uuid, print, printJobSettings, this.plugin);
            this.plugin.printJobManager.jobs.put(printJobController.f28494id, printJobController);
            return uuid;
        }
        Log.e(LOG_TAG, "No PrintManager available");
        return null;
    }

    public ActionMode rebuildActionMode(ActionMode actionMode, ActionMode.Callback callback) {
        boolean z10;
        View view;
        ActionMode actionMode2 = actionMode;
        if (!this.customSettings.useHybridComposition.booleanValue() && (view = this.containerView) != null) {
            onWindowFocusChanged(view.isFocused());
        }
        final int i10 = 0;
        if (this.floatingContextMenu != null) {
            hideContextMenu();
            z10 = true;
        } else {
            z10 = false;
        }
        if (actionMode2 == null) {
            return null;
        }
        Menu menu = actionMode.getMenu();
        if (Build.VERSION.SDK_INT >= 23) {
            actionMode2.hide(3000);
        }
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        for (int i11 = 0; i11 < menu.size(); i11++) {
            arrayList.add(menu.getItem(i11));
        }
        menu.clear();
        actionMode.finish();
        if (this.customSettings.disableContextMenu.booleanValue()) {
            return actionMode2;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.floating_action_mode, this, false);
        this.floatingContextMenu = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) ((HorizontalScrollView) linearLayout.getChildAt(0)).getChildAt(0);
        List arrayList2 = new ArrayList();
        ContextMenuSettings contextMenuSettings = new ContextMenuSettings();
        Map<String, Object> map = this.contextMenu;
        if (map != null) {
            arrayList2 = (List) map.get("menuItems");
            Map map2 = (Map) this.contextMenu.get("settings");
            if (map2 != null) {
                contextMenuSettings.parse(map2);
            }
        }
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        List<Map> list = arrayList2;
        Boolean bool = contextMenuSettings.hideDefaultSystemContextMenuItems;
        if (bool == null || !bool.booleanValue()) {
            for (final MenuItem menuItem : arrayList) {
                final int itemId = menuItem.getItemId();
                final String charSequence = menuItem.getTitle().toString();
                TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.floating_action_mode_item, this, false);
                textView.setText(charSequence);
                final ActionMode.Callback callback2 = callback;
                final ActionMode actionMode3 = actionMode;
                textView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        InAppWebView.this.hideContextMenu();
                        callback2.onActionItemClicked(actionMode3, menuItem);
                        WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
                        if (webViewChannelDelegate != null) {
                            webViewChannelDelegate.onContextMenuActionItemClicked(itemId, charSequence);
                        }
                    }
                });
                if (this.floatingContextMenu != null) {
                    linearLayout2.addView(textView);
                }
            }
        }
        for (Map map3 : list) {
            final int intValue = ((Integer) map3.get("id")).intValue();
            final String str = (String) map3.get("title");
            TextView textView2 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.floating_action_mode_item, this, false);
            textView2.setText(str);
            textView2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    InAppWebView.this.hideContextMenu();
                    WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
                    if (webViewChannelDelegate != null) {
                        webViewChannelDelegate.onContextMenuActionItemClicked(intValue, str);
                    }
                }
            });
            if (this.floatingContextMenu != null) {
                linearLayout2.addView(textView2);
            }
        }
        Point point = this.lastTouch;
        final int i12 = point != null ? point.x : 0;
        if (point != null) {
            i10 = point.y;
        }
        this.contextMenuPoint = new Point(i12, i10);
        LinearLayout linearLayout3 = this.floatingContextMenu;
        if (linearLayout3 != null) {
            linearLayout3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    LinearLayout linearLayout = InAppWebView.this.floatingContextMenu;
                    if (linearLayout != null) {
                        linearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        if (InAppWebView.this.getSettings().getJavaScriptEnabled()) {
                            InAppWebView.this.onScrollStopped();
                        } else {
                            InAppWebView.this.onFloatingActionGlobalLayout(i12, i10);
                        }
                    }
                }
            });
            addView(this.floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, i12, i10));
            if (z10) {
                sendOnCreateContextMenuEvent();
            }
            Runnable runnable = this.checkContextMenuShouldBeClosedTask;
            if (runnable != null) {
                runnable.run();
            }
        }
        return actionMode2;
    }

    public Map<String, Object> requestFocusNodeHref() {
        Message obtainMessage = mHandler.obtainMessage();
        requestFocusNodeHref(obtainMessage);
        Bundle peekData = obtainMessage.peekData();
        HashMap hashMap = new HashMap();
        hashMap.put("src", peekData.getString("src"));
        hashMap.put("url", peekData.getString("url"));
        hashMap.put("title", peekData.getString("title"));
        return hashMap;
    }

    public Map<String, Object> requestImageRef() {
        Message obtainMessage = mHandler.obtainMessage();
        requestImageRef(obtainMessage);
        Bundle peekData = obtainMessage.peekData();
        HashMap hashMap = new HashMap();
        hashMap.put("url", peekData.getString("url"));
        return hashMap;
    }

    public void scrollBy(Integer num, Integer num2, Boolean bool) {
        if (bool.booleanValue()) {
            ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("scrollX", new int[]{getScrollX() + num.intValue()}), PropertyValuesHolder.ofInt("scrollY", new int[]{getScrollY() + num2.intValue()})}).setDuration(300).start();
            return;
        }
        scrollBy(num.intValue(), num2.intValue());
    }

    public void scrollTo(Integer num, Integer num2, Boolean bool) {
        if (bool.booleanValue()) {
            ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("scrollX", new int[]{num.intValue()}), PropertyValuesHolder.ofInt("scrollY", new int[]{num2.intValue()})}).setDuration(300).start();
            return;
        }
        scrollTo(num.intValue(), num2.intValue());
    }

    public void setCacheEnabled(boolean z10) {
        WebSettings settings = getSettings();
        if (z10) {
            Context context = getContext();
            if (context != null) {
                Util.invokeMethodIfExists(settings, "setAppCachePath", context.getCacheDir().getAbsolutePath());
                settings.setCacheMode(-1);
                Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.TRUE);
                return;
            }
            return;
        }
        settings.setCacheMode(2);
        Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.FALSE);
    }

    public void setChannelDelegate(WebViewChannelDelegate webViewChannelDelegate) {
        this.channelDelegate = webViewChannelDelegate;
    }

    public void setContextMenu(Map<String, Object> map) {
        this.contextMenu = map;
    }

    public void setDesktopMode(boolean z10) {
        String str;
        WebSettings settings = getSettings();
        if (z10) {
            str = settings.getUserAgentString().replace("Mobile", "eliboM").replace("Android", "diordnA");
        } else {
            str = settings.getUserAgentString().replace("eliboM", "Mobile").replace("diordnA", "Android");
        }
        settings.setUserAgentString(str);
        settings.setUseWideViewPort(z10);
        settings.setLoadWithOverviewMode(z10);
        settings.setSupportZoom(z10);
        settings.setBuiltInZoomControls(z10);
    }

    public void setInAppBrowserDelegate(InAppBrowserDelegate inAppBrowserDelegate2) {
        this.inAppBrowserDelegate = inAppBrowserDelegate2;
    }

    public void setInFullscreen(boolean z10) {
        this.inFullscreen = z10;
    }

    public void setIncognito(boolean z10) {
        WebSettings settings = getSettings();
        if (z10) {
            if (Build.VERSION.SDK_INT >= 21) {
                CookieManager.getInstance().removeAllCookies((ValueCallback) null);
            } else {
                CookieManager.getInstance().removeAllCookie();
            }
            settings.setCacheMode(2);
            Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.FALSE);
            clearHistory();
            clearCache(true);
            clearFormData();
            settings.setSavePassword(false);
            settings.setSaveFormData(false);
            return;
        }
        settings.setCacheMode(-1);
        Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.TRUE);
        settings.setSavePassword(true);
        settings.setSaveFormData(true);
    }

    public void setPlugin(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public void setSettings(InAppWebViewSettings inAppWebViewSettings, HashMap<String, Object> hashMap) {
        Map<String, Object> map;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Integer num;
        Integer num2;
        String str;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        WebSettings.LayoutAlgorithm layoutAlgorithm;
        Boolean bool10;
        Integer num3;
        Boolean bool11;
        Boolean bool12;
        String str2;
        Boolean bool13;
        Boolean bool14;
        Boolean bool15;
        Boolean bool16;
        Boolean bool17;
        Boolean bool18;
        Boolean bool19;
        Integer num4;
        Boolean bool20;
        Boolean bool21;
        Boolean bool22;
        Boolean bool23;
        Boolean bool24;
        Boolean bool25;
        Boolean bool26;
        Boolean bool27;
        Boolean bool28;
        Boolean bool29;
        Boolean bool30;
        Boolean bool31;
        Boolean bool32;
        Boolean bool33;
        Boolean bool34;
        Boolean bool35;
        WebSettings settings = getSettings();
        if (!(hashMap.get("javaScriptEnabled") == null || this.customSettings.javaScriptEnabled == (bool35 = inAppWebViewSettings.javaScriptEnabled))) {
            settings.setJavaScriptEnabled(bool35.booleanValue());
        }
        if (!(hashMap.get("useShouldInterceptAjaxRequest") == null || this.customSettings.useShouldInterceptAjaxRequest == (bool34 = inAppWebViewSettings.useShouldInterceptAjaxRequest))) {
            enablePluginScriptAtRuntime(InterceptAjaxRequestJS.FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_AJAX_REQUEST_JS_SOURCE, bool34.booleanValue(), InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT);
        }
        if (!(hashMap.get("interceptOnlyAsyncAjaxRequests") == null || this.customSettings.interceptOnlyAsyncAjaxRequests == (bool33 = inAppWebViewSettings.interceptOnlyAsyncAjaxRequests))) {
            enablePluginScriptAtRuntime(InterceptAjaxRequestJS.FLAG_VARIABLE_FOR_INTERCEPT_ONLY_ASYNC_AJAX_REQUESTS_JS_SOURCE, bool33.booleanValue(), this.interceptOnlyAsyncAjaxRequestsPluginScript);
        }
        if (!(hashMap.get("useShouldInterceptFetchRequest") == null || this.customSettings.useShouldInterceptFetchRequest == (bool32 = inAppWebViewSettings.useShouldInterceptFetchRequest))) {
            enablePluginScriptAtRuntime(InterceptFetchRequestJS.FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_FETCH_REQUEST_JS_SOURCE, bool32.booleanValue(), InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT);
        }
        if (!(hashMap.get("useOnLoadResource") == null || this.customSettings.useOnLoadResource == (bool31 = inAppWebViewSettings.useOnLoadResource))) {
            enablePluginScriptAtRuntime(OnLoadResourceJS.FLAG_VARIABLE_FOR_ON_LOAD_RESOURCE_JS_SOURCE, bool31.booleanValue(), OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT);
        }
        if (!(hashMap.get("javaScriptCanOpenWindowsAutomatically") == null || this.customSettings.javaScriptCanOpenWindowsAutomatically == (bool30 = inAppWebViewSettings.javaScriptCanOpenWindowsAutomatically))) {
            settings.setJavaScriptCanOpenWindowsAutomatically(bool30.booleanValue());
        }
        if (!(hashMap.get("builtInZoomControls") == null || this.customSettings.builtInZoomControls == (bool29 = inAppWebViewSettings.builtInZoomControls))) {
            settings.setBuiltInZoomControls(bool29.booleanValue());
        }
        if (!(hashMap.get("displayZoomControls") == null || this.customSettings.displayZoomControls == (bool28 = inAppWebViewSettings.displayZoomControls))) {
            settings.setDisplayZoomControls(bool28.booleanValue());
        }
        if (!(hashMap.get("safeBrowsingEnabled") == null || this.customSettings.safeBrowsingEnabled == inAppWebViewSettings.safeBrowsingEnabled)) {
            if (s.a("SAFE_BROWSING_ENABLE")) {
                p.q(settings, inAppWebViewSettings.safeBrowsingEnabled.booleanValue());
            } else if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(inAppWebViewSettings.safeBrowsingEnabled.booleanValue());
            }
        }
        if (!(hashMap.get("mediaPlaybackRequiresUserGesture") == null || this.customSettings.mediaPlaybackRequiresUserGesture == (bool27 = inAppWebViewSettings.mediaPlaybackRequiresUserGesture))) {
            settings.setMediaPlaybackRequiresUserGesture(bool27.booleanValue());
        }
        if (!(hashMap.get("databaseEnabled") == null || this.customSettings.databaseEnabled == (bool26 = inAppWebViewSettings.databaseEnabled))) {
            settings.setDatabaseEnabled(bool26.booleanValue());
        }
        if (!(hashMap.get("domStorageEnabled") == null || this.customSettings.domStorageEnabled == (bool25 = inAppWebViewSettings.domStorageEnabled))) {
            settings.setDomStorageEnabled(bool25.booleanValue());
        }
        if (hashMap.get("userAgent") != null && !this.customSettings.userAgent.equals(inAppWebViewSettings.userAgent) && !inAppWebViewSettings.userAgent.isEmpty()) {
            settings.setUserAgentString(inAppWebViewSettings.userAgent);
        }
        if (hashMap.get("applicationNameForUserAgent") != null && !this.customSettings.applicationNameForUserAgent.equals(inAppWebViewSettings.applicationNameForUserAgent) && !inAppWebViewSettings.applicationNameForUserAgent.isEmpty() && Build.VERSION.SDK_INT >= 17) {
            String str3 = inAppWebViewSettings.userAgent;
            String defaultUserAgent = (str3 == null || str3.isEmpty()) ? WebSettings.getDefaultUserAgent(getContext()) : inAppWebViewSettings.userAgent;
            settings.setUserAgentString(defaultUserAgent + " " + this.customSettings.applicationNameForUserAgent);
        }
        if (hashMap.get("clearCache") != null && inAppWebViewSettings.clearCache.booleanValue()) {
            clearAllCache();
        } else if (hashMap.get("clearSessionCache") != null && inAppWebViewSettings.clearSessionCache.booleanValue()) {
            CookieManager.getInstance().removeSessionCookie();
        }
        if (!(hashMap.get("thirdPartyCookiesEnabled") == null || this.customSettings.thirdPartyCookiesEnabled == inAppWebViewSettings.thirdPartyCookiesEnabled || Build.VERSION.SDK_INT < 21)) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, inAppWebViewSettings.thirdPartyCookiesEnabled.booleanValue());
        }
        if (!(hashMap.get("useWideViewPort") == null || this.customSettings.useWideViewPort == (bool24 = inAppWebViewSettings.useWideViewPort))) {
            settings.setUseWideViewPort(bool24.booleanValue());
        }
        if (!(hashMap.get("supportZoom") == null || this.customSettings.supportZoom == (bool23 = inAppWebViewSettings.supportZoom))) {
            settings.setSupportZoom(bool23.booleanValue());
        }
        if (hashMap.get("textZoom") != null && !this.customSettings.textZoom.equals(inAppWebViewSettings.textZoom)) {
            settings.setTextZoom(inAppWebViewSettings.textZoom.intValue());
        }
        if (!(hashMap.get("verticalScrollBarEnabled") == null || this.customSettings.verticalScrollBarEnabled == (bool22 = inAppWebViewSettings.verticalScrollBarEnabled))) {
            setVerticalScrollBarEnabled(bool22.booleanValue());
        }
        if (!(hashMap.get("horizontalScrollBarEnabled") == null || this.customSettings.horizontalScrollBarEnabled == (bool21 = inAppWebViewSettings.horizontalScrollBarEnabled))) {
            setHorizontalScrollBarEnabled(bool21.booleanValue());
        }
        boolean z10 = false;
        if (!(hashMap.get("transparentBackground") == null || this.customSettings.transparentBackground == (bool20 = inAppWebViewSettings.transparentBackground))) {
            if (bool20.booleanValue()) {
                setBackgroundColor(0);
            } else {
                setBackgroundColor(Color.parseColor("#FFFFFF"));
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21 && hashMap.get("mixedContentMode") != null && ((num4 = this.customSettings.mixedContentMode) == null || !num4.equals(inAppWebViewSettings.mixedContentMode))) {
            settings.setMixedContentMode(inAppWebViewSettings.mixedContentMode.intValue());
        }
        if (!(hashMap.get("supportMultipleWindows") == null || this.customSettings.supportMultipleWindows == (bool19 = inAppWebViewSettings.supportMultipleWindows))) {
            settings.setSupportMultipleWindows(bool19.booleanValue());
        }
        if (!(hashMap.get("useOnDownloadStart") == null || this.customSettings.useOnDownloadStart == (bool18 = inAppWebViewSettings.useOnDownloadStart))) {
            if (bool18.booleanValue()) {
                setDownloadListener(new DownloadStartListener());
            } else {
                setDownloadListener((DownloadListener) null);
            }
        }
        if (!(hashMap.get("allowContentAccess") == null || this.customSettings.allowContentAccess == (bool17 = inAppWebViewSettings.allowContentAccess))) {
            settings.setAllowContentAccess(bool17.booleanValue());
        }
        if (!(hashMap.get("allowFileAccess") == null || this.customSettings.allowFileAccess == (bool16 = inAppWebViewSettings.allowFileAccess))) {
            settings.setAllowFileAccess(bool16.booleanValue());
        }
        if (!(hashMap.get("allowFileAccessFromFileURLs") == null || this.customSettings.allowFileAccessFromFileURLs == (bool15 = inAppWebViewSettings.allowFileAccessFromFileURLs))) {
            settings.setAllowFileAccessFromFileURLs(bool15.booleanValue());
        }
        if (!(hashMap.get("allowUniversalAccessFromFileURLs") == null || this.customSettings.allowUniversalAccessFromFileURLs == (bool14 = inAppWebViewSettings.allowUniversalAccessFromFileURLs))) {
            settings.setAllowUniversalAccessFromFileURLs(bool14.booleanValue());
        }
        if (!(hashMap.get("cacheEnabled") == null || this.customSettings.cacheEnabled == (bool13 = inAppWebViewSettings.cacheEnabled))) {
            setCacheEnabled(bool13.booleanValue());
        }
        if (hashMap.get("appCachePath") != null && ((str2 = this.customSettings.appCachePath) == null || !str2.equals(inAppWebViewSettings.appCachePath))) {
            Util.invokeMethodIfExists(settings, "setAppCachePath", inAppWebViewSettings.appCachePath);
        }
        if (!(hashMap.get("blockNetworkImage") == null || this.customSettings.blockNetworkImage == (bool12 = inAppWebViewSettings.blockNetworkImage))) {
            settings.setBlockNetworkImage(bool12.booleanValue());
        }
        if (!(hashMap.get("blockNetworkLoads") == null || this.customSettings.blockNetworkLoads == (bool11 = inAppWebViewSettings.blockNetworkLoads))) {
            settings.setBlockNetworkLoads(bool11.booleanValue());
        }
        if (hashMap.get("cacheMode") != null && !this.customSettings.cacheMode.equals(inAppWebViewSettings.cacheMode)) {
            settings.setCacheMode(inAppWebViewSettings.cacheMode.intValue());
        }
        if (hashMap.get("cursiveFontFamily") != null && !this.customSettings.cursiveFontFamily.equals(inAppWebViewSettings.cursiveFontFamily)) {
            settings.setCursiveFontFamily(inAppWebViewSettings.cursiveFontFamily);
        }
        if (hashMap.get("defaultFixedFontSize") != null && !this.customSettings.defaultFixedFontSize.equals(inAppWebViewSettings.defaultFixedFontSize)) {
            settings.setDefaultFixedFontSize(inAppWebViewSettings.defaultFixedFontSize.intValue());
        }
        if (hashMap.get("defaultFontSize") != null && !this.customSettings.defaultFontSize.equals(inAppWebViewSettings.defaultFontSize)) {
            settings.setDefaultFontSize(inAppWebViewSettings.defaultFontSize.intValue());
        }
        if (hashMap.get("defaultTextEncodingName") != null && !this.customSettings.defaultTextEncodingName.equals(inAppWebViewSettings.defaultTextEncodingName)) {
            settings.setDefaultTextEncodingName(inAppWebViewSettings.defaultTextEncodingName);
        }
        if (hashMap.get("disabledActionModeMenuItems") != null && ((num3 = this.customSettings.disabledActionModeMenuItems) == null || !num3.equals(inAppWebViewSettings.disabledActionModeMenuItems))) {
            if (s.a("DISABLED_ACTION_MODE_MENU_ITEMS")) {
                p.k(settings, inAppWebViewSettings.disabledActionModeMenuItems.intValue());
            } else if (i10 >= 24) {
                settings.setDisabledActionModeMenuItems(inAppWebViewSettings.disabledActionModeMenuItems.intValue());
            }
        }
        if (hashMap.get("fantasyFontFamily") != null && !this.customSettings.fantasyFontFamily.equals(inAppWebViewSettings.fantasyFontFamily)) {
            settings.setFantasyFontFamily(inAppWebViewSettings.fantasyFontFamily);
        }
        if (hashMap.get("fixedFontFamily") != null && !this.customSettings.fixedFontFamily.equals(inAppWebViewSettings.fixedFontFamily)) {
            settings.setFixedFontFamily(inAppWebViewSettings.fixedFontFamily);
        }
        if (hashMap.get("forceDark") != null && !this.customSettings.forceDark.equals(inAppWebViewSettings.forceDark)) {
            if (s.a("FORCE_DARK")) {
                p.m(settings, inAppWebViewSettings.forceDark.intValue());
            } else if (i10 >= 29) {
                settings.setForceDark(inAppWebViewSettings.forceDark.intValue());
            }
        }
        if (hashMap.get("forceDarkStrategy") != null && !this.customSettings.forceDarkStrategy.equals(inAppWebViewSettings.forceDarkStrategy) && s.a("FORCE_DARK_STRATEGY")) {
            p.n(settings, inAppWebViewSettings.forceDarkStrategy.intValue());
        }
        if (!(hashMap.get("geolocationEnabled") == null || this.customSettings.geolocationEnabled == (bool10 = inAppWebViewSettings.geolocationEnabled))) {
            settings.setGeolocationEnabled(bool10.booleanValue());
        }
        if (!(hashMap.get("layoutAlgorithm") == null || this.customSettings.layoutAlgorithm == (layoutAlgorithm = inAppWebViewSettings.layoutAlgorithm))) {
            if (i10 < 19 || !layoutAlgorithm.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING)) {
                settings.setLayoutAlgorithm(inAppWebViewSettings.layoutAlgorithm);
            } else {
                settings.setLayoutAlgorithm(inAppWebViewSettings.layoutAlgorithm);
            }
        }
        if (!(hashMap.get("loadWithOverviewMode") == null || this.customSettings.loadWithOverviewMode == (bool9 = inAppWebViewSettings.loadWithOverviewMode))) {
            settings.setLoadWithOverviewMode(bool9.booleanValue());
        }
        if (!(hashMap.get("loadsImagesAutomatically") == null || this.customSettings.loadsImagesAutomatically == (bool8 = inAppWebViewSettings.loadsImagesAutomatically))) {
            settings.setLoadsImagesAutomatically(bool8.booleanValue());
        }
        if (hashMap.get("minimumFontSize") != null && !this.customSettings.minimumFontSize.equals(inAppWebViewSettings.minimumFontSize)) {
            settings.setMinimumFontSize(inAppWebViewSettings.minimumFontSize.intValue());
        }
        if (hashMap.get("minimumLogicalFontSize") != null && !this.customSettings.minimumLogicalFontSize.equals(inAppWebViewSettings.minimumLogicalFontSize)) {
            settings.setMinimumLogicalFontSize(inAppWebViewSettings.minimumLogicalFontSize.intValue());
        }
        if (hashMap.get("initialScale") != null && !this.customSettings.initialScale.equals(inAppWebViewSettings.initialScale)) {
            setInitialScale(inAppWebViewSettings.initialScale.intValue());
        }
        if (!(hashMap.get("needInitialFocus") == null || this.customSettings.needInitialFocus == (bool7 = inAppWebViewSettings.needInitialFocus))) {
            settings.setNeedInitialFocus(bool7.booleanValue());
        }
        if (!(hashMap.get("offscreenPreRaster") == null || this.customSettings.offscreenPreRaster == inAppWebViewSettings.offscreenPreRaster)) {
            if (s.a("OFF_SCREEN_PRERASTER")) {
                p.o(settings, inAppWebViewSettings.offscreenPreRaster.booleanValue());
            } else if (i10 >= 23) {
                settings.setOffscreenPreRaster(inAppWebViewSettings.offscreenPreRaster.booleanValue());
            }
        }
        if (hashMap.get("sansSerifFontFamily") != null && !this.customSettings.sansSerifFontFamily.equals(inAppWebViewSettings.sansSerifFontFamily)) {
            settings.setSansSerifFontFamily(inAppWebViewSettings.sansSerifFontFamily);
        }
        if (hashMap.get("serifFontFamily") != null && !this.customSettings.serifFontFamily.equals(inAppWebViewSettings.serifFontFamily)) {
            settings.setSerifFontFamily(inAppWebViewSettings.serifFontFamily);
        }
        if (hashMap.get("standardFontFamily") != null && !this.customSettings.standardFontFamily.equals(inAppWebViewSettings.standardFontFamily)) {
            settings.setStandardFontFamily(inAppWebViewSettings.standardFontFamily);
        }
        if (hashMap.get("preferredContentMode") != null && !this.customSettings.preferredContentMode.equals(inAppWebViewSettings.preferredContentMode)) {
            int i11 = AnonymousClass21.$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType[PreferredContentModeOptionType.fromValue(inAppWebViewSettings.preferredContentMode.intValue()).ordinal()];
            if (i11 == 1) {
                setDesktopMode(true);
            } else if (i11 == 2 || i11 == 3) {
                setDesktopMode(false);
            }
        }
        if (!(hashMap.get("saveFormData") == null || this.customSettings.saveFormData == (bool6 = inAppWebViewSettings.saveFormData))) {
            settings.setSaveFormData(bool6.booleanValue());
        }
        if (!(hashMap.get("incognito") == null || this.customSettings.incognito == (bool5 = inAppWebViewSettings.incognito))) {
            setIncognito(bool5.booleanValue());
        }
        if (!(!this.customSettings.useHybridComposition.booleanValue() || hashMap.get("hardwareAcceleration") == null || this.customSettings.hardwareAcceleration == (bool4 = inAppWebViewSettings.hardwareAcceleration))) {
            if (bool4.booleanValue()) {
                setLayerType(2, (Paint) null);
            } else {
                setLayerType(0, (Paint) null);
            }
        }
        if (hashMap.get("regexToCancelSubFramesLoading") != null && ((str = this.customSettings.regexToCancelSubFramesLoading) == null || !str.equals(inAppWebViewSettings.regexToCancelSubFramesLoading))) {
            if (inAppWebViewSettings.regexToCancelSubFramesLoading == null) {
                this.regexToCancelSubFramesLoadingCompiled = null;
            } else {
                this.regexToCancelSubFramesLoadingCompiled = Pattern.compile(this.customSettings.regexToCancelSubFramesLoading);
            }
        }
        if (inAppWebViewSettings.contentBlockers != null) {
            this.contentBlockerHandler.getRuleList().clear();
            for (Map next : inAppWebViewSettings.contentBlockers) {
                this.contentBlockerHandler.getRuleList().add(new ContentBlocker(ContentBlockerTrigger.fromMap((Map) next.get("trigger")), ContentBlockerAction.fromMap((Map) next.get("action"))));
            }
        }
        if (hashMap.get("scrollBarStyle") != null && !this.customSettings.scrollBarStyle.equals(inAppWebViewSettings.scrollBarStyle)) {
            setScrollBarStyle(inAppWebViewSettings.scrollBarStyle.intValue());
        }
        if (hashMap.get("scrollBarDefaultDelayBeforeFade") != null && ((num2 = this.customSettings.scrollBarDefaultDelayBeforeFade) == null || !num2.equals(inAppWebViewSettings.scrollBarDefaultDelayBeforeFade))) {
            setScrollBarDefaultDelayBeforeFade(inAppWebViewSettings.scrollBarDefaultDelayBeforeFade.intValue());
        }
        if (hashMap.get("scrollbarFadingEnabled") != null && !this.customSettings.scrollbarFadingEnabled.equals(inAppWebViewSettings.scrollbarFadingEnabled)) {
            setScrollbarFadingEnabled(inAppWebViewSettings.scrollbarFadingEnabled.booleanValue());
        }
        if (hashMap.get("scrollBarFadeDuration") != null && ((num = this.customSettings.scrollBarFadeDuration) == null || !num.equals(inAppWebViewSettings.scrollBarFadeDuration))) {
            setScrollBarFadeDuration(inAppWebViewSettings.scrollBarFadeDuration.intValue());
        }
        if (hashMap.get("verticalScrollbarPosition") != null && !this.customSettings.verticalScrollbarPosition.equals(inAppWebViewSettings.verticalScrollbarPosition)) {
            setVerticalScrollbarPosition(inAppWebViewSettings.verticalScrollbarPosition.intValue());
        }
        if (!(hashMap.get("disableVerticalScroll") == null || this.customSettings.disableVerticalScroll == (bool3 = inAppWebViewSettings.disableVerticalScroll))) {
            setVerticalScrollBarEnabled(!bool3.booleanValue() && inAppWebViewSettings.verticalScrollBarEnabled.booleanValue());
        }
        if (!(hashMap.get("disableHorizontalScroll") == null || this.customSettings.disableHorizontalScroll == (bool2 = inAppWebViewSettings.disableHorizontalScroll))) {
            if (!bool2.booleanValue() && inAppWebViewSettings.horizontalScrollBarEnabled.booleanValue()) {
                z10 = true;
            }
            setHorizontalScrollBarEnabled(z10);
        }
        if (hashMap.get("overScrollMode") != null && !this.customSettings.overScrollMode.equals(inAppWebViewSettings.overScrollMode)) {
            setOverScrollMode(inAppWebViewSettings.overScrollMode.intValue());
        }
        if (!(hashMap.get("networkAvailable") == null || this.customSettings.networkAvailable == (bool = inAppWebViewSettings.networkAvailable))) {
            setNetworkAvailable(bool.booleanValue());
        }
        if (hashMap.get("rendererPriorityPolicy") != null && (!((map = this.customSettings.rendererPriorityPolicy) != null && map.get("rendererRequestedPriority") == inAppWebViewSettings.rendererPriorityPolicy.get("rendererRequestedPriority") && this.customSettings.rendererPriorityPolicy.get("waivedWhenNotVisible") == inAppWebViewSettings.rendererPriorityPolicy.get("waivedWhenNotVisible")) && Build.VERSION.SDK_INT >= 26)) {
            setRendererPriorityPolicy(((Integer) inAppWebViewSettings.rendererPriorityPolicy.get("rendererRequestedPriority")).intValue(), ((Boolean) inAppWebViewSettings.rendererPriorityPolicy.get("waivedWhenNotVisible")).booleanValue());
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            if (hashMap.get("verticalScrollbarThumbColor") != null && !Util.objEquals(this.customSettings.verticalScrollbarThumbColor, inAppWebViewSettings.verticalScrollbarThumbColor)) {
                setVerticalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.verticalScrollbarThumbColor)));
            }
            if (hashMap.get("verticalScrollbarTrackColor") != null && !Util.objEquals(this.customSettings.verticalScrollbarTrackColor, inAppWebViewSettings.verticalScrollbarTrackColor)) {
                setVerticalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.verticalScrollbarTrackColor)));
            }
            if (hashMap.get("horizontalScrollbarThumbColor") != null && !Util.objEquals(this.customSettings.horizontalScrollbarThumbColor, inAppWebViewSettings.horizontalScrollbarThumbColor)) {
                setHorizontalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.horizontalScrollbarThumbColor)));
            }
            if (hashMap.get("horizontalScrollbarTrackColor") != null && !Util.objEquals(this.customSettings.horizontalScrollbarTrackColor, inAppWebViewSettings.horizontalScrollbarTrackColor)) {
                setHorizontalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.horizontalScrollbarTrackColor)));
            }
        }
        if (hashMap.get("disableDefaultErrorPage") != null && !Util.objEquals(this.customSettings.disableDefaultErrorPage, inAppWebViewSettings.disableDefaultErrorPage) && s.a("SUPPRESS_ERROR_PAGE")) {
            p.r(settings, inAppWebViewSettings.disableDefaultErrorPage.booleanValue());
        }
        if (hashMap.get("algorithmicDarkeningAllowed") != null && !Util.objEquals(this.customSettings.algorithmicDarkeningAllowed, inAppWebViewSettings.algorithmicDarkeningAllowed) && s.a("ALGORITHMIC_DARKENING") && i12 >= 29) {
            p.j(settings, inAppWebViewSettings.algorithmicDarkeningAllowed.booleanValue());
        }
        if (hashMap.get("enterpriseAuthenticationAppLinkPolicyEnabled") != null && !Util.objEquals(this.customSettings.enterpriseAuthenticationAppLinkPolicyEnabled, inAppWebViewSettings.enterpriseAuthenticationAppLinkPolicyEnabled) && s.a("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY")) {
            p.l(settings, inAppWebViewSettings.enterpriseAuthenticationAppLinkPolicyEnabled.booleanValue());
        }
        if (hashMap.get("requestedWithHeaderOriginAllowList") != null && !Util.objEquals(this.customSettings.requestedWithHeaderOriginAllowList, inAppWebViewSettings.requestedWithHeaderOriginAllowList) && s.a("REQUESTED_WITH_HEADER_ALLOW_LIST")) {
            p.p(settings, inAppWebViewSettings.requestedWithHeaderOriginAllowList);
        }
        if (this.plugin != null) {
            WebViewAssetLoaderExt webViewAssetLoaderExt2 = this.webViewAssetLoaderExt;
            if (webViewAssetLoaderExt2 != null) {
                webViewAssetLoaderExt2.dispose();
            }
            this.webViewAssetLoaderExt = WebViewAssetLoaderExt.fromMap(this.customSettings.webViewAssetLoader, this.plugin, getContext());
        }
        this.customSettings = inAppWebViewSettings;
    }

    public void setUserContentController(UserContentController userContentController2) {
        this.userContentController = userContentController2;
    }

    public void setWebMessageChannels(Map<String, WebMessageChannel> map) {
        this.webMessageChannels = map;
    }

    public ActionMode startActionMode(ActionMode.Callback callback) {
        Map<String, Object> map;
        if (!this.customSettings.useHybridComposition.booleanValue() || this.customSettings.disableContextMenu.booleanValue() || ((map = this.contextMenu) != null && map.keySet().size() != 0)) {
            return rebuildActionMode(super.startActionMode(callback), callback);
        }
        return super.startActionMode(callback);
    }

    public void takeScreenshot(final Map<String, Object> map, final k.d dVar) {
        final float pixelDensity = Util.getPixelDensity(getContext());
        this.mainLooperHandler.post(new Runnable() {
            public void run() {
                Bitmap.CompressFormat compressFormat;
                Bitmap bitmap;
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(InAppWebView.this.getMeasuredWidth(), InAppWebView.this.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.translate((float) (-InAppWebView.this.getScrollX()), (float) (-InAppWebView.this.getScrollY()));
                    InAppWebView.this.draw(canvas);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
                    int i10 = 100;
                    Map map = map;
                    if (map != null) {
                        Map map2 = (Map) map.get("rect");
                        if (map2 != null) {
                            compressFormat = compressFormat2;
                            createBitmap = Bitmap.createBitmap(createBitmap, (int) Math.floor((((Double) map2.get("x")).doubleValue() * ((double) pixelDensity)) + 0.5d), (int) Math.floor((((Double) map2.get("y")).doubleValue() * ((double) pixelDensity)) + 0.5d), Math.min(createBitmap.getWidth(), (int) Math.floor((((Double) map2.get("width")).doubleValue() * ((double) pixelDensity)) + 0.5d)), Math.min(createBitmap.getHeight(), (int) Math.floor((((Double) map2.get("height")).doubleValue() * ((double) pixelDensity)) + 0.5d)));
                        } else {
                            compressFormat = compressFormat2;
                        }
                        Double d10 = (Double) map.get("snapshotWidth");
                        if (d10 != null) {
                            int floor = (int) Math.floor((d10.doubleValue() * ((double) pixelDensity)) + 0.5d);
                            createBitmap = Bitmap.createScaledBitmap(createBitmap, floor, (int) (((float) floor) / (((float) createBitmap.getWidth()) / ((float) createBitmap.getHeight()))), true);
                        }
                        bitmap = createBitmap;
                        try {
                            compressFormat = Bitmap.CompressFormat.valueOf((String) map.get("compressFormat"));
                        } catch (IllegalArgumentException e10) {
                            Log.e(InAppWebView.LOG_TAG, MaxReward.DEFAULT_LABEL, e10);
                        }
                        i10 = ((Integer) map.get("quality")).intValue();
                    } else {
                        compressFormat = compressFormat2;
                        bitmap = createBitmap;
                    }
                    bitmap.compress(compressFormat, i10, byteArrayOutputStream);
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e11) {
                        Log.e(InAppWebView.LOG_TAG, MaxReward.DEFAULT_LABEL, e11);
                    }
                    bitmap.recycle();
                    dVar.success(byteArrayOutputStream.toByteArray());
                } catch (IllegalArgumentException e12) {
                    Log.e(InAppWebView.LOG_TAG, MaxReward.DEFAULT_LABEL, e12);
                    dVar.success((Object) null);
                }
            }
        });
    }

    public void getZoomScale(ValueCallback<Float> valueCallback) {
        valueCallback.onReceiveValue(Float.valueOf(this.zoomScale));
    }

    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        Map<String, Object> map;
        if (!this.customSettings.useHybridComposition.booleanValue() || this.customSettings.disableContextMenu.booleanValue() || ((map = this.contextMenu) != null && map.keySet().size() != 0)) {
            return rebuildActionMode(super.startActionMode(callback, i10), callback);
        }
        return super.startActionMode(callback, i10);
    }

    public InAppWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InAppWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public InAppWebView(Context context, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Object obj, Integer num, InAppWebViewSettings inAppWebViewSettings, Map<String, Object> map, View view, List<UserScript> list) {
        super(context, view, inAppWebViewSettings.useHybridComposition);
        this.plugin = inAppWebViewFlutterPlugin;
        this.f28503id = obj;
        c cVar = inAppWebViewFlutterPlugin.messenger;
        this.channelDelegate = new WebViewChannelDelegate(this, new k(cVar, METHOD_CHANNEL_NAME_PREFIX + obj));
        this.windowId = num;
        this.customSettings = inAppWebViewSettings;
        this.contextMenu = map;
        this.initialUserOnlyScripts = list;
        Activity activity = inAppWebViewFlutterPlugin.activity;
        if (activity != null) {
            activity.registerForContextMenu(this);
        }
    }
}
