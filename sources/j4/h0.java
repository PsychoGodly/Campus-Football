package j4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import k4.k0;
import k4.n0;
import k4.r;

/* compiled from: Loader */
public final class h0 implements i0 {

    /* renamed from: d  reason: collision with root package name */
    public static final c f19327d = h(false, -9223372036854775807L);

    /* renamed from: e  reason: collision with root package name */
    public static final c f19328e = h(true, -9223372036854775807L);

    /* renamed from: f  reason: collision with root package name */
    public static final c f19329f = new c(2, -9223372036854775807L);

    /* renamed from: g  reason: collision with root package name */
    public static final c f19330g = new c(3, -9223372036854775807L);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f19331a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public d<? extends e> f19332b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public IOException f19333c;

    /* compiled from: Loader */
    public interface b<T extends e> {
        void k(T t10, long j10, long j11);

        void l(T t10, long j10, long j11, boolean z10);

        c o(T t10, long j10, long j11, IOException iOException, int i10);
    }

    /* compiled from: Loader */
    public static final class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f19334a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f19335b;

        public boolean c() {
            int i10 = this.f19334a;
            return i10 == 0 || i10 == 1;
        }

        private c(int i10, long j10) {
            this.f19334a = i10;
            this.f19335b = j10;
        }
    }

    /* compiled from: Loader */
    private final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final int f19336a;

        /* renamed from: b  reason: collision with root package name */
        private final T f19337b;

        /* renamed from: c  reason: collision with root package name */
        private final long f19338c;

        /* renamed from: d  reason: collision with root package name */
        private b<T> f19339d;

        /* renamed from: f  reason: collision with root package name */
        private IOException f19340f;

        /* renamed from: g  reason: collision with root package name */
        private int f19341g;

        /* renamed from: h  reason: collision with root package name */
        private Thread f19342h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f19343i;

        /* renamed from: j  reason: collision with root package name */
        private volatile boolean f19344j;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f19337b = t10;
            this.f19339d = bVar;
            this.f19336a = i10;
            this.f19338c = j10;
        }

        private void b() {
            this.f19340f = null;
            h0.this.f19331a.execute((Runnable) k4.a.e(h0.this.f19332b));
        }

        private void c() {
            d unused = h0.this.f19332b = null;
        }

        private long d() {
            return (long) Math.min((this.f19341g - 1) * 1000, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
        }

        public void a(boolean z10) {
            this.f19344j = z10;
            this.f19340f = null;
            if (hasMessages(0)) {
                this.f19343i = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f19343i = true;
                    this.f19337b.c();
                    Thread thread = this.f19342h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) k4.a.e(this.f19339d)).l(this.f19337b, elapsedRealtime, elapsedRealtime - this.f19338c, true);
                this.f19339d = null;
            }
        }

        public void e(int i10) throws IOException {
            IOException iOException = this.f19340f;
            if (iOException != null && this.f19341g > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            k4.a.f(h0.this.f19332b == null);
            d unused = h0.this.f19332b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                b();
            }
        }

        public void handleMessage(Message message) {
            long j10;
            if (!this.f19344j) {
                int i10 = message.what;
                if (i10 == 0) {
                    b();
                } else if (i10 != 3) {
                    c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j11 = elapsedRealtime - this.f19338c;
                    b bVar = (b) k4.a.e(this.f19339d);
                    if (this.f19343i) {
                        bVar.l(this.f19337b, elapsedRealtime, j11, false);
                        return;
                    }
                    int i11 = message.what;
                    if (i11 == 1) {
                        try {
                            bVar.k(this.f19337b, elapsedRealtime, j11);
                        } catch (RuntimeException e10) {
                            r.d("LoadTask", "Unexpected exception handling load completed", e10);
                            IOException unused = h0.this.f19333c = new h(e10);
                        }
                    } else if (i11 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f19340f = iOException;
                        int i12 = this.f19341g + 1;
                        this.f19341g = i12;
                        c o10 = bVar.o(this.f19337b, elapsedRealtime, j11, iOException, i12);
                        if (o10.f19334a == 3) {
                            IOException unused2 = h0.this.f19333c = this.f19340f;
                        } else if (o10.f19334a != 2) {
                            if (o10.f19334a == 1) {
                                this.f19341g = 1;
                            }
                            if (o10.f19335b != -9223372036854775807L) {
                                j10 = o10.f19335b;
                            } else {
                                j10 = d();
                            }
                            f(j10);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f19343i;
                    this.f19342h = Thread.currentThread();
                }
                if (z10) {
                    k0.a("load:" + this.f19337b.getClass().getSimpleName());
                    this.f19337b.a();
                    k0.c();
                }
                synchronized (this) {
                    this.f19342h = null;
                    Thread.interrupted();
                }
                if (!this.f19344j) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e10) {
                if (!this.f19344j) {
                    obtainMessage(2, e10).sendToTarget();
                }
            } catch (Exception e11) {
                if (!this.f19344j) {
                    r.d("LoadTask", "Unexpected exception loading stream", e11);
                    obtainMessage(2, new h(e11)).sendToTarget();
                }
            } catch (OutOfMemoryError e12) {
                if (!this.f19344j) {
                    r.d("LoadTask", "OutOfMemory error loading stream", e12);
                    obtainMessage(2, new h(e12)).sendToTarget();
                }
            } catch (Error e13) {
                if (!this.f19344j) {
                    r.d("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(3, e13).sendToTarget();
                }
                throw e13;
            } catch (Throwable th) {
                k0.c();
                throw th;
            }
        }
    }

    /* compiled from: Loader */
    public interface e {
        void a() throws IOException;

        void c();
    }

    /* compiled from: Loader */
    public interface f {
        void i();
    }

    /* compiled from: Loader */
    private static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final f f19346a;

        public g(f fVar) {
            this.f19346a = fVar;
        }

        public void run() {
            this.f19346a.i();
        }
    }

    /* compiled from: Loader */
    public static final class h extends IOException {
        public h(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public h0(String str) {
        this.f19331a = n0.D0("ExoPlayer:Loader:" + str);
    }

    public static c h(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    public void a() throws IOException {
        k(RecyclerView.UNDEFINED_DURATION);
    }

    public void f() {
        ((d) k4.a.h(this.f19332b)).a(false);
    }

    public void g() {
        this.f19333c = null;
    }

    public boolean i() {
        return this.f19333c != null;
    }

    public boolean j() {
        return this.f19332b != null;
    }

    public void k(int i10) throws IOException {
        IOException iOException = this.f19333c;
        if (iOException == null) {
            d<? extends e> dVar = this.f19332b;
            if (dVar != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = dVar.f19336a;
                }
                dVar.e(i10);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void l() {
        m((f) null);
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.f19332b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f19331a.execute(new g(fVar));
        }
        this.f19331a.shutdown();
    }

    public <T extends e> long n(T t10, b<T> bVar, int i10) {
        this.f19333c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d((Looper) k4.a.h(Looper.myLooper()), t10, bVar, i10, elapsedRealtime).f(0);
        return elapsedRealtime;
    }
}
