package v;

import s.d;
import s.i;
import v.d;
import v.e;

/* compiled from: Barrier */
public class a extends i {
    private int N0 = 0;
    private boolean O0 = true;
    private int P0 = 0;
    boolean Q0 = false;

    public void g(d dVar, boolean z10) {
        d[] dVarArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        d[] dVarArr2 = this.W;
        dVarArr2[0] = this.O;
        dVarArr2[2] = this.P;
        dVarArr2[1] = this.Q;
        dVarArr2[3] = this.R;
        int i13 = 0;
        while (true) {
            dVarArr = this.W;
            if (i13 >= dVarArr.length) {
                break;
            }
            dVarArr[i13].f23057i = dVar.q(dVarArr[i13]);
            i13++;
        }
        int i14 = this.N0;
        if (i14 >= 0 && i14 < 4) {
            d dVar2 = dVarArr[i14];
            if (!this.Q0) {
                q1();
            }
            if (this.Q0) {
                this.Q0 = false;
                int i15 = this.N0;
                if (i15 == 0 || i15 == 1) {
                    dVar.f(this.O.f23057i, this.f23080f0);
                    dVar.f(this.Q.f23057i, this.f23080f0);
                } else if (i15 == 2 || i15 == 3) {
                    dVar.f(this.P.f23057i, this.f23082g0);
                    dVar.f(this.R.f23057i, this.f23082g0);
                }
            } else {
                int i16 = 0;
                while (true) {
                    if (i16 >= this.M0) {
                        z11 = false;
                        break;
                    }
                    e eVar = this.L0[i16];
                    if ((this.O0 || eVar.h()) && ((((i11 = this.N0) == 0 || i11 == 1) && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.O.f23054f != null && eVar.Q.f23054f != null) || (((i12 = this.N0) == 2 || i12 == 3) && eVar.R() == e.b.MATCH_CONSTRAINT && eVar.P.f23054f != null && eVar.R.f23054f != null))) {
                        z11 = true;
                    } else {
                        i16++;
                    }
                }
                z11 = true;
                boolean z12 = this.O.k() || this.Q.k();
                boolean z13 = this.P.k() || this.R.k();
                boolean z14 = !z11 && (((i10 = this.N0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))));
                int i17 = 5;
                if (!z14) {
                    i17 = 4;
                }
                for (int i18 = 0; i18 < this.M0; i18++) {
                    e eVar2 = this.L0[i18];
                    if (this.O0 || eVar2.h()) {
                        i q10 = dVar.q(eVar2.W[this.N0]);
                        d[] dVarArr3 = eVar2.W;
                        int i19 = this.N0;
                        dVarArr3[i19].f23057i = q10;
                        int i20 = (dVarArr3[i19].f23054f == null || dVarArr3[i19].f23054f.f23052d != this) ? 0 : dVarArr3[i19].f23055g + 0;
                        if (i19 == 0 || i19 == 2) {
                            dVar.i(dVar2.f23057i, q10, this.P0 - i20, z11);
                        } else {
                            dVar.g(dVar2.f23057i, q10, this.P0 + i20, z11);
                        }
                        dVar.e(dVar2.f23057i, q10, this.P0 + i20, i17);
                    }
                }
                int i21 = this.N0;
                if (i21 == 0) {
                    dVar.e(this.Q.f23057i, this.O.f23057i, 0, 8);
                    dVar.e(this.O.f23057i, this.f23070a0.Q.f23057i, 0, 4);
                    dVar.e(this.O.f23057i, this.f23070a0.O.f23057i, 0, 0);
                } else if (i21 == 1) {
                    dVar.e(this.O.f23057i, this.Q.f23057i, 0, 8);
                    dVar.e(this.O.f23057i, this.f23070a0.O.f23057i, 0, 4);
                    dVar.e(this.O.f23057i, this.f23070a0.Q.f23057i, 0, 0);
                } else if (i21 == 2) {
                    dVar.e(this.R.f23057i, this.P.f23057i, 0, 8);
                    dVar.e(this.P.f23057i, this.f23070a0.R.f23057i, 0, 4);
                    dVar.e(this.P.f23057i, this.f23070a0.P.f23057i, 0, 0);
                } else if (i21 == 3) {
                    dVar.e(this.P.f23057i, this.R.f23057i, 0, 8);
                    dVar.e(this.P.f23057i, this.f23070a0.P.f23057i, 0, 4);
                    dVar.e(this.P.f23057i, this.f23070a0.R.f23057i, 0, 0);
                }
            }
        }
    }

    public boolean h() {
        return true;
    }

    public boolean l0() {
        return this.Q0;
    }

    public boolean m0() {
        return this.Q0;
    }

    public boolean q1() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        boolean z10 = true;
        while (true) {
            i10 = this.M0;
            if (i13 >= i10) {
                break;
            }
            e eVar = this.L0[i13];
            if ((this.O0 || eVar.h()) && ((((i11 = this.N0) == 0 || i11 == 1) && !eVar.l0()) || (((i12 = this.N0) == 2 || i12 == 3) && !eVar.m0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.M0; i15++) {
            e eVar2 = this.L0[i15];
            if (this.O0 || eVar2.h()) {
                if (!z11) {
                    int i16 = this.N0;
                    if (i16 == 0) {
                        i14 = eVar2.m(d.b.LEFT).d();
                    } else if (i16 == 1) {
                        i14 = eVar2.m(d.b.RIGHT).d();
                    } else if (i16 == 2) {
                        i14 = eVar2.m(d.b.TOP).d();
                    } else if (i16 == 3) {
                        i14 = eVar2.m(d.b.BOTTOM).d();
                    }
                    z11 = true;
                }
                int i17 = this.N0;
                if (i17 == 0) {
                    i14 = Math.min(i14, eVar2.m(d.b.LEFT).d());
                } else if (i17 == 1) {
                    i14 = Math.max(i14, eVar2.m(d.b.RIGHT).d());
                } else if (i17 == 2) {
                    i14 = Math.min(i14, eVar2.m(d.b.TOP).d());
                } else if (i17 == 3) {
                    i14 = Math.max(i14, eVar2.m(d.b.BOTTOM).d());
                }
            }
        }
        int i18 = i14 + this.P0;
        int i19 = this.N0;
        if (i19 == 0 || i19 == 1) {
            C0(i18, i18);
        } else {
            F0(i18, i18);
        }
        this.Q0 = true;
        return true;
    }

    public boolean r1() {
        return this.O0;
    }

    public int s1() {
        return this.N0;
    }

    public int t1() {
        return this.P0;
    }

    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i10 = 0; i10 < this.M0; i10++) {
            e eVar = this.L0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.r();
        }
        return str + "}";
    }

    public int u1() {
        int i10 = this.N0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    /* access modifiers changed from: protected */
    public void v1() {
        for (int i10 = 0; i10 < this.M0; i10++) {
            e eVar = this.L0[i10];
            if (this.O0 || eVar.h()) {
                int i11 = this.N0;
                if (i11 == 0 || i11 == 1) {
                    eVar.P0(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    eVar.P0(1, true);
                }
            }
        }
    }

    public void w1(boolean z10) {
        this.O0 = z10;
    }

    public void x1(int i10) {
        this.N0 = i10;
    }

    public void y1(int i10) {
        this.P0 = i10;
    }
}
