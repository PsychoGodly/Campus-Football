package io.flutter.plugins.webviewflutter;

import android.os.Build;
import android.webkit.HttpAuthHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugins.webviewflutter.n;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import lc.c;

/* compiled from: WebViewClientFlutterApiImpl */
public class t5 extends n.g0 {

    /* renamed from: b  reason: collision with root package name */
    private final c f34434b;

    /* renamed from: c  reason: collision with root package name */
    private final d4 f34435c;

    /* renamed from: d  reason: collision with root package name */
    private final o6 f34436d;

    public t5(c cVar, d4 d4Var) {
        super(cVar);
        this.f34434b = cVar;
        this.f34435c = d4Var;
        this.f34436d = new o6(cVar, d4Var);
    }

    static n.b0 M(WebResourceError webResourceError) {
        return new n.b0.a().c(Long.valueOf((long) webResourceError.getErrorCode())).b(webResourceError.getDescription().toString()).a();
    }

    static n.b0 N(j1.n nVar) {
        return new n.b0.a().c(Long.valueOf((long) nVar.b())).b(nVar.a().toString()).a();
    }

    static n.c0 O(WebResourceRequest webResourceRequest) {
        Map map;
        n.c0.a e10 = new n.c0.a().g(webResourceRequest.getUrl().toString()).c(Boolean.valueOf(webResourceRequest.isForMainFrame())).b(Boolean.valueOf(webResourceRequest.hasGesture())).e(webResourceRequest.getMethod());
        if (webResourceRequest.getRequestHeaders() != null) {
            map = webResourceRequest.getRequestHeaders();
        } else {
            map = new HashMap();
        }
        n.c0.a f10 = e10.f(map);
        if (Build.VERSION.SDK_INT >= 24) {
            f10.d(Boolean.valueOf(webResourceRequest.isRedirect()));
        }
        return f10.a();
    }

    static n.d0 P(WebResourceResponse webResourceResponse) {
        return new n.d0.a().b(Long.valueOf((long) webResourceResponse.getStatusCode())).a();
    }

    private long R(WebViewClient webViewClient) {
        Long h10 = this.f34435c.h(webViewClient);
        if (h10 != null) {
            return h10.longValue();
        }
        throw new IllegalStateException("Could not find identifier for WebViewClient.");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void S(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void T(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void U(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void V(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void W(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void X(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void Y(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void Z(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a0(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b0(Void voidR) {
    }

    public void Q(WebViewClient webViewClient, WebView webView, String str, boolean z10, n.g0.a<Void> aVar) {
        this.f34436d.a(webView, p5.f34399a);
        Long h10 = this.f34435c.h(webView);
        Objects.requireNonNull(h10);
        j(Long.valueOf(R(webViewClient)), h10, str, Boolean.valueOf(z10), aVar);
    }

    public void c0(WebViewClient webViewClient, WebView webView, String str, n.g0.a<Void> aVar) {
        this.f34436d.a(webView, n5.f34384a);
        Long h10 = this.f34435c.h(webView);
        Objects.requireNonNull(h10);
        u(Long.valueOf(R(webViewClient)), h10, str, aVar);
    }

    public void d0(WebViewClient webViewClient, WebView webView, String str, n.g0.a<Void> aVar) {
        this.f34436d.a(webView, l5.f34306a);
        Long h10 = this.f34435c.h(webView);
        Objects.requireNonNull(h10);
        v(Long.valueOf(R(webViewClient)), h10, str, aVar);
    }

    public void e0(WebViewClient webViewClient, WebView webView, Long l10, String str, String str2, n.g0.a<Void> aVar) {
        this.f34436d.a(webView, s5.f34423a);
        Long h10 = this.f34435c.h(webView);
        Objects.requireNonNull(h10);
        w(Long.valueOf(R(webViewClient)), h10, l10, str, str2, aVar);
    }

    public void f0(WebViewClient webViewClient, WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2, n.g0.a<Void> aVar) {
        new a4(this.f34434b, this.f34435c).a(httpAuthHandler, j5.f34287a);
        Long h10 = this.f34435c.h(webViewClient);
        Objects.requireNonNull(h10);
        Long h11 = this.f34435c.h(webView);
        Objects.requireNonNull(h11);
        Long h12 = this.f34435c.h(httpAuthHandler);
        Objects.requireNonNull(h12);
        x(h10, h11, h12, str, str2, aVar);
    }

    public void g0(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse, n.g0.a<Void> aVar) {
        this.f34436d.a(webView, q5.f34407a);
        y(Long.valueOf(R(webViewClient)), this.f34435c.h(webView), O(webResourceRequest), P(webResourceResponse), aVar);
    }

    public void h0(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError, n.g0.a<Void> aVar) {
        this.f34436d.a(webView, o5.f34391a);
        Long h10 = this.f34435c.h(webView);
        Objects.requireNonNull(h10);
        z(Long.valueOf(R(webViewClient)), h10, O(webResourceRequest), M(webResourceError), aVar);
    }

    public void i0(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, j1.n nVar, n.g0.a<Void> aVar) {
        this.f34436d.a(webView, k5.f34297a);
        Long h10 = this.f34435c.h(webView);
        Objects.requireNonNull(h10);
        z(Long.valueOf(R(webViewClient)), h10, O(webResourceRequest), N(nVar), aVar);
    }

    public void j0(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, n.g0.a<Void> aVar) {
        this.f34436d.a(webView, m5.f34317a);
        Long h10 = this.f34435c.h(webView);
        Objects.requireNonNull(h10);
        A(Long.valueOf(R(webViewClient)), h10, O(webResourceRequest), aVar);
    }

    public void k0(WebViewClient webViewClient, WebView webView, String str, n.g0.a<Void> aVar) {
        this.f34436d.a(webView, r5.f34415a);
        Long h10 = this.f34435c.h(webView);
        Objects.requireNonNull(h10);
        B(Long.valueOf(R(webViewClient)), h10, str, aVar);
    }
}
