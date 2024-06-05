package com.applovin.impl;

import java.util.Arrays;
import java.util.Random;

public interface tj {

    public static class a implements tj {

        /* renamed from: a  reason: collision with root package name */
        private final Random f12409a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f12410b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f12411c;

        public a(int i10) {
            this(i10, new Random());
        }

        public tj a(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[(this.f12410b.length - i12)];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f12410b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f12409a.nextLong()));
                }
                int i15 = iArr2[i13];
                if (i15 < i10 || i15 >= i11) {
                    int i16 = i13 - i14;
                    if (i15 >= i10) {
                        i15 -= i12;
                    }
                    iArr[i16] = i15;
                } else {
                    i14++;
                }
                i13++;
            }
        }

        public tj b(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f12409a.nextInt(this.f12410b.length + 1);
                int i14 = i13 + 1;
                int nextInt = this.f12409a.nextInt(i14);
                iArr2[i13] = iArr2[nextInt];
                iArr2[nextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[(this.f12410b.length + i11)];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f12410b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f12409a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    int i18 = iArr4[i16];
                    iArr3[i12] = i18;
                    if (i18 >= i10) {
                        iArr3[i12] = i18 + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        public int c() {
            int[] iArr = this.f12410b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        public tj d() {
            return new a(0, new Random(this.f12409a.nextLong()));
        }

        private a(int i10, Random random) {
            this(a(i10, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f12410b = iArr;
            this.f12409a = random;
            this.f12411c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f12411c[iArr[i10]] = i10;
            }
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

        public int a() {
            return this.f12410b.length;
        }

        public int a(int i10) {
            int i11 = this.f12411c[i10] + 1;
            int[] iArr = this.f12410b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        public int b() {
            int[] iArr = this.f12410b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        public int b(int i10) {
            int i11 = this.f12411c[i10] - 1;
            if (i11 >= 0) {
                return this.f12410b[i11];
            }
            return -1;
        }
    }

    int a();

    int a(int i10);

    tj a(int i10, int i11);

    int b();

    int b(int i10);

    tj b(int i10, int i11);

    int c();

    tj d();
}
