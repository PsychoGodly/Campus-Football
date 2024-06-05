package td;

import ge.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: Sets.kt */
public final class c0 implements Set, Serializable, a {

    /* renamed from: a  reason: collision with root package name */
    public static final c0 f38609a = new c0();

    private c0() {
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(Void voidR) {
        m.e(voidR, "element");
        return false;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return b((Void) obj);
    }

    public boolean containsAll(Collection collection) {
        m.e(collection, "elements");
        return collection.isEmpty();
    }

    public int e() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return z.f38642a;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return e();
    }

    public Object[] toArray() {
        return g.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        m.e(tArr, "array");
        return g.b(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}
