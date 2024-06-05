package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import fe.p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.a0;
import pe.c2;
import pe.g1;
import pe.k0;
import pe.p0;
import pe.q0;
import pe.r0;
import sd.w;
import xd.d;
import xd.g;

/* compiled from: CoroutineWorker.kt */
public abstract class CoroutineWorker extends ListenableWorker {
    private final k0 coroutineContext;
    private final androidx.work.impl.utils.futures.c<ListenableWorker.a> future;
    private final a0 job = i2.b((c2) null, 1, (Object) null);

    /* compiled from: CoroutineWorker.kt */
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f5082a;

        a(CoroutineWorker coroutineWorker) {
            this.f5082a = coroutineWorker;
        }

        public final void run() {
            if (this.f5082a.getFuture$work_runtime_ktx_release().isCancelled()) {
                c2.a.a(this.f5082a.getJob$work_runtime_ktx_release(), (CancellationException) null, 1, (Object) null);
            }
        }
    }

    @f(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    /* compiled from: CoroutineWorker.kt */
    static final class b extends l implements p<p0, d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f5083a;

        /* renamed from: b  reason: collision with root package name */
        int f5084b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m<h> f5085c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f5086d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(m<h> mVar, CoroutineWorker coroutineWorker, d<? super b> dVar) {
            super(2, dVar);
            this.f5085c = mVar;
            this.f5086d = coroutineWorker;
        }

        public final d<w> create(Object obj, d<?> dVar) {
            return new b(this.f5085c, this.f5086d, dVar);
        }

        public final Object invoke(p0 p0Var, d<? super w> dVar) {
            return ((b) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            m<h> mVar;
            Object c10 = d.c();
            int i10 = this.f5084b;
            if (i10 == 0) {
                sd.p.b(obj);
                m<h> mVar2 = this.f5085c;
                CoroutineWorker coroutineWorker = this.f5086d;
                this.f5083a = mVar2;
                this.f5084b = 1;
                Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
                if (foregroundInfo == c10) {
                    return c10;
                }
                mVar = mVar2;
                obj = foregroundInfo;
            } else if (i10 == 1) {
                mVar = (m) this.f5083a;
                sd.p.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar.c(obj);
            return w.f38141a;
        }
    }

    @f(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
    /* compiled from: CoroutineWorker.kt */
    static final class c extends l implements p<p0, d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f5087a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f5088b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CoroutineWorker coroutineWorker, d<? super c> dVar) {
            super(2, dVar);
            this.f5088b = coroutineWorker;
        }

        public final d<w> create(Object obj, d<?> dVar) {
            return new c(this.f5088b, dVar);
        }

        public final Object invoke(p0 p0Var, d<? super w> dVar) {
            return ((c) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f5087a;
            if (i10 == 0) {
                sd.p.b(obj);
                CoroutineWorker coroutineWorker = this.f5088b;
                this.f5087a = 1;
                obj = coroutineWorker.doWork(this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                try {
                    sd.p.b(obj);
                } catch (Throwable th) {
                    this.f5088b.getFuture$work_runtime_ktx_release().q(th);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f5088b.getFuture$work_runtime_ktx_release().p((ListenableWorker.a) obj);
            return w.f38141a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        m.e(context, "appContext");
        m.e(workerParameters, "params");
        androidx.work.impl.utils.futures.c<ListenableWorker.a> t10 = androidx.work.impl.utils.futures.c.t();
        m.d(t10, "create()");
        this.future = t10;
        t10.a(new a(this), getTaskExecutor().c());
        this.coroutineContext = g1.a();
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, d dVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(d<? super ListenableWorker.a> dVar);

    public k0 getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(d<? super h> dVar) {
        return getForegroundInfo$suspendImpl(this, dVar);
    }

    public final w6.f<h> getForegroundInfoAsync() {
        a0 b10 = i2.b((c2) null, 1, (Object) null);
        p0 a10 = q0.a(getCoroutineContext().plus(b10));
        m mVar = new m(b10, (androidx.work.impl.utils.futures.c) null, 2, (h) null);
        c2 unused = k.d(a10, (g) null, (r0) null, new b(mVar, this, (d<? super b>) null), 3, (Object) null);
        return mVar;
    }

    public final androidx.work.impl.utils.futures.c<ListenableWorker.a> getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final a0 getJob$work_runtime_ktx_release() {
        return this.job;
    }

    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object setForeground(androidx.work.h r4, xd.d<? super sd.w> r5) {
        /*
            r3 = this;
            w6.f r4 = r3.setForegroundAsync(r4)
            java.lang.String r0 = "setForegroundAsync(foregroundInfo)"
            kotlin.jvm.internal.m.d(r4, r0)
            boolean r0 = r4.isDone()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r4 = r4.get()     // Catch:{ ExecutionException -> 0x0014 }
            goto L_0x004a
        L_0x0014:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r4 = r5
        L_0x001d:
            throw r4
        L_0x001e:
            pe.p r0 = new pe.p
            xd.d r1 = yd.c.b(r5)
            r2 = 1
            r0.<init>(r1, r2)
            r0.C()
            androidx.work.n r1 = new androidx.work.n
            r1.<init>(r0, r4)
            androidx.work.f r2 = androidx.work.f.INSTANCE
            r4.a(r1, r2)
            androidx.work.o r1 = new androidx.work.o
            r1.<init>(r4)
            r0.o(r1)
            java.lang.Object r4 = r0.z()
            java.lang.Object r0 = yd.d.c()
            if (r4 != r0) goto L_0x004a
            kotlin.coroutines.jvm.internal.h.c(r5)
        L_0x004a:
            java.lang.Object r5 = yd.d.c()
            if (r4 != r5) goto L_0x0051
            return r4
        L_0x0051:
            sd.w r4 = sd.w.f38141a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.CoroutineWorker.setForeground(androidx.work.h, xd.d):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object setProgress(androidx.work.e r4, xd.d<? super sd.w> r5) {
        /*
            r3 = this;
            w6.f r4 = r3.setProgressAsync(r4)
            java.lang.String r0 = "setProgressAsync(data)"
            kotlin.jvm.internal.m.d(r4, r0)
            boolean r0 = r4.isDone()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r4 = r4.get()     // Catch:{ ExecutionException -> 0x0014 }
            goto L_0x004a
        L_0x0014:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r4 = r5
        L_0x001d:
            throw r4
        L_0x001e:
            pe.p r0 = new pe.p
            xd.d r1 = yd.c.b(r5)
            r2 = 1
            r0.<init>(r1, r2)
            r0.C()
            androidx.work.n r1 = new androidx.work.n
            r1.<init>(r0, r4)
            androidx.work.f r2 = androidx.work.f.INSTANCE
            r4.a(r1, r2)
            androidx.work.o r1 = new androidx.work.o
            r1.<init>(r4)
            r0.o(r1)
            java.lang.Object r4 = r0.z()
            java.lang.Object r0 = yd.d.c()
            if (r4 != r0) goto L_0x004a
            kotlin.coroutines.jvm.internal.h.c(r5)
        L_0x004a:
            java.lang.Object r5 = yd.d.c()
            if (r4 != r5) goto L_0x0051
            return r4
        L_0x0051:
            sd.w r4 = sd.w.f38141a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.CoroutineWorker.setProgress(androidx.work.e, xd.d):java.lang.Object");
    }

    public final w6.f<ListenableWorker.a> startWork() {
        c2 unused = k.d(q0.a(getCoroutineContext().plus(this.job)), (g) null, (r0) null, new c(this, (d<? super c>) null), 3, (Object) null);
        return this.future;
    }
}
