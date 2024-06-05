package td;

import ge.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: Collections.kt */
public final class a0 implements List, Serializable, RandomAccess, a {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f38597a = new a0();

    private a0() {
    }

    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection collection) {
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

    /* renamed from: e */
    public Void get(int i10) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i10 + '.');
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public int f() {
        return 0;
    }

    public int g(Void voidR) {
        m.e(voidR, "element");
        return -1;
    }

    public int h(Void voidR) {
        m.e(voidR, "element");
        return -1;
    }

    public int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return g((Void) obj);
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return z.f38642a;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return h((Void) obj);
    }

    public ListIterator listIterator() {
        return z.f38642a;
    }

    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return f();
    }

    public List subList(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11);
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

    public ListIterator listIterator(int i10) {
        if (i10 == 0) {
            return z.f38642a;
        }
        throw new IndexOutOfBoundsException("Index: " + i10);
    }
}
