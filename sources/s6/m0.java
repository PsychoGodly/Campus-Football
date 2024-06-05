package s6;

import java.io.Serializable;
import r6.o;

/* compiled from: NaturalOrdering */
final class m0 extends p0<Comparable<?>> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final m0 f30214a = new m0();

    private m0() {
    }

    public <S extends Comparable<?>> p0<S> f() {
        return v0.f30270a;
    }

    /* renamed from: g */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        o.o(comparable);
        o.o(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
