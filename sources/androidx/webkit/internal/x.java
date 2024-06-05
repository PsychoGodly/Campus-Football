package androidx.webkit.internal;

import android.webkit.TracingController;
import androidx.webkit.internal.a;
import j1.j;
import j1.k;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

/* compiled from: TracingControllerImpl */
public class x extends k {

    /* renamed from: a  reason: collision with root package name */
    private TracingController f5065a;

    /* renamed from: b  reason: collision with root package name */
    private TracingControllerBoundaryInterface f5066b;

    public x() {
        a.g gVar = g0.L;
        if (gVar.b()) {
            this.f5065a = g.a();
            this.f5066b = null;
        } else if (gVar.c()) {
            this.f5065a = null;
            this.f5066b = h0.d().getTracingController();
        } else {
            throw g0.a();
        }
    }

    private TracingControllerBoundaryInterface e() {
        if (this.f5066b == null) {
            this.f5066b = h0.d().getTracingController();
        }
        return this.f5066b;
    }

    private TracingController f() {
        if (this.f5065a == null) {
            this.f5065a = g.a();
        }
        return this.f5065a;
    }

    public boolean b() {
        a.g gVar = g0.L;
        if (gVar.b()) {
            return g.d(f());
        }
        if (gVar.c()) {
            return e().isTracing();
        }
        throw g0.a();
    }

    public void c(j jVar) {
        if (jVar != null) {
            a.g gVar = g0.L;
            if (gVar.b()) {
                g.f(f(), jVar);
            } else if (gVar.c()) {
                e().start(jVar.b(), jVar.a(), jVar.c());
            } else {
                throw g0.a();
            }
        } else {
            throw new IllegalArgumentException("Tracing config must be non null");
        }
    }

    public boolean d(OutputStream outputStream, Executor executor) {
        a.g gVar = g0.L;
        if (gVar.b()) {
            return g.g(f(), outputStream, executor);
        }
        if (gVar.c()) {
            return e().stop(outputStream, executor);
        }
        throw g0.a();
    }
}
