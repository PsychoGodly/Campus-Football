package com.google.protobuf;

import com.google.protobuf.c2;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite */
public final class w1 {

    /* renamed from: f  reason: collision with root package name */
    private static final w1 f27263f = new w1(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f27264a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f27265b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f27266c;

    /* renamed from: d  reason: collision with root package name */
    private int f27267d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f27268e;

    private w1() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i10) {
        int[] iArr = this.f27265b;
        if (i10 > iArr.length) {
            int i11 = this.f27264a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f27265b = Arrays.copyOf(iArr, i10);
            this.f27266c = Arrays.copyOf(this.f27266c, i10);
        }
    }

    public static w1 c() {
        return f27263f;
    }

    private static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int g(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    static w1 j(w1 w1Var, w1 w1Var2) {
        int i10 = w1Var.f27264a + w1Var2.f27264a;
        int[] copyOf = Arrays.copyOf(w1Var.f27265b, i10);
        System.arraycopy(w1Var2.f27265b, 0, copyOf, w1Var.f27264a, w1Var2.f27264a);
        Object[] copyOf2 = Arrays.copyOf(w1Var.f27266c, i10);
        System.arraycopy(w1Var2.f27266c, 0, copyOf2, w1Var.f27264a, w1Var2.f27264a);
        return new w1(i10, copyOf, copyOf2, true);
    }

    static w1 k() {
        return new w1();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i10, Object obj, c2 c2Var) throws IOException {
        int a10 = b2.a(i10);
        int b10 = b2.b(i10);
        if (b10 == 0) {
            c2Var.q(a10, ((Long) obj).longValue());
        } else if (b10 == 1) {
            c2Var.k(a10, ((Long) obj).longValue());
        } else if (b10 == 2) {
            c2Var.v(a10, (i) obj);
        } else if (b10 != 3) {
            if (b10 == 5) {
                c2Var.f(a10, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(e0.e());
        } else if (c2Var.l() == c2.a.ASCENDING) {
            c2Var.u(a10);
            ((w1) obj).r(c2Var);
            c2Var.H(a10);
        } else {
            c2Var.H(a10);
            ((w1) obj).r(c2Var);
            c2Var.u(a10);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.f27268e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int i10;
        int i11 = this.f27267d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f27264a; i13++) {
            int i14 = this.f27265b[i13];
            int a10 = b2.a(i14);
            int b10 = b2.b(i14);
            if (b10 == 0) {
                i10 = l.Y(a10, ((Long) this.f27266c[i13]).longValue());
            } else if (b10 == 1) {
                i10 = l.p(a10, ((Long) this.f27266c[i13]).longValue());
            } else if (b10 == 2) {
                i10 = l.h(a10, (i) this.f27266c[i13]);
            } else if (b10 == 3) {
                i10 = (l.V(a10) * 2) + ((w1) this.f27266c[i13]).d();
            } else if (b10 == 5) {
                i10 = l.n(a10, ((Integer) this.f27266c[i13]).intValue());
            } else {
                throw new IllegalStateException(e0.e());
            }
            i12 += i10;
        }
        this.f27267d = i12;
        return i12;
    }

    public int e() {
        int i10 = this.f27267d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f27264a; i12++) {
            i11 += l.K(b2.a(this.f27265b[i12]), (i) this.f27266c[i12]);
        }
        this.f27267d = i11;
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        int i10 = this.f27264a;
        return i10 == w1Var.f27264a && o(this.f27265b, w1Var.f27265b, i10) && l(this.f27266c, w1Var.f27266c, this.f27264a);
    }

    public void h() {
        this.f27268e = false;
    }

    public int hashCode() {
        int i10 = this.f27264a;
        return ((((527 + i10) * 31) + f(this.f27265b, i10)) * 31) + g(this.f27266c, this.f27264a);
    }

    /* access modifiers changed from: package-private */
    public w1 i(w1 w1Var) {
        if (w1Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f27264a + w1Var.f27264a;
        b(i10);
        System.arraycopy(w1Var.f27265b, 0, this.f27265b, this.f27264a, w1Var.f27264a);
        System.arraycopy(w1Var.f27266c, 0, this.f27266c, this.f27264a, w1Var.f27264a);
        this.f27264a = i10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f27264a; i11++) {
            x0.d(sb2, i10, String.valueOf(b2.a(this.f27265b[i11])), this.f27266c[i11]);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(int i10, Object obj) {
        a();
        b(this.f27264a + 1);
        int[] iArr = this.f27265b;
        int i11 = this.f27264a;
        iArr[i11] = i10;
        this.f27266c[i11] = obj;
        this.f27264a = i11 + 1;
    }

    /* access modifiers changed from: package-private */
    public void p(c2 c2Var) throws IOException {
        if (c2Var.l() == c2.a.DESCENDING) {
            for (int i10 = this.f27264a - 1; i10 >= 0; i10--) {
                c2Var.e(b2.a(this.f27265b[i10]), this.f27266c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f27264a; i11++) {
            c2Var.e(b2.a(this.f27265b[i11]), this.f27266c[i11]);
        }
    }

    public void r(c2 c2Var) throws IOException {
        if (this.f27264a != 0) {
            if (c2Var.l() == c2.a.ASCENDING) {
                for (int i10 = 0; i10 < this.f27264a; i10++) {
                    q(this.f27265b[i10], this.f27266c[i10], c2Var);
                }
                return;
            }
            for (int i11 = this.f27264a - 1; i11 >= 0; i11--) {
                q(this.f27265b[i11], this.f27266c[i11], c2Var);
            }
        }
    }

    private w1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f27267d = -1;
        this.f27264a = i10;
        this.f27265b = iArr;
        this.f27266c = objArr;
        this.f27268e = z10;
    }
}
