package b9;

/* compiled from: GenericGFPoly */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final a f24289a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f24290b;

    b(a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f24289a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f24290b = iArr;
                return;
            }
            int i10 = 1;
            while (i10 < length && iArr[i10] == 0) {
                i10++;
            }
            if (i10 == length) {
                this.f24290b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i10)];
            this.f24290b = iArr2;
            System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public b a(b bVar) {
        if (!this.f24289a.equals(bVar.f24289a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (e()) {
            return bVar;
        } else {
            if (bVar.e()) {
                return this;
            }
            int[] iArr = this.f24290b;
            int[] iArr2 = bVar.f24290b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i10 = length; i10 < iArr.length; i10++) {
                iArr4[i10] = a.a(iArr2[i10 - length], iArr[i10]);
            }
            return new b(this.f24289a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    public int b(int i10) {
        if (i10 == 0) {
            return c(0);
        }
        if (i10 == 1) {
            int i11 = 0;
            for (int a10 : this.f24290b) {
                i11 = a.a(i11, a10);
            }
            return i11;
        }
        int[] iArr = this.f24290b;
        int i12 = iArr[0];
        int length = iArr.length;
        for (int i13 = 1; i13 < length; i13++) {
            i12 = a.a(this.f24289a.j(i10, i12), this.f24290b[i13]);
        }
        return i12;
    }

    /* access modifiers changed from: package-private */
    public int c(int i10) {
        int[] iArr = this.f24290b;
        return iArr[(iArr.length - 1) - i10];
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f24290b.length - 1;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f24290b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    public b f(int i10) {
        if (i10 == 0) {
            return this.f24289a.g();
        }
        if (i10 == 1) {
            return this;
        }
        int length = this.f24290b.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.f24289a.j(this.f24290b[i11], i10);
        }
        return new b(this.f24289a, iArr);
    }

    /* access modifiers changed from: package-private */
    public b g(b bVar) {
        if (!this.f24289a.equals(bVar.f24289a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (e() || bVar.e()) {
            return this.f24289a.g();
        } else {
            int[] iArr = this.f24290b;
            int length = iArr.length;
            int[] iArr2 = bVar.f24290b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArr[i10];
                for (int i12 = 0; i12 < length2; i12++) {
                    int i13 = i10 + i12;
                    iArr3[i13] = a.a(iArr3[i13], this.f24289a.j(i11, iArr2[i12]));
                }
            }
            return new b(this.f24289a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    public b h(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        } else if (i11 == 0) {
            return this.f24289a.g();
        } else {
            int length = this.f24290b.length;
            int[] iArr = new int[(i10 + length)];
            for (int i12 = 0; i12 < length; i12++) {
                iArr[i12] = this.f24289a.j(this.f24290b[i12], i11);
            }
            return new b(this.f24289a, iArr);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(d() * 8);
        for (int d10 = d(); d10 >= 0; d10--) {
            int c10 = c(d10);
            if (c10 != 0) {
                if (c10 < 0) {
                    sb2.append(" - ");
                    c10 = -c10;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (d10 == 0 || c10 != 1) {
                    int i10 = this.f24289a.i(c10);
                    if (i10 == 0) {
                        sb2.append('1');
                    } else if (i10 == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(i10);
                    }
                }
                if (d10 != 0) {
                    if (d10 == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(d10);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
