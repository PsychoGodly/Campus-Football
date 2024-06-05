package de;

/* compiled from: AutoCloseableJVM.kt */
public final class a {
    public static final void a(AutoCloseable autoCloseable, Throwable th) {
        if (autoCloseable == null) {
            return;
        }
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            b.a(th, th2);
        }
    }
}
