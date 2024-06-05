package c3;

import c3.i0;
import k4.a0;
import k4.j0;
import k4.n0;
import s2.n;

/* compiled from: SectionReader */
public final class c0 implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f5649a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f5650b = new a0(32);

    /* renamed from: c  reason: collision with root package name */
    private int f5651c;

    /* renamed from: d  reason: collision with root package name */
    private int f5652d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5653e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5654f;

    public c0(b0 b0Var) {
        this.f5649a = b0Var;
    }

    public void a(j0 j0Var, n nVar, i0.d dVar) {
        this.f5649a.a(j0Var, nVar, dVar);
        this.f5654f = true;
    }

    public void b() {
        this.f5654f = true;
    }

    public void c(a0 a0Var, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int f10 = z10 ? a0Var.f() + a0Var.G() : -1;
        if (this.f5654f) {
            if (z10) {
                this.f5654f = false;
                a0Var.T(f10);
                this.f5652d = 0;
            } else {
                return;
            }
        }
        while (a0Var.a() > 0) {
            int i11 = this.f5652d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int G = a0Var.G();
                    a0Var.T(a0Var.f() - 1);
                    if (G == 255) {
                        this.f5654f = true;
                        return;
                    }
                }
                int min = Math.min(a0Var.a(), 3 - this.f5652d);
                a0Var.l(this.f5650b.e(), this.f5652d, min);
                int i12 = this.f5652d + min;
                this.f5652d = i12;
                if (i12 == 3) {
                    this.f5650b.T(0);
                    this.f5650b.S(3);
                    this.f5650b.U(1);
                    int G2 = this.f5650b.G();
                    int G3 = this.f5650b.G();
                    this.f5653e = (G2 & 128) != 0;
                    this.f5651c = (((G2 & 15) << 8) | G3) + 3;
                    int b10 = this.f5650b.b();
                    int i13 = this.f5651c;
                    if (b10 < i13) {
                        this.f5650b.c(Math.min(4098, Math.max(i13, this.f5650b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(a0Var.a(), this.f5651c - this.f5652d);
                a0Var.l(this.f5650b.e(), this.f5652d, min2);
                int i14 = this.f5652d + min2;
                this.f5652d = i14;
                int i15 = this.f5651c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f5653e) {
                        this.f5650b.S(i15);
                    } else if (n0.t(this.f5650b.e(), 0, this.f5651c, -1) != 0) {
                        this.f5654f = true;
                        return;
                    } else {
                        this.f5650b.S(this.f5651c - 4);
                    }
                    this.f5650b.T(0);
                    this.f5649a.c(this.f5650b);
                    this.f5652d = 0;
                }
            }
        }
    }
}
