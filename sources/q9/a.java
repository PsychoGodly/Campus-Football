package q9;

import v8.f;
import z8.b;

/* compiled from: BitMatrixParser */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f29709a;

    /* renamed from: b  reason: collision with root package name */
    private j f29710b;

    /* renamed from: c  reason: collision with root package name */
    private g f29711c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f29712d;

    a(b bVar) throws f {
        int g10 = bVar.g();
        if (g10 < 21 || (g10 & 3) != 1) {
            throw f.a();
        }
        this.f29709a = bVar;
    }

    private int a(int i10, int i11, int i12) {
        return this.f29712d ? this.f29709a.d(i11, i10) : this.f29709a.d(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int i10 = 0;
        while (i10 < this.f29709a.k()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f29709a.g(); i12++) {
                if (this.f29709a.d(i10, i12) != this.f29709a.d(i12, i10)) {
                    this.f29709a.c(i12, i10);
                    this.f29709a.c(i10, i12);
                }
            }
            i10 = i11;
        }
    }

    /* access modifiers changed from: package-private */
    public byte[] c() throws f {
        g d10 = d();
        j e10 = e();
        c cVar = c.values()[d10.c()];
        int g10 = this.f29709a.g();
        cVar.c(this.f29709a, g10);
        b a10 = e10.a();
        byte[] bArr = new byte[e10.h()];
        int i10 = g10 - 1;
        boolean z10 = true;
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 > 0) {
            if (i11 == 6) {
                i11--;
            }
            for (int i15 = 0; i15 < g10; i15++) {
                int i16 = z10 ? i10 - i15 : i15;
                for (int i17 = 0; i17 < 2; i17++) {
                    int i18 = i11 - i17;
                    if (!a10.d(i18, i16)) {
                        i13++;
                        i14 <<= 1;
                        if (this.f29709a.d(i18, i16)) {
                            i14 |= 1;
                        }
                        if (i13 == 8) {
                            bArr[i12] = (byte) i14;
                            i12++;
                            i13 = 0;
                            i14 = 0;
                        }
                    }
                }
            }
            z10 = !z10;
            i11 -= 2;
        }
        if (i12 == e10.h()) {
            return bArr;
        }
        throw f.a();
    }

    /* access modifiers changed from: package-private */
    public g d() throws f {
        g gVar = this.f29711c;
        if (gVar != null) {
            return gVar;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 = a(i12, 8, i11);
        }
        int a10 = a(8, 7, a(8, 8, a(7, 8, i11)));
        for (int i13 = 5; i13 >= 0; i13--) {
            a10 = a(8, i13, a10);
        }
        int g10 = this.f29709a.g();
        int i14 = g10 - 7;
        for (int i15 = g10 - 1; i15 >= i14; i15--) {
            i10 = a(8, i15, i10);
        }
        for (int i16 = g10 - 8; i16 < g10; i16++) {
            i10 = a(i16, 8, i10);
        }
        g a11 = g.a(a10, i10);
        this.f29711c = a11;
        if (a11 != null) {
            return a11;
        }
        throw f.a();
    }

    /* access modifiers changed from: package-private */
    public j e() throws f {
        j jVar = this.f29710b;
        if (jVar != null) {
            return jVar;
        }
        int g10 = this.f29709a.g();
        int i10 = (g10 - 17) / 4;
        if (i10 <= 6) {
            return j.i(i10);
        }
        int i11 = g10 - 11;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = g10 - 9; i15 >= i11; i15--) {
                i13 = a(i15, i14, i13);
            }
        }
        j c10 = j.c(i13);
        if (c10 == null || c10.e() != g10) {
            for (int i16 = 5; i16 >= 0; i16--) {
                for (int i17 = g10 - 9; i17 >= i11; i17--) {
                    i12 = a(i16, i17, i12);
                }
            }
            j c11 = j.c(i12);
            if (c11 == null || c11.e() != g10) {
                throw f.a();
            }
            this.f29710b = c11;
            return c11;
        }
        this.f29710b = c10;
        return c10;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (this.f29711c != null) {
            c.values()[this.f29711c.c()].c(this.f29709a, this.f29709a.g());
        }
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z10) {
        this.f29710b = null;
        this.f29711c = null;
        this.f29712d = z10;
    }
}
