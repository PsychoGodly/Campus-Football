package g7;

import g7.c;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: ImmutableSortedSet */
public class e<T> implements Iterable<T> {

    /* renamed from: a  reason: collision with root package name */
    private final c<T, Void> f28908a;

    /* compiled from: ImmutableSortedSet */
    private static class a<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        final Iterator<Map.Entry<T, Void>> f28909a;

        public a(Iterator<Map.Entry<T, Void>> it) {
            this.f28909a = it;
        }

        public boolean hasNext() {
            return this.f28909a.hasNext();
        }

        public T next() {
            return this.f28909a.next().getKey();
        }

        public void remove() {
            this.f28909a.remove();
        }
    }

    public e(List<T> list, Comparator<T> comparator) {
        this.f28908a = c.a.b(list, Collections.emptyMap(), c.a.d(), comparator);
    }

    public T b() {
        return this.f28908a.f();
    }

    public T c() {
        return this.f28908a.g();
    }

    public boolean contains(T t10) {
        return this.f28908a.b(t10);
    }

    public e<T> e(T t10) {
        return new e<>(this.f28908a.h(t10, null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f28908a.equals(((e) obj).f28908a);
    }

    public Iterator<T> f(T t10) {
        return new a(this.f28908a.m(t10));
    }

    public e<T> g(T t10) {
        c<T, Void> n10 = this.f28908a.n(t10);
        return n10 == this.f28908a ? this : new e<>(n10);
    }

    public e<T> h(e<T> eVar) {
        e<T> eVar2;
        e<T> eVar3;
        if (size() < eVar.size()) {
            eVar3 = eVar;
            eVar2 = this;
        } else {
            eVar3 = this;
            eVar2 = eVar;
        }
        Iterator it = eVar2.iterator();
        while (it.hasNext()) {
            eVar3 = eVar3.e(it.next());
        }
        return eVar3;
    }

    public int hashCode() {
        return this.f28908a.hashCode();
    }

    public int indexOf(T t10) {
        return this.f28908a.indexOf(t10);
    }

    public boolean isEmpty() {
        return this.f28908a.isEmpty();
    }

    public Iterator<T> iterator() {
        return new a(this.f28908a.iterator());
    }

    public int size() {
        return this.f28908a.size();
    }

    private e(c<T, Void> cVar) {
        this.f28908a = cVar;
    }
}
