package l;

import java.util.concurrent.Executor;

/* compiled from: ArchTaskExecutor */
public class c extends e {

    /* renamed from: c  reason: collision with root package name */
    private static volatile c f19829c;

    /* renamed from: d  reason: collision with root package name */
    private static final Executor f19830d = b.f36057a;

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f19831e = a.f36056a;

    /* renamed from: a  reason: collision with root package name */
    private e f19832a;

    /* renamed from: b  reason: collision with root package name */
    private final e f19833b;

    private c() {
        d dVar = new d();
        this.f19833b = dVar;
        this.f19832a = dVar;
    }

    public static Executor f() {
        return f19831e;
    }

    public static c g() {
        if (f19829c != null) {
            return f19829c;
        }
        synchronized (c.class) {
            if (f19829c == null) {
                f19829c = new c();
            }
        }
        return f19829c;
    }

    public void a(Runnable runnable) {
        this.f19832a.a(runnable);
    }

    public boolean b() {
        return this.f19832a.b();
    }

    public void c(Runnable runnable) {
        this.f19832a.c(runnable);
    }
}
