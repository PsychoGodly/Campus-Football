package s6;

import r6.o;

/* compiled from: SingletonImmutableSet */
final class z0<E> extends x<E> {

    /* renamed from: c  reason: collision with root package name */
    final transient E f30289c;

    z0(E e10) {
        this.f30289c = o.o(e10);
    }

    public u<E> b() {
        return u.z(this.f30289c);
    }

    /* access modifiers changed from: package-private */
    public int c(Object[] objArr, int i10) {
        objArr[i10] = this.f30289c;
        return i10 + 1;
    }

    public boolean contains(Object obj) {
        return this.f30289c.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return false;
    }

    public final int hashCode() {
        return this.f30289c.hashCode();
    }

    /* renamed from: m */
    public d1<E> iterator() {
        return c0.r(this.f30289c);
    }

    public int size() {
        return 1;
    }

    public String toString() {
        String obj = this.f30289c.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }
}
