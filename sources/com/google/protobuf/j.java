package com.google.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: CodedInputStream */
public abstract class j {

    /* renamed from: f  reason: collision with root package name */
    private static volatile int f27059f = 100;

    /* renamed from: a  reason: collision with root package name */
    int f27060a;

    /* renamed from: b  reason: collision with root package name */
    int f27061b;

    /* renamed from: c  reason: collision with root package name */
    int f27062c;

    /* renamed from: d  reason: collision with root package name */
    k f27063d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f27064e;

    /* compiled from: CodedInputStream */
    private static final class b extends j {

        /* renamed from: g  reason: collision with root package name */
        private final byte[] f27065g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f27066h;

        /* renamed from: i  reason: collision with root package name */
        private int f27067i;

        /* renamed from: j  reason: collision with root package name */
        private int f27068j;

        /* renamed from: k  reason: collision with root package name */
        private int f27069k;

        /* renamed from: l  reason: collision with root package name */
        private int f27070l;

        /* renamed from: m  reason: collision with root package name */
        private int f27071m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f27072n;

        /* renamed from: o  reason: collision with root package name */
        private int f27073o;

        private void P() {
            int i10 = this.f27067i + this.f27068j;
            this.f27067i = i10;
            int i11 = i10 - this.f27070l;
            int i12 = this.f27073o;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f27068j = i13;
                this.f27067i = i10 - i13;
                return;
            }
            this.f27068j = 0;
        }

        private void S() throws IOException {
            if (this.f27067i - this.f27069k >= 10) {
                T();
            } else {
                U();
            }
        }

