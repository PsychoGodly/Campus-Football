package s6;

import java.io.Serializable;
import r6.o;

/* compiled from: ReverseNaturalOrdering */
final class v0 extends p0<Comparable<?>> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final v0 f30270a = new v0();

    private v0() {
    }

    public <S extends Comparable<?>> p0<S> f() {
        return p0.c();
    }

    /* renamed from: g */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        o.o(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
