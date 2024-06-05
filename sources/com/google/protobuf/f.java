package com.google.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import com.google.protobuf.d0;
import com.google.protobuf.z;
import java.io.IOException;
import java.util.Objects;

/* compiled from: ArrayDecoders */
final class f {

    /* compiled from: ArrayDecoders */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27002a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.b2$b[] r0 = com.google.protobuf.b2.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27002a = r0
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27002a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27002a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27002a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27002a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27002a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27002a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f27002a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f27002a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f27002a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f27002a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f27002a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f27002a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f27002a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f27002a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f27002a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f27002a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f27002a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.a.<clinit>():void");
        }
    }

    /* compiled from: ArrayDecoders */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f27003a;

        /* renamed from: b  reason: collision with root package name */
        public long f27004b;

        /* renamed from: c  reason: collision with root package name */
        public Object f27005c;

        /* renamed from: d  reason: collision with root package name */
        public final q f27006d;

        b(q qVar) {
            Objects.requireNonNull(qVar);
            this.f27006d = qVar;
        }
    }

    static int A(int i10, byte[] bArr, int i11, int i12, d0.j<?> jVar, b bVar) {
        c0 c0Var = (c0) jVar;
        int I = I(bArr, i11, bVar);
        c0Var.k(j.b(bVar.f27003a));
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f27003a) {
                break;
            }
            I = I(bArr, I2, bVar);
            c0Var.k(j.b(bVar.f27003a));
        }
        return I;
    }

    static int B(int i10, byte[] bArr, int i11, int i12, d0.j<?> jVar, b bVar) {
        m0 m0Var = (m0) jVar;
        int L = L(bArr, i11, bVar);
        m0Var.g(j.c(bVar.f27004b));
        while (L < i12) {
            int I = I(bArr, L, bVar);
            if (i10 != bVar.f27003a) {
                break;
            }
            L = L(bArr, I, bVar);
            m0Var.g(j.c(bVar.f27004b));
        }
        return L;
    }

    static int C(byte[] bArr, int i10, b bVar) throws e0 {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f27003a;
        if (i11 < 0) {
            throw e0.g();
        } else if (i11 == 0) {
            bVar.f27005c = MaxReward.DEFAULT_LABEL;
            return I;
        } else {
            bVar.f27005c = new String(bArr, I, i11, d0.f26986b);
            return I + i11;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[EDGE_INSN: B:21:0x0044->B:17:0x0044 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    static int D(int r4, byte[] r5, int r6, int r7, com.google.protobuf.d0.j<?> r8, com.google.protobuf.f.b r9) throws com.google.protobuf.e0 {
        /*
            int r6 = I(r5, r6, r9)
            int r0 = r9.f27003a
            if (r0 < 0) goto L_0x0045
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            r8.add(r1)
            goto L_0x001b
        L_0x0010:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.d0.f26986b
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L_0x001a:
            int r6 = r6 + r0
        L_0x001b:
            if (r6 >= r7) goto L_0x0044
            int r0 = I(r5, r6, r9)
            int r2 = r9.f27003a
            if (r4 == r2) goto L_0x0026
            goto L_0x0044
        L_0x0026:
            int r6 = I(r5, r0, r9)
            int r0 = r9.f27003a
            if (r0 < 0) goto L_0x003f
            if (r0 != 0) goto L_0x0034
            r8.add(r1)
            goto L_0x001b
        L_0x0034:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.d0.f26986b
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
            goto L_0x001a
        L_0x003f:
            com.google.protobuf.e0 r4 = com.google.protobuf.e0.g()
            throw r4
        L_0x0044:
            return r6
        L_0x0045:
            com.google.protobuf.e0 r4 = com.google.protobuf.e0.g()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.D(int, byte[], int, int, com.google.protobuf.d0$j, com.google.protobuf.f$b):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r2 = r7 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (com.google.protobuf.a2.t(r6, r7, r2) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r9.add(new java.lang.String(r6, r7, r0, com.google.protobuf.d0.f26986b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        throw com.google.protobuf.e0.d();
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059 A[EDGE_INSN: B:28:0x0059->B:23:0x0059 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int E(int r5, byte[] r6, int r7, int r8, com.google.protobuf.d0.j<?> r9, com.google.protobuf.f.b r10) throws com.google.protobuf.e0 {
        /*
            int r7 = I(r6, r7, r10)
            int r0 = r10.f27003a
            if (r0 < 0) goto L_0x005f
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            r9.add(r1)
            goto L_0x0023
        L_0x0010:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.a2.t(r6, r7, r2)
            if (r3 == 0) goto L_0x005a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.d0.f26986b
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L_0x0022:
            r7 = r2
        L_0x0023:
            if (r7 >= r8) goto L_0x0059
            int r0 = I(r6, r7, r10)
            int r2 = r10.f27003a
            if (r5 == r2) goto L_0x002e
            goto L_0x0059
        L_0x002e:
            int r7 = I(r6, r0, r10)
            int r0 = r10.f27003a
            if (r0 < 0) goto L_0x0054
            if (r0 != 0) goto L_0x003c
            r9.add(r1)
            goto L_0x0023
        L_0x003c:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.a2.t(r6, r7, r2)
            if (r3 == 0) goto L_0x004f
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.d0.f26986b
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
            goto L_0x0022
        L_0x004f:
            com.google.protobuf.e0 r5 = com.google.protobuf.e0.d()
            throw r5
        L_0x0054:
            com.google.protobuf.e0 r5 = com.google.protobuf.e0.g()
            throw r5
        L_0x0059:
            return r7
        L_0x005a:
            com.google.protobuf.e0 r5 = com.google.protobuf.e0.d()
            throw r5
        L_0x005f:
            com.google.protobuf.e0 r5 = com.google.protobuf.e0.g()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.E(int, byte[], int, int, com.google.protobuf.d0$j, com.google.protobuf.f$b):int");
    }

    static int F(byte[] bArr, int i10, b bVar) throws e0 {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f27003a;
        if (i11 < 0) {
            throw e0.g();
        } else if (i11 == 0) {
            bVar.f27005c = MaxReward.DEFAULT_LABEL;
            return I;
        } else {
            bVar.f27005c = a2.h(bArr, I, i11);
            return I + i11;
        }
    }

    static int G(int i10, byte[] bArr, int i11, int i12, w1 w1Var, b bVar) throws e0 {
        if (b2.a(i10) != 0) {
            int b10 = b2.b(i10);
            if (b10 == 0) {
                int L = L(bArr, i11, bVar);
                w1Var.n(i10, Long.valueOf(bVar.f27004b));
                return L;
            } else if (b10 == 1) {
                w1Var.n(i10, Long.valueOf(j(bArr, i11)));
                return i11 + 8;
            } else if (b10 == 2) {
                int I = I(bArr, i11, bVar);
                int i13 = bVar.f27003a;
                if (i13 < 0) {
                    throw e0.g();
                } else if (i13 <= bArr.length - I) {
                    if (i13 == 0) {
                        w1Var.n(i10, i.f27039b);
                    } else {
                        w1Var.n(i10, i.p(bArr, I, i13));
                    }
                    return I + i13;
                } else {
                    throw e0.m();
                }
            } else if (b10 == 3) {
                w1 k10 = w1.k();
                int i14 = (i10 & -8) | 4;
                int i15 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int I2 = I(bArr, i11, bVar);
                    int i16 = bVar.f27003a;
                    if (i16 == i14) {
                        i15 = i16;
                        i11 = I2;
                        break;
                    }
                    i15 = i16;
                    i11 = G(i16, bArr, I2, i12, k10, bVar);
                }
                if (i11 > i12 || i15 != i14) {
                    throw e0.h();
                }
                w1Var.n(i10, k10);
                return i11;
            } else if (b10 == 5) {
                w1Var.n(i10, Integer.valueOf(h(bArr, i11)));
                return i11 + 4;
            } else {
                throw e0.c();
            }
        } else {
            throw e0.c();
        }
    }

    static int H(int i10, byte[] bArr, int i11, b bVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            bVar.f27003a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Ascii.DEL) << 7);
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            bVar.f27003a = i14 | (b11 << Ascii.SO);
            return i15;
        }
        int i16 = i14 | ((b11 & Ascii.DEL) << Ascii.SO);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            bVar.f27003a = i16 | (b12 << Ascii.NAK);
            return i17;
        }
        int i18 = i16 | ((b12 & Ascii.DEL) << Ascii.NAK);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            bVar.f27003a = i18 | (b13 << Ascii.FS);
            return i19;
        }
        int i20 = i18 | ((b13 & Ascii.DEL) << Ascii.FS);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                bVar.f27003a = i20;
                return i21;
            }
        }
    }

    static int I(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return H(b10, bArr, i11, bVar);
        }
        bVar.f27003a = b10;
        return i11;
    }

    static int J(int i10, byte[] bArr, int i11, int i12, d0.j<?> jVar, b bVar) {
        c0 c0Var = (c0) jVar;
        int I = I(bArr, i11, bVar);
        c0Var.k(bVar.f27003a);
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f27003a) {
                break;
            }
            I = I(bArr, I2, bVar);
            c0Var.k(bVar.f27003a);
        }
        return I;
    }

    static int K(long j10, byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | (((long) (b10 & Ascii.DEL)) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j11 |= ((long) (b11 & Ascii.DEL)) << i12;
            byte b12 = b11;
            i11 = i13;
            b10 = b12;
        }
        bVar.f27004b = j11;
        return i11;
    }

    static int L(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        long j10 = (long) bArr[i10];
        if (j10 < 0) {
            return K(j10, bArr, i11, bVar);
        }
        bVar.f27004b = j10;
        return i11;
    }

    static int M(int i10, byte[] bArr, int i11, int i12, d0.j<?> jVar, b bVar) {
        m0 m0Var = (m0) jVar;
        int L = L(bArr, i11, bVar);
        m0Var.g(bVar.f27004b);
        while (L < i12) {
            int I = I(bArr, L, bVar);
            if (i10 != bVar.f27003a) {
                break;
            }
            L = L(bArr, I, bVar);
            m0Var.g(bVar.f27004b);
        }
        return L;
    }

    static int N(Object obj, n1 n1Var, byte[] bArr, int i10, int i11, int i12, b bVar) throws IOException {
        int h02 = ((y0) n1Var).h0(obj, bArr, i10, i11, i12, bVar);
        bVar.f27005c = obj;
        return h02;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int O(java.lang.Object r6, com.google.protobuf.n1 r7, byte[] r8, int r9, int r10, com.google.protobuf.f.b r11) throws java.io.IOException {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = H(r9, r8, r0, r11)
            int r9 = r11.f27003a
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x001e
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x001e
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.f(r1, r2, r3, r4, r5)
            r11.f27005c = r6
            return r9
        L_0x001e:
            com.google.protobuf.e0 r6 = com.google.protobuf.e0.m()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.O(java.lang.Object, com.google.protobuf.n1, byte[], int, int, com.google.protobuf.f$b):int");
    }

    static int P(int i10, byte[] bArr, int i11, int i12, b bVar) throws e0 {
        if (b2.a(i10) != 0) {
            int b10 = b2.b(i10);
            if (b10 == 0) {
                return L(bArr, i11, bVar);
            }
            if (b10 == 1) {
                return i11 + 8;
            }
            if (b10 == 2) {
                return I(bArr, i11, bVar) + bVar.f27003a;
            }
            if (b10 == 3) {
                int i13 = (i10 & -8) | 4;
                int i14 = 0;
                while (i11 < i12) {
                    i11 = I(bArr, i11, bVar);
                    i14 = bVar.f27003a;
                    if (i14 == i13) {
                        break;
                    }
                    i11 = P(i14, bArr, i11, i12, bVar);
                }
                if (i11 <= i12 && i14 == i13) {
                    return i11;
                }
                throw e0.h();
            } else if (b10 == 5) {
                return i11 + 4;
            } else {
                throw e0.c();
            }
        } else {
            throw e0.c();
        }
    }

    static int a(int i10, byte[] bArr, int i11, int i12, d0.j<?> jVar, b bVar) {
        g gVar = (g) jVar;
        int L = L(bArr, i11, bVar);
        gVar.g(bVar.f27004b != 0);
        while (L < i12) {
            int I = I(bArr, L, bVar);
            if (i10 != bVar.f27003a) {
                break;
            }
            L = L(bArr, I, bVar);
            gVar.g(bVar.f27004b != 0);
        }
        return L;
    }

    static int b(byte[] bArr, int i10, b bVar) throws e0 {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f27003a;
        if (i11 < 0) {
            throw e0.g();
        } else if (i11 > bArr.length - I) {
            throw e0.m();
        } else if (i11 == 0) {
            bVar.f27005c = i.f27039b;
            return I;
        } else {
            bVar.f27005c = i.p(bArr, I, i11);
            return I + i11;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004d A[EDGE_INSN: B:30:0x004d->B:22:0x004d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int c(int r2, byte[] r3, int r4, int r5, com.google.protobuf.d0.j<?> r6, com.google.protobuf.f.b r7) throws com.google.protobuf.e0 {
        /*
            int r4 = I(r3, r4, r7)
            int r0 = r7.f27003a
            if (r0 < 0) goto L_0x0053
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x004e
            if (r0 != 0) goto L_0x0014
            com.google.protobuf.i r0 = com.google.protobuf.i.f27039b
            r6.add(r0)
            goto L_0x001c
        L_0x0014:
            com.google.protobuf.i r1 = com.google.protobuf.i.p(r3, r4, r0)
            r6.add(r1)
        L_0x001b:
            int r4 = r4 + r0
        L_0x001c:
            if (r4 >= r5) goto L_0x004d
            int r0 = I(r3, r4, r7)
            int r1 = r7.f27003a
            if (r2 == r1) goto L_0x0027
            goto L_0x004d
        L_0x0027:
            int r4 = I(r3, r0, r7)
            int r0 = r7.f27003a
            if (r0 < 0) goto L_0x0048
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x0043
            if (r0 != 0) goto L_0x003b
            com.google.protobuf.i r0 = com.google.protobuf.i.f27039b
            r6.add(r0)
            goto L_0x001c
        L_0x003b:
            com.google.protobuf.i r1 = com.google.protobuf.i.p(r3, r4, r0)
            r6.add(r1)
            goto L_0x001b
        L_0x0043:
            com.google.protobuf.e0 r2 = com.google.protobuf.e0.m()
            throw r2
        L_0x0048:
            com.google.protobuf.e0 r2 = com.google.protobuf.e0.g()
            throw r2
        L_0x004d:
            return r4
        L_0x004e:
            com.google.protobuf.e0 r2 = com.google.protobuf.e0.m()
            throw r2
        L_0x0053:
            com.google.protobuf.e0 r2 = com.google.protobuf.e0.g()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.c(int, byte[], int, int, com.google.protobuf.d0$j, com.google.protobuf.f$b):int");
    }

    static double d(byte[] bArr, int i10) {
        return Double.longBitsToDouble(j(bArr, i10));
    }

    static int e(int i10, byte[] bArr, int i11, int i12, d0.j<?> jVar, b bVar) {
        n nVar = (n) jVar;
        nVar.f(d(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f27003a) {
                break;
            }
            nVar.f(d(bArr, I));
            i13 = I + 8;
        }
        return i13;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0225, code lost:
        r10 = r10 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0230, code lost:
        r10 = r10 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int f(int r8, byte[] r9, int r10, int r11, com.google.protobuf.z.c<?, ?> r12, com.google.protobuf.z.e<?, ?> r13, com.google.protobuf.v1<com.google.protobuf.w1, com.google.protobuf.w1> r14, com.google.protobuf.f.b r15) throws java.io.IOException {
        /*
            com.google.protobuf.v<com.google.protobuf.z$d> r0 = r12.extensions
            int r2 = r8 >>> 3
            com.google.protobuf.z$d r8 = r13.f27309b
            boolean r8 = r8.J()
            if (r8 == 0) goto L_0x00ed
            com.google.protobuf.z$d r8 = r13.f27309b
            boolean r8 = r8.Z()
            if (r8 == 0) goto L_0x00ed
            int[] r8 = com.google.protobuf.f.a.f27002a
            com.google.protobuf.b2$b r11 = r13.a()
            int r11 = r11.ordinal()
            r8 = r8[r11]
            switch(r8) {
                case 1: goto L_0x00dd;
                case 2: goto L_0x00cd;
                case 3: goto L_0x00bd;
                case 4: goto L_0x00bd;
                case 5: goto L_0x00ad;
                case 6: goto L_0x00ad;
                case 7: goto L_0x009d;
                case 8: goto L_0x009d;
                case 9: goto L_0x008d;
                case 10: goto L_0x008d;
                case 11: goto L_0x007d;
                case 12: goto L_0x006d;
                case 13: goto L_0x005d;
                case 14: goto L_0x0040;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Type cannot be packed: "
            r9.append(r10)
            com.google.protobuf.z$d r10 = r13.f27309b
            com.google.protobuf.b2$b r10 = r10.K()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0040:
            com.google.protobuf.c0 r8 = new com.google.protobuf.c0
            r8.<init>()
            int r9 = y(r9, r10, r8, r15)
            com.google.protobuf.z$d r10 = r13.f27309b
            com.google.protobuf.d0$d r4 = r10.c()
            r5 = 0
            r1 = r12
            r3 = r8
            r6 = r14
            com.google.protobuf.p1.z(r1, r2, r3, r4, r5, r6)
            com.google.protobuf.z$d r10 = r13.f27309b
            r0.y(r10, r8)
            goto L_0x0244
        L_0x005d:
            com.google.protobuf.m0 r8 = new com.google.protobuf.m0
            r8.<init>()
            int r9 = x(r9, r10, r8, r15)
            com.google.protobuf.z$d r10 = r13.f27309b
            r0.y(r10, r8)
            goto L_0x0244
        L_0x006d:
            com.google.protobuf.c0 r8 = new com.google.protobuf.c0
            r8.<init>()
            int r9 = w(r9, r10, r8, r15)
            com.google.protobuf.z$d r10 = r13.f27309b
            r0.y(r10, r8)
            goto L_0x0244
        L_0x007d:
            com.google.protobuf.g r8 = new com.google.protobuf.g
            r8.<init>()
            int r9 = r(r9, r10, r8, r15)
            com.google.protobuf.z$d r10 = r13.f27309b
            r0.y(r10, r8)
            goto L_0x0244
        L_0x008d:
            com.google.protobuf.c0 r8 = new com.google.protobuf.c0
            r8.<init>()
            int r9 = t(r9, r10, r8, r15)
            com.google.protobuf.z$d r10 = r13.f27309b
            r0.y(r10, r8)
            goto L_0x0244
        L_0x009d:
            com.google.protobuf.m0 r8 = new com.google.protobuf.m0
            r8.<init>()
            int r9 = u(r9, r10, r8, r15)
            com.google.protobuf.z$d r10 = r13.f27309b
            r0.y(r10, r8)
            goto L_0x0244
        L_0x00ad:
            com.google.protobuf.c0 r8 = new com.google.protobuf.c0
            r8.<init>()
            int r9 = y(r9, r10, r8, r15)
            com.google.protobuf.z$d r10 = r13.f27309b
            r0.y(r10, r8)
            goto L_0x0244
        L_0x00bd:
            com.google.protobuf.m0 r8 = new com.google.protobuf.m0
            r8.<init>()
            int r9 = z(r9, r10, r8, r15)
            com.google.protobuf.z$d r10 = r13.f27309b
            r0.y(r10, r8)
            goto L_0x0244
        L_0x00cd:
            com.google.protobuf.x r8 = new com.google.protobuf.x
            r8.<init>()
            int r9 = v(r9, r10, r8, r15)
            com.google.protobuf.z$d r10 = r13.f27309b
            r0.y(r10, r8)
            goto L_0x0244
        L_0x00dd:
            com.google.protobuf.n r8 = new com.google.protobuf.n
            r8.<init>()
            int r9 = s(r9, r10, r8, r15)
            com.google.protobuf.z$d r10 = r13.f27309b
            r0.y(r10, r8)
            goto L_0x0244
        L_0x00ed:
            com.google.protobuf.b2$b r8 = r13.a()
            com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.ENUM
            r3 = 0
            if (r8 != r1) goto L_0x0116
            int r10 = I(r9, r10, r15)
            com.google.protobuf.z$d r8 = r13.f27309b
            com.google.protobuf.d0$d r8 = r8.c()
            int r9 = r15.f27003a
            com.google.protobuf.d0$c r8 = r8.a(r9)
            if (r8 != 0) goto L_0x010e
            int r8 = r15.f27003a
            com.google.protobuf.p1.L(r12, r2, r8, r3, r14)
            return r10
        L_0x010e:
            int r8 = r15.f27003a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            goto L_0x0232
        L_0x0116:
            int[] r8 = com.google.protobuf.f.a.f27002a
            com.google.protobuf.b2$b r12 = r13.a()
            int r12 = r12.ordinal()
            r8 = r8[r12]
            switch(r8) {
                case 1: goto L_0x0228;
                case 2: goto L_0x021d;
                case 3: goto L_0x0212;
                case 4: goto L_0x0212;
                case 5: goto L_0x0207;
                case 6: goto L_0x0207;
                case 7: goto L_0x01fe;
                case 8: goto L_0x01fe;
                case 9: goto L_0x01f5;
                case 10: goto L_0x01f5;
                case 11: goto L_0x01e1;
                case 12: goto L_0x01d2;
                case 13: goto L_0x01c3;
                case 14: goto L_0x01bb;
                case 15: goto L_0x01b3;
                case 16: goto L_0x01ab;
                case 17: goto L_0x0164;
                case 18: goto L_0x0127;
                default: goto L_0x0125;
            }
        L_0x0125:
            goto L_0x0232
        L_0x0127:
            com.google.protobuf.i1 r8 = com.google.protobuf.i1.a()
            com.google.protobuf.v0 r12 = r13.b()
            java.lang.Class r12 = r12.getClass()
            com.google.protobuf.n1 r2 = r8.c(r12)
            boolean r8 = r13.d()
            if (r8 == 0) goto L_0x0149
            int r8 = p(r2, r9, r10, r11, r15)
            com.google.protobuf.z$d r9 = r13.f27309b
            java.lang.Object r10 = r15.f27005c
            r0.a(r9, r10)
            goto L_0x0163
        L_0x0149:
            com.google.protobuf.z$d r8 = r13.f27309b
            java.lang.Object r8 = r0.i(r8)
            if (r8 != 0) goto L_0x015a
            java.lang.Object r8 = r2.i()
            com.google.protobuf.z$d r12 = r13.f27309b
            r0.y(r12, r8)
        L_0x015a:
            r1 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r15
            int r8 = O(r1, r2, r3, r4, r5, r6)
        L_0x0163:
            return r8
        L_0x0164:
            int r8 = r2 << 3
            r6 = r8 | 4
            com.google.protobuf.i1 r8 = com.google.protobuf.i1.a()
            com.google.protobuf.v0 r12 = r13.b()
            java.lang.Class r12 = r12.getClass()
            com.google.protobuf.n1 r2 = r8.c(r12)
            boolean r8 = r13.d()
            if (r8 == 0) goto L_0x0190
            r1 = r2
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r6
            r6 = r15
            int r8 = n(r1, r2, r3, r4, r5, r6)
            com.google.protobuf.z$d r9 = r13.f27309b
            java.lang.Object r10 = r15.f27005c
            r0.a(r9, r10)
            goto L_0x01aa
        L_0x0190:
            com.google.protobuf.z$d r8 = r13.f27309b
            java.lang.Object r8 = r0.i(r8)
            if (r8 != 0) goto L_0x01a1
            java.lang.Object r8 = r2.i()
            com.google.protobuf.z$d r12 = r13.f27309b
            r0.y(r12, r8)
        L_0x01a1:
            r1 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r7 = r15
            int r8 = N(r1, r2, r3, r4, r5, r6, r7)
        L_0x01aa:
            return r8
        L_0x01ab:
            int r10 = C(r9, r10, r15)
            java.lang.Object r3 = r15.f27005c
            goto L_0x0232
        L_0x01b3:
            int r10 = b(r9, r10, r15)
            java.lang.Object r3 = r15.f27005c
            goto L_0x0232
        L_0x01bb:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Shouldn't reach here."
            r8.<init>(r9)
            throw r8
        L_0x01c3:
            int r10 = L(r9, r10, r15)
            long r8 = r15.f27004b
            long r8 = com.google.protobuf.j.c(r8)
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            goto L_0x0232
        L_0x01d2:
            int r10 = I(r9, r10, r15)
            int r8 = r15.f27003a
            int r8 = com.google.protobuf.j.b(r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            goto L_0x0232
        L_0x01e1:
            int r10 = L(r9, r10, r15)
            long r8 = r15.f27004b
            r11 = 0
            int r14 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r14 == 0) goto L_0x01ef
            r8 = 1
            goto L_0x01f0
        L_0x01ef:
            r8 = 0
        L_0x01f0:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            goto L_0x0232
        L_0x01f5:
            int r8 = h(r9, r10)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            goto L_0x0225
        L_0x01fe:
            long r8 = j(r9, r10)
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            goto L_0x0230
        L_0x0207:
            int r10 = I(r9, r10, r15)
            int r8 = r15.f27003a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            goto L_0x0232
        L_0x0212:
            int r10 = L(r9, r10, r15)
            long r8 = r15.f27004b
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            goto L_0x0232
        L_0x021d:
            float r8 = l(r9, r10)
            java.lang.Float r3 = java.lang.Float.valueOf(r8)
        L_0x0225:
            int r10 = r10 + 4
            goto L_0x0232
        L_0x0228:
            double r8 = d(r9, r10)
            java.lang.Double r3 = java.lang.Double.valueOf(r8)
        L_0x0230:
            int r10 = r10 + 8
        L_0x0232:
            boolean r8 = r13.d()
            if (r8 == 0) goto L_0x023e
            com.google.protobuf.z$d r8 = r13.f27309b
            r0.a(r8, r3)
            goto L_0x0243
        L_0x023e:
            com.google.protobuf.z$d r8 = r13.f27309b
            r0.y(r8, r3)
        L_0x0243:
            r9 = r10
        L_0x0244:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.f(int, byte[], int, int, com.google.protobuf.z$c, com.google.protobuf.z$e, com.google.protobuf.v1, com.google.protobuf.f$b):int");
    }

    static int g(int i10, byte[] bArr, int i11, int i12, Object obj, v0 v0Var, v1<w1, w1> v1Var, b bVar) throws IOException {
        z.e a10 = bVar.f27006d.a(v0Var, i10 >>> 3);
        if (a10 == null) {
            return G(i10, bArr, i11, i12, y0.x(obj), bVar);
        }
        z.c cVar = (z.c) obj;
        cVar.e0();
        return f(i10, bArr, i11, i12, cVar, a10, v1Var, bVar);
    }

    static int h(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << Ascii.CAN) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << Ascii.DLE);
    }

    static int i(int i10, byte[] bArr, int i11, int i12, d0.j<?> jVar, b bVar) {
        c0 c0Var = (c0) jVar;
        c0Var.k(h(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f27003a) {
                break;
            }
            c0Var.k(h(bArr, I));
            i13 = I + 4;
        }
        return i13;
    }

    static long j(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    static int k(int i10, byte[] bArr, int i11, int i12, d0.j<?> jVar, b bVar) {
        m0 m0Var = (m0) jVar;
        m0Var.g(j(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f27003a) {
                break;
            }
            m0Var.g(j(bArr, I));
            i13 = I + 8;
        }
        return i13;
    }

    static float l(byte[] bArr, int i10) {
        return Float.intBitsToFloat(h(bArr, i10));
    }

    static int m(int i10, byte[] bArr, int i11, int i12, d0.j<?> jVar, b bVar) {
        x xVar = (x) jVar;
        xVar.f(l(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f27003a) {
                break;
            }
            xVar.f(l(bArr, I));
            i13 = I + 4;
        }
        return i13;
    }

    static int n(n1 n1Var, byte[] bArr, int i10, int i11, int i12, b bVar) throws IOException {
        Object i13 = n1Var.i();
        int N = N(i13, n1Var, bArr, i10, i11, i12, bVar);
        n1Var.c(i13);
        bVar.f27005c = i13;
        return N;
    }

    static int o(n1 n1Var, int i10, byte[] bArr, int i11, int i12, d0.j<?> jVar, b bVar) throws IOException {
        int i13 = (i10 & -8) | 4;
        int n10 = n(n1Var, bArr, i11, i12, i13, bVar);
        jVar.add(bVar.f27005c);
        while (n10 < i12) {
            int I = I(bArr, n10, bVar);
            if (i10 != bVar.f27003a) {
                break;
            }
            n10 = n(n1Var, bArr, I, i12, i13, bVar);
            jVar.add(bVar.f27005c);
        }
        return n10;
    }

    static int p(n1 n1Var, byte[] bArr, int i10, int i11, b bVar) throws IOException {
        Object i12 = n1Var.i();
        int O = O(i12, n1Var, bArr, i10, i11, bVar);
        n1Var.c(i12);
        bVar.f27005c = i12;
        return O;
    }

    static int q(n1<?> n1Var, int i10, byte[] bArr, int i11, int i12, d0.j<?> jVar, b bVar) throws IOException {
        int p10 = p(n1Var, bArr, i11, i12, bVar);
        jVar.add(bVar.f27005c);
        while (p10 < i12) {
            int I = I(bArr, p10, bVar);
            if (i10 != bVar.f27003a) {
                break;
            }
            p10 = p(n1Var, bArr, I, i12, bVar);
            jVar.add(bVar.f27005c);
        }
        return p10;
    }

    static int r(byte[] bArr, int i10, d0.j<?> jVar, b bVar) throws IOException {
        g gVar = (g) jVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f27003a + I;
        while (I < i11) {
            I = L(bArr, I, bVar);
            gVar.g(bVar.f27004b != 0);
        }
        if (I == i11) {
            return I;
        }
        throw e0.m();
    }

    static int s(byte[] bArr, int i10, d0.j<?> jVar, b bVar) throws IOException {
        n nVar = (n) jVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f27003a + I;
        while (I < i11) {
            nVar.f(d(bArr, I));
            I += 8;
        }
        if (I == i11) {
            return I;
        }
        throw e0.m();
    }

    static int t(byte[] bArr, int i10, d0.j<?> jVar, b bVar) throws IOException {
        c0 c0Var = (c0) jVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f27003a + I;
        while (I < i11) {
            c0Var.k(h(bArr, I));
            I += 4;
        }
        if (I == i11) {
            return I;
        }
        throw e0.m();
    }

    static int u(byte[] bArr, int i10, d0.j<?> jVar, b bVar) throws IOException {
        m0 m0Var = (m0) jVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f27003a + I;
        while (I < i11) {
            m0Var.g(j(bArr, I));
            I += 8;
        }
        if (I == i11) {
            return I;
        }
        throw e0.m();
    }

    static int v(byte[] bArr, int i10, d0.j<?> jVar, b bVar) throws IOException {
        x xVar = (x) jVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f27003a + I;
        while (I < i11) {
            xVar.f(l(bArr, I));
            I += 4;
        }
        if (I == i11) {
            return I;
        }
        throw e0.m();
    }

    static int w(byte[] bArr, int i10, d0.j<?> jVar, b bVar) throws IOException {
        c0 c0Var = (c0) jVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f27003a + I;
        while (I < i11) {
            I = I(bArr, I, bVar);
            c0Var.k(j.b(bVar.f27003a));
        }
        if (I == i11) {
            return I;
        }
        throw e0.m();
    }

    static int x(byte[] bArr, int i10, d0.j<?> jVar, b bVar) throws IOException {
        m0 m0Var = (m0) jVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f27003a + I;
        while (I < i11) {
            I = L(bArr, I, bVar);
            m0Var.g(j.c(bVar.f27004b));
        }
        if (I == i11) {
            return I;
        }
        throw e0.m();
    }

    static int y(byte[] bArr, int i10, d0.j<?> jVar, b bVar) throws IOException {
        c0 c0Var = (c0) jVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f27003a + I;
        while (I < i11) {
            I = I(bArr, I, bVar);
            c0Var.k(bVar.f27003a);
        }
        if (I == i11) {
            return I;
        }
        throw e0.m();
    }

    static int z(byte[] bArr, int i10, d0.j<?> jVar, b bVar) throws IOException {
        m0 m0Var = (m0) jVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f27003a + I;
        while (I < i11) {
            I = L(bArr, I, bVar);
            m0Var.g(bVar.f27004b);
        }
        if (I == i11) {
            return I;
        }
        throw e0.m();
    }
}
