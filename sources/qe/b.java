package qe;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import pe.l0;
import xd.a;
import xd.g;

/* compiled from: AndroidExceptionPreHandler.kt */
public final class b extends a implements l0 {
    private volatile Object _preHandler = this;

    public b() {
        super(l0.A1);
    }

    private final Method X0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        boolean z10 = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z10 = true;
            }
            if (z10) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    public void handleException(g gVar, Throwable th) {
        int i10 = Build.VERSION.SDK_INT;
        if (26 <= i10 && i10 < 28) {
            Method X0 = X0();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            Object invoke = X0 != null ? X0.invoke((Object) null, new Object[0]) : null;
            if (invoke instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) invoke;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
