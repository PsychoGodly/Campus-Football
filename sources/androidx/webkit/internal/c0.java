package androidx.webkit.internal;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.webkit.internal.a;
import j1.l;
import j1.m;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import mf.a;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* compiled from: WebMessagePortImpl */
public class c0 extends m {

    /* renamed from: a  reason: collision with root package name */
    private WebMessagePort f4990a;

    /* renamed from: b  reason: collision with root package name */
    private WebMessagePortBoundaryInterface f4991b;

    public c0(WebMessagePort webMessagePort) {
        this.f4990a = webMessagePort;
    }

    public static WebMessage f(l lVar) {
        return c.b(lVar);
    }

    public static WebMessagePort[] g(m[] mVarArr) {
        if (mVarArr == null) {
            return null;
        }
        int length = mVarArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i10 = 0; i10 < length; i10++) {
            webMessagePortArr[i10] = mVarArr[i10].b();
        }
        return webMessagePortArr;
    }

    public static l h(WebMessage webMessage) {
        return c.d(webMessage);
    }

    private WebMessagePortBoundaryInterface i() {
        if (this.f4991b == null) {
            this.f4991b = (WebMessagePortBoundaryInterface) a.a(WebMessagePortBoundaryInterface.class, h0.c().h(this.f4990a));
        }
        return this.f4991b;
    }

    private WebMessagePort j() {
        if (this.f4990a == null) {
            this.f4990a = h0.c().g(Proxy.getInvocationHandler(this.f4991b));
        }
        return this.f4990a;
    }

    public static m[] k(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        m[] mVarArr = new m[webMessagePortArr.length];
        for (int i10 = 0; i10 < webMessagePortArr.length; i10++) {
            mVarArr[i10] = new c0(webMessagePortArr[i10]);
        }
        return mVarArr;
    }

    public void a() {
        a.b bVar = g0.B;
        if (bVar.b()) {
            c.a(j());
        } else if (bVar.c()) {
            i().close();
        } else {
            throw g0.a();
        }
    }

    public WebMessagePort b() {
        return j();
    }

    public InvocationHandler c() {
        return Proxy.getInvocationHandler(i());
    }

    public void d(l lVar) {
        a.b bVar = g0.A;
        if (bVar.b() && lVar.e() == 0) {
            c.h(j(), f(lVar));
        } else if (!bVar.c() || !y.a(lVar.e())) {
            throw g0.a();
        } else {
            i().postMessage(mf.a.c(new y(lVar)));
        }
    }

    public void e(m.a aVar) {
        a.b bVar = g0.D;
        if (bVar.c()) {
            i().setWebMessageCallback(mf.a.c(new z(aVar)));
        } else if (bVar.b()) {
            c.l(j(), aVar);
        } else {
            throw g0.a();
        }
    }

    public c0(InvocationHandler invocationHandler) {
        this.f4991b = (WebMessagePortBoundaryInterface) mf.a.a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }
}
