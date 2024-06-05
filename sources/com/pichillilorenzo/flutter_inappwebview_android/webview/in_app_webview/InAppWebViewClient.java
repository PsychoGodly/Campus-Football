package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.mediation.MaxReward;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceErrorExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import j1.s;
import java.util.List;
import java.util.Map;

public class InAppWebViewClient extends WebViewClient {
    protected static final String LOG_TAG = "IAWebViewClient";
    /* access modifiers changed from: private */
    public static List<URLCredential> credentialsProposed;
    /* access modifiers changed from: private */
    public static int previousAuthRequestFailureCount;
    private InAppBrowserDelegate inAppBrowserDelegate;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient$7  reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$NavigationActionPolicy;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy[] r0 = com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$NavigationActionPolicy = r0
                com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy r1 = com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy.ALLOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$NavigationActionPolicy     // Catch:{ NoSuchFieldError -> 0x001d }
                com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy r1 = com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy.CANCEL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient.AnonymousClass7.<clinit>():void");
        }
    }

    public InAppWebViewClient(InAppBrowserDelegate inAppBrowserDelegate2) {
        this.inAppBrowserDelegate = inAppBrowserDelegate2;
    }

    /* access modifiers changed from: private */
    public void allowShouldOverrideUrlLoading(WebView webView, String str, Map<String, String> map, boolean z10) {
        if (!z10) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            webView.loadUrl(str, map);
        } else {
            webView.loadUrl(str);
        }
    }

    public void dispose() {
        if (this.inAppBrowserDelegate != null) {
            this.inAppBrowserDelegate = null;
        }
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        super.doUpdateVisitedHistory(webView, str, z10);
        String url = webView.getUrl();
        InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate2 != null) {
            inAppBrowserDelegate2.didUpdateVisitedHistory(url);
        }
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onUpdateVisitedHistory(url, z10);
        }
    }

    public void loadCustomJavaScriptOnPageFinished(WebView webView) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        String generateWrappedCodeForDocumentEnd = inAppWebView.userContentController.generateWrappedCodeForDocumentEnd();
        if (Build.VERSION.SDK_INT >= 19) {
            inAppWebView.evaluateJavascript(generateWrappedCodeForDocumentEnd, (ValueCallback) null);
            return;
        }
        inAppWebView.loadUrl("javascript:" + generateWrappedCodeForDocumentEnd.replaceAll("[\r\n]+", MaxReward.DEFAULT_LABEL));
    }

    public void loadCustomJavaScriptOnPageStarted(WebView webView) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (!s.a("DOCUMENT_START_SCRIPT")) {
            String generateWrappedCodeForDocumentStart = inAppWebView.userContentController.generateWrappedCodeForDocumentStart();
            if (Build.VERSION.SDK_INT >= 19) {
                inAppWebView.evaluateJavascript(generateWrappedCodeForDocumentStart, (ValueCallback) null);
                return;
            }
            inAppWebView.loadUrl("javascript:" + generateWrappedCodeForDocumentStart.replaceAll("[\r\n]+", MaxReward.DEFAULT_LABEL));
        }
    }

    public void onFormResubmission(final WebView webView, final Message message, final Message message2) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        AnonymousClass6 r12 = new WebViewChannelDelegate.FormResubmissionCallback() {
            public void error(String str, String str2, Object obj) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(", ");
                if (str2 == null) {
                    str2 = MaxReward.DEFAULT_LABEL;
                }
                sb2.append(str2);
                Log.e(InAppWebViewClient.LOG_TAG, sb2.toString());
                defaultBehaviour((Integer) null);
            }

            public void defaultBehaviour(Integer num) {
                InAppWebViewClient.super.onFormResubmission(webView, message, message2);
            }

            public boolean nonNullSuccess(Integer num) {
                if (num.intValue() != 0) {
                    message.sendToTarget();
                    return false;
                }
                message2.sendToTarget();
                return false;
            }
        };
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onFormResubmission(inAppWebView.getUrl(), r12);
        } else {
            r12.defaultBehaviour(null);
        }
    }

    public void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onPageCommitVisible(str);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        inAppWebView.isLoading = false;
        loadCustomJavaScriptOnPageFinished(inAppWebView);
        previousAuthRequestFailureCount = 0;
        credentialsProposed = null;
        super.onPageFinished(webView, str);
        InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate2 != null) {
            inAppBrowserDelegate2.didFinishNavigation(str);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            CookieManager.getInstance().flush();
        } else {
            CookieSyncManager.getInstance().sync();
        }
        if (i10 >= 19) {
            inAppWebView.evaluateJavascript(JavaScriptBridgeJS.PLATFORM_READY_JS_SOURCE, (ValueCallback) null);
        } else {
            inAppWebView.loadUrl("javascript:" + JavaScriptBridgeJS.PLATFORM_READY_JS_SOURCE.replaceAll("[\r\n]+", MaxReward.DEFAULT_LABEL));
        }
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onLoadStop(str);
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        inAppWebView.isLoading = true;
        inAppWebView.disposeWebMessageChannels();
        inAppWebView.userContentController.resetContentWorlds();
        loadCustomJavaScriptOnPageStarted(inAppWebView);
        super.onPageStarted(webView, str, bitmap);
        InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate2 != null) {
            inAppBrowserDelegate2.didStartNavigation(str);
        }
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onLoadStart(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceivedClientCertRequest(final android.webkit.WebView r9, final android.webkit.ClientCertRequest r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.getUrl()
            java.lang.String r2 = r10.getHost()
            int r5 = r10.getPort()
            if (r0 == 0) goto L_0x0020
            java.net.URI r1 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0018 }
            r1.<init>(r0)     // Catch:{ URISyntaxException -> 0x0018 }
            java.lang.String r0 = r1.getScheme()     // Catch:{ URISyntaxException -> 0x0018 }
            goto L_0x0022
        L_0x0018:
            r0 = move-exception
            java.lang.String r1 = "IAWebViewClient"
            java.lang.String r3 = ""
            android.util.Log.e(r1, r3, r0)
        L_0x0020:
            java.lang.String r0 = "https"
        L_0x0022:
            r3 = r0
            com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace r0 = new com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace
            r4 = 0
            android.net.http.SslCertificate r6 = r9.getCertificate()
            r7 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertChallenge r1 = new com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertChallenge
            java.security.Principal[] r2 = r10.getPrincipals()
            java.lang.String[] r3 = r10.getKeyTypes()
            r1.<init>(r0, r2, r3)
            r0 = r9
            com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView r0 = (com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView) r0
            com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient$4 r2 = new com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient$4
            r2.<init>(r0, r10, r9)
            com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate r9 = r0.channelDelegate
            if (r9 == 0) goto L_0x004c
            r9.onReceivedClientCertRequest(r1, r2)
            goto L_0x0050
        L_0x004c:
            r9 = 0
            r2.defaultBehaviour(r9)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient.onReceivedClientCertRequest(android.webkit.WebView, android.webkit.ClientCertRequest):void");
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (webResourceRequest.isForMainFrame()) {
            if (inAppWebView.customSettings.disableDefaultErrorPage.booleanValue()) {
                inAppWebView.stopLoading();
                inAppWebView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
            }
            inAppWebView.isLoading = false;
            previousAuthRequestFailureCount = 0;
            credentialsProposed = null;
            InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
            if (inAppBrowserDelegate2 != null) {
                inAppBrowserDelegate2.didFailNavigation(webResourceRequest.getUrl().toString(), webResourceError.getErrorCode(), webResourceError.getDescription().toString());
            }
        }
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onReceivedError(WebResourceRequestExt.fromWebResourceRequest(webResourceRequest), WebResourceErrorExt.fromWebResourceError(webResourceError));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceivedHttpAuthRequest(android.webkit.WebView r16, android.webkit.HttpAuthHandler r17, java.lang.String r18, java.lang.String r19) {
        /*
            r15 = this;
            java.lang.String r0 = r16.getUrl()
            r1 = 0
            java.lang.String r2 = "https"
            if (r0 == 0) goto L_0x001f
            java.net.URI r3 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0017 }
            r3.<init>(r0)     // Catch:{ URISyntaxException -> 0x0017 }
            java.lang.String r2 = r3.getScheme()     // Catch:{ URISyntaxException -> 0x0017 }
            int r0 = r3.getPort()     // Catch:{ URISyntaxException -> 0x0017 }
            goto L_0x0020
        L_0x0017:
            r0 = move-exception
            java.lang.String r3 = "IAWebViewClient"
            java.lang.String r4 = ""
            android.util.Log.e(r3, r4, r0)
        L_0x001f:
            r0 = 0
        L_0x0020:
            int r3 = previousAuthRequestFailureCount
            int r3 = r3 + 1
            previousAuthRequestFailureCount = r3
            java.util.List<com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential> r3 = credentialsProposed
            if (r3 != 0) goto L_0x0041
            android.content.Context r3 = r16.getContext()
            com.pichillilorenzo.flutter_inappwebview_android.credential_database.CredentialDatabase r3 = com.pichillilorenzo.flutter_inappwebview_android.credential_database.CredentialDatabase.getInstance(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r12 = r18
            r13 = r19
            java.util.List r3 = r3.getHttpAuthCredentials(r12, r2, r13, r4)
            credentialsProposed = r3
            goto L_0x0045
        L_0x0041:
            r12 = r18
            r13 = r19
        L_0x0045:
            java.util.List<com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential> r3 = credentialsProposed
            r4 = 0
            if (r3 == 0) goto L_0x0059
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0059
            java.util.List<com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential> r3 = credentialsProposed
            java.lang.Object r1 = r3.get(r1)
            com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential r1 = (com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential) r1
            goto L_0x005a
        L_0x0059:
            r1 = r4
        L_0x005a:
            com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace r3 = new com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace
            android.net.http.SslCertificate r10 = r16.getCertificate()
            r11 = 0
            r5 = r3
            r6 = r18
            r7 = r2
            r8 = r19
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthenticationChallenge r14 = new com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthenticationChallenge
            int r5 = previousAuthRequestFailureCount
            r14.<init>(r3, r5, r1)
            r1 = r16
            com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView r1 = (com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView) r1
            com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient$2 r3 = new com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient$2
            r5 = r3
            r6 = r15
            r7 = r16
            r8 = r18
            r9 = r2
            r10 = r19
            r11 = r0
            r12 = r17
            r5.<init>(r7, r8, r9, r10, r11, r12)
            com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate r0 = r1.channelDelegate
            if (r0 == 0) goto L_0x008f
            r0.onReceivedHttpAuthRequest(r14, r3)
            goto L_0x0092
        L_0x008f:
            r3.defaultBehaviour(r4)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient.onReceivedHttpAuthRequest(android.webkit.WebView, android.webkit.HttpAuthHandler, java.lang.String, java.lang.String):void");
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onReceivedHttpError(WebResourceRequestExt.fromWebResourceRequest(webResourceRequest), WebResourceResponseExt.fromWebResourceResponse(webResourceResponse));
        }
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onReceivedLoginRequest(str, str2, str3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceivedSslError(final android.webkit.WebView r11, final android.webkit.SslErrorHandler r12, final android.net.http.SslError r13) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = r13.getUrl()
            java.lang.String r2 = "https"
            java.net.URI r3 = new java.net.URI     // Catch:{ URISyntaxException -> 0x001f }
            r3.<init>(r1)     // Catch:{ URISyntaxException -> 0x001f }
            java.lang.String r1 = r3.getHost()     // Catch:{ URISyntaxException -> 0x001f }
            java.lang.String r2 = r3.getScheme()     // Catch:{ URISyntaxException -> 0x001d }
            int r0 = r3.getPort()     // Catch:{ URISyntaxException -> 0x001d }
            r7 = r0
            r4 = r1
            r5 = r2
            goto L_0x002a
        L_0x001d:
            r3 = move-exception
            goto L_0x0021
        L_0x001f:
            r3 = move-exception
            r1 = r0
        L_0x0021:
            java.lang.String r4 = "IAWebViewClient"
            android.util.Log.e(r4, r0, r3)
            r0 = 0
            r4 = r1
            r5 = r2
            r7 = 0
        L_0x002a:
            com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace r0 = new com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace
            r6 = 0
            android.net.http.SslCertificate r8 = r13.getCertificate()
            r3 = r0
            r9 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustChallenge r1 = new com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustChallenge
            r1.<init>(r0)
            r0 = r11
            com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView r0 = (com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView) r0
            com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient$3 r2 = new com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient$3
            r2.<init>(r12, r11, r13)
            com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate r11 = r0.channelDelegate
            if (r11 == 0) goto L_0x004b
            r11.onReceivedServerTrustAuthRequest(r1, r2)
            goto L_0x004f
        L_0x004b:
            r11 = 0
            r2.defaultBehaviour(r11)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient.onReceivedSslError(android.webkit.WebView, android.webkit.SslErrorHandler, android.net.http.SslError):void");
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (!inAppWebView.customSettings.useOnRenderProcessGone.booleanValue() || inAppWebView.channelDelegate == null) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        inAppWebView.channelDelegate.onRenderProcessGone(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
        return true;
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, SafeBrowsingResponse safeBrowsingResponse) {
        final SafeBrowsingResponse safeBrowsingResponse2 = safeBrowsingResponse;
        final WebView webView2 = webView;
        final WebResourceRequest webResourceRequest2 = webResourceRequest;
        final int i11 = i10;
        AnonymousClass5 r12 = new WebViewChannelDelegate.SafeBrowsingHitCallback() {
            public void error(String str, String str2, Object obj) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(", ");
                if (str2 == null) {
                    str2 = MaxReward.DEFAULT_LABEL;
                }
                sb2.append(str2);
                Log.e(InAppWebViewClient.LOG_TAG, sb2.toString());
                defaultBehaviour((com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse) null);
            }

            public void defaultBehaviour(com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse safeBrowsingResponse) {
                InAppWebViewClient.super.onSafeBrowsingHit(webView2, webResourceRequest2, i11, safeBrowsingResponse2);
            }

            public boolean nonNullSuccess(com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse safeBrowsingResponse) {
                Integer action = safeBrowsingResponse.getAction();
                if (action == null) {
                    return true;
                }
                boolean isReport = safeBrowsingResponse.isReport();
                int intValue = action.intValue();
                if (intValue == 0) {
                    safeBrowsingResponse2.backToSafety(isReport);
                    return false;
                } else if (intValue != 1) {
                    safeBrowsingResponse2.showInterstitial(isReport);
                    return false;
                } else {
                    safeBrowsingResponse2.proceed(isReport);
                    return false;
                }
            }
        };
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onSafeBrowsingHit(webResourceRequest.getUrl().toString(), i10, r12);
        } else {
            r12.defaultBehaviour(null);
        }
    }

    public void onScaleChanged(WebView webView, float f10, float f11) {
        super.onScaleChanged(webView, f10, f11);
        InAppWebView inAppWebView = (InAppWebView) webView;
        inAppWebView.zoomScale = f11 / Util.getPixelDensity(inAppWebView.getContext());
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onZoomScaleChanged(f10, f11);
        }
    }

    public void onShouldOverrideUrlLoading(InAppWebView inAppWebView, String str, String str2, Map<String, String> map, boolean z10, boolean z11, boolean z12) {
        NavigationAction navigationAction = new NavigationAction(new URLRequest(str, str2, (byte[]) null, map), z10, z11, z12);
        final InAppWebView inAppWebView2 = inAppWebView;
        final String str3 = str;
        final Map<String, String> map2 = map;
        final boolean z13 = z10;
        AnonymousClass1 r22 = new WebViewChannelDelegate.ShouldOverrideUrlLoadingCallback() {
            public void error(String str, String str2, Object obj) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(", ");
                if (str2 == null) {
                    str2 = MaxReward.DEFAULT_LABEL;
                }
                sb2.append(str2);
                Log.e(InAppWebViewClient.LOG_TAG, sb2.toString());
                defaultBehaviour((NavigationActionPolicy) null);
            }

            public void defaultBehaviour(NavigationActionPolicy navigationActionPolicy) {
                InAppWebViewClient.this.allowShouldOverrideUrlLoading(inAppWebView2, str3, map2, z13);
            }

            public boolean nonNullSuccess(NavigationActionPolicy navigationActionPolicy) {
                if (AnonymousClass7.$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$NavigationActionPolicy[navigationActionPolicy.ordinal()] != 1) {
                    return false;
                }
                InAppWebViewClient.this.allowShouldOverrideUrlLoading(inAppWebView2, str3, map2, z13);
                return false;
            }
        };
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.shouldOverrideUrlLoading(navigationAction, r22);
        } else {
            r22.defaultBehaviour(null);
        }
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.io.ByteArrayInputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r12, com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt r13) {
        /*
            r11 = this;
            com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView r12 = (com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView) r12
            com.pichillilorenzo.flutter_inappwebview_android.types.WebViewAssetLoaderExt r0 = r12.webViewAssetLoaderExt
            java.lang.String r1 = ""
            java.lang.String r2 = "IAWebViewClient"
            if (r0 == 0) goto L_0x0025
            j1.q r0 = r0.loader
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r13.getUrl()     // Catch:{ Exception -> 0x0021 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x0021 }
            com.pichillilorenzo.flutter_inappwebview_android.types.WebViewAssetLoaderExt r3 = r12.webViewAssetLoaderExt     // Catch:{ Exception -> 0x0021 }
            j1.q r3 = r3.loader     // Catch:{ Exception -> 0x0021 }
            android.webkit.WebResourceResponse r0 = r3.a(r0)     // Catch:{ Exception -> 0x0021 }
            if (r0 == 0) goto L_0x0025
            return r0
        L_0x0021:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
        L_0x0025:
            com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings r0 = r12.customSettings
            java.lang.Boolean r0 = r0.useShouldInterceptRequest
            boolean r0 = r0.booleanValue()
            r3 = 0
            if (r0 == 0) goto L_0x007d
            com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate r12 = r12.channelDelegate
            if (r12 == 0) goto L_0x003e
            com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt r12 = r12.shouldInterceptRequest(r13)     // Catch:{ InterruptedException -> 0x0039 }
            goto L_0x003f
        L_0x0039:
            r12 = move-exception
            android.util.Log.e(r2, r1, r12)
            return r3
        L_0x003e:
            r12 = r3
        L_0x003f:
            if (r12 == 0) goto L_0x007c
            java.lang.String r5 = r12.getContentType()
            java.lang.String r6 = r12.getContentEncoding()
            byte[] r13 = r12.getData()
            java.util.Map r9 = r12.getHeaders()
            java.lang.Integer r0 = r12.getStatusCode()
            java.lang.String r8 = r12.getReasonPhrase()
            if (r13 == 0) goto L_0x0060
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            r3.<init>(r13)
        L_0x0060:
            r10 = r3
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 21
            if (r12 < r13) goto L_0x0076
            if (r0 == 0) goto L_0x0076
            if (r8 == 0) goto L_0x0076
            android.webkit.WebResourceResponse r12 = new android.webkit.WebResourceResponse
            int r7 = r0.intValue()
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r12
        L_0x0076:
            android.webkit.WebResourceResponse r12 = new android.webkit.WebResourceResponse
            r12.<init>(r5, r6, r10)
            return r12
        L_0x007c:
            return r3
        L_0x007d:
            java.lang.String r0 = r13.getUrl()
            java.lang.String r4 = ":"
            java.lang.String[] r0 = r0.split(r4)
            r4 = 0
            r0 = r0[r4]
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r4 = r13.getUrl()     // Catch:{ Exception -> 0x009b }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x009b }
            java.lang.String r0 = r4.getScheme()     // Catch:{ Exception -> 0x009b }
            goto L_0x009c
        L_0x009b:
        L_0x009c:
            com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings r4 = r12.customSettings
            java.util.List<java.lang.String> r4 = r4.resourceCustomSchemes
            if (r4 == 0) goto L_0x00e2
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x00e2
            com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate r0 = r12.channelDelegate
            if (r0 == 0) goto L_0x00b6
            com.pichillilorenzo.flutter_inappwebview_android.types.CustomSchemeResponse r0 = r0.onLoadResourceWithCustomScheme(r13)     // Catch:{ InterruptedException -> 0x00b1 }
            goto L_0x00b7
        L_0x00b1:
            r12 = move-exception
            android.util.Log.e(r2, r1, r12)
            return r3
        L_0x00b6:
            r0 = r3
        L_0x00b7:
            if (r0 == 0) goto L_0x00e2
            com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler r4 = r12.contentBlockerHandler     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r5 = r0.getContentType()     // Catch:{ Exception -> 0x00c4 }
            android.webkit.WebResourceResponse r3 = r4.checkUrl((com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView) r12, (com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt) r13, (java.lang.String) r5)     // Catch:{ Exception -> 0x00c4 }
            goto L_0x00c8
        L_0x00c4:
            r12 = move-exception
            android.util.Log.e(r2, r1, r12)
        L_0x00c8:
            if (r3 == 0) goto L_0x00cb
            return r3
        L_0x00cb:
            android.webkit.WebResourceResponse r12 = new android.webkit.WebResourceResponse
            java.lang.String r13 = r0.getContentType()
            java.lang.String r1 = r0.getContentType()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            byte[] r0 = r0.getData()
            r2.<init>(r0)
            r12.<init>(r13, r1, r2)
            return r12
        L_0x00e2:
            com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler r0 = r12.contentBlockerHandler
            java.util.List r0 = r0.getRuleList()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00f9
            com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler r0 = r12.contentBlockerHandler     // Catch:{ Exception -> 0x00f5 }
            android.webkit.WebResourceResponse r3 = r0.checkUrl(r12, r13)     // Catch:{ Exception -> 0x00f5 }
            goto L_0x00f9
        L_0x00f5:
            r12 = move-exception
            android.util.Log.e(r2, r1, r12)
        L_0x00f9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient.shouldInterceptRequest(android.webkit.WebView, com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt):android.webkit.WebResourceResponse");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean shouldOverrideUrlLoading(android.webkit.WebView r9, android.webkit.WebResourceRequest r10) {
        /*
            r8 = this;
            com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView r9 = (com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView) r9
            com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings r0 = r9.customSettings
            java.lang.Boolean r0 = r0.useShouldOverrideUrlLoading
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = "WEB_RESOURCE_REQUEST_IS_REDIRECT"
            boolean r0 = j1.s.a(r0)
            if (r0 == 0) goto L_0x001b
            boolean r0 = j1.o.b(r10)
        L_0x0019:
            r7 = r0
            goto L_0x0027
        L_0x001b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r0 < r2) goto L_0x0026
            boolean r0 = r10.isRedirect()
            goto L_0x0019
        L_0x0026:
            r7 = 0
        L_0x0027:
            android.net.Uri r0 = r10.getUrl()
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = r10.getMethod()
            java.util.Map r4 = r10.getRequestHeaders()
            boolean r5 = r10.isForMainFrame()
            boolean r6 = r10.hasGesture()
            r0 = r8
            r1 = r9
            r0.onShouldOverrideUrlLoading(r1, r2, r3, r4, r5, r6, r7)
            java.util.regex.Pattern r0 = r9.regexToCancelSubFramesLoadingCompiled
            if (r0 == 0) goto L_0x0063
            boolean r0 = r10.isForMainFrame()
            if (r0 == 0) goto L_0x0050
            r9 = 1
            return r9
        L_0x0050:
            java.util.regex.Pattern r9 = r9.regexToCancelSubFramesLoadingCompiled
            android.net.Uri r10 = r10.getUrl()
            java.lang.String r10 = r10.toString()
            java.util.regex.Matcher r9 = r9.matcher(r10)
            boolean r9 = r9.matches()
            return r9
        L_0x0063:
            boolean r9 = r10.isForMainFrame()
            return r9
        L_0x0068:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient.shouldOverrideUrlLoading(android.webkit.WebView, android.webkit.WebResourceRequest):boolean");
    }

    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (!s.a("SUPPRESS_ERROR_PAGE") && inAppWebView.customSettings.disableDefaultErrorPage.booleanValue()) {
            inAppWebView.stopLoading();
            inAppWebView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
        }
        inAppWebView.isLoading = false;
        previousAuthRequestFailureCount = 0;
        credentialsProposed = null;
        InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate2 != null) {
            inAppBrowserDelegate2.didFailNavigation(str2, i10, str);
        }
        WebResourceRequestExt webResourceRequestExt = new WebResourceRequestExt(str2, (Map<String, String>) null, false, false, true, "GET");
        WebResourceErrorExt webResourceErrorExt = new WebResourceErrorExt(i10, str);
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onReceivedError(webResourceRequestExt, webResourceErrorExt);
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (!inAppWebView.customSettings.useShouldOverrideUrlLoading.booleanValue()) {
            return false;
        }
        onShouldOverrideUrlLoading(inAppWebView, str, "GET", (Map<String, String>) null, true, false, false);
        return true;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return shouldInterceptRequest(webView, new WebResourceRequestExt(str, (Map<String, String>) null, false, false, true, "GET"));
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldInterceptRequest(webView, WebResourceRequestExt.fromWebResourceRequest(webResourceRequest));
    }
}
