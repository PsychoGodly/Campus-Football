package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.mediation.MaxReward;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class yg {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f13605a;

    /* renamed from: b  reason: collision with root package name */
    private int f13606b;

    /* renamed from: c  reason: collision with root package name */
    private int f13607c;

    public yg() {
        this.f13605a = yp.f13667f;
    }

    public int A() {
        int j10 = j();
        if (j10 >= 0) {
            return j10;
        }
        throw new IllegalStateException("Top bit not zero: " + j10);
    }

    public long B() {
        long s10 = s();
        if (s10 >= 0) {
            return s10;
        }
        throw new IllegalStateException("Top bit not zero: " + s10);
    }

    public int C() {
        byte[] bArr = this.f13605a;
        int i10 = this.f13606b;
        this.f13606b = i10 + 2;
        return (bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8);
    }

    public long D() {
        int i10;
        int i11;
        long j10 = (long) this.f13605a[this.f13606b];
        int i12 = 7;
        while (true) {
            i10 = 1;
            if (i12 < 0) {
                break;
            }
            int i13 = 1 << i12;
            if ((((long) i13) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= (long) (i13 - 1);
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 != 0) {
            while (i10 < i11) {
                byte b10 = this.f13605a[this.f13606b + i10];
                if ((b10 & 192) == 128) {
                    j10 = (j10 << 6) | ((long) (b10 & 63));
                    i10++;
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
                }
            }
            this.f13606b += i11;
            return j10;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
    }

    public int a() {
        return this.f13607c - this.f13606b;
    }

    public int b() {
        return this.f13605a.length;
    }

    public byte[] c() {
        return this.f13605a;
    }

    public int d() {
        return this.f13606b;
    }

    public int e() {
        return this.f13607c;
    }

    public char f() {
        byte[] bArr = this.f13605a;
        int i10 = this.f13606b;
        return (char) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public int g() {
        return this.f13605a[this.f13606b] & 255;
    }

    public double h() {
        return Double.longBitsToDouble(s());
    }

    public float i() {
        return Float.intBitsToFloat(j());
    }

    public int j() {
        byte[] bArr = this.f13605a;
        int i10 = this.f13606b;
        byte b10 = ((bArr[i10 + 1] & 255) << Ascii.DLE) | ((bArr[i10] & 255) << Ascii.CAN);
        this.f13606b = i10 + 4;
        return (bArr[i10 + 3] & 255) | b10 | ((bArr[i10 + 2] & 255) << 8);
    }

    public int k() {
        byte[] bArr = this.f13605a;
        int i10 = this.f13606b;
        int i11 = (bArr[i10 + 1] & 255) << 8;
        this.f13606b = i10 + 3;
        return (bArr[i10 + 2] & 255) | i11 | (((bArr[i10] & 255) << Ascii.CAN) >> 8);
    }

    public String l() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f13606b;
        while (i10 < this.f13607c && !yp.h(this.f13605a[i10])) {
            i10++;
        }
        int i11 = this.f13606b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.f13605a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f13606b = i11 + 3;
            }
        }
        byte[] bArr2 = this.f13605a;
        int i12 = this.f13606b;
        String a10 = yp.a(bArr2, i12, i10 - i12);
        this.f13606b = i10;
        int i13 = this.f13607c;
        if (i10 == i13) {
            return a10;
        }
        byte[] bArr3 = this.f13605a;
        if (bArr3[i10] == 13) {
            int i14 = i10 + 1;
            this.f13606b = i14;
            if (i14 == i13) {
                return a10;
            }
        }
        int i15 = this.f13606b;
        if (bArr3[i15] == 10) {
            this.f13606b = i15 + 1;
        }
        return a10;
    }

    public int m() {
        byte[] bArr = this.f13605a;
        int i10 = this.f13606b;
        byte b10 = ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
        this.f13606b = i10 + 4;
        return ((bArr[i10 + 3] & 255) << Ascii.CAN) | b10 | ((bArr[i10 + 2] & 255) << Ascii.DLE);
    }

    public long n() {
        byte[] bArr = this.f13605a;
        int i10 = this.f13606b;
        long j10 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40);
        this.f13606b = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | j10 | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public short o() {
        byte[] bArr = this.f13605a;
        int i10 = this.f13606b;
        this.f13606b = i10 + 2;
        return (short) (((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255));
    }

    public long p() {
        byte[] bArr = this.f13605a;
        int i10 = this.f13606b;
        this.f13606b = i10 + 4;
        return ((((long) bArr[i10 + 3]) & 255) << 24) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16);
    }

    public int q() {
        int m10 = m();
        if (m10 >= 0) {
            return m10;
        }
        throw new IllegalStateException("Top bit not zero: " + m10);
    }

    public int r() {
        byte[] bArr = this.f13605a;
        int i10 = this.f13606b;
        this.f13606b = i10 + 2;
        return ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
    }

    public long s() {
        byte[] bArr = this.f13605a;
        int i10 = this.f13606b;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24);
        this.f13606b = i10 + 8;
        return (((long) bArr[i10 + 7]) & 255) | j10 | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
    }

    public String t() {
        return a(0);
    }

    public short u() {
        byte[] bArr = this.f13605a;
        int i10 = this.f13606b;
        this.f13606b = i10 + 2;
        return (short) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public int v() {
        return (w() << 21) | (w() << 14) | (w() << 7) | w();
    }

    public int w() {
        byte[] bArr = this.f13605a;
        int i10 = this.f13606b;
        this.f13606b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int x() {
        byte[] bArr = this.f13605a;
        int i10 = this.f13606b;
        byte b10 = (bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8);
        this.f13606b = i10 + 4;
        return b10;
    }

    public long y() {
        byte[] bArr = this.f13605a;
        int i10 = this.f13606b;
        this.f13606b = i10 + 4;
        return (((long) bArr[i10 + 3]) & 255) | ((((long) bArr[i10]) & 255) << 24) | ((((long) bArr[i10 + 1]) & 255) << 16) | ((((long) bArr[i10 + 2]) & 255) << 8);
    }

    public int z() {
        byte[] bArr = this.f13605a;
        int i10 = this.f13606b;
        int i11 = (bArr[i10] & 255) << Ascii.DLE;
        this.f13606b = i10 + 3;
        return (bArr[i10 + 2] & 255) | ((bArr[i10 + 1] & 255) << 8) | i11;
    }

    public void a(int i10) {
        if (i10 > b()) {
            this.f13605a = Arrays.copyOf(this.f13605a, i10);
        }
    }

    public String b(int i10) {
        if (i10 == 0) {
            return MaxReward.DEFAULT_LABEL;
        }
        int i11 = this.f13606b;
        int i12 = (i11 + i10) - 1;
        String a10 = yp.a(this.f13605a, i11, (i12 >= this.f13607c || this.f13605a[i12] != 0) ? i10 : i10 - 1);
        this.f13606b += i10;
        return a10;
    }

    public String c(int i10) {
        return a(i10, Charsets.UTF_8);
    }

    public void d(int i10) {
        a(b() < i10 ? new byte[i10] : this.f13605a, i10);
    }

    public void e(int i10) {
        a1.a(i10 >= 0 && i10 <= this.f13605a.length);
        this.f13607c = i10;
    }

    public void f(int i10) {
        a1.a(i10 >= 0 && i10 <= this.f13607c);
        this.f13606b = i10;
    }

    public void g(int i10) {
        f(this.f13606b + i10);
    }

    public yg(int i10) {
        this.f13605a = new byte[i10];
        this.f13607c = i10;
    }

    public void a(xg xgVar, int i10) {
        a(xgVar.f13324a, 0, i10);
        xgVar.c(0);
    }

    public yg(byte[] bArr) {
        this.f13605a = bArr;
        this.f13607c = bArr.length;
    }

    public void a(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f13605a, this.f13606b, bArr, i10, i11);
        this.f13606b += i11;
    }

    public String a(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f13606b;
        while (i10 < this.f13607c && this.f13605a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f13605a;
        int i11 = this.f13606b;
        String a10 = yp.a(bArr, i11, i10 - i11);
        this.f13606b = i10;
        if (i10 < this.f13607c) {
            this.f13606b = i10 + 1;
        }
        return a10;
    }

    public yg(byte[] bArr, int i10) {
        this.f13605a = bArr;
        this.f13607c = i10;
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public void a(byte[] bArr, int i10) {
        this.f13605a = bArr;
        this.f13607c = i10;
        this.f13606b = 0;
    }

    public String a(int i10, Charset charset) {
        String str = new String(this.f13605a, this.f13606b, i10, charset);
        this.f13606b += i10;
        return str;
    }
}
