package td;

import kotlin.jvm.internal.m;

/* compiled from: IndexedValue.kt */
public final class d0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f38610a;

    /* renamed from: b  reason: collision with root package name */
    private final T f38611b;

    public d0(int i10, T t10) {
        this.f38610a = i10;
        this.f38611b = t10;
    }

    public final int a() {
        return this.f38610a;
    }

    public final T b() {
        return this.f38611b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f38610a == d0Var.f38610a && m.a(this.f38611b, d0Var.f38611b);
    }

    public int hashCode() {
        int i10 = this.f38610a * 31;
        T t10 = this.f38611b;
        return i10 + (t10 == null ? 0 : t10.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f38610a + ", value=" + this.f38611b + ')';
    }
}
