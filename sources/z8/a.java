package z8;

import java.util.Arrays;

/* compiled from: BitArray */
public final class a implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private int[] f31450a;

    /* renamed from: b  reason: collision with root package name */
    private int f31451b;

    public a() {
        this.f31451b = 0;
        this.f31450a = new int[1];
    }

    private static int[] j(int i10) {
        return new int[((i10 + 31) / 32)];
    }

    public void a() {
        int length = this.f31450a.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f31450a[i10] = 0;
        }
    }

    /* renamed from: b */
    public a clone() {
        return new a((int[]) this.f31450a.clone(), this.f31451b);
    }

    public boolean c(int i10) {
        return ((1 << (i10 & 31)) & this.f31450a[i10 / 32]) != 0;
    }

    public int[] d() {
        return this.f31450a;
    }

    public int e(int i10) {
        int i11 = this.f31451b;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (~((1 << (i10 & 31)) - 1)) & this.f31450a[i12];
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f31450a;
            if (i12 == iArr.length) {
                return this.f31451b;
            }
            i13 = iArr[i12];
        }
        int numberOfTrailingZeros = (i12 << 5) + Integer.numberOfTrailingZeros(i13);
        int i14 = this.f31451b;
        return numberOfTrailingZeros > i14 ? i14 : numberOfTrailingZeros;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f31451b != aVar.f31451b || !Arrays.equals(this.f31450a, aVar.f31450a)) {
            return false;
        }
        return true;
    }

    public int f(int i10) {
        int i11 = this.f31451b;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (~((1 << (i10 & 31)) - 1)) & (~this.f31450a[i12]);
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f31450a;
            if (i12 == iArr.length) {
                return this.f31451b;
            }
            i13 = ~iArr[i12];
        }
        int numberOfTrailingZeros = (i12 << 5) + Integer.numberOfTrailingZeros(i13);
        int i14 = this.f31451b;
        return numberOfTrailingZeros > i14 ? i14 : numberOfTrailingZeros;
    }

    public int g() {
        return this.f31451b;
    }

    public int hashCode() {
        return (this.f31451b * 31) + Arrays.hashCode(this.f31450a);
    }

    public boolean i(int i10, int i11, boolean z10) {
        if (i11 < i10 || i10 < 0 || i11 > this.f31451b) {
            throw new IllegalArgumentException();
        } else if (i11 == i10) {
            return true;
        } else {
            int i12 = i11 - 1;
            int i13 = i10 / 32;
            int i14 = i12 / 32;
            int i15 = i13;
            while (i15 <= i14) {
                int i16 = 31;
                int i17 = i15 > i13 ? 0 : i10 & 31;
                if (i15 >= i14) {
                    i16 = 31 & i12;
                }
                int i18 = (2 << i16) - (1 << i17);
                int i19 = this.f31450a[i15] & i18;
                if (!z10) {
                    i18 = 0;
                }
                if (i19 != i18) {
                    return false;
                }
                i15++;
            }
            return true;
        }
    }

    public void k() {
        int[] iArr = new int[this.f31450a.length];
        int i10 = (this.f31451b - 1) / 32;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = (long) this.f31450a[i12];
            long j11 = ((j10 & 1431655765) << 1) | ((j10 >> 1) & 1431655765);
            long j12 = ((j11 & 858993459) << 2) | ((j11 >> 2) & 858993459);
            long j13 = ((j12 & 252645135) << 4) | ((j12 >> 4) & 252645135);
            long j14 = ((j13 & 16711935) << 8) | ((j13 >> 8) & 16711935);
            iArr[i10 - i12] = (int) (((j14 & 65535) << 16) | ((j14 >> 16) & 65535));
        }
        int i13 = this.f31451b;
        int i14 = i11 << 5;
        if (i13 != i14) {
            int i15 = i14 - i13;
            int i16 = iArr[0] >>> i15;
            for (int i17 = 1; i17 < i11; i17++) {
                int i18 = iArr[i17];
                iArr[i17 - 1] = i16 | (i18 << (32 - i15));
                i16 = i18 >>> i15;
            }
            iArr[i11 - 1] = i16;
        }
        this.f31450a = iArr;
    }

    public void l(int i10) {
        int[] iArr = this.f31450a;
        int i11 = i10 / 32;
        iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
    }

    public void m(int i10, int i11) {
        this.f31450a[i10 / 32] = i11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f31451b);
        for (int i10 = 0; i10 < this.f31451b; i10++) {
            if ((i10 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(c(i10) ? 'X' : '.');
        }
        return sb2.toString();
    }

    public a(int i10) {
        this.f31451b = i10;
        this.f31450a = j(i10);
    }

    a(int[] iArr, int i10) {
        this.f31450a = iArr;
        this.f31451b = i10;
    }
}
