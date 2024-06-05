package lf;

import java.util.Arrays;

/* compiled from: SegmentedByteString */
final class q extends f {

    /* renamed from: g  reason: collision with root package name */
    final transient byte[][] f36292g;

    /* renamed from: h  reason: collision with root package name */
    final transient int[] f36293h;

    q(c cVar, int i10) {
        super((byte[]) null);
        u.b(cVar.f36252b, 0, (long) i10);
        o oVar = cVar.f36251a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = oVar.f36285c;
            int i15 = oVar.f36284b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                oVar = oVar.f36288f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f36292g = new byte[i13][];
        this.f36293h = new int[(i13 * 2)];
        o oVar2 = cVar.f36251a;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.f36292g;
            bArr[i16] = oVar2.f36283a;
            int i17 = oVar2.f36285c;
            int i18 = oVar2.f36284b;
            i11 += i17 - i18;
            if (i11 > i10) {
                i11 = i10;
            }
            int[] iArr = this.f36293h;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            oVar2.f36286d = true;
            i16++;
            oVar2 = oVar2.f36288f;
        }
    }

    private int w(int i10) {
        int binarySearch = Arrays.binarySearch(this.f36293h, 0, this.f36292g.length, i10 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    private f x() {
        return new f(t());
    }

    public String a() {
        return x().a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.p() != p() || !l(0, fVar, 0, p())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f36257b;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f36292g.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < length) {
            byte[] bArr = this.f36292g[i11];
            int[] iArr = this.f36293h;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i12) + i14;
            while (i14 < i16) {
                i13 = (i13 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i12 = i15;
        }
        this.f36257b = i13;
        return i13;
    }

    public byte i(int i10) {
        int i11;
        u.b((long) this.f36293h[this.f36292g.length - 1], (long) i10, 1);
        int w10 = w(i10);
        if (w10 == 0) {
            i11 = 0;
        } else {
            i11 = this.f36293h[w10 - 1];
        }
        int[] iArr = this.f36293h;
        byte[][] bArr = this.f36292g;
        return bArr[w10][(i10 - i11) + iArr[bArr.length + w10]];
    }

    public String j() {
        return x().j();
    }

    public boolean l(int i10, f fVar, int i11, int i12) {
        int i13;
        if (i10 < 0 || i10 > p() - i12) {
            return false;
        }
        int w10 = w(i10);
        while (i12 > 0) {
            if (w10 == 0) {
                i13 = 0;
            } else {
                i13 = this.f36293h[w10 - 1];
            }
            int min = Math.min(i12, ((this.f36293h[w10] - i13) + i13) - i10);
            int[] iArr = this.f36293h;
            byte[][] bArr = this.f36292g;
            if (!fVar.m(i11, bArr[w10], (i10 - i13) + iArr[bArr.length + w10], min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            w10++;
        }
        return true;
    }

    public boolean m(int i10, byte[] bArr, int i11, int i12) {
        int i13;
        if (i10 < 0 || i10 > p() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int w10 = w(i10);
        while (i12 > 0) {
            if (w10 == 0) {
                i13 = 0;
            } else {
                i13 = this.f36293h[w10 - 1];
            }
            int min = Math.min(i12, ((this.f36293h[w10] - i13) + i13) - i10);
            int[] iArr = this.f36293h;
            byte[][] bArr2 = this.f36292g;
            if (!u.a(bArr2[w10], (i10 - i13) + iArr[bArr2.length + w10], bArr, i11, min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            w10++;
        }
        return true;
    }

    public f n() {
        return x().n();
    }

    public f o() {
        return x().o();
    }

    public int p() {
        return this.f36293h[this.f36292g.length - 1];
    }

    public f r(int i10, int i11) {
        return x().r(i10, i11);
    }

    public f s() {
        return x().s();
    }

    public byte[] t() {
        int[] iArr = this.f36293h;
        byte[][] bArr = this.f36292g;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.f36293h;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.f36292g[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    public String toString() {
        return x().toString();
    }

    public String u() {
        return x().u();
    }

    /* access modifiers changed from: package-private */
    public void v(c cVar) {
        int length = this.f36292g.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f36293h;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            o oVar = new o(this.f36292g[i10], i12, (i12 + i13) - i11, true, false);
            o oVar2 = cVar.f36251a;
            if (oVar2 == null) {
                oVar.f36289g = oVar;
                oVar.f36288f = oVar;
                cVar.f36251a = oVar;
            } else {
                oVar2.f36289g.c(oVar);
            }
            i10++;
            i11 = i13;
        }
        cVar.f36252b += (long) i11;
    }
}
