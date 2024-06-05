package com.google.protobuf;

import java.io.IOException;

/* compiled from: UnknownFieldSchema */
abstract class v1<T, B> {
    v1() {
    }

    /* access modifiers changed from: package-private */
    public abstract void a(B b10, int i10, int i11);

    /* access modifiers changed from: package-private */
    public abstract void b(B b10, int i10, long j10);

    /* access modifiers changed from: package-private */
    public abstract void c(B b10, int i10, T t10);

    /* access modifiers changed from: package-private */
    public abstract void d(B b10, int i10, i iVar);

    /* access modifiers changed from: package-private */
    public abstract void e(B b10, int i10, long j10);

    /* access modifiers changed from: package-private */
    public abstract B f(Object obj);

    /* access modifiers changed from: package-private */
    public abstract T g(Object obj);

    /* access modifiers changed from: package-private */
    public abstract int h(T t10);

    /* access modifiers changed from: package-private */
    public abstract int i(T t10);

    /* access modifiers changed from: package-private */
    public abstract void j(Object obj);

    /* access modifiers changed from: package-private */
    public abstract T k(T t10, T t11);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(B r3, com.google.protobuf.l1 r4) throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.B()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.m(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v1.l(java.lang.Object, com.google.protobuf.l1):void");
    }

    /* access modifiers changed from: package-private */
    public final boolean m(B b10, l1 l1Var) throws IOException {
        int g10 = l1Var.g();
        int a10 = b2.a(g10);
        int b11 = b2.b(g10);
        if (b11 == 0) {
            e(b10, a10, l1Var.N());
            return true;
        } else if (b11 == 1) {
            b(b10, a10, l1Var.c());
            return true;
        } else if (b11 == 2) {
            d(b10, a10, l1Var.G());
            return true;
        } else if (b11 == 3) {
            Object n10 = n();
            int c10 = b2.c(a10, 4);
            l(n10, l1Var);
            if (c10 == l1Var.g()) {
                c(b10, a10, r(n10));
                return true;
            }
            throw e0.b();
        } else if (b11 == 4) {
            return false;
        } else {
            if (b11 == 5) {
                a(b10, a10, l1Var.k());
                return true;
            }
            throw e0.e();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract B n();

    /* access modifiers changed from: package-private */
    public abstract void o(Object obj, B b10);

    /* access modifiers changed from: package-private */
    public abstract void p(Object obj, T t10);

    /* access modifiers changed from: package-private */
    public abstract boolean q(l1 l1Var);

    /* access modifiers changed from: package-private */
    public abstract T r(B b10);

    /* access modifiers changed from: package-private */
    public abstract void s(T t10, c2 c2Var) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void t(T t10, c2 c2Var) throws IOException;
}
