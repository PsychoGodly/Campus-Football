package androidx.webkit.internal;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import j1.l;
import j1.m;
import j1.r;

/* compiled from: ApiHelperForM */
public class c {

    /* compiled from: ApiHelperForM */
    class a extends WebMessagePort.WebMessageCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m.a f4987a;

        a(m.a aVar) {
            this.f4987a = aVar;
        }

        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f4987a.onMessage(new c0(webMessagePort), c0.h(webMessage));
        }
    }

    /* compiled from: ApiHelperForM */
    class b extends WebMessagePort.WebMessageCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m.a f4988a;

        b(m.a aVar) {
            this.f4988a = aVar;
        }

        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f4988a.onMessage(new c0(webMessagePort), c0.h(webMessage));
        }
    }

    /* renamed from: androidx.webkit.internal.c$c  reason: collision with other inner class name */
    /* compiled from: ApiHelperForM */
    class C0089c extends WebView.VisualStateCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r.a f4989a;

        C0089c(r.a aVar) {
            this.f4989a = aVar;
        }

        public void onComplete(long j10) {
            this.f4989a.onComplete(j10);
        }
    }

    public static void a(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static WebMessage b(l lVar) {
        return new WebMessage(lVar.c(), c0.g(lVar.d()));
    }

    public static WebMessagePort[] c(WebView webView) {
        return webView.createWebMessageChannel();
    }

    public static l d(WebMessage webMessage) {
        return new l(webMessage.getData(), c0.k(webMessage.getPorts()));
    }

    public static CharSequence e(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int f(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static boolean g(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    public static void h(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void i(WebView webView, long j10, r.a aVar) {
        webView.postVisualStateCallback(j10, new C0089c(aVar));
    }

    public static void j(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static void k(WebSettings webSettings, boolean z10) {
        webSettings.setOffscreenPreRaster(z10);
    }

    public static void l(WebMessagePort webMessagePort, m.a aVar) {
        webMessagePort.setWebMessageCallback(new a(aVar));
    }

    public static void m(WebMessagePort webMessagePort, m.a aVar, Handler handler) {
        webMessagePort.setWebMessageCallback(new b(aVar), handler);
    }
}
