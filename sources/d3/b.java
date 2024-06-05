package d3;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import k4.a0;
import k4.n0;
import n2.r1;
import n2.y2;
import p2.o0;
import s2.e0;
import s2.l;
import s2.m;
import s2.n;
import s2.r;

/* compiled from: WavExtractor */
public final class b implements l {

    /* renamed from: h  reason: collision with root package name */
    public static final r f17659h = a.f32088b;

    /* renamed from: a  reason: collision with root package name */
    private n f17660a;

    /* renamed from: b  reason: collision with root package name */
    private e0 f17661b;

    /* renamed from: c  reason: collision with root package name */
    private int f17662c = 0;

    /* renamed from: d  reason: collision with root package name */
    private long f17663d = -1;

    /* renamed from: e  reason: collision with root package name */
    private C0178b f17664e;

    /* renamed from: f  reason: collision with root package name */
    private int f17665f = -1;

    /* renamed from: g  reason: collision with root package name */
    private long f17666g = -1;

    /* compiled from: WavExtractor */
    private static final class a implements C0178b {

        /* renamed from: m  reason: collision with root package name */
        private static final int[] f17667m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n  reason: collision with root package name */
        private static final int[] f17668n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a  reason: collision with root package name */
        private final n f17669a;

        /* renamed from: b  reason: collision with root package name */
        private final e0 f17670b;

        /* renamed from: c  reason: collision with root package name */
        private final c f17671c;

        /* renamed from: d  reason: collision with root package name */
        private final int f17672d;

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f17673e;

        /* renamed from: f  reason: collision with root package name */
        private final a0 f17674f;

        /* renamed from: g  reason: collision with root package name */
        private final int f17675g;

        /* renamed from: h  reason: collision with root package name */
        private final r1 f17676h;

        /* renamed from: i  reason: collision with root package name */
        private int f17677i;

        /* renamed from: j  reason: collision with root package name */
        private long f17678j;

        /* renamed from: k  reason: collision with root package name */
        private int f17679k;

        /* renamed from: l  reason: collision with root package name */
        private long f17680l;

        public a(n nVar, e0 e0Var, c cVar) throws y2 {
            this.f17669a = nVar;
            this.f17670b = e0Var;
            this.f17671c = cVar;
            int max = Math.max(1, cVar.f17691c / 10);
            this.f17675g = max;
            a0 a0Var = new a0(cVar.f17695g);
            a0Var.y();
            int y10 = a0Var.y();
            this.f17672d = y10;
            int i10 = cVar.f17690b;
            int i11 = (((cVar.f17693e - (i10 * 4)) * 8) / (cVar.f17694f * i10)) + 1;
            if (y10 == i11) {
                int l10 = n0.l(max, y10);
                this.f17673e = new byte[(cVar.f17693e * l10)];
                this.f17674f = new a0(l10 * h(y10, i10));
                int i12 = ((cVar.f17691c * cVar.f17693e) * 8) / y10;
                this.f17676h = new r1.b().g0("audio/raw").I(i12).b0(i12).Y(h(max, i10)).J(cVar.f17690b).h0(cVar.f17691c).a0(2).G();
                return;
            }
            throw y2.a("Expected frames per block: " + i11 + "; got: " + y10, (Throwable) null);
        }

