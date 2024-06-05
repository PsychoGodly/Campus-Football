package ue;

import java.util.Collection;
import java.util.ServiceLoader;
import pe.l0;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final Collection<l0> f38805a;

    static {
        Class<l0> cls = l0.class;
        f38805a = l.j(j.c(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }

    public static final Collection<l0> a() {
        return f38805a;
    }

    public static final void b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
