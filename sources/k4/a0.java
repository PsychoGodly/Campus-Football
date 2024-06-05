package k4;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import java.nio.charset.Charset;
import java.util.Arrays;
import r6.e;
import s6.x;
import v6.b;
import v6.h;

/* compiled from: ParsableByteArray */
public final class a0 {

    /* renamed from: d  reason: collision with root package name */
    private static final char[] f19670d = {13, 10};

    /* renamed from: e  reason: collision with root package name */
    private static final char[] f19671e = {10};

    /* renamed from: f  reason: collision with root package name */
    private static final x<Charset> f19672f = x.A(e.f29801a, e.f29803c, e.f29806f, e.f29804d, e.f29805e);

    /* renamed from: a  reason: collision with root package name */
    private byte[] f19673a;

    /* renamed from: b  reason: collision with root package name */
    private int f19674b;

    /* renamed from: c  reason: collision with root package name */
    private int f19675c;

    public a0() {
        this.f19673a = n0.f19743f;
    }

    private void V(Charset charset) {
        if (m(charset, f19670d) == 13) {
            m(charset, f19671e);
        }
    }

    private int d(Charset charset) {
        int i10;
        if (charset.equals(e.f29803c) || charset.equals(e.f29801a)) {
            i10 = 1;
        } else if (charset.equals(e.f29806f) || charset.equals(e.f29805e) || charset.equals(e.f29804d)) {
            i10 = 2;
        } else {
            throw new IllegalArgumentException("Unsupported charset: " + charset);
        }
        int i11 = this.f19674b;
        while (true) {
            int i12 = this.f19675c;
            if (i11 >= i12 - (i10 - 1)) {
                return i12;
            }
            if ((charset.equals(e.f29803c) || charset.equals(e.f29801a)) && n0.v0(this.f19673a[i11])) {
                return i11;
            }
            if (charset.equals(e.f29806f) || charset.equals(e.f29804d)) {
                byte[] bArr = this.f19673a;
                if (bArr[i11] == 0 && n0.v0(bArr[i11 + 1])) {
                    return i11;
                }
            }
            if (charset.equals(e.f29805e)) {
                byte[] bArr2 = this.f19673a;
                if (bArr2[i11 + 1] == 0 && n0.v0(bArr2[i11])) {
                    return i11;
                }
            }
            i11 += i10;
        }
    }

    private int i(Charset charset) {
        byte b10;
        char c10;
        int i10 = 2;
        if ((charset.equals(e.f29803c) || charset.equals(e.f29801a)) && a() >= 1) {
            b10 = (byte) b.a((long) h.a(this.f19673a[this.f19674b]));
            i10 = 1;
        } else {
            if ((charset.equals(e.f29806f) || charset.equals(e.f29804d)) && a() >= 2) {
                byte[] bArr = this.f19673a;
                int i11 = this.f19674b;
                c10 = b.c(bArr[i11], bArr[i11 + 1]);
            } else if (!charset.equals(e.f29805e) || a() < 2) {
                return 0;
            } else {
                byte[] bArr2 = this.f19673a;
                int i12 = this.f19674b;
                c10 = b.c(bArr2[i12 + 1], bArr2[i12]);
            }
            b10 = (byte) c10;
        }
        return (b.a((long) b10) << 16) + i10;
    }

    private char m(Charset charset, char[] cArr) {
        int i10 = i(charset);
        if (i10 == 0) {
            return 0;
        }
        char c10 = (char) (i10 >> 16);
        if (!b.b(cArr, c10)) {
            return 0;
        }
        this.f19674b += i10 & 65535;
        return c10;
    }

    public String A() {
        return n(0);
    }

    public String B(int i10) {
        if (i10 == 0) {
            return MaxReward.DEFAULT_LABEL;
        }
        int i11 = this.f19674b;
        int i12 = (i11 + i10) - 1;
        String E = n0.E(this.f19673a, i11, (i12 >= this.f19675c || this.f19673a[i12] != 0) ? i10 : i10 - 1);
        this.f19674b += i10;
        return E;
    }

    public short C() {
        byte[] bArr = this.f19673a;
        int i10 = this.f19674b;
        int i11 = i10 + 1;
        this.f19674b = i11;
        this.f19674b = i11 + 1;
        return (short) ((bArr[i11] & 255) | ((bArr[i10] & 255) << 8));
    }

    public String D(int i10) {
        return E(i10, e.f29803c);
    }

    public String E(int i10, Charset charset) {
        String str = new String(this.f19673a, this.f19674b, i10, charset);
        this.f19674b += i10;
        return str;
    }

    public int F() {
        return (G() << 21) | (G() << 14) | (G() << 7) | G();
    }

