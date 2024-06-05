package b4;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import k4.a0;
import k4.n0;
import y3.b;
import y3.g;
import y3.h;
import y3.j;

/* compiled from: PgsDecoder */
public final class a extends g {

    /* renamed from: o  reason: collision with root package name */
    private final a0 f5525o = new a0();

    /* renamed from: p  reason: collision with root package name */
    private final a0 f5526p = new a0();

    /* renamed from: q  reason: collision with root package name */
    private final C0100a f5527q = new C0100a();

    /* renamed from: r  reason: collision with root package name */
    private Inflater f5528r;

    /* renamed from: b4.a$a  reason: collision with other inner class name */
    /* compiled from: PgsDecoder */
    private static final class C0100a {

        /* renamed from: a  reason: collision with root package name */
        private final a0 f5529a = new a0();

        /* renamed from: b  reason: collision with root package name */
        private final int[] f5530b = new int[256];

        /* renamed from: c  reason: collision with root package name */
        private boolean f5531c;

        /* renamed from: d  reason: collision with root package name */
        private int f5532d;

        /* renamed from: e  reason: collision with root package name */
        private int f5533e;

        /* renamed from: f  reason: collision with root package name */
        private int f5534f;

        /* renamed from: g  reason: collision with root package name */
        private int f5535g;

        /* renamed from: h  reason: collision with root package name */
        private int f5536h;

        /* renamed from: i  reason: collision with root package name */
        private int f5537i;

        /* access modifiers changed from: private */
        public void e(a0 a0Var, int i10) {
            int J;
            if (i10 >= 4) {
                a0Var.U(3);
                int i11 = i10 - 4;
                if ((a0Var.G() & 128) != 0) {
                    if (i11 >= 7 && (J = a0Var.J()) >= 4) {
                        this.f5536h = a0Var.M();
                        this.f5537i = a0Var.M();
                        this.f5529a.P(J - 4);
                        i11 -= 7;
                    } else {
                        return;
                    }
                }
                int f10 = this.f5529a.f();
                int g10 = this.f5529a.g();
                if (f10 < g10 && i11 > 0) {
                    int min = Math.min(i11, g10 - f10);
                    a0Var.l(this.f5529a.e(), f10, min);
                    this.f5529a.T(f10 + min);
                }
            }
        }

        /* access modifiers changed from: private */
        public void f(a0 a0Var, int i10) {
            if (i10 >= 19) {
                this.f5532d = a0Var.M();
                this.f5533e = a0Var.M();
                a0Var.U(11);
                this.f5534f = a0Var.M();
                this.f5535g = a0Var.M();
            }
        }

        /* access modifiers changed from: private */
        public void g(a0 a0Var, int i10) {
            if (i10 % 5 == 2) {
                a0Var.U(2);
                Arrays.fill(this.f5530b, 0);
                int i11 = i10 / 5;
                int i12 = 0;
                while (i12 < i11) {
                    int G = a0Var.G();
                    int G2 = a0Var.G();
                    int G3 = a0Var.G();
                    int G4 = a0Var.G();
                    int G5 = a0Var.G();
                    double d10 = (double) G2;
                    double d11 = (double) (G3 - 128);
                    int i13 = i12;
                    double d12 = (double) (G4 - 128);
                    int[] iArr = this.f5530b;
                    int q10 = n0.q((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8;
                    iArr[G] = n0.q((int) (d10 + (d12 * 1.772d)), 0, 255) | q10 | (G5 << 24) | (n0.q((int) ((1.402d * d11) + d10), 0, 255) << 16);
                    i12 = i13 + 1;
                }
                this.f5531c = true;
            }
        }

        public b d() {
            int i10;
            int i11;
            int i12;
            if (this.f5532d == 0 || this.f5533e == 0 || this.f5536h == 0 || this.f5537i == 0 || this.f5529a.g() == 0 || this.f5529a.f() != this.f5529a.g() || !this.f5531c) {
                return null;
            }
            this.f5529a.T(0);
            int i13 = this.f5536h * this.f5537i;
            int[] iArr = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int G = this.f5529a.G();
                if (G != 0) {
                    i12 = i14 + 1;
                    iArr[i14] = this.f5530b[G];
                } else {
                    int G2 = this.f5529a.G();
                    if (G2 != 0) {
                        if ((G2 & 64) == 0) {
                            i10 = G2 & 63;
                        } else {
                            i10 = ((G2 & 63) << 8) | this.f5529a.G();
                        }
                        if ((G2 & 128) == 0) {
                            i11 = 0;
                        } else {
                            i11 = this.f5530b[this.f5529a.G()];
                        }
                        i12 = i10 + i14;
                        Arrays.fill(iArr, i14, i12, i11);
                    }
                }
                i14 = i12;
            }
            return new b.C0250b().f(Bitmap.createBitmap(iArr, this.f5536h, this.f5537i, Bitmap.Config.ARGB_8888)).k(((float) this.f5534f) / ((float) this.f5532d)).l(0).h(((float) this.f5535g) / ((float) this.f5533e), 0).i(0).n(((float) this.f5536h) / ((float) this.f5532d)).g(((float) this.f5537i) / ((float) this.f5533e)).a();
        }

        public void h() {
            this.f5532d = 0;
            this.f5533e = 0;
            this.f5534f = 0;
            this.f5535g = 0;
            this.f5536h = 0;
            this.f5537i = 0;
            this.f5529a.P(0);
            this.f5531c = false;
        }
    }

    public a() {
        super("PgsDecoder");
    }

    private void B(a0 a0Var) {
        if (a0Var.a() > 0 && a0Var.j() == 120) {
            if (this.f5528r == null) {
                this.f5528r = new Inflater();
            }
            if (n0.q0(a0Var, this.f5526p, this.f5528r)) {
                a0Var.R(this.f5526p.e(), this.f5526p.g());
            }
        }
    }

    private static b C(a0 a0Var, C0100a aVar) {
        int g10 = a0Var.g();
        int G = a0Var.G();
        int M = a0Var.M();
        int f10 = a0Var.f() + M;
        b bVar = null;
        if (f10 > g10) {
            a0Var.T(g10);
            return null;
        }
        if (G != 128) {
            switch (G) {
                case 20:
                    aVar.g(a0Var, M);
                    break;
                case 21:
                    aVar.e(a0Var, M);
                    break;
                case 22:
                    aVar.f(a0Var, M);
                    break;
            }
        } else {
            bVar = aVar.d();
            aVar.h();
        }
        a0Var.T(f10);
        return bVar;
    }

    /* access modifiers changed from: protected */
    public h z(byte[] bArr, int i10, boolean z10) throws j {
        this.f5525o.R(bArr, i10);
        B(this.f5525o);
        this.f5527q.h();
        ArrayList arrayList = new ArrayList();
        while (this.f5525o.a() >= 3) {
            b C = C(this.f5525o, this.f5527q);
            if (C != null) {
                arrayList.add(C);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
