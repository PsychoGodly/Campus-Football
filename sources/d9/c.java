package d9;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import v8.f;

/* compiled from: DecodedBitStreamParser */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f28676a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f28677b;

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f28678c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: d  reason: collision with root package name */
    private static final char[] f28679d;

    /* renamed from: e  reason: collision with root package name */
    private static final char[] f28680e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', Ascii.MAX};

    /* compiled from: DecodedBitStreamParser */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f28681a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                d9.c$b[] r0 = d9.c.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28681a = r0
                d9.c$b r1 = d9.c.b.C40_ENCODE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28681a     // Catch:{ NoSuchFieldError -> 0x001d }
                d9.c$b r1 = d9.c.b.TEXT_ENCODE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f28681a     // Catch:{ NoSuchFieldError -> 0x0028 }
                d9.c$b r1 = d9.c.b.ANSIX12_ENCODE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f28681a     // Catch:{ NoSuchFieldError -> 0x0033 }
                d9.c$b r1 = d9.c.b.EDIFACT_ENCODE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f28681a     // Catch:{ NoSuchFieldError -> 0x003e }
                d9.c$b r1 = d9.c.b.BASE256_ENCODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d9.c.a.<clinit>():void");
        }
    }

    /* compiled from: DecodedBitStreamParser */
    private enum b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f28677b = cArr;
        f28679d = cArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static z8.e a(byte[] r8) throws v8.f {
        /*
            z8.c r0 = new z8.c
            r0.<init>(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 0
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 1
            r3.<init>(r4)
            d9.c$b r5 = d9.c.b.ASCII_ENCODE
        L_0x001a:
            d9.c$b r6 = d9.c.b.ASCII_ENCODE
            if (r5 != r6) goto L_0x0023
            d9.c$b r5 = c(r0, r1, r2)
            goto L_0x0052
        L_0x0023:
            int[] r7 = d9.c.a.f28681a
            int r5 = r5.ordinal()
            r5 = r7[r5]
            if (r5 == r4) goto L_0x004e
            r7 = 2
            if (r5 == r7) goto L_0x004a
            r7 = 3
            if (r5 == r7) goto L_0x0046
            r7 = 4
            if (r5 == r7) goto L_0x0042
            r7 = 5
            if (r5 != r7) goto L_0x003d
            d(r0, r1, r3)
            goto L_0x0051
        L_0x003d:
            v8.f r8 = v8.f.a()
            throw r8
        L_0x0042:
            f(r0, r1)
            goto L_0x0051
        L_0x0046:
            b(r0, r1)
            goto L_0x0051
        L_0x004a:
            g(r0, r1)
            goto L_0x0051
        L_0x004e:
            e(r0, r1)
        L_0x0051:
            r5 = r6
        L_0x0052:
            d9.c$b r6 = d9.c.b.PAD_ENCODE
            if (r5 == r6) goto L_0x005c
            int r6 = r0.a()
            if (r6 > 0) goto L_0x001a
        L_0x005c:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0065
            r1.append(r2)
        L_0x0065:
            z8.e r0 = new z8.e
            java.lang.String r1 = r1.toString()
            boolean r2 = r3.isEmpty()
            r4 = 0
            if (r2 == 0) goto L_0x0073
            r3 = r4
        L_0x0073:
            r0.<init>(r8, r1, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.c.a(byte[]):z8.e");
    }

    private static void b(z8.c cVar, StringBuilder sb2) throws f {
        int d10;
        int[] iArr = new int[3];
        while (cVar.a() != 8 && (d10 = cVar.d(8)) != 254) {
            h(d10, cVar.d(8), iArr);
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                if (i11 == 0) {
                    sb2.append(13);
                } else if (i11 == 1) {
                    sb2.append('*');
                } else if (i11 == 2) {
                    sb2.append('>');
                } else if (i11 == 3) {
                    sb2.append(' ');
                } else if (i11 < 14) {
                    sb2.append((char) (i11 + 44));
                } else if (i11 < 40) {
                    sb2.append((char) (i11 + 51));
                } else {
                    throw f.a();
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static b c(z8.c cVar, StringBuilder sb2, StringBuilder sb3) throws f {
        boolean z10 = false;
        do {
            int d10 = cVar.d(8);
            if (d10 == 0) {
                throw f.a();
            } else if (d10 <= 128) {
                if (z10) {
                    d10 += 128;
                }
                sb2.append((char) (d10 - 1));
                return b.ASCII_ENCODE;
            } else if (d10 == 129) {
                return b.PAD_ENCODE;
            } else {
                if (d10 <= 229) {
                    int i10 = d10 - 130;
                    if (i10 < 10) {
                        sb2.append('0');
                    }
                    sb2.append(i10);
                } else if (d10 == 230) {
                    return b.C40_ENCODE;
                } else {
                    if (d10 == 231) {
                        return b.BASE256_ENCODE;
                    }
                    if (d10 == 232) {
                        sb2.append(29);
                    } else if (!(d10 == 233 || d10 == 234)) {
                        if (d10 == 235) {
                            z10 = true;
                        } else if (d10 == 236) {
                            sb2.append("[)>\u001e05\u001d");
                            sb3.insert(0, "\u001e\u0004");
                        } else if (d10 == 237) {
                            sb2.append("[)>\u001e06\u001d");
                            sb3.insert(0, "\u001e\u0004");
                        } else if (d10 == 238) {
                            return b.ANSIX12_ENCODE;
                        } else {
                            if (d10 == 239) {
                                return b.TEXT_ENCODE;
                            }
                            if (d10 == 240) {
                                return b.EDIFACT_ENCODE;
                            }
                            if (!(d10 == 241 || d10 < 242 || (d10 == 254 && cVar.a() == 0))) {
                                throw f.a();
                            }
                        }
                    }
                }
            }
        } while (cVar.a() > 0);
        return b.ASCII_ENCODE;
    }

    private static void d(z8.c cVar, StringBuilder sb2, Collection<byte[]> collection) throws f {
        int c10 = cVar.c() + 1;
        int i10 = c10 + 1;
        int i11 = i(cVar.d(8), c10);
        if (i11 == 0) {
            i11 = cVar.a() / 8;
        } else if (i11 >= 250) {
            i11 = ((i11 - 249) * 250) + i(cVar.d(8), i10);
            i10++;
        }
        if (i11 >= 0) {
            byte[] bArr = new byte[i11];
            int i12 = 0;
            while (i12 < i11) {
                if (cVar.a() >= 8) {
                    bArr[i12] = (byte) i(cVar.d(8), i10);
                    i12++;
                    i10++;
                } else {
                    throw f.a();
                }
            }
            collection.add(bArr);
            try {
                sb2.append(new String(bArr, "ISO8859_1"));
            } catch (UnsupportedEncodingException e10) {
                throw new IllegalStateException("Platform does not support required encoding: " + e10);
            }
        } else {
            throw f.a();
        }
    }

    private static void e(z8.c cVar, StringBuilder sb2) throws f {
        int d10;
        int[] iArr = new int[3];
        boolean z10 = false;
        int i10 = 0;
        while (cVar.a() != 8 && (d10 = cVar.d(8)) != 254) {
            h(d10, cVar.d(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            char[] cArr = f28677b;
                            if (i12 < cArr.length) {
                                char c10 = cArr[i12];
                                if (z10) {
                                    sb2.append((char) (c10 + 128));
                                } else {
                                    sb2.append(c10);
                                }
                            } else if (i12 == 27) {
                                sb2.append(29);
                            } else if (i12 == 30) {
                                z10 = true;
                            } else {
                                throw f.a();
                            }
                            i10 = 0;
                        } else if (i10 != 3) {
                            throw f.a();
                        } else if (z10) {
                            sb2.append((char) (i12 + 224));
                        } else {
                            sb2.append((char) (i12 + 96));
                            i10 = 0;
                        }
                    } else if (z10) {
                        sb2.append((char) (i12 + 128));
                    } else {
                        sb2.append((char) i12);
                        i10 = 0;
                    }
                    z10 = false;
                    i10 = 0;
                } else if (i12 < 3) {
                    i10 = i12 + 1;
                } else {
                    char[] cArr2 = f28676a;
                    if (i12 < cArr2.length) {
                        char c11 = cArr2[i12];
                        if (z10) {
                            sb2.append((char) (c11 + 128));
                            z10 = false;
                        } else {
                            sb2.append(c11);
                        }
                    } else {
                        throw f.a();
                    }
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static void f(z8.c cVar, StringBuilder sb2) {
        while (cVar.a() > 16) {
            for (int i10 = 0; i10 < 4; i10++) {
                int d10 = cVar.d(6);
                if (d10 == 31) {
                    int b10 = 8 - cVar.b();
                    if (b10 != 8) {
                        cVar.d(b10);
                        return;
                    }
                    return;
                }
                if ((d10 & 32) == 0) {
                    d10 |= 64;
                }
                sb2.append((char) d10);
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static void g(z8.c cVar, StringBuilder sb2) throws f {
        int d10;
        int[] iArr = new int[3];
        boolean z10 = false;
        int i10 = 0;
        while (cVar.a() != 8 && (d10 = cVar.d(8)) != 254) {
            h(d10, cVar.d(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            char[] cArr = f28679d;
                            if (i12 < cArr.length) {
                                char c10 = cArr[i12];
                                if (z10) {
                                    sb2.append((char) (c10 + 128));
                                } else {
                                    sb2.append(c10);
                                }
                            } else if (i12 == 27) {
                                sb2.append(29);
                            } else if (i12 == 30) {
                                z10 = true;
                            } else {
                                throw f.a();
                            }
                            i10 = 0;
                        } else if (i10 == 3) {
                            char[] cArr2 = f28680e;
                            if (i12 < cArr2.length) {
                                char c11 = cArr2[i12];
                                if (z10) {
                                    sb2.append((char) (c11 + 128));
                                } else {
                                    sb2.append(c11);
                                    i10 = 0;
                                }
                            } else {
                                throw f.a();
                            }
                        } else {
                            throw f.a();
                        }
                    } else if (z10) {
                        sb2.append((char) (i12 + 128));
                    } else {
                        sb2.append((char) i12);
                        i10 = 0;
                    }
                    z10 = false;
                    i10 = 0;
                } else if (i12 < 3) {
                    i10 = i12 + 1;
                } else {
                    char[] cArr3 = f28678c;
                    if (i12 < cArr3.length) {
                        char c12 = cArr3[i12];
                        if (z10) {
                            sb2.append((char) (c12 + 128));
                            z10 = false;
                        } else {
                            sb2.append(c12);
                        }
                    } else {
                        throw f.a();
                    }
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static void h(int i10, int i11, int[] iArr) {
        int i12 = ((i10 << 8) + i11) - 1;
        int i13 = i12 / 1600;
        iArr[0] = i13;
        int i14 = i12 - (i13 * 1600);
        int i15 = i14 / 40;
        iArr[1] = i15;
        iArr[2] = i14 - (i15 * 40);
    }

    private static int i(int i10, int i11) {
        int i12 = i10 - (((i11 * 149) % 255) + 1);
        return i12 >= 0 ? i12 : i12 + 256;
    }
}
