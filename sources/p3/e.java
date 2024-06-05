package p3;

import java.io.IOException;
import java.util.ArrayList;
import k4.n0;
import n2.c4;
import p3.x;

/* compiled from: ClippingMediaSource */
public final class e extends b1 {

    /* renamed from: n  reason: collision with root package name */
    private final long f21420n;

    /* renamed from: o  reason: collision with root package name */
    private final long f21421o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f21422p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f21423q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f21424r;

    /* renamed from: s  reason: collision with root package name */
    private final ArrayList<d> f21425s;

    /* renamed from: t  reason: collision with root package name */
    private final c4.d f21426t;

    /* renamed from: u  reason: collision with root package name */
    private a f21427u;

    /* renamed from: v  reason: collision with root package name */
    private b f21428v;

    /* renamed from: w  reason: collision with root package name */
    private long f21429w;

    /* renamed from: x  reason: collision with root package name */
    private long f21430x;

    /* compiled from: ClippingMediaSource */
    private static final class a extends o {

        /* renamed from: h  reason: collision with root package name */
        private final long f21431h;

        /* renamed from: i  reason: collision with root package name */
        private final long f21432i;

        /* renamed from: j  reason: collision with root package name */
        private final long f21433j;

        /* renamed from: k  reason: collision with root package name */
        private final boolean f21434k;

        public a(c4 c4Var, long j10, long j11) throws b {
            super(c4Var);
            boolean z10 = false;
            if (c4Var.m() == 1) {
                c4.d r10 = c4Var.r(0, new c4.d());
                long max = Math.max(0, j10);
                if (r10.f20246m || max == 0 || r10.f20242i) {
                    long max2 = j11 == Long.MIN_VALUE ? r10.f20248o : Math.max(0, j11);
                    long j12 = r10.f20248o;
                    if (j12 != -9223372036854775807L) {
                        max2 = max2 > j12 ? j12 : max2;
                        if (max > max2) {
                            throw new b(2);
                        }
                    }
                    this.f21431h = max;
                    this.f21432i = max2;
                    int i10 = (max2 > -9223372036854775807L ? 1 : (max2 == -9223372036854775807L ? 0 : -1));
                    this.f21433j = i10 == 0 ? -9223372036854775807L : max2 - max;
                    if (r10.f20243j && (i10 == 0 || (j12 != -9223372036854775807L && max2 == j12))) {
                        z10 = true;
                    }
                    this.f21434k = z10;
                    return;
                }
                throw new b(1);
            }
            throw new b(0);
        }

        public c4.b k(int i10, c4.b bVar, boolean z10) {
            this.f21573g.k(0, bVar, z10);
            long q10 = bVar.q() - this.f21431h;
            long j10 = this.f21433j;
            return bVar.u(bVar.f20216a, bVar.f20217b, 0, j10 == -9223372036854775807L ? -9223372036854775807L : j10 - q10, q10);
        }

        public c4.d s(int i10, c4.d dVar, long j10) {
            this.f21573g.s(0, dVar, 0);
            long j11 = dVar.f20251r;
            long j12 = this.f21431h;
            dVar.f20251r = j11 + j12;
            dVar.f20248o = this.f21433j;
            dVar.f20243j = this.f21434k;
            long j13 = dVar.f20247n;
            if (j13 != -9223372036854775807L) {
                long max = Math.max(j13, j12);
                dVar.f20247n = max;
                long j14 = this.f21432i;
                if (j14 != -9223372036854775807L) {
                    max = Math.min(max, j14);
                }
                dVar.f20247n = max;
                dVar.f20247n = max - this.f21431h;
            }
            long Z0 = n0.Z0(this.f21431h);
            long j15 = dVar.f20239f;
            if (j15 != -9223372036854775807L) {
                dVar.f20239f = j15 + Z0;
            }
            long j16 = dVar.f20240g;
            if (j16 != -9223372036854775807L) {
                dVar.f20240g = j16 + Z0;
            }
            return dVar;
        }
    }

    /* compiled from: ClippingMediaSource */
    public static final class b extends IOException {

        /* renamed from: a  reason: collision with root package name */
        public final int f21435a;

        public b(int i10) {
            super("Illegal clipping: " + a(i10));
            this.f21435a = i10;
        }

        private static String a(int i10) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public e(x xVar, long j10, long j11) {
        this(xVar, j10, j11, true, false, false);
    }

    private void Z(c4 c4Var) {
        long j10;
        c4Var.r(0, this.f21426t);
        long g10 = this.f21426t.g();
        long j11 = Long.MIN_VALUE;
        if (this.f21427u == null || this.f21425s.isEmpty() || this.f21423q) {
            long j12 = this.f21420n;
            long j13 = this.f21421o;
            if (this.f21424r) {
                long e10 = this.f21426t.e();
                j12 += e10;
                j13 += e10;
            }
            this.f21429w = g10 + j12;
            if (this.f21421o != Long.MIN_VALUE) {
                j11 = g10 + j13;
            }
            this.f21430x = j11;
            int size = this.f21425s.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f21425s.get(i10).u(this.f21429w, this.f21430x);
            }
            j10 = j12;
            j11 = j13;
        } else {
            long j14 = this.f21429w - g10;
            if (this.f21421o != Long.MIN_VALUE) {
                j11 = this.f21430x - g10;
            }
            j10 = j14;
        }
        try {
            a aVar = new a(c4Var, j10, j11);
            this.f21427u = aVar;
            D(aVar);
        } catch (b e11) {
            this.f21428v = e11;
            for (int i11 = 0; i11 < this.f21425s.size(); i11++) {
                this.f21425s.get(i11).o(this.f21428v);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void E() {
        super.E();
        this.f21428v = null;
        this.f21427u = null;
    }

    /* access modifiers changed from: protected */
    public void W(c4 c4Var) {
        if (this.f21428v == null) {
            Z(c4Var);
        }
    }

    public u a(x.b bVar, j4.b bVar2, long j10) {
        d dVar = new d(this.f21406l.a(bVar, bVar2, j10), this.f21422p, this.f21429w, this.f21430x);
        this.f21425s.add(dVar);
        return dVar;
    }

    public void b(u uVar) {
        k4.a.f(this.f21425s.remove(uVar));
        this.f21406l.b(((d) uVar).f21410a);
        if (this.f21425s.isEmpty() && !this.f21423q) {
            Z(((a) k4.a.e(this.f21427u)).f21573g);
        }
    }

    public void h() throws IOException {
        b bVar = this.f21428v;
        if (bVar == null) {
            super.h();
            return;
        }
        throw bVar;
    }

    public e(x xVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        super((x) k4.a.e(xVar));
        k4.a.a(j10 >= 0);
        this.f21420n = j10;
        this.f21421o = j11;
        this.f21422p = z10;
        this.f21423q = z11;
        this.f21424r = z12;
        this.f21425s = new ArrayList<>();
        this.f21426t = new c4.d();
    }
}
