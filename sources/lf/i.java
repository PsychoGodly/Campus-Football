package lf;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: ForwardingTimeout */
public class i extends t {

    /* renamed from: e  reason: collision with root package name */
    private t f36261e;

    public i(t tVar) {
        if (tVar != null) {
            this.f36261e = tVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public t a() {
        return this.f36261e.a();
    }

    public t b() {
        return this.f36261e.b();
    }

    public long c() {
        return this.f36261e.c();
    }

    public t d(long j10) {
        return this.f36261e.d(j10);
    }

    public boolean e() {
        return this.f36261e.e();
    }

    public void f() throws IOException {
        this.f36261e.f();
    }

    public t g(long j10, TimeUnit timeUnit) {
        return this.f36261e.g(j10, timeUnit);
    }

    public final t i() {
        return this.f36261e;
    }

    public final i j(t tVar) {
        if (tVar != null) {
            this.f36261e = tVar;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
