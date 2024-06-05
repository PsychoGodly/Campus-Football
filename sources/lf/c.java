package lf;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: Buffer */
public final class c implements e, d, Cloneable, ByteChannel {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f36250c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a  reason: collision with root package name */
    o f36251a;

    /* renamed from: b  reason: collision with root package name */
    long f36252b;

    /* compiled from: Buffer */
    class a extends OutputStream {
        a() {
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return c.this + ".outputStream()";
        }

        public void write(int i10) {
            c.this.G((byte) i10);
        }

        public void write(byte[] bArr, int i10, int i11) {
            c.this.f(bArr, i10, i11);
        }
    }

    public final long B() {
        long j10 = this.f36252b;
        if (j10 == 0) {
            return 0;
        }
        o oVar = this.f36251a.f36289g;
        int i10 = oVar.f36285c;
        return (i10 >= 8192 || !oVar.f36287e) ? j10 : j10 - ((long) (i10 - oVar.f36284b));
    }

    /* access modifiers changed from: package-private */
    public o C0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException();
        }
        o oVar = this.f36251a;
        if (oVar == null) {
            o b10 = p.b();
            this.f36251a = b10;
            b10.f36289g = b10;
            b10.f36288f = b10;
            return b10;
        }
        o oVar2 = oVar.f36289g;
        return (oVar2.f36285c + i10 > 8192 || !oVar2.f36287e) ? oVar2.c(p.b()) : oVar2;
    }

    public byte[] D() {
        try {
            return p0(this.f36252b);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public c E() {
        return this;
    }

    public c E0(f fVar) {
        if (fVar != null) {
            fVar.v(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public boolean F() {
        return this.f36252b == 0;
    }

    /* renamed from: G0 */
    public c t0(byte[] bArr) {
        if (bArr != null) {
            return f(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    public final c J(c cVar, long j10, long j11) {
        if (cVar != null) {
            u.b(this.f36252b, j10, j11);
            if (j11 == 0) {
                return this;
            }
            cVar.f36252b += j11;
            o oVar = this.f36251a;
            while (true) {
                int i10 = oVar.f36285c;
                int i11 = oVar.f36284b;
                if (j10 < ((long) (i10 - i11))) {
                    break;
                }
                j10 -= (long) (i10 - i11);
                oVar = oVar.f36288f;
            }
            while (j11 > 0) {
                o d10 = oVar.d();
                int i12 = (int) (((long) d10.f36284b) + j10);
                d10.f36284b = i12;
                d10.f36285c = Math.min(i12 + ((int) j11), d10.f36285c);
                o oVar2 = cVar.f36251a;
                if (oVar2 == null) {
                    d10.f36289g = d10;
                    d10.f36288f = d10;
                    cVar.f36251a = d10;
                } else {
                    oVar2.f36289g.c(d10);
                }
                j11 -= (long) (d10.f36285c - d10.f36284b);
                oVar = oVar.f36288f;
                j10 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: L */
    public c K() {
        return this;
    }

    public String M(long j10) throws EOFException {
        if (j10 >= 0) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            long Z = Z((byte) 10, 0, j11);
            if (Z != -1) {
                return u0(Z);
            }
            if (j11 < v0() && R(j11 - 1) == 13 && R(j11) == 10) {
                return u0(j11);
            }
            c cVar = new c();
            J(cVar, 0, Math.min(32, v0()));
            throw new EOFException("\\n not found: limit=" + Math.min(v0(), j10) + " content=" + cVar.h0().j() + 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j10);
    }

    public void O0(long j10) throws EOFException {
        if (this.f36252b < j10) {
            throw new EOFException();
        }
    }

    public long P(c cVar, long j10) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j10 >= 0) {
            long j11 = this.f36252b;
            if (j11 == 0) {
                return -1;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            cVar.V0(this, j10);
            return j10;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
    }

    /* renamed from: Q0 */
    public c f(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = (long) i11;
            u.b((long) bArr.length, (long) i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                o C0 = C0(1);
                int min = Math.min(i12 - i10, 8192 - C0.f36285c);
                System.arraycopy(bArr, i10, C0.f36283a, C0.f36285c, min);
                i10 += min;
                C0.f36285c += min;
            }
            this.f36252b += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final byte R(long j10) {
        int i10;
        u.b(this.f36252b, j10, 1);
        long j11 = this.f36252b;
        if (j11 - j10 > j10) {
            o oVar = this.f36251a;
            while (true) {
                int i11 = oVar.f36285c;
                int i12 = oVar.f36284b;
                long j12 = (long) (i11 - i12);
                if (j10 < j12) {
                    return oVar.f36283a[i12 + ((int) j10)];
                }
                j10 -= j12;
                oVar = oVar.f36288f;
            }
        } else {
            long j13 = j10 - j11;
            o oVar2 = this.f36251a;
            do {
                oVar2 = oVar2.f36289g;
                int i13 = oVar2.f36285c;
                i10 = oVar2.f36284b;
                j13 += (long) (i13 - i10);
            } while (j13 < 0);
            return oVar2.f36283a[i10 + ((int) j13)];
        }
    }

    public long T0(byte b10) {
        return Z(b10, 0, Long.MAX_VALUE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r8 != r9) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r15.f36251a = r6.b();
        lf.p.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        r6.f36284b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (r1 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0076 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long U0() {
        /*
            r15 = this;
            long r0 = r15.f36252b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00ac
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            lf.o r6 = r15.f36251a
            byte[] r7 = r6.f36283a
            int r8 = r6.f36284b
            int r9 = r6.f36285c
        L_0x0013:
            if (r8 >= r9) goto L_0x0091
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x003a
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002f
            int r11 = r10 + -97
        L_0x002c:
            int r11 = r11 + 10
            goto L_0x003a
        L_0x002f:
            r11 = 65
            if (r10 < r11) goto L_0x0072
            r11 = 70
            if (r10 > r11) goto L_0x0072
            int r11 = r10 + -65
            goto L_0x002c
        L_0x003a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x004a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x004a:
            lf.c r0 = new lf.c
            r0.<init>()
            lf.c r0 = r0.b0(r4)
            lf.c r0 = r0.G(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.l0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0072:
            if (r0 == 0) goto L_0x0076
            r1 = 1
            goto L_0x0091
        L_0x0076:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0091:
            if (r8 != r9) goto L_0x009d
            lf.o r7 = r6.b()
            r15.f36251a = r7
            lf.p.a(r6)
            goto L_0x009f
        L_0x009d:
            r6.f36284b = r8
        L_0x009f:
            if (r1 != 0) goto L_0x00a5
            lf.o r6 = r15.f36251a
            if (r6 != 0) goto L_0x000b
        L_0x00a5:
            long r1 = r15.f36252b
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f36252b = r1
            return r4
        L_0x00ac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.c.U0():long");
    }

    public void V0(c cVar, long j10) {
        int i10;
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (cVar != this) {
            u.b(cVar.f36252b, 0, j10);
            while (j10 > 0) {
                o oVar = cVar.f36251a;
                if (j10 < ((long) (oVar.f36285c - oVar.f36284b))) {
                    o oVar2 = this.f36251a;
                    o oVar3 = oVar2 != null ? oVar2.f36289g : null;
                    if (oVar3 != null && oVar3.f36287e) {
                        long j11 = ((long) oVar3.f36285c) + j10;
                        if (oVar3.f36286d) {
                            i10 = 0;
                        } else {
                            i10 = oVar3.f36284b;
                        }
                        if (j11 - ((long) i10) <= 8192) {
                            oVar.f(oVar3, (int) j10);
                            cVar.f36252b -= j10;
                            this.f36252b += j10;
                            return;
                        }
                    }
                    cVar.f36251a = oVar.e((int) j10);
                }
                o oVar4 = cVar.f36251a;
                long j12 = (long) (oVar4.f36285c - oVar4.f36284b);
                cVar.f36251a = oVar4.b();
                o oVar5 = this.f36251a;
                if (oVar5 == null) {
                    this.f36251a = oVar4;
                    oVar4.f36289g = oVar4;
                    oVar4.f36288f = oVar4;
                } else {
                    oVar5.f36289g.c(oVar4).a();
                }
                cVar.f36252b -= j12;
                this.f36252b += j12;
                j10 -= j12;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public String X(Charset charset) {
        try {
            return i0(this.f36252b, charset);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: X0 */
    public c G(int i10) {
        o C0 = C0(1);
        byte[] bArr = C0.f36283a;
        int i11 = C0.f36285c;
        C0.f36285c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f36252b++;
        return this;
    }

    /* renamed from: Y0 */
    public c b0(long j10) {
        if (j10 == 0) {
            return G(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        o C0 = C0(numberOfTrailingZeros);
        byte[] bArr = C0.f36283a;
        int i10 = C0.f36285c;
        for (int i11 = (i10 + numberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = f36250c[(int) (15 & j10)];
            j10 >>>= 4;
        }
        C0.f36285c += numberOfTrailingZeros;
        this.f36252b += (long) numberOfTrailingZeros;
        return this;
    }

    public long Z(byte b10, long j10, long j11) {
        o oVar;
        long j12 = 0;
        if (j10 < 0 || j11 < j10) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f36252b), Long.valueOf(j10), Long.valueOf(j11)}));
        }
        long j13 = this.f36252b;
        long j14 = j11 > j13 ? j13 : j11;
        if (j10 == j14 || (oVar = this.f36251a) == null) {
            return -1;
        }
        if (j13 - j10 < j10) {
            while (j13 > j10) {
                oVar = oVar.f36289g;
                j13 -= (long) (oVar.f36285c - oVar.f36284b);
            }
        } else {
            while (true) {
                long j15 = ((long) (oVar.f36285c - oVar.f36284b)) + j12;
                if (j15 >= j10) {
                    break;
                }
                oVar = oVar.f36288f;
                j12 = j15;
            }
            j13 = j12;
        }
        long j16 = j10;
        while (j13 < j14) {
            byte[] bArr = oVar.f36283a;
            int min = (int) Math.min((long) oVar.f36285c, (((long) oVar.f36284b) + j14) - j13);
            for (int i10 = (int) ((((long) oVar.f36284b) + j16) - j13); i10 < min; i10++) {
                if (bArr[i10] == b10) {
                    return ((long) (i10 - oVar.f36284b)) + j13;
                }
            }
            byte b11 = b10;
            j13 += (long) (oVar.f36285c - oVar.f36284b);
            oVar = oVar.f36288f;
            j16 = j13;
        }
        return -1;
    }

    /* renamed from: Z0 */
    public c y(int i10) {
        o C0 = C0(4);
        byte[] bArr = C0.f36283a;
        int i11 = C0.f36285c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        C0.f36285c = i14 + 1;
        this.f36252b += 4;
        return this;
    }

    /* renamed from: a1 */
    public c v(int i10) {
        o C0 = C0(2);
        byte[] bArr = C0.f36283a;
        int i11 = C0.f36285c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        C0.f36285c = i12 + 1;
        this.f36252b += 2;
        return this;
    }

    public c b1(String str, int i10, int i11, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i10 < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i10);
        } else if (i11 < i10) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
        } else if (i11 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(u.f36298a)) {
            return e1(str, i10, i11);
        } else {
            byte[] bytes = str.substring(i10, i11).getBytes(charset);
            return f(bytes, 0, bytes.length);
        }
    }

    public c c() {
        return this;
    }

    public final c c1(OutputStream outputStream, long j10) throws IOException {
        if (outputStream != null) {
            u.b(this.f36252b, 0, j10);
            o oVar = this.f36251a;
            while (j10 > 0) {
                int min = (int) Math.min(j10, (long) (oVar.f36285c - oVar.f36284b));
                outputStream.write(oVar.f36283a, oVar.f36284b, min);
                int i10 = oVar.f36284b + min;
                oVar.f36284b = i10;
                long j11 = (long) min;
                this.f36252b -= j11;
                j10 -= j11;
                if (i10 == oVar.f36285c) {
                    o b10 = oVar.b();
                    this.f36251a = b10;
                    p.a(oVar);
                    oVar = b10;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public void close() {
    }

    public boolean d0(long j10, f fVar) {
        return g0(j10, fVar, 0, fVar.p());
    }

    /* renamed from: d1 */
    public c T(String str) {
        return e1(str, 0, str.length());
    }

    public t e() {
        return t.f36294d;
    }

    public OutputStream e0() {
        return new a();
    }

    public c e1(String str, int i10, int i11) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i10);
        } else if (i11 < i10) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
        } else if (i11 <= str.length()) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt < 128) {
                    o C0 = C0(1);
                    byte[] bArr = C0.f36283a;
                    int i12 = C0.f36285c - i10;
                    int min = Math.min(i11, 8192 - i12);
                    int i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) charAt;
                    while (i13 < min) {
                        char charAt2 = str.charAt(i13);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i13 + i12] = (byte) charAt2;
                        i13++;
                    }
                    int i14 = C0.f36285c;
                    int i15 = (i12 + i13) - i14;
                    C0.f36285c = i14 + i15;
                    this.f36252b += (long) i15;
                    i10 = i13;
                } else {
                    if (charAt < 2048) {
                        G((charAt >> 6) | 192);
                        G((charAt & '?') | 128);
                    } else if (charAt < 55296 || charAt > 57343) {
                        G((charAt >> 12) | 224);
                        G(((charAt >> 6) & 63) | 128);
                        G((charAt & '?') | 128);
                    } else {
                        int i16 = i10 + 1;
                        char charAt3 = i16 < i11 ? str.charAt(i16) : 0;
                        if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            G(63);
                            i10 = i16;
                        } else {
                            int i17 = (((charAt & 10239) << 10) | (9215 & charAt3)) + Ascii.MIN;
                            G((i17 >> 18) | 240);
                            G(((i17 >> 12) & 63) | 128);
                            G(((i17 >> 6) & 63) | 128);
                            G((i17 & 63) | 128);
                            i10 += 2;
                        }
                    }
                    i10++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j10 = this.f36252b;
        if (j10 != cVar.f36252b) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        o oVar = this.f36251a;
        o oVar2 = cVar.f36251a;
        int i10 = oVar.f36284b;
        int i11 = oVar2.f36284b;
        while (j11 < this.f36252b) {
            long min = (long) Math.min(oVar.f36285c - i10, oVar2.f36285c - i11);
            int i12 = 0;
            while (((long) i12) < min) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (oVar.f36283a[i10] != oVar2.f36283a[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == oVar.f36285c) {
                oVar = oVar.f36288f;
                i10 = oVar.f36284b;
            }
            if (i11 == oVar2.f36285c) {
                oVar2 = oVar2.f36288f;
                i11 = oVar2.f36284b;
            }
            j11 += min;
        }
        return true;
    }

    public c f1(int i10) {
        if (i10 < 128) {
            G(i10);
        } else if (i10 < 2048) {
            G((i10 >> 6) | 192);
            G((i10 & 63) | 128);
        } else if (i10 < 65536) {
            if (i10 < 55296 || i10 > 57343) {
                G((i10 >> 12) | 224);
                G(((i10 >> 6) & 63) | 128);
                G((i10 & 63) | 128);
            } else {
                G(63);
            }
        } else if (i10 <= 1114111) {
            G((i10 >> 18) | 240);
            G(((i10 >> 12) & 63) | 128);
            G(((i10 >> 6) & 63) | 128);
            G((i10 & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
        }
        return this;
    }

    public void flush() {
    }

    public boolean g0(long j10, f fVar, int i10, int i11) {
        if (j10 < 0 || i10 < 0 || i11 < 0 || this.f36252b - j10 < ((long) i11) || fVar.p() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (R(((long) i12) + j10) != fVar.i(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public f h0() {
        return new f(D());
    }

    public int hashCode() {
        o oVar = this.f36251a;
        if (oVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = oVar.f36285c;
            for (int i12 = oVar.f36284b; i12 < i11; i12++) {
                i10 = (i10 * 31) + oVar.f36283a[i12];
            }
            oVar = oVar.f36288f;
        } while (oVar != this.f36251a);
        return i10;
    }

    public final void i() {
        try {
            skip(this.f36252b);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public String i0(long j10, Charset charset) throws EOFException {
        u.b(this.f36252b, 0, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j10 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
        } else if (j10 == 0) {
            return MaxReward.DEFAULT_LABEL;
        } else {
            o oVar = this.f36251a;
            int i10 = oVar.f36284b;
            if (((long) i10) + j10 > ((long) oVar.f36285c)) {
                return new String(p0(j10), charset);
            }
            String str = new String(oVar.f36283a, i10, (int) j10, charset);
            int i11 = (int) (((long) oVar.f36284b) + j10);
            oVar.f36284b = i11;
            this.f36252b -= j10;
            if (i11 == oVar.f36285c) {
                this.f36251a = oVar.b();
                p.a(oVar);
            }
            return str;
        }
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public c clone() {
        c cVar = new c();
        if (this.f36252b == 0) {
            return cVar;
        }
        o d10 = this.f36251a.d();
        cVar.f36251a = d10;
        d10.f36289g = d10;
        d10.f36288f = d10;
        o oVar = this.f36251a;
        while (true) {
            oVar = oVar.f36288f;
            if (oVar != this.f36251a) {
                cVar.f36251a.f36289g.c(oVar.d());
            } else {
                cVar.f36252b = this.f36252b;
                return cVar;
            }
        }
    }

    public String k0() throws EOFException {
        return M(Long.MAX_VALUE);
    }

    public String l0() {
        try {
            return i0(this.f36252b, u.f36298a);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public int m0() {
        return u.c(readInt());
    }

    public String n0(long j10) throws EOFException {
        return i0(j10, u.f36298a);
    }

    public long p(s sVar) throws IOException {
        if (sVar != null) {
            long j10 = 0;
            while (true) {
                long P = sVar.P(this, 8192);
                if (P == -1) {
                    return j10;
                }
                j10 += P;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public byte[] p0(long j10) throws EOFException {
        u.b(this.f36252b, 0, j10);
        if (j10 <= 2147483647L) {
            byte[] bArr = new byte[((int) j10)];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
    }

    public f r(long j10) throws EOFException {
        return new f(p0(j10));
    }

    public int read(byte[] bArr, int i10, int i11) {
        u.b((long) bArr.length, (long) i10, (long) i11);
        o oVar = this.f36251a;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(i11, oVar.f36285c - oVar.f36284b);
        System.arraycopy(oVar.f36283a, oVar.f36284b, bArr, i10, min);
        int i12 = oVar.f36284b + min;
        oVar.f36284b = i12;
        this.f36252b -= (long) min;
        if (i12 == oVar.f36285c) {
            this.f36251a = oVar.b();
            p.a(oVar);
        }
        return min;
    }

    public byte readByte() {
        long j10 = this.f36252b;
        if (j10 != 0) {
            o oVar = this.f36251a;
            int i10 = oVar.f36284b;
            int i11 = oVar.f36285c;
            int i12 = i10 + 1;
            byte b10 = oVar.f36283a[i10];
            this.f36252b = j10 - 1;
            if (i12 == i11) {
                this.f36251a = oVar.b();
                p.a(oVar);
            } else {
                oVar.f36284b = i12;
            }
            return b10;
        }
        throw new IllegalStateException("size == 0");
    }

    public void readFully(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int read = read(bArr, i10, bArr.length - i10);
            if (read != -1) {
                i10 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() {
        long j10 = this.f36252b;
        if (j10 >= 4) {
            o oVar = this.f36251a;
            int i10 = oVar.f36284b;
            int i11 = oVar.f36285c;
            if (i11 - i10 < 4) {
                return ((readByte() & 255) << Ascii.CAN) | ((readByte() & 255) << Ascii.DLE) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = oVar.f36283a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            byte b10 = ((bArr[i10] & 255) << Ascii.CAN) | ((bArr[i12] & 255) << Ascii.DLE);
            int i14 = i13 + 1;
            byte b11 = b10 | ((bArr[i13] & 255) << 8);
            int i15 = i14 + 1;
            byte b12 = b11 | (bArr[i14] & 255);
            this.f36252b = j10 - 4;
            if (i15 == i11) {
                this.f36251a = oVar.b();
                p.a(oVar);
            } else {
                oVar.f36284b = i15;
            }
            return b12;
        }
        throw new IllegalStateException("size < 4: " + this.f36252b);
    }

    public short readShort() {
        long j10 = this.f36252b;
        if (j10 >= 2) {
            o oVar = this.f36251a;
            int i10 = oVar.f36284b;
            int i11 = oVar.f36285c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = oVar.f36283a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            byte b10 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
            this.f36252b = j10 - 2;
            if (i13 == i11) {
                this.f36251a = oVar.b();
                p.a(oVar);
            } else {
                oVar.f36284b = i13;
            }
            return (short) b10;
        }
        throw new IllegalStateException("size < 2: " + this.f36252b);
    }

    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            o oVar = this.f36251a;
            if (oVar != null) {
                int min = (int) Math.min(j10, (long) (oVar.f36285c - oVar.f36284b));
                long j11 = (long) min;
                this.f36252b -= j11;
                j10 -= j11;
                o oVar2 = this.f36251a;
                int i10 = oVar2.f36284b + min;
                oVar2.f36284b = i10;
                if (i10 == oVar2.f36285c) {
                    this.f36251a = oVar2.b();
                    p.a(oVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public String toString() {
        return w0().toString();
    }

    /* access modifiers changed from: package-private */
    public String u0(long j10) throws EOFException {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (R(j11) == 13) {
                String n02 = n0(j11);
                skip(2);
                return n02;
            }
        }
        String n03 = n0(j10);
        skip(1);
        return n03;
    }

    public final long v0() {
        return this.f36252b;
    }

    public final f w0() {
        long j10 = this.f36252b;
        if (j10 <= 2147483647L) {
            return y0((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f36252b);
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i10 = remaining;
            while (i10 > 0) {
                o C0 = C0(1);
                int min = Math.min(i10, 8192 - C0.f36285c);
                byteBuffer.get(C0.f36283a, C0.f36285c, min);
                i10 -= min;
                C0.f36285c += min;
            }
            this.f36252b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public short x0() {
        return u.d(readShort());
    }

    public final f y0(int i10) {
        if (i10 == 0) {
            return f.f36255f;
        }
        return new q(this, i10);
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        o oVar = this.f36251a;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), oVar.f36285c - oVar.f36284b);
        byteBuffer.put(oVar.f36283a, oVar.f36284b, min);
        int i10 = oVar.f36284b + min;
        oVar.f36284b = i10;
        this.f36252b -= (long) min;
        if (i10 == oVar.f36285c) {
            this.f36251a = oVar.b();
            p.a(oVar);
        }
        return min;
    }
}
