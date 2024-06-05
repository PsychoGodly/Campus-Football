package k4;

import com.applovin.exoplayer2.common.base.Ascii;
import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: NalUnitUtil */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f19780a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f19781b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c  reason: collision with root package name */
    private static final Object f19782c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static int[] f19783d = new int[10];

    /* compiled from: NalUnitUtil */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f19784a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f19785b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19786c;

        /* renamed from: d  reason: collision with root package name */
        public final int f19787d;

        /* renamed from: e  reason: collision with root package name */
        public final int[] f19788e;

        /* renamed from: f  reason: collision with root package name */
        public final int f19789f;

        /* renamed from: g  reason: collision with root package name */
        public final int f19790g;

        /* renamed from: h  reason: collision with root package name */
        public final int f19791h;

        /* renamed from: i  reason: collision with root package name */
        public final int f19792i;

        /* renamed from: j  reason: collision with root package name */
        public final float f19793j;

        /* renamed from: k  reason: collision with root package name */
        public final int f19794k;

        /* renamed from: l  reason: collision with root package name */
        public final int f19795l;

        /* renamed from: m  reason: collision with root package name */
        public final int f19796m;

        public a(int i10, boolean z10, int i11, int i12, int[] iArr, int i13, int i14, int i15, int i16, float f10, int i17, int i18, int i19) {
            this.f19784a = i10;
            this.f19785b = z10;
            this.f19786c = i11;
            this.f19787d = i12;
            this.f19788e = iArr;
            this.f19789f = i13;
            this.f19790g = i14;
            this.f19791h = i15;
            this.f19792i = i16;
            this.f19793j = f10;
            this.f19794k = i17;
            this.f19795l = i18;
            this.f19796m = i19;
        }
    }

    /* compiled from: NalUnitUtil */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f19797a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19798b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f19799c;

        public b(int i10, int i11, boolean z10) {
            this.f19797a = i10;
            this.f19798b = i11;
            this.f19799c = z10;
        }
    }

    /* compiled from: NalUnitUtil */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f19800a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19801b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19802c;

        /* renamed from: d  reason: collision with root package name */
        public final int f19803d;

        /* renamed from: e  reason: collision with root package name */
        public final int f19804e;

        /* renamed from: f  reason: collision with root package name */
        public final int f19805f;

        /* renamed from: g  reason: collision with root package name */
        public final int f19806g;

        /* renamed from: h  reason: collision with root package name */
        public final float f19807h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f19808i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f19809j;

        /* renamed from: k  reason: collision with root package name */
        public final int f19810k;

        /* renamed from: l  reason: collision with root package name */
        public final int f19811l;

        /* renamed from: m  reason: collision with root package name */
        public final int f19812m;

        /* renamed from: n  reason: collision with root package name */
        public final boolean f19813n;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, boolean z10, boolean z11, int i17, int i18, int i19, boolean z12) {
            this.f19800a = i10;
            this.f19801b = i11;
            this.f19802c = i12;
            this.f19803d = i13;
            this.f19804e = i14;
            this.f19805f = i15;
            this.f19806g = i16;
            this.f19807h = f10;
            this.f19808i = z10;
            this.f19809j = z11;
            this.f19810k = i17;
            this.f19811l = i18;
            this.f19812m = i19;
            this.f19813n = z12;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 < position) {
                byte b10 = byteBuffer.get(i10) & 255;
                if (i11 == 3) {
                    if (b10 == 1 && (byteBuffer.get(i12) & Ascii.US) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i10 - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b10 == 0) {
                    i11++;
                }
                if (b10 != 0) {
                    i11 = 0;
                }
                i10 = i12;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static int c(byte[] bArr, int i10, int i11, boolean[] zArr) {
        boolean z10;
        int i12 = i11 - i10;
        boolean z11 = false;
        a.f(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        } else if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        } else if (i12 <= 2 || !zArr[2] || bArr[i10] != 0 || bArr[i10 + 1] != 1) {
            int i13 = i11 - 1;
            int i14 = i10 + 2;
            while (i14 < i13) {
                if ((bArr[i14] & 254) == 0) {
                    int i15 = i14 - 2;
                    if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && bArr[i14] == 1) {
                        a(zArr);
                        return i15;
                    }
                    i14 -= 2;
                }
                i14 += 3;
            }
            if (i12 <= 2 ? i12 != 2 ? !zArr[1] || bArr[i13] != 1 : !(zArr[2] && bArr[i11 - 2] == 0 && bArr[i13] == 1) : !(bArr[i11 - 3] == 0 && bArr[i11 - 2] == 0 && bArr[i13] == 1)) {
                z10 = false;
            } else {
                z10 = true;
            }
            zArr[0] = z10;
            zArr[1] = i12 <= 1 ? !(!zArr[2] || bArr[i13] != 0) : bArr[i11 + -2] == 0 && bArr[i13] == 0;
            if (bArr[i13] == 0) {
                z11 = true;
            }
            zArr[2] = z11;
            return i11;
        } else {
            a(zArr);
            return i10 - 1;
        }
    }

    private static int d(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int e(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i10) {
        return bArr[i10 + 3] & Ascii.US;
    }

    public static boolean g(String str, byte b10) {
        if (MimeTypes.VIDEO_H264.equals(str) && (b10 & Ascii.US) == 6) {
            return true;
        }
        if (!MimeTypes.VIDEO_H265.equals(str) || ((b10 & 126) >> 1) != 39) {
            return false;
        }
        return true;
    }

    public static a h(byte[] bArr, int i10, int i11) {
        return i(bArr, i10 + 2, i11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static k4.w.a i(byte[] r23, int r24, int r25) {
        /*
            k4.b0 r0 = new k4.b0
            r1 = r23
            r2 = r24
            r3 = r25
            r0.<init>(r1, r2, r3)
            r1 = 4
            r0.l(r1)
            r2 = 3
            int r3 = r0.e(r2)
            r0.k()
            r4 = 2
            int r6 = r0.e(r4)
            boolean r7 = r0.d()
            r5 = 5
            int r8 = r0.e(r5)
            r9 = 0
            r10 = 0
        L_0x0027:
            r11 = 32
            r12 = 1
            if (r10 >= r11) goto L_0x0038
            boolean r11 = r0.d()
            if (r11 == 0) goto L_0x0035
            int r11 = r12 << r10
            r9 = r9 | r11
        L_0x0035:
            int r10 = r10 + 1
            goto L_0x0027
        L_0x0038:
            r10 = 6
            int[] r11 = new int[r10]
            r13 = 0
        L_0x003c:
            r14 = 8
            if (r13 >= r10) goto L_0x0049
            int r14 = r0.e(r14)
            r11[r13] = r14
            int r13 = r13 + 1
            goto L_0x003c
        L_0x0049:
            int r13 = r0.e(r14)
            r10 = 0
            r15 = 0
        L_0x004f:
            if (r10 >= r3) goto L_0x0064
            boolean r16 = r0.d()
            if (r16 == 0) goto L_0x0059
            int r15 = r15 + 89
        L_0x0059:
            boolean r16 = r0.d()
            if (r16 == 0) goto L_0x0061
            int r15 = r15 + 8
        L_0x0061:
            int r10 = r10 + 1
            goto L_0x004f
        L_0x0064:
            r0.l(r15)
            if (r3 <= 0) goto L_0x0070
            int r10 = 8 - r3
            int r10 = r10 * 2
            r0.l(r10)
        L_0x0070:
            int r15 = r0.h()
            int r10 = r0.h()
            if (r10 != r2) goto L_0x007d
            r0.k()
        L_0x007d:
            int r16 = r0.h()
            int r17 = r0.h()
            boolean r18 = r0.d()
            if (r18 == 0) goto L_0x00b6
            int r18 = r0.h()
            int r19 = r0.h()
            int r20 = r0.h()
            int r21 = r0.h()
            if (r10 == r12) goto L_0x00a3
            if (r10 != r4) goto L_0x00a0
            goto L_0x00a3
        L_0x00a0:
            r22 = 1
            goto L_0x00a5
        L_0x00a3:
            r22 = 2
        L_0x00a5:
            if (r10 != r12) goto L_0x00a9
            r10 = 2
            goto L_0x00aa
        L_0x00a9:
            r10 = 1
        L_0x00aa:
            int r18 = r18 + r19
            int r22 = r22 * r18
            int r16 = r16 - r22
            int r20 = r20 + r21
            int r10 = r10 * r20
            int r17 = r17 - r10
        L_0x00b6:
            r0.h()
            r0.h()
            int r10 = r0.h()
            boolean r18 = r0.d()
            if (r18 == 0) goto L_0x00c9
            r18 = 0
            goto L_0x00cb
        L_0x00c9:
            r18 = r3
        L_0x00cb:
            r5 = r18
        L_0x00cd:
            if (r5 > r3) goto L_0x00db
            r0.h()
            r0.h()
            r0.h()
            int r5 = r5 + 1
            goto L_0x00cd
        L_0x00db:
            r0.h()
            r0.h()
            r0.h()
            r0.h()
            r0.h()
            r0.h()
            boolean r3 = r0.d()
            if (r3 == 0) goto L_0x00fc
            boolean r3 = r0.d()
            if (r3 == 0) goto L_0x00fc
            n(r0)
        L_0x00fc:
            r0.l(r4)
            boolean r3 = r0.d()
            if (r3 == 0) goto L_0x0111
            r0.l(r14)
            r0.h()
            r0.h()
            r0.k()
        L_0x0111:
            p(r0)
            boolean r3 = r0.d()
            if (r3 == 0) goto L_0x012a
            r5 = 0
        L_0x011b:
            int r3 = r0.h()
            if (r5 >= r3) goto L_0x012a
            int r3 = r10 + 4
            int r3 = r3 + r12
            r0.l(r3)
            int r5 = r5 + 1
            goto L_0x011b
        L_0x012a:
            r0.l(r4)
            boolean r3 = r0.d()
            r5 = -1
            if (r3 == 0) goto L_0x01ca
            boolean r3 = r0.d()
            if (r3 == 0) goto L_0x0172
            int r3 = r0.e(r14)
            r10 = 255(0xff, float:3.57E-43)
            if (r3 != r10) goto L_0x0154
            r3 = 16
            int r10 = r0.e(r3)
            int r3 = r0.e(r3)
            if (r10 == 0) goto L_0x0172
            if (r3 == 0) goto L_0x0172
            float r1 = (float) r10
            float r3 = (float) r3
            float r1 = r1 / r3
            goto L_0x0174
        L_0x0154:
            float[] r10 = f19781b
            int r1 = r10.length
            if (r3 >= r1) goto L_0x015c
            r1 = r10[r3]
            goto L_0x0174
        L_0x015c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r10 = "Unexpected aspect_ratio_idc value: "
            r1.append(r10)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "NalUnitUtil"
            k4.r.i(r3, r1)
        L_0x0172:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0174:
            boolean r3 = r0.d()
            if (r3 == 0) goto L_0x017d
            r0.k()
        L_0x017d:
            boolean r3 = r0.d()
            if (r3 == 0) goto L_0x01a9
            r0.l(r2)
            boolean r2 = r0.d()
            boolean r3 = r0.d()
            if (r3 == 0) goto L_0x01a9
            int r3 = r0.e(r14)
            int r5 = r0.e(r14)
            r0.l(r14)
            int r3 = l4.c.b(r3)
            if (r2 == 0) goto L_0x01a2
            r4 = 1
        L_0x01a2:
            int r5 = l4.c.c(r5)
            r2 = r5
            r5 = r3
            goto L_0x01ab
        L_0x01a9:
            r2 = -1
            r4 = -1
        L_0x01ab:
            boolean r3 = r0.d()
            if (r3 == 0) goto L_0x01b7
            r0.h()
            r0.h()
        L_0x01b7:
            r0.k()
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x01c2
            int r17 = r17 * 2
        L_0x01c2:
            r18 = r2
            r0 = r5
            r14 = r17
            r17 = r4
            goto L_0x01d3
        L_0x01ca:
            r14 = r17
            r0 = -1
            r1 = 1065353216(0x3f800000, float:1.0)
            r17 = -1
            r18 = -1
        L_0x01d3:
            k4.w$a r2 = new k4.w$a
            r5 = r2
            r10 = r11
            r11 = r13
            r12 = r15
            r13 = r16
            r15 = r1
            r16 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.w.i(byte[], int, int):k4.w$a");
    }

    public static b j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10 + 1, i11);
    }

    public static b k(byte[] bArr, int i10, int i11) {
        b0 b0Var = new b0(bArr, i10, i11);
        int h10 = b0Var.h();
        int h11 = b0Var.h();
        b0Var.k();
        return new b(h10, h11, b0Var.d());
    }

    public static c l(byte[] bArr, int i10, int i11) {
        return m(bArr, i10 + 1, i11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static k4.w.c m(byte[] r22, int r23, int r24) {
        /*
            k4.b0 r0 = new k4.b0
            r1 = r22
            r2 = r23
            r3 = r24
            r0.<init>(r1, r2, r3)
            r1 = 8
            int r3 = r0.e(r1)
            int r4 = r0.e(r1)
            int r5 = r0.e(r1)
            int r6 = r0.h()
            r2 = 3
            r9 = 1
            r10 = 100
            if (r3 == r10) goto L_0x004b
            r10 = 110(0x6e, float:1.54E-43)
            if (r3 == r10) goto L_0x004b
            r10 = 122(0x7a, float:1.71E-43)
            if (r3 == r10) goto L_0x004b
            r10 = 244(0xf4, float:3.42E-43)
            if (r3 == r10) goto L_0x004b
            r10 = 44
            if (r3 == r10) goto L_0x004b
            r10 = 83
            if (r3 == r10) goto L_0x004b
            r10 = 86
            if (r3 == r10) goto L_0x004b
            r10 = 118(0x76, float:1.65E-43)
            if (r3 == r10) goto L_0x004b
            r10 = 128(0x80, float:1.794E-43)
            if (r3 == r10) goto L_0x004b
            r10 = 138(0x8a, float:1.93E-43)
            if (r3 != r10) goto L_0x0048
            goto L_0x004b
        L_0x0048:
            r10 = 1
            r11 = 0
            goto L_0x0084
        L_0x004b:
            int r10 = r0.h()
            if (r10 != r2) goto L_0x0056
            boolean r11 = r0.d()
            goto L_0x0057
        L_0x0056:
            r11 = 0
        L_0x0057:
            r0.h()
            r0.h()
            r0.k()
            boolean r12 = r0.d()
            if (r12 == 0) goto L_0x0084
            if (r10 == r2) goto L_0x006b
            r12 = 8
            goto L_0x006d
        L_0x006b:
            r12 = 12
        L_0x006d:
            r13 = 0
        L_0x006e:
            if (r13 >= r12) goto L_0x0084
            boolean r14 = r0.d()
            if (r14 == 0) goto L_0x0081
            r14 = 6
            if (r13 >= r14) goto L_0x007c
            r14 = 16
            goto L_0x007e
        L_0x007c:
            r14 = 64
        L_0x007e:
            o(r0, r14)
        L_0x0081:
            int r13 = r13 + 1
            goto L_0x006e
        L_0x0084:
            int r12 = r0.h()
            int r13 = r12 + 4
            int r14 = r0.h()
            if (r14 != 0) goto L_0x0098
            int r12 = r0.h()
            int r12 = r12 + 4
            r15 = r12
            goto L_0x00ba
        L_0x0098:
            if (r14 != r9) goto L_0x00b9
            boolean r12 = r0.d()
            r0.g()
            r0.g()
            int r15 = r0.h()
            long r1 = (long) r15
            r15 = 0
        L_0x00aa:
            long r7 = (long) r15
            int r17 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r17 >= 0) goto L_0x00b5
            r0.h()
            int r15 = r15 + 1
            goto L_0x00aa
        L_0x00b5:
            r16 = r12
            r15 = 0
            goto L_0x00bc
        L_0x00b9:
            r15 = 0
        L_0x00ba:
            r16 = 0
        L_0x00bc:
            int r7 = r0.h()
            r0.k()
            int r1 = r0.h()
            int r1 = r1 + r9
            int r2 = r0.h()
            int r2 = r2 + r9
            boolean r12 = r0.d()
            int r8 = 2 - r12
            int r8 = r8 * r2
            if (r12 != 0) goto L_0x00da
            r0.k()
        L_0x00da:
            r0.k()
            r2 = 16
            int r1 = r1 * 16
            int r8 = r8 * 16
            boolean r2 = r0.d()
            if (r2 == 0) goto L_0x011e
            int r2 = r0.h()
            int r17 = r0.h()
            int r18 = r0.h()
            int r19 = r0.h()
            if (r10 != 0) goto L_0x00fe
            int r10 = 2 - r12
            goto L_0x0113
        L_0x00fe:
            r20 = 2
            r9 = 3
            if (r10 != r9) goto L_0x0107
            r9 = 1
            r21 = 1
            goto L_0x010a
        L_0x0107:
            r9 = 1
            r21 = 2
        L_0x010a:
            if (r10 != r9) goto L_0x010d
            r9 = 2
        L_0x010d:
            int r10 = 2 - r12
            int r10 = r10 * r9
            r9 = r21
        L_0x0113:
            int r2 = r2 + r17
            int r2 = r2 * r9
            int r1 = r1 - r2
            int r18 = r18 + r19
            int r18 = r18 * r10
            int r8 = r8 - r18
        L_0x011e:
            r9 = r8
            r8 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r2 = r0.d()
            if (r2 == 0) goto L_0x016a
            boolean r2 = r0.d()
            if (r2 == 0) goto L_0x016a
            r2 = 8
            int r2 = r0.e(r2)
            r10 = 255(0xff, float:3.57E-43)
            if (r2 != r10) goto L_0x014b
            r10 = 16
            int r2 = r0.e(r10)
            int r0 = r0.e(r10)
            if (r2 == 0) goto L_0x0149
            if (r0 == 0) goto L_0x0149
            float r1 = (float) r2
            float r0 = (float) r0
            float r1 = r1 / r0
        L_0x0149:
            r10 = r1
            goto L_0x016c
        L_0x014b:
            float[] r0 = f19781b
            int r10 = r0.length
            if (r2 >= r10) goto L_0x0154
            r0 = r0[r2]
            r10 = r0
            goto L_0x016c
        L_0x0154:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "Unexpected aspect_ratio_idc value: "
            r0.append(r10)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "NalUnitUtil"
            k4.r.i(r2, r0)
        L_0x016a:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x016c:
            k4.w$c r0 = new k4.w$c
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.w.m(byte[], int, int):k4.w$c");
    }

    private static void n(b0 b0Var) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (!b0Var.d()) {
                    b0Var.h();
                } else {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        b0Var.g();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        b0Var.g();
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void o(b0 b0Var, int i10) {
        int i11 = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i11 != 0) {
                i11 = ((b0Var.g() + i12) + 256) % 256;
            }
            if (i11 != 0) {
                i12 = i11;
            }
        }
    }

    private static void p(b0 b0Var) {
        int h10 = b0Var.h();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        while (i12 < h10) {
            if (i12 != 0 && b0Var.d()) {
                int i13 = i10 + i11;
                int h11 = (1 - ((b0Var.d() ? 1 : 0) * true)) * (b0Var.h() + 1);
                int i14 = i13 + 1;
                boolean[] zArr = new boolean[i14];
                for (int i15 = 0; i15 <= i13; i15++) {
                    if (!b0Var.d()) {
                        zArr[i15] = b0Var.d();
                    } else {
                        zArr[i15] = true;
                    }
                }
                int[] iArr3 = new int[i14];
                int[] iArr4 = new int[i14];
                int i16 = 0;
                for (int i17 = i11 - 1; i17 >= 0; i17--) {
                    int i18 = iArr2[i17] + h11;
                    if (i18 < 0 && zArr[i10 + i17]) {
                        iArr3[i16] = i18;
                        i16++;
                    }
                }
                if (h11 < 0 && zArr[i13]) {
                    iArr3[i16] = h11;
                    i16++;
                }
                for (int i19 = 0; i19 < i10; i19++) {
                    int i20 = iArr[i19] + h11;
                    if (i20 < 0 && zArr[i19]) {
                        iArr3[i16] = i20;
                        i16++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr3, i16);
                int i21 = 0;
                for (int i22 = i10 - 1; i22 >= 0; i22--) {
                    int i23 = iArr[i22] + h11;
                    if (i23 > 0 && zArr[i22]) {
                        iArr4[i21] = i23;
                        i21++;
                    }
                }
                if (h11 > 0 && zArr[i13]) {
                    iArr4[i21] = h11;
                    i21++;
                }
                for (int i24 = 0; i24 < i11; i24++) {
                    int i25 = iArr2[i24] + h11;
                    if (i25 > 0 && zArr[i10 + i24]) {
                        iArr4[i21] = i25;
                        i21++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr4, i21);
                iArr = copyOf;
                i10 = i16;
                i11 = i21;
            } else {
                int h12 = b0Var.h();
                int h13 = b0Var.h();
                int[] iArr5 = new int[h12];
                for (int i26 = 0; i26 < h12; i26++) {
                    iArr5[i26] = b0Var.h() + 1;
                    b0Var.k();
                }
                int[] iArr6 = new int[h13];
                for (int i27 = 0; i27 < h13; i27++) {
                    iArr6[i27] = b0Var.h() + 1;
                    b0Var.k();
                }
                int[] iArr7 = iArr5;
                i10 = h12;
                iArr = iArr7;
                int[] iArr8 = iArr6;
                i11 = h13;
                iArr2 = iArr8;
            }
            i12++;
        }
    }

    public static int q(byte[] bArr, int i10) {
        int i11;
        synchronized (f19782c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                try {
                    i12 = d(bArr, i12, i10);
                    if (i12 < i10) {
                        int[] iArr = f19783d;
                        if (iArr.length <= i13) {
                            f19783d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f19783d[i13] = i12;
                        i12 += 3;
                        i13++;
                    }
                } finally {
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f19783d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i19 + 1;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