    public int G() {
        byte[] bArr = this.f19673a;
        int i10 = this.f19674b;
        this.f19674b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int H() {
        byte[] bArr = this.f19673a;
        int i10 = this.f19674b;
        int i11 = i10 + 1;
        this.f19674b = i11;
        int i12 = i11 + 1;
        this.f19674b = i12;
        byte b10 = (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
        this.f19674b = i12 + 2;
        return b10;
    }

    public long I() {
        byte[] bArr = this.f19673a;
        int i10 = this.f19674b;
        int i11 = i10 + 1;
        this.f19674b = i11;
        int i12 = i11 + 1;
        this.f19674b = i12;
        int i13 = i12 + 1;
        this.f19674b = i13;
        this.f19674b = i13 + 1;
        return ((((long) bArr[i10]) & 255) << 24) | ((((long) bArr[i11]) & 255) << 16) | ((((long) bArr[i12]) & 255) << 8) | (((long) bArr[i13]) & 255);
    }

    public int J() {
        byte[] bArr = this.f19673a;
        int i10 = this.f19674b;
        int i11 = i10 + 1;
        this.f19674b = i11;
        int i12 = (bArr[i10] & 255) << Ascii.DLE;
        int i13 = i11 + 1;
        this.f19674b = i13;
        byte b10 = i12 | ((bArr[i11] & 255) << 8);
        this.f19674b = i13 + 1;
        return (bArr[i13] & 255) | b10;
    }

    public int K() {
        int p10 = p();
        if (p10 >= 0) {
            return p10;
        }
        throw new IllegalStateException("Top bit not zero: " + p10);
    }

    public long L() {
        long z10 = z();
        if (z10 >= 0) {
            return z10;
        }
        throw new IllegalStateException("Top bit not zero: " + z10);
    }

    public int M() {
        byte[] bArr = this.f19673a;
        int i10 = this.f19674b;
        int i11 = i10 + 1;
        this.f19674b = i11;
        this.f19674b = i11 + 1;
        return (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
    }

    public long N() {
        int i10;
        int i11;
        long j10 = (long) this.f19673a[this.f19674b];
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
                byte b10 = this.f19673a[this.f19674b + i10];
                if ((b10 & 192) == 128) {
                    j10 = (j10 << 6) | ((long) (b10 & 63));
                    i10++;
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
                }
            }
            this.f19674b += i11;
            return j10;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
    }

    public Charset O() {
        if (a() >= 3) {
            byte[] bArr = this.f19673a;
            int i10 = this.f19674b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f19674b = i10 + 3;
                return e.f29803c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f19673a;
        int i11 = this.f19674b;
        if (bArr2[i11] == -2 && bArr2[i11 + 1] == -1) {
            this.f19674b = i11 + 2;
            return e.f29804d;
        } else if (bArr2[i11] != -1 || bArr2[i11 + 1] != -2) {
            return null;
        } else {
            this.f19674b = i11 + 2;
            return e.f29805e;
        }
    }

    public void P(int i10) {
        R(b() < i10 ? new byte[i10] : this.f19673a, i10);
    }

    public void Q(byte[] bArr) {
        R(bArr, bArr.length);
    }

    public void R(byte[] bArr, int i10) {
        this.f19673a = bArr;
        this.f19675c = i10;
        this.f19674b = 0;
    }

    public void S(int i10) {
        a.a(i10 >= 0 && i10 <= this.f19673a.length);
        this.f19675c = i10;
    }

    public void T(int i10) {
        a.a(i10 >= 0 && i10 <= this.f19675c);
        this.f19674b = i10;
    }

    public void U(int i10) {
        T(this.f19674b + i10);
    }

    public int a() {
        return this.f19675c - this.f19674b;
    }

    public int b() {
        return this.f19673a.length;
    }

    public void c(int i10) {
        if (i10 > b()) {
            this.f19673a = Arrays.copyOf(this.f19673a, i10);
        }
    }

    public byte[] e() {
        return this.f19673a;
    }

    public int f() {
        return this.f19674b;
    }

    public int g() {
        return this.f19675c;
    }

    public char h(Charset charset) {
        boolean contains = f19672f.contains(charset);
        a.b(contains, "Unsupported charset: " + charset);
        return (char) (i(charset) >> 16);
    }

    public int j() {
        return this.f19673a[this.f19674b] & 255;
    }

    public void k(z zVar, int i10) {
        l(zVar.f19821a, 0, i10);
        zVar.p(0);
    }

    public void l(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f19673a, this.f19674b, bArr, i10, i11);
        this.f19674b += i11;
    }

    public String n(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f19674b;
        while (i10 < this.f19675c && this.f19673a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f19673a;
        int i11 = this.f19674b;
        String E = n0.E(bArr, i11, i10 - i11);
        this.f19674b = i10;
        if (i10 < this.f19675c) {
            this.f19674b = i10 + 1;
        }
        return E;
    }

    public double o() {
        return Double.longBitsToDouble(z());
    }

    public int p() {
        byte[] bArr = this.f19673a;
        int i10 = this.f19674b;
        int i11 = i10 + 1;
        this.f19674b = i11;
        int i12 = (bArr[i10] & 255) << Ascii.CAN;
        int i13 = i11 + 1;
        this.f19674b = i13;
        byte b10 = i12 | ((bArr[i11] & 255) << Ascii.DLE);
        int i14 = i13 + 1;
        this.f19674b = i14;
        byte b11 = b10 | ((bArr[i13] & 255) << 8);
        this.f19674b = i14 + 1;
        return (bArr[i14] & 255) | b11;
    }

    public int q() {
        byte[] bArr = this.f19673a;
        int i10 = this.f19674b;
        int i11 = i10 + 1;
        this.f19674b = i11;
        int i12 = i11 + 1;
        this.f19674b = i12;
        byte b10 = (((bArr[i10] & 255) << Ascii.CAN) >> 8) | ((bArr[i11] & 255) << 8);
        this.f19674b = i12 + 1;
        return (bArr[i12] & 255) | b10;
    }

    public String r() {
        return s(e.f29803c);
    }

    public String s(Charset charset) {
        boolean contains = f19672f.contains(charset);
        a.b(contains, "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(e.f29801a)) {
            O();
        }
        String E = E(d(charset) - this.f19674b, charset);
        if (this.f19674b == this.f19675c) {
            return E;
        }
        V(charset);
        return E;
    }

    public int t() {
        byte[] bArr = this.f19673a;
        int i10 = this.f19674b;
        int i11 = i10 + 1;
        this.f19674b = i11;
        int i12 = i11 + 1;
        this.f19674b = i12;
        byte b10 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i13 = i12 + 1;
        this.f19674b = i13;
        byte b11 = b10 | ((bArr[i12] & 255) << Ascii.DLE);
        this.f19674b = i13 + 1;
        return ((bArr[i13] & 255) << Ascii.CAN) | b11;
    }

    public long u() {
        byte[] bArr = this.f19673a;
        int i10 = this.f19674b;
        int i11 = i10 + 1;
        this.f19674b = i11;
        int i12 = i11 + 1;
        this.f19674b = i12;
        int i13 = i12 + 1;
        this.f19674b = i13;
        int i14 = i13 + 1;
        this.f19674b = i14;
        int i15 = i14 + 1;
        this.f19674b = i15;
        int i16 = i15 + 1;
        this.f19674b = i16;
        int i17 = i16 + 1;
        this.f19674b = i17;
        this.f19674b = i17 + 1;
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16) | ((((long) bArr[i13]) & 255) << 24) | ((((long) bArr[i14]) & 255) << 32) | ((((long) bArr[i15]) & 255) << 40) | ((((long) bArr[i16]) & 255) << 48) | ((((long) bArr[i17]) & 255) << 56);
    }

    public short v() {
        byte[] bArr = this.f19673a;
        int i10 = this.f19674b;
        int i11 = i10 + 1;
        this.f19674b = i11;
        this.f19674b = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | (bArr[i10] & 255));
    }

    public long w() {
        byte[] bArr = this.f19673a;
        int i10 = this.f19674b;
        int i11 = i10 + 1;
        this.f19674b = i11;
        int i12 = i11 + 1;
        this.f19674b = i12;
        int i13 = i12 + 1;
        this.f19674b = i13;
        this.f19674b = i13 + 1;
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16) | ((((long) bArr[i13]) & 255) << 24);
    }

