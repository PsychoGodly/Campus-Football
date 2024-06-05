package j1;

import androidx.webkit.internal.q;
import java.util.concurrent.Executor;

/* compiled from: ProxyController */
public abstract class d {

    /* compiled from: ProxyController */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final d f19202a = new q();
    }

    public static d b() {
        if (s.a("PROXY_OVERRIDE")) {
            return a.f19202a;
        }
        throw new UnsupportedOperationException("Proxy override not supported");
    }

    public abstract void a(Executor executor, Runnable runnable);

    public abstract void c(c cVar, Executor executor, Runnable runnable);
}
