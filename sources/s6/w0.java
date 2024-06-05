package s6;

import java.io.Serializable;
import r6.o;

/* compiled from: ReverseOrdering */
final class w0<T> extends p0<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final p0<? super T> f30280a;

    w0(p0<? super T> p0Var) {
        this.f30280a = (p0) o.o(p0Var);
    }

    public int compare(T t10, T t11) {
        return this.f30280a.compare(t11, t10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w0) {
            return this.f30280a.equals(((w0) obj).f30280a);
        }
        return false;
    }

    public <S extends T> p0<S> f() {
        return this.f30280a;
    }

    public int hashCode() {
        return -this.f30280a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f30280a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 10);
        sb2.append(valueOf);
        sb2.append(".reverse()");
        return sb2.toString();
    }
}