        private void T() throws IOException {
            int i10 = 0;
            while (i10 < 10) {
                byte[] bArr = this.f27065g;
                int i11 = this.f27069k;
                this.f27069k = i11 + 1;
                if (bArr[i11] < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw e0.f();
        }

        private void U() throws IOException {
            int i10 = 0;
            while (i10 < 10) {
                if (I() < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw e0.f();
        }

        public long A() throws IOException {
            return j.c(N());
        }

        public String B() throws IOException {
            int M = M();
            if (M > 0) {
                int i10 = this.f27067i;
                int i11 = this.f27069k;
                if (M <= i10 - i11) {
                    String str = new String(this.f27065g, i11, M, d0.f26986b);
                    this.f27069k += M;
                    return str;
                }
            }
            if (M == 0) {
                return MaxReward.DEFAULT_LABEL;
            }
            if (M < 0) {
                throw e0.g();
            }
            throw e0.m();
        }

        public String C() throws IOException {
            int M = M();
            if (M > 0) {
                int i10 = this.f27067i;
                int i11 = this.f27069k;
                if (M <= i10 - i11) {
                    String h10 = a2.h(this.f27065g, i11, M);
                    this.f27069k += M;
                    return h10;
                }
            }
            if (M == 0) {
                return MaxReward.DEFAULT_LABEL;
            }
            if (M <= 0) {
                throw e0.g();
            }
            throw e0.m();
        }

        public int D() throws IOException {
            if (e()) {
                this.f27071m = 0;
                return 0;
            }
            int M = M();
            this.f27071m = M;
            if (b2.a(M) != 0) {
                return this.f27071m;
            }
            throw e0.c();
        }

        public int E() throws IOException {
            return M();
        }

        public long F() throws IOException {
            return N();
        }

        public boolean H(int i10) throws IOException {
            int b10 = b2.b(i10);
            if (b10 == 0) {
                S();
                return true;
            } else if (b10 == 1) {
                R(8);
                return true;
            } else if (b10 == 2) {
                R(M());
                return true;
            } else if (b10 == 3) {
                Q();
                a(b2.c(b2.a(i10), 4));
                return true;
            } else if (b10 == 4) {
                return false;
            } else {
                if (b10 == 5) {
                    R(4);
                    return true;
                }
                throw e0.e();
            }
        }

        public byte I() throws IOException {
            int i10 = this.f27069k;
            if (i10 != this.f27067i) {
                byte[] bArr = this.f27065g;
                this.f27069k = i10 + 1;
                return bArr[i10];
            }
            throw e0.m();
        }

        public byte[] J(int i10) throws IOException {
            if (i10 > 0) {
                int i11 = this.f27067i;
                int i12 = this.f27069k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f27069k = i13;
                    return Arrays.copyOfRange(this.f27065g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw e0.m();
            } else if (i10 == 0) {
                return d0.f26988d;
            } else {
                throw e0.g();
            }
        }

        public int K() throws IOException {
            int i10 = this.f27069k;
            if (this.f27067i - i10 >= 4) {
                byte[] bArr = this.f27065g;
                this.f27069k = i10 + 4;
                return ((bArr[i10 + 3] & 255) << Ascii.CAN) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << Ascii.DLE);
            }
            throw e0.m();
        }

        public long L() throws IOException {
            int i10 = this.f27069k;
            if (this.f27067i - i10 >= 8) {
                byte[] bArr = this.f27065g;
                this.f27069k = i10 + 8;
                return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
            }
            throw e0.m();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int M() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f27069k
                int r1 = r5.f27067i
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f27065g
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f27069k = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.O()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f27069k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.b.M():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long N() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f27069k
                int r1 = r11.f27067i
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f27065g
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f27069k = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.O()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f27069k = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.b.N():long");
        }

        /* access modifiers changed from: package-private */
        public long O() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte I = I();
                j10 |= ((long) (I & Ascii.DEL)) << i10;
                if ((I & 128) == 0) {
                    return j10;
                }
            }
            throw e0.f();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void Q() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.D()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.H(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.b.Q():void");
        }

        public void R(int i10) throws IOException {
            if (i10 >= 0) {
                int i11 = this.f27067i;
                int i12 = this.f27069k;
                if (i10 <= i11 - i12) {
                    this.f27069k = i12 + i10;
                    return;
                }
            }
            if (i10 < 0) {
                throw e0.g();
            }
            throw e0.m();
        }

        public void a(int i10) throws e0 {
            if (this.f27071m != i10) {
                throw e0.b();
            }
        }

        public int d() {
            return this.f27069k - this.f27070l;
        }

        public boolean e() throws IOException {
            return this.f27069k == this.f27067i;
        }

        public void m(int i10) {
            this.f27073o = i10;
            P();
        }

        public int n(int i10) throws e0 {
            if (i10 >= 0) {
                int d10 = i10 + d();
                if (d10 >= 0) {
                    int i11 = this.f27073o;
                    if (d10 <= i11) {
                        this.f27073o = d10;
                        P();
                        return i11;
                    }
                    throw e0.m();
                }
                throw e0.h();
            }
            throw e0.g();
        }

        public boolean o() throws IOException {
            return N() != 0;
        }

        public i p() throws IOException {
            i iVar;
            int M = M();
            if (M > 0) {
                int i10 = this.f27067i;
                int i11 = this.f27069k;
                if (M <= i10 - i11) {
                    if (!this.f27066h || !this.f27072n) {
                        iVar = i.p(this.f27065g, i11, M);
                    } else {
                        iVar = i.R(this.f27065g, i11, M);
                    }
                    this.f27069k += M;
                    return iVar;
                }
            }
            if (M == 0) {
                return i.f27039b;
            }
            return i.Q(J(M));
        }

        public double q() throws IOException {
            return Double.longBitsToDouble(L());
        }

        public int r() throws IOException {
            return M();
        }

        public int s() throws IOException {
            return K();
        }

        public long t() throws IOException {
            return L();
        }

        public float u() throws IOException {
            return Float.intBitsToFloat(K());
        }

        public int v() throws IOException {
            return M();
        }

        public long w() throws IOException {
            return N();
        }

        public int x() throws IOException {
            return K();
        }

        public long y() throws IOException {
            return L();
        }

        public int z() throws IOException {
            return j.b(M());
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f27073o = a.e.API_PRIORITY_OTHER;
            this.f27065g = bArr;
            this.f27067i = i11 + i10;
            this.f27069k = i10;
            this.f27070l = i10;
            this.f27066h = z10;
        }
    }

    /* compiled from: CodedInputStream */
    private static final class c extends j {

        /* renamed from: g  reason: collision with root package name */
        private final Iterable<ByteBuffer> f27074g;

        /* renamed from: h  reason: collision with root package name */
        private final Iterator<ByteBuffer> f27075h;

        /* renamed from: i  reason: collision with root package name */
        private ByteBuffer f27076i;

        /* renamed from: j  reason: collision with root package name */
        private final boolean f27077j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f27078k;

        /* renamed from: l  reason: collision with root package name */
        private int f27079l;

        /* renamed from: m  reason: collision with root package name */
        private int f27080m;

        /* renamed from: n  reason: collision with root package name */
        private int f27081n;

        /* renamed from: o  reason: collision with root package name */
        private int f27082o;

        /* renamed from: p  reason: collision with root package name */
        private int f27083p;

        /* renamed from: q  reason: collision with root package name */
        private int f27084q;

        /* renamed from: r  reason: collision with root package name */
        private long f27085r;

        /* renamed from: s  reason: collision with root package name */
        private long f27086s;

        /* renamed from: t  reason: collision with root package name */
        private long f27087t;

        /* renamed from: u  reason: collision with root package name */
        private long f27088u;

        private long I() {
            return this.f27088u - this.f27085r;
        }

        private void J() throws e0 {
            if (this.f27075h.hasNext()) {
                X();
                return;
            }
            throw e0.m();
        }

        private void L(byte[] bArr, int i10, int i11) throws IOException {
            if (i11 >= 0 && i11 <= S()) {
                int i12 = i11;
                while (i12 > 0) {
                    if (I() == 0) {
                        J();
                    }
                    int min = Math.min(i12, (int) I());
                    long j10 = (long) min;
                    z1.p(this.f27085r, bArr, (long) ((i11 - i12) + i10), j10);
                    i12 -= min;
                    this.f27085r += j10;
                }
            } else if (i11 > 0) {
                throw e0.m();
            } else if (i11 != 0) {
                throw e0.g();
            }
        }

        private void R() {
            int i10 = this.f27079l + this.f27080m;
            this.f27079l = i10;
            int i11 = i10 - this.f27084q;
            int i12 = this.f27081n;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f27080m = i13;
                this.f27079l = i10 - i13;
                return;
            }
            this.f27080m = 0;
        }

        private int S() {
            return (int) ((((long) (this.f27079l - this.f27083p)) - this.f27085r) + this.f27086s);
        }

        private void V() throws IOException {
            int i10 = 0;
            while (i10 < 10) {
                if (K() < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw e0.f();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:6|7|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
            throw com.google.protobuf.e0.m();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
            r2.position(r0);
            r2.limit(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0023 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.nio.ByteBuffer W(int r4, int r5) throws java.io.IOException {
            /*
                r3 = this;
                java.nio.ByteBuffer r0 = r3.f27076i
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.f27076i
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.f27076i
                r2.position(r4)     // Catch:{ IllegalArgumentException -> 0x0023 }
                r2.limit(r5)     // Catch:{ IllegalArgumentException -> 0x0023 }
                java.nio.ByteBuffer r4 = r3.f27076i     // Catch:{ IllegalArgumentException -> 0x0023 }
                java.nio.ByteBuffer r4 = r4.slice()     // Catch:{ IllegalArgumentException -> 0x0023 }
                r2.position(r0)
                r2.limit(r1)
                return r4
            L_0x0021:
                r4 = move-exception
                goto L_0x0028
            L_0x0023:
                com.google.protobuf.e0 r4 = com.google.protobuf.e0.m()     // Catch:{ all -> 0x0021 }
                throw r4     // Catch:{ all -> 0x0021 }
            L_0x0028:
                r2.position(r0)
                r2.limit(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.c.W(int, int):java.nio.ByteBuffer");
        }

        private void X() {
            ByteBuffer next = this.f27075h.next();
            this.f27076i = next;
            this.f27083p += (int) (this.f27085r - this.f27086s);
            long position = (long) next.position();
            this.f27085r = position;
            this.f27086s = position;
            this.f27088u = (long) this.f27076i.limit();
            long k10 = z1.k(this.f27076i);
            this.f27087t = k10;
            this.f27085r += k10;
            this.f27086s += k10;
            this.f27088u += k10;
        }

        public long A() throws IOException {
            return j.c(P());
        }

        public String B() throws IOException {
            int O = O();
            if (O > 0) {
                long j10 = (long) O;
                long j11 = this.f27088u;
                long j12 = this.f27085r;
                if (j10 <= j11 - j12) {
                    byte[] bArr = new byte[O];
                    z1.p(j12, bArr, 0, j10);
                    String str = new String(bArr, d0.f26986b);
                    this.f27085r += j10;
                    return str;
                }
            }
            if (O > 0 && O <= S()) {
                byte[] bArr2 = new byte[O];
                L(bArr2, 0, O);
                return new String(bArr2, d0.f26986b);
            } else if (O == 0) {
                return MaxReward.DEFAULT_LABEL;
            } else {
                if (O < 0) {
                    throw e0.g();
                }
                throw e0.m();
            }
        }

        public String C() throws IOException {
            int O = O();
            if (O > 0) {
                long j10 = (long) O;
                long j11 = this.f27088u;
                long j12 = this.f27085r;
                if (j10 <= j11 - j12) {
                    String g10 = a2.g(this.f27076i, (int) (j12 - this.f27086s), O);
                    this.f27085r += j10;
                    return g10;
                }
            }
            if (O >= 0 && O <= S()) {
                byte[] bArr = new byte[O];
                L(bArr, 0, O);
                return a2.h(bArr, 0, O);
            } else if (O == 0) {
                return MaxReward.DEFAULT_LABEL;
            } else {
                if (O <= 0) {
                    throw e0.g();
                }
                throw e0.m();
            }
        }

        public int D() throws IOException {
            if (e()) {
                this.f27082o = 0;
                return 0;
            }
            int O = O();
            this.f27082o = O;
            if (b2.a(O) != 0) {
                return this.f27082o;
            }
            throw e0.c();
        }

        public int E() throws IOException {
            return O();
        }

        public long F() throws IOException {
            return P();
        }

        public boolean H(int i10) throws IOException {
            int b10 = b2.b(i10);
            if (b10 == 0) {
                V();
                return true;
            } else if (b10 == 1) {
                U(8);
                return true;
            } else if (b10 == 2) {
                U(O());
                return true;
            } else if (b10 == 3) {
                T();
                a(b2.c(b2.a(i10), 4));
                return true;
            } else if (b10 == 4) {
                return false;
            } else {
                if (b10 == 5) {
                    U(4);
                    return true;
                }
                throw e0.e();
            }
        }

        public byte K() throws IOException {
            if (I() == 0) {
                J();
            }
            long j10 = this.f27085r;
            this.f27085r = 1 + j10;
            return z1.w(j10);
        }

        public int M() throws IOException {
            if (I() < 4) {
                return (K() & 255) | ((K() & 255) << 8) | ((K() & 255) << Ascii.DLE) | ((K() & 255) << Ascii.CAN);
            }
            long j10 = this.f27085r;
            this.f27085r = 4 + j10;
            return ((z1.w(j10 + 3) & 255) << Ascii.CAN) | (z1.w(j10) & 255) | ((z1.w(1 + j10) & 255) << 8) | ((z1.w(2 + j10) & 255) << Ascii.DLE);
        }

        public long N() throws IOException {
            if (I() < 8) {
                return (((long) K()) & 255) | ((((long) K()) & 255) << 8) | ((((long) K()) & 255) << 16) | ((((long) K()) & 255) << 24) | ((((long) K()) & 255) << 32) | ((((long) K()) & 255) << 40) | ((((long) K()) & 255) << 48) | ((((long) K()) & 255) << 56);
            }
            long j10 = this.f27085r;
            this.f27085r = 8 + j10;
            return ((((long) z1.w(j10 + 7)) & 255) << 56) | (((long) z1.w(j10)) & 255) | ((((long) z1.w(1 + j10)) & 255) << 8) | ((((long) z1.w(2 + j10)) & 255) << 16) | ((((long) z1.w(3 + j10)) & 255) << 24) | ((((long) z1.w(4 + j10)) & 255) << 32) | ((((long) z1.w(5 + j10)) & 255) << 40) | ((((long) z1.w(6 + j10)) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
            if (com.google.protobuf.z1.w(r4) < 0) goto L_0x008a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int O() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f27085r
                long r2 = r10.f27088u
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L_0x000a
                goto L_0x008a
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.z1.w(r0)
                if (r0 < 0) goto L_0x001a
                long r4 = r10.f27085r
                long r4 = r4 + r2
                r10.f27085r = r4
                return r0
            L_0x001a:
                long r6 = r10.f27088u
                long r8 = r10.f27085r
                long r6 = r6 - r8
                r8 = 10
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0026
                goto L_0x008a
            L_0x0026:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0034
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0090
            L_0x0034:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0043
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x0041:
                r6 = r4
                goto L_0x0090
            L_0x0043:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0053
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x0090
            L_0x0053:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                if (r1 >= 0) goto L_0x0090
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                if (r1 >= 0) goto L_0x0090
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                if (r1 >= 0) goto L_0x0090
            L_0x008a:
                long r0 = r10.Q()
                int r1 = (int) r0
                return r1
            L_0x0090:
                r10.f27085r = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.c.O():int");
        }

        public long P() throws IOException {
            long j10;
            long j11;
            long j12;
            byte b10;
            long j13 = this.f27085r;
            if (this.f27088u != j13) {
                long j14 = j13 + 1;
                byte w10 = z1.w(j13);
                if (w10 >= 0) {
                    this.f27085r++;
                    return (long) w10;
                } else if (this.f27088u - this.f27085r >= 10) {
                    long j15 = j14 + 1;
                    byte w11 = w10 ^ (z1.w(j14) << 7);
                    if (w11 < 0) {
                        b10 = w11 ^ Byte.MIN_VALUE;
                    } else {
                        long j16 = j15 + 1;
                        byte w12 = w11 ^ (z1.w(j15) << Ascii.SO);
                        if (w12 >= 0) {
                            j10 = (long) (w12 ^ 16256);
                        } else {
                            j15 = j16 + 1;
                            byte w13 = w12 ^ (z1.w(j16) << Ascii.NAK);
                            if (w13 < 0) {
                                b10 = w13 ^ -2080896;
                            } else {
                                j16 = j15 + 1;
                                long w14 = ((long) w13) ^ (((long) z1.w(j15)) << 28);
                                if (w14 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    long j17 = j16 + 1;
                                    long w15 = w14 ^ (((long) z1.w(j16)) << 35);
                                    if (w15 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j16 = j17 + 1;
                                        w14 = w15 ^ (((long) z1.w(j17)) << 42);
                                        if (w14 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j17 = j16 + 1;
                                            w15 = w14 ^ (((long) z1.w(j16)) << 49);
                                            if (w15 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                j16 = j17 + 1;
                                                j10 = (w15 ^ (((long) z1.w(j17)) << 56)) ^ 71499008037633920L;
                                                if (j10 < 0) {
                                                    long j18 = 1 + j16;
                                                    if (((long) z1.w(j16)) >= 0) {
                                                        j15 = j18;
                                                        this.f27085r = j15;
                                                        return j10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j10 = w15 ^ j11;
                                    j15 = j17;
                                    this.f27085r = j15;
                                    return j10;
                                }
                                j10 = w14 ^ j12;
                            }
                        }
                        j15 = j16;
                        this.f27085r = j15;
                        return j10;
                    }
                    j10 = (long) b10;
                    this.f27085r = j15;
                    return j10;
                }
            }
            return Q();
        }

        /* access modifiers changed from: package-private */
        public long Q() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte K = K();
                j10 |= ((long) (K & Ascii.DEL)) << i10;
                if ((K & 128) == 0) {
                    return j10;
                }
            }
            throw e0.f();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void T() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.D()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.H(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.c.T():void");
        }

        public void U(int i10) throws IOException {
            if (i10 >= 0 && ((long) i10) <= (((long) (this.f27079l - this.f27083p)) - this.f27085r) + this.f27086s) {
                while (i10 > 0) {
                    if (I() == 0) {
                        J();
                    }
                    int min = Math.min(i10, (int) I());
                    i10 -= min;
                    this.f27085r += (long) min;
                }
            } else if (i10 < 0) {
                throw e0.g();
            } else {
                throw e0.m();
            }
        }

        public void a(int i10) throws e0 {
            if (this.f27082o != i10) {
                throw e0.b();
            }
        }

        public int d() {
            return (int) ((((long) (this.f27083p - this.f27084q)) + this.f27085r) - this.f27086s);
        }

        public boolean e() throws IOException {
            return (((long) this.f27083p) + this.f27085r) - this.f27086s == ((long) this.f27079l);
        }

        public void m(int i10) {
            this.f27081n = i10;
            R();
        }

        public int n(int i10) throws e0 {
            if (i10 >= 0) {
                int d10 = i10 + d();
                int i11 = this.f27081n;
                if (d10 <= i11) {
                    this.f27081n = d10;
                    R();
                    return i11;
                }
                throw e0.m();
            }
            throw e0.g();
        }

        public boolean o() throws IOException {
            return P() != 0;
        }

        public i p() throws IOException {
            int O = O();
            if (O > 0) {
                long j10 = (long) O;
                long j11 = this.f27088u;
                long j12 = this.f27085r;
                if (j10 <= j11 - j12) {
                    if (!this.f27077j || !this.f27078k) {
                        byte[] bArr = new byte[O];
                        z1.p(j12, bArr, 0, j10);
                        this.f27085r += j10;
                        return i.Q(bArr);
                    }
                    int i10 = (int) (j12 - this.f27087t);
                    i P = i.P(W(i10, O + i10));
                    this.f27085r += j10;
                    return P;
                }
            }
            if (O <= 0 || O > S()) {
                if (O == 0) {
                    return i.f27039b;
                }
                if (O < 0) {
                    throw e0.g();
                }
                throw e0.m();
            } else if (!this.f27077j || !this.f27078k) {
                byte[] bArr2 = new byte[O];
                L(bArr2, 0, O);
                return i.Q(bArr2);
            } else {
                ArrayList arrayList = new ArrayList();
                while (O > 0) {
                    if (I() == 0) {
                        J();
                    }
                    int min = Math.min(O, (int) I());
                    int i11 = (int) (this.f27085r - this.f27087t);
                    arrayList.add(i.P(W(i11, i11 + min)));
                    O -= min;
                    this.f27085r += (long) min;
                }
                return i.n(arrayList);
            }
        }

        public double q() throws IOException {
            return Double.longBitsToDouble(N());
        }

        public int r() throws IOException {
            return O();
        }

        public int s() throws IOException {
            return M();
        }

        public long t() throws IOException {
            return N();
        }

        public float u() throws IOException {
            return Float.intBitsToFloat(M());
        }

        public int v() throws IOException {
            return O();
        }

        public long w() throws IOException {
            return P();
        }

        public int x() throws IOException {
            return M();
        }

        public long y() throws IOException {
            return N();
        }

        public int z() throws IOException {
            return j.b(O());
        }

        private c(Iterable<ByteBuffer> iterable, int i10, boolean z10) {
            super();
            this.f27081n = a.e.API_PRIORITY_OTHER;
            this.f27079l = i10;
            this.f27074g = iterable;
            this.f27075h = iterable.iterator();
            this.f27077j = z10;
            this.f27083p = 0;
            this.f27084q = 0;
            if (i10 == 0) {
                this.f27076i = d0.f26989e;
                this.f27085r = 0;
                this.f27086s = 0;
                this.f27088u = 0;
                this.f27087t = 0;
                return;
            }
            X();
        }
    }

    /* compiled from: CodedInputStream */
    private static final class d extends j {

        /* renamed from: g  reason: collision with root package name */
        private final InputStream f27089g;

        /* renamed from: h  reason: collision with root package name */
        private final byte[] f27090h;

        /* renamed from: i  reason: collision with root package name */
        private int f27091i;

        /* renamed from: j  reason: collision with root package name */
        private int f27092j;

        /* renamed from: k  reason: collision with root package name */
        private int f27093k;

        /* renamed from: l  reason: collision with root package name */
        private int f27094l;

        /* renamed from: m  reason: collision with root package name */
        private int f27095m;

        /* renamed from: n  reason: collision with root package name */
        private int f27096n;

        /* renamed from: o  reason: collision with root package name */
        private a f27097o;

        /* compiled from: CodedInputStream */
        private interface a {
            void a();
        }

        private static int I(InputStream inputStream) throws IOException {
            try {
                return inputStream.available();
            } catch (e0 e10) {
                e10.j();
                throw e10;
            }
        }

        private static int J(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (e0 e10) {
                e10.j();
                throw e10;
            }
        }

        private i K(int i10) throws IOException {
            byte[] N = N(i10);
            if (N != null) {
                return i.o(N);
            }
            int i11 = this.f27093k;
            int i12 = this.f27091i;
            int i13 = i12 - i11;
            this.f27095m += i12;
            this.f27093k = 0;
            this.f27091i = 0;
            List<byte[]> O = O(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f27090h, i11, bArr, 0, i13);
            for (byte[] next : O) {
                System.arraycopy(next, 0, bArr, i13, next.length);
                i13 += next.length;
            }
            return i.Q(bArr);
        }

        private byte[] M(int i10, boolean z10) throws IOException {
            byte[] N = N(i10);
            if (N != null) {
                return z10 ? (byte[]) N.clone() : N;
            }
            int i11 = this.f27093k;
            int i12 = this.f27091i;
            int i13 = i12 - i11;
            this.f27095m += i12;
            this.f27093k = 0;
            this.f27091i = 0;
            List<byte[]> O = O(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f27090h, i11, bArr, 0, i13);
            for (byte[] next : O) {
                System.arraycopy(next, 0, bArr, i13, next.length);
                i13 += next.length;
            }
            return bArr;
        }

        private byte[] N(int i10) throws IOException {
            if (i10 == 0) {
                return d0.f26988d;
            }
            if (i10 >= 0) {
                int i11 = this.f27095m;
                int i12 = this.f27093k;
                int i13 = i11 + i12 + i10;
                if (i13 - this.f27062c <= 0) {
                    int i14 = this.f27096n;
                    if (i13 <= i14) {
                        int i15 = this.f27091i - i12;
                        int i16 = i10 - i15;
                        if (i16 >= 4096 && i16 > I(this.f27089g)) {
                            return null;
                        }
                        byte[] bArr = new byte[i10];
                        System.arraycopy(this.f27090h, this.f27093k, bArr, 0, i15);
                        this.f27095m += this.f27091i;
                        this.f27093k = 0;
                        this.f27091i = 0;
                        while (i15 < i10) {
                            int J = J(this.f27089g, bArr, i15, i10 - i15);
                            if (J != -1) {
                                this.f27095m += J;
                                i15 += J;
                            } else {
                                throw e0.m();
                            }
                        }
                        return bArr;
                    }
                    Y((i14 - i11) - i12);
                    throw e0.m();
                }
                throw e0.l();
            }
            throw e0.g();
        }

        private List<byte[]> O(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f27089g.read(bArr, i11, min - i11);
                    if (read != -1) {
                        this.f27095m += read;
                        i11 += read;
                    } else {
                        throw e0.m();
                    }
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void U() {
            int i10 = this.f27091i + this.f27092j;
            this.f27091i = i10;
            int i11 = this.f27095m + i10;
            int i12 = this.f27096n;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f27092j = i13;
                this.f27091i = i10 - i13;
                return;
            }
            this.f27092j = 0;
        }

        private void V(int i10) throws IOException {
            if (d0(i10)) {
                return;
            }
            if (i10 > (this.f27062c - this.f27095m) - this.f27093k) {
                throw e0.l();
            }
            throw e0.m();
        }

        private static long W(InputStream inputStream, long j10) throws IOException {
            try {
                return inputStream.skip(j10);
            } catch (e0 e10) {
                e10.j();
                throw e10;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
            throw new java.lang.IllegalStateException(r8.f27089g.getClass() + "#skip returned invalid result: " + r0 + "\nThe InputStream implementation is buggy.");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void Z(int r9) throws java.io.IOException {
            /*
                r8 = this;
                if (r9 < 0) goto L_0x0097
                int r0 = r8.f27095m
                int r1 = r8.f27093k
                int r2 = r0 + r1
                int r2 = r2 + r9
                int r3 = r8.f27096n
                if (r2 > r3) goto L_0x008d
                com.google.protobuf.j$d$a r2 = r8.f27097o
                r3 = 0
                if (r2 != 0) goto L_0x006f
                int r0 = r0 + r1
                r8.f27095m = r0
                int r0 = r8.f27091i
                int r0 = r0 - r1
                r8.f27091i = r3
                r8.f27093k = r3
                r3 = r0
            L_0x001d:
                if (r3 >= r9) goto L_0x0067
                int r0 = r9 - r3
                java.io.InputStream r1 = r8.f27089g     // Catch:{ all -> 0x005d }
                long r4 = (long) r0     // Catch:{ all -> 0x005d }
                long r0 = W(r1, r4)     // Catch:{ all -> 0x005d }
                r6 = 0
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 < 0) goto L_0x0038
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x0038
                if (r2 != 0) goto L_0x0035
                goto L_0x0067
            L_0x0035:
                int r1 = (int) r0     // Catch:{ all -> 0x005d }
                int r3 = r3 + r1
                goto L_0x001d
            L_0x0038:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
                r2.<init>()     // Catch:{ all -> 0x005d }
                java.io.InputStream r4 = r8.f27089g     // Catch:{ all -> 0x005d }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x005d }
                r2.append(r4)     // Catch:{ all -> 0x005d }
                java.lang.String r4 = "#skip returned invalid result: "
                r2.append(r4)     // Catch:{ all -> 0x005d }
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = "\nThe InputStream implementation is buggy."
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x005d }
                r9.<init>(r0)     // Catch:{ all -> 0x005d }
                throw r9     // Catch:{ all -> 0x005d }
            L_0x005d:
                r9 = move-exception
                int r0 = r8.f27095m
                int r0 = r0 + r3
                r8.f27095m = r0
                r8.U()
                throw r9
            L_0x0067:
                int r0 = r8.f27095m
                int r0 = r0 + r3
                r8.f27095m = r0
                r8.U()
            L_0x006f:
                if (r3 >= r9) goto L_0x008c
                int r0 = r8.f27091i
                int r1 = r8.f27093k
                int r1 = r0 - r1
                r8.f27093k = r0
                r0 = 1
                r8.V(r0)
            L_0x007d:
                int r2 = r9 - r1
                int r3 = r8.f27091i
                if (r2 <= r3) goto L_0x008a
                int r1 = r1 + r3
                r8.f27093k = r3
                r8.V(r0)
                goto L_0x007d
            L_0x008a:
                r8.f27093k = r2
            L_0x008c:
                return
            L_0x008d:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r8.Y(r3)
                com.google.protobuf.e0 r9 = com.google.protobuf.e0.m()
                throw r9
            L_0x0097:
                com.google.protobuf.e0 r9 = com.google.protobuf.e0.g()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.d.Z(int):void");
        }

        private void a0() throws IOException {
            if (this.f27091i - this.f27093k >= 10) {
                b0();
            } else {
                c0();
            }
        }

        private void b0() throws IOException {
            int i10 = 0;
            while (i10 < 10) {
                byte[] bArr = this.f27090h;
                int i11 = this.f27093k;
                this.f27093k = i11 + 1;
                if (bArr[i11] < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw e0.f();
        }

        private void c0() throws IOException {
            int i10 = 0;
            while (i10 < 10) {
                if (L() < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw e0.f();
        }

        private boolean d0(int i10) throws IOException {
            int i11 = this.f27093k;
            if (i11 + i10 > this.f27091i) {
                int i12 = this.f27062c;
                int i13 = this.f27095m;
                if (i10 > (i12 - i13) - i11 || i13 + i11 + i10 > this.f27096n) {
                    return false;
                }
                a aVar = this.f27097o;
                if (aVar != null) {
                    aVar.a();
                }
                int i14 = this.f27093k;
                if (i14 > 0) {
                    int i15 = this.f27091i;
                    if (i15 > i14) {
                        byte[] bArr = this.f27090h;
                        System.arraycopy(bArr, i14, bArr, 0, i15 - i14);
                    }
                    this.f27095m += i14;
                    this.f27091i -= i14;
                    this.f27093k = 0;
                }
                InputStream inputStream = this.f27089g;
                byte[] bArr2 = this.f27090h;
                int i16 = this.f27091i;
                int J = J(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f27062c - this.f27095m) - i16));
                if (J == 0 || J < -1 || J > this.f27090h.length) {
                    throw new IllegalStateException(this.f27089g.getClass() + "#read(byte[]) returned invalid result: " + J + "\nThe InputStream implementation is buggy.");
                } else if (J <= 0) {
                    return false;
                } else {
                    this.f27091i += J;
                    U();
                    if (this.f27091i >= i10) {
                        return true;
                    }
                    return d0(i10);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
        }

        public long A() throws IOException {
            return j.c(S());
        }

        public String B() throws IOException {
            int R = R();
            if (R > 0) {
                int i10 = this.f27091i;
                int i11 = this.f27093k;
                if (R <= i10 - i11) {
                    String str = new String(this.f27090h, i11, R, d0.f26986b);
                    this.f27093k += R;
                    return str;
                }
            }
            if (R == 0) {
                return MaxReward.DEFAULT_LABEL;
            }
            if (R > this.f27091i) {
                return new String(M(R, false), d0.f26986b);
            }
            V(R);
            String str2 = new String(this.f27090h, this.f27093k, R, d0.f26986b);
            this.f27093k += R;
            return str2;
        }

        public String C() throws IOException {
            byte[] bArr;
            int R = R();
            int i10 = this.f27093k;
            int i11 = this.f27091i;
            if (R <= i11 - i10 && R > 0) {
                bArr = this.f27090h;
                this.f27093k = i10 + R;
            } else if (R == 0) {
                return MaxReward.DEFAULT_LABEL;
            } else {
                if (R <= i11) {
                    V(R);
                    bArr = this.f27090h;
                    this.f27093k = R + 0;
                } else {
                    bArr = M(R, false);
                }
                i10 = 0;
            }
            return a2.h(bArr, i10, R);
        }

        public int D() throws IOException {
            if (e()) {
                this.f27094l = 0;
                return 0;
            }
            int R = R();
            this.f27094l = R;
            if (b2.a(R) != 0) {
                return this.f27094l;
            }
            throw e0.c();
        }

        public int E() throws IOException {
            return R();
        }

        public long F() throws IOException {
            return S();
        }

        public boolean H(int i10) throws IOException {
            int b10 = b2.b(i10);
            if (b10 == 0) {
                a0();
                return true;
            } else if (b10 == 1) {
                Y(8);
                return true;
            } else if (b10 == 2) {
                Y(R());
                return true;
            } else if (b10 == 3) {
                X();
                a(b2.c(b2.a(i10), 4));
                return true;
            } else if (b10 == 4) {
                return false;
            } else {
                if (b10 == 5) {
                    Y(4);
                    return true;
                }
                throw e0.e();
            }
        }

        public byte L() throws IOException {
            if (this.f27093k == this.f27091i) {
                V(1);
            }
            byte[] bArr = this.f27090h;
            int i10 = this.f27093k;
            this.f27093k = i10 + 1;
            return bArr[i10];
        }

        public int P() throws IOException {
            int i10 = this.f27093k;
            if (this.f27091i - i10 < 4) {
                V(4);
                i10 = this.f27093k;
            }
            byte[] bArr = this.f27090h;
            this.f27093k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << Ascii.CAN) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << Ascii.DLE);
        }

        public long Q() throws IOException {
            int i10 = this.f27093k;
            if (this.f27091i - i10 < 8) {
                V(8);
                i10 = this.f27093k;
            }
            byte[] bArr = this.f27090h;
            this.f27093k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int R() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f27093k
                int r1 = r5.f27091i
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f27090h
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f27093k = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.T()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f27093k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.d.R():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long S() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f27093k
                int r1 = r11.f27091i
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f27090h
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f27093k = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.T()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f27093k = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.d.S():long");
        }

        /* access modifiers changed from: package-private */
        public long T() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte L = L();
                j10 |= ((long) (L & Ascii.DEL)) << i10;
                if ((L & 128) == 0) {
                    return j10;
                }
            }
            throw e0.f();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void X() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.D()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.H(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.d.X():void");
        }

        public void Y(int i10) throws IOException {
            int i11 = this.f27091i;
            int i12 = this.f27093k;
            if (i10 > i11 - i12 || i10 < 0) {
                Z(i10);
            } else {
                this.f27093k = i12 + i10;
            }
        }

        public void a(int i10) throws e0 {
            if (this.f27094l != i10) {
                throw e0.b();
            }
        }

        public int d() {
            return this.f27095m + this.f27093k;
        }

        public boolean e() throws IOException {
            return this.f27093k == this.f27091i && !d0(1);
        }

        public void m(int i10) {
            this.f27096n = i10;
            U();
        }

        public int n(int i10) throws e0 {
            if (i10 >= 0) {
                int i11 = i10 + this.f27095m + this.f27093k;
                int i12 = this.f27096n;
                if (i11 <= i12) {
                    this.f27096n = i11;
                    U();
                    return i12;
                }
                throw e0.m();
            }
            throw e0.g();
        }

        public boolean o() throws IOException {
            return S() != 0;
        }

        public i p() throws IOException {
            int R = R();
            int i10 = this.f27091i;
            int i11 = this.f27093k;
            if (R <= i10 - i11 && R > 0) {
                i p10 = i.p(this.f27090h, i11, R);
                this.f27093k += R;
                return p10;
            } else if (R == 0) {
                return i.f27039b;
            } else {
                return K(R);
            }
        }

        public double q() throws IOException {
            return Double.longBitsToDouble(Q());
        }

        public int r() throws IOException {
            return R();
        }

        public int s() throws IOException {
            return P();
        }

        public long t() throws IOException {
            return Q();
        }

        public float u() throws IOException {
            return Float.intBitsToFloat(P());
        }

        public int v() throws IOException {
            return R();
        }

        public long w() throws IOException {
            return S();
        }

        public int x() throws IOException {
            return P();
        }

        public long y() throws IOException {
            return Q();
        }

        public int z() throws IOException {
            return j.b(R());
        }

        private d(InputStream inputStream, int i10) {
            super();
            this.f27096n = a.e.API_PRIORITY_OTHER;
            this.f27097o = null;
            d0.b(inputStream, "input");
            this.f27089g = inputStream;
            this.f27090h = new byte[i10];
            this.f27091i = 0;
            this.f27093k = 0;
            this.f27095m = 0;
        }
    }

    /* compiled from: CodedInputStream */
    private static final class e extends j {

        /* renamed from: g  reason: collision with root package name */
        private final ByteBuffer f27098g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f27099h;

        /* renamed from: i  reason: collision with root package name */
        private final long f27100i;

        /* renamed from: j  reason: collision with root package name */
        private long f27101j;

        /* renamed from: k  reason: collision with root package name */
        private long f27102k;

        /* renamed from: l  reason: collision with root package name */
        private long f27103l;

        /* renamed from: m  reason: collision with root package name */
        private int f27104m;

        /* renamed from: n  reason: collision with root package name */
        private int f27105n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f27106o;

        /* renamed from: p  reason: collision with root package name */
        private int f27107p;

        private int I(long j10) {
            return (int) (j10 - this.f27100i);
        }

        static boolean J() {
            return z1.J();
        }

        private void Q() {
            long j10 = this.f27101j + ((long) this.f27104m);
            this.f27101j = j10;
            int i10 = (int) (j10 - this.f27103l);
            int i11 = this.f27107p;
            if (i10 > i11) {
                int i12 = i10 - i11;
                this.f27104m = i12;
                this.f27101j = j10 - ((long) i12);
                return;
            }
            this.f27104m = 0;
        }

        private int R() {
            return (int) (this.f27101j - this.f27102k);
        }

        private void U() throws IOException {
            if (R() >= 10) {
                V();
            } else {
                W();
            }
        }

        private void V() throws IOException {
            int i10 = 0;
            while (i10 < 10) {
                long j10 = this.f27102k;
                this.f27102k = 1 + j10;
                if (z1.w(j10) < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw e0.f();
        }

        private void W() throws IOException {
            int i10 = 0;
            while (i10 < 10) {
                if (K() < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw e0.f();
        }

        private ByteBuffer X(long j10, long j11) throws IOException {
            int position = this.f27098g.position();
            int limit = this.f27098g.limit();
            ByteBuffer byteBuffer = this.f27098g;
            try {
                byteBuffer.position(I(j10));
                byteBuffer.limit(I(j11));
                ByteBuffer slice = this.f27098g.slice();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
                return slice;
            } catch (IllegalArgumentException e10) {
                e0 m10 = e0.m();
                m10.initCause(e10);
                throw m10;
            } catch (Throwable th) {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
                throw th;
            }
        }

        public long A() throws IOException {
            return j.c(O());
        }

        public String B() throws IOException {
            int N = N();
            if (N > 0 && N <= R()) {
                byte[] bArr = new byte[N];
                long j10 = (long) N;
                z1.p(this.f27102k, bArr, 0, j10);
                String str = new String(bArr, d0.f26986b);
                this.f27102k += j10;
                return str;
            } else if (N == 0) {
                return MaxReward.DEFAULT_LABEL;
            } else {
                if (N < 0) {
                    throw e0.g();
                }
                throw e0.m();
            }
        }

        public String C() throws IOException {
            int N = N();
            if (N > 0 && N <= R()) {
                String g10 = a2.g(this.f27098g, I(this.f27102k), N);
                this.f27102k += (long) N;
                return g10;
            } else if (N == 0) {
                return MaxReward.DEFAULT_LABEL;
            } else {
                if (N <= 0) {
                    throw e0.g();
                }
                throw e0.m();
            }
        }

        public int D() throws IOException {
            if (e()) {
                this.f27105n = 0;
                return 0;
            }
            int N = N();
            this.f27105n = N;
            if (b2.a(N) != 0) {
                return this.f27105n;
            }
            throw e0.c();
        }

        public int E() throws IOException {
            return N();
        }

        public long F() throws IOException {
            return O();
        }

        public boolean H(int i10) throws IOException {
            int b10 = b2.b(i10);
            if (b10 == 0) {
                U();
                return true;
            } else if (b10 == 1) {
                T(8);
                return true;
            } else if (b10 == 2) {
                T(N());
                return true;
            } else if (b10 == 3) {
                S();
                a(b2.c(b2.a(i10), 4));
                return true;
            } else if (b10 == 4) {
                return false;
            } else {
                if (b10 == 5) {
                    T(4);
                    return true;
                }
                throw e0.e();
            }
        }

        public byte K() throws IOException {
            long j10 = this.f27102k;
            if (j10 != this.f27101j) {
                this.f27102k = 1 + j10;
                return z1.w(j10);
            }
            throw e0.m();
        }

        public int L() throws IOException {
            long j10 = this.f27102k;
            if (this.f27101j - j10 >= 4) {
                this.f27102k = 4 + j10;
                return ((z1.w(j10 + 3) & 255) << Ascii.CAN) | (z1.w(j10) & 255) | ((z1.w(1 + j10) & 255) << 8) | ((z1.w(2 + j10) & 255) << Ascii.DLE);
            }
            throw e0.m();
        }

        public long M() throws IOException {
            long j10 = this.f27102k;
            if (this.f27101j - j10 >= 8) {
                this.f27102k = 8 + j10;
                return ((((long) z1.w(j10 + 7)) & 255) << 56) | (((long) z1.w(j10)) & 255) | ((((long) z1.w(1 + j10)) & 255) << 8) | ((((long) z1.w(2 + j10)) & 255) << 16) | ((((long) z1.w(3 + j10)) & 255) << 24) | ((((long) z1.w(4 + j10)) & 255) << 32) | ((((long) z1.w(5 + j10)) & 255) << 40) | ((((long) z1.w(6 + j10)) & 255) << 48);
            }
            throw e0.m();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
            if (com.google.protobuf.z1.w(r4) < 0) goto L_0x0085;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int N() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f27102k
                long r2 = r10.f27101j
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L_0x000a
                goto L_0x0085
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.z1.w(r0)
                if (r0 < 0) goto L_0x0017
                r10.f27102k = r4
                return r0
            L_0x0017:
                long r6 = r10.f27101j
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0021
                goto L_0x0085
            L_0x0021:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x002f
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008b
            L_0x002f:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003c:
                r6 = r4
                goto L_0x008b
            L_0x003e:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x004e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008b
            L_0x004e:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                if (r1 >= 0) goto L_0x008b
            L_0x0085:
                long r0 = r10.P()
                int r1 = (int) r0
                return r1
            L_0x008b:
                r10.f27102k = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.e.N():int");
        }

        public long O() throws IOException {
            long j10;
            long j11;
            long j12;
            byte b10;
            long j13 = this.f27102k;
            if (this.f27101j != j13) {
                long j14 = j13 + 1;
                byte w10 = z1.w(j13);
                if (w10 >= 0) {
                    this.f27102k = j14;
                    return (long) w10;
                } else if (this.f27101j - j14 >= 9) {
                    long j15 = j14 + 1;
                    byte w11 = w10 ^ (z1.w(j14) << 7);
                    if (w11 < 0) {
                        b10 = w11 ^ Byte.MIN_VALUE;
                    } else {
                        long j16 = j15 + 1;
                        byte w12 = w11 ^ (z1.w(j15) << Ascii.SO);
                        if (w12 >= 0) {
                            j10 = (long) (w12 ^ 16256);
                        } else {
                            j15 = j16 + 1;
                            byte w13 = w12 ^ (z1.w(j16) << Ascii.NAK);
                            if (w13 < 0) {
                                b10 = w13 ^ -2080896;
                            } else {
                                j16 = j15 + 1;
                                long w14 = ((long) w13) ^ (((long) z1.w(j15)) << 28);
                                if (w14 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    long j17 = j16 + 1;
                                    long w15 = w14 ^ (((long) z1.w(j16)) << 35);
                                    if (w15 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j16 = j17 + 1;
                                        w14 = w15 ^ (((long) z1.w(j17)) << 42);
                                        if (w14 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j17 = j16 + 1;
                                            w15 = w14 ^ (((long) z1.w(j16)) << 49);
                                            if (w15 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                j16 = j17 + 1;
                                                j10 = (w15 ^ (((long) z1.w(j17)) << 56)) ^ 71499008037633920L;
                                                if (j10 < 0) {
                                                    long j18 = 1 + j16;
                                                    if (((long) z1.w(j16)) >= 0) {
                                                        j15 = j18;
                                                        this.f27102k = j15;
                                                        return j10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j10 = w15 ^ j11;
                                    j15 = j17;
                                    this.f27102k = j15;
                                    return j10;
                                }
                                j10 = w14 ^ j12;
                            }
                        }
                        j15 = j16;
                        this.f27102k = j15;
                        return j10;
                    }
                    j10 = (long) b10;
                    this.f27102k = j15;
                    return j10;
                }
            }
            return P();
        }

        /* access modifiers changed from: package-private */
        public long P() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte K = K();
                j10 |= ((long) (K & Ascii.DEL)) << i10;
                if ((K & 128) == 0) {
                    return j10;
                }
            }
            throw e0.f();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void S() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.D()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.H(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.e.S():void");
        }

        public void T(int i10) throws IOException {
            if (i10 >= 0 && i10 <= R()) {
                this.f27102k += (long) i10;
            } else if (i10 < 0) {
                throw e0.g();
            } else {
                throw e0.m();
            }
        }

        public void a(int i10) throws e0 {
            if (this.f27105n != i10) {
                throw e0.b();
            }
        }

        public int d() {
            return (int) (this.f27102k - this.f27103l);
        }

        public boolean e() throws IOException {
            return this.f27102k == this.f27101j;
        }

        public void m(int i10) {
            this.f27107p = i10;
            Q();
        }

        public int n(int i10) throws e0 {
            if (i10 >= 0) {
                int d10 = i10 + d();
                int i11 = this.f27107p;
                if (d10 <= i11) {
                    this.f27107p = d10;
                    Q();
                    return i11;
                }
                throw e0.m();
            }
            throw e0.g();
        }

        public boolean o() throws IOException {
            return O() != 0;
        }

        public i p() throws IOException {
            int N = N();
            if (N <= 0 || N > R()) {
                if (N == 0) {
                    return i.f27039b;
                }
                if (N < 0) {
                    throw e0.g();
                }
                throw e0.m();
            } else if (!this.f27099h || !this.f27106o) {
                byte[] bArr = new byte[N];
                long j10 = (long) N;
                z1.p(this.f27102k, bArr, 0, j10);
                this.f27102k += j10;
                return i.Q(bArr);
            } else {
                long j11 = this.f27102k;
                long j12 = (long) N;
                ByteBuffer X = X(j11, j11 + j12);
                this.f27102k += j12;
                return i.P(X);
            }
        }

        public double q() throws IOException {
            return Double.longBitsToDouble(M());
        }

        public int r() throws IOException {
            return N();
        }

        public int s() throws IOException {
            return L();
        }

        public long t() throws IOException {
            return M();
        }

        public float u() throws IOException {
            return Float.intBitsToFloat(L());
        }

        public int v() throws IOException {
            return N();
        }

        public long w() throws IOException {
            return O();
        }

        public int x() throws IOException {
            return L();
        }

        public long y() throws IOException {
            return M();
        }

        public int z() throws IOException {
            return j.b(N());
        }

        private e(ByteBuffer byteBuffer, boolean z10) {
            super();
            this.f27107p = a.e.API_PRIORITY_OTHER;
            this.f27098g = byteBuffer;
            long k10 = z1.k(byteBuffer);
            this.f27100i = k10;
            this.f27101j = ((long) byteBuffer.limit()) + k10;
            long position = k10 + ((long) byteBuffer.position());
            this.f27102k = position;
            this.f27103l = position;
            this.f27099h = z10;
        }
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static j f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static j g(InputStream inputStream, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        } else if (inputStream == null) {
            return j(d0.f26988d);
        } else {
            return new d(inputStream, i10);
        }
    }

    static j h(Iterable<ByteBuffer> iterable, boolean z10) {
        boolean z11 = false;
        int i10 = 0;
        for (ByteBuffer next : iterable) {
            i10 += next.remaining();
            if (next.hasArray()) {
                z11 |= true;
            } else {
                z11 = next.isDirect() ? z11 | true : z11 | true;
            }
        }
        if (z11) {
            return new c(iterable, i10, z10);
        }
        return f(new f0(iterable));
    }

    static j i(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return l(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z10);
        }
        if (byteBuffer.isDirect() && e.J()) {
            return new e(byteBuffer, z10);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return l(bArr, 0, remaining, true);
    }

    public static j j(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    public static j k(byte[] bArr, int i10, int i11) {
        return l(bArr, i10, i11, false);
    }

    static j l(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.n(i11);
            return bVar;
        } catch (e0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract long A() throws IOException;

    public abstract String B() throws IOException;

    public abstract String C() throws IOException;

    public abstract int D() throws IOException;

    public abstract int E() throws IOException;

    public abstract long F() throws IOException;

    public final int G(int i10) {
        if (i10 >= 0) {
            int i11 = this.f27062c;
            this.f27062c = i10;
            return i11;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i10);
    }

    public abstract boolean H(int i10) throws IOException;

    public abstract void a(int i10) throws e0;

    public abstract int d();

    public abstract boolean e() throws IOException;

    public abstract void m(int i10);

    public abstract int n(int i10) throws e0;

    public abstract boolean o() throws IOException;

    public abstract i p() throws IOException;

    public abstract double q() throws IOException;

    public abstract int r() throws IOException;

    public abstract int s() throws IOException;

    public abstract long t() throws IOException;

    public abstract float u() throws IOException;

    public abstract int v() throws IOException;

    public abstract long w() throws IOException;

    public abstract int x() throws IOException;

    public abstract long y() throws IOException;

    public abstract int z() throws IOException;

    private j() {
        this.f27061b = f27059f;
        this.f27062c = a.e.API_PRIORITY_OTHER;
        this.f27064e = false;
    }
}
