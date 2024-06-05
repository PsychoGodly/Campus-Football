package kd;

import dd.c;
import dd.d;
import kd.a;
import kd.b;
import kd.c;

/* compiled from: AbstractAsyncStub */
public abstract class a<S extends a<S>> extends b<S> {
    protected a(d dVar, c cVar) {
        super(dVar, cVar);
    }

    public static <T extends b<T>> T e(b.a<T> aVar, d dVar) {
        return f(aVar, dVar, c.f32144k);
    }

    public static <T extends b<T>> T f(b.a<T> aVar, d dVar, c cVar) {
        return aVar.a(dVar, cVar.q(c.f36000c, c.a.ASYNC));
    }
}
