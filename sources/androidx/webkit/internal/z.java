package androidx.webkit.internal;

import j1.l;
import j1.m;
import java.lang.reflect.InvocationHandler;
import mf.a;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;

/* compiled from: WebMessageCallbackAdapter */
public class z implements WebMessageCallbackBoundaryInterface {

    /* renamed from: a  reason: collision with root package name */
    private final m.a f5069a;

    public z(m.a aVar) {
        this.f5069a = aVar;
    }

    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
    }

    public void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
        l c10 = y.c((WebMessageBoundaryInterface) a.a(WebMessageBoundaryInterface.class, invocationHandler2));
        if (c10 != null) {
            this.f5069a.onMessage(new c0(invocationHandler), c10);
        }
    }
}
