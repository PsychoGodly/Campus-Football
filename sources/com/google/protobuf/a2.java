package com.google.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: Utf8 */
final class a2 {

    /* renamed from: a  reason: collision with root package name */
    private static final b f26934a;

    /* compiled from: Utf8 */
    private static class a {
        /* access modifiers changed from: private */
        public static void h(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws e0 {
            if (m(b11) || (((b10 << Ascii.FS) + (b11 + 112)) >> 30) != 0 || m(b12) || m(b13)) {
                throw e0.d();
            }
            int r10 = ((b10 & 7) << Ascii.DC2) | (r(b11) << 12) | (r(b12) << 6) | r(b13);
            cArr[i10] = l(r10);
            cArr[i10 + 1] = q(r10);
        }

        /* access modifiers changed from: private */
        public static void i(byte b10, char[] cArr, int i10) {
            cArr[i10] = (char) b10;
        }

        /* access modifiers changed from: private */
        public static void j(byte b10, byte b11, byte b12, char[] cArr, int i10) throws e0 {
            if (m(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || m(b12)))) {
                throw e0.d();
            }
            cArr[i10] = (char) (((b10 & Ascii.SI) << Ascii.FF) | (r(b11) << 6) | r(b12));
        }

        /* access modifiers changed from: private */
        public static void k(byte b10, byte b11, char[] cArr, int i10) throws e0 {
            if (b10 < -62 || m(b11)) {
                throw e0.d();
            }
            cArr[i10] = (char) (((b10 & Ascii.US) << 6) | r(b11));
        }

        private static char l(int i10) {
            return (char) ((i10 >>> 10) + 55232);
        }

        private static boolean m(byte b10) {
            return b10 > -65;
        }

        /* access modifiers changed from: private */
        public static boolean n(byte b10) {
            return b10 >= 0;
        }

        /* access modifiers changed from: private */
        public static boolean o(byte b10) {
            return b10 < -16;
        }

        /* access modifiers changed from: private */
        public static boolean p(byte b10) {
            return b10 < -32;
        }

        private static char q(int i10) {
            return (char) ((i10 & 1023) + 56320);
        }

        private static int r(byte b10) {
            return b10 & 63;
        }
    }

    /* compiled from: Utf8 */
    static abstract class b {
        b() {
        }

