package com.unity3d.services.core.webview;

import android.content.Context;
import android.webkit.WebSettings;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;

public class WebViewWithCache extends WebView {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WebViewWithCache(android.content.Context r8, boolean r9, com.unity3d.services.core.configuration.IExperiments r10) {
        /*
            r7 = this;
            com.unity3d.services.core.webview.bridge.SharedInstances r0 = com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE
            com.unity3d.services.core.webview.bridge.IWebViewBridge r4 = r0.getWebViewBridge()
            com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker r5 = r0.getWebViewAppInvocationCallbackInvoker()
            r1 = r7
            r2 = r8
            r3 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.webview.WebViewWithCache.<init>(android.content.Context, boolean, com.unity3d.services.core.configuration.IExperiments):void");
    }

    public WebViewWithCache(Context context, boolean z10, IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, IExperiments iExperiments) {
        super(context, z10, iWebViewBridge, iInvocationCallbackInvoker, iExperiments);
        WebSettings settings = getSettings();
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        if (z10) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
    }
}
