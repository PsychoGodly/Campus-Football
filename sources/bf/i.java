package bf;

import cf.c;
import com.google.android.gms.common.api.a;
import ef.d;
import ef.g;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ConnectionPool */
public final class i {

    /* renamed from: g  reason: collision with root package name */
    private static final Executor f31765g = new ThreadPoolExecutor(0, a.e.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), c.G("OkHttp ConnectionPool", true));

    /* renamed from: a  reason: collision with root package name */
    private final int f31766a;

    /* renamed from: b  reason: collision with root package name */
    private final long f31767b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f31768c;

    /* renamed from: d  reason: collision with root package name */
    private final Deque<ef.c> f31769d;

    /* renamed from: e  reason: collision with root package name */
    final d f31770e;

    /* renamed from: f  reason: collision with root package name */
    boolean f31771f;

    /* compiled from: ConnectionPool */
    class a implements Runnable {
        a() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
            L_0x0000:
                bf.i r0 = bf.i.this
                long r1 = java.lang.System.nanoTime()
                long r0 = r0.a(r1)
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x0011
                return
            L_0x0011:
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x0000
                r2 = 1000000(0xf4240, double:4.940656E-318)
                long r4 = r0 / r2
                long r2 = r2 * r4
                long r0 = r0 - r2
                bf.i r2 = bf.i.this
                monitor-enter(r2)
                bf.i r3 = bf.i.this     // Catch:{ InterruptedException -> 0x002b }
                int r1 = (int) r0     // Catch:{ InterruptedException -> 0x002b }
                r3.wait(r4, r1)     // Catch:{ InterruptedException -> 0x002b }
                goto L_0x002b
            L_0x0029:
                r0 = move-exception
                goto L_0x002d
            L_0x002b:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                goto L_0x0000
            L_0x002d:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: bf.i.a.run():void");
        }
    }

    public i() {
        this(5, 5, TimeUnit.MINUTES);
    }

    private int e(ef.c cVar, long j10) {
        List<Reference<g>> list = cVar.f32547n;
        int i10 = 0;
        while (i10 < list.size()) {
            Reference reference = list.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                p002if.g.l().t("A connection to " + cVar.p().a().l() + " was leaked. Did you forget to close a response body?", ((g.a) reference).f32576a);
                list.remove(i10);
                cVar.f32544k = true;
                if (list.isEmpty()) {
                    cVar.f32548o = j10 - this.f31767b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* access modifiers changed from: package-private */
    public long a(long j10) {
        synchronized (this) {
            ef.c cVar = null;
            long j11 = Long.MIN_VALUE;
            int i10 = 0;
            int i11 = 0;
            for (ef.c next : this.f31769d) {
                if (e(next, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long j12 = j10 - next.f32548o;
                    if (j12 > j11) {
                        cVar = next;
                        j11 = j12;
                    }
                }
            }
            long j13 = this.f31767b;
            if (j11 < j13) {
                if (i10 <= this.f31766a) {
                    if (i10 > 0) {
                        long j14 = j13 - j11;
                        return j14;
                    } else if (i11 > 0) {
                        return j13;
                    } else {
                        this.f31771f = false;
                        return -1;
                    }
                }
            }
            this.f31769d.remove(cVar);
            c.h(cVar.q());
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(ef.c cVar) {
        if (cVar.f32544k || this.f31766a == 0) {
            this.f31769d.remove(cVar);
            return true;
        }
        notifyAll();
        return false;
    }

    /* access modifiers changed from: package-private */
    public Socket c(a aVar, g gVar) {
        for (ef.c next : this.f31769d) {
            if (next.l(aVar, (b0) null) && next.n() && next != gVar.d()) {
                return gVar.m(next);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public ef.c d(a aVar, g gVar, b0 b0Var) {
        for (ef.c next : this.f31769d) {
            if (next.l(aVar, b0Var)) {
                gVar.a(next, true);
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void f(ef.c cVar) {
        if (!this.f31771f) {
            this.f31771f = true;
            f31765g.execute(this.f31768c);
        }
        this.f31769d.add(cVar);
    }

    public i(int i10, long j10, TimeUnit timeUnit) {
        this.f31768c = new a();
        this.f31769d = new ArrayDeque();
        this.f31770e = new d();
        this.f31766a = i10;
        this.f31767b = timeUnit.toNanos(j10);
        if (j10 <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + j10);
        }
    }
}
