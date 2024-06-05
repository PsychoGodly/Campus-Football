package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.embedding.android.k;
import io.flutter.plugin.platform.e;
import io.flutter.plugin.platform.f;
import io.flutter.plugins.webviewflutter.n;
import io.flutter.plugins.webviewflutter.v4;
import java.util.Map;
import java.util.Objects;
import lc.c;

/* compiled from: WebViewHostApiImpl */
public class w6 implements n.k0 {

    /* renamed from: a  reason: collision with root package name */
    private final d4 f34472a;

    /* renamed from: b  reason: collision with root package name */
    private final b f34473b;

    /* renamed from: c  reason: collision with root package name */
    private final c f34474c;

    /* renamed from: d  reason: collision with root package name */
    private Context f34475d;

    /* compiled from: WebViewHostApiImpl */
    public static class a extends WebView implements f {

        /* renamed from: a  reason: collision with root package name */
        private o6 f34476a;

        /* renamed from: b  reason: collision with root package name */
        private WebViewClient f34477b;

        /* renamed from: c  reason: collision with root package name */
        private v4.a f34478c;

        /* renamed from: d  reason: collision with root package name */
        private final C0392a f34479d;

        /* renamed from: io.flutter.plugins.webviewflutter.w6$a$a  reason: collision with other inner class name */
        /* compiled from: WebViewHostApiImpl */
        interface C0392a {
            boolean a(int i10);
        }

        public a(Context context, c cVar, d4 d4Var) {
            this(context, cVar, d4Var, v6.f34465a);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ boolean c(int i10) {
            return Build.VERSION.SDK_INT >= i10;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void d(Void voidR) {
        }

        private k e() {
            ViewParent viewParent = this;
            while (viewParent.getParent() != null) {
                viewParent = viewParent.getParent();
                if (viewParent instanceof k) {
                    return (k) viewParent;
                }
            }
            return null;
        }

        public void dispose() {
        }

        public View getView() {
            return this;
        }

        public WebChromeClient getWebChromeClient() {
            return this.f34478c;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            k e10;
            super.onAttachedToWindow();
            if (this.f34479d.a(26) && (e10 = e()) != null) {
                e10.setImportantForAutofill(1);
            }
        }

        public /* synthetic */ void onFlutterViewAttached(View view) {
            e.a(this, view);
        }

        public /* synthetic */ void onFlutterViewDetached() {
            e.b(this);
        }

        public /* synthetic */ void onInputConnectionLocked() {
            e.c(this);
        }

        public /* synthetic */ void onInputConnectionUnlocked() {
            e.d(this);
        }

        /* access modifiers changed from: protected */
        public void onScrollChanged(int i10, int i11, int i12, int i13) {
            super.onScrollChanged(i10, i11, i12, i13);
            this.f34476a.b(this, Long.valueOf((long) i10), Long.valueOf((long) i11), Long.valueOf((long) i12), Long.valueOf((long) i13), u6.f34447a);
        }

        /* access modifiers changed from: package-private */
        public void setApi(o6 o6Var) {
            this.f34476a = o6Var;
        }

        public void setWebChromeClient(WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            if (webChromeClient instanceof v4.a) {
                v4.a aVar = (v4.a) webChromeClient;
                this.f34478c = aVar;
                aVar.b(this.f34477b);
                return;
            }
            throw new AssertionError("Client must be a SecureWebChromeClient.");
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.f34477b = webViewClient;
            this.f34478c.b(webViewClient);
        }

        a(Context context, c cVar, d4 d4Var, C0392a aVar) {
            super(context);
            this.f34477b = new WebViewClient();
            this.f34478c = new v4.a();
            this.f34476a = new o6(cVar, d4Var);
            this.f34479d = aVar;
            setWebViewClient(this.f34477b);
            setWebChromeClient(this.f34478c);
        }
    }

    /* compiled from: WebViewHostApiImpl */
    public static class b {
        public a a(Context context, c cVar, d4 d4Var) {
            return new a(context, cVar, d4Var);
        }

        public void b(boolean z10) {
            WebView.setWebContentsDebuggingEnabled(z10);
        }
    }

    public w6(d4 d4Var, c cVar, b bVar, Context context) {
        this.f34472a = d4Var;
        this.f34474c = cVar;
        this.f34473b = bVar;
        this.f34475d = context;
    }

    public void A(Context context) {
        this.f34475d = context;
    }

    public void a(Long l10) {
        f fVar = new f();
        DisplayManager displayManager = (DisplayManager) this.f34475d.getSystemService("display");
        fVar.b(displayManager);
        a a10 = this.f34473b.a(this.f34475d, this.f34474c, this.f34472a);
        fVar.a(displayManager);
        this.f34472a.b(a10, l10.longValue());
    }

    public Long b(Long l10) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        return Long.valueOf((long) webView.getScrollX());
    }

