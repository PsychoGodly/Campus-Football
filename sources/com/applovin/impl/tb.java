package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ej;
import com.applovin.impl.we;

public final class tb implements i8 {

    /* renamed from: a  reason: collision with root package name */
    private final yg f12317a = new yg(6);

    /* renamed from: b  reason: collision with root package name */
    private k8 f12318b;

    /* renamed from: c  reason: collision with root package name */
    private int f12319c;

    /* renamed from: d  reason: collision with root package name */
    private int f12320d;

    /* renamed from: e  reason: collision with root package name */
    private int f12321e;

    /* renamed from: f  reason: collision with root package name */
    private long f12322f = -1;

    /* renamed from: g  reason: collision with root package name */
    private Cif f12323g;

    /* renamed from: h  reason: collision with root package name */
    private j8 f12324h;

    /* renamed from: i  reason: collision with root package name */
    private al f12325i;

    /* renamed from: j  reason: collision with root package name */
    private kf f12326j;

    private static Cif a(String str, long j10) {
        hf a10;
        if (j10 == -1 || (a10 = is.a(str)) == null) {
            return null;
        }
        return a10.a(j10);
    }

    private void b(j8 j8Var) {
        this.f12317a.d(2);
        j8Var.c(this.f12317a.c(), 0, 2);
        j8Var.c(this.f12317a.C() - 2);
    }

    private int c(j8 j8Var) {
        this.f12317a.d(2);
        j8Var.c(this.f12317a.c(), 0, 2);
        return this.f12317a.C();
    }

    private void d(j8 j8Var) {
        this.f12317a.d(2);
        j8Var.d(this.f12317a.c(), 0, 2);
        int C = this.f12317a.C();
        this.f12320d = C;
        if (C == 65498) {
            if (this.f12322f != -1) {
                this.f12319c = 4;
            } else {
                b();
            }
        } else if ((C < 65488 || C > 65497) && C != 65281) {
            this.f12319c = 1;
        }
    }

    private void e(j8 j8Var) {
        String t10;
        if (this.f12320d == 65505) {
            yg ygVar = new yg(this.f12321e);
            j8Var.d(ygVar.c(), 0, this.f12321e);
            if (this.f12323g == null && "http://ns.adobe.com/xap/1.0/".equals(ygVar.t()) && (t10 = ygVar.t()) != null) {
                Cif a10 = a(t10, j8Var.a());
                this.f12323g = a10;
                if (a10 != null) {
                    this.f12322f = a10.f8533d;
                }
            }
        } else {
            j8Var.a(this.f12321e);
        }
        this.f12319c = 0;
    }

    private void f(j8 j8Var) {
        this.f12317a.d(2);
        j8Var.d(this.f12317a.c(), 0, 2);
        this.f12321e = this.f12317a.C() - 2;
        this.f12319c = 2;
    }

    private void g(j8 j8Var) {
        if (!j8Var.b(this.f12317a.c(), 0, 1, true)) {
            b();
            return;
        }
        j8Var.b();
        if (this.f12326j == null) {
            this.f12326j = new kf();
        }
        al alVar = new al(j8Var, this.f12322f);
        this.f12325i = alVar;
        if (this.f12326j.a((j8) alVar)) {
            this.f12326j.a((k8) new bl(this.f12322f, (k8) a1.a((Object) this.f12318b)));
            c();
            return;
        }
        b();
    }

    public void a(k8 k8Var) {
        this.f12318b = k8Var;
    }

    private void a(we.b... bVarArr) {
        ((k8) a1.a((Object) this.f12318b)).a(1024, 4).a(new d9.b().b("image/jpeg").a(new we(bVarArr)).a());
    }

    private void c() {
        a((we.b) a1.a((Object) this.f12323g));
        this.f12319c = 5;
    }

    private void b() {
        a(new we.b[0]);
        ((k8) a1.a((Object) this.f12318b)).c();
        this.f12318b.a(new ej.b(-9223372036854775807L));
        this.f12319c = 6;
    }

    public int a(j8 j8Var, qh qhVar) {
        int i10 = this.f12319c;
        if (i10 == 0) {
            d(j8Var);
            return 0;
        } else if (i10 == 1) {
            f(j8Var);
            return 0;
        } else if (i10 == 2) {
            e(j8Var);
            return 0;
        } else if (i10 == 4) {
            long f10 = j8Var.f();
            long j10 = this.f12322f;
            if (f10 != j10) {
                qhVar.f10991a = j10;
                return 1;
            }
            g(j8Var);
            return 0;
        } else if (i10 == 5) {
            if (this.f12325i == null || j8Var != this.f12324h) {
                this.f12324h = j8Var;
                this.f12325i = new al(j8Var, this.f12322f);
            }
            int a10 = ((kf) a1.a((Object) this.f12326j)).a((j8) this.f12325i, qhVar);
            if (a10 == 1) {
                qhVar.f10991a += this.f12322f;
            }
            return a10;
        } else if (i10 == 6) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    public void a() {
        kf kfVar = this.f12326j;
        if (kfVar != null) {
            kfVar.a();
        }
    }

    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f12319c = 0;
            this.f12326j = null;
        } else if (this.f12319c == 5) {
            ((kf) a1.a((Object) this.f12326j)).a(j10, j11);
        }
    }

    public boolean a(j8 j8Var) {
        if (c(j8Var) != 65496) {
            return false;
        }
        int c10 = c(j8Var);
        this.f12320d = c10;
        if (c10 == 65504) {
            b(j8Var);
            this.f12320d = c(j8Var);
        }
        if (this.f12320d != 65505) {
            return false;
        }
        j8Var.c(2);
        this.f12317a.d(6);
        j8Var.c(this.f12317a.c(), 0, 6);
        if (this.f12317a.y() == 1165519206 && this.f12317a.C() == 0) {
            return true;
        }
        return false;
    }
}
