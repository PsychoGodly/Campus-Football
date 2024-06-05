package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.util.Log;
import android.webkit.WebView;
import com.applovin.mediation.MaxReward;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import j1.s;
import j1.t;
import j1.u;

public class InAppWebViewRenderProcessClient extends u {
    protected static final String LOG_TAG = "IAWRenderProcessClient";

    /* access modifiers changed from: package-private */
    public void dispose() {
    }

    public void onRenderProcessResponsive(WebView webView, final t tVar) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        AnonymousClass2 r02 = new WebViewChannelDelegate.RenderProcessResponsiveCallback() {
            public void defaultBehaviour(Integer num) {
            }

            public void error(String str, String str2, Object obj) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(", ");
                if (str2 == null) {
                    str2 = MaxReward.DEFAULT_LABEL;
                }
                sb2.append(str2);
                Log.e(InAppWebViewRenderProcessClient.LOG_TAG, sb2.toString());
                defaultBehaviour((Integer) null);
            }

            public boolean nonNullSuccess(Integer num) {
                if (tVar == null) {
                    return true;
                }
                if (num.intValue() != 0 || !s.a("WEB_VIEW_RENDERER_TERMINATE")) {
                    return false;
                }
                tVar.a();
                return false;
            }
        };
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onRenderProcessResponsive(inAppWebView.getUrl(), r02);
        } else {
            r02.defaultBehaviour(null);
        }
    }

    public void onRenderProcessUnresponsive(WebView webView, final t tVar) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        AnonymousClass1 r02 = new WebViewChannelDelegate.RenderProcessUnresponsiveCallback() {
            public void defaultBehaviour(Integer num) {
            }

            public void error(String str, String str2, Object obj) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(", ");
                if (str2 == null) {
                    str2 = MaxReward.DEFAULT_LABEL;
                }
                sb2.append(str2);
                Log.e(InAppWebViewRenderProcessClient.LOG_TAG, sb2.toString());
                defaultBehaviour((Integer) null);
            }

            public boolean nonNullSuccess(Integer num) {
                if (tVar == null) {
                    return true;
                }
                if (num.intValue() != 0 || !s.a("WEB_VIEW_RENDERER_TERMINATE")) {
                    return false;
                }
                tVar.a();
                return false;
            }
        };
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onRenderProcessUnresponsive(inAppWebView.getUrl(), r02);
        } else {
            r02.defaultBehaviour(null);
        }
    }
}
