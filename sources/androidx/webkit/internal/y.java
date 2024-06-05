package androidx.webkit.internal;

import j1.l;
import j1.m;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import mf.a;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* compiled from: WebMessageAdapter */
public class y implements WebMessageBoundaryInterface {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f5067b = {"WEB_MESSAGE_ARRAY_BUFFER"};

    /* renamed from: a  reason: collision with root package name */
    private l f5068a;

    public y(l lVar) {
        this.f5068a = lVar;
    }

    public static boolean a(int i10) {
        if (i10 == 0) {
            return true;
        }
        if (i10 != 1 || !g0.C.c()) {
            return false;
        }
        return true;
    }

    private static m[] b(InvocationHandler[] invocationHandlerArr) {
        m[] mVarArr = new m[invocationHandlerArr.length];
        for (int i10 = 0; i10 < invocationHandlerArr.length; i10++) {
            mVarArr[i10] = new c0(invocationHandlerArr[i10]);
        }
        return mVarArr;
    }

    public static l c(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        m[] b10 = b(webMessageBoundaryInterface.getPorts());
        if (!g0.C.c()) {
            return new l(webMessageBoundaryInterface.getData(), b10);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) a.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new l(webMessagePayloadBoundaryInterface.getAsString(), b10);
        }
        if (type != 1) {
            return null;
        }
        return new l(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), b10);
    }

    @Deprecated
    public String getData() {
        return this.f5068a.c();
    }

    public InvocationHandler getMessagePayload() {
        b0 b0Var;
        int e10 = this.f5068a.e();
        if (e10 == 0) {
            b0Var = new b0(this.f5068a.c());
        } else if (e10 == 1) {
            byte[] b10 = this.f5068a.b();
            Objects.requireNonNull(b10);
            b0Var = new b0(b10);
        } else {
            throw new IllegalStateException("Unknown web message payload type: " + this.f5068a.e());
        }
        return a.c(b0Var);
    }

    public InvocationHandler[] getPorts() {
        m[] d10 = this.f5068a.d();
        if (d10 == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[d10.length];
        for (int i10 = 0; i10 < d10.length; i10++) {
            invocationHandlerArr[i10] = d10[i10].c();
        }
        return invocationHandlerArr;
    }

    public String[] getSupportedFeatures() {
        return f5067b;
    }
}