        private static int j(ByteBuffer byteBuffer, int i10, int i11) {
            int e10 = i10 + a2.l(byteBuffer, i10, i11);
            while (e10 < i11) {
                int i12 = e10 + 1;
                byte b10 = byteBuffer.get(e10);
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i12 >= i11) {
                            return b10;
                        }
                        if (b10 < -62 || byteBuffer.get(i12) > -65) {
                            return -1;
                        }
                        i12++;
                    } else if (b10 < -16) {
                        if (i12 >= i11 - 1) {
                            return a2.p(byteBuffer, b10, i12, i11 - i12);
                        }
                        int i13 = i12 + 1;
                        byte b11 = byteBuffer.get(i12);
                        if (b11 > -65 || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || byteBuffer.get(i13) > -65))) {
                            return -1;
                        }
                        e10 = i13 + 1;
                    } else if (i12 >= i11 - 2) {
                        return a2.p(byteBuffer, b10, i12, i11 - i12);
                    } else {
                        int i14 = i12 + 1;
                        byte b12 = byteBuffer.get(i12);
                        if (b12 <= -65 && (((b10 << Ascii.FS) + (b12 + 112)) >> 30) == 0) {
                            int i15 = i14 + 1;
                            if (byteBuffer.get(i14) <= -65) {
                                i12 = i15 + 1;
                                if (byteBuffer.get(i15) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                e10 = i12;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public final String a(ByteBuffer byteBuffer, int i10, int i11) throws e0 {
            if (byteBuffer.hasArray()) {
                return b(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11);
            } else if (byteBuffer.isDirect()) {
                return d(byteBuffer, i10, i11);
            } else {
                return c(byteBuffer, i10, i11);
            }
        }

        /* access modifiers changed from: package-private */
        public abstract String b(byte[] bArr, int i10, int i11) throws e0;

        /* access modifiers changed from: package-private */
        public final String c(ByteBuffer byteBuffer, int i10, int i11) throws e0 {
            if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) >= 0) {
                int i12 = i10 + i11;
                char[] cArr = new char[i11];
                int i13 = 0;
                while (r13 < i12) {
                    byte b10 = byteBuffer.get(r13);
                    if (!a.n(b10)) {
                        break;
                    }
                    i10 = r13 + 1;
                    a.i(b10, cArr, i13);
                    i13++;
                }
                int i14 = i13;
                while (r13 < i12) {
                    int i15 = r13 + 1;
                    byte b11 = byteBuffer.get(r13);
                    if (a.n(b11)) {
                        int i16 = i14 + 1;
                        a.i(b11, cArr, i14);
                        while (i15 < i12) {
                            byte b12 = byteBuffer.get(i15);
                            if (!a.n(b12)) {
                                break;
                            }
                            i15++;
                            a.i(b12, cArr, i16);
                            i16++;
                        }
                        r13 = i15;
                        i14 = i16;
                    } else if (a.p(b11)) {
                        if (i15 < i12) {
                            a.k(b11, byteBuffer.get(i15), cArr, i14);
                            r13 = i15 + 1;
                            i14++;
                        } else {
                            throw e0.d();
                        }
                    } else if (a.o(b11)) {
                        if (i15 < i12 - 1) {
                            int i17 = i15 + 1;
                            a.j(b11, byteBuffer.get(i15), byteBuffer.get(i17), cArr, i14);
                            r13 = i17 + 1;
                            i14++;
                        } else {
                            throw e0.d();
                        }
                    } else if (i15 < i12 - 2) {
                        int i18 = i15 + 1;
                        byte b13 = byteBuffer.get(i15);
                        int i19 = i18 + 1;
                        a.h(b11, b13, byteBuffer.get(i18), byteBuffer.get(i19), cArr, i14);
                        r13 = i19 + 1;
                        i14 = i14 + 1 + 1;
                    } else {
                        throw e0.d();
                    }
                }
                return new String(cArr, 0, i14);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)}));
        }

        /* access modifiers changed from: package-private */
        public abstract String d(ByteBuffer byteBuffer, int i10, int i11) throws e0;

        /* access modifiers changed from: package-private */
        public abstract int e(CharSequence charSequence, byte[] bArr, int i10, int i11);

        /* access modifiers changed from: package-private */
        public final boolean f(ByteBuffer byteBuffer, int i10, int i11) {
            return h(0, byteBuffer, i10, i11) == 0;
        }

        /* access modifiers changed from: package-private */
        public final boolean g(byte[] bArr, int i10, int i11) {
            return i(0, bArr, i10, i11) == 0;
        }

        /* access modifiers changed from: package-private */
        public final int h(int i10, ByteBuffer byteBuffer, int i11, int i12) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                return i(i10, byteBuffer.array(), i11 + arrayOffset, arrayOffset + i12);
            } else if (byteBuffer.isDirect()) {
                return l(i10, byteBuffer, i11, i12);
            } else {
                return k(i10, byteBuffer, i11, i12);
            }
        }

        /* access modifiers changed from: package-private */
        public abstract int i(int i10, byte[] bArr, int i11, int i12);

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
            if (r8.get(r9) > -65) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x008b, code lost:
            if (r8.get(r9) > -65) goto L_0x008d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
            if (r8.get(r9) > -65) goto L_0x001d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int k(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x008e
                if (r9 < r10) goto L_0x0005
                return r7
            L_0x0005:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L_0x001e
                r7 = -62
                if (r0 < r7) goto L_0x001d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L_0x001a
                goto L_0x001d
            L_0x001a:
                r9 = r7
                goto L_0x008e
            L_0x001d:
                return r2
            L_0x001e:
                r4 = -16
                if (r0 >= r4) goto L_0x004f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L_0x0038
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L_0x0035
                int r7 = com.google.protobuf.a2.n(r0, r9)
                return r7
            L_0x0035:
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x0038:
                if (r7 > r3) goto L_0x004e
                r4 = -96
                if (r0 != r1) goto L_0x0040
                if (r7 < r4) goto L_0x004e
            L_0x0040:
                r1 = -19
                if (r0 != r1) goto L_0x0046
                if (r7 >= r4) goto L_0x004e
            L_0x0046:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L_0x001a
            L_0x004e:
                return r2
            L_0x004f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L_0x0065
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L_0x0063
                int r7 = com.google.protobuf.a2.n(r0, r1)
                return r7
            L_0x0063:
                r9 = r7
                goto L_0x0068
            L_0x0065:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L_0x0068:
                if (r4 != 0) goto L_0x0078
                int r7 = r9 + 1
                byte r4 = r8.get(r9)
                if (r7 < r10) goto L_0x0077
                int r7 = com.google.protobuf.a2.o(r0, r1, r4)
                return r7
            L_0x0077:
                r9 = r7
            L_0x0078:
                if (r1 > r3) goto L_0x008d
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L_0x008d
                if (r4 > r3) goto L_0x008d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L_0x001a
            L_0x008d:
                return r2
            L_0x008e:
                int r7 = j(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a2.b.k(int, java.nio.ByteBuffer, int, int):int");
        }

        /* access modifiers changed from: package-private */
        public abstract int l(int i10, ByteBuffer byteBuffer, int i11, int i12);
    }

    /* compiled from: Utf8 */
    static final class c extends b {
        c() {
        }

        private static int m(byte[] bArr, int i10, int i11) {
            while (i10 < i11 && bArr[i10] >= 0) {
                i10++;
            }
            if (i10 >= i11) {
                return 0;
            }
            return n(bArr, i10, i11);
        }

        private static int n(byte[] bArr, int i10, int i11) {
            while (i10 < i11) {
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i12 >= i11) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            i10 = i12 + 1;
                            if (bArr[i12] > -65) {
                            }
                        }
                        return -1;
                    } else if (b10 < -16) {
                        if (i12 >= i11 - 1) {
                            return a2.q(bArr, i12, i11);
                        }
                        int i13 = i12 + 1;
                        byte b11 = bArr[i12];
                        if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                            i10 = i13 + 1;
                            if (bArr[i13] > -65) {
                            }
                        }
                        return -1;
                    } else if (i12 >= i11 - 2) {
                        return a2.q(bArr, i12, i11);
                    } else {
                        int i14 = i12 + 1;
                        byte b12 = bArr[i12];
                        if (b12 <= -65 && (((b10 << Ascii.FS) + (b12 + 112)) >> 30) == 0) {
                            int i15 = i14 + 1;
                            if (bArr[i14] <= -65) {
                                i12 = i15 + 1;
                                if (bArr[i15] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                i10 = i12;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public String b(byte[] bArr, int i10, int i11) throws e0 {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
                int i12 = i10 + i11;
                char[] cArr = new char[i11];
                int i13 = 0;
                while (r13 < i12) {
                    byte b10 = bArr[r13];
                    if (!a.n(b10)) {
                        break;
                    }
                    i10 = r13 + 1;
                    a.i(b10, cArr, i13);
                    i13++;
                }
                int i14 = i13;
                while (r13 < i12) {
                    int i15 = r13 + 1;
                    byte b11 = bArr[r13];
                    if (a.n(b11)) {
                        int i16 = i14 + 1;
                        a.i(b11, cArr, i14);
                        while (i15 < i12) {
                            byte b12 = bArr[i15];
                            if (!a.n(b12)) {
                                break;
                            }
                            i15++;
                            a.i(b12, cArr, i16);
                            i16++;
                        }
                        r13 = i15;
                        i14 = i16;
                    } else if (a.p(b11)) {
                        if (i15 < i12) {
                            a.k(b11, bArr[i15], cArr, i14);
                            r13 = i15 + 1;
                            i14++;
                        } else {
                            throw e0.d();
                        }
                    } else if (a.o(b11)) {
                        if (i15 < i12 - 1) {
                            int i17 = i15 + 1;
                            a.j(b11, bArr[i15], bArr[i17], cArr, i14);
                            r13 = i17 + 1;
                            i14++;
                        } else {
                            throw e0.d();
                        }
                    } else if (i15 < i12 - 2) {
                        int i18 = i15 + 1;
                        byte b13 = bArr[i15];
                        int i19 = i18 + 1;
                        a.h(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                        r13 = i19 + 1;
                        i14 = i14 + 1 + 1;
                    } else {
                        throw e0.d();
                    }
                }
                return new String(cArr, 0, i14);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)}));
        }

        /* access modifiers changed from: package-private */
        public String d(ByteBuffer byteBuffer, int i10, int i11) throws e0 {
            return c(byteBuffer, i10, i11);
        }

        /* access modifiers changed from: package-private */
        public int e(CharSequence charSequence, byte[] bArr, int i10, int i11) {
            int i12;
            int i13;
            int i14;
            char charAt;
            int length = charSequence.length();
            int i15 = i11 + i10;
            int i16 = 0;
            while (i16 < length && (i14 = i16 + i10) < i15 && (charAt = charSequence.charAt(i16)) < 128) {
                bArr[i14] = (byte) charAt;
                i16++;
            }
            if (i16 == length) {
                return i10 + length;
            }
            int i17 = i10 + i16;
            while (i16 < length) {
                char charAt2 = charSequence.charAt(i16);
                if (charAt2 < 128 && i17 < i15) {
                    i13 = i17 + 1;
                    bArr[i17] = (byte) charAt2;
                } else if (charAt2 < 2048 && i17 <= i15 - 2) {
                    int i18 = i17 + 1;
                    bArr[i17] = (byte) ((charAt2 >>> 6) | 960);
                    i17 = i18 + 1;
                    bArr[i18] = (byte) ((charAt2 & '?') | 128);
                    i16++;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i17 <= i15 - 3) {
                    int i19 = i17 + 1;
                    bArr[i17] = (byte) ((charAt2 >>> 12) | 480);
                    int i20 = i19 + 1;
                    bArr[i19] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i13 = i20 + 1;
                    bArr[i20] = (byte) ((charAt2 & '?') | 128);
                } else if (i17 <= i15 - 4) {
                    int i21 = i16 + 1;
                    if (i21 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i21);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i22 = i17 + 1;
                            bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                            int i23 = i22 + 1;
                            bArr[i22] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i24 = i23 + 1;
                            bArr[i23] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i17 = i24 + 1;
                            bArr[i24] = (byte) ((codePoint & 63) | 128);
                            i16 = i21;
                            i16++;
                        } else {
                            i16 = i21;
                        }
                    }
                    throw new d(i16 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i12 = i16 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i12)))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i17);
                } else {
                    throw new d(i16, length);
                }
                i17 = i13;
                i16++;
            }
            return i17;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
            if (r8[r9] > -65) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x007f, code lost:
            if (r8[r9] > -65) goto L_0x0081;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r8[r9] > -65) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int i(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x0082
                if (r9 < r10) goto L_0x0005
                return r7
            L_0x0005:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L_0x001c
                r7 = -62
                if (r0 < r7) goto L_0x001b
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
                goto L_0x001b
            L_0x0018:
                r9 = r7
                goto L_0x0082
            L_0x001b:
                return r2
            L_0x001c:
                r4 = -16
                if (r0 >= r4) goto L_0x0049
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L_0x0034
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r7 < r10) goto L_0x0031
                int r7 = com.google.protobuf.a2.n(r0, r9)
                return r7
            L_0x0031:
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x0034:
                if (r7 > r3) goto L_0x0048
                r4 = -96
                if (r0 != r1) goto L_0x003c
                if (r7 < r4) goto L_0x0048
            L_0x003c:
                r1 = -19
                if (r0 != r1) goto L_0x0042
                if (r7 >= r4) goto L_0x0048
            L_0x0042:
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
            L_0x0048:
                return r2
            L_0x0049:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L_0x005d
                int r7 = r9 + 1
                byte r1 = r8[r9]
                if (r7 < r10) goto L_0x005b
                int r7 = com.google.protobuf.a2.n(r0, r1)
                return r7
            L_0x005b:
                r9 = r7
                goto L_0x0060
            L_0x005d:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L_0x0060:
                if (r4 != 0) goto L_0x006e
                int r7 = r9 + 1
                byte r4 = r8[r9]
                if (r7 < r10) goto L_0x006d
                int r7 = com.google.protobuf.a2.o(r0, r1, r4)
                return r7
            L_0x006d:
                r9 = r7
            L_0x006e:
                if (r1 > r3) goto L_0x0081
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L_0x0081
                if (r4 > r3) goto L_0x0081
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
            L_0x0081:
                return r2
            L_0x0082:
                int r7 = m(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a2.c.i(int, byte[], int, int):int");
        }

        /* access modifiers changed from: package-private */
        public int l(int i10, ByteBuffer byteBuffer, int i11, int i12) {
            return k(i10, byteBuffer, i11, i12);
        }
    }

    /* compiled from: Utf8 */
    static class d extends IllegalArgumentException {
        d(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    /* compiled from: Utf8 */
    static final class e extends b {
        e() {
        }

        static boolean m() {
            return z1.I() && z1.J();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static int n(long r8, int r10) {
            /*
                int r0 = p(r8, r10)
                long r1 = (long) r0
                long r8 = r8 + r1
                int r10 = r10 - r0
            L_0x0007:
                r0 = 0
                r1 = 0
            L_0x0009:
                r2 = 1
                if (r10 <= 0) goto L_0x001a
                long r4 = r8 + r2
                byte r1 = com.google.protobuf.z1.w(r8)
                if (r1 < 0) goto L_0x0019
                int r10 = r10 + -1
                r8 = r4
                goto L_0x0009
            L_0x0019:
                r8 = r4
            L_0x001a:
                if (r10 != 0) goto L_0x001d
                return r0
            L_0x001d:
                int r10 = r10 + -1
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L_0x003a
                if (r10 != 0) goto L_0x0029
                return r1
            L_0x0029:
                int r10 = r10 + -1
                r0 = -62
                if (r1 < r0) goto L_0x0039
                long r2 = r2 + r8
                byte r8 = com.google.protobuf.z1.w(r8)
                if (r8 <= r4) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r8 = r2
                goto L_0x0007
            L_0x0039:
                return r5
            L_0x003a:
                r6 = -16
                if (r1 >= r6) goto L_0x0064
                r6 = 2
                if (r10 >= r6) goto L_0x0046
                int r8 = r(r8, r1, r10)
                return r8
            L_0x0046:
                int r10 = r10 + -2
                long r6 = r8 + r2
                byte r8 = com.google.protobuf.z1.w(r8)
                if (r8 > r4) goto L_0x0063
                r9 = -96
                if (r1 != r0) goto L_0x0056
                if (r8 < r9) goto L_0x0063
            L_0x0056:
                r0 = -19
                if (r1 != r0) goto L_0x005c
                if (r8 >= r9) goto L_0x0063
            L_0x005c:
                long r2 = r2 + r6
                byte r8 = com.google.protobuf.z1.w(r6)
                if (r8 <= r4) goto L_0x0037
            L_0x0063:
                return r5
            L_0x0064:
                r0 = 3
                if (r10 >= r0) goto L_0x006c
                int r8 = r(r8, r1, r10)
                return r8
            L_0x006c:
                int r10 = r10 + -3
                long r6 = r8 + r2
                byte r8 = com.google.protobuf.z1.w(r8)
                if (r8 > r4) goto L_0x008e
                int r9 = r1 << 28
                int r8 = r8 + 112
                int r9 = r9 + r8
                int r8 = r9 >> 30
                if (r8 != 0) goto L_0x008e
                long r8 = r6 + r2
                byte r0 = com.google.protobuf.z1.w(r6)
                if (r0 > r4) goto L_0x008e
                long r2 = r2 + r8
                byte r8 = com.google.protobuf.z1.w(r8)
                if (r8 <= r4) goto L_0x0037
            L_0x008e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a2.e.n(long, int):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static int o(byte[] r8, long r9, int r11) {
            /*
                int r0 = q(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L_0x0007:
                r0 = 0
                r1 = 0
            L_0x0009:
                r2 = 1
                if (r11 <= 0) goto L_0x001a
                long r4 = r9 + r2
                byte r1 = com.google.protobuf.z1.x(r8, r9)
                if (r1 < 0) goto L_0x0019
                int r11 = r11 + -1
                r9 = r4
                goto L_0x0009
            L_0x0019:
                r9 = r4
            L_0x001a:
                if (r11 != 0) goto L_0x001d
                return r0
            L_0x001d:
                int r11 = r11 + -1
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L_0x003a
                if (r11 != 0) goto L_0x0029
                return r1
            L_0x0029:
                int r11 = r11 + -1
                r0 = -62
                if (r1 < r0) goto L_0x0039
                long r2 = r2 + r9
                byte r9 = com.google.protobuf.z1.x(r8, r9)
                if (r9 <= r4) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r9 = r2
                goto L_0x0007
            L_0x0039:
                return r5
            L_0x003a:
                r6 = -16
                if (r1 >= r6) goto L_0x0064
                r6 = 2
                if (r11 >= r6) goto L_0x0046
                int r8 = s(r8, r1, r9, r11)
                return r8
            L_0x0046:
                int r11 = r11 + -2
                long r6 = r9 + r2
                byte r9 = com.google.protobuf.z1.x(r8, r9)
                if (r9 > r4) goto L_0x0063
                r10 = -96
                if (r1 != r0) goto L_0x0056
                if (r9 < r10) goto L_0x0063
            L_0x0056:
                r0 = -19
                if (r1 != r0) goto L_0x005c
                if (r9 >= r10) goto L_0x0063
            L_0x005c:
                long r2 = r2 + r6
                byte r9 = com.google.protobuf.z1.x(r8, r6)
                if (r9 <= r4) goto L_0x0037
            L_0x0063:
                return r5
            L_0x0064:
                r0 = 3
                if (r11 >= r0) goto L_0x006c
                int r8 = s(r8, r1, r9, r11)
                return r8
            L_0x006c:
                int r11 = r11 + -3
                long r6 = r9 + r2
                byte r9 = com.google.protobuf.z1.x(r8, r9)
                if (r9 > r4) goto L_0x008e
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L_0x008e
                long r9 = r6 + r2
                byte r0 = com.google.protobuf.z1.x(r8, r6)
                if (r0 > r4) goto L_0x008e
                long r2 = r2 + r9
                byte r9 = com.google.protobuf.z1.x(r8, r9)
                if (r9 <= r4) goto L_0x0037
            L_0x008e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a2.e.o(byte[], long, int):int");
        }

        private static int p(long j10, int i10) {
            if (i10 < 16) {
                return 0;
            }
            int i11 = (int) ((-j10) & 7);
            int i12 = i11;
            while (i12 > 0) {
                long j11 = 1 + j10;
                if (z1.w(j10) < 0) {
                    return i11 - i12;
                }
                i12--;
                j10 = j11;
            }
            int i13 = i10 - i11;
            while (i13 >= 8 && (z1.D(j10) & -9187201950435737472L) == 0) {
                j10 += 8;
                i13 -= 8;
            }
            return i10 - i13;
        }

        private static int q(byte[] bArr, long j10, int i10) {
            int i11 = 0;
            if (i10 < 16) {
                return 0;
            }
            int i12 = 8 - (((int) j10) & 7);
            while (i11 < i12) {
                long j11 = 1 + j10;
                if (z1.x(bArr, j10) < 0) {
                    return i11;
                }
                i11++;
                j10 = j11;
            }
            while (true) {
                int i13 = i11 + 8;
                if (i13 <= i10 && (z1.E(bArr, z1.f27329h + j10) & -9187201950435737472L) == 0) {
                    j10 += 8;
                    i11 = i13;
                }
            }
            while (i11 < i10) {
                long j12 = j10 + 1;
                if (z1.x(bArr, j10) < 0) {
                    return i11;
                }
                i11++;
                j10 = j12;
            }
            return i10;
        }

        private static int r(long j10, int i10, int i11) {
            if (i11 == 0) {
                return a2.m(i10);
            }
            if (i11 == 1) {
                return a2.n(i10, z1.w(j10));
            }
            if (i11 == 2) {
                return a2.o(i10, z1.w(j10), z1.w(j10 + 1));
            }
            throw new AssertionError();
        }

        private static int s(byte[] bArr, int i10, long j10, int i11) {
            if (i11 == 0) {
                return a2.m(i10);
            }
            if (i11 == 1) {
                return a2.n(i10, z1.x(bArr, j10));
            }
            if (i11 == 2) {
                return a2.o(i10, z1.x(bArr, j10), z1.x(bArr, j10 + 1));
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        public String b(byte[] bArr, int i10, int i11) throws e0 {
            Charset charset = d0.f26986b;
            String str = new String(bArr, i10, i11, charset);
            if (!str.contains("�") || Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                return str;
            }
            throw e0.d();
        }

        /* access modifiers changed from: package-private */
        public String d(ByteBuffer byteBuffer, int i10, int i11) throws e0 {
            long j10;
            int i12 = i10;
            int i13 = i11;
            if ((i12 | i13 | ((byteBuffer.limit() - i12) - i13)) >= 0) {
                long k10 = z1.k(byteBuffer) + ((long) i12);
                long j11 = ((long) i13) + k10;
                char[] cArr = new char[i13];
                int i14 = 0;
                while (k10 < j11) {
                    byte w10 = z1.w(k10);
                    if (!a.n(w10)) {
                        break;
                    }
                    k10++;
                    a.i(w10, cArr, i14);
                    i14++;
                }
                while (true) {
                    int i15 = i14;
                    while (j10 < j11) {
                        long j12 = j10 + 1;
                        byte w11 = z1.w(j10);
                        if (a.n(w11)) {
                            int i16 = i15 + 1;
                            a.i(w11, cArr, i15);
                            while (j12 < j11) {
                                byte w12 = z1.w(j12);
                                if (!a.n(w12)) {
                                    break;
                                }
                                j12++;
                                a.i(w12, cArr, i16);
                                i16++;
                            }
                            i15 = i16;
                            j10 = j12;
                        } else if (a.p(w11)) {
                            if (j12 < j11) {
                                j10 = j12 + 1;
                                a.k(w11, z1.w(j12), cArr, i15);
                                i15++;
                            } else {
                                throw e0.d();
                            }
                        } else if (a.o(w11)) {
                            if (j12 < j11 - 1) {
                                long j13 = j12 + 1;
                                a.j(w11, z1.w(j12), z1.w(j13), cArr, i15);
                                i15++;
                                j10 = j13 + 1;
                            } else {
                                throw e0.d();
                            }
                        } else if (j12 < j11 - 2) {
                            long j14 = j12 + 1;
                            byte w13 = z1.w(j12);
                            long j15 = j14 + 1;
                            byte w14 = z1.w(j14);
                            k10 = j15 + 1;
                            a.h(w11, w13, w14, z1.w(j15), cArr, i15);
                            i14 = i15 + 1 + 1;
                        } else {
                            throw e0.d();
                        }
                    }
                    return new String(cArr, 0, i15);
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)}));
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:38:0x00fb, LOOP_START, PHI: r2 r3 r4 r11 
          PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int e(java.lang.CharSequence r23, byte[] r24, int r25, int r26) {
            /*
                r22 = this;
                r0 = r23
                r1 = r24
                r2 = r25
                r3 = r26
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r23.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L_0x0144
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L_0x0144
                r2 = 0
            L_0x001a:
                r3 = 128(0x80, float:1.794E-43)
                r11 = 1
                if (r2 >= r8) goto L_0x002f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x002f
                long r11 = r11 + r4
                byte r3 = (byte) r13
                com.google.protobuf.z1.O(r1, r4, r3)
                int r2 = r2 + 1
                r4 = r11
                goto L_0x001a
            L_0x002f:
                if (r2 != r8) goto L_0x0033
                int r0 = (int) r4
                return r0
            L_0x0033:
                if (r2 >= r8) goto L_0x0142
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x004b
                int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r14 >= 0) goto L_0x004b
                long r14 = r4 + r11
                byte r13 = (byte) r13
                com.google.protobuf.z1.O(r1, r4, r13)
                r4 = r11
                r12 = r14
            L_0x0047:
                r11 = 128(0x80, float:1.794E-43)
                goto L_0x00fb
            L_0x004b:
                r14 = 2048(0x800, float:2.87E-42)
                if (r13 >= r14) goto L_0x0075
                r14 = 2
                long r14 = r6 - r14
                int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r16 > 0) goto L_0x0075
                long r14 = r4 + r11
                int r3 = r13 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                com.google.protobuf.z1.O(r1, r4, r3)
                long r3 = r14 + r11
                r5 = r13 & 63
                r13 = 128(0x80, float:1.794E-43)
                r5 = r5 | r13
                byte r5 = (byte) r5
                com.google.protobuf.z1.O(r1, r14, r5)
                r20 = r11
                r11 = 128(0x80, float:1.794E-43)
                r12 = r3
                r4 = r20
                goto L_0x00fb
            L_0x0075:
                r3 = 57343(0xdfff, float:8.0355E-41)
                r14 = 55296(0xd800, float:7.7486E-41)
                if (r13 < r14) goto L_0x007f
                if (r3 >= r13) goto L_0x00ae
            L_0x007f:
                r15 = 3
                long r15 = r6 - r15
                int r17 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r17 > 0) goto L_0x00ae
                long r14 = r4 + r11
                int r3 = r13 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                com.google.protobuf.z1.O(r1, r4, r3)
                long r3 = r14 + r11
                int r5 = r13 >>> 6
                r5 = r5 & 63
                r11 = 128(0x80, float:1.794E-43)
                r5 = r5 | r11
                byte r5 = (byte) r5
                com.google.protobuf.z1.O(r1, r14, r5)
                r14 = 1
                long r18 = r3 + r14
                r5 = r13 & 63
                r5 = r5 | r11
                byte r5 = (byte) r5
                com.google.protobuf.z1.O(r1, r3, r5)
                r12 = r18
                r4 = 1
                goto L_0x0047
            L_0x00ae:
                r11 = 4
                long r11 = r6 - r11
                int r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r15 > 0) goto L_0x010f
                int r3 = r2 + 1
                if (r3 == r8) goto L_0x0107
                char r2 = r0.charAt(r3)
                boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r11 == 0) goto L_0x0106
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r11 = 1
                long r13 = r4 + r11
                int r15 = r2 >>> 18
                r15 = r15 | 240(0xf0, float:3.36E-43)
                byte r15 = (byte) r15
                com.google.protobuf.z1.O(r1, r4, r15)
                long r4 = r13 + r11
                int r15 = r2 >>> 12
                r15 = r15 & 63
                r11 = 128(0x80, float:1.794E-43)
                r12 = r15 | 128(0x80, float:1.794E-43)
                byte r12 = (byte) r12
                com.google.protobuf.z1.O(r1, r13, r12)
                r12 = 1
                long r14 = r4 + r12
                int r16 = r2 >>> 6
                r12 = r16 & 63
                r12 = r12 | r11
                byte r12 = (byte) r12
                com.google.protobuf.z1.O(r1, r4, r12)
                r4 = 1
                long r12 = r14 + r4
                r2 = r2 & 63
                r2 = r2 | r11
                byte r2 = (byte) r2
                com.google.protobuf.z1.O(r1, r14, r2)
                r2 = r3
            L_0x00fb:
                int r2 = r2 + 1
                r3 = 128(0x80, float:1.794E-43)
                r20 = r4
                r4 = r12
                r11 = r20
                goto L_0x0033
            L_0x0106:
                r2 = r3
            L_0x0107:
                com.google.protobuf.a2$d r0 = new com.google.protobuf.a2$d
                int r2 = r2 + -1
                r0.<init>(r2, r8)
                throw r0
            L_0x010f:
                if (r14 > r13) goto L_0x0127
                if (r13 > r3) goto L_0x0127
                int r1 = r2 + 1
                if (r1 == r8) goto L_0x0121
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L_0x0127
            L_0x0121:
                com.google.protobuf.a2$d r0 = new com.google.protobuf.a2$d
                r0.<init>(r2, r8)
                throw r0
            L_0x0127:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r13)
                r1.append(r9)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0142:
                int r0 = (int) r4
                return r0
            L_0x0144:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r10)
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                r4.append(r0)
                r4.append(r9)
                int r0 = r2 + r3
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a2.e.e(java.lang.CharSequence, byte[], int, int):int");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
            if (com.google.protobuf.z1.x(r13, r2) > -65) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x009e, code lost:
            if (com.google.protobuf.z1.x(r13, r2) > -65) goto L_0x00a0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int i(int r12, byte[] r13, int r14, int r15) {
            /*
                r11 = this;
                r0 = r14 | r15
                int r1 = r13.length
                int r1 = r1 - r15
                r0 = r0 | r1
                r1 = 0
                if (r0 < 0) goto L_0x00a8
                long r2 = (long) r14
                long r14 = (long) r15
                if (r12 == 0) goto L_0x00a1
                int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
                if (r0 < 0) goto L_0x0011
                return r12
            L_0x0011:
                byte r0 = (byte) r12
                r4 = -32
                r5 = -1
                r6 = -65
                r7 = 1
                if (r0 >= r4) goto L_0x002b
                r12 = -62
                if (r0 < r12) goto L_0x002a
                long r7 = r7 + r2
                byte r12 = com.google.protobuf.z1.x(r13, r2)
                if (r12 <= r6) goto L_0x0027
                goto L_0x002a
            L_0x0027:
                r2 = r7
                goto L_0x00a1
            L_0x002a:
                return r5
            L_0x002b:
                r9 = -16
                if (r0 >= r9) goto L_0x005f
                int r12 = r12 >> 8
                int r12 = ~r12
                byte r12 = (byte) r12
                if (r12 != 0) goto L_0x0045
                long r9 = r2 + r7
                byte r12 = com.google.protobuf.z1.x(r13, r2)
                int r1 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r1 < 0) goto L_0x0044
                int r12 = com.google.protobuf.a2.n(r0, r12)
                return r12
            L_0x0044:
                r2 = r9
            L_0x0045:
                if (r12 > r6) goto L_0x005e
                r1 = -96
                if (r0 != r4) goto L_0x004d
                if (r12 < r1) goto L_0x005e
            L_0x004d:
                r4 = -19
                if (r0 != r4) goto L_0x0053
                if (r12 >= r1) goto L_0x005e
            L_0x0053:
                long r0 = r2 + r7
                byte r12 = com.google.protobuf.z1.x(r13, r2)
                if (r12 <= r6) goto L_0x005c
                goto L_0x005e
            L_0x005c:
                r2 = r0
                goto L_0x00a1
            L_0x005e:
                return r5
            L_0x005f:
                int r4 = r12 >> 8
                int r4 = ~r4
                byte r4 = (byte) r4
                if (r4 != 0) goto L_0x0076
                long r9 = r2 + r7
                byte r4 = com.google.protobuf.z1.x(r13, r2)
                int r12 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r12 < 0) goto L_0x0074
                int r12 = com.google.protobuf.a2.n(r0, r4)
                return r12
            L_0x0074:
                r2 = r9
                goto L_0x0079
            L_0x0076:
                int r12 = r12 >> 16
                byte r1 = (byte) r12
            L_0x0079:
                if (r1 != 0) goto L_0x008b
                long r9 = r2 + r7
                byte r1 = com.google.protobuf.z1.x(r13, r2)
                int r12 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r12 < 0) goto L_0x008a
                int r12 = com.google.protobuf.a2.o(r0, r4, r1)
                return r12
            L_0x008a:
                r2 = r9
            L_0x008b:
                if (r4 > r6) goto L_0x00a0
                int r12 = r0 << 28
                int r4 = r4 + 112
                int r12 = r12 + r4
                int r12 = r12 >> 30
                if (r12 != 0) goto L_0x00a0
                if (r1 > r6) goto L_0x00a0
                long r0 = r2 + r7
                byte r12 = com.google.protobuf.z1.x(r13, r2)
                if (r12 <= r6) goto L_0x005c
            L_0x00a0:
                return r5
            L_0x00a1:
                long r14 = r14 - r2
                int r12 = (int) r14
                int r12 = o(r13, r2, r12)
                return r12
            L_0x00a8:
                java.lang.ArrayIndexOutOfBoundsException r12 = new java.lang.ArrayIndexOutOfBoundsException
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int r13 = r13.length
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r0[r1] = r13
                r13 = 1
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r0[r13] = r14
                r13 = 2
                java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
                r0[r13] = r14
                java.lang.String r13 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r13 = java.lang.String.format(r13, r0)
                r12.<init>(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a2.e.i(int, byte[], int, int):int");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
            if (com.google.protobuf.z1.w(r2) > -65) goto L_0x0068;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a8, code lost:
            if (com.google.protobuf.z1.w(r2) > -65) goto L_0x00aa;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int l(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
            /*
                r10 = this;
                r0 = r13 | r14
                int r1 = r12.limit()
                int r1 = r1 - r14
                r0 = r0 | r1
                r1 = 0
                if (r0 < 0) goto L_0x00b2
                long r2 = com.google.protobuf.z1.k(r12)
                long r4 = (long) r13
                long r2 = r2 + r4
                int r14 = r14 - r13
                long r12 = (long) r14
                long r12 = r12 + r2
                if (r11 == 0) goto L_0x00ab
                int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
                if (r14 < 0) goto L_0x001b
                return r11
            L_0x001b:
                byte r14 = (byte) r11
                r0 = -32
                r4 = -1
                r5 = -65
                r6 = 1
                if (r14 >= r0) goto L_0x0035
                r11 = -62
                if (r14 < r11) goto L_0x0034
                long r6 = r6 + r2
                byte r11 = com.google.protobuf.z1.w(r2)
                if (r11 <= r5) goto L_0x0031
                goto L_0x0034
            L_0x0031:
                r2 = r6
                goto L_0x00ab
            L_0x0034:
                return r4
            L_0x0035:
                r8 = -16
                if (r14 >= r8) goto L_0x0069
                int r11 = r11 >> 8
                int r11 = ~r11
                byte r11 = (byte) r11
                if (r11 != 0) goto L_0x004f
                long r8 = r2 + r6
                byte r11 = com.google.protobuf.z1.w(r2)
                int r1 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r1 < 0) goto L_0x004e
                int r11 = com.google.protobuf.a2.n(r14, r11)
                return r11
            L_0x004e:
                r2 = r8
            L_0x004f:
                if (r11 > r5) goto L_0x0068
                r1 = -96
                if (r14 != r0) goto L_0x0057
                if (r11 < r1) goto L_0x0068
            L_0x0057:
                r0 = -19
                if (r14 != r0) goto L_0x005d
                if (r11 >= r1) goto L_0x0068
            L_0x005d:
                long r0 = r2 + r6
                byte r11 = com.google.protobuf.z1.w(r2)
                if (r11 <= r5) goto L_0x0066
                goto L_0x0068
            L_0x0066:
                r2 = r0
                goto L_0x00ab
            L_0x0068:
                return r4
            L_0x0069:
                int r0 = r11 >> 8
                int r0 = ~r0
                byte r0 = (byte) r0
                if (r0 != 0) goto L_0x0080
                long r8 = r2 + r6
                byte r0 = com.google.protobuf.z1.w(r2)
                int r11 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r11 < 0) goto L_0x007e
                int r11 = com.google.protobuf.a2.n(r14, r0)
                return r11
            L_0x007e:
                r2 = r8
                goto L_0x0083
            L_0x0080:
                int r11 = r11 >> 16
                byte r1 = (byte) r11
            L_0x0083:
                if (r1 != 0) goto L_0x0095
                long r8 = r2 + r6
                byte r1 = com.google.protobuf.z1.w(r2)
                int r11 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r11 < 0) goto L_0x0094
                int r11 = com.google.protobuf.a2.o(r14, r0, r1)
                return r11
            L_0x0094:
                r2 = r8
            L_0x0095:
                if (r0 > r5) goto L_0x00aa
                int r11 = r14 << 28
                int r0 = r0 + 112
                int r11 = r11 + r0
                int r11 = r11 >> 30
                if (r11 != 0) goto L_0x00aa
                if (r1 > r5) goto L_0x00aa
                long r0 = r2 + r6
                byte r11 = com.google.protobuf.z1.w(r2)
                if (r11 <= r5) goto L_0x0066
            L_0x00aa:
                return r4
            L_0x00ab:
                long r12 = r12 - r2
                int r11 = (int) r12
                int r11 = n(r2, r11)
                return r11
            L_0x00b2:
                java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int r12 = r12.limit()
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r0[r1] = r12
                r12 = 1
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r0[r12] = r13
                r12 = 2
                java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
                r0[r12] = r13
                java.lang.String r12 = "buffer limit=%d, index=%d, limit=%d"
                java.lang.String r12 = java.lang.String.format(r12, r0)
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a2.e.l(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        b bVar;
        if (!e.m() || d.c()) {
            bVar = new c();
        } else {
            bVar = new e();
        }
        f26934a = bVar;
    }

    static String g(ByteBuffer byteBuffer, int i10, int i11) throws e0 {
        return f26934a.a(byteBuffer, i10, i11);
    }

    static String h(byte[] bArr, int i10, int i11) throws e0 {
        return f26934a.b(bArr, i10, i11);
    }

    static int i(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        return f26934a.e(charSequence, bArr, i10, i11);
    }

    static int j(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 < length) {
                char charAt = charSequence.charAt(i10);
                if (charAt >= 2048) {
                    i11 += k(charSequence, i10);
                    break;
                }
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                break;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i11) + 4294967296L));
    }

    private static int k(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        while (i10 < length) {
            char charAt = charSequence.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i10) >= 65536) {
                        i10++;
                    } else {
                        throw new d(i10, length);
                    }
                }
            }
            i10++;
        }
        return i11;
    }

    /* access modifiers changed from: private */
    public static int l(ByteBuffer byteBuffer, int i10, int i11) {
        int i12 = i11 - 7;
        int i13 = i10;
        while (i13 < i12 && (byteBuffer.getLong(i13) & -9187201950435737472L) == 0) {
            i13 += 8;
        }
        return i13 - i10;
    }

    /* access modifiers changed from: private */
    public static int m(int i10) {
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public static int n(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    /* access modifiers changed from: private */
    public static int o(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    /* access modifiers changed from: private */
    public static int p(ByteBuffer byteBuffer, int i10, int i11, int i12) {
        if (i12 == 0) {
            return m(i10);
        }
        if (i12 == 1) {
            return n(i10, byteBuffer.get(i11));
        }
        if (i12 == 2) {
            return o(i10, byteBuffer.get(i11), byteBuffer.get(i11 + 1));
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    public static int q(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            return m(b10);
        }
        if (i12 == 1) {
            return n(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return o(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    static boolean r(ByteBuffer byteBuffer) {
        return f26934a.f(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    static boolean s(byte[] bArr) {
        return f26934a.g(bArr, 0, bArr.length);
    }

    static boolean t(byte[] bArr, int i10, int i11) {
        return f26934a.g(bArr, i10, i11);
    }

    static int u(int i10, ByteBuffer byteBuffer, int i11, int i12) {
        return f26934a.h(i10, byteBuffer, i11, i12);
    }

    static int v(int i10, byte[] bArr, int i11, int i12) {
        return f26934a.i(i10, bArr, i11, i12);
    }
}
