package k4;

import java.nio.charset.Charset;

/* compiled from: ParsableBitArray */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f19821a;

    /* renamed from: b  reason: collision with root package name */
    private int f19822b;

    /* renamed from: c  reason: collision with root package name */
    private int f19823c;

    /* renamed from: d  reason: collision with root package name */
    private int f19824d;

    public z() {
        this.f19821a = n0.f19743f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f19824d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r2 = this;
            int r0 = r2.f19822b
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f19824d
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f19823c
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
        throw new UnsupportedOperationException("Method not decompiled: k4.z.a():void");
    }

    public int b() {
        return ((this.f19824d - this.f19822b) * 8) - this.f19823c;
    }

    public void c() {
        if (this.f19823c != 0) {
            this.f19823c = 0;
            this.f19822b++;
            a();
        }
    }

    public int d() {
        a.f(this.f19823c == 0);
        return this.f19822b;
    }

    public int e() {
        return (this.f19822b * 8) + this.f19823c;
    }

    public void f(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int min = Math.min(8 - this.f19823c, i11);
        int i12 = this.f19823c;
        int i13 = (8 - i12) - min;
        byte[] bArr = this.f19821a;
        int i14 = this.f19822b;
        bArr[i14] = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        int i15 = i11 - min;
        bArr[i14] = (byte) (((i10 >>> i15) << i13) | bArr[i14]);
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f19821a[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f19821a;
        bArr2[i16] = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | bArr2[i16]);
        r(i11);
        a();
    }

    public boolean g() {
        boolean z10 = (this.f19821a[this.f19822b] & (128 >> this.f19823c)) != 0;
        q();
        return z10;
    }

    public int h(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f19823c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f19823c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f19823c = i13;
            byte[] bArr = this.f19821a;
            int i14 = this.f19822b;
            this.f19822b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f19821a;
        int i15 = this.f19822b;
        int i16 = (-1 >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f19823c = 0;
            this.f19822b = i15 + 1;
        }
        a();
        return i16;
    }

    public void i(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f19821a;
            int i13 = this.f19822b;
            int i14 = i13 + 1;
            this.f19822b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f19823c;
            bArr[i10] = (byte) (b10 << i15);
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | bArr[i10]);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 != 0) {
            bArr[i12] = (byte) (bArr[i12] & (255 >> i16));
            int i17 = this.f19823c;
            if (i17 + i16 > 8) {
                byte b11 = bArr[i12];
                byte[] bArr3 = this.f19821a;
                int i18 = this.f19822b;
                this.f19822b = i18 + 1;
                bArr[i12] = (byte) (b11 | ((bArr3[i18] & 255) << i17));
                this.f19823c = i17 - 8;
            }
            int i19 = this.f19823c + i16;
            this.f19823c = i19;
            byte[] bArr4 = this.f19821a;
            int i20 = this.f19822b;
            bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
            if (i19 == 8) {
                this.f19823c = 0;
                this.f19822b = i20 + 1;
            }
            a();
        }
    }

    public long j(int i10) {
        if (i10 <= 32) {
            return n0.X0(h(i10));
        }
        return n0.W0(h(i10 - 32), h(32));
    }

    public void k(byte[] bArr, int i10, int i11) {
        a.f(this.f19823c == 0);
        System.arraycopy(this.f19821a, this.f19822b, bArr, i10, i11);
        this.f19822b += i11;
        a();
    }

    public String l(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        k(bArr, 0, i10);
        return new String(bArr, charset);
    }

    public void m(a0 a0Var) {
        o(a0Var.e(), a0Var.g());
        p(a0Var.f() * 8);
    }

    public void n(byte[] bArr) {
        o(bArr, bArr.length);
    }

    public void o(byte[] bArr, int i10) {
        this.f19821a = bArr;
        this.f19822b = 0;
        this.f19823c = 0;
        this.f19824d = i10;
    }

    public void p(int i10) {
        int i11 = i10 / 8;
        this.f19822b = i11;
        this.f19823c = i10 - (i11 * 8);
        a();
    }

    public void q() {
        int i10 = this.f19823c + 1;
        this.f19823c = i10;
        if (i10 == 8) {
            this.f19823c = 0;
            this.f19822b++;
        }
        a();
    }

    public void r(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f19822b + i11;
        this.f19822b = i12;
        int i13 = this.f19823c + (i10 - (i11 * 8));
        this.f19823c = i13;
        if (i13 > 7) {
            this.f19822b = i12 + 1;
            this.f19823c = i13 - 8;
        }
        a();
    }

    public void s(int i10) {
        a.f(this.f19823c == 0);
        this.f19822b += i10;
        a();
    }

    public z(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public z(byte[] bArr, int i10) {
        this.f19821a = bArr;
        this.f19824d = i10;
    }
}
