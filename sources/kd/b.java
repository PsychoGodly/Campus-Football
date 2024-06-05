package kd;

import dd.c;
import dd.d;
import java.util.concurrent.Executor;
import kd.b;
import r6.o;

/* compiled from: AbstractStub */
public abstract class b<S extends b<S>> {

    /* renamed from: a  reason: collision with root package name */
    private final d f35996a;

    /* renamed from: b  reason: collision with root package name */
    private final c f35997b;

    /* compiled from: AbstractStub */
    public interface a<T extends b<T>> {
        T a(d dVar, c cVar);
    }

    protected b(d dVar, c cVar) {
        this.f35996a = (d) o.p(dVar, "channel");
        this.f35997b = (c) o.p(cVar, "callOptions");
    }

    /* access modifiers changed from: protected */
    public abstract S a(d dVar, c cVar);

    public final c b() {
        return this.f35997b;
    }

    public final S c(dd.b bVar) {
        return a(this.f35996a, this.f35997b.l(bVar));
    }

    public final S d(Executor executor) {
        return a(this.f35996a, this.f35997b.n(executor));
    }
}
