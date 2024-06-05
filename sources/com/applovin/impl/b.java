package com.applovin.impl;

import android.util.Pair;
import com.applovin.impl.go;

public abstract class b extends go {

    /* renamed from: c  reason: collision with root package name */
    private final int f6589c;

    /* renamed from: d  reason: collision with root package name */
    private final tj f6590d;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f6591f;

    public b(boolean z10, tj tjVar) {
        this.f6591f = z10;
        this.f6590d = tjVar;
        this.f6589c = tjVar.a();
    }

    public static Object a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public static Object c(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object d(Object obj) {
        return ((Pair) obj).first;
    }

    /* access modifiers changed from: protected */
    public abstract int b(Object obj);

    public int b(boolean z10) {
        int i10 = this.f6589c;
        if (i10 == 0) {
            return -1;
        }
        if (this.f6591f) {
            z10 = false;
        }
        int c10 = z10 ? this.f6590d.c() : i10 - 1;
        while (i(c10).c()) {
            c10 = b(c10, z10);
            if (c10 == -1) {
                return -1;
            }
        }
        return h(c10) + i(c10).b(z10);
    }

    /* access modifiers changed from: protected */
    public abstract int d(int i10);

    /* access modifiers changed from: protected */
    public abstract int e(int i10);

    /* access modifiers changed from: protected */
    public abstract Object f(int i10);

    /* access modifiers changed from: protected */
    public abstract int g(int i10);

    /* access modifiers changed from: protected */
    public abstract int h(int i10);

    /* access modifiers changed from: protected */
    public abstract go i(int i10);

    public int a(boolean z10) {
        if (this.f6589c == 0) {
            return -1;
        }
        int i10 = 0;
        if (this.f6591f) {
            z10 = false;
        }
        if (z10) {
            i10 = this.f6590d.b();
        }
        while (i(i10).c()) {
            i10 = a(i10, z10);
            if (i10 == -1) {
                return -1;
            }
        }
        return h(i10) + i(i10).a(z10);
    }

    private int b(int i10, boolean z10) {
        if (z10) {
            return this.f6590d.b(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public final int a(Object obj) {
        int a10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object d10 = d(obj);
        Object c10 = c(obj);
        int b10 = b(d10);
        if (b10 == -1 || (a10 = i(b10).a(c10)) == -1) {
            return -1;
        }
        return g(b10) + a10;
    }

    public int b(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.f6591f) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int e10 = e(i10);
        int h10 = h(e10);
        go i13 = i(e10);
        int i14 = i10 - h10;
        if (i11 != 2) {
            i12 = i11;
        }
        int b10 = i13.b(i14, i12, z10);
        if (b10 != -1) {
            return h10 + b10;
        }
        int b11 = b(e10, z10);
        while (b11 != -1 && i(b11).c()) {
            b11 = b(b11, z10);
        }
        if (b11 != -1) {
            return h(b11) + i(b11).b(z10);
        }
        if (i11 == 2) {
            return b(z10);
        }
        return -1;
    }

    private int a(int i10, boolean z10) {
        if (z10) {
            return this.f6590d.a(i10);
        }
        if (i10 < this.f6589c - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public int a(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.f6591f) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int e10 = e(i10);
        int h10 = h(e10);
        go i13 = i(e10);
        int i14 = i10 - h10;
        if (i11 != 2) {
            i12 = i11;
        }
        int a10 = i13.a(i14, i12, z10);
        if (a10 != -1) {
            return h10 + a10;
        }
        int a11 = a(e10, z10);
        while (a11 != -1 && i(a11).c()) {
            a11 = a(a11, z10);
        }
        if (a11 != -1) {
            return h(a11) + i(a11).a(z10);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    public final Object b(int i10) {
        int d10 = d(i10);
        return a(f(d10), i(d10).b(i10 - g(d10)));
    }

    public final go.b a(int i10, go.b bVar, boolean z10) {
        int d10 = d(i10);
        int h10 = h(d10);
        i(d10).a(i10 - g(d10), bVar, z10);
        bVar.f8054c += h10;
        if (z10) {
            bVar.f8053b = a(f(d10), a1.a(bVar.f8053b));
        }
        return bVar;
    }

    public final go.b a(Object obj, go.b bVar) {
        Object d10 = d(obj);
        Object c10 = c(obj);
        int b10 = b(d10);
        int h10 = h(b10);
        i(b10).a(c10, bVar);
        bVar.f8054c += h10;
        bVar.f8053b = obj;
        return bVar;
    }

    public final go.d a(int i10, go.d dVar, long j10) {
        int e10 = e(i10);
        int h10 = h(e10);
        int g10 = g(e10);
        i(e10).a(i10 - h10, dVar, j10);
        Object f10 = f(e10);
        if (!go.d.f8063s.equals(dVar.f8067a)) {
            f10 = a(f10, dVar.f8067a);
        }
        dVar.f8067a = f10;
        dVar.f8081p += g10;
        dVar.f8082q += g10;
        return dVar;
    }
}