    public int x() {
        int t10 = t();
        if (t10 >= 0) {
            return t10;
        }
        throw new IllegalStateException("Top bit not zero: " + t10);
    }

    public int y() {
        byte[] bArr = this.f19673a;
        int i10 = this.f19674b;
        int i11 = i10 + 1;
        this.f19674b = i11;
        this.f19674b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
    }

    public long z() {
        byte[] bArr = this.f19673a;
        int i10 = this.f19674b;
        int i11 = i10 + 1;
        this.f19674b = i11;
        int i12 = i11 + 1;
        this.f19674b = i12;
        int i13 = i12 + 1;
        this.f19674b = i13;
        int i14 = i13 + 1;
        this.f19674b = i14;
        int i15 = i14 + 1;
        this.f19674b = i15;
        int i16 = i15 + 1;
        this.f19674b = i16;
        int i17 = i16 + 1;
        this.f19674b = i17;
        this.f19674b = i17 + 1;
        return ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i11]) & 255) << 48) | ((((long) bArr[i12]) & 255) << 40) | ((((long) bArr[i13]) & 255) << 32) | ((((long) bArr[i14]) & 255) << 24) | ((((long) bArr[i15]) & 255) << 16) | ((((long) bArr[i16]) & 255) << 8) | (((long) bArr[i17]) & 255);
    }

    public a0(int i10) {
        this.f19673a = new byte[i10];
        this.f19675c = i10;
    }

    public a0(byte[] bArr) {
        this.f19673a = bArr;
        this.f19675c = bArr.length;
    }

    public a0(byte[] bArr, int i10) {
        this.f19673a = bArr;
        this.f19675c = i10;
    }
}
