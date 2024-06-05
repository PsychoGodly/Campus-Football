package c3;

import c3.i0;
import java.util.Arrays;
import java.util.Collections;
import k4.a0;
import k4.n0;
import k4.r;
import k4.w;
import k4.z;
import n2.r1;
import s2.e0;
import s2.n;

/* compiled from: H263Reader */
public final class o implements m {

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f5807l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final k0 f5808a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f5809b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean[] f5810c = new boolean[4];

    /* renamed from: d  reason: collision with root package name */
    private final a f5811d = new a(128);

    /* renamed from: e  reason: collision with root package name */
    private final u f5812e;

    /* renamed from: f  reason: collision with root package name */
    private b f5813f;

    /* renamed from: g  reason: collision with root package name */
    private long f5814g;

    /* renamed from: h  reason: collision with root package name */
    private String f5815h;

    /* renamed from: i  reason: collision with root package name */
    private e0 f5816i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5817j;

    /* renamed from: k  reason: collision with root package name */
    private long f5818k = -9223372036854775807L;

    /* compiled from: H263Reader */
    private static final class a {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f5819f = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f5820a;

        /* renamed from: b  reason: collision with root package name */
        private int f5821b;

        /* renamed from: c  reason: collision with root package name */
        public int f5822c;

        /* renamed from: d  reason: collision with root package name */
        public int f5823d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f5824e;

        public a(int i10) {
            this.f5824e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f5820a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f5824e;
                int length = bArr2.length;
                int i13 = this.f5822c;
                if (length < i13 + i12) {
                    this.f5824e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f5824e, this.f5822c, i12);
                this.f5822c += i12;
            }
        }

