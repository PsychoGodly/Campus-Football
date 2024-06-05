package y8;

import b9.c;
import b9.d;
import v8.j;
import v8.p;
import z8.b;
import z8.i;

/* compiled from: Detector */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f31417g = {3808, 476, 2107, 1799};

    /* renamed from: a  reason: collision with root package name */
    private final b f31418a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f31419b;

    /* renamed from: c  reason: collision with root package name */
    private int f31420c;

    /* renamed from: d  reason: collision with root package name */
    private int f31421d;

    /* renamed from: e  reason: collision with root package name */
    private int f31422e;

    /* renamed from: f  reason: collision with root package name */
    private int f31423f;

    /* renamed from: y8.a$a  reason: collision with other inner class name */
    /* compiled from: Detector */
    static final class C0352a {

        /* renamed from: a  reason: collision with root package name */
        private final int f31424a;

        /* renamed from: b  reason: collision with root package name */
        private final int f31425b;

        C0352a(int i10, int i11) {
            this.f31424a = i10;
            this.f31425b = i11;
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f31424a;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f31425b;
        }

        /* access modifiers changed from: package-private */
        public p c() {
            return new p((float) a(), (float) b());
        }

        public String toString() {
            return "<" + this.f31424a + ' ' + this.f31425b + '>';
        }
    }

    public a(b bVar) {
        this.f31418a = bVar;
    }

    private static float b(p pVar, p pVar2) {
        return a9.a.a(pVar.c(), pVar.d(), pVar2.c(), pVar2.d());
    }

    private static float c(C0352a aVar, C0352a aVar2) {
        return a9.a.b(aVar.a(), aVar.b(), aVar2.a(), aVar2.b());
    }

    private static p[] d(p[] pVarArr, float f10, float f11) {
        float f12 = f11 / (f10 * 2.0f);
        float c10 = pVarArr[0].c() - pVarArr[2].c();
        float d10 = pVarArr[0].d() - pVarArr[2].d();
        float c11 = (pVarArr[0].c() + pVarArr[2].c()) / 2.0f;
        float d11 = (pVarArr[0].d() + pVarArr[2].d()) / 2.0f;
        float f13 = c10 * f12;
        float f14 = d10 * f12;
        p pVar = new p(c11 + f13, d11 + f14);
        p pVar2 = new p(c11 - f13, d11 - f14);
        float c12 = pVarArr[1].c() - pVarArr[3].c();
        float d12 = pVarArr[1].d() - pVarArr[3].d();
        float c13 = (pVarArr[1].c() + pVarArr[3].c()) / 2.0f;
        float d13 = (pVarArr[1].d() + pVarArr[3].d()) / 2.0f;
        float f15 = c12 * f12;
        float f16 = f12 * d12;
        return new p[]{pVar, new p(c13 + f15, d13 + f16), pVar2, new p(c13 - f15, d13 - f16)};
    }

    private void e(p[] pVarArr) throws j {
        long j10;
        long j11;
        if (!o(pVarArr[0]) || !o(pVarArr[1]) || !o(pVarArr[2]) || !o(pVarArr[3])) {
            throw j.a();
        }
        int i10 = this.f31422e * 2;
        int[] iArr = {r(pVarArr[0], pVarArr[1], i10), r(pVarArr[1], pVarArr[2], i10), r(pVarArr[2], pVarArr[3], i10), r(pVarArr[3], pVarArr[0], i10)};
        this.f31423f = m(iArr, i10);
        long j12 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = iArr[(this.f31423f + i11) % 4];
            if (this.f31419b) {
                j11 = j12 << 7;
                j10 = (long) ((i12 >> 1) & 127);
            } else {
                j11 = j12 << 10;
                j10 = (long) (((i12 >> 2) & 992) + ((i12 >> 1) & 31));
            }
            j12 = j11 + j10;
        }
        int h10 = h(j12, this.f31419b);
        if (this.f31419b) {
            this.f31420c = (h10 >> 6) + 1;
            this.f31421d = (h10 & 63) + 1;
            return;
        }
        this.f31420c = (h10 >> 11) + 1;
        this.f31421d = (h10 & 2047) + 1;
    }

    private p[] f(C0352a aVar) throws j {
        this.f31422e = 1;
        C0352a aVar2 = aVar;
        C0352a aVar3 = aVar2;
        C0352a aVar4 = aVar3;
        C0352a aVar5 = aVar4;
        boolean z10 = true;
        while (this.f31422e < 9) {
            C0352a j10 = j(aVar2, z10, 1, -1);
            C0352a j11 = j(aVar3, z10, 1, 1);
            C0352a j12 = j(aVar4, z10, -1, 1);
            C0352a j13 = j(aVar5, z10, -1, -1);
            if (this.f31422e > 2) {
                double c10 = (double) ((c(j13, j10) * ((float) this.f31422e)) / (c(aVar5, aVar2) * ((float) (this.f31422e + 2))));
                if (c10 < 0.75d || c10 > 1.25d || !p(j10, j11, j12, j13)) {
                    break;
                }
            }
            z10 = !z10;
            this.f31422e++;
            aVar5 = j13;
            aVar2 = j10;
            aVar3 = j11;
            aVar4 = j12;
        }
        int i10 = this.f31422e;
        if (i10 == 5 || i10 == 7) {
            this.f31419b = i10 == 5;
            p[] pVarArr = {new p(((float) aVar2.a()) + 0.5f, ((float) aVar2.b()) - 0.5f), new p(((float) aVar3.a()) + 0.5f, ((float) aVar3.b()) + 0.5f), new p(((float) aVar4.a()) - 0.5f, ((float) aVar4.b()) + 0.5f), new p(((float) aVar5.a()) - 0.5f, ((float) aVar5.b()) - 0.5f)};
            int i11 = this.f31422e;
            return d(pVarArr, (float) ((i11 * 2) - 3), (float) (i11 * 2));
        }
        throw j.a();
    }

    private int g(C0352a aVar, C0352a aVar2) {
        float c10 = c(aVar, aVar2);
        float a10 = ((float) (aVar2.a() - aVar.a())) / c10;
        float b10 = ((float) (aVar2.b() - aVar.b())) / c10;
        float a11 = (float) aVar.a();
        float b11 = (float) aVar.b();
        boolean d10 = this.f31418a.d(aVar.a(), aVar.b());
        int ceil = (int) Math.ceil((double) c10);
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < ceil; i11++) {
            a11 += a10;
            b11 += b10;
            if (this.f31418a.d(a9.a.c(a11), a9.a.c(b11)) != d10) {
                i10++;
            }
        }
        float f10 = ((float) i10) / c10;
        if (f10 > 0.1f && f10 < 0.9f) {
            return 0;
        }
        if (f10 <= 0.1f) {
            z10 = true;
        }
        return z10 == d10 ? 1 : -1;
    }

    private static int h(long j10, boolean z10) throws j {
        int i10;
        int i11;
        if (z10) {
            i10 = 7;
            i11 = 2;
        } else {
            i10 = 10;
            i11 = 4;
        }
        int i12 = i10 - i11;
        int[] iArr = new int[i10];
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            iArr[i13] = ((int) j10) & 15;
            j10 >>= 4;
        }
        try {
            new c(b9.a.f24277k).a(iArr, i12);
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 = (i14 << 4) + iArr[i15];
            }
            return i14;
        } catch (d unused) {
            throw j.a();
        }
    }

    private int i() {
        if (this.f31419b) {
            return (this.f31420c * 4) + 11;
        }
        int i10 = this.f31420c;
        if (i10 <= 4) {
            return (i10 * 4) + 15;
        }
        return (i10 * 4) + ((((i10 - 4) / 8) + 1) * 2) + 15;
    }

    private C0352a j(C0352a aVar, boolean z10, int i10, int i11) {
        int a10 = aVar.a() + i10;
        int b10 = aVar.b();
        while (true) {
            b10 += i11;
            if (!n(a10, b10) || this.f31418a.d(a10, b10) != z10) {
                int i12 = a10 - i10;
                int i13 = b10 - i11;
            } else {
                a10 += i10;
            }
        }
        int i122 = a10 - i10;
        int i132 = b10 - i11;
        while (n(i122, i132) && this.f31418a.d(i122, i132) == z10) {
            i122 += i10;
        }
        int i14 = i122 - i10;
        while (n(i14, i132) && this.f31418a.d(i14, i132) == z10) {
            i132 += i11;
        }
        return new C0352a(i14, i132 - i11);
    }

    private C0352a k() {
        p pVar;
        p pVar2;
        p pVar3;
        p pVar4;
        p pVar5;
        p pVar6;
        p pVar7;
        p pVar8;
        try {
            p[] c10 = new a9.b(this.f31418a).c();
            pVar3 = c10[0];
            pVar2 = c10[1];
            pVar = c10[2];
            pVar4 = c10[3];
        } catch (j unused) {
            int k10 = this.f31418a.k() / 2;
            int g10 = this.f31418a.g() / 2;
            int i10 = k10 + 7;
            int i11 = g10 - 7;
            p c11 = j(new C0352a(i10, i11), false, 1, -1).c();
            int i12 = g10 + 7;
            p c12 = j(new C0352a(i10, i12), false, 1, 1).c();
            int i13 = k10 - 7;
            p c13 = j(new C0352a(i13, i12), false, -1, 1).c();
            pVar4 = j(new C0352a(i13, i11), false, -1, -1).c();
            p pVar9 = c12;
            pVar = c13;
            pVar3 = c11;
            pVar2 = pVar9;
        }
        int c14 = a9.a.c((((pVar3.c() + pVar4.c()) + pVar2.c()) + pVar.c()) / 4.0f);
        int c15 = a9.a.c((((pVar3.d() + pVar4.d()) + pVar2.d()) + pVar.d()) / 4.0f);
        try {
            p[] c16 = new a9.b(this.f31418a, 15, c14, c15).c();
            pVar6 = c16[0];
            pVar5 = c16[1];
            pVar7 = c16[2];
            pVar8 = c16[3];
        } catch (j unused2) {
            int i14 = c14 + 7;
            int i15 = c15 - 7;
            pVar6 = j(new C0352a(i14, i15), false, 1, -1).c();
            int i16 = c15 + 7;
            pVar5 = j(new C0352a(i14, i16), false, 1, 1).c();
            int i17 = c14 - 7;
            pVar7 = j(new C0352a(i17, i16), false, -1, 1).c();
            pVar8 = j(new C0352a(i17, i15), false, -1, -1).c();
        }
        return new C0352a(a9.a.c((((pVar6.c() + pVar8.c()) + pVar5.c()) + pVar7.c()) / 4.0f), a9.a.c((((pVar6.d() + pVar8.d()) + pVar5.d()) + pVar7.d()) / 4.0f));
    }

    private p[] l(p[] pVarArr) {
        return d(pVarArr, (float) (this.f31422e * 2), (float) i());
    }

    private static int m(int[] iArr, int i10) throws j {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 = (i11 << 3) + ((i12 >> (i10 - 2)) << 1) + (i12 & 1);
        }
        int i13 = ((i11 & 1) << 11) + (i11 >> 1);
        for (int i14 = 0; i14 < 4; i14++) {
            if (Integer.bitCount(f31417g[i14] ^ i13) <= 2) {
                return i14;
            }
        }
        throw j.a();
    }

    private boolean n(int i10, int i11) {
        return i10 >= 0 && i10 < this.f31418a.k() && i11 > 0 && i11 < this.f31418a.g();
    }

    private boolean o(p pVar) {
        return n(a9.a.c(pVar.c()), a9.a.c(pVar.d()));
    }

    private boolean p(C0352a aVar, C0352a aVar2, C0352a aVar3, C0352a aVar4) {
        C0352a aVar5 = new C0352a(aVar.a() - 3, aVar.b() + 3);
        C0352a aVar6 = new C0352a(aVar2.a() - 3, aVar2.b() - 3);
        C0352a aVar7 = new C0352a(aVar3.a() + 3, aVar3.b() - 3);
        C0352a aVar8 = new C0352a(aVar4.a() + 3, aVar4.b() + 3);
        int g10 = g(aVar8, aVar5);
        if (g10 != 0 && g(aVar5, aVar6) == g10 && g(aVar6, aVar7) == g10 && g(aVar7, aVar8) == g10) {
            return true;
        }
        return false;
    }

    private b q(b bVar, p pVar, p pVar2, p pVar3, p pVar4) throws j {
        i b10 = i.b();
        int i10 = i();
        int i11 = i10;
        int i12 = i10;
        float f10 = ((float) i10) / 2.0f;
        int i13 = this.f31422e;
        float f11 = f10 - ((float) i13);
        float f12 = f10 + ((float) i13);
        return b10.c(bVar, i12, i11, f11, f11, f12, f11, f12, f12, f11, f12, pVar.c(), pVar.d(), pVar2.c(), pVar2.d(), pVar3.c(), pVar3.d(), pVar4.c(), pVar4.d());
    }

    private int r(p pVar, p pVar2, int i10) {
        float b10 = b(pVar, pVar2);
        float f10 = b10 / ((float) i10);
        float c10 = pVar.c();
        float d10 = pVar.d();
        float c11 = ((pVar2.c() - pVar.c()) * f10) / b10;
        float d11 = (f10 * (pVar2.d() - pVar.d())) / b10;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float f11 = (float) i12;
            if (this.f31418a.d(a9.a.c((f11 * c11) + c10), a9.a.c((f11 * d11) + d10))) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }

    public w8.a a(boolean z10) throws j {
        p[] f10 = f(k());
        if (z10) {
            p pVar = f10[0];
            f10[0] = f10[2];
            f10[2] = pVar;
        }
        e(f10);
        b bVar = this.f31418a;
        int i10 = this.f31423f;
        return new w8.a(q(bVar, f10[i10 % 4], f10[(i10 + 1) % 4], f10[(i10 + 2) % 4], f10[(i10 + 3) % 4]), l(f10), this.f31419b, this.f31421d, this.f31420c);
    }
}
