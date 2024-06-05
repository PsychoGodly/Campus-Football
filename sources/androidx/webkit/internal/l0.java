package androidx.webkit.internal;

import android.webkit.WebView;
import j1.t;
import j1.u;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;

/* compiled from: WebViewRenderProcessClientAdapter */
public class l0 implements WebViewRendererClientBoundaryInterface {

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f5031c = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

    /* renamed from: a  reason: collision with root package name */
    private final Executor f5032a;

    /* renamed from: b  reason: collision with root package name */
    private final u f5033b;

    /* compiled from: WebViewRenderProcessClientAdapter */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f5034a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WebView f5035b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t f5036c;

        a(u uVar, WebView webView, t tVar) {
            this.f5034a = uVar;
            this.f5035b = webView;
            this.f5036c = tVar;
        }

        public void run() {
            this.f5034a.onRenderProcessUnresponsive(this.f5035b, this.f5036c);
        }
    }

    /* compiled from: WebViewRenderProcessClientAdapter */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f5038a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WebView f5039b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t f5040c;

        b(u uVar, WebView webView, t tVar) {
            this.f5038a = uVar;
            this.f5039b = webView;
            this.f5040c = tVar;
        }

        public void run() {
            this.f5038a.onRenderProcessResponsive(this.f5039b, this.f5040c);
        }
    }

    public l0(Executor executor, u uVar) {
        this.f5032a = executor;
        this.f5033b = uVar;
    }

    public final String[] getSupportedFeatures() {
        return f5031c;
    }

    public final void onRendererResponsive(WebView webView, InvocationHandler invocationHandler) {
        n0 c10 = n0.c(invocationHandler);
        u uVar = this.f5033b;
        Executor executor = this.f5032a;
        if (executor == null) {
            uVar.onRenderProcessResponsive(webView, c10);
        } else {
            executor.execute(new b(uVar, webView, c10));
        }
    }

    public final void onRendererUnresponsive(WebView webView, InvocationHandler invocationHandler) {
        n0 c10 = n0.c(invocationHandler);
        u uVar = this.f5033b;
        Executor executor = this.f5032a;
        if (executor == null) {
            uVar.onRenderProcessUnresponsive(webView, c10);
        } else {
            executor.execute(new a(uVar, webView, c10));
        }
    }
}
