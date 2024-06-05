package pe;

import kotlin.jvm.internal.h;
import xd.d;

/* compiled from: CompletableDeferred.kt */
final class y<T> extends k2 implements x<T> {
    public y(c2 c2Var) {
        super(true);
        c0(c2Var);
    }

    public Object E0(d<? super T> dVar) {
        Object y10 = y(dVar);
        Object unused = d.c();
        return y10;
    }

    public boolean V() {
        return true;
    }

    public boolean l0(Throwable th) {
        return k0(new c0(th, false, 2, (h) null));
    }

    public T n() {
        return Q();
    }

    public boolean n0(T t10) {
        return k0(t10);
    }
}
