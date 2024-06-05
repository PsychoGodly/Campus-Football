package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class jc {

    /* renamed from: d  reason: collision with root package name */
    public static final c f8720d = a(false, -9223372036854775807L);

    /* renamed from: e  reason: collision with root package name */
    public static final c f8721e = a(true, -9223372036854775807L);

    /* renamed from: f  reason: collision with root package name */
    public static final c f8722f = new c(2, -9223372036854775807L);

    /* renamed from: g  reason: collision with root package name */
    public static final c f8723g = new c(3, -9223372036854775807L);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f8724a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public d f8725b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public IOException f8726c;

    public interface b {
        c a(e eVar, long j10, long j11, IOException iOException, int i10);

        void a(e eVar, long j10, long j11);

        void a(e eVar, long j10, long j11, boolean z10);
    }

    public static final class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f8727a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f8728b;

        private c(int i10, long j10) {
            this.f8727a = i10;
            this.f8728b = j10;
        }

        public boolean a() {
            int i10 = this.f8727a;
            return i10 == 0 || i10 == 1;
        }
    }

    public interface e {
        void a();

        void b();
    }

    public interface f {
        void d();
    }

    private static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final f f8739a;

        public g(f fVar) {
            this.f8739a = fVar;
        }

        public void run() {
            this.f8739a.d();
        }
    }

    public static final class h extends IOException {
        public h(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public jc(String str) {
        this.f8724a = yp.e("ExoPlayer:Loader:" + str);
    }

    public boolean c() {
        return this.f8726c != null;
    }

    public boolean d() {
        return this.f8725b != null;
    }

    public void b() {
        this.f8726c = null;
    }

    public void a() {
        ((d) a1.b((Object) this.f8725b)).a(false);
    }

    public void a(int i10) {
        IOException iOException = this.f8726c;
        if (iOException == null) {
            d dVar = this.f8725b;
            if (dVar != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = dVar.f8729a;
                }
                dVar.a(i10);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void a(f fVar) {
        d dVar = this.f8725b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f8724a.execute(new g(fVar));
        }
        this.f8724a.shutdown();
    }

    public long a(e eVar, b bVar, int i10) {
        this.f8726c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d((Looper) a1.b((Object) Looper.myLooper()), eVar, bVar, i10, elapsedRealtime).a(0);
        return elapsedRealtime;
    }

    private final class d extends Handler implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final int f8729a;

        /* renamed from: b  reason: collision with root package name */
        private final e f8730b;

        /* renamed from: c  reason: collision with root package name */
        private final long f8731c;

        /* renamed from: d  reason: collision with root package name */
        private b f8732d;

        /* renamed from: f  reason: collision with root package name */
        private IOException f8733f;

        /* renamed from: g  reason: collision with root package name */
        private int f8734g;

        /* renamed from: h  reason: collision with root package name */
        private Thread f8735h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f8736i;

        /* renamed from: j  reason: collision with root package name */
        private volatile boolean f8737j;

        public d(Looper looper, e eVar, b bVar, int i10, long j10) {
            super(looper);
            this.f8730b = eVar;
            this.f8732d = bVar;
            this.f8729a = i10;
            this.f8731c = j10;
        }

        private void b() {
            d unused = jc.this.f8725b = null;
        }

        private long c() {
            return (long) Math.min((this.f8734g - 1) * 1000, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
        }

        public void a(boolean z10) {
            this.f8737j = z10;
            this.f8733f = null;
            if (hasMessages(0)) {
                this.f8736i = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f8736i = true;
                    this.f8730b.b();
                    Thread thread = this.f8735h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) a1.a((Object) this.f8732d)).a(this.f8730b, elapsedRealtime, elapsedRealtime - this.f8731c, true);
                this.f8732d = null;
            }
        }

        public void handleMessage(Message message) {
            long j10;
            if (!this.f8737j) {
                int i10 = message.what;
                if (i10 == 0) {
                    a();
                } else if (i10 != 3) {
                    b();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j11 = elapsedRealtime - this.f8731c;
                    b bVar = (b) a1.a((Object) this.f8732d);
                    if (this.f8736i) {
                        bVar.a(this.f8730b, elapsedRealtime, j11, false);
                        return;
                    }
                    int i11 = message.what;
                    if (i11 == 1) {
                        try {
                            bVar.a(this.f8730b, elapsedRealtime, j11);
                        } catch (RuntimeException e10) {
                            kc.a("LoadTask", "Unexpected exception handling load completed", e10);
                            IOException unused = jc.this.f8726c = new h(e10);
                        }
                    } else if (i11 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f8733f = iOException;
                        int i12 = this.f8734g + 1;
                        this.f8734g = i12;
                        c a10 = bVar.a(this.f8730b, elapsedRealtime, j11, iOException, i12);
                        if (a10.f8727a == 3) {
                            IOException unused2 = jc.this.f8726c = this.f8733f;
                        } else if (a10.f8727a != 2) {
                            if (a10.f8727a == 1) {
                                this.f8734g = 1;
                            }
                            if (a10.f8728b != -9223372036854775807L) {
                                j10 = a10.f8728b;
                            } else {
                                j10 = c();
                            }
                            a(j10);
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
                    z10 = !this.f8736i;
                    this.f8735h = Thread.currentThread();
                }
                if (z10) {
                    lo.a("load:" + this.f8730b.getClass().getSimpleName());
                    this.f8730b.a();
                    lo.a();
                }
                synchronized (this) {
                    this.f8735h = null;
                    Thread.interrupted();
                }
                if (!this.f8737j) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e10) {
                if (!this.f8737j) {
                    obtainMessage(2, e10).sendToTarget();
                }
            } catch (Exception e11) {
                if (!this.f8737j) {
                    kc.a("LoadTask", "Unexpected exception loading stream", e11);
                    obtainMessage(2, new h(e11)).sendToTarget();
                }
            } catch (OutOfMemoryError e12) {
                if (!this.f8737j) {
                    kc.a("LoadTask", "OutOfMemory error loading stream", e12);
                    obtainMessage(2, new h(e12)).sendToTarget();
                }
            } catch (Error e13) {
                if (!this.f8737j) {
                    kc.a("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(3, e13).sendToTarget();
                }
                throw e13;
            } catch (Throwable th) {
                lo.a();
                throw th;
            }
        }

        private void a() {
            this.f8733f = null;
            jc.this.f8724a.execute((Runnable) a1.a((Object) jc.this.f8725b));
        }

        public void a(int i10) {
            IOException iOException = this.f8733f;
            if (iOException != null && this.f8734g > i10) {
                throw iOException;
            }
        }

        public void a(long j10) {
            a1.b(jc.this.f8725b == null);
            d unused = jc.this.f8725b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                a();
            }
        }
    }

    public static c a(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }
}
