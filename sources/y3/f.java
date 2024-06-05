package y3;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import s6.u;

/* compiled from: ExoplayerCuesDecoder */
public final class f implements i {

    /* renamed from: a  reason: collision with root package name */
    private final c f23868a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final l f23869b = new l();

    /* renamed from: c  reason: collision with root package name */
    private final Deque<m> f23870c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    private int f23871d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f23872e;

    /* compiled from: ExoplayerCuesDecoder */
    class a extends m {
        a() {
        }

        public void q() {
            f.this.i(this);
        }
    }

    /* compiled from: ExoplayerCuesDecoder */
    private static final class b implements h {

        /* renamed from: a  reason: collision with root package name */
        private final long f23874a;

        /* renamed from: b  reason: collision with root package name */
        private final u<b> f23875b;

        public b(long j10, u<b> uVar) {
            this.f23874a = j10;
            this.f23875b = uVar;
        }

        public int a(long j10) {
            return this.f23874a > j10 ? 0 : -1;
        }

        public long c(int i10) {
            k4.a.a(i10 == 0);
            return this.f23874a;
        }

        public List<b> d(long j10) {
            return j10 >= this.f23874a ? this.f23875b : u.y();
        }

        public int e() {
            return 1;
        }
    }

    public f() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f23870c.addFirst(new a());
        }
        this.f23871d = 0;
    }

    /* access modifiers changed from: private */
    public void i(m mVar) {
        k4.a.f(this.f23870c.size() < 2);
        k4.a.a(!this.f23870c.contains(mVar));
        mVar.g();
        this.f23870c.addFirst(mVar);
    }

    public void a(long j10) {
    }

    /* renamed from: f */
    public l c() throws j {
        k4.a.f(!this.f23872e);
        if (this.f23871d != 0) {
            return null;
        }
        this.f23871d = 1;
        return this.f23869b;
    }

    public void flush() {
        k4.a.f(!this.f23872e);
        this.f23869b.g();
        this.f23871d = 0;
    }

    /* renamed from: g */
    public m b() throws j {
        k4.a.f(!this.f23872e);
        if (this.f23871d != 2 || this.f23870c.isEmpty()) {
            return null;
        }
        m removeFirst = this.f23870c.removeFirst();
        if (this.f23869b.l()) {
            removeFirst.f(4);
        } else {
            l lVar = this.f23869b;
            b bVar = new b(lVar.f21757f, this.f23868a.a(((ByteBuffer) k4.a.e(lVar.f21755c)).array()));
            removeFirst.r(this.f23869b.f21757f, bVar, 0);
        }
        this.f23869b.g();
        this.f23871d = 0;
        return removeFirst;
    }

    /* renamed from: h */
    public void d(l lVar) throws j {
        boolean z10 = true;
        k4.a.f(!this.f23872e);
        k4.a.f(this.f23871d == 1);
        if (this.f23869b != lVar) {
            z10 = false;
        }
        k4.a.a(z10);
        this.f23871d = 2;
    }

    public void release() {
        this.f23872e = true;
    }
}
