package p3;

import android.net.Uri;
import j4.p0;
import java.util.ArrayList;
import k4.n0;
import n2.r1;
import n2.s1;
import n2.u3;
import n2.z1;
import p3.u;
import p3.x;
import q2.g;

/* compiled from: SilenceMediaSource */
public final class t0 extends a {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final r1 f21649k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final z1 f21650l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final byte[] f21651m = new byte[(n0.d0(2, 2) * 1024)];

    /* renamed from: i  reason: collision with root package name */
    private final long f21652i;

    /* renamed from: j  reason: collision with root package name */
    private final z1 f21653j;

    /* compiled from: SilenceMediaSource */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private long f21654a;

        /* renamed from: b  reason: collision with root package name */
        private Object f21655b;

        public t0 a() {
            k4.a.f(this.f21654a > 0);
            return new t0(this.f21654a, t0.f21650l.b().e(this.f21655b).a());
        }

        public b b(long j10) {
            this.f21654a = j10;
            return this;
        }

        public b c(Object obj) {
            this.f21655b = obj;
            return this;
        }
    }

    /* compiled from: SilenceMediaSource */
    private static final class c implements u {

        /* renamed from: c  reason: collision with root package name */
        private static final z0 f21656c = new z0(new x0(t0.f21649k));

        /* renamed from: a  reason: collision with root package name */
        private final long f21657a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<q0> f21658b = new ArrayList<>();

        public c(long j10) {
            this.f21657a = j10;
        }

        private long a(long j10) {
            return n0.r(j10, 0, this.f21657a);
        }

        public long b() {
            return Long.MIN_VALUE;
        }

        public boolean c(long j10) {
            return false;
        }

        public long d(long j10, u3 u3Var) {
            return a(j10);
        }

        public long f() {
            return Long.MIN_VALUE;
        }

        public void g(long j10) {
        }

        public void h(u.a aVar, long j10) {
            aVar.e(this);
        }

        public boolean isLoading() {
            return false;
        }

        public void m() {
        }

        public long n(long j10) {
            long a10 = a(j10);
            for (int i10 = 0; i10 < this.f21658b.size(); i10++) {
                ((d) this.f21658b.get(i10)).b(a10);
            }
            return a10;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long p(i4.s[] r5, boolean[] r6, p3.q0[] r7, boolean[] r8, long r9) {
            /*
                r4 = this;
                long r9 = r4.a(r9)
                r0 = 0
            L_0x0005:
                int r1 = r5.length
                if (r0 >= r1) goto L_0x003d
                r1 = r7[r0]
                if (r1 == 0) goto L_0x001e
                r1 = r5[r0]
                if (r1 == 0) goto L_0x0014
                boolean r1 = r6[r0]
                if (r1 != 0) goto L_0x001e
            L_0x0014:
                java.util.ArrayList<p3.q0> r1 = r4.f21658b
                r2 = r7[r0]
                r1.remove(r2)
                r1 = 0
                r7[r0] = r1
            L_0x001e:
                r1 = r7[r0]
                if (r1 != 0) goto L_0x003a
                r1 = r5[r0]
                if (r1 == 0) goto L_0x003a
                p3.t0$d r1 = new p3.t0$d
                long r2 = r4.f21657a
                r1.<init>(r2)
                r1.b(r9)
                java.util.ArrayList<p3.q0> r2 = r4.f21658b
                r2.add(r1)
                r7[r0] = r1
                r1 = 1
                r8[r0] = r1
            L_0x003a:
                int r0 = r0 + 1
                goto L_0x0005
            L_0x003d:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p3.t0.c.p(i4.s[], boolean[], p3.q0[], boolean[], long):long");
        }

        public long r() {
            return -9223372036854775807L;
        }

        public z0 s() {
            return f21656c;
        }

        public void t(long j10, boolean z10) {
        }
    }

    /* compiled from: SilenceMediaSource */
    private static final class d implements q0 {

        /* renamed from: a  reason: collision with root package name */
        private final long f21659a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f21660b;

        /* renamed from: c  reason: collision with root package name */
        private long f21661c;

        public d(long j10) {
            this.f21659a = t0.K(j10);
            b(0);
        }

        public void a() {
        }

        public void b(long j10) {
            this.f21661c = n0.r(t0.K(j10), 0, this.f21659a);
        }

        public int e(long j10) {
            long j11 = this.f21661c;
            b(j10);
            return (int) ((this.f21661c - j11) / ((long) t0.f21651m.length));
        }

        public boolean isReady() {
            return true;
        }

        public int j(s1 s1Var, g gVar, int i10) {
            if (!this.f21660b || (i10 & 2) != 0) {
                s1Var.f20721b = t0.f21649k;
                this.f21660b = true;
                return -5;
            }
            long j10 = this.f21659a;
            long j11 = this.f21661c;
            long j12 = j10 - j11;
            if (j12 == 0) {
                gVar.f(4);
                return -4;
            }
            gVar.f21757f = t0.L(j11);
            gVar.f(1);
            int min = (int) Math.min((long) t0.f21651m.length, j12);
            if ((i10 & 4) == 0) {
                gVar.r(min);
                gVar.f21755c.put(t0.f21651m, 0, min);
            }
            if ((i10 & 1) == 0) {
                this.f21661c += (long) min;
            }
            return -4;
        }
    }

    static {
        r1 G = new r1.b().g0("audio/raw").J(2).h0(44100).a0(2).G();
        f21649k = G;
        f21650l = new z1.c().c("SilenceMediaSource").f(Uri.EMPTY).d(G.f20654m).a();
    }

    /* access modifiers changed from: private */
    public static long K(long j10) {
        return ((long) n0.d0(2, 2)) * ((j10 * 44100) / 1000000);
    }

    /* access modifiers changed from: private */
    public static long L(long j10) {
        return ((j10 / ((long) n0.d0(2, 2))) * 1000000) / 44100;
    }

    /* access modifiers changed from: protected */
    public void C(p0 p0Var) {
        D(new u0(this.f21652i, true, false, false, (Object) null, this.f21653j));
    }

    /* access modifiers changed from: protected */
    public void E() {
    }

    public u a(x.b bVar, j4.b bVar2, long j10) {
        return new c(this.f21652i);
    }

    public void b(u uVar) {
    }

    public z1 g() {
        return this.f21653j;
    }

    public void h() {
    }

    private t0(long j10, z1 z1Var) {
        k4.a.a(j10 >= 0);
        this.f21652i = j10;
        this.f21653j = z1Var;
    }
}
