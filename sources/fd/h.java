package fd;

import com.unity3d.services.UnityAdsConstants;
import dd.j1;
import dd.y0;
import dd.z0;
import fd.q;
import hd.d;
import io.grpc.internal.a;
import io.grpc.internal.i2;
import io.grpc.internal.o2;
import io.grpc.internal.p2;
import io.grpc.internal.r;
import io.grpc.internal.u0;
import java.util.List;
import lf.c;
import r6.o;

/* compiled from: OkHttpClientStream */
class h extends io.grpc.internal.a {
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final c f32674p = new c();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final z0<?, ?> f32675h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final String f32676i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final i2 f32677j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public String f32678k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final b f32679l;

    /* renamed from: m  reason: collision with root package name */
    private final a f32680m;

    /* renamed from: n  reason: collision with root package name */
    private final dd.a f32681n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public boolean f32682o;

    /* compiled from: OkHttpClientStream */
    class a implements a.b {
        a() {
        }

        public void b(j1 j1Var) {
            md.c.f("OkHttpClientStream$Sink.cancel");
            try {
                synchronized (h.this.f32679l.f32685z) {
                    h.this.f32679l.a0(j1Var, true, (y0) null);
                }
                md.c.h("OkHttpClientStream$Sink.cancel");
            } catch (Throwable th) {
                md.c.h("OkHttpClientStream$Sink.cancel");
                throw th;
            }
        }

        public void c(p2 p2Var, boolean z10, boolean z11, int i10) {
            c cVar;
            md.c.f("OkHttpClientStream$Sink.writeFrame");
            if (p2Var == null) {
                cVar = h.f32674p;
            } else {
                cVar = ((o) p2Var).a();
                int v02 = (int) cVar.v0();
                if (v02 > 0) {
                    h.this.s(v02);
                }
            }
            try {
                synchronized (h.this.f32679l.f32685z) {
                    h.this.f32679l.e0(cVar, z10, z11);
                    h.this.w().e(i10);
                }
                md.c.h("OkHttpClientStream$Sink.writeFrame");
            } catch (Throwable th) {
                md.c.h("OkHttpClientStream$Sink.writeFrame");
                throw th;
            }
        }

        public void d(y0 y0Var, byte[] bArr) {
            md.c.f("OkHttpClientStream$Sink.writeHeaders");
            String str = UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + h.this.f32675h.c();
            if (bArr != null) {
                boolean unused = h.this.f32682o = true;
                str = str + "?" + t6.a.a().e(bArr);
            }
            try {
                synchronized (h.this.f32679l.f32685z) {
                    h.this.f32679l.g0(y0Var, str);
                }
                md.c.h("OkHttpClientStream$Sink.writeHeaders");
            } catch (Throwable th) {
                md.c.h("OkHttpClientStream$Sink.writeHeaders");
                throw th;
            }
        }
    }

    /* compiled from: OkHttpClientStream */
    class b extends u0 implements q.b {
        private List<d> A;
        private c B = new c();
        private boolean C = false;
        private boolean D = false;
        private boolean E = false;
        private int F;
        private int G;
        private final b H;
        private final q I;
        private final i J;
        private boolean K = true;
        private final md.d L;
        private q.c M;
        private int N = -1;

        /* renamed from: y  reason: collision with root package name */
        private final int f32684y;
        /* access modifiers changed from: private */

        /* renamed from: z  reason: collision with root package name */
        public final Object f32685z;

        public b(int i10, i2 i2Var, Object obj, b bVar, q qVar, i iVar, int i11, String str) {
            super(i10, i2Var, h.this.w());
            this.f32685z = o.p(obj, "lock");
            this.H = bVar;
            this.I = qVar;
            this.J = iVar;
            this.F = i11;
            this.G = i11;
            this.f32684y = i11;
            this.L = md.c.a(str);
        }

        /* access modifiers changed from: private */
        public void a0(j1 j1Var, boolean z10, y0 y0Var) {
            if (!this.E) {
                this.E = true;
                if (this.K) {
                    this.J.h0(h.this);
                    this.A = null;
                    this.B.i();
                    this.K = false;
                    if (y0Var == null) {
                        y0Var = new y0();
                    }
                    N(j1Var, true, y0Var);
                    return;
                }
                this.J.U(c0(), j1Var, r.a.PROCESSED, z10, hd.a.CANCEL, y0Var);
            }
        }

