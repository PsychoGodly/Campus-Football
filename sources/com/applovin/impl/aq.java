package com.applovin.impl;

final class aq {

    /* renamed from: d  reason: collision with root package name */
    private static final long[] f6572d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f6573a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private int f6574b;

    /* renamed from: c  reason: collision with root package name */
    private int f6575c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f6572d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public void b() {
        this.f6574b = 0;
        this.f6575c = 0;
    }

    public int a() {
        return this.f6575c;
    }

    public static int a(int i10) {
        int i11;
        int i12 = 0;
        do {
            long[] jArr = f6572d;
            if (i12 >= jArr.length) {
                return -1;
            }
            i11 = ((jArr[i12] & ((long) i10)) > 0 ? 1 : ((jArr[i12] & ((long) i10)) == 0 ? 0 : -1));
            i12++;
        } while (i11 == 0);
        return i12;
    }

    public long a(j8 j8Var, boolean z10, boolean z11, int i10) {
        if (this.f6574b == 0) {
            if (!j8Var.a(this.f6573a, 0, 1, z10)) {
                return -1;
            }
            int a10 = a(this.f6573a[0] & 255);
            this.f6575c = a10;
            if (a10 != -1) {
                this.f6574b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i11 = this.f6575c;
        if (i11 > i10) {
            this.f6574b = 0;
            return -2;
        }
        if (i11 != 1) {
            j8Var.d(this.f6573a, 1, i11 - 1);
        }
        this.f6574b = 0;
        return a(this.f6573a, this.f6575c, z11);
    }
}
