package com.applovin.impl;

public final class dr {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f7320a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7321b;

    /* renamed from: c  reason: collision with root package name */
    private int f7322c;

    /* renamed from: d  reason: collision with root package name */
    private int f7323d;

    public dr(byte[] bArr) {
        this.f7320a = bArr;
        this.f7321b = bArr.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f7321b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r2 = this;
            int r0 = r2.f7322c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f7321b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f7323d
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.dr.a():void");
    }

    public int b() {
        return (this.f7322c * 8) + this.f7323d;
    }

    public boolean c() {
        boolean z10 = (((this.f7320a[this.f7322c] & 255) >> this.f7323d) & 1) == 1;
        b(1);
        return z10;
    }

    public int a(int i10) {
        int i11 = this.f7322c;
        int min = Math.min(i10, 8 - this.f7323d);
        int i12 = i11 + 1;
        int i13 = ((this.f7320a[i11] & 255) >> this.f7323d) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (this.f7320a[i12] & 255) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & (-1 >>> (32 - i10));
        b(i10);
        return i14;
    }

    public void b(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f7322c + i11;
        this.f7322c = i12;
        int i13 = this.f7323d + (i10 - (i11 * 8));
        this.f7323d = i13;
        if (i13 > 7) {
            this.f7322c = i12 + 1;
            this.f7323d = i13 - 8;
        }
        a();
    }
}
