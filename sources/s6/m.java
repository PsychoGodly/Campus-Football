package s6;

import java.io.Serializable;
import java.util.Comparator;
import r6.o;

/* compiled from: ComparatorOrdering */
final class m<T> extends p0<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final Comparator<T> f30213a;

    m(Comparator<T> comparator) {
        this.f30213a = (Comparator) o.o(comparator);
    }

    public int compare(T t10, T t11) {
        return this.f30213a.compare(t10, t11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return this.f30213a.equals(((m) obj).f30213a);
        }
        return false;
    }

    public int hashCode() {
        return this.f30213a.hashCode();
    }

    public String toString() {
        return this.f30213a.toString();
    }
}
