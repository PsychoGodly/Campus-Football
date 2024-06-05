package z8;

import java.util.Arrays;

/* compiled from: BitMatrix */
public final class b implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private final int f31452a;

    /* renamed from: b  reason: collision with root package name */
    private final int f31453b;

    /* renamed from: c  reason: collision with root package name */
    private final int f31454c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f31455d;

    public b(int i10) {
        this(i10, i10);
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f31453b * (this.f31452a + 1));
        for (int i10 = 0; i10 < this.f31453b; i10++) {
            for (int i11 = 0; i11 < this.f31452a; i11++) {
                sb2.append(d(i11, i10) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public b clone() {
        return new b(this.f31452a, this.f31453b, this.f31454c, (int[]) this.f31455d.clone());
    }

    public void c(int i10, int i11) {
        int i12 = (i11 * this.f31454c) + (i10 / 32);
        int[] iArr = this.f31455d;
        iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
    }

    public boolean d(int i10, int i11) {
        return ((this.f31455d[(i11 * this.f31454c) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    public int[] e() {
        int length = this.f31455d.length - 1;
        while (length >= 0 && this.f31455d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i10 = this.f31454c;
        int i11 = length / i10;
        int i12 = (length % i10) << 5;
        int i13 = 31;
        while ((this.f31455d[length] >>> i13) == 0) {
            i13--;
        }
        return new int[]{i12 + i13, i11};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f31452a == bVar.f31452a && this.f31453b == bVar.f31453b && this.f31454c == bVar.f31454c && Arrays.equals(this.f31455d, bVar.f31455d)) {
            return true;
        }
        return false;
    }

    public int[] f() {
        int i10 = this.f31452a;
        int i11 = this.f31453b;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < this.f31453b; i14++) {
            int i15 = 0;
            while (true) {
                int i16 = this.f31454c;
                if (i15 >= i16) {
                    break;
                }
                int i17 = this.f31455d[(i16 * i14) + i15];
                if (i17 != 0) {
                    if (i14 < i11) {
                        i11 = i14;
                    }
                    if (i14 > i13) {
                        i13 = i14;
                    }
                    int i18 = i15 << 5;
                    if (i18 < i10) {
                        int i19 = 0;
                        while ((i17 << (31 - i19)) == 0) {
                            i19++;
                        }
                        int i20 = i19 + i18;
                        if (i20 < i10) {
                            i10 = i20;
                        }
                    }
                    if (i18 + 31 > i12) {
                        int i21 = 31;
                        while ((i17 >>> i21) == 0) {
                            i21--;
                        }
                        int i22 = i18 + i21;
                        if (i22 > i12) {
                            i12 = i22;
                        }
                    }
                }
                i15++;
            }
        }
        if (i12 < i10 || i13 < i11) {
            return null;
        }
        return new int[]{i10, i11, (i12 - i10) + 1, (i13 - i11) + 1};
    }

    public int g() {
        return this.f31453b;
    }

    public int hashCode() {
        int i10 = this.f31452a;
        return (((((((i10 * 31) + i10) * 31) + this.f31453b) * 31) + this.f31454c) * 31) + Arrays.hashCode(this.f31455d);
    }

    public a i(int i10, a aVar) {
        if (aVar == null || aVar.g() < this.f31452a) {
            aVar = new a(this.f31452a);
        } else {
            aVar.a();
        }
        int i11 = i10 * this.f31454c;
        for (int i12 = 0; i12 < this.f31454c; i12++) {
            aVar.m(i12 << 5, this.f31455d[i11 + i12]);
        }
        return aVar;
    }

    public int[] j() {
        int[] iArr;
        int i10 = 0;
        while (true) {
            iArr = this.f31455d;
            if (i10 < iArr.length && iArr[i10] == 0) {
                i10++;
            }
        }
        if (i10 == iArr.length) {
            return null;
        }
        int i11 = this.f31454c;
        int i12 = i10 / i11;
        int i13 = (i10 % i11) << 5;
        int i14 = iArr[i10];
        int i15 = 0;
        while ((i14 << (31 - i15)) == 0) {
            i15++;
        }
        return new int[]{i13 + i15, i12};
    }

    public int k() {
        return this.f31452a;
    }

    public void l() {
        int k10 = k();
        int g10 = g();
        a aVar = new a(k10);
        a aVar2 = new a(k10);
        for (int i10 = 0; i10 < (g10 + 1) / 2; i10++) {
            aVar = i(i10, aVar);
            int i11 = (g10 - 1) - i10;
            aVar2 = i(i11, aVar2);
            aVar.k();
            aVar2.k();
            p(i10, aVar2);
            p(i11, aVar);
        }
    }

    public void m(int i10, int i11) {
        int i12 = (i11 * this.f31454c) + (i10 / 32);
        int[] iArr = this.f31455d;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public void o(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i13 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i14 = i12 + i10;
            int i15 = i13 + i11;
            if (i15 > this.f31453b || i14 > this.f31452a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i11 < i15) {
                int i16 = this.f31454c * i11;
                for (int i17 = i10; i17 < i14; i17++) {
                    int[] iArr = this.f31455d;
                    int i18 = (i17 / 32) + i16;
                    iArr[i18] = iArr[i18] | (1 << (i17 & 31));
                }
                i11++;
            }
        }
    }

    public void p(int i10, a aVar) {
        int[] d10 = aVar.d();
        int[] iArr = this.f31455d;
        int i11 = this.f31454c;
        System.arraycopy(d10, 0, iArr, i10 * i11, i11);
    }

    public String r(String str, String str2) {
        return a(str, str2, "\n");
    }

    public String toString() {
        return r("X ", "  ");
    }

    public b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f31452a = i10;
        this.f31453b = i11;
        int i12 = (i10 + 31) / 32;
        this.f31454c = i12;
        this.f31455d = new int[(i12 * i11)];
    }

    private b(int i10, int i11, int i12, int[] iArr) {
        this.f31452a = i10;
        this.f31453b = i11;
        this.f31454c = i12;
        this.f31455d = iArr;
    }
}
