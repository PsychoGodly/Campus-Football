package com.unity3d.services.core.webview;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;
import j1.r;
import j1.s;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import sd.g;
import sd.k;

/* compiled from: WebView.kt */
public class WebView extends android.webkit.WebView implements IServiceComponent {
    private final g sdkMetricsSender$delegate;
    private final WebViewBridgeInterface webViewBridgeInterface;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WebView(Context context) {
        this(context, false, (IWebViewBridge) null, (IInvocationCallbackInvoker) null, (IExperiments) null, 30, (h) null);
        m.e(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z10) {
        this(context, z10, (IWebViewBridge) null, (IInvocationCallbackInvoker) null, (IExperiments) null, 28, (h) null);
        m.e(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z10, IWebViewBridge iWebViewBridge) {
        this(context, z10, iWebViewBridge, (IInvocationCallbackInvoker) null, (IExperiments) null, 24, (h) null);
        m.e(context, "context");
        m.e(iWebViewBridge, "webViewBridge");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z10, IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker) {
        this(context, z10, iWebViewBridge, iInvocationCallbackInvoker, (IExperiments) null, 16, (h) null);
        m.e(context, "context");
        m.e(iWebViewBridge, "webViewBridge");
        m.e(iInvocationCallbackInvoker, "callbackInvoker");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebView(Context context, boolean z10, IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, IExperiments iExperiments, int i10, h hVar) {
        this(context, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i10 & 8) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker, (i10 & 16) != 0 ? new Experiments() : iExperiments);
    }

    /* access modifiers changed from: private */
    public static final void evaluateJavascript$lambda$1(WebView webView, String str, ValueCallback valueCallback) {
        m.e(webView, "this$0");
        m.e(str, "$script");
        super.evaluateJavascript(str, valueCallback);
    }

    private final SDKMetricsSender getSdkMetricsSender() {
        return (SDKMetricsSender) this.sdkMetricsSender$delegate.getValue();
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        m.e(str, "script");
        Utilities.runOnUiThread(new c(this, str, valueCallback));
    }

    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public void loadUrl(String str) {
        m.e(str, "url");
        DeviceLog.debug("Loading url: " + str);
        super.loadUrl(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z10, IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, IExperiments iExperiments) {
        super(context);
        m.e(context, "context");
        m.e(iWebViewBridge, "webViewBridge");
        m.e(iInvocationCallbackInvoker, "callbackInvoker");
        m.e(iExperiments, "experiments");
        this.sdkMetricsSender$delegate = i.b(k.NONE, new WebView$special$$inlined$inject$default$1(this, MaxReward.DEFAULT_LABEL));
        WebViewBridgeInterface webViewBridgeInterface2 = new WebViewBridgeInterface(iWebViewBridge, iInvocationCallbackInvoker);
        this.webViewBridgeInterface = webViewBridgeInterface2;
        WebSettings settings = getSettings();
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(false);
        settings.setEnableSmoothTransition(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        settings.setLightTouchEnabled(false);
        settings.setLoadWithOverviewMode(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(1);
        }
        settings.setNeedInitialFocus(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        settings.setMediaPlaybackRequiresUserGesture(!z10);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        ViewUtilities.setBackground(this, new ColorDrawable(0));
        setBackgroundResource(0);
        boolean isWebMessageEnabled = iExperiments.isWebMessageEnabled();
        if (isWebMessageEnabled) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerEnabledMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerDisabledMetric());
        }
        boolean a10 = s.a("WEB_MESSAGE_LISTENER");
        if (a10) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerSupportedMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerUnsupportedMetric());
        }
        if (!isWebMessageEnabled || !a10) {
            addJavascriptInterface(webViewBridgeInterface2, "webviewbridge");
            return;
        }
        r.b(this, "handleInvocation", p0.a("*"), new b(webViewBridgeInterface2));
        r.b(this, "handleCallback", p0.a("*"), new a(webViewBridgeInterface2));
    }
}