        private void d0() {
            if (!G()) {
                this.J.U(c0(), (j1) null, r.a.PROCESSED, false, hd.a.CANCEL, (y0) null);
            } else {
                this.J.U(c0(), (j1) null, r.a.PROCESSED, false, (hd.a) null, (y0) null);
            }
        }

        /* access modifiers changed from: private */
        public void e0(c cVar, boolean z10, boolean z11) {
            if (!this.E) {
                if (this.K) {
                    this.B.V0(cVar, (long) ((int) cVar.v0()));
                    this.C |= z10;
                    this.D |= z11;
                    return;
                }
                o.v(c0() != -1, "streamId should be set");
                this.I.d(z10, this.M, cVar, z11);
            }
        }

        /* access modifiers changed from: private */
        public void g0(y0 y0Var, String str) {
            this.A = d.b(y0Var, str, h.this.f32678k, h.this.f32676i, h.this.f32682o, this.J.b0());
            this.J.o0(h.this);
        }

        /* access modifiers changed from: protected */
        public void P(j1 j1Var, boolean z10, y0 y0Var) {
            a0(j1Var, z10, y0Var);
        }

        /* access modifiers changed from: package-private */
        public q.c b0() {
            q.c cVar;
            synchronized (this.f32685z) {
                cVar = this.M;
            }
            return cVar;
        }

        public void c(boolean z10) {
            d0();
            super.c(z10);
        }

        /* access modifiers changed from: package-private */
        public int c0() {
            return this.N;
        }

        public void d(int i10) {
            int i11 = this.G - i10;
            this.G = i11;
            int i12 = this.f32684y;
            if (((float) i11) <= ((float) i12) * 0.5f) {
                int i13 = i12 - i11;
                this.F += i13;
                this.G = i11 + i13;
                this.H.a(c0(), (long) i13);
            }
        }

        public void e(Throwable th) {
            P(j1.k(th), true, new y0());
        }

        public void f(Runnable runnable) {
            synchronized (this.f32685z) {
                runnable.run();
            }
        }

        public void f0(int i10) {
            o.w(this.N == -1, "the stream has been started with id %s", i10);
            this.N = i10;
            this.M = this.I.c(this, i10);
            h.this.f32679l.r();
            if (this.K) {
                this.H.N0(h.this.f32682o, false, this.N, 0, this.A);
                h.this.f32677j.c();
                this.A = null;
                if (this.B.v0() > 0) {
                    this.I.d(this.C, this.M, this.B, this.D);
                }
                this.K = false;
            }
        }

        /* access modifiers changed from: package-private */
        public md.d h0() {
            return this.L;
        }

        public void i0(c cVar, boolean z10) {
            int v02 = this.F - ((int) cVar.v0());
            this.F = v02;
            if (v02 < 0) {
                this.H.g(c0(), hd.a.FLOW_CONTROL_ERROR);
                this.J.U(c0(), j1.f32247t.q("Received data size exceeded our receiving window size"), r.a.PROCESSED, false, (hd.a) null, (y0) null);
                return;
            }
            super.S(new l(cVar), z10);
        }

        public void j0(List<d> list, boolean z10) {
            if (z10) {
                U(r.c(list));
            } else {
                T(r.a(list));
            }
        }

        /* access modifiers changed from: protected */
        public void r() {
            super.r();
            m().c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    h(z0<?, ?> z0Var, y0 y0Var, b bVar, i iVar, q qVar, Object obj, int i10, int i11, String str, String str2, i2 i2Var, o2 o2Var, dd.c cVar, boolean z10) {
        super(new p(), i2Var, o2Var, y0Var, cVar, z10 && z0Var.f());
        this.f32680m = new a();
        this.f32682o = false;
        i2 i2Var2 = i2Var;
        this.f32677j = (i2) o.p(i2Var2, "statsTraceCtx");
        this.f32675h = z0Var;
        this.f32678k = str;
        this.f32676i = str2;
        this.f32681n = iVar.V();
        this.f32679l = new b(i10, i2Var2, obj, bVar, qVar, iVar, i11, z0Var.c());
    }

    public z0.d L() {
        return this.f32675h.e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public b y() {
        return this.f32679l;
    }

    /* access modifiers changed from: package-private */
    public boolean N() {
        return this.f32682o;
    }

    public void m(String str) {
        this.f32678k = (String) o.p(str, "authority");
    }

    public dd.a p() {
        return this.f32681n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public a u() {
        return this.f32680m;
    }
}
