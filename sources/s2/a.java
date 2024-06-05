package s2;

import java.io.IOException;
import k4.n0;
import s2.b0;

/* compiled from: BinarySearchSeeker */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected final C0232a f22355a;

    /* renamed from: b  reason: collision with root package name */
    protected final f f22356b;

    /* renamed from: c  reason: collision with root package name */
    protected c f22357c;

    /* renamed from: d  reason: collision with root package name */
    private final int f22358d;

    /* renamed from: s2.a$a  reason: collision with other inner class name */
    /* compiled from: BinarySearchSeeker */
    public static class C0232a implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final d f22359a;

        /* renamed from: b  reason: collision with root package name */
        private final long f22360b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final long f22361c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final long f22362d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final long f22363e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final long f22364f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final long f22365g;

        public C0232a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f22359a = dVar;
            this.f22360b = j10;
            this.f22361c = j11;
            this.f22362d = j12;
            this.f22363e = j13;
            this.f22364f = j14;
            this.f22365g = j15;
        }

        public boolean f() {
            return true;
        }

        public b0.a h(long j10) {
            return new b0.a(new c0(j10, c.h(this.f22359a.a(j10), this.f22361c, this.f22362d, this.f22363e, this.f22364f, this.f22365g)));
        }

        public long i() {
            return this.f22360b;
        }

        public long k(long j10) {
            return this.f22359a.a(j10);
        }
    }

    /* compiled from: BinarySearchSeeker */
    public static final class b implements d {
        public long a(long j10) {
            return j10;
        }
    }

    /* compiled from: BinarySearchSeeker */
    protected static class c {

        /* renamed from: a  reason: collision with root package name */
        private final long f22366a;

        /* renamed from: b  reason: collision with root package name */
        private final long f22367b;

        /* renamed from: c  reason: collision with root package name */
        private final long f22368c;

        /* renamed from: d  reason: collision with root package name */
        private long f22369d;

        /* renamed from: e  reason: collision with root package name */
        private long f22370e;

        /* renamed from: f  reason: collision with root package name */
        private long f22371f;

        /* renamed from: g  reason: collision with root package name */
        private long f22372g;

        /* renamed from: h  reason: collision with root package name */
        private long f22373h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f22366a = j10;
            this.f22367b = j11;
            this.f22369d = j12;
            this.f22370e = j13;
            this.f22371f = j14;
            this.f22372g = j15;
            this.f22368c = j16;
            this.f22373h = h(j11, j12, j13, j14, j15, j16);
        }

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) (((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11))));
            return n0.r(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* access modifiers changed from: private */
        public long i() {
            return this.f22372g;
        }

        /* access modifiers changed from: private */
        public long j() {
            return this.f22371f;
        }

        /* access modifiers changed from: private */
        public long k() {
            return this.f22373h;
        }

        /* access modifiers changed from: private */
        public long l() {
            return this.f22366a;
        }

        /* access modifiers changed from: private */
        public long m() {
            return this.f22367b;
        }

        private void n() {
            this.f22373h = h(this.f22367b, this.f22369d, this.f22370e, this.f22371f, this.f22372g, this.f22368c);
        }

        /* access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f22370e = j10;
            this.f22372g = j11;
            n();
        }

        /* access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f22369d = j10;
            this.f22371f = j11;
            n();
        }
    }

    /* compiled from: BinarySearchSeeker */
    protected interface d {
        long a(long j10);
    }

    /* compiled from: BinarySearchSeeker */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        public static final e f22374d = new e(-3, -9223372036854775807L, -1);
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f22375a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f22376b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final long f22377c;

        private e(int i10, long j10, long j11) {
            this.f22375a = i10;
            this.f22376b = j10;
            this.f22377c = j11;
        }

        public static e d(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        public static e e(long j10) {
            return new e(0, -9223372036854775807L, j10);
        }

        public static e f(long j10, long j11) {
            return new e(-2, j10, j11);
        }
    }

    /* compiled from: BinarySearchSeeker */
    protected interface f {
        void a();

        e b(m mVar, long j10) throws IOException;
    }

    protected a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f22356b = fVar;
        this.f22358d = i10;
        this.f22355a = new C0232a(dVar, j10, j11, j12, j13, j14, j15);
    }

    /* access modifiers changed from: protected */
    public c a(long j10) {
        long j11 = j10;
        return new c(j11, this.f22355a.k(j11), this.f22355a.f22361c, this.f22355a.f22362d, this.f22355a.f22363e, this.f22355a.f22364f, this.f22355a.f22365g);
    }

    public final b0 b() {
        return this.f22355a;
    }

    public int c(m mVar, a0 a0Var) throws IOException {
        while (true) {
            c cVar = (c) k4.a.h(this.f22357c);
            long b10 = cVar.j();
            long c10 = cVar.i();
            long d10 = cVar.k();
            if (c10 - b10 <= ((long) this.f22358d)) {
                e(false, b10);
                return g(mVar, b10, a0Var);
            } else if (!i(mVar, d10)) {
                return g(mVar, d10, a0Var);
            } else {
                mVar.l();
                e b11 = this.f22356b.b(mVar, cVar.m());
                int a10 = b11.f22375a;
                if (a10 == -3) {
                    e(false, d10);
                    return g(mVar, d10, a0Var);
                } else if (a10 == -2) {
                    cVar.p(b11.f22376b, b11.f22377c);
                } else if (a10 == -1) {
                    cVar.o(b11.f22376b, b11.f22377c);
                } else if (a10 == 0) {
                    i(mVar, b11.f22377c);
                    e(true, b11.f22377c);
                    return g(mVar, b11.f22377c, a0Var);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    public final boolean d() {
        return this.f22357c != null;
    }

    /* access modifiers changed from: protected */
    public final void e(boolean z10, long j10) {
        this.f22357c = null;
        this.f22356b.a();
        f(z10, j10);
    }

    /* access modifiers changed from: protected */
    public void f(boolean z10, long j10) {
    }

    /* access modifiers changed from: protected */
    public final int g(m mVar, long j10, a0 a0Var) {
        if (j10 == mVar.c()) {
            return 0;
        }
        a0Var.f22378a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f22357c;
        if (cVar == null || cVar.l() != j10) {
            this.f22357c = a(j10);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean i(m mVar, long j10) throws IOException {
        long c10 = j10 - mVar.c();
        if (c10 < 0 || c10 > 262144) {
            return false;
        }
        mVar.m((int) c10);
        return true;
    }
}
