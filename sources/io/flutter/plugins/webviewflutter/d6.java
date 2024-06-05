package io.flutter.plugins.webviewflutter;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.KeyEvent;
import android.webkit.HttpAuthHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewClientCompat;
import io.flutter.plugins.webviewflutter.n;
import java.util.Objects;

/* compiled from: WebViewClientHostApiImpl */
public class d6 implements n.i0 {

    /* renamed from: a  reason: collision with root package name */
    private final d4 f34222a;

    /* renamed from: b  reason: collision with root package name */
    private final b f34223b;

    /* renamed from: c  reason: collision with root package name */
    private final t5 f34224c;

    /* compiled from: WebViewClientHostApiImpl */
    public static class a extends WebViewClientCompat {

        /* renamed from: a  reason: collision with root package name */
        private final t5 f34225a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f34226b = false;

        public a(t5 t5Var) {
            this.f34225a = t5Var;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void j(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void k(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void l(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void m(Void voidR) {
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
        public static /* synthetic */ void r(Void voidR) {
        }

        public void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
            this.f34225a.Q(this, webView, str, z10, x5.f34487a);
        }

        public void onPageFinished(WebView webView, String str) {
            this.f34225a.c0(this, webView, str, u5.f34446a);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f34225a.d0(this, webView, str, v5.f34464a);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, j1.n nVar) {
            this.f34225a.i0(this, webView, webResourceRequest, nVar, w5.f34471a);
        }

        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            this.f34225a.f0(this, webView, httpAuthHandler, str, str2, c6.f34204a);
        }

        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            this.f34225a.g0(this, webView, webResourceRequest, webResourceResponse, y5.f34495a);
        }

        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        public void s(boolean z10) {
            this.f34226b = z10;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            this.f34225a.j0(this, webView, webResourceRequest, a6.f34185a);
            return webResourceRequest.isForMainFrame() && this.f34226b;
        }

        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            this.f34225a.e0(this, webView, Long.valueOf((long) i10), str, str2, z5.f34503a);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.f34225a.k0(this, webView, str, b6.f34194a);
            return this.f34226b;
        }
    }

    /* compiled from: WebViewClientHostApiImpl */
    public static class b {
        public WebViewClient a(t5 t5Var) {
            if (Build.VERSION.SDK_INT >= 24) {
                return new c(t5Var);
            }
            return new a(t5Var);
        }
    }

    /* compiled from: WebViewClientHostApiImpl */
    public static class c extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        private final t5 f34227a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f34228b = false;

        public c(t5 t5Var) {
            this.f34227a = t5Var;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void j(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void k(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void l(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void m(Void voidR) {
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
        public static /* synthetic */ void r(Void voidR) {
        }

        public void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
            this.f34227a.Q(this, webView, str, z10, i6.f34277a);
        }

        public void onPageFinished(WebView webView, String str) {
            this.f34227a.c0(this, webView, str, h6.f34269a);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f34227a.d0(this, webView, str, g6.f34255a);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.f34227a.h0(this, webView, webResourceRequest, webResourceError, l6.f34307a);
        }

        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            this.f34227a.f0(this, webView, httpAuthHandler, str, str2, j6.f34288a);
        }

        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            this.f34227a.g0(this, webView, webResourceRequest, webResourceResponse, f6.f34246a);
        }

        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        public void s(boolean z10) {
            this.f34228b = z10;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            this.f34227a.j0(this, webView, webResourceRequest, m6.f34318a);
            return webResourceRequest.isForMainFrame() && this.f34228b;
        }

        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            this.f34227a.e0(this, webView, Long.valueOf((long) i10), str, str2, e6.f34237a);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.f34227a.k0(this, webView, str, k6.f34298a);
            return this.f34228b;
        }
    }

    public d6(d4 d4Var, b bVar, t5 t5Var) {
        this.f34222a = d4Var;
        this.f34223b = bVar;
        this.f34224c = t5Var;
    }

    public void a(Long l10) {
        this.f34222a.b(this.f34223b.a(this.f34224c), l10.longValue());
    }

    public void b(Long l10, Boolean bool) {
        WebViewClient webViewClient = (WebViewClient) this.f34222a.i(l10.longValue());
        Objects.requireNonNull(webViewClient);
        WebViewClient webViewClient2 = webViewClient;
        if (webViewClient instanceof a) {
            ((a) webViewClient).s(bool.booleanValue());
        } else if (Build.VERSION.SDK_INT < 24 || !(webViewClient instanceof c)) {
            throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
        } else {
            ((c) webViewClient).s(bool.booleanValue());
        }
    }
}
