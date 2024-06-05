package ue;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.m;
import pe.t0;
import ue.s0;

/* compiled from: ThreadSafeHeap.kt */
public class r0<T extends s0 & Comparable<? super T>> {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f38839b = AtomicIntegerFieldUpdater.newUpdater(r0.class, "_size");
    private volatile int _size;

    /* renamed from: a  reason: collision with root package name */
    private T[] f38840a;

    private final T[] f() {
        T[] tArr = this.f38840a;
        if (tArr == null) {
            T[] tArr2 = new s0[4];
            this.f38840a = tArr2;
            return tArr2;
        } else if (c() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, c() * 2);
            m.d(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (s0[]) copyOf;
            this.f38840a = tArr3;
            return tArr3;
        }
    }

    private final void j(int i10) {
        f38839b.set(this, i10);
    }

    private final void k(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 < c()) {
                T[] tArr = this.f38840a;
                m.b(tArr);
                int i12 = i11 + 1;
                if (i12 < c()) {
                    T t10 = tArr[i12];
                    m.b(t10);
                    T t11 = tArr[i11];
                    m.b(t11);
                    if (((Comparable) t10).compareTo(t11) < 0) {
                        i11 = i12;
                    }
                }
                T t12 = tArr[i10];
                m.b(t12);
                T t13 = tArr[i11];
                m.b(t13);
                if (((Comparable) t12).compareTo(t13) > 0) {
                    m(i10, i11);
                    i10 = i11;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final void l(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f38840a;
            m.b(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            m.b(t10);
            T t11 = tArr[i10];
            m.b(t11);
            if (((Comparable) t10).compareTo(t11) > 0) {
                m(i10, i11);
                i10 = i11;
            } else {
                return;
            }
        }
    }

    private final void m(int i10, int i11) {
        T[] tArr = this.f38840a;
        m.b(tArr);
        T t10 = tArr[i11];
        m.b(t10);
        T t11 = tArr[i10];
        m.b(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.e(i10);
        t11.e(i11);
    }

    public final void a(T t10) {
        if (t0.a()) {
            if (!(t10.c() == null)) {
                throw new AssertionError();
            }
        }
        t10.d(this);
        s0[] f10 = f();
        int c10 = c();
        j(c10 + 1);
        f10[c10] = t10;
        t10.e(c10);
        l(c10);
    }

    public final T b() {
        T[] tArr = this.f38840a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return f38839b.get(this);
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T b10;
        synchronized (this) {
            b10 = b();
        }
        return b10;
    }

    public final boolean g(T t10) {
        boolean z10;
        synchronized (this) {
            z10 = true;
            boolean z11 = false;
            if (t10.c() == null) {
                z10 = false;
            } else {
                int f10 = t10.f();
                if (t0.a()) {
                    if (f10 >= 0) {
                        z11 = true;
                    }
                    if (!z11) {
                        throw new AssertionError();
                    }
                }
                h(f10);
            }
        }
        return z10;
    }

    public final T h(int i10) {
        boolean z10 = false;
        if (t0.a()) {
            if (!(c() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f38840a;
        m.b(tArr);
        j(c() - 1);
        if (i10 < c()) {
            m(i10, c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                m.b(t10);
                T t11 = tArr[i11];
                m.b(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    m(i10, i11);
                    l(i11);
                }
            }
            k(i10);
        }
        T t12 = tArr[c()];
        m.b(t12);
        if (t0.a()) {
            if (t12.c() == this) {
                z10 = true;
            }
            if (!z10) {
                throw new AssertionError();
            }
        }
        t12.d((r0<?>) null);
        t12.e(-1);
        tArr[c()] = null;
        return t12;
    }

    public final T i() {
        T h10;
        synchronized (this) {
            h10 = c() > 0 ? h(0) : null;
        }
        return h10;
    }
}
