package m9;

import java.util.Formatter;

/* compiled from: DetectionResult */
final class f {

    /* renamed from: a  reason: collision with root package name */
    private final a f29279a;

    /* renamed from: b  reason: collision with root package name */
    private final g[] f29280b;

    /* renamed from: c  reason: collision with root package name */
    private c f29281c;

    /* renamed from: d  reason: collision with root package name */
    private final int f29282d;

    f(a aVar, c cVar) {
        this.f29279a = aVar;
        int a10 = aVar.a();
        this.f29282d = a10;
        this.f29281c = cVar;
        this.f29280b = new g[(a10 + 2)];
    }

    private void a(g gVar) {
        if (gVar != null) {
            ((h) gVar).g(this.f29279a);
        }
    }

    private static boolean b(d dVar, d dVar2) {
        if (dVar2 == null || !dVar2.g() || dVar2.a() != dVar.a()) {
            return false;
        }
        dVar.i(dVar2.c());
        return true;
    }

    private static int c(int i10, int i11, d dVar) {
        if (dVar == null || dVar.g()) {
            return i11;
        }
        if (!dVar.h(i10)) {
            return i11 + 1;
        }
        dVar.i(i10);
        return 0;
    }

    private int d() {
        int f10 = f();
        if (f10 == 0) {
            return 0;
        }
        for (int i10 = 1; i10 < this.f29282d + 1; i10++) {
            d[] d10 = this.f29280b[i10].d();
            for (int i11 = 0; i11 < d10.length; i11++) {
                if (d10[i11] != null && !d10[i11].g()) {
                    e(i10, i11, d10);
                }
            }
        }
        return f10;
    }

    private void e(int i10, int i11, d[] dVarArr) {
        d dVar = dVarArr[i11];
        d[] d10 = this.f29280b[i10 - 1].d();
        g[] gVarArr = this.f29280b;
        int i12 = i10 + 1;
        d[] d11 = gVarArr[i12] != null ? gVarArr[i12].d() : d10;
        d[] dVarArr2 = new d[14];
        dVarArr2[2] = d10[i11];
        dVarArr2[3] = d11[i11];
        int i13 = 0;
        if (i11 > 0) {
            int i14 = i11 - 1;
            dVarArr2[0] = dVarArr[i14];
            dVarArr2[4] = d10[i14];
            dVarArr2[5] = d11[i14];
        }
        if (i11 > 1) {
            int i15 = i11 - 2;
            dVarArr2[8] = dVarArr[i15];
            dVarArr2[10] = d10[i15];
            dVarArr2[11] = d11[i15];
        }
        if (i11 < dVarArr.length - 1) {
            int i16 = i11 + 1;
            dVarArr2[1] = dVarArr[i16];
            dVarArr2[6] = d10[i16];
            dVarArr2[7] = d11[i16];
        }
        if (i11 < dVarArr.length - 2) {
            int i17 = i11 + 2;
            dVarArr2[9] = dVarArr[i17];
            dVarArr2[12] = d10[i17];
            dVarArr2[13] = d11[i17];
        }
        while (i13 < 14 && !b(dVar, dVarArr2[i13])) {
            i13++;
        }
    }

    private int f() {
        g();
        return h() + i();
    }

    private void g() {
        g[] gVarArr = this.f29280b;
        if (gVarArr[0] != null && gVarArr[this.f29282d + 1] != null) {
            d[] d10 = gVarArr[0].d();
            d[] d11 = this.f29280b[this.f29282d + 1].d();
            for (int i10 = 0; i10 < d10.length; i10++) {
                if (!(d10[i10] == null || d11[i10] == null || d10[i10].c() != d11[i10].c())) {
                    for (int i11 = 1; i11 <= this.f29282d; i11++) {
                        d dVar = this.f29280b[i11].d()[i10];
                        if (dVar != null) {
                            dVar.i(d10[i10].c());
                            if (!dVar.g()) {
                                this.f29280b[i11].d()[i10] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    private int h() {
        g[] gVarArr = this.f29280b;
        if (gVarArr[0] == null) {
            return 0;
        }
        d[] d10 = gVarArr[0].d();
        int i10 = 0;
        for (int i11 = 0; i11 < d10.length; i11++) {
            if (d10[i11] != null) {
                int c10 = d10[i11].c();
                int i12 = 0;
                for (int i13 = 1; i13 < this.f29282d + 1 && i12 < 2; i13++) {
                    d dVar = this.f29280b[i13].d()[i11];
                    if (dVar != null) {
                        i12 = c(c10, i12, dVar);
                        if (!dVar.g()) {
                            i10++;
                        }
                    }
                }
            }
        }
        return i10;
    }

    private int i() {
        g[] gVarArr = this.f29280b;
        int i10 = this.f29282d;
        if (gVarArr[i10 + 1] == null) {
            return 0;
        }
        d[] d10 = gVarArr[i10 + 1].d();
        int i11 = 0;
        for (int i12 = 0; i12 < d10.length; i12++) {
            if (d10[i12] != null) {
                int c10 = d10[i12].c();
                int i13 = 0;
                for (int i14 = this.f29282d + 1; i14 > 0 && i13 < 2; i14--) {
                    d dVar = this.f29280b[i14].d()[i12];
                    if (dVar != null) {
                        i13 = c(c10, i13, dVar);
                        if (!dVar.g()) {
                            i11++;
                        }
                    }
                }
            }
        }
        return i11;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f29282d;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f29279a.b();
    }

    /* access modifiers changed from: package-private */
    public int l() {
        return this.f29279a.c();
    }

    /* access modifiers changed from: package-private */
    public c m() {
        return this.f29281c;
    }

    /* access modifiers changed from: package-private */
    public g n(int i10) {
        return this.f29280b[i10];
    }

    /* access modifiers changed from: package-private */
    public g[] o() {
        a(this.f29280b[0]);
        a(this.f29280b[this.f29282d + 1]);
        int i10 = 928;
        while (true) {
            int d10 = d();
            if (d10 > 0 && d10 < i10) {
                i10 = d10;
            }
        }
        return this.f29280b;
    }

    public void p(c cVar) {
        this.f29281c = cVar;
    }

    /* access modifiers changed from: package-private */
    public void q(int i10, g gVar) {
        this.f29280b[i10] = gVar;
    }

    public String toString() {
        g[] gVarArr = this.f29280b;
        g gVar = gVarArr[0];
        if (gVar == null) {
            gVar = gVarArr[this.f29282d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i10 = 0; i10 < gVar.d().length; i10++) {
            formatter.format("CW %3d:", new Object[]{Integer.valueOf(i10)});
            for (int i11 = 0; i11 < this.f29282d + 2; i11++) {
                g[] gVarArr2 = this.f29280b;
                if (gVarArr2[i11] == null) {
                    formatter.format("    |   ", new Object[0]);
                } else {
                    d dVar = gVarArr2[i11].d()[i10];
                    if (dVar == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        formatter.format(" %3d|%3d", new Object[]{Integer.valueOf(dVar.c()), Integer.valueOf(dVar.e())});
                    }
                }
            }
            formatter.format("%n", new Object[0]);
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