    public void c(Long l10, String str, String str2, String str3) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.loadData(str, str2, str3);
    }

    public void d(Long l10, Long l11) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        h4 h4Var = (h4) this.f34472a.i(l11.longValue());
        Objects.requireNonNull(h4Var);
        webView.addJavascriptInterface(h4Var, h4Var.f34265b);
    }

    public void e(Boolean bool) {
        this.f34473b.b(bool.booleanValue());
    }

    public void f(Long l10, Long l11) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        d4 d4Var = this.f34472a;
        Objects.requireNonNull(l11);
        webView.setWebChromeClient((WebChromeClient) d4Var.i(l11.longValue()));
    }

    public void g(Long l10) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.goForward();
    }

    public void h(Long l10, String str, Map<String, String> map) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.loadUrl(str, map);
    }

    public void i(Long l10, Boolean bool) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.clearCache(bool.booleanValue());
    }

    public void j(Long l10, String str, n.w<String> wVar) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        Objects.requireNonNull(wVar);
        webView.evaluateJavascript(str, new t6(wVar));
    }

    public void k(Long l10, Long l11, Long l12) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.scrollTo(l11.intValue(), l12.intValue());
    }

    public void l(Long l10, Long l11) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        h4 h4Var = (h4) this.f34472a.i(l11.longValue());
        Objects.requireNonNull(h4Var);
        webView.removeJavascriptInterface(h4Var.f34265b);
    }

    public Long m(Long l10) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        return Long.valueOf((long) webView.getScrollY());
    }

    public n.m0 n(Long l10) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        return new n.m0.a().b(Long.valueOf((long) webView.getScrollX())).c(Long.valueOf((long) webView.getScrollY())).a();
    }

    public String o(Long l10) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        return webView.getTitle();
    }

    public void p(Long l10) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.reload();
    }

    public Boolean q(Long l10) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        return Boolean.valueOf(webView.canGoForward());
    }

    public void r(Long l10, String str, String str2, String str3, String str4, String str5) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void s(Long l10) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.goBack();
    }

    public void t(Long l10, Long l11) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.setBackgroundColor(l11.intValue());
    }

    public void u(Long l10, Long l11) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        d4 d4Var = this.f34472a;
        Objects.requireNonNull(l11);
        webView.setDownloadListener((DownloadListener) d4Var.i(l11.longValue()));
    }

    public Boolean v(Long l10) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        return Boolean.valueOf(webView.canGoBack());
    }

    public String w(Long l10) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        return webView.getUrl();
    }

    public void x(Long l10, String str, byte[] bArr) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.postUrl(str, bArr);
    }

    public void y(Long l10, Long l11, Long l12) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.scrollBy(l11.intValue(), l12.intValue());
    }

    public void z(Long l10, Long l11) {
        WebView webView = (WebView) this.f34472a.i(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.setWebViewClient((WebViewClient) this.f34472a.i(l11.longValue()));
    }
}
