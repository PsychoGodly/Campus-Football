package androidx.webkit.internal;

import j1.f;
import java.lang.reflect.InvocationHandler;
import mf.a;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* compiled from: ScriptHandlerImpl */
public class s extends f {

    /* renamed from: a  reason: collision with root package name */
    private ScriptHandlerBoundaryInterface f5055a;

    private s(ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.f5055a = scriptHandlerBoundaryInterface;
    }

    public static s b(InvocationHandler invocationHandler) {
        return new s((ScriptHandlerBoundaryInterface) a.a(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }

    public void a() {
        this.f5055a.remove();
    }
}
