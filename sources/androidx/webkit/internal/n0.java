package androidx.webkit.internal;

import android.webkit.WebViewRenderProcess;
import androidx.webkit.internal.a;
import j1.t;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* compiled from: WebViewRenderProcessImpl */
public class n0 extends t {

    /* renamed from: c  reason: collision with root package name */
    private static final WeakHashMap<WebViewRenderProcess, n0> f5045c = new WeakHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private WebViewRendererBoundaryInterface f5046a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<WebViewRenderProcess> f5047b;

    /* compiled from: WebViewRenderProcessImpl */
    class a implements Callable<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WebViewRendererBoundaryInterface f5048a;

        a(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
            this.f5048a = webViewRendererBoundaryInterface;
        }

        public Object call() {
            return new n0(this.f5048a);
        }
    }

    public n0(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.f5046a = webViewRendererBoundaryInterface;
    }

    public static n0 b(WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap<WebViewRenderProcess, n0> weakHashMap = f5045c;
        n0 n0Var = weakHashMap.get(webViewRenderProcess);
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0Var2 = new n0(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, n0Var2);
        return n0Var2;
    }

    public static n0 c(InvocationHandler invocationHandler) {
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) mf.a.a(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (n0) webViewRendererBoundaryInterface.getOrCreatePeer(new a(webViewRendererBoundaryInterface));
    }

    public boolean a() {
        a.h hVar = g0.K;
        if (hVar.b()) {
            WebViewRenderProcess webViewRenderProcess = (WebViewRenderProcess) this.f5047b.get();
            return webViewRenderProcess != null && h.g(webViewRenderProcess);
        } else if (hVar.c()) {
            return this.f5046a.terminate();
        } else {
            throw g0.a();
        }
    }

    public n0(WebViewRenderProcess webViewRenderProcess) {
        this.f5047b = new WeakReference<>(webViewRenderProcess);
    }
}
