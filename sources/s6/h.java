package s6;

import java.io.Serializable;
import r6.g;
import r6.k;
import r6.o;

/* compiled from: ByFunctionOrdering */
final class h<F, T> extends p0<F> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final g<F, ? extends T> f30181a;

    /* renamed from: b  reason: collision with root package name */
    final p0<T> f30182b;

    h(g<F, ? extends T> gVar, p0<T> p0Var) {
        this.f30181a = (g) o.o(gVar);
        this.f30182b = (p0) o.o(p0Var);
    }

    public int compare(F f10, F f11) {
        return this.f30182b.compare(this.f30181a.apply(f10), this.f30181a.apply(f11));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f30181a.equals(hVar.f30181a) || !this.f30182b.equals(hVar.f30182b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return k.b(this.f30181a, this.f30182b);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f30182b);
        String valueOf2 = String.valueOf(this.f30181a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append(".onResultOf(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
