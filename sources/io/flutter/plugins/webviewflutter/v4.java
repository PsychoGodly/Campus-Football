package io.flutter.plugins.webviewflutter;

import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugins.webviewflutter.n;
import java.util.List;
import java.util.Objects;

/* compiled from: WebChromeClientHostApiImpl */
public class v4 implements n.a0 {

    /* renamed from: a  reason: collision with root package name */
    private final d4 f34452a;

    /* renamed from: b  reason: collision with root package name */
    private final b f34453b;

    /* renamed from: c  reason: collision with root package name */
    private final u4 f34454c;

    /* compiled from: WebChromeClientHostApiImpl */
    public static class a extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        WebViewClient f34455a;

        /* access modifiers changed from: package-private */
        public boolean a(WebView webView, Message message, WebView webView2) {
            if (this.f34455a == null) {
                return false;
            }
            C0391a aVar = new C0391a(webView);
            if (webView2 == null) {
                webView2 = new WebView(webView.getContext());
            }
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        public void b(WebViewClient webViewClient) {
            this.f34455a = webViewClient;
        }

        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            return a(webView, message, new WebView(webView.getContext()));
        }

        /* renamed from: io.flutter.plugins.webviewflutter.v4$a$a  reason: collision with other inner class name */
        /* compiled from: WebChromeClientHostApiImpl */
        class C0391a extends WebViewClient {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ WebView f34456a;

            C0391a(WebView webView) {
                this.f34456a = webView;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                if (a.this.f34455a.shouldOverrideUrlLoading(this.f34456a, webResourceRequest)) {
                    return true;
                }
                this.f34456a.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (a.this.f34455a.shouldOverrideUrlLoading(this.f34456a, str)) {
                    return true;
                }
                this.f34456a.loadUrl(str);
                return true;
            }
        }
    }

    /* compiled from: WebChromeClientHostApiImpl */
    public static class b {
        public c a(u4 u4Var) {
            return new c(u4Var);
        }
    }

    /* compiled from: WebChromeClientHostApiImpl */
    public static class c extends a {

        /* renamed from: b  reason: collision with root package name */
        private final u4 f34458b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f34459c = false;

        /* renamed from: d  reason: collision with root package name */
        private boolean f34460d = false;

        /* renamed from: e  reason: collision with root package name */
        private boolean f34461e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f34462f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f34463g = false;

        public c(u4 u4Var) {
            this.f34458b = u4Var;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void n(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void o(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void p(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void q(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void s(JsResult jsResult, Boolean bool) {
            if (bool.booleanValue()) {
                jsResult.confirm();
            } else {
                jsResult.cancel();
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void t(JsPromptResult jsPromptResult, String str) {
            if (str != null) {
                jsPromptResult.confirm(str);
            } else {
                jsPromptResult.cancel();
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void u(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void v(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void w(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void x(boolean z10, ValueCallback valueCallback, List list) {
            if (z10) {
                Uri[] uriArr = new Uri[list.size()];
                for (int i10 = 0; i10 < list.size(); i10++) {
                    uriArr[i10] = Uri.parse((String) list.get(i10));
                }
                valueCallback.onReceiveValue(uriArr);
            }
        }

        public void A(boolean z10) {
            this.f34462f = z10;
        }

        public void B(boolean z10) {
            this.f34463g = z10;
        }

        public void C(boolean z10) {
            this.f34459c = z10;
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            this.f34458b.X(this, consoleMessage, e5.f34236a);
            return this.f34460d;
        }

        public void onGeolocationPermissionsHidePrompt() {
            this.f34458b.Y(this, x4.f34486a);
        }

        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            this.f34458b.Z(this, str, callback, g5.f34254a);
        }

        public void onHideCustomView() {
            this.f34458b.a0(this, d5.f34221a);
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            if (!this.f34461e) {
                return false;
            }
            this.f34458b.b0(this, str, str2, new z4(jsResult));
            return true;
        }

        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            if (!this.f34462f) {
                return false;
            }
            this.f34458b.c0(this, str, str2, new y4(jsResult));
            return true;
        }

        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            if (!this.f34463g) {
                return false;
            }
            this.f34458b.d0(this, str, str2, str3, new w4(jsPromptResult));
            return true;
        }

        public void onPermissionRequest(PermissionRequest permissionRequest) {
            this.f34458b.e0(this, permissionRequest, f5.f34245a);
        }

        public void onProgressChanged(WebView webView, int i10) {
            this.f34458b.f0(this, webView, Long.valueOf((long) i10), c5.f34203a);
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            this.f34458b.g0(this, view, customViewCallback, b5.f34193a);
        }

        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            boolean z10 = this.f34459c;
            this.f34458b.h0(this, webView, fileChooserParams, new a5(z10, valueCallback));
            return z10;
        }

        public void y(boolean z10) {
            this.f34460d = z10;
        }

        public void z(boolean z10) {
            this.f34461e = z10;
        }
    }

    public v4(d4 d4Var, b bVar, u4 u4Var) {
        this.f34452a = d4Var;
        this.f34453b = bVar;
        this.f34454c = u4Var;
    }

    public void a(Long l10) {
        this.f34452a.b(this.f34453b.a(this.f34454c), l10.longValue());
    }

    public void b(Long l10, Boolean bool) {
        c cVar = (c) this.f34452a.i(l10.longValue());
        Objects.requireNonNull(cVar);
        c cVar2 = cVar;
        cVar.C(bool.booleanValue());
    }

    public void c(Long l10, Boolean bool) {
        c cVar = (c) this.f34452a.i(l10.longValue());
        Objects.requireNonNull(cVar);
        c cVar2 = cVar;
        cVar.B(bool.booleanValue());
    }

    public void d(Long l10, Boolean bool) {
        c cVar = (c) this.f34452a.i(l10.longValue());
        Objects.requireNonNull(cVar);
        c cVar2 = cVar;
        cVar.z(bool.booleanValue());
    }

    public void e(Long l10, Boolean bool) {
        c cVar = (c) this.f34452a.i(l10.longValue());
        Objects.requireNonNull(cVar);
        c cVar2 = cVar;
        cVar.y(bool.booleanValue());
    }

    public void f(Long l10, Boolean bool) {
        c cVar = (c) this.f34452a.i(l10.longValue());
        Objects.requireNonNull(cVar);
        c cVar2 = cVar;
        cVar.A(bool.booleanValue());
    }
}
