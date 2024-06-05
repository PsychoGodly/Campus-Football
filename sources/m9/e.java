package m9;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import l9.c;
import v8.f;
import z8.d;

/* compiled from: DecodedBitStreamParser */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f29267a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f29268b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c  reason: collision with root package name */
    private static final Charset f29269c = Charset.forName("ISO-8859-1");

    /* renamed from: d  reason: collision with root package name */
    private static final BigInteger[] f29270d;

    /* compiled from: DecodedBitStreamParser */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29271a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                m9.e$b[] r0 = m9.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29271a = r0
                m9.e$b r1 = m9.e.b.ALPHA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29271a     // Catch:{ NoSuchFieldError -> 0x001d }
                m9.e$b r1 = m9.e.b.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29271a     // Catch:{ NoSuchFieldError -> 0x0028 }
                m9.e$b r1 = m9.e.b.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29271a     // Catch:{ NoSuchFieldError -> 0x0033 }
                m9.e$b r1 = m9.e.b.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29271a     // Catch:{ NoSuchFieldError -> 0x003e }
                m9.e$b r1 = m9.e.b.ALPHA_SHIFT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29271a     // Catch:{ NoSuchFieldError -> 0x0049 }
                m9.e$b r1 = m9.e.b.PUNCT_SHIFT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m9.e.a.<clinit>():void");
        }
    }

    /* compiled from: DecodedBitStreamParser */
    private enum b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f29270d = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        bigIntegerArr[1] = valueOf;
        int i10 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f29270d;
            if (i10 < bigIntegerArr2.length) {
                bigIntegerArr2[i10] = bigIntegerArr2[i10 - 1].multiply(valueOf);
                i10++;
            } else {
                return;
            }
        }
    }

    private static int a(int i10, int[] iArr, Charset charset, int i11, StringBuilder sb2) {
        int i12;
        long j10;
        int i13;
        int i14;
        int i15 = i10;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i16 = 922;
        int i17 = 923;
        int i18 = 928;
        int i19 = 902;
        long j11 = 900;
        if (i15 == 901) {
            int[] iArr2 = new int[6];
            int i20 = i11 + 1;
            int i21 = iArr[i11];
            boolean z10 = false;
            loop0:
            while (true) {
                i13 = 0;
                long j12 = 0;
                while (i12 < iArr[0] && !z10) {
                    int i22 = i13 + 1;
                    iArr2[i13] = i21;
                    j12 = (j12 * j10) + ((long) i21);
                    int i23 = i12 + 1;
                    i21 = iArr[i12];
                    if (i21 == 900 || i21 == 901 || i21 == 902 || i21 == 924 || i21 == 928 || i21 == i17 || i21 == i16) {
                        i12 = i23 - 1;
                        i13 = i22;
                        i16 = 922;
                        i17 = 923;
                        j10 = 900;
                        z10 = true;
                    } else if (i22 % 5 != 0 || i22 <= 0) {
                        i12 = i23;
                        i13 = i22;
                        i16 = 922;
                        i17 = 923;
                        j10 = 900;
                    } else {
                        int i24 = 0;
                        while (i24 < 6) {
                            byteArrayOutputStream.write((byte) ((int) (j12 >> ((5 - i24) * 8))));
                            i24++;
                            i16 = 922;
                            i17 = 923;
                        }
                        i20 = i23;
                        j11 = 900;
                    }
                }
            }
            if (i12 != iArr[0] || i21 >= 900) {
                i14 = i13;
            } else {
                i14 = i13 + 1;
                iArr2[i13] = i21;
            }
            for (int i25 = 0; i25 < i14; i25++) {
                byteArrayOutputStream.write((byte) iArr2[i25]);
            }
        } else if (i15 == 924) {
            int i26 = i11;
            boolean z11 = false;
            int i27 = 0;
            long j13 = 0;
            while (i26 < iArr[0] && !z11) {
                int i28 = i26 + 1;
                int i29 = iArr[i26];
                if (i29 < 900) {
                    i27++;
                    j13 = (j13 * 900) + ((long) i29);
                    i26 = i28;
                } else {
                    if (i29 != 900 && i29 != 901 && i29 != i19 && i29 != 924 && i29 != i18) {
                        if (!(i29 == 923 || i29 == 922)) {
                            i26 = i28;
                        }
                    }
                    i26 = i28 - 1;
                    z11 = true;
                }
                if (i27 % 5 == 0 && i27 > 0) {
                    for (int i30 = 0; i30 < 6; i30++) {
                        byteArrayOutputStream.write((byte) ((int) (j13 >> ((5 - i30) * 8))));
                    }
                    i27 = 0;
                    j13 = 0;
                }
                i18 = 928;
                i19 = 902;
            }
            i12 = i26;
        } else {
            i12 = i11;
        }
        sb2.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i12;
    }

    static z8.e b(int[] iArr, String str) throws f {
        int i10;
        StringBuilder sb2 = new StringBuilder(iArr.length << 1);
        Charset charset = f29269c;
        int i11 = iArr[1];
        c cVar = new c();
        int i12 = 2;
        while (i12 < iArr[0]) {
            if (i11 != 913) {
                switch (i11) {
                    case 900:
                        i10 = g(iArr, i12, sb2);
                        break;
                    case 901:
                        i10 = a(i11, iArr, charset, i12, sb2);
                        break;
                    case 902:
                        i10 = f(iArr, i12, sb2);
                        break;
                    default:
                        switch (i11) {
                            case 922:
                            case 923:
                                throw f.a();
                            case 924:
                                break;
                            case 925:
                                i10 = i12 + 1;
                                break;
                            case 926:
                                i10 = i12 + 2;
                                break;
                            case 927:
                                i10 = i12 + 1;
                                charset = Charset.forName(d.a(iArr[i12]).name());
                                break;
                            case 928:
                                i10 = d(iArr, i12, cVar);
                                break;
                            default:
                                i10 = g(iArr, i12 - 1, sb2);
                                break;
                        }
                        i10 = a(i11, iArr, charset, i12, sb2);
                        break;
                }
            } else {
                i10 = i12 + 1;
                sb2.append((char) iArr[i12]);
            }
            if (i10 < iArr.length) {
                i12 = i10 + 1;
                i11 = iArr[i10];
            } else {
                throw f.a();
            }
        }
        if (sb2.length() != 0) {
            z8.e eVar = new z8.e((byte[]) null, sb2.toString(), (List<byte[]>) null, str);
            eVar.m(cVar);
            return eVar;
        }
        throw f.a();
    }

    private static String c(int[] iArr, int i10) throws f {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i11 = 0; i11 < i10; i11++) {
            bigInteger = bigInteger.add(f29270d[(i10 - i11) - 1].multiply(BigInteger.valueOf((long) iArr[i11])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw f.a();
    }

    private static int d(int[] iArr, int i10, c cVar) throws f {
        if (i10 + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i11 = 0;
            while (i11 < 2) {
                iArr2[i11] = iArr[i10];
                i11++;
                i10++;
            }
            cVar.d(Integer.parseInt(c(iArr2, 2)));
            StringBuilder sb2 = new StringBuilder();
            int g10 = g(iArr, i10, sb2);
            cVar.a(sb2.toString());
            if (iArr[g10] == 923) {
                int i12 = g10 + 1;
                int[] iArr3 = new int[(iArr[0] - i12)];
                boolean z10 = false;
                int i13 = 0;
                while (i12 < iArr[0] && !z10) {
                    int i14 = i12 + 1;
                    int i15 = iArr[i12];
                    if (i15 < 900) {
                        iArr3[i13] = i15;
                        i12 = i14;
                        i13++;
                    } else if (i15 == 922) {
                        cVar.b(true);
                        i12 = i14 + 1;
                        z10 = true;
                    } else {
                        throw f.a();
                    }
                }
                cVar.c(Arrays.copyOf(iArr3, i13));
                return i12;
            } else if (iArr[g10] != 922) {
                return g10;
            } else {
                cVar.b(true);
                return g10 + 1;
            }
        } else {
            throw f.a();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b6, code lost:
        r10 = 0;
        r15 = r3;
        r3 = r1;
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d7, code lost:
        r10 = (char) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f9, code lost:
        if (r10 == 0) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00fb, code lost:
        r0.append(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00fe, code lost:
        r5 = r5 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void e(int[] r16, int[] r17, int r18, java.lang.StringBuilder r19) {
        /*
            r0 = r19
            m9.e$b r1 = m9.e.b.ALPHA
            r2 = 0
            r4 = r18
            r3 = r1
            r5 = 0
        L_0x0009:
            if (r5 >= r4) goto L_0x0102
            r6 = r16[r5]
            int[] r7 = m9.e.a.f29271a
            int r8 = r1.ordinal()
            r7 = r7[r8]
            r8 = 28
            r9 = 27
            r10 = 32
            r11 = 913(0x391, float:1.28E-42)
            r12 = 900(0x384, float:1.261E-42)
            r13 = 29
            r14 = 26
            switch(r7) {
                case 1: goto L_0x00d3;
                case 2: goto L_0x00aa;
                case 3: goto L_0x0076;
                case 4: goto L_0x0058;
                case 5: goto L_0x0044;
                case 6: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x00f8
        L_0x0028:
            if (r6 >= r13) goto L_0x002f
            char[] r1 = f29267a
            char r10 = r1[r6]
            goto L_0x0049
        L_0x002f:
            if (r6 != r13) goto L_0x0035
            m9.e$b r1 = m9.e.b.ALPHA
            goto L_0x00f8
        L_0x0035:
            if (r6 != r11) goto L_0x003e
            r1 = r17[r5]
            char r1 = (char) r1
            r0.append(r1)
            goto L_0x0055
        L_0x003e:
            if (r6 != r12) goto L_0x0055
            m9.e$b r1 = m9.e.b.ALPHA
            goto L_0x00f8
        L_0x0044:
            if (r6 >= r14) goto L_0x004c
            int r6 = r6 + 65
            char r10 = (char) r6
        L_0x0049:
            r1 = r3
            goto L_0x00f9
        L_0x004c:
            if (r6 != r14) goto L_0x004f
            goto L_0x0049
        L_0x004f:
            if (r6 != r12) goto L_0x0055
            m9.e$b r1 = m9.e.b.ALPHA
            goto L_0x00f8
        L_0x0055:
            r1 = r3
            goto L_0x00f8
        L_0x0058:
            if (r6 >= r13) goto L_0x0060
            char[] r7 = f29267a
            char r10 = r7[r6]
            goto L_0x00f9
        L_0x0060:
            if (r6 != r13) goto L_0x0066
            m9.e$b r1 = m9.e.b.ALPHA
            goto L_0x00f8
        L_0x0066:
            if (r6 != r11) goto L_0x0070
            r6 = r17[r5]
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x00f8
        L_0x0070:
            if (r6 != r12) goto L_0x00f8
            m9.e$b r1 = m9.e.b.ALPHA
            goto L_0x00f8
        L_0x0076:
            r7 = 25
            if (r6 >= r7) goto L_0x0080
            char[] r7 = f29268b
            char r10 = r7[r6]
            goto L_0x00f9
        L_0x0080:
            if (r6 != r7) goto L_0x0086
            m9.e$b r1 = m9.e.b.PUNCT
            goto L_0x00f8
        L_0x0086:
            if (r6 != r14) goto L_0x008a
            goto L_0x00f9
        L_0x008a:
            if (r6 != r9) goto L_0x0090
            m9.e$b r1 = m9.e.b.LOWER
            goto L_0x00f8
        L_0x0090:
            if (r6 != r8) goto L_0x0096
            m9.e$b r1 = m9.e.b.ALPHA
            goto L_0x00f8
        L_0x0096:
            if (r6 != r13) goto L_0x009b
            m9.e$b r3 = m9.e.b.PUNCT_SHIFT
            goto L_0x00b6
        L_0x009b:
            if (r6 != r11) goto L_0x00a5
            r6 = r17[r5]
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x00f8
        L_0x00a5:
            if (r6 != r12) goto L_0x00f8
            m9.e$b r1 = m9.e.b.ALPHA
            goto L_0x00f8
        L_0x00aa:
            if (r6 >= r14) goto L_0x00af
            int r6 = r6 + 97
            goto L_0x00d7
        L_0x00af:
            if (r6 != r14) goto L_0x00b2
            goto L_0x00f9
        L_0x00b2:
            if (r6 != r9) goto L_0x00bb
            m9.e$b r3 = m9.e.b.ALPHA_SHIFT
        L_0x00b6:
            r10 = 0
            r15 = r3
            r3 = r1
            r1 = r15
            goto L_0x00f9
        L_0x00bb:
            if (r6 != r8) goto L_0x00c0
            m9.e$b r1 = m9.e.b.MIXED
            goto L_0x00f8
        L_0x00c0:
            if (r6 != r13) goto L_0x00c5
            m9.e$b r3 = m9.e.b.PUNCT_SHIFT
            goto L_0x00b6
        L_0x00c5:
            if (r6 != r11) goto L_0x00ce
            r6 = r17[r5]
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x00f8
        L_0x00ce:
            if (r6 != r12) goto L_0x00f8
            m9.e$b r1 = m9.e.b.ALPHA
            goto L_0x00f8
        L_0x00d3:
            if (r6 >= r14) goto L_0x00d9
            int r6 = r6 + 65
        L_0x00d7:
            char r10 = (char) r6
            goto L_0x00f9
        L_0x00d9:
            if (r6 != r14) goto L_0x00dc
            goto L_0x00f9
        L_0x00dc:
            if (r6 != r9) goto L_0x00e1
            m9.e$b r1 = m9.e.b.LOWER
            goto L_0x00f8
        L_0x00e1:
            if (r6 != r8) goto L_0x00e6
            m9.e$b r1 = m9.e.b.MIXED
            goto L_0x00f8
        L_0x00e6:
            if (r6 != r13) goto L_0x00eb
            m9.e$b r3 = m9.e.b.PUNCT_SHIFT
            goto L_0x00b6
        L_0x00eb:
            if (r6 != r11) goto L_0x00f4
            r6 = r17[r5]
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x00f8
        L_0x00f4:
            if (r6 != r12) goto L_0x00f8
            m9.e$b r1 = m9.e.b.ALPHA
        L_0x00f8:
            r10 = 0
        L_0x00f9:
            if (r10 == 0) goto L_0x00fe
            r0.append(r10)
        L_0x00fe:
            int r5 = r5 + 1
            goto L_0x0009
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.e.e(int[], int[], int, java.lang.StringBuilder):void");
    }

    private static int f(int[] iArr, int i10, StringBuilder sb2) throws f {
        int[] iArr2 = new int[15];
        boolean z10 = false;
        int i11 = 0;
        while (i10 < iArr[0] && !z10) {
            int i12 = i10 + 1;
            int i13 = iArr[i10];
            if (i12 == iArr[0]) {
                z10 = true;
            }
            if (i13 < 900) {
                iArr2[i11] = i13;
                i11++;
            } else if (i13 == 900 || i13 == 901 || i13 == 924 || i13 == 928 || i13 == 923 || i13 == 922) {
                i12--;
                z10 = true;
            }
            if ((i11 % 15 == 0 || i13 == 902 || z10) && i11 > 0) {
                sb2.append(c(iArr2, i11));
                i11 = 0;
            }
            i10 = i12;
        }
        return i10;
    }

    private static int g(int[] iArr, int i10, StringBuilder sb2) {
        int[] iArr2 = new int[((iArr[0] - i10) << 1)];
        int[] iArr3 = new int[((iArr[0] - i10) << 1)];
        boolean z10 = false;
        int i11 = 0;
        while (i10 < iArr[0] && !z10) {
            int i12 = i10 + 1;
            int i13 = iArr[i10];
            if (i13 < 900) {
                iArr2[i11] = i13 / 30;
                iArr2[i11 + 1] = i13 % 30;
                i11 += 2;
            } else if (i13 != 913) {
                if (i13 != 928) {
                    switch (i13) {
                        case 900:
                            iArr2[i11] = 900;
                            i11++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i13) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                            }
                    }
                }
                i10 = i12 - 1;
                z10 = true;
            } else {
                iArr2[i11] = 913;
                i10 = i12 + 1;
                iArr3[i11] = iArr[i12];
                i11++;
            }
            i10 = i12;
        }
        e(iArr2, iArr3, i11, sb2);
        return i10;
    }
}
