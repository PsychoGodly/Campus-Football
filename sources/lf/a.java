package lf;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: AsyncTimeout */
public class a extends t {

    /* renamed from: h  reason: collision with root package name */
    private static final long f36238h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f36239i;

    /* renamed from: j  reason: collision with root package name */
    static a f36240j;

    /* renamed from: e  reason: collision with root package name */
    private boolean f36241e;

    /* renamed from: f  reason: collision with root package name */
    private a f36242f;

    /* renamed from: g  reason: collision with root package name */
    private long f36243g;

    /* renamed from: lf.a$a  reason: collision with other inner class name */
    /* compiled from: AsyncTimeout */
    class C0417a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f36244a;

        C0417a(r rVar) {
            this.f36244a = rVar;
        }

        public void V0(c cVar, long j10) throws IOException {
            u.b(cVar.f36252b, 0, j10);
            while (true) {
                long j11 = 0;
                if (j10 > 0) {
                    o oVar = cVar.f36251a;
                    while (true) {
                        if (j11 >= 65536) {
                            break;
                        }
                        j11 += (long) (oVar.f36285c - oVar.f36284b);
                        if (j11 >= j10) {
                            j11 = j10;
                            break;
                        }
                        oVar = oVar.f36288f;
                    }
                    a.this.k();
                    try {
                        this.f36244a.V0(cVar, j11);
                        j10 -= j11;
                        a.this.m(true);
                    } catch (IOException e10) {
                        throw a.this.l(e10);
                    } catch (Throwable th) {
                        a.this.m(false);
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }

        public void close() throws IOException {
            a.this.k();
            try {
                this.f36244a.close();
                a.this.m(true);
            } catch (IOException e10) {
                throw a.this.l(e10);
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        public t e() {
            return a.this;
        }

        public void flush() throws IOException {
            a.this.k();
            try {
                this.f36244a.flush();
                a.this.m(true);
            } catch (IOException e10) {
                throw a.this.l(e10);
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f36244a + ")";
        }
    }

    /* compiled from: AsyncTimeout */
    class b implements s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f36246a;

        b(s sVar) {
            this.f36246a = sVar;
        }

        public long P(c cVar, long j10) throws IOException {
            a.this.k();
            try {
                long P = this.f36246a.P(cVar, j10);
                a.this.m(true);
                return P;
            } catch (IOException e10) {
                throw a.this.l(e10);
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        public void close() throws IOException {
            a.this.k();
            try {
                this.f36246a.close();
                a.this.m(true);
            } catch (IOException e10) {
                throw a.this.l(e10);
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        public t e() {
            return a.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f36246a + ")";
        }
    }

    /* compiled from: AsyncTimeout */
    private static final class c extends Thread {
        c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.t();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<lf.a> r0 = lf.a.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                lf.a r1 = lf.a.i()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                lf.a r2 = lf.a.f36240j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                lf.a.f36240j = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.t()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: lf.a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f36238h = millis;
        f36239i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    static a i() throws InterruptedException {
        Class<a> cls = a.class;
        a aVar = f36240j.f36242f;
        if (aVar == null) {
            long nanoTime = System.nanoTime();
            cls.wait(f36238h);
            if (f36240j.f36242f != null || System.nanoTime() - nanoTime < f36239i) {
                return null;
            }
            return f36240j;
        }
        long p10 = aVar.p(System.nanoTime());
        if (p10 > 0) {
            long j10 = p10 / 1000000;
            cls.wait(j10, (int) (p10 - (1000000 * j10)));
            return null;
        }
        f36240j.f36242f = aVar.f36242f;
        aVar.f36242f = null;
        return aVar;
    }

    private static synchronized boolean j(a aVar) {
        synchronized (a.class) {
            a aVar2 = f36240j;
            while (aVar2 != null) {
                a aVar3 = aVar2.f36242f;
                if (aVar3 == aVar) {
                    aVar2.f36242f = aVar.f36242f;
                    aVar.f36242f = null;
                    return false;
                }
                aVar2 = aVar3;
            }
            return true;
        }
    }

    private long p(long j10) {
        return this.f36243g - j10;
    }

    private static synchronized void q(a aVar, long j10, boolean z10) {
        Class<a> cls = a.class;
        synchronized (cls) {
            if (f36240j == null) {
                f36240j = new a();
                new c().start();
            }
            long nanoTime = System.nanoTime();
            int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
            if (i10 != 0 && z10) {
                aVar.f36243g = Math.min(j10, aVar.c() - nanoTime) + nanoTime;
            } else if (i10 != 0) {
                aVar.f36243g = j10 + nanoTime;
            } else if (z10) {
                aVar.f36243g = aVar.c();
            } else {
                throw new AssertionError();
            }
            long p10 = aVar.p(nanoTime);
            a aVar2 = f36240j;
            while (true) {
                a aVar3 = aVar2.f36242f;
                if (aVar3 == null) {
                    break;
                } else if (p10 < aVar3.p(nanoTime)) {
                    break;
                } else {
                    aVar2 = aVar2.f36242f;
                }
            }
            aVar.f36242f = aVar2.f36242f;
            aVar2.f36242f = aVar;
            if (aVar2 == f36240j) {
                cls.notify();
            }
        }
    }

    public final void k() {
        if (!this.f36241e) {
            long h10 = h();
            boolean e10 = e();
            if (h10 != 0 || e10) {
                this.f36241e = true;
                q(this, h10, e10);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    /* access modifiers changed from: package-private */
    public final IOException l(IOException iOException) throws IOException {
        if (!n()) {
            return iOException;
        }
        return o(iOException);
    }

    /* access modifiers changed from: package-private */
    public final void m(boolean z10) throws IOException {
        if (n() && z10) {
            throw o((IOException) null);
        }
    }

    public final boolean n() {
        if (!this.f36241e) {
            return false;
        }
        this.f36241e = false;
        return j(this);
    }

    /* access modifiers changed from: protected */
    public IOException o(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final r r(r rVar) {
        return new C0417a(rVar);
    }

    public final s s(s sVar) {
        return new b(sVar);
    }

    /* access modifiers changed from: protected */
    public void t() {
    }
}
