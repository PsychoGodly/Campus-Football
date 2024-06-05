package y7;

import java.util.Date;
import y7.g;

/* compiled from: ExponentialBackoff */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private final g f31402a;

    /* renamed from: b  reason: collision with root package name */
    private final g.d f31403b;

    /* renamed from: c  reason: collision with root package name */
    private final long f31404c;

    /* renamed from: d  reason: collision with root package name */
    private final double f31405d;

    /* renamed from: e  reason: collision with root package name */
    private final long f31406e;

    /* renamed from: f  reason: collision with root package name */
    private long f31407f;

    /* renamed from: g  reason: collision with root package name */
    private long f31408g;

    /* renamed from: h  reason: collision with root package name */
    private long f31409h;

    /* renamed from: i  reason: collision with root package name */
    private g.b f31410i;

    public r(g gVar, g.d dVar, long j10, double d10, long j11) {
        this.f31402a = gVar;
        this.f31403b = dVar;
        this.f31404c = j10;
        this.f31405d = d10;
        this.f31406e = j11;
        this.f31407f = j11;
        this.f31409h = new Date().getTime();
        f();
    }

    private long d() {
        return (long) ((Math.random() - 0.5d) * ((double) this.f31408g));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(Runnable runnable) {
        this.f31409h = new Date().getTime();
        runnable.run();
    }

    public void b(Runnable runnable) {
        c();
        long d10 = this.f31408g + d();
        long max = Math.max(0, new Date().getTime() - this.f31409h);
        long max2 = Math.max(0, d10 - max);
        if (this.f31408g > 0) {
            v.a(getClass().getSimpleName(), "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)", Long.valueOf(max2), Long.valueOf(this.f31408g), Long.valueOf(d10), Long.valueOf(max));
        }
        this.f31410i = this.f31402a.k(this.f31403b, max2, new q(this, runnable));
        long j10 = (long) (((double) this.f31408g) * this.f31405d);
        this.f31408g = j10;
        long j11 = this.f31404c;
        if (j10 < j11) {
            this.f31408g = j11;
        } else {
            long j12 = this.f31407f;
            if (j10 > j12) {
                this.f31408g = j12;
            }
        }
        this.f31407f = this.f31406e;
    }

    public void c() {
        g.b bVar = this.f31410i;
        if (bVar != null) {
            bVar.c();
            this.f31410i = null;
        }
    }

    public void f() {
        this.f31408g = 0;
    }

    public void g() {
        this.f31408g = this.f31407f;
    }

    public void h(long j10) {
        this.f31407f = j10;
    }

    public r(g gVar, g.d dVar) {
        this(gVar, dVar, 1000, 1.5d, 60000);
    }
}
