package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class ta extends ak {

    /* renamed from: b  reason: collision with root package name */
    public static final a f12312b = p50.f10585a;

    /* renamed from: a  reason: collision with root package name */
    private final a f12313a;

    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f12314a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final boolean f12315b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f12316c;

        public b(int i10, boolean z10, int i11) {
            this.f12314a = i10;
            this.f12315b = z10;
            this.f12316c = i11;
        }
    }

    public ta() {
        this((a) null);
    }

    private static int a(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static byte[] a(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return yp.f13667f;
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    private static d3 b(yg ygVar, int i10, int i11, boolean z10, int i12, a aVar) {
        yg ygVar2 = ygVar;
        int d10 = ygVar.d();
        int b10 = b(ygVar.c(), d10);
        String str = new String(ygVar.c(), d10, b10 - d10, "ISO-8859-1");
        ygVar2.f(b10 + 1);
        int w10 = ygVar.w();
        boolean z11 = (w10 & 2) != 0;
        boolean z12 = (w10 & 1) != 0;
        int w11 = ygVar.w();
        String[] strArr = new String[w11];
        for (int i13 = 0; i13 < w11; i13++) {
            int d11 = ygVar.d();
            int b11 = b(ygVar.c(), d11);
            strArr[i13] = new String(ygVar.c(), d11, b11 - d11, "ISO-8859-1");
            ygVar2.f(b11 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = d10 + i10;
        while (ygVar.d() < i14) {
            ua a10 = a(i11, ygVar2, z10, i12, aVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return new d3(str, z11, z12, strArr, (ua[]) arrayList.toArray(new ua[0]));
    }

    private static String b(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    private static ef c(yg ygVar, int i10) {
        int C = ygVar.C();
        int z10 = ygVar.z();
        int z11 = ygVar.z();
        int w10 = ygVar.w();
        int w11 = ygVar.w();
        xg xgVar = new xg();
        xgVar.a(ygVar);
        int i11 = ((i10 - 10) * 8) / (w10 + w11);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int a10 = xgVar.a(w10);
            int a11 = xgVar.a(w11);
            iArr[i12] = a10;
            iArr2[i12] = a11;
        }
        return new ef(C, z10, z11, iArr, iArr2);
    }

    private static sh d(yg ygVar, int i10) {
        byte[] bArr = new byte[i10];
        ygVar.a(bArr, 0, i10);
        int b10 = b(bArr, 0);
        return new sh(new String(bArr, 0, b10, "ISO-8859-1"), a(bArr, b10 + 1, i10));
    }

    private static ao e(yg ygVar, int i10) {
        if (i10 < 1) {
            return null;
        }
        int w10 = ygVar.w();
        String b10 = b(w10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        ygVar.a(bArr, 0, i11);
        int b11 = b(bArr, 0, w10);
        String str = new String(bArr, 0, b11, b10);
        int a10 = b11 + a(w10);
        return new ao("TXXX", str, a(bArr, a10, b(bArr, a10, w10), b10));
    }

    private static vp f(yg ygVar, int i10) {
        if (i10 < 1) {
            return null;
        }
        int w10 = ygVar.w();
        String b10 = b(w10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        ygVar.a(bArr, 0, i11);
        int b11 = b(bArr, 0, w10);
        String str = new String(bArr, 0, b11, b10);
        int a10 = b11 + a(w10);
        return new vp("WXXX", str, a(bArr, a10, b(bArr, a10), "ISO-8859-1"));
    }

    private static int g(yg ygVar, int i10) {
        byte[] c10 = ygVar.c();
        int d10 = ygVar.d();
        int i11 = d10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= d10 + i10) {
                return i10;
            }
            if ((c10[i11] & 255) == 255 && c10[i12] == 0) {
                System.arraycopy(c10, i11 + 2, c10, i12, (i10 - (i11 - d10)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    public ta(a aVar) {
        this.f12313a = aVar;
    }

    /* access modifiers changed from: protected */
    public we a(ze zeVar, ByteBuffer byteBuffer) {
        return a(byteBuffer.array(), byteBuffer.limit());
    }

    private static u0 a(yg ygVar, int i10, int i11) {
        int i12;
        String str;
        int w10 = ygVar.w();
        String b10 = b(w10);
        int i13 = i10 - 1;
        byte[] bArr = new byte[i13];
        ygVar.a(bArr, 0, i13);
        if (i11 == 2) {
            str = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i12 = 2;
        } else {
            i12 = b(bArr, 0);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, i12, "ISO-8859-1"));
            if (lowerCase.indexOf(47) == -1) {
                str = "image/" + lowerCase;
            } else {
                str = lowerCase;
            }
        }
        int i14 = i12 + 2;
        int b11 = b(bArr, i14, w10);
        return new u0(str, new String(bArr, i14, b11 - i14, b10), bArr[i12 + 1] & 255, a(bArr, b11 + a(w10), i13));
    }

    private static vp c(yg ygVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        ygVar.a(bArr, 0, i10);
        return new vp(str, (String) null, new String(bArr, 0, b(bArr, 0), "ISO-8859-1"));
    }

    private static y9 b(yg ygVar, int i10) {
        int w10 = ygVar.w();
        String b10 = b(w10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        ygVar.a(bArr, 0, i11);
        int b11 = b(bArr, 0);
        String str = new String(bArr, 0, b11, "ISO-8859-1");
        int i12 = b11 + 1;
        int b12 = b(bArr, i12, w10);
        String a10 = a(bArr, i12, b12, b10);
        int a11 = b12 + a(w10);
        int b13 = b(bArr, a11, w10);
        return new y9(str, a10, a(bArr, a11, b13, b10), a(bArr, b13 + a(w10), i11));
    }

    private static g2 a(yg ygVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        ygVar.a(bArr, 0, i10);
        return new g2(str, bArr);
    }

    private static c3 a(yg ygVar, int i10, int i11, boolean z10, int i12, a aVar) {
        yg ygVar2 = ygVar;
        int d10 = ygVar.d();
        int b10 = b(ygVar.c(), d10);
        String str = new String(ygVar.c(), d10, b10 - d10, "ISO-8859-1");
        ygVar.f(b10 + 1);
        int j10 = ygVar.j();
        int j11 = ygVar.j();
        long y10 = ygVar.y();
        long j12 = y10 == 4294967295L ? -1 : y10;
        long y11 = ygVar.y();
        long j13 = y11 == 4294967295L ? -1 : y11;
        ArrayList arrayList = new ArrayList();
        int i13 = d10 + i10;
        while (ygVar.d() < i13) {
            ua a10 = a(i11, ygVar, z10, i12, aVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return new c3(str, j10, j11, j12, j13, (ua[]) arrayList.toArray(new ua[0]));
    }

    private static ao b(yg ygVar, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int w10 = ygVar.w();
        String b10 = b(w10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        ygVar.a(bArr, 0, i11);
        return new ao(str, (String) null, new String(bArr, 0, b(bArr, 0, w10), b10));
    }

    private static s3 a(yg ygVar, int i10) {
        if (i10 < 4) {
            return null;
        }
        int w10 = ygVar.w();
        String b10 = b(w10);
        byte[] bArr = new byte[3];
        ygVar.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        ygVar.a(bArr2, 0, i11);
        int b11 = b(bArr2, 0, w10);
        String str2 = new String(bArr2, 0, b11, b10);
        int a10 = b11 + a(w10);
        return new s3(str, str2, a(bArr2, a10, b(bArr2, a10, w10), b10));
    }

    private static int b(byte[] bArr, int i10, int i11) {
        int b10 = b(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return b10;
        }
        while (b10 < bArr.length - 1) {
            if ((b10 - i10) % 2 == 0 && bArr[b10 + 1] == 0) {
                return b10;
            }
            b10 = b(bArr, b10 + 1);
        }
        return bArr.length;
    }

    private static int b(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x018b, code lost:
        if (r13 == 67) goto L_0x018d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.impl.ua a(int r19, com.applovin.impl.yg r20, boolean r21, int r22, com.applovin.impl.ta.a r23) {
        /*
            r0 = r19
            r7 = r20
            int r8 = r20.w()
            int r9 = r20.w()
            int r10 = r20.w()
            r11 = 3
            if (r0 < r11) goto L_0x0019
            int r1 = r20.w()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r20.A()
            if (r21 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r11) goto L_0x0043
            int r1 = r20.A()
            goto L_0x003a
        L_0x0043:
            int r1 = r20.z()
            goto L_0x003a
        L_0x0048:
            if (r0 < r11) goto L_0x0050
            int r1 = r20.C()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0067
            if (r9 != 0) goto L_0x0067
            if (r10 != 0) goto L_0x0067
            if (r13 != 0) goto L_0x0067
            if (r15 != 0) goto L_0x0067
            if (r6 != 0) goto L_0x0067
            int r0 = r20.e()
            r7.f(r0)
            return r16
        L_0x0067:
            int r1 = r20.d()
            int r5 = r1 + r15
            int r1 = r20.e()
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L_0x0082
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            com.applovin.impl.kc.d(r4, r0)
            int r0 = r20.e()
            r7.f(r0)
            return r16
        L_0x0082:
            if (r23 == 0) goto L_0x009a
            r1 = r23
            r2 = r19
            r3 = r8
            r12 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            r18 = r6
            r6 = r13
            boolean r1 = r1.a(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x009e
            r7.f(r14)
            return r16
        L_0x009a:
            r12 = r4
            r14 = r5
            r18 = r6
        L_0x009e:
            r1 = 1
            if (r0 != r11) goto L_0x00c0
            r2 = r18
            r3 = r2 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00a9
            r3 = 1
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            r4 = r2 & 64
            if (r4 == 0) goto L_0x00b0
            r4 = 1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            r2 = r2 & 32
            if (r2 == 0) goto L_0x00b7
            r2 = 1
            goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            r17 = r3
            r5 = r4
            r6 = 0
            r3 = r2
            r4 = r17
            goto L_0x00ed
        L_0x00c0:
            r2 = r18
            r3 = 4
            if (r0 != r3) goto L_0x00e7
            r3 = r2 & 64
            if (r3 == 0) goto L_0x00cb
            r3 = 1
            goto L_0x00cc
        L_0x00cb:
            r3 = 0
        L_0x00cc:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x00d2
            r4 = 1
            goto L_0x00d3
        L_0x00d2:
            r4 = 0
        L_0x00d3:
            r5 = r2 & 4
            if (r5 == 0) goto L_0x00d9
            r5 = 1
            goto L_0x00da
        L_0x00d9:
            r5 = 0
        L_0x00da:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x00e0
            r6 = 1
            goto L_0x00e1
        L_0x00e0:
            r6 = 0
        L_0x00e1:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00eb
            r17 = 1
            goto L_0x00ed
        L_0x00e7:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x00eb:
            r17 = 0
        L_0x00ed:
            if (r4 != 0) goto L_0x0220
            if (r5 == 0) goto L_0x00f3
            goto L_0x0220
        L_0x00f3:
            if (r3 == 0) goto L_0x00fa
            int r15 = r15 + -1
            r7.g(r1)
        L_0x00fa:
            if (r17 == 0) goto L_0x0102
            int r15 = r15 + -4
            r1 = 4
            r7.g(r1)
        L_0x0102:
            if (r6 == 0) goto L_0x0108
            int r15 = g(r7, r15)
        L_0x0108:
            r1 = 84
            r2 = 2
            r3 = 88
            if (r8 != r1) goto L_0x011d
            if (r9 != r3) goto L_0x011d
            if (r10 != r3) goto L_0x011d
            if (r0 == r2) goto L_0x0117
            if (r13 != r3) goto L_0x011d
        L_0x0117:
            com.applovin.impl.ao r1 = e(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            goto L_0x01ed
        L_0x011d:
            if (r8 != r1) goto L_0x012c
            java.lang.String r1 = a((int) r0, (int) r8, (int) r9, (int) r10, (int) r13)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            com.applovin.impl.ao r1 = b((com.applovin.impl.yg) r7, (int) r15, (java.lang.String) r1)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            goto L_0x01ed
        L_0x0129:
            r0 = move-exception
            goto L_0x021c
        L_0x012c:
            r4 = 87
            if (r8 != r4) goto L_0x013e
            if (r9 != r3) goto L_0x013e
            if (r10 != r3) goto L_0x013e
            if (r0 == r2) goto L_0x0138
            if (r13 != r3) goto L_0x013e
        L_0x0138:
            com.applovin.impl.vp r1 = f(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            goto L_0x01ed
        L_0x013e:
            if (r8 != r4) goto L_0x014a
            java.lang.String r1 = a((int) r0, (int) r8, (int) r9, (int) r10, (int) r13)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            com.applovin.impl.vp r1 = c(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            goto L_0x01ed
        L_0x014a:
            r3 = 73
            r4 = 80
            if (r8 != r4) goto L_0x0160
            r5 = 82
            if (r9 != r5) goto L_0x0160
            if (r10 != r3) goto L_0x0160
            r5 = 86
            if (r13 != r5) goto L_0x0160
            com.applovin.impl.sh r1 = d(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            goto L_0x01ed
        L_0x0160:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L_0x0178
            r5 = 69
            if (r9 != r5) goto L_0x0178
            if (r10 != r6) goto L_0x0178
            r5 = 66
            if (r13 == r5) goto L_0x0172
            if (r0 != r2) goto L_0x0178
        L_0x0172:
            com.applovin.impl.y9 r1 = b((com.applovin.impl.yg) r7, (int) r15)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            goto L_0x01ed
        L_0x0178:
            r5 = 65
            r11 = 67
            if (r0 != r2) goto L_0x0185
            if (r8 != r4) goto L_0x0193
            if (r9 != r3) goto L_0x0193
            if (r10 != r11) goto L_0x0193
            goto L_0x018d
        L_0x0185:
            if (r8 != r5) goto L_0x0193
            if (r9 != r4) goto L_0x0193
            if (r10 != r3) goto L_0x0193
            if (r13 != r11) goto L_0x0193
        L_0x018d:
            com.applovin.impl.u0 r1 = a((com.applovin.impl.yg) r7, (int) r15, (int) r0)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            goto L_0x01ed
        L_0x0193:
            r3 = 77
            if (r8 != r11) goto L_0x01a4
            if (r9 != r6) goto L_0x01a4
            if (r10 != r3) goto L_0x01a4
            if (r13 == r3) goto L_0x019f
            if (r0 != r2) goto L_0x01a4
        L_0x019f:
            com.applovin.impl.s3 r1 = a((com.applovin.impl.yg) r7, (int) r15)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            goto L_0x01ed
        L_0x01a4:
            if (r8 != r11) goto L_0x01be
            r2 = 72
            if (r9 != r2) goto L_0x01be
            if (r10 != r5) goto L_0x01be
            if (r13 != r4) goto L_0x01be
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            com.applovin.impl.c3 r1 = a(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            goto L_0x01ed
        L_0x01be:
            if (r8 != r11) goto L_0x01d6
            if (r9 != r1) goto L_0x01d6
            if (r10 != r6) goto L_0x01d6
            if (r13 != r11) goto L_0x01d6
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            com.applovin.impl.d3 r1 = b(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            goto L_0x01ed
        L_0x01d6:
            if (r8 != r3) goto L_0x01e5
            r2 = 76
            if (r9 != r2) goto L_0x01e5
            if (r10 != r2) goto L_0x01e5
            if (r13 != r1) goto L_0x01e5
            com.applovin.impl.ef r1 = c(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            goto L_0x01ed
        L_0x01e5:
            java.lang.String r1 = a((int) r0, (int) r8, (int) r9, (int) r10, (int) r13)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            com.applovin.impl.g2 r1 = a((com.applovin.impl.yg) r7, (int) r15, (java.lang.String) r1)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
        L_0x01ed:
            if (r1 != 0) goto L_0x020f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            java.lang.String r3 = "Failed to decode frame: id="
            r2.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            java.lang.String r0 = a((int) r0, (int) r8, (int) r9, (int) r10, (int) r13)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            r2.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x0213 }
            com.applovin.impl.kc.d(r12, r0)     // Catch:{ UnsupportedEncodingException -> 0x0213 }
        L_0x020f:
            r7.f(r14)
            return r1
        L_0x0213:
            java.lang.String r0 = "Unsupported character encoding"
            com.applovin.impl.kc.d(r12, r0)     // Catch:{ all -> 0x0129 }
            r7.f(r14)
            return r16
        L_0x021c:
            r7.f(r14)
            throw r0
        L_0x0220:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            com.applovin.impl.kc.d(r12, r0)
            r7.f(r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ta.a(int, com.applovin.impl.yg, boolean, int, com.applovin.impl.ta$a):com.applovin.impl.ua");
    }

    private static b a(yg ygVar) {
        if (ygVar.a() < 10) {
            kc.d("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int z10 = ygVar.z();
        boolean z11 = false;
        if (z10 != 4801587) {
            kc.d("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", new Object[]{Integer.valueOf(z10)}));
            return null;
        }
        int w10 = ygVar.w();
        ygVar.g(1);
        int w11 = ygVar.w();
        int v10 = ygVar.v();
        if (w10 == 2) {
            if ((w11 & 64) != 0) {
                kc.d("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (w10 == 3) {
            if ((w11 & 64) != 0) {
                int j10 = ygVar.j();
                ygVar.g(j10);
                v10 -= j10 + 4;
            }
        } else if (w10 == 4) {
            if ((w11 & 64) != 0) {
                int v11 = ygVar.v();
                ygVar.g(v11 - 4);
                v10 -= v11;
            }
            if ((w11 & 16) != 0) {
                v10 -= 10;
            }
        } else {
            kc.d("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + w10);
            return null;
        }
        if (w10 < 4 && (w11 & 128) != 0) {
            z11 = true;
        }
        return new b(w10, z11, v10);
    }

    private static String a(byte[] bArr, int i10, int i11, String str) {
        return (i11 <= i10 || i11 > bArr.length) ? MaxReward.DEFAULT_LABEL : new String(bArr, i10, i11 - i10, str);
    }

    private static String a(int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if ((r10 & 1) != 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0084, code lost:
        if ((r10 & 128) != 0) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(com.applovin.impl.yg r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.d()
        L_0x0008:
            int r3 = r18.a()     // Catch:{ all -> 0x00ad }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00a9
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r18.j()     // Catch:{ all -> 0x00ad }
            long r8 = r18.y()     // Catch:{ all -> 0x00ad }
            int r10 = r18.C()     // Catch:{ all -> 0x00ad }
            goto L_0x002c
        L_0x0022:
            int r7 = r18.z()     // Catch:{ all -> 0x00ad }
            int r8 = r18.z()     // Catch:{ all -> 0x00ad }
            long r8 = (long) r8
            r10 = 0
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003a
            if (r10 != 0) goto L_0x003a
            r1.f(r2)
            return r4
        L_0x003a:
            r7 = 4
            if (r0 != r7) goto L_0x006b
            if (r21 != 0) goto L_0x006b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004b
            r1.f(r2)
            return r6
        L_0x004b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006b:
            if (r0 != r7) goto L_0x0079
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0073
            r3 = 1
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0079:
            if (r0 != r3) goto L_0x0087
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0081
            r3 = 1
            goto L_0x0082
        L_0x0081:
            r3 = 0
        L_0x0082:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0087:
            r3 = 0
        L_0x0088:
            r4 = 0
        L_0x0089:
            if (r4 == 0) goto L_0x008d
            int r3 = r3 + 4
        L_0x008d:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0096
            r1.f(r2)
            return r6
        L_0x0096:
            int r3 = r18.a()     // Catch:{ all -> 0x00ad }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a3
            r1.f(r2)
            return r6
        L_0x00a3:
            int r3 = (int) r8
            r1.g(r3)     // Catch:{ all -> 0x00ad }
            goto L_0x0008
        L_0x00a9:
            r1.f(r2)
            return r4
        L_0x00ad:
            r0 = move-exception
            r1.f(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ta.a(com.applovin.impl.yg, int, int, boolean):boolean");
    }

    public we a(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        yg ygVar = new yg(bArr, i10);
        b a10 = a(ygVar);
        if (a10 == null) {
            return null;
        }
        int d10 = ygVar.d();
        int i11 = a10.f12314a == 2 ? 6 : 10;
        int b10 = a10.f12316c;
        if (a10.f12315b) {
            b10 = g(ygVar, a10.f12316c);
        }
        ygVar.e(d10 + b10);
        boolean z10 = false;
        if (!a(ygVar, a10.f12314a, i11, false)) {
            if (a10.f12314a != 4 || !a(ygVar, 4, i11, true)) {
                kc.d("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + a10.f12314a);
                return null;
            }
            z10 = true;
        }
        while (ygVar.a() >= i11) {
            ua a11 = a(a10.f12314a, ygVar, z10, i11, this.f12313a);
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        return new we((List) arrayList);
    }
}
