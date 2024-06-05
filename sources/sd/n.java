package sd;

import java.io.Serializable;
import kotlin.jvm.internal.m;

/* compiled from: Tuples.kt */
public final class n<A, B> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final A f38126a;

    /* renamed from: b  reason: collision with root package name */
    private final B f38127b;

    public n(A a10, B b10) {
        this.f38126a = a10;
        this.f38127b = b10;
    }

    public final A a() {
        return this.f38126a;
    }

    public final B b() {
        return this.f38127b;
    }

    public final A c() {
        return this.f38126a;
    }

    public final B d() {
        return this.f38127b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return m.a(this.f38126a, nVar.f38126a) && m.a(this.f38127b, nVar.f38127b);
    }

    public int hashCode() {
        A a10 = this.f38126a;
        int i10 = 0;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f38127b;
        if (b10 != null) {
            i10 = b10.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return '(' + this.f38126a + ", " + this.f38127b + ')';
    }
}
