package s6;

import java.util.Objects;
import r6.o;

/* compiled from: RegularImmutableList */
class r0<E> extends u<E> {

    /* renamed from: f  reason: collision with root package name */
    static final u<Object> f30220f = new r0(new Object[0], 0);

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f30221c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f30222d;

    r0(Object[] objArr, int i10) {
        this.f30221c = objArr;
        this.f30222d = i10;
    }

    /* access modifiers changed from: package-private */
    public int c(Object[] objArr, int i10) {
        System.arraycopy(this.f30221c, 0, objArr, i10, this.f30222d);
        return i10 + this.f30222d;
    }

    /* access modifiers changed from: package-private */
    public Object[] e() {
        return this.f30221c;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f30222d;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return 0;
    }

    public E get(int i10) {
        o.m(i10, this.f30222d);
        E e10 = this.f30221c[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return false;
    }

    public int size() {
        return this.f30222d;
    }
}
