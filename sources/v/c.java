package v;

import java.util.ArrayList;
import v.e;

/* compiled from: ChainHead */
public class c {

    /* renamed from: a  reason: collision with root package name */
    protected e f23027a;

    /* renamed from: b  reason: collision with root package name */
    protected e f23028b;

    /* renamed from: c  reason: collision with root package name */
    protected e f23029c;

    /* renamed from: d  reason: collision with root package name */
    protected e f23030d;

    /* renamed from: e  reason: collision with root package name */
    protected e f23031e;

    /* renamed from: f  reason: collision with root package name */
    protected e f23032f;

    /* renamed from: g  reason: collision with root package name */
    protected e f23033g;

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList<e> f23034h;

    /* renamed from: i  reason: collision with root package name */
    protected int f23035i;

    /* renamed from: j  reason: collision with root package name */
    protected int f23036j;

    /* renamed from: k  reason: collision with root package name */
    protected float f23037k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    int f23038l;

    /* renamed from: m  reason: collision with root package name */
    int f23039m;

    /* renamed from: n  reason: collision with root package name */
    int f23040n;

    /* renamed from: o  reason: collision with root package name */
    boolean f23041o;

    /* renamed from: p  reason: collision with root package name */
    private int f23042p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f23043q = false;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f23044r;

    /* renamed from: s  reason: collision with root package name */
    protected boolean f23045s;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f23046t;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f23047u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f23048v;

    public c(e eVar, int i10, boolean z10) {
        this.f23027a = eVar;
        this.f23042p = i10;
        this.f23043q = z10;
    }

    private void b() {
        int i10 = this.f23042p * 2;
        e eVar = this.f23027a;
        boolean z10 = true;
        this.f23041o = true;
        e eVar2 = eVar;
        boolean z11 = false;
        while (!z11) {
            this.f23035i++;
            e[] eVarArr = eVar.F0;
            int i11 = this.f23042p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.E0[i11] = null;
            if (eVar.T() != 8) {
                this.f23038l++;
                e.b s10 = eVar.s(this.f23042p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (s10 != bVar) {
                    this.f23039m += eVar.C(this.f23042p);
                }
                int e10 = this.f23039m + eVar.W[i10].e();
                this.f23039m = e10;
                int i12 = i10 + 1;
                this.f23039m = e10 + eVar.W[i12].e();
                int e11 = this.f23040n + eVar.W[i10].e();
                this.f23040n = e11;
                this.f23040n = e11 + eVar.W[i12].e();
                if (this.f23028b == null) {
                    this.f23028b = eVar;
                }
                this.f23030d = eVar;
                e.b[] bVarArr = eVar.Z;
                int i13 = this.f23042p;
                if (bVarArr[i13] == bVar) {
                    int[] iArr = eVar.f23117y;
                    if (iArr[i13] == 0 || iArr[i13] == 3 || iArr[i13] == 2) {
                        this.f23036j++;
                        float[] fArr = eVar.D0;
                        float f10 = fArr[i13];
                        if (f10 > 0.0f) {
                            this.f23037k += fArr[i13];
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f23044r = true;
                            } else {
                                this.f23045s = true;
                            }
                            if (this.f23034h == null) {
                                this.f23034h = new ArrayList<>();
                            }
                            this.f23034h.add(eVar);
                        }
                        if (this.f23032f == null) {
                            this.f23032f = eVar;
                        }
                        e eVar4 = this.f23033g;
                        if (eVar4 != null) {
                            eVar4.E0[this.f23042p] = eVar;
                        }
                        this.f23033g = eVar;
                    }
                    if (this.f23042p == 0) {
                        if (eVar.f23113w != 0) {
                            this.f23041o = false;
                        } else if (!(eVar.f23119z == 0 && eVar.A == 0)) {
                            this.f23041o = false;
                        }
                    } else if (eVar.f23115x != 0) {
                        this.f23041o = false;
                    } else if (!(eVar.C == 0 && eVar.D == 0)) {
                        this.f23041o = false;
                    }
                    if (eVar.f23076d0 != 0.0f) {
                        this.f23041o = false;
                        this.f23047u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.F0[this.f23042p] = eVar;
            }
            d dVar = eVar.W[i10 + 1].f23054f;
            if (dVar != null) {
                e eVar5 = dVar.f23052d;
                d[] dVarArr = eVar5.W;
                if (dVarArr[i10].f23054f != null && dVarArr[i10].f23054f.f23052d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z11 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f23028b;
        if (eVar6 != null) {
            this.f23039m -= eVar6.W[i10].e();
        }
        e eVar7 = this.f23030d;
        if (eVar7 != null) {
            this.f23039m -= eVar7.W[i10 + 1].e();
        }
        this.f23029c = eVar;
        if (this.f23042p != 0 || !this.f23043q) {
            this.f23031e = this.f23027a;
        } else {
            this.f23031e = eVar;
        }
        if (!this.f23045s || !this.f23044r) {
            z10 = false;
        }
        this.f23046t = z10;
    }

    private static boolean c(e eVar, int i10) {
        if (eVar.T() != 8 && eVar.Z[i10] == e.b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.f23117y;
            if (iArr[i10] == 0 || iArr[i10] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.f23048v) {
            b();
        }
        this.f23048v = true;
    }
}
