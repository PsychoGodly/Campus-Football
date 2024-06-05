package androidx.webkit.internal;

import j1.b;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* compiled from: JavaScriptReplyProxyImpl */
public class o extends b {

    /* renamed from: a  reason: collision with root package name */
    private JsReplyProxyBoundaryInterface f5049a;

    /* compiled from: JavaScriptReplyProxyImpl */
    class a implements Callable<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JsReplyProxyBoundaryInterface f5050a;

        a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
            this.f5050a = jsReplyProxyBoundaryInterface;
        }

        public Object call() {
            return new o(this.f5050a);
        }
    }

    public o(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f5049a = jsReplyProxyBoundaryInterface;
    }

    public static o c(InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) mf.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (o) jsReplyProxyBoundaryInterface.getOrCreatePeer(new a(jsReplyProxyBoundaryInterface));
    }

    public void a(String str) {
        if (g0.V.c()) {
            this.f5049a.postMessage(str);
            return;
        }
        throw g0.a();
    }

    public void b(byte[] bArr) {
        Objects.requireNonNull(bArr, "ArrayBuffer must be non-null");
        if (g0.C.c()) {
            this.f5049a.postMessageWithPayload(mf.a.c(new b0(bArr)));
            return;
        }
        throw g0.a();
    }
}
