package k4;

/* compiled from: ParsableNalUnitBitArray */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f19677a;

    /* renamed from: b  reason: collision with root package name */
    private int f19678b;

    /* renamed from: c  reason: collision with root package name */
    private int f19679c;

    /* renamed from: d  reason: collision with root package name */
    private int f19680d;

    public b0(byte[] bArr, int i10, int i11) {
        i(bArr, i10, i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f19678b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r2 = this;
            int r0 = r2.f19679c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f19678b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f19680d
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            k4.a.f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.b0.a():void");
    }

    private int f() {
        int i10 = 0;
        int i11 = 0;
        while (!d()) {
            i11++;
        }
        int i12 = (1 << i11) - 1;
        if (i11 > 0) {
            i10 = e(i11);
        }
        return i12 + i10;
    }

    private boolean j(int i10) {
        if (2 <= i10 && i10 < this.f19678b) {
            byte[] bArr = this.f19677a;
            return bArr[i10] == 3 && bArr[i10 + -2] == 0 && bArr[i10 - 1] == 0;
        }
    }

    public boolean b(int i10) {
        int i11 = this.f19679c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f19680d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f19678b) {
                int i15 = this.f19678b;
            } else if (j(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i152 = this.f19678b;
        if (i13 < i152) {
            return true;
        }
        if (i13 == i152 && i14 == 0) {
            return true;
        }
        return false;
    }

    public boolean c() {
        int i10 = this.f19679c;
        int i11 = this.f19680d;
        int i12 = 0;
        while (this.f19679c < this.f19678b && !d()) {
            i12++;
        }
        boolean z10 = this.f19679c == this.f19678b;
        this.f19679c = i10;
        this.f19680d = i11;
        if (z10 || !b((i12 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public boolean d() {
        boolean z10 = (this.f19677a[this.f19679c] & (128 >> this.f19680d)) != 0;
        k();
        return z10;
    }

    public int e(int i10) {
        int i11;
        int i12;
        this.f19680d += i10;
        int i13 = 0;
        while (true) {
            i11 = this.f19680d;
            i12 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f19680d = i14;
            byte[] bArr = this.f19677a;
            int i15 = this.f19679c;
            i13 |= (bArr[i15] & 255) << i14;
            if (!j(i15 + 1)) {
                i12 = 1;
            }
            this.f19679c = i15 + i12;
        }
        byte[] bArr2 = this.f19677a;
        int i16 = this.f19679c;
        int i17 = (-1 >>> (32 - i10)) & (i13 | ((bArr2[i16] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f19680d = 0;
            if (!j(i16 + 1)) {
                i12 = 1;
            }
            this.f19679c = i16 + i12;
        }
        a();
        return i17;
    }

    public int g() {
        int f10 = f();
        return (f10 % 2 == 0 ? -1 : 1) * ((f10 + 1) / 2);
    }

    public int h() {
        return f();
    }

    public void i(byte[] bArr, int i10, int i11) {
        this.f19677a = bArr;
        this.f19679c = i10;
        this.f19678b = i11;
        this.f19680d = 0;
        a();
    }

    public void k() {
        int i10 = 1;
        int i11 = this.f19680d + 1;
        this.f19680d = i11;
        if (i11 == 8) {
            this.f19680d = 0;
            int i12 = this.f19679c;
            if (j(i12 + 1)) {
                i10 = 2;
            }
            this.f19679c = i12 + i10;
        }
        a();
    }

    public void l(int i10) {
        int i11 = this.f19679c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f19679c = i13;
        int i14 = this.f19680d + (i10 - (i12 * 8));
        this.f19680d = i14;
        if (i14 > 7) {
            this.f19679c = i13 + 1;
            this.f19680d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f19679c) {
                a();
                return;
            } else if (j(i11)) {
                this.f19679c++;
                i11 += 2;
            }
        }
    }
}
