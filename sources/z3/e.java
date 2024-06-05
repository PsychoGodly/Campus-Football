package z3;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import k4.n0;
import q2.h;
import y3.i;
import y3.j;
import y3.l;
import y3.m;

/* compiled from: CeaDecoder */
abstract class e implements i {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<b> f24226a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<m> f24227b;

    /* renamed from: c  reason: collision with root package name */
    private final PriorityQueue<b> f24228c;

    /* renamed from: d  reason: collision with root package name */
    private b f24229d;

    /* renamed from: e  reason: collision with root package name */
    private long f24230e;

    /* renamed from: f  reason: collision with root package name */
    private long f24231f;

    /* compiled from: CeaDecoder */
    private static final class b extends l implements Comparable<b> {
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public long f24232k;

        private b() {
        }

        /* renamed from: x */
        public int compareTo(b bVar) {
            if (l() == bVar.l()) {
                long j10 = this.f21757f - bVar.f21757f;
                if (j10 == 0) {
                    j10 = this.f24232k - bVar.f24232k;
                    if (j10 == 0) {
                        return 0;
                    }
                }
                if (j10 > 0) {
                    return 1;
                }
                return -1;
            } else if (l()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    /* compiled from: CeaDecoder */
    private static final class c extends m {

        /* renamed from: g  reason: collision with root package name */
        private h.a<c> f24233g;

        public c(h.a<c> aVar) {
            this.f24233g = aVar;
        }

        public final void q() {
            this.f24233g.a(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f24226a.add(new b());
        }
        this.f24227b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f24227b.add(new c(new d(this)));
        }
        this.f24228c = new PriorityQueue<>();
    }

    private void m(b bVar) {
        bVar.g();
        this.f24226a.add(bVar);
    }

    public void a(long j10) {
        this.f24230e = j10;
    }

    /* access modifiers changed from: protected */
    public abstract y3.h e();

    /* access modifiers changed from: protected */
    public abstract void f(l lVar);

    public void flush() {
        this.f24231f = 0;
        this.f24230e = 0;
        while (!this.f24228c.isEmpty()) {
            m((b) n0.j(this.f24228c.poll()));
        }
        b bVar = this.f24229d;
        if (bVar != null) {
            m(bVar);
            this.f24229d = null;
        }
    }

    /* renamed from: g */
    public l c() throws j {
        k4.a.f(this.f24229d == null);
        if (this.f24226a.isEmpty()) {
            return null;
        }
        b pollFirst = this.f24226a.pollFirst();
        this.f24229d = pollFirst;
        return pollFirst;
    }

    /* renamed from: h */
    public m b() throws j {
        if (this.f24227b.isEmpty()) {
            return null;
        }
        while (!this.f24228c.isEmpty() && ((b) n0.j(this.f24228c.peek())).f21757f <= this.f24230e) {
            b bVar = (b) n0.j(this.f24228c.poll());
            if (bVar.l()) {
                m mVar = (m) n0.j(this.f24227b.pollFirst());
                mVar.f(4);
                m(bVar);
                return mVar;
            }
            f(bVar);
            if (k()) {
                y3.h e10 = e();
                m mVar2 = (m) n0.j(this.f24227b.pollFirst());
                mVar2.r(bVar.f21757f, e10, Long.MAX_VALUE);
                m(bVar);
                return mVar2;
            }
            m(bVar);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final m i() {
        return this.f24227b.pollFirst();
    }

    /* access modifiers changed from: protected */
    public final long j() {
        return this.f24230e;
    }

    /* access modifiers changed from: protected */
    public abstract boolean k();

    /* renamed from: l */
    public void d(l lVar) throws j {
        k4.a.a(lVar == this.f24229d);
        b bVar = (b) lVar;
        if (bVar.k()) {
            m(bVar);
        } else {
            long j10 = this.f24231f;
            this.f24231f = 1 + j10;
            long unused = bVar.f24232k = j10;
            this.f24228c.add(bVar);
        }
        this.f24229d = null;
    }

    /* access modifiers changed from: protected */
    public void n(m mVar) {
        mVar.g();
        this.f24227b.add(mVar);
    }

    public void release() {
    }
}
