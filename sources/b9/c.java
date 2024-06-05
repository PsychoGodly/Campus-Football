package b9;

/* compiled from: ReedSolomonDecoder */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final a f24291a;

    public c(a aVar) {
        this.f24291a = aVar;
    }

    private int[] b(b bVar) throws d {
        int d10 = bVar.d();
        int i10 = 0;
        if (d10 == 1) {
            return new int[]{bVar.c(1)};
        }
        int[] iArr = new int[d10];
        for (int i11 = 1; i11 < this.f24291a.f() && i10 < d10; i11++) {
            if (bVar.b(i11) == 0) {
                iArr[i10] = this.f24291a.h(i11);
                i10++;
            }
        }
        if (i10 == d10) {
            return iArr;
        }
        throw new d("Error locator degree does not match number of roots");
    }

    private int[] c(b bVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            int h10 = this.f24291a.h(iArr[i10]);
            int i11 = 1;
            for (int i12 = 0; i12 < length; i12++) {
                if (i10 != i12) {
                    int j10 = this.f24291a.j(iArr[i12], h10);
                    i11 = this.f24291a.j(i11, (j10 & 1) == 0 ? j10 | 1 : j10 & -2);
                }
            }
            iArr2[i10] = this.f24291a.j(bVar.b(h10), this.f24291a.h(i11));
            if (this.f24291a.d() != 0) {
                iArr2[i10] = this.f24291a.j(iArr2[i10], h10);
            }
        }
        return iArr2;
    }

    private b[] d(b bVar, b bVar2, int i10) throws d {
        if (bVar.d() < bVar2.d()) {
            b bVar3 = bVar2;
            bVar2 = bVar;
            bVar = bVar3;
        }
        b g10 = this.f24291a.g();
        b e10 = this.f24291a.e();
        do {
            b bVar4 = r11;
            r11 = bVar;
            bVar = bVar4;
            b bVar5 = e10;
            b bVar6 = g10;
            g10 = bVar5;
            if (bVar.d() < i10 / 2) {
                int c10 = g10.c(0);
                if (c10 != 0) {
                    int h10 = this.f24291a.h(c10);
                    return new b[]{g10.f(h10), bVar.f(h10)};
                }
                throw new d("sigmaTilde(0) was zero");
            } else if (!bVar.e()) {
                b g11 = this.f24291a.g();
                int h11 = this.f24291a.h(bVar.c(bVar.d()));
                while (r11.d() >= bVar.d() && !r11.e()) {
                    int d10 = r11.d() - bVar.d();
                    int j10 = this.f24291a.j(r11.c(r11.d()), h11);
                    g11 = g11.a(this.f24291a.b(d10, j10));
                    r11 = r11.a(bVar.h(d10, j10));
                }
                e10 = g11.g(g10).a(bVar6);
            } else {
                throw new d("r_{i-1} was zero");
            }
        } while (r11.d() < bVar.d());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    public void a(int[] iArr, int i10) throws d {
        b bVar = new b(this.f24291a, iArr);
        int[] iArr2 = new int[i10];
        int i11 = 0;
        boolean z10 = true;
        for (int i12 = 0; i12 < i10; i12++) {
            a aVar = this.f24291a;
            int b10 = bVar.b(aVar.c(aVar.d() + i12));
            iArr2[(i10 - 1) - i12] = b10;
            if (b10 != 0) {
                z10 = false;
            }
        }
        if (!z10) {
            b[] d10 = d(this.f24291a.b(i10, 1), new b(this.f24291a, iArr2), i10);
            b bVar2 = d10[0];
            b bVar3 = d10[1];
            int[] b11 = b(bVar2);
            int[] c10 = c(bVar3, b11);
            while (i11 < b11.length) {
                int length = (iArr.length - 1) - this.f24291a.i(b11[i11]);
                if (length >= 0) {
                    iArr[length] = a.a(iArr[length], c10[i11]);
                    i11++;
                } else {
                    throw new d("Bad error location");
                }
            }
        }
    }
}