        private void d(byte[] bArr, int i10, a0 a0Var) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f17671c.f17690b; i12++) {
                    e(bArr, i11, i12, a0Var.e());
                }
            }
            int g10 = g(this.f17672d * i10);
            a0Var.T(0);
            a0Var.S(g10);
        }

        private void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            c cVar = this.f17671c;
            int i12 = cVar.f17693e;
            int i13 = cVar.f17690b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int i17 = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int min = Math.min(bArr[i14 + 2] & 255, 88);
            int i18 = f17668n[min];
            int i19 = ((i10 * this.f17672d * i13) + i11) * 2;
            bArr2[i19] = (byte) (i17 & 255);
            bArr2[i19 + 1] = (byte) (i17 >> 8);
            for (int i20 = 0; i20 < i16 * 2; i20++) {
                byte b10 = bArr[((i20 / 8) * i13 * 4) + i15 + ((i20 / 2) % 4)] & 255;
                int i21 = i20 % 2 == 0 ? b10 & Ascii.SI : b10 >> 4;
                int i22 = ((((i21 & 7) * 2) + 1) * i18) >> 3;
                if ((i21 & 8) != 0) {
                    i22 = -i22;
                }
                i17 = n0.q(i17 + i22, -32768, 32767);
                i19 += i13 * 2;
                bArr2[i19] = (byte) (i17 & 255);
                bArr2[i19 + 1] = (byte) (i17 >> 8);
                int i23 = min + f17667m[i21];
                int[] iArr = f17668n;
                min = n0.q(i23, 0, iArr.length - 1);
                i18 = iArr[min];
            }
        }

        private int f(int i10) {
            return i10 / (this.f17671c.f17690b * 2);
        }

        private int g(int i10) {
            return h(i10, this.f17671c.f17690b);
        }

        private static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void i(int i10) {
            long O0 = this.f17678j + n0.O0(this.f17680l, 1000000, (long) this.f17671c.f17691c);
            int g10 = g(i10);
            this.f17670b.b(O0, 1, g10, this.f17679k - g10, (e0.a) null);
            this.f17680l += (long) i10;
            this.f17679k -= g10;
        }

        public void a(long j10) {
            this.f17677i = 0;
            this.f17678j = j10;
            this.f17679k = 0;
            this.f17680l = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x003f A[EDGE_INSN: B:22:0x003f->B:10:0x003f ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean b(s2.m r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f17675g
                int r1 = r6.f17679k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f17672d
                int r0 = k4.n0.l(r0, r1)
                d3.c r1 = r6.f17671c
                int r1 = r1.f17693e
                int r0 = r0 * r1
                r1 = 1
                r2 = 0
                int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x001e
            L_0x001c:
                r2 = 1
                goto L_0x001f
            L_0x001e:
                r2 = 0
            L_0x001f:
                if (r2 != 0) goto L_0x003f
                int r3 = r6.f17677i
                if (r3 >= r0) goto L_0x003f
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r4 = (int) r3
                byte[] r3 = r6.f17673e
                int r5 = r6.f17677i
                int r3 = r7.read(r3, r5, r4)
                r4 = -1
                if (r3 != r4) goto L_0x0039
                goto L_0x001c
            L_0x0039:
                int r4 = r6.f17677i
                int r4 = r4 + r3
                r6.f17677i = r4
                goto L_0x001f
            L_0x003f:
                int r7 = r6.f17677i
                d3.c r8 = r6.f17671c
                int r8 = r8.f17693e
                int r7 = r7 / r8
                if (r7 <= 0) goto L_0x0077
                byte[] r8 = r6.f17673e
                k4.a0 r9 = r6.f17674f
                r6.d(r8, r7, r9)
                int r8 = r6.f17677i
                d3.c r9 = r6.f17671c
                int r9 = r9.f17693e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f17677i = r8
                k4.a0 r7 = r6.f17674f
                int r7 = r7.g()
                s2.e0 r8 = r6.f17670b
                k4.a0 r9 = r6.f17674f
                r8.d(r9, r7)
                int r8 = r6.f17679k
                int r8 = r8 + r7
                r6.f17679k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f17675g
                if (r7 < r8) goto L_0x0077
                r6.i(r8)
            L_0x0077:
                if (r2 == 0) goto L_0x0084
                int r7 = r6.f17679k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L_0x0084
                r6.i(r7)
            L_0x0084:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: d3.b.a.b(s2.m, long):boolean");
        }

        public void c(int i10, long j10) {
            this.f17669a.j(new e(this.f17671c, this.f17672d, (long) i10, j10));
            this.f17670b.a(this.f17676h);
        }
    }

    /* renamed from: d3.b$b  reason: collision with other inner class name */
    /* compiled from: WavExtractor */
    private interface C0178b {
        void a(long j10);

        boolean b(m mVar, long j10) throws IOException;

        void c(int i10, long j10) throws y2;
    }

    /* compiled from: WavExtractor */
    private static final class c implements C0178b {

        /* renamed from: a  reason: collision with root package name */
        private final n f17681a;

        /* renamed from: b  reason: collision with root package name */
        private final e0 f17682b;

        /* renamed from: c  reason: collision with root package name */
        private final c f17683c;

        /* renamed from: d  reason: collision with root package name */
        private final r1 f17684d;

        /* renamed from: e  reason: collision with root package name */
        private final int f17685e;

        /* renamed from: f  reason: collision with root package name */
        private long f17686f;

        /* renamed from: g  reason: collision with root package name */
        private int f17687g;

        /* renamed from: h  reason: collision with root package name */
        private long f17688h;

        public c(n nVar, e0 e0Var, c cVar, String str, int i10) throws y2 {
            this.f17681a = nVar;
            this.f17682b = e0Var;
            this.f17683c = cVar;
            int i11 = (cVar.f17690b * cVar.f17694f) / 8;
            if (cVar.f17693e == i11) {
                int i12 = cVar.f17691c;
                int i13 = i12 * i11 * 8;
                int max = Math.max(i11, (i12 * i11) / 10);
                this.f17685e = max;
                this.f17684d = new r1.b().g0(str).I(i13).b0(i13).Y(max).J(cVar.f17690b).h0(cVar.f17691c).a0(i10).G();
                return;
            }
            throw y2.a("Expected block size: " + i11 + "; got: " + cVar.f17693e, (Throwable) null);
        }

        public void a(long j10) {
            this.f17686f = j10;
            this.f17687g = 0;
            this.f17688h = 0;
        }

        public boolean b(m mVar, long j10) throws IOException {
            int i10;
            int i11;
            int i12;
            long j11 = j10;
            while (true) {
                i10 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
                if (i10 <= 0 || (i11 = this.f17687g) >= (i12 = this.f17685e)) {
                    c cVar = this.f17683c;
                    int i13 = cVar.f17693e;
                    int i14 = this.f17687g / i13;
                } else {
                    int e10 = this.f17682b.e(mVar, (int) Math.min((long) (i12 - i11), j11), true);
                    if (e10 == -1) {
                        j11 = 0;
                    } else {
                        this.f17687g += e10;
                        j11 -= (long) e10;
                    }
                }
            }
            c cVar2 = this.f17683c;
            int i132 = cVar2.f17693e;
            int i142 = this.f17687g / i132;
            if (i142 > 0) {
                int i15 = i142 * i132;
                int i16 = this.f17687g - i15;
                this.f17682b.b(this.f17686f + n0.O0(this.f17688h, 1000000, (long) cVar2.f17691c), 1, i15, i16, (e0.a) null);
                this.f17688h += (long) i142;
                this.f17687g = i16;
            }
            if (i10 <= 0) {
                return true;
            }
            return false;
        }

        public void c(int i10, long j10) {
            this.f17681a.j(new e(this.f17683c, 1, (long) i10, j10));
            this.f17682b.a(this.f17684d);
        }
    }

    private void d() {
        k4.a.h(this.f17661b);
        n0.j(this.f17660a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ l[] f() {
        return new l[]{new b()};
    }

    private void h(m mVar) throws IOException {
        k4.a.f(mVar.c() == 0);
        int i10 = this.f17665f;
        if (i10 != -1) {
            mVar.m(i10);
            this.f17662c = 4;
        } else if (d.a(mVar)) {
            mVar.m((int) (mVar.h() - mVar.c()));
            this.f17662c = 1;
        } else {
            throw y2.a("Unsupported or unrecognized wav file type.", (Throwable) null);
        }
    }

    private void i(m mVar) throws IOException {
        c b10 = d.b(mVar);
        int i10 = b10.f17689a;
        if (i10 == 17) {
            this.f17664e = new a(this.f17660a, this.f17661b, b10);
        } else if (i10 == 6) {
            this.f17664e = new c(this.f17660a, this.f17661b, b10, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            this.f17664e = new c(this.f17660a, this.f17661b, b10, "audio/g711-mlaw", -1);
        } else {
            int a10 = o0.a(i10, b10.f17694f);
            if (a10 != 0) {
                this.f17664e = new c(this.f17660a, this.f17661b, b10, "audio/raw", a10);
            } else {
                throw y2.d("Unsupported WAV format type: " + b10.f17689a);
            }
        }
        this.f17662c = 3;
    }

    private void j(m mVar) throws IOException {
        this.f17663d = d.c(mVar);
        this.f17662c = 2;
    }

    private int k(m mVar) throws IOException {
        k4.a.f(this.f17666g != -1);
        if (((C0178b) k4.a.e(this.f17664e)).b(mVar, this.f17666g - mVar.c())) {
            return -1;
        }
        return 0;
    }

    private void l(m mVar) throws IOException {
        Pair<Long, Long> e10 = d.e(mVar);
        this.f17665f = ((Long) e10.first).intValue();
        long longValue = ((Long) e10.second).longValue();
        long j10 = this.f17663d;
        if (j10 != -1 && longValue == 4294967295L) {
            longValue = j10;
        }
        this.f17666g = ((long) this.f17665f) + longValue;
        long b10 = mVar.b();
        if (b10 != -1 && this.f17666g > b10) {
            k4.r.i("WavExtractor", "Data exceeds input length: " + this.f17666g + ", " + b10);
            this.f17666g = b10;
        }
        ((C0178b) k4.a.e(this.f17664e)).c(this.f17665f, this.f17666g);
        this.f17662c = 4;
    }

    public void b(n nVar) {
        this.f17660a = nVar;
        this.f17661b = nVar.e(0, 1);
        nVar.q();
    }

    public void c(long j10, long j11) {
        this.f17662c = j10 == 0 ? 0 : 4;
        C0178b bVar = this.f17664e;
        if (bVar != null) {
            bVar.a(j11);
        }
    }

    public boolean e(m mVar) throws IOException {
        return d.a(mVar);
    }

    public int g(m mVar, s2.a0 a0Var) throws IOException {
        d();
        int i10 = this.f17662c;
        if (i10 == 0) {
            h(mVar);
            return 0;
        } else if (i10 == 1) {
            j(mVar);
            return 0;
        } else if (i10 == 2) {
            i(mVar);
            return 0;
        } else if (i10 == 3) {
            l(mVar);
            return 0;
        } else if (i10 == 4) {
            return k(mVar);
        } else {
            throw new IllegalStateException();
        }
    }

    public void release() {
    }
}
