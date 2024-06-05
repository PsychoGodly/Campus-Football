package com.applovin.impl;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.nio.ShortBuffer;
import java.util.Arrays;

final class kk {

    /* renamed from: a  reason: collision with root package name */
    private final int f9030a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9031b;

    /* renamed from: c  reason: collision with root package name */
    private final float f9032c;

    /* renamed from: d  reason: collision with root package name */
    private final float f9033d;

    /* renamed from: e  reason: collision with root package name */
    private final float f9034e;

    /* renamed from: f  reason: collision with root package name */
    private final int f9035f;

    /* renamed from: g  reason: collision with root package name */
    private final int f9036g;

    /* renamed from: h  reason: collision with root package name */
    private final int f9037h;

    /* renamed from: i  reason: collision with root package name */
    private final short[] f9038i;

    /* renamed from: j  reason: collision with root package name */
    private short[] f9039j;

    /* renamed from: k  reason: collision with root package name */
    private int f9040k;

    /* renamed from: l  reason: collision with root package name */
    private short[] f9041l;

    /* renamed from: m  reason: collision with root package name */
    private int f9042m;

    /* renamed from: n  reason: collision with root package name */
    private short[] f9043n;

    /* renamed from: o  reason: collision with root package name */
    private int f9044o;

    /* renamed from: p  reason: collision with root package name */
    private int f9045p;

    /* renamed from: q  reason: collision with root package name */
    private int f9046q;

    /* renamed from: r  reason: collision with root package name */
    private int f9047r;

    /* renamed from: s  reason: collision with root package name */
    private int f9048s;

    /* renamed from: t  reason: collision with root package name */
    private int f9049t;

    /* renamed from: u  reason: collision with root package name */
    private int f9050u;

    /* renamed from: v  reason: collision with root package name */
    private int f9051v;

