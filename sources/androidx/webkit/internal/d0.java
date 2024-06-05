package androidx.webkit.internal;

import android.webkit.WebResourceError;
import androidx.webkit.internal.a;
import j1.n;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import mf.a;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* compiled from: WebResourceErrorImpl */
public class d0 extends n {

    /* renamed from: a  reason: collision with root package name */
    private WebResourceError f4992a;

    /* renamed from: b  reason: collision with root package name */
    private WebResourceErrorBoundaryInterface f4993b;

    public d0(InvocationHandler invocationHandler) {
        this.f4993b = (WebResourceErrorBoundaryInterface) a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    private WebResourceErrorBoundaryInterface c() {
        if (this.f4993b == null) {
            this.f4993b = (WebResourceErrorBoundaryInterface) a.a(WebResourceErrorBoundaryInterface.class, h0.c().j(this.f4992a));
        }
        return this.f4993b;
    }

    private WebResourceError d() {
        if (this.f4992a == null) {
            this.f4992a = h0.c().i(Proxy.getInvocationHandler(this.f4993b));
        }
        return this.f4992a;
    }

    public CharSequence a() {
        a.b bVar = g0.f5019v;
        if (bVar.b()) {
            return c.e(d());
        }
        if (bVar.c()) {
            return c().getDescription();
        }
        throw g0.a();
    }

    public int b() {
        a.b bVar = g0.f5020w;
        if (bVar.b()) {
            return c.f(d());
        }
        if (bVar.c()) {
            return c().getErrorCode();
        }
        throw g0.a();
    }

    public d0(WebResourceError webResourceError) {
        this.f4992a = webResourceError;
    }
}
