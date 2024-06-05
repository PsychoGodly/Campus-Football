package com.applovin.impl;

import java.nio.charset.Charset;

public final class xg {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f13324a;

    /* renamed from: b  reason: collision with root package name */
    private int f13325b;

    /* renamed from: c  reason: collision with root package name */
    private int f13326c;

    /* renamed from: d  reason: collision with root package name */
    private int f13327d;

    public xg() {
        this.f13324a = yp.f13667f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f13327d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r2 = this;
            int r0 = r2.f13325b
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f13327d
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f13326c
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            com.applovin.impl.a1.b((boolean) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.xg.a():void");
    }

    public int b() {
        return ((this.f13327d - this.f13325b) * 8) - this.f13326c;
    }

    public void c() {
        if (this.f13326c != 0) {
            this.f13326c = 0;
            this.f13325b++;
            a();
        }
    }

    public int d() {
        a1.b(this.f13326c == 0);
        return this.f13325b;
    }

    public int e() {
        return (this.f13325b * 8) + this.f13326c;
    }

    public boolean f() {
        boolean z10 = (this.f13324a[this.f13325b] & (128 >> this.f13326c)) != 0;
        g();
        return z10;
    }

    public void g() {
        int i10 = this.f13326c + 1;
        this.f13326c = i10;
        if (i10 == 8) {
            this.f13326c = 0;
            this.f13325b++;
        }
        a();
    }

    public void a(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int min = Math.min(8 - this.f13326c, i11);
        int i12 = this.f13326c;
        int i13 = (8 - i12) - min;
        byte[] bArr = this.f13324a;
        int i14 = this.f13325b;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = i11 - min;
        bArr[i14] = (byte) (b10 | ((i10 >>> i15) << i13));
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f13324a[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f13324a;
        byte b11 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b11;
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | b11);
        d(i11);
        a();
    }

    public long b(int i10) {
        if (i10 <= 32) {
            return yp.i(a(i10));
        }
        return yp.c(a(i10 - 32), a(32));
    }

    public void e(int i10) {
        a1.b(this.f13326c == 0);
        this.f13325b += i10;
        a();
    }

    public xg(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public void d(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f13325b + i11;
        this.f13325b = i12;
        int i13 = this.f13326c + (i10 - (i11 * 8));
        this.f13326c = i13;
        if (i13 > 7) {
            this.f13325b = i12 + 1;
            this.f13326c = i13 - 8;
        }
        a();
    }

    public xg(byte[] bArr, int i10) {
        this.f13324a = bArr;
        this.f13327d = i10;
    }

    public void b(byte[] bArr, int i10, int i11) {
        a1.b(this.f13326c == 0);
        System.arraycopy(this.f13324a, this.f13325b, bArr, i10, i11);
        this.f13325b += i11;
        a();
    }

    public void c(int i10) {
        int i11 = i10 / 8;
        this.f13325b = i11;
        this.f13326c = i10 - (i11 * 8);
        a();
    }

    public int a(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f13326c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f13326c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f13326c = i13;
            byte[] bArr = this.f13324a;
            int i14 = this.f13325b;
            this.f13325b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f13324a;
        int i15 = this.f13325b;
        int i16 = (-1 >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f13326c = 0;
            this.f13325b = i15 + 1;
        }
        a();
        return i16;
    }

    public void a(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f13324a;
            int i13 = this.f13325b;
            int i14 = i13 + 1;
            this.f13325b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f13326c;
            byte b11 = (byte) (b10 << i15);
            bArr[i10] = b11;
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 != 0) {
            byte b12 = (byte) (bArr[i12] & (255 >> i16));
            bArr[i12] = b12;
            int i17 = this.f13326c;
            if (i17 + i16 > 8) {
                byte[] bArr3 = this.f13324a;
                int i18 = this.f13325b;
                this.f13325b = i18 + 1;
                bArr[i12] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
                this.f13326c = i17 - 8;
            }
            int i19 = this.f13326c + i16;
            this.f13326c = i19;
            byte[] bArr4 = this.f13324a;
            int i20 = this.f13325b;
            bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
            if (i19 == 8) {
                this.f13326c = 0;
                this.f13325b = i20 + 1;
            }
            a();
        }
    }

    public String a(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        b(bArr, 0, i10);
        return new String(bArr, charset);
    }

    public void a(yg ygVar) {
        a(ygVar.c(), ygVar.e());
        c(ygVar.d() * 8);
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public void a(byte[] bArr, int i10) {
        this.f13324a = bArr;
        this.f13325b = 0;
        this.f13326c = 0;
        this.f13327d = i10;
    }
}
