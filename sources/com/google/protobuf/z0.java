package com.google.protobuf;

import com.google.protobuf.b2;
import com.google.protobuf.h0;
import com.google.protobuf.v;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MessageSetSchema */
final class z0<T> implements n1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final v0 f27318a;

    /* renamed from: b  reason: collision with root package name */
    private final v1<?, ?> f27319b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f27320c;

    /* renamed from: d  reason: collision with root package name */
    private final r<?> f27321d;

    private z0(v1<?, ?> v1Var, r<?> rVar, v0 v0Var) {
        this.f27319b = v1Var;
        this.f27320c = rVar.e(v0Var);
        this.f27321d = rVar;
        this.f27318a = v0Var;
    }

    private <UT, UB> int k(v1<UT, UB> v1Var, T t10) {
        return v1Var.i(v1Var.g(t10));
    }

    private <UT, UB, ET extends v.b<ET>> void l(v1<UT, UB> v1Var, r<ET> rVar, T t10, l1 l1Var, q qVar) throws IOException {
        UB f10 = v1Var.f(t10);
        v<ET> d10 = rVar.d(t10);
        do {
            try {
                if (l1Var.B() == Integer.MAX_VALUE) {
                    v1Var.o(t10, f10);
                    return;
                }
            } finally {
                v1Var.o(t10, f10);
            }
        } while (n(l1Var, qVar, rVar, d10, v1Var, f10));
    }

    static <T> z0<T> m(v1<?, ?> v1Var, r<?> rVar, v0 v0Var) {
        return new z0<>(v1Var, rVar, v0Var);
    }

    private <UT, UB, ET extends v.b<ET>> boolean n(l1 l1Var, q qVar, r<ET> rVar, v<ET> vVar, v1<UT, UB> v1Var, UB ub2) throws IOException {
        int g10 = l1Var.g();
        if (g10 == b2.f26937a) {
            int i10 = 0;
            Object obj = null;
            i iVar = null;
            while (l1Var.B() != Integer.MAX_VALUE) {
                int g11 = l1Var.g();
                if (g11 == b2.f26939c) {
                    i10 = l1Var.p();
                    obj = rVar.b(qVar, this.f27318a, i10);
                } else if (g11 == b2.f26940d) {
                    if (obj != null) {
                        rVar.h(l1Var, obj, qVar, vVar);
                    } else {
                        iVar = l1Var.G();
                    }
                } else if (!l1Var.J()) {
                    break;
                }
            }
            if (l1Var.g() == b2.f26938b) {
                if (iVar != null) {
                    if (obj != null) {
                        rVar.i(iVar, obj, qVar, vVar);
                    } else {
                        v1Var.d(ub2, i10, iVar);
                    }
                }
                return true;
            }
            throw e0.b();
        } else if (b2.b(g10) != 2) {
            return l1Var.J();
        } else {
            Object b10 = rVar.b(qVar, this.f27318a, b2.a(g10));
            if (b10 == null) {
                return v1Var.m(ub2, l1Var);
            }
            rVar.h(l1Var, b10, qVar, vVar);
            return true;
        }
    }

    private <UT, UB> void o(v1<UT, UB> v1Var, T t10, c2 c2Var) throws IOException {
        v1Var.s(v1Var.g(t10), c2Var);
    }

    public void a(T t10, T t11) {
        p1.G(this.f27319b, t10, t11);
        if (this.f27320c) {
            p1.E(this.f27321d, t10, t11);
        }
    }

    public void b(T t10, c2 c2Var) throws IOException {
        Iterator<Map.Entry<?, Object>> t11 = this.f27321d.c(t10).t();
        while (t11.hasNext()) {
            Map.Entry next = t11.next();
            v.b bVar = (v.b) next.getKey();
            if (bVar.Y() != b2.c.MESSAGE || bVar.J() || bVar.Z()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof h0.b) {
                c2Var.e(bVar.I(), ((h0.b) next).a().e());
            } else {
                c2Var.e(bVar.I(), next.getValue());
            }
        }
        o(this.f27319b, t10, c2Var);
    }

    public void c(T t10) {
        this.f27319b.j(t10);
        this.f27321d.f(t10);
    }

    public final boolean d(T t10) {
        return this.f27321d.c(t10).p();
    }

    public void e(T t10, l1 l1Var, q qVar) throws IOException {
        l(this.f27319b, this.f27321d, t10, l1Var, qVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.google.protobuf.z$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(T r11, byte[] r12, int r13, int r14, com.google.protobuf.f.b r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.google.protobuf.z r0 = (com.google.protobuf.z) r0
            com.google.protobuf.w1 r1 = r0.unknownFields
            com.google.protobuf.w1 r2 = com.google.protobuf.w1.c()
            if (r1 != r2) goto L_0x0011
            com.google.protobuf.w1 r1 = com.google.protobuf.w1.k()
            r0.unknownFields = r1
        L_0x0011:
            com.google.protobuf.z$c r11 = (com.google.protobuf.z.c) r11
            com.google.protobuf.v r11 = r11.e0()
            r0 = 0
            r2 = r0
        L_0x0019:
            if (r13 >= r14) goto L_0x00d7
            int r4 = com.google.protobuf.f.I(r12, r13, r15)
            int r13 = r15.f27003a
            int r3 = com.google.protobuf.b2.f26937a
            r5 = 2
            if (r13 == r3) goto L_0x006b
            int r3 = com.google.protobuf.b2.b(r13)
            if (r3 != r5) goto L_0x0066
            com.google.protobuf.r<?> r2 = r10.f27321d
            com.google.protobuf.q r3 = r15.f27006d
            com.google.protobuf.v0 r5 = r10.f27318a
            int r6 = com.google.protobuf.b2.a(r13)
            java.lang.Object r2 = r2.b(r3, r5, r6)
            r8 = r2
            com.google.protobuf.z$e r8 = (com.google.protobuf.z.e) r8
            if (r8 == 0) goto L_0x005b
            com.google.protobuf.i1 r13 = com.google.protobuf.i1.a()
            com.google.protobuf.v0 r2 = r8.b()
            java.lang.Class r2 = r2.getClass()
            com.google.protobuf.n1 r13 = r13.c(r2)
            int r13 = com.google.protobuf.f.p(r13, r12, r4, r14, r15)
            com.google.protobuf.z$d r2 = r8.f27309b
            java.lang.Object r3 = r15.f27005c
            r11.y(r2, r3)
            goto L_0x0064
        L_0x005b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.protobuf.f.G(r2, r3, r4, r5, r6, r7)
        L_0x0064:
            r2 = r8
            goto L_0x0019
        L_0x0066:
            int r13 = com.google.protobuf.f.P(r13, r12, r4, r14, r15)
            goto L_0x0019
        L_0x006b:
            r13 = 0
            r3 = r0
        L_0x006d:
            if (r4 >= r14) goto L_0x00cb
            int r4 = com.google.protobuf.f.I(r12, r4, r15)
            int r6 = r15.f27003a
            int r7 = com.google.protobuf.b2.a(r6)
            int r8 = com.google.protobuf.b2.b(r6)
            if (r7 == r5) goto L_0x00ac
            r9 = 3
            if (r7 == r9) goto L_0x0083
            goto L_0x00c1
        L_0x0083:
            if (r2 == 0) goto L_0x00a1
            com.google.protobuf.i1 r6 = com.google.protobuf.i1.a()
            com.google.protobuf.v0 r7 = r2.b()
            java.lang.Class r7 = r7.getClass()
            com.google.protobuf.n1 r6 = r6.c(r7)
            int r4 = com.google.protobuf.f.p(r6, r12, r4, r14, r15)
            com.google.protobuf.z$d r6 = r2.f27309b
            java.lang.Object r7 = r15.f27005c
            r11.y(r6, r7)
            goto L_0x006d
        L_0x00a1:
            if (r8 != r5) goto L_0x00c1
            int r4 = com.google.protobuf.f.b(r12, r4, r15)
            java.lang.Object r3 = r15.f27005c
            com.google.protobuf.i r3 = (com.google.protobuf.i) r3
            goto L_0x006d
        L_0x00ac:
            if (r8 != 0) goto L_0x00c1
            int r4 = com.google.protobuf.f.I(r12, r4, r15)
            int r13 = r15.f27003a
            com.google.protobuf.r<?> r2 = r10.f27321d
            com.google.protobuf.q r6 = r15.f27006d
            com.google.protobuf.v0 r7 = r10.f27318a
            java.lang.Object r2 = r2.b(r6, r7, r13)
            com.google.protobuf.z$e r2 = (com.google.protobuf.z.e) r2
            goto L_0x006d
        L_0x00c1:
            int r7 = com.google.protobuf.b2.f26938b
            if (r6 != r7) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            int r4 = com.google.protobuf.f.P(r6, r12, r4, r14, r15)
            goto L_0x006d
        L_0x00cb:
            if (r3 == 0) goto L_0x00d4
            int r13 = com.google.protobuf.b2.c(r13, r5)
            r1.n(r13, r3)
        L_0x00d4:
            r13 = r4
            goto L_0x0019
        L_0x00d7:
            if (r13 != r14) goto L_0x00da
            return
        L_0x00da:
            com.google.protobuf.e0 r11 = com.google.protobuf.e0.h()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.z0.f(java.lang.Object, byte[], int, int, com.google.protobuf.f$b):void");
    }

    public boolean g(T t10, T t11) {
        if (!this.f27319b.g(t10).equals(this.f27319b.g(t11))) {
            return false;
        }
        if (this.f27320c) {
            return this.f27321d.c(t10).equals(this.f27321d.c(t11));
        }
        return true;
    }

    public int h(T t10) {
        int k10 = k(this.f27319b, t10) + 0;
        return this.f27320c ? k10 + this.f27321d.c(t10).j() : k10;
    }

    public T i() {
        v0 v0Var = this.f27318a;
        if (v0Var instanceof z) {
            return ((z) v0Var).T();
        }
        return v0Var.j().A();
    }

    public int j(T t10) {
        int hashCode = this.f27319b.g(t10).hashCode();
        return this.f27320c ? (hashCode * 53) + this.f27321d.c(t10).hashCode() : hashCode;
    }
}