        public boolean b(int i10, int i11) {
            int i12 = this.f5821b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            } else if (i10 == 179 || i10 == 181) {
                                this.f5822c -= i11;
                                this.f5820a = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            r.i("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f5823d = this.f5822c;
                            this.f5821b = 4;
                        }
                    } else if (i10 > 31) {
                        r.i("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f5821b = 3;
                    }
                } else if (i10 != 181) {
                    r.i("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f5821b = 2;
                }
            } else if (i10 == 176) {
                this.f5821b = 1;
                this.f5820a = true;
            }
            byte[] bArr = f5819f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f5820a = false;
            this.f5822c = 0;
            this.f5821b = 0;
        }
    }

    /* compiled from: H263Reader */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final e0 f5825a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f5826b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5827c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f5828d;

        /* renamed from: e  reason: collision with root package name */
        private int f5829e;

        /* renamed from: f  reason: collision with root package name */
        private int f5830f;

        /* renamed from: g  reason: collision with root package name */
        private long f5831g;

        /* renamed from: h  reason: collision with root package name */
        private long f5832h;

        public b(e0 e0Var) {
            this.f5825a = e0Var;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f5827c) {
                int i12 = this.f5830f;
                int i13 = (i10 + 1) - i12;
                if (i13 < i11) {
                    this.f5828d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f5827c = false;
                    return;
                }
                this.f5830f = i12 + (i11 - i10);
            }
        }

        public void b(long j10, int i10, boolean z10) {
            if (this.f5829e == 182 && z10 && this.f5826b) {
                long j11 = this.f5832h;
                if (j11 != -9223372036854775807L) {
                    int i11 = (int) (j10 - this.f5831g);
                    this.f5825a.b(j11, this.f5828d ? 1 : 0, i11, i10, (e0.a) null);
                }
            }
            if (this.f5829e != 179) {
                this.f5831g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f5829e = i10;
            this.f5828d = false;
            boolean z10 = true;
            this.f5826b = i10 == 182 || i10 == 179;
            if (i10 != 182) {
                z10 = false;
            }
            this.f5827c = z10;
            this.f5830f = 0;
            this.f5832h = j10;
        }

        public void d() {
            this.f5826b = false;
            this.f5827c = false;
            this.f5828d = false;
            this.f5829e = -1;
        }
    }

    o(k0 k0Var) {
        this.f5808a = k0Var;
        if (k0Var != null) {
            this.f5812e = new u(178, 128);
            this.f5809b = new a0();
            return;
        }
        this.f5812e = null;
        this.f5809b = null;
    }

    private static r1 a(a aVar, int i10, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f5824e, aVar.f5822c);
        z zVar = new z(copyOf);
        zVar.s(i10);
        zVar.s(4);
        zVar.q();
        zVar.r(8);
        if (zVar.g()) {
            zVar.r(4);
            zVar.r(3);
        }
        int h10 = zVar.h(4);
        float f10 = 1.0f;
        if (h10 == 15) {
            int h11 = zVar.h(8);
            int h12 = zVar.h(8);
            if (h12 == 0) {
                r.i("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = ((float) h11) / ((float) h12);
            }
        } else {
            float[] fArr = f5807l;
            if (h10 < fArr.length) {
                f10 = fArr[h10];
            } else {
                r.i("H263Reader", "Invalid aspect ratio");
            }
        }
        if (zVar.g()) {
            zVar.r(2);
            zVar.r(1);
            if (zVar.g()) {
                zVar.r(15);
                zVar.q();
                zVar.r(15);
                zVar.q();
                zVar.r(15);
                zVar.q();
                zVar.r(3);
                zVar.r(11);
                zVar.q();
                zVar.r(15);
                zVar.q();
            }
        }
        if (zVar.h(2) != 0) {
            r.i("H263Reader", "Unhandled video object layer shape");
        }
        zVar.q();
        int h13 = zVar.h(16);
        zVar.q();
        if (zVar.g()) {
            if (h13 == 0) {
                r.i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = h13 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                zVar.r(i11);
            }
        }
        zVar.q();
        int h14 = zVar.h(13);
        zVar.q();
        int h15 = zVar.h(13);
        zVar.q();
        zVar.q();
        return new r1.b().U(str).g0("video/mp4v-es").n0(h14).S(h15).c0(f10).V(Collections.singletonList(copyOf)).G();
    }

    public void b() {
        w.a(this.f5810c);
        this.f5811d.c();
        b bVar = this.f5813f;
        if (bVar != null) {
            bVar.d();
        }
        u uVar = this.f5812e;
        if (uVar != null) {
            uVar.d();
        }
        this.f5814g = 0;
        this.f5818k = -9223372036854775807L;
    }

    public void c(a0 a0Var) {
        k4.a.h(this.f5813f);
        k4.a.h(this.f5816i);
        int f10 = a0Var.f();
        int g10 = a0Var.g();
        byte[] e10 = a0Var.e();
        this.f5814g += (long) a0Var.a();
        this.f5816i.d(a0Var, a0Var.a());
        while (true) {
            int c10 = w.c(e10, f10, g10, this.f5810c);
            if (c10 == g10) {
                break;
            }
            int i10 = c10 + 3;
            byte b10 = a0Var.e()[i10] & 255;
            int i11 = c10 - f10;
            int i12 = 0;
            if (!this.f5817j) {
                if (i11 > 0) {
                    this.f5811d.a(e10, f10, c10);
                }
                if (this.f5811d.b(b10, i11 < 0 ? -i11 : 0)) {
                    e0 e0Var = this.f5816i;
                    a aVar = this.f5811d;
                    e0Var.a(a(aVar, aVar.f5823d, (String) k4.a.e(this.f5815h)));
                    this.f5817j = true;
                }
            }
            this.f5813f.a(e10, f10, c10);
            u uVar = this.f5812e;
            if (uVar != null) {
                if (i11 > 0) {
                    uVar.a(e10, f10, c10);
                } else {
                    i12 = -i11;
                }
                if (this.f5812e.b(i12)) {
                    u uVar2 = this.f5812e;
                    ((a0) n0.j(this.f5809b)).R(this.f5812e.f5951d, w.q(uVar2.f5951d, uVar2.f5952e));
                    ((k0) n0.j(this.f5808a)).a(this.f5818k, this.f5809b);
                }
                if (b10 == 178 && a0Var.e()[c10 + 2] == 1) {
                    this.f5812e.e(b10);
                }
            }
            int i13 = g10 - c10;
            this.f5813f.b(this.f5814g - ((long) i13), i13, this.f5817j);
            this.f5813f.c(b10, this.f5818k);
            f10 = i10;
        }
        if (!this.f5817j) {
            this.f5811d.a(e10, f10, g10);
        }
        this.f5813f.a(e10, f10, g10);
        u uVar3 = this.f5812e;
        if (uVar3 != null) {
            uVar3.a(e10, f10, g10);
        }
    }

    public void d() {
    }

    public void e(n nVar, i0.d dVar) {
        dVar.a();
        this.f5815h = dVar.b();
        e0 e10 = nVar.e(dVar.c(), 2);
        this.f5816i = e10;
        this.f5813f = new b(e10);
        k0 k0Var = this.f5808a;
        if (k0Var != null) {
            k0Var.b(nVar, dVar);
        }
    }

    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f5818k = j10;
        }
    }
}
