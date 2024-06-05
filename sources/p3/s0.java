package p3;

import java.util.Arrays;
import java.util.Random;

/* compiled from: ShuffleOrder */
public interface s0 {

    /* compiled from: ShuffleOrder */
    public static class a implements s0 {

        /* renamed from: a  reason: collision with root package name */
        private final Random f21639a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f21640b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f21641c;

        public a(int i10) {
            this(i10, new Random());
        }

        private static int[] a(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int nextInt = random.nextInt(i12);
                iArr[i11] = iArr[nextInt];
                iArr[nextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        public int b() {
            return this.f21640b.length;
        }

        public s0 c(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[(this.f21640b.length - i12)];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f21640b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f21639a.nextLong()));
                }
                if (iArr2[i13] < i10 || iArr2[i13] >= i11) {
                    iArr[i13 - i14] = iArr2[i13] >= i10 ? iArr2[i13] - i12 : iArr2[i13];
                } else {
                    i14++;
                }
                i13++;
            }
        }

        public int d() {
            int[] iArr = this.f21640b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        public int e(int i10) {
            int i11 = this.f21641c[i10] - 1;
            if (i11 >= 0) {
                return this.f21640b[i11];
            }
            return -1;
        }

        public int f(int i10) {
            int i11 = this.f21641c[i10] + 1;
            int[] iArr = this.f21640b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        public s0 g(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f21639a.nextInt(this.f21640b.length + 1);
                int i14 = i13 + 1;
                int nextInt = this.f21639a.nextInt(i14);
                iArr2[i13] = iArr2[nextInt];
                iArr2[nextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[(this.f21640b.length + i11)];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f21640b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f21639a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    iArr3[i12] = iArr4[i16];
                    if (iArr3[i12] >= i10) {
                        iArr3[i12] = iArr3[i12] + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        public int h() {
            int[] iArr = this.f21640b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        public s0 i() {
            return new a(0, new Random(this.f21639a.nextLong()));
        }

        public a(int[] iArr, long j10) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j10));
        }

        private a(int i10, Random random) {
            this(a(i10, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f21640b = iArr;
            this.f21639a = random;
            this.f21641c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f21641c[iArr[i10]] = i10;
            }
        }
    }

    int b();

    s0 c(int i10, int i11);

    int d();

    int e(int i10);

    int f(int i10);

    s0 g(int i10, int i11);

    int h();

    s0 i();
}