    public kk(int i10, int i11, float f10, float f11, int i12) {
        this.f9030a = i10;
        this.f9031b = i11;
        this.f9032c = f10;
        this.f9033d = f11;
        this.f9034e = ((float) i10) / ((float) i12);
        this.f9035f = i10 / CommonGatewayClient.CODE_400;
        int i13 = i10 / 65;
        this.f9036g = i13;
        int i14 = i13 * 2;
        this.f9037h = i14;
        this.f9038i = new short[i14];
        int i15 = i14 * i11;
        this.f9039j = new short[i15];
        this.f9041l = new short[i15];
        this.f9043n = new short[i15];
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f9042m != i10) {
            int i13 = this.f9030a;
            int i14 = (int) (((float) i13) / f10);
            while (true) {
                if (i14 <= 16384 && i13 <= 16384) {
                    break;
                }
                i14 /= 2;
                i13 /= 2;
            }
            b(i10);
            int i15 = 0;
            while (true) {
                boolean z10 = true;
                int i16 = this.f9044o - 1;
                if (i15 < i16) {
                    while (true) {
                        i11 = this.f9045p + 1;
                        int i17 = i11 * i14;
                        i12 = this.f9046q;
                        if (i17 <= i12 * i13) {
                            break;
                        }
                        this.f9041l = c(this.f9041l, this.f9042m, 1);
                        int i18 = 0;
                        while (true) {
                            int i19 = this.f9031b;
                            if (i18 >= i19) {
                                break;
                            }
                            this.f9041l[(this.f9042m * i19) + i18] = b(this.f9043n, (i19 * i15) + i18, i13, i14);
                            i18++;
                        }
                        this.f9046q++;
                        this.f9042m++;
                    }
                    this.f9045p = i11;
                    if (i11 == i13) {
                        this.f9045p = 0;
                        if (i12 != i14) {
                            z10 = false;
                        }
                        a1.b(z10);
                        this.f9046q = 0;
                    }
                    i15++;
                } else {
                    c(i16);
                    return;
                }
            }
        }
    }

    private void b(short[] sArr, int i10, int i11) {
        int i12 = this.f9037h / i11;
        int i13 = this.f9031b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f9038i[i16] = (short) (i17 / i14);
        }
    }

    private short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f9031b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private void d() {
        int i10 = this.f9042m;
        float f10 = this.f9032c;
        float f11 = this.f9033d;
        float f12 = f10 / f11;
        float f13 = this.f9034e * f11;
        double d10 = (double) f12;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            a(f12);
        } else {
            a(this.f9039j, 0, this.f9040k);
            this.f9040k = 0;
        }
        if (f13 != 1.0f) {
            a(f13, i10);
        }
    }

    public void e() {
        int i10;
        int i11 = this.f9040k;
        float f10 = this.f9032c;
        float f11 = this.f9033d;
        int i12 = this.f9042m + ((int) ((((((float) i11) / (f10 / f11)) + ((float) this.f9044o)) / (this.f9034e * f11)) + 0.5f));
        this.f9039j = c(this.f9039j, i11, (this.f9037h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f9037h * 2;
            int i14 = this.f9031b;
            if (i13 >= i10 * i14) {
                break;
            }
            this.f9039j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f9040k += i10;
        d();
        if (this.f9042m > i12) {
            this.f9042m = i12;
        }
        this.f9040k = 0;
        this.f9047r = 0;
        this.f9044o = 0;
    }

    public int c() {
        return this.f9040k * this.f9031b * 2;
    }

    private void c(int i10) {
        if (i10 != 0) {
            short[] sArr = this.f9043n;
            int i11 = this.f9031b;
            System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f9044o - i10) * i11);
            this.f9044o -= i10;
        }
    }

    public int b() {
        return this.f9042m * this.f9031b * 2;
    }

    private short b(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f9031b];
        int i13 = this.f9046q * i11;
        int i14 = this.f9045p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) (((s10 * i17) + ((i18 - i17) * s11)) / i18);
    }

    private void d(int i10) {
        int i11 = this.f9040k - i10;
        short[] sArr = this.f9039j;
        int i12 = this.f9031b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f9040k = i11;
    }

    private void b(int i10) {
        int i11 = this.f9042m - i10;
        short[] c10 = c(this.f9043n, this.f9044o, i11);
        this.f9043n = c10;
        short[] sArr = this.f9041l;
        int i12 = this.f9031b;
        System.arraycopy(sArr, i10 * i12, c10, this.f9044o * i12, i12 * i11);
        this.f9042m = i10;
        this.f9044o += i11;
    }

    public void b(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f9031b;
        int i11 = remaining / i10;
        short[] c10 = c(this.f9039j, this.f9040k, i11);
        this.f9039j = c10;
        shortBuffer.get(c10, this.f9040k * this.f9031b, ((i10 * i11) * 2) / 2);
        this.f9040k += i11;
        d();
    }

    private void a(float f10) {
        int a10;
        int i10 = this.f9040k;
        if (i10 >= this.f9037h) {
            int i11 = 0;
            do {
                if (this.f9047r > 0) {
                    a10 = a(i11);
                } else {
                    int a11 = a(this.f9039j, i11);
                    if (((double) f10) > 1.0d) {
                        a10 = a11 + b(this.f9039j, i11, f10, a11);
                    } else {
                        a10 = a(this.f9039j, i11, f10, a11);
                    }
                }
                i11 += a10;
            } while (this.f9037h + i11 <= i10);
            d(i11);
        }
    }

    private int b(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (((float) i11) / (f10 - 1.0f));
        } else {
            this.f9047r = (int) ((((float) i11) * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] c10 = c(this.f9041l, this.f9042m, i12);
        this.f9041l = c10;
        a(i12, this.f9031b, c10, this.f9042m, sArr, i10, sArr, i10 + i11);
        this.f9042m += i12;
        return i12;
    }

    private int a(int i10) {
        int min = Math.min(this.f9037h, this.f9047r);
        a(this.f9039j, i10, min);
        this.f9047r -= min;
        return min;
    }

    private void a(short[] sArr, int i10, int i11) {
        short[] c10 = c(this.f9041l, this.f9042m, i11);
        this.f9041l = c10;
        int i12 = this.f9031b;
        System.arraycopy(sArr, i10 * i12, c10, this.f9042m * i12, i12 * i11);
        this.f9042m += i11;
    }

    private int a(short[] sArr, int i10) {
        int i11;
        int i12 = this.f9030a;
        int i13 = i12 > 4000 ? i12 / 4000 : 1;
        if (this.f9031b == 1 && i13 == 1) {
            i11 = a(sArr, i10, this.f9035f, this.f9036g);
        } else {
            b(sArr, i10, i13);
            int a10 = a(this.f9038i, 0, this.f9035f / i13, this.f9036g / i13);
            if (i13 != 1) {
                int i14 = a10 * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f9035f;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.f9036g;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.f9031b == 1) {
                    i11 = a(sArr, i10, i16, i17);
                } else {
                    b(sArr, i10, 1);
                    i11 = a(this.f9038i, 0, i16, i17);
                }
            } else {
                i11 = a10;
            }
        }
        int i20 = a(this.f9050u, this.f9051v) ? this.f9048s : i11;
        this.f9049t = this.f9050u;
        this.f9048s = i11;
        return i20;
    }

    private int a(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f9031b;
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
        this.f9050u = i14 / i16;
        this.f9051v = i17 / i15;
        return i16;
    }

    public void a() {
        this.f9040k = 0;
        this.f9042m = 0;
        this.f9044o = 0;
        this.f9045p = 0;
        this.f9046q = 0;
        this.f9047r = 0;
        this.f9048s = 0;
        this.f9049t = 0;
        this.f9050u = 0;
        this.f9051v = 0;
    }

    public void a(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f9031b, this.f9042m);
        shortBuffer.put(this.f9041l, 0, this.f9031b * min);
        int i10 = this.f9042m - min;
        this.f9042m = i10;
        short[] sArr = this.f9041l;
        int i11 = this.f9031b;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    private int a(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((((float) i11) * f10) / (1.0f - f10));
        } else {
            this.f9047r = (int) ((((float) i11) * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] c10 = c(this.f9041l, this.f9042m, i13);
        this.f9041l = c10;
        int i14 = this.f9031b;
        System.arraycopy(sArr, i10 * i14, c10, this.f9042m * i14, i14 * i11);
        a(i12, this.f9031b, this.f9041l, this.f9042m + i11, sArr, i10 + i11, sArr, i10);
        this.f9042m += i13;
        return i12;
    }

    private static void a(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
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

    private boolean a(int i10, int i11) {
        if (i10 == 0 || this.f9048s == 0 || i11 > i10 * 3 || i10 * 2 <= this.f9049t * 3) {
            return false;
        }
        return true;
    }
}
