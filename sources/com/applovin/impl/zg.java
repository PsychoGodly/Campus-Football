package com.applovin.impl;

public final class zg {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f13857a;

    /* renamed from: b  reason: collision with root package name */
    private int f13858b;

    /* renamed from: c  reason: collision with root package name */
    private int f13859c;

    /* renamed from: d  reason: collision with root package name */
    private int f13860d;

    public zg(byte[] bArr, int i10, int i11) {
        a(bArr, i10, i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f13858b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r2 = this;
            int r0 = r2.f13859c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f13858b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f13860d
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.zg.a():void");
    }

    private int d() {
        int i10 = 0;
        int i11 = 0;
        while (!c()) {
            i11++;
        }
        int i12 = (1 << i11) - 1;
        if (i11 > 0) {
            i10 = b(i11);
        }
        return i12 + i10;
    }

    public boolean b() {
        int i10 = this.f13859c;
        int i11 = this.f13860d;
        int i12 = 0;
        while (this.f13859c < this.f13858b && !c()) {
            i12++;
        }
        boolean z10 = this.f13859c == this.f13858b;
        this.f13859c = i10;
        this.f13860d = i11;
        if (z10 || !a((i12 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public boolean c() {
        boolean z10 = (this.f13857a[this.f13859c] & (128 >> this.f13860d)) != 0;
        g();
        return z10;
    }

    public int e() {
        int d10 = d();
        return (d10 % 2 == 0 ? -1 : 1) * ((d10 + 1) / 2);
    }

    public int f() {
        return d();
    }

    public void g() {
        int i10 = 1;
        int i11 = this.f13860d + 1;
        this.f13860d = i11;
        if (i11 == 8) {
            this.f13860d = 0;
            int i12 = this.f13859c;
            if (c(i12 + 1)) {
                i10 = 2;
            }
            this.f13859c = i12 + i10;
        }
        a();
    }

    public boolean a(int i10) {
        int i11 = this.f13859c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f13860d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f13858b) {
                int i15 = this.f13858b;
            } else if (c(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i152 = this.f13858b;
        if (i13 < i152) {
            return true;
        }
        if (i13 == i152 && i14 == 0) {
            return true;
        }
        return false;
    }

    private boolean c(int i10) {
        if (2 <= i10 && i10 < this.f13858b) {
            byte[] bArr = this.f13857a;
            return bArr[i10] == 3 && bArr[i10 + -2] == 0 && bArr[i10 - 1] == 0;
        }
    }

    public void d(int i10) {
        int i11 = this.f13859c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f13859c = i13;
        int i14 = this.f13860d + (i10 - (i12 * 8));
        this.f13860d = i14;
        if (i14 > 7) {
            this.f13859c = i13 + 1;
            this.f13860d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f13859c) {
                a();
                return;
            } else if (c(i11)) {
                this.f13859c++;
                i11 += 2;
            }
        }
    }

    public void a(byte[] bArr, int i10, int i11) {
        this.f13857a = bArr;
        this.f13859c = i10;
        this.f13858b = i11;
        this.f13860d = 0;
        a();
    }

    public int b(int i10) {
        int i11;
        int i12;
        this.f13860d += i10;
        int i13 = 0;
        while (true) {
            i11 = this.f13860d;
            i12 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f13860d = i14;
            byte[] bArr = this.f13857a;
            int i15 = this.f13859c;
            i13 |= (bArr[i15] & 255) << i14;
            if (!c(i15 + 1)) {
                i12 = 1;
            }
            this.f13859c = i15 + i12;
        }
        byte[] bArr2 = this.f13857a;
        int i16 = this.f13859c;
        int i17 = (-1 >>> (32 - i10)) & (i13 | ((bArr2[i16] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f13860d = 0;
            if (!c(i16 + 1)) {
                i12 = 1;
            }
            this.f13859c = i16 + i12;
        }
        a();
        return i17;
    }
}
