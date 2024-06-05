package p2;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.nio.ShortBuffer;
import java.util.Arrays;
import k4.a;

/* compiled from: Sonic */
final class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f21296a;

    /* renamed from: b  reason: collision with root package name */
    private final int f21297b;

    /* renamed from: c  reason: collision with root package name */
    private final float f21298c;

    /* renamed from: d  reason: collision with root package name */
    private final float f21299d;

    /* renamed from: e  reason: collision with root package name */
    private final float f21300e;

    /* renamed from: f  reason: collision with root package name */
    private final int f21301f;

    /* renamed from: g  reason: collision with root package name */
    private final int f21302g;

    /* renamed from: h  reason: collision with root package name */
    private final int f21303h;

    /* renamed from: i  reason: collision with root package name */
    private final short[] f21304i;

    /* renamed from: j  reason: collision with root package name */
    private short[] f21305j;

    /* renamed from: k  reason: collision with root package name */
    private int f21306k;

    /* renamed from: l  reason: collision with root package name */
    private short[] f21307l;

    /* renamed from: m  reason: collision with root package name */
    private int f21308m;

    /* renamed from: n  reason: collision with root package name */
    private short[] f21309n;

    /* renamed from: o  reason: collision with root package name */
    private int f21310o;

    /* renamed from: p  reason: collision with root package name */
    private int f21311p;

    /* renamed from: q  reason: collision with root package name */
    private int f21312q;

    /* renamed from: r  reason: collision with root package name */
    private int f21313r;

    /* renamed from: s  reason: collision with root package name */
    private int f21314s;

    /* renamed from: t  reason: collision with root package name */
    private int f21315t;

    /* renamed from: u  reason: collision with root package name */
    private int f21316u;

    /* renamed from: v  reason: collision with root package name */
    private int f21317v;

    public l0(int i10, int i11, float f10, float f11, int i12) {
        this.f21296a = i10;
        this.f21297b = i11;
        this.f21298c = f10;
        this.f21299d = f11;
        this.f21300e = ((float) i10) / ((float) i12);
        this.f21301f = i10 / CommonGatewayClient.CODE_400;
        int i13 = i10 / 65;
        this.f21302g = i13;
        int i14 = i13 * 2;
        this.f21303h = i14;
        this.f21304i = new short[i14];
        this.f21305j = new short[(i14 * i11)];
        this.f21307l = new short[(i14 * i11)];
        this.f21309n = new short[(i14 * i11)];
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f21308m != i10) {
            int i13 = this.f21296a;
            int i14 = (int) (((float) i13) / f10);
            while (true) {
                if (i14 <= 16384 && i13 <= 16384) {
                    break;
                }
                i14 /= 2;
                i13 /= 2;
            }
            o(i10);
            int i15 = 0;
            while (true) {
                int i16 = this.f21310o;
                boolean z10 = true;
                if (i15 < i16 - 1) {
                    while (true) {
                        i11 = this.f21311p;
                        int i17 = (i11 + 1) * i14;
                        i12 = this.f21312q;
                        if (i17 <= i12 * i13) {
                            break;
                        }
                        this.f21307l = f(this.f21307l, this.f21308m, 1);
                        int i18 = 0;
                        while (true) {
                            int i19 = this.f21297b;
                            if (i18 >= i19) {
                                break;
                            }
                            this.f21307l[(this.f21308m * i19) + i18] = n(this.f21309n, (i19 * i15) + i18, i13, i14);
                            i18++;
                        }
                        this.f21312q++;
                        this.f21308m++;
                    }
                    int i20 = i11 + 1;
                    this.f21311p = i20;
                    if (i20 == i13) {
                        this.f21311p = 0;
                        if (i12 != i14) {
                            z10 = false;
                        }
                        a.f(z10);
                        this.f21312q = 0;
                    }
                    i15++;
                } else {
                    u(i16 - 1);
                    return;
                }
            }
        }
    }

    private void b(float f10) {
        int m10;
        int i10 = this.f21306k;
        if (i10 >= this.f21303h) {
            int i11 = 0;
            do {
                if (this.f21313r > 0) {
                    m10 = c(i11);
                } else {
                    int g10 = g(this.f21305j, i11);
                    if (((double) f10) > 1.0d) {
                        m10 = g10 + w(this.f21305j, i11, f10, g10);
                    } else {
                        m10 = m(this.f21305j, i11, f10, g10);
                    }
                }
                i11 += m10;
            } while (this.f21303h + i11 <= i10);
            v(i11);
        }
    }

    private int c(int i10) {
        int min = Math.min(this.f21303h, this.f21313r);
        d(this.f21305j, i10, min);
        this.f21313r -= min;
        return min;
    }

    private void d(short[] sArr, int i10, int i11) {
        short[] f10 = f(this.f21307l, this.f21308m, i11);
        this.f21307l = f10;
        int i12 = this.f21297b;
        System.arraycopy(sArr, i10 * i12, f10, this.f21308m * i12, i12 * i11);
        this.f21308m += i11;
    }

    private void e(short[] sArr, int i10, int i11) {
        int i12 = this.f21303h / i11;
        int i13 = this.f21297b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f21304i[i16] = (short) (i17 / i14);
        }
    }

    private short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f21297b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private int g(short[] sArr, int i10) {
        int i11;
        int i12 = this.f21296a;
        int i13 = i12 > 4000 ? i12 / 4000 : 1;
        if (this.f21297b == 1 && i13 == 1) {
            i11 = h(sArr, i10, this.f21301f, this.f21302g);
        } else {
            e(sArr, i10, i13);
            int h10 = h(this.f21304i, 0, this.f21301f / i13, this.f21302g / i13);
            if (i13 != 1) {
                int i14 = h10 * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f21301f;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.f21302g;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.f21297b == 1) {
                    i11 = h(sArr, i10, i16, i17);
                } else {
                    e(sArr, i10, 1);
                    i11 = h(this.f21304i, 0, i16, i17);
                }
            } else {
                i11 = h10;
            }
        }
        int i20 = q(this.f21316u, this.f21317v) ? this.f21314s : i11;
        this.f21315t = this.f21316u;
        this.f21314s = i11;
        return i20;
    }

    private int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f21297b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i14 * i11) {
                i16 = i11;
                i14 = i18;
            }
            if (i18 * i15 > i17 * i11) {
                i15 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f21316u = i14 / i16;
        this.f21317v = i17 / i15;
        return i16;
    }

    private int m(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((((float) i11) * f10) / (1.0f - f10));
        } else {
            this.f21313r = (int) ((((float) i11) * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] f11 = f(this.f21307l, this.f21308m, i13);
        this.f21307l = f11;
        int i14 = this.f21297b;
        System.arraycopy(sArr, i10 * i14, f11, this.f21308m * i14, i14 * i11);
        p(i12, this.f21297b, this.f21307l, this.f21308m + i11, sArr, i10 + i11, sArr, i10);
        this.f21308m += i13;
        return i12;
    }

    private short n(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f21297b];
        int i13 = this.f21312q * i11;
        int i14 = this.f21311p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) (((s10 * i17) + ((i18 - i17) * s11)) / i18);
    }

    private void o(int i10) {
        int i11 = this.f21308m - i10;
        short[] f10 = f(this.f21309n, this.f21310o, i11);
        this.f21309n = f10;
        short[] sArr = this.f21307l;
        int i12 = this.f21297b;
        System.arraycopy(sArr, i10 * i12, f10, this.f21310o * i12, i12 * i11);
        this.f21308m = i10;
        this.f21310o += i11;
    }

    private static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private boolean q(int i10, int i11) {
        if (i10 == 0 || this.f21314s == 0 || i11 > i10 * 3 || i10 * 2 <= this.f21315t * 3) {
            return false;
        }
        return true;
    }

    private void r() {
        int i10 = this.f21308m;
        float f10 = this.f21298c;
        float f11 = this.f21299d;
        float f12 = f10 / f11;
        float f13 = this.f21300e * f11;
        double d10 = (double) f12;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            b(f12);
        } else {
            d(this.f21305j, 0, this.f21306k);
            this.f21306k = 0;
        }
        if (f13 != 1.0f) {
            a(f13, i10);
        }
    }

    private void u(int i10) {
        if (i10 != 0) {
            short[] sArr = this.f21309n;
            int i11 = this.f21297b;
            System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f21310o - i10) * i11);
            this.f21310o -= i10;
        }
    }

    private void v(int i10) {
        int i11 = this.f21306k - i10;
        short[] sArr = this.f21305j;
        int i12 = this.f21297b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f21306k = i11;
    }

    private int w(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (((float) i11) / (f10 - 1.0f));
        } else {
            this.f21313r = (int) ((((float) i11) * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] f11 = f(this.f21307l, this.f21308m, i12);
        this.f21307l = f11;
        p(i12, this.f21297b, f11, this.f21308m, sArr, i10, sArr, i10 + i11);
        this.f21308m += i12;
        return i12;
    }

    public void i() {
        this.f21306k = 0;
        this.f21308m = 0;
        this.f21310o = 0;
        this.f21311p = 0;
        this.f21312q = 0;
        this.f21313r = 0;
        this.f21314s = 0;
        this.f21315t = 0;
        this.f21316u = 0;
        this.f21317v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f21297b, this.f21308m);
        shortBuffer.put(this.f21307l, 0, this.f21297b * min);
        int i10 = this.f21308m - min;
        this.f21308m = i10;
        short[] sArr = this.f21307l;
        int i11 = this.f21297b;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        return this.f21308m * this.f21297b * 2;
    }

    public int l() {
        return this.f21306k * this.f21297b * 2;
    }

    public void s() {
        int i10;
        int i11 = this.f21306k;
        float f10 = this.f21298c;
        float f11 = this.f21299d;
        int i12 = this.f21308m + ((int) ((((((float) i11) / (f10 / f11)) + ((float) this.f21310o)) / (this.f21300e * f11)) + 0.5f));
        this.f21305j = f(this.f21305j, i11, (this.f21303h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f21303h;
            int i14 = this.f21297b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f21305j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f21306k += i10 * 2;
        r();
        if (this.f21308m > i12) {
            this.f21308m = i12;
        }
        this.f21306k = 0;
        this.f21313r = 0;
        this.f21310o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f21297b;
        int i11 = remaining / i10;
        short[] f10 = f(this.f21305j, this.f21306k, i11);
        this.f21305j = f10;
        shortBuffer.get(f10, this.f21306k * this.f21297b, ((i10 * i11) * 2) / 2);
        this.f21306k += i11;
        r();
    }
}
