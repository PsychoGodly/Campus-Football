package com.applovin.impl;

public class dg implements i8 {

    /* renamed from: d  reason: collision with root package name */
    public static final m8 f7236d = dw.f7334b;

    /* renamed from: a  reason: collision with root package name */
    private k8 f7237a;

    /* renamed from: b  reason: collision with root package name */
    private dl f7238b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7239c;

    /* access modifiers changed from: private */
    public static /* synthetic */ i8[] b() {
        return new i8[]{new dg()};
    }

    public void a() {
    }

    public void a(k8 k8Var) {
        this.f7237a = k8Var;
    }

    private boolean b(j8 j8Var) {
        fg fgVar = new fg();
        if (fgVar.a(j8Var, true) && (fgVar.f7777b & 2) == 2) {
            int min = Math.min(fgVar.f7784i, 8);
            yg ygVar = new yg(min);
            j8Var.c(ygVar.c(), 0, min);
            if (w8.c(a(ygVar))) {
                this.f7238b = new w8();
            } else if (fr.c(a(ygVar))) {
                this.f7238b = new fr();
            } else if (qg.b(a(ygVar))) {
                this.f7238b = new qg();
            }
            return true;
        }
        return false;
    }

    public int a(j8 j8Var, qh qhVar) {
        a1.b((Object) this.f7237a);
        if (this.f7238b == null) {
            if (b(j8Var)) {
                j8Var.b();
            } else {
                throw ah.a("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.f7239c) {
            ro a10 = this.f7237a.a(0, 1);
            this.f7237a.c();
            this.f7238b.a(this.f7237a, a10);
            this.f7239c = true;
        }
        return this.f7238b.a(j8Var, qhVar);
    }

    private static yg a(yg ygVar) {
        ygVar.f(0);
        return ygVar;
    }

    public void a(long j10, long j11) {
        dl dlVar = this.f7238b;
        if (dlVar != null) {
            dlVar.a(j10, j11);
        }
    }

    public boolean a(j8 j8Var) {
        try {
            return b(j8Var);
        } catch (ah unused) {
            return false;
        }
    }
}
