package androidx.work.impl.utils.futures;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractFuture */
public abstract class a<V> implements w6.f<V> {

    /* renamed from: d  reason: collision with root package name */
    static final boolean f5285d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f5286f = Logger.getLogger(a.class.getName());

    /* renamed from: g  reason: collision with root package name */
    static final b f5287g;

    /* renamed from: h  reason: collision with root package name */
    private static final Object f5288h = new Object();

    /* renamed from: a  reason: collision with root package name */
    volatile Object f5289a;

    /* renamed from: b  reason: collision with root package name */
    volatile e f5290b;

    /* renamed from: c  reason: collision with root package name */
    volatile i f5291c;

    /* compiled from: AbstractFuture */
    private static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean c(a<?> aVar, i iVar, i iVar2);

        /* access modifiers changed from: package-private */
        public abstract void d(i iVar, i iVar2);

        /* access modifiers changed from: package-private */
        public abstract void e(i iVar, Thread thread);
    }

    /* compiled from: AbstractFuture */
    private static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f5292c;

        /* renamed from: d  reason: collision with root package name */
        static final c f5293d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f5294a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f5295b;

        static {
            if (a.f5285d) {
                f5293d = null;
                f5292c = null;
                return;
            }
            f5293d = new c(false, (Throwable) null);
            f5292c = new c(true, (Throwable) null);
        }

        c(boolean z10, Throwable th) {
            this.f5294a = z10;
            this.f5295b = th;
        }
    }

    /* compiled from: AbstractFuture */
    private static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f5296b = new d(new C0095a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f5297a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a  reason: collision with other inner class name */
        /* compiled from: AbstractFuture */
        class C0095a extends Throwable {
            C0095a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f5297a = (Throwable) a.e(th);
        }
    }

    /* compiled from: AbstractFuture */
    private static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f5298d = new e((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f5299a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f5300b;

        /* renamed from: c  reason: collision with root package name */
        e f5301c;

        e(Runnable runnable, Executor executor) {
            this.f5299a = runnable;
            this.f5300b = executor;
        }
    }

    /* compiled from: AbstractFuture */
    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f5302a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f5303b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f5304c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f5305d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f5306e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f5302a = atomicReferenceFieldUpdater;
            this.f5303b = atomicReferenceFieldUpdater2;
            this.f5304c = atomicReferenceFieldUpdater3;
            this.f5305d = atomicReferenceFieldUpdater4;
            this.f5306e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f5305d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f5306e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f5304c, aVar, iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar, i iVar2) {
            this.f5303b.lazySet(iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar, Thread thread) {
            this.f5302a.lazySet(iVar, thread);
        }
    }

    /* compiled from: AbstractFuture */
    private static final class g<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final a<V> f5307a;

        /* renamed from: b  reason: collision with root package name */
        final w6.f<? extends V> f5308b;

        g(a<V> aVar, w6.f<? extends V> fVar) {
            this.f5307a = aVar;
            this.f5308b = fVar;
        }

        public void run() {
            if (this.f5307a.f5289a == this) {
                if (a.f5287g.b(this.f5307a, this, a.j(this.f5308b))) {
                    a.g(this.f5307a);
                }
            }
        }
    }

    /* compiled from: AbstractFuture */
    private static final class h extends b {
        h() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f5290b != eVar) {
                    return false;
                }
                aVar.f5290b = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f5289a != obj) {
                    return false;
                }
                aVar.f5289a = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f5291c != iVar) {
                    return false;
                }
                aVar.f5291c = iVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar, i iVar2) {
            iVar.f5311b = iVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar, Thread thread) {
            iVar.f5310a = thread;
        }
    }

    /* compiled from: AbstractFuture */
    private static final class i {

        /* renamed from: c  reason: collision with root package name */
        static final i f5309c = new i(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f5310a;

        /* renamed from: b  reason: collision with root package name */
        volatile i f5311b;

        i(boolean z10) {
        }

        /* access modifiers changed from: package-private */
        public void a(i iVar) {
            a.f5287g.d(this, iVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Thread thread = this.f5310a;
            if (thread != null) {
                this.f5310a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f5287g.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.work.impl.utils.futures.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.work.impl.utils.futures.a$i> r0 = androidx.work.impl.utils.futures.a.i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f5285d = r1
            java.lang.Class<androidx.work.impl.utils.futures.a> r1 = androidx.work.impl.utils.futures.a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f5286f = r1
            androidx.work.impl.utils.futures.a$f r1 = new androidx.work.impl.utils.futures.a$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.a> r2 = androidx.work.impl.utils.futures.a.class
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.a> r0 = androidx.work.impl.utils.futures.a.class
            java.lang.Class<androidx.work.impl.utils.futures.a$e> r2 = androidx.work.impl.utils.futures.a.e.class
            java.lang.String r6 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.a> r0 = androidx.work.impl.utils.futures.a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.work.impl.utils.futures.a$h r1 = new androidx.work.impl.utils.futures.a$h
            r1.<init>()
        L_0x0054:
            f5287g = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f5286f
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f5288h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.a.<clinit>():void");
    }

    protected a() {
    }

    private void b(StringBuilder sb2) {
        try {
            Object k10 = k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(s(k10));
            sb2.append("]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private static CancellationException d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T e(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    private e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f5290b;
        } while (!f5287g.a(this, eVar2, e.f5298d));
        e eVar3 = eVar2;
        e eVar4 = eVar;
        e eVar5 = eVar3;
        while (eVar5 != null) {
            e eVar6 = eVar5.f5301c;
            eVar5.f5301c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    static void g(a<?> aVar) {
        e eVar = null;
        a<V> aVar2 = aVar;
        while (true) {
            aVar2.n();
            aVar2.c();
            e f10 = aVar2.f(eVar);
            while (true) {
                if (f10 != null) {
                    eVar = f10.f5301c;
                    Runnable runnable = f10.f5299a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        a<V> aVar3 = gVar.f5307a;
                        if (aVar3.f5289a == gVar) {
                            if (f5287g.b(aVar3, gVar, j(gVar.f5308b))) {
                                aVar2 = aVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        h(runnable, f10.f5300b);
                    }
                    f10 = eVar;
                } else {
                    return;
                }
            }
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f5286f;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e10);
        }
    }

    private V i(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).f5295b);
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f5297a);
        } else if (obj == f5288h) {
            return null;
        } else {
            return obj;
        }
    }

    static Object j(w6.f<?> fVar) {
        if (fVar instanceof a) {
            Object obj = ((a) fVar).f5289a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (!cVar.f5294a) {
                return obj;
            }
            if (cVar.f5295b != null) {
                return new c(false, cVar.f5295b);
            }
            return c.f5293d;
        }
        boolean isCancelled = fVar.isCancelled();
        if ((!f5285d) && isCancelled) {
            return c.f5293d;
        }
        try {
            Object k10 = k(fVar);
            return k10 == null ? f5288h : k10;
        } catch (ExecutionException e10) {
            return new d(e10.getCause());
        } catch (CancellationException e11) {
            if (isCancelled) {
                return new c(false, e11);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + fVar, e11));
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static <V> V k(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    private void n() {
        i iVar;
        do {
            iVar = this.f5291c;
        } while (!f5287g.c(this, iVar, i.f5309c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f5311b;
        }
    }

    private void o(i iVar) {
        iVar.f5310a = null;
        while (true) {
            i iVar2 = this.f5291c;
            if (iVar2 != i.f5309c) {
                i iVar3 = null;
                while (iVar2 != null) {
                    i iVar4 = iVar2.f5311b;
                    if (iVar2.f5310a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f5311b = iVar4;
                        if (iVar3.f5310a == null) {
                        }
                    } else if (!f5287g.c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final void a(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f5290b;
        if (eVar != e.f5298d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f5301c = eVar;
                if (!f5287g.a(this, eVar, eVar2)) {
                    eVar = this.f5290b;
                } else {
                    return;
                }
            } while (eVar != e.f5298d);
        }
        h(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, w6.f<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f5289a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.a.g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f5285d
            if (r3 == 0) goto L_0x001f
            androidx.work.impl.utils.futures.a$c r3 = new androidx.work.impl.utils.futures.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.work.impl.utils.futures.a$c r3 = androidx.work.impl.utils.futures.a.c.f5292c
            goto L_0x0026
        L_0x0024:
            androidx.work.impl.utils.futures.a$c r3 = androidx.work.impl.utils.futures.a.c.f5293d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            androidx.work.impl.utils.futures.a$b r6 = f5287g
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.l()
        L_0x0035:
            g(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.a.g
            if (r4 == 0) goto L_0x0062
            androidx.work.impl.utils.futures.a$g r0 = (androidx.work.impl.utils.futures.a.g) r0
            w6.f<? extends V> r0 = r0.f5308b
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.a
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.work.impl.utils.futures.a r4 = (androidx.work.impl.utils.futures.a) r4
            java.lang.Object r0 = r4.f5289a
            if (r0 != 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.a.g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = 1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f5289a
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.a.g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.a.cancel(boolean):boolean");
    }

    public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j11 = j10;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f5289a;
            if ((obj != null) && (!(obj instanceof g))) {
                return i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                i iVar = this.f5291c;
                if (iVar != i.f5309c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (f5287g.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5289a;
                                    if ((obj2 != null) && (!(obj2 instanceof g))) {
                                        return i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    o(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            o(iVar2);
                        } else {
                            iVar = this.f5291c;
                        }
                    } while (iVar != i.f5309c);
                }
                return i(this.f5289a);
            }
            while (nanos > 0) {
                Object obj3 = this.f5289a;
                if ((obj3 != null) && (!(obj3 instanceof g))) {
                    return i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String timeUnit3 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit3.toLowerCase(locale);
            String str = "Waited " + j11 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j12 = -nanos;
                long convert = timeUnit2.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit2.toNanos(convert);
                int i10 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z10 = i10 == 0 || nanos2 > 1000;
                if (i10 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z10) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z10) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f5289a instanceof c;
    }

    public final boolean isDone() {
        Object obj = this.f5289a;
        return (!(obj instanceof g)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    public void l() {
    }

    /* access modifiers changed from: protected */
    public String m() {
        Object obj = this.f5289a;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f5308b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    public boolean p(V v10) {
        if (v10 == null) {
            v10 = f5288h;
        }
        if (!f5287g.b(this, (Object) null, v10)) {
            return false;
        }
        g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean q(Throwable th) {
        if (!f5287g.b(this, (Object) null, new d((Throwable) e(th)))) {
            return false;
        }
        g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean r(w6.f<? extends V> fVar) {
        g gVar;
        d dVar;
        e(fVar);
        Object obj = this.f5289a;
        if (obj == null) {
            if (fVar.isDone()) {
                if (!f5287g.b(this, (Object) null, j(fVar))) {
                    return false;
                }
                g(this);
                return true;
            }
            gVar = new g(this, fVar);
            if (f5287g.b(this, (Object) null, gVar)) {
                try {
                    fVar.a(gVar, b.INSTANCE);
                } catch (Throwable unused) {
                    dVar = d.f5296b;
                }
                return true;
            }
            obj = this.f5289a;
        }
        if (obj instanceof c) {
            fVar.cancel(((c) obj).f5294a);
        }
        return false;
        f5287g.b(this, gVar, dVar);
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = m();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5289a;
            if ((obj2 != null) && (!(obj2 instanceof g))) {
                return i(obj2);
            }
            i iVar = this.f5291c;
            if (iVar != i.f5309c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f5287g.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5289a;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    iVar = this.f5291c;
                } while (iVar != i.f5309c);
            }
            return i(this.f5289a);
        }
        throw new InterruptedException();
    }
}
