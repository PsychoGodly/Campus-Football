package n9;

import v8.d;

/* compiled from: ErrorCorrection */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f29470a = b.f29471f;

    private int[] b(c cVar) throws d {
        int d10 = cVar.d();
        int[] iArr = new int[d10];
        int i10 = 0;
        for (int i11 = 1; i11 < this.f29470a.e() && i10 < d10; i11++) {
            if (cVar.b(i11) == 0) {
                iArr[i10] = this.f29470a.g(i11);
                i10++;
            }
        }
        if (i10 == d10) {
            return iArr;
        }
        throw d.a();
    }

    private int[] c(c cVar, c cVar2, int[] iArr) {
        int d10 = cVar2.d();
        int[] iArr2 = new int[d10];
        for (int i10 = 1; i10 <= d10; i10++) {
            iArr2[d10 - i10] = this.f29470a.i(i10, cVar2.c(i10));
        }
        c cVar3 = new c(this.f29470a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            int g10 = this.f29470a.g(iArr[i11]);
            iArr3[i11] = this.f29470a.i(this.f29470a.j(0, cVar.b(g10)), this.f29470a.g(cVar3.b(g10)));
        }
        return iArr3;
    }

    private c[] d(c cVar, c cVar2, int i10) throws d {
        if (cVar.d() < cVar2.d()) {
            c cVar3 = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        c f10 = this.f29470a.f();
        c d10 = this.f29470a.d();
        while (true) {
            c cVar4 = r11;
            r11 = cVar;
            cVar = cVar4;
            c cVar5 = d10;
            c cVar6 = f10;
            f10 = cVar5;
            if (cVar.d() < i10 / 2) {
                int c10 = f10.c(0);
                if (c10 != 0) {
                    int g10 = this.f29470a.g(c10);
                    return new c[]{f10.f(g10), cVar.f(g10)};
                }
                throw d.a();
            } else if (!cVar.e()) {
                c f11 = this.f29470a.f();
                int g11 = this.f29470a.g(cVar.c(cVar.d()));
                while (r11.d() >= cVar.d() && !r11.e()) {
                    int d11 = r11.d() - cVar.d();
                    int i11 = this.f29470a.i(r11.c(r11.d()), g11);
                    f11 = f11.a(this.f29470a.b(d11, i11));
                    r11 = r11.j(cVar.h(d11, i11));
                }
                d10 = f11.g(f10).j(cVar6).i();
            } else {
                throw d.a();
            }
        }
    }

    public int a(int[] iArr, int i10, int[] iArr2) throws d {
        c cVar = new c(this.f29470a, iArr);
        int[] iArr3 = new int[i10];
        int i11 = 0;
        boolean z10 = false;
        for (int i12 = i10; i12 > 0; i12--) {
            int b10 = cVar.b(this.f29470a.c(i12));
            iArr3[i10 - i12] = b10;
            if (b10 != 0) {
                z10 = true;
            }
        }
        if (!z10) {
            return 0;
        }
        c d10 = this.f29470a.d();
        if (iArr2 != null) {
            for (int length : iArr2) {
                int c10 = this.f29470a.c((iArr.length - 1) - length);
                b bVar = this.f29470a;
                d10 = d10.g(new c(bVar, new int[]{bVar.j(0, c10), 1}));
            }
        }
        c[] d11 = d(this.f29470a.b(i10, 1), new c(this.f29470a, iArr3), i10);
        c cVar2 = d11[0];
        c cVar3 = d11[1];
        int[] b11 = b(cVar2);
        int[] c11 = c(cVar3, cVar2, b11);
        while (i11 < b11.length) {
            int length2 = (iArr.length - 1) - this.f29470a.h(b11[i11]);
            if (length2 >= 0) {
                iArr[length2] = this.f29470a.j(iArr[length2], c11[i11]);
                i11++;
            } else {
                throw d.a();
            }
        }
        return b11.length;
    }
}
