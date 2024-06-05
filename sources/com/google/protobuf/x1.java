package com.google.protobuf;

import java.io.IOException;

/* compiled from: UnknownFieldSetLiteSchema */
class x1 extends v1<w1, w1> {
    x1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public w1 g(Object obj) {
        return ((z) obj).unknownFields;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public int h(w1 w1Var) {
        return w1Var.d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int i(w1 w1Var) {
        return w1Var.e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public w1 k(w1 w1Var, w1 w1Var2) {
        if (w1.c().equals(w1Var2)) {
            return w1Var;
        }
        if (w1.c().equals(w1Var)) {
            return w1.j(w1Var, w1Var2);
        }
        return w1Var.i(w1Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public w1 n() {
        return w1.k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void o(Object obj, w1 w1Var) {
        p(obj, w1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void p(Object obj, w1 w1Var) {
        ((z) obj).unknownFields = w1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public w1 r(w1 w1Var) {
        w1Var.h();
        return w1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void s(w1 w1Var, c2 c2Var) throws IOException {
        w1Var.p(c2Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void t(w1 w1Var, c2 c2Var) throws IOException {
        w1Var.r(c2Var);
    }

    /* access modifiers changed from: package-private */
    public void j(Object obj) {
        g(obj).h();
    }

    /* access modifiers changed from: package-private */
    public boolean q(l1 l1Var) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void a(w1 w1Var, int i10, int i11) {
        w1Var.n(b2.c(i10, 5), Integer.valueOf(i11));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void b(w1 w1Var, int i10, long j10) {
        w1Var.n(b2.c(i10, 1), Long.valueOf(j10));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void c(w1 w1Var, int i10, w1 w1Var2) {
        w1Var.n(b2.c(i10, 3), w1Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void d(w1 w1Var, int i10, i iVar) {
        w1Var.n(b2.c(i10, 2), iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void e(w1 w1Var, int i10, long j10) {
        w1Var.n(b2.c(i10, 0), Long.valueOf(j10));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public w1 f(Object obj) {
        w1 A = g(obj);
        if (A != w1.c()) {
            return A;
        }
        w1 k10 = w1.k();
        p(obj, k10);
        return k10;
    }
}
