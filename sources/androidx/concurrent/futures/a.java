package androidx.concurrent.futures;

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

/* compiled from: AbstractResolvableFuture */
public abstract class a<V> implements w6.f<V> {

    /* renamed from: d  reason: collision with root package name */
    static final boolean f1998d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f1999f = Logger.getLogger(a.class.getName());

    /* renamed from: g  reason: collision with root package name */
    static final b f2000g;

    /* renamed from: h  reason: collision with root package name */
    private static final Object f2001h = new Object();

    /* renamed from: a  reason: collision with root package name */
    volatile Object f2002a;

    /* renamed from: b  reason: collision with root package name */
    volatile e f2003b;

    /* renamed from: c  reason: collision with root package name */
    volatile i f2004c;

    /* compiled from: AbstractResolvableFuture */
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

    /* compiled from: AbstractResolvableFuture */
    private static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f2005c;

        /* renamed from: d  reason: collision with root package name */
        static final c f2006d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f2007a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f2008b;

        static {
            if (a.f1998d) {
                f2006d = null;
                f2005c = null;
                return;
            }
            f2006d = new c(false, (Throwable) null);
            f2005c = new c(true, (Throwable) null);
        }

        c(boolean z10, Throwable th) {
            this.f2007a = z10;
            this.f2008b = th;
        }
    }

    /* compiled from: AbstractResolvableFuture */
    private static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f2009b = new d(new C0022a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f2010a;

        /* renamed from: androidx.concurrent.futures.a$d$a  reason: collision with other inner class name */
        /* compiled from: AbstractResolvableFuture */
        class C0022a extends Throwable {
            C0022a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f2010a = (Throwable) a.f(th);
        }
    }

    /* compiled from: AbstractResolvableFuture */
    private static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f2011d = new e((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f2012a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f2013b;

        /* renamed from: c  reason: collision with root package name */
        e f2014c;

        e(Runnable runnable, Executor executor) {
            this.f2012a = runnable;
            this.f2013b = executor;
        }
    }

    /* compiled from: AbstractResolvableFuture */
    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f2015a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f2016b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f2017c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f2018d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f2019e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f2015a = atomicReferenceFieldUpdater;
            this.f2016b = atomicReferenceFieldUpdater2;
            this.f2017c = atomicReferenceFieldUpdater3;
            this.f2018d = atomicReferenceFieldUpdater4;
            this.f2019e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return b.a(this.f2018d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return b.a(this.f2019e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            return b.a(this.f2017c, aVar, iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar, i iVar2) {
            this.f2016b.lazySet(iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar, Thread thread) {
            this.f2015a.lazySet(iVar, thread);
        }
    }

    /* compiled from: AbstractResolvableFuture */
    private static final class g<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final a<V> f2020a;

        /* renamed from: b  reason: collision with root package name */
        final w6.f<? extends V> f2021b;

        public void run() {
            if (this.f2020a.f2002a == this) {
                if (a.f2000g.b(this.f2020a, this, a.k(this.f2021b))) {
                    a.h(this.f2020a);
                }
            }
        }
    }

    /* compiled from: AbstractResolvableFuture */
    private static final class h extends b {
        h() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f2003b != eVar) {
                    return false;
                }
                aVar.f2003b = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f2002a != obj) {
                    return false;
                }
                aVar.f2002a = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f2004c != iVar) {
                    return false;
                }
                aVar.f2004c = iVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar, i iVar2) {
            iVar.f2024b = iVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar, Thread thread) {
            iVar.f2023a = thread;
        }
    }

    /* compiled from: AbstractResolvableFuture */
    private static final class i {

        /* renamed from: c  reason: collision with root package name */
        static final i f2022c = new i(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f2023a;

        /* renamed from: b  reason: collision with root package name */
        volatile i f2024b;

        i(boolean z10) {
        }

        /* access modifiers changed from: package-private */
        public void a(i iVar) {
            a.f2000g.d(this, iVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Thread thread = this.f2023a;
            if (thread != null) {
                this.f2023a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f2000g.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.concurrent.futures.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.concurrent.futures.a$i> r0 = androidx.concurrent.futures.a.i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f1998d = r1
            java.lang.Class<androidx.concurrent.futures.a> r1 = androidx.concurrent.futures.a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f1999f = r1
            androidx.concurrent.futures.a$f r1 = new androidx.concurrent.futures.a$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.concurrent.futures.a> r2 = androidx.concurrent.futures.a.class
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.concurrent.futures.a> r0 = androidx.concurrent.futures.a.class
            java.lang.Class<androidx.concurrent.futures.a$e> r2 = androidx.concurrent.futures.a.e.class
            java.lang.String r6 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.concurrent.futures.a> r0 = androidx.concurrent.futures.a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.concurrent.futures.a$h r1 = new androidx.concurrent.futures.a$h
            r1.<init>()
        L_0x0054:
            f2000g = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f1999f
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f2001h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.a.<clinit>():void");
    }

    protected a() {
    }

    private void c(StringBuilder sb2) {
        try {
            Object l10 = l(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(s(l10));
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

    private static CancellationException e(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T f(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    private e g(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f2003b;
        } while (!f2000g.a(this, eVar2, e.f2011d));
        e eVar3 = eVar2;
        e eVar4 = eVar;
        e eVar5 = eVar3;
        while (eVar5 != null) {
            e eVar6 = eVar5.f2014c;
            eVar5.f2014c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    static void h(a<?> aVar) {
        e eVar = null;
        a<V> aVar2 = aVar;
        while (true) {
            aVar2.o();
            aVar2.d();
            e g10 = aVar2.g(eVar);
            while (true) {
                if (g10 != null) {
                    eVar = g10.f2014c;
                    Runnable runnable = g10.f2012a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        a<V> aVar3 = gVar.f2020a;
                        if (aVar3.f2002a == gVar) {
                            if (f2000g.b(aVar3, gVar, k(gVar.f2021b))) {
                                aVar2 = aVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        i(runnable, g10.f2013b);
                    }
                    g10 = eVar;
                } else {
                    return;
                }
            }
        }
    }

    private static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f1999f;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e10);
        }
    }

    private V j(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw e("Task was cancelled.", ((c) obj).f2008b);
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f2010a);
        } else if (obj == f2001h) {
            return null;
        } else {
            return obj;
        }
    }

    static Object k(w6.f<?> fVar) {
        if (fVar instanceof a) {
            Object obj = ((a) fVar).f2002a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (!cVar.f2007a) {
                return obj;
            }
            if (cVar.f2008b != null) {
                return new c(false, cVar.f2008b);
            }
            return c.f2006d;
        }
        boolean isCancelled = fVar.isCancelled();
        if ((!f1998d) && isCancelled) {
            return c.f2006d;
        }
        try {
            Object l10 = l(fVar);
            return l10 == null ? f2001h : l10;
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

    static <V> V l(Future<V> future) throws ExecutionException {
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

    private void o() {
        i iVar;
        do {
            iVar = this.f2004c;
        } while (!f2000g.c(this, iVar, i.f2022c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f2024b;
        }
    }

    private void p(i iVar) {
        iVar.f2023a = null;
        while (true) {
            i iVar2 = this.f2004c;
            if (iVar2 != i.f2022c) {
                i iVar3 = null;
                while (iVar2 != null) {
                    i iVar4 = iVar2.f2024b;
                    if (iVar2.f2023a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f2024b = iVar4;
                        if (iVar3.f2023a == null) {
                        }
                    } else if (!f2000g.c(this, iVar2, iVar4)) {
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
        f(runnable);
        f(executor);
        e eVar = this.f2003b;
        if (eVar != e.f2011d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f2014c = eVar;
                if (!f2000g.a(this, eVar, eVar2)) {
                    eVar = this.f2003b;
                } else {
                    return;
                }
            } while (eVar != e.f2011d);
        }
        i(runnable, executor);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, w6.f<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f2002a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof androidx.concurrent.futures.a.g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f1998d
            if (r3 == 0) goto L_0x001f
            androidx.concurrent.futures.a$c r3 = new androidx.concurrent.futures.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.concurrent.futures.a$c r3 = androidx.concurrent.futures.a.c.f2005c
            goto L_0x0026
        L_0x0024:
            androidx.concurrent.futures.a$c r3 = androidx.concurrent.futures.a.c.f2006d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            androidx.concurrent.futures.a$b r6 = f2000g
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.m()
        L_0x0035:
            h(r4)
            boolean r4 = r0 instanceof androidx.concurrent.futures.a.g
            if (r4 == 0) goto L_0x0062
            androidx.concurrent.futures.a$g r0 = (androidx.concurrent.futures.a.g) r0
            w6.f<? extends V> r0 = r0.f2021b
            boolean r4 = r0 instanceof androidx.concurrent.futures.a
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.concurrent.futures.a r4 = (androidx.concurrent.futures.a) r4
            java.lang.Object r0 = r4.f2002a
            if (r0 != 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r6 = r0 instanceof androidx.concurrent.futures.a.g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = 1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f2002a
            boolean r6 = r0 instanceof androidx.concurrent.futures.a.g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.a.cancel(boolean):boolean");
    }

    /* access modifiers changed from: protected */
    public void d() {
    }

    public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j11 = j10;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f2002a;
            if ((obj != null) && (!(obj instanceof g))) {
                return j(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                i iVar = this.f2004c;
                if (iVar != i.f2022c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (f2000g.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f2002a;
                                    if ((obj2 != null) && (!(obj2 instanceof g))) {
                                        return j(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    p(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            p(iVar2);
                        } else {
                            iVar = this.f2004c;
                        }
                    } while (iVar != i.f2022c);
                }
                return j(this.f2002a);
            }
            while (nanos > 0) {
                Object obj3 = this.f2002a;
                if ((obj3 != null) && (!(obj3 instanceof g))) {
                    return j(obj3);
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
        return this.f2002a instanceof c;
    }

    public final boolean isDone() {
        Object obj = this.f2002a;
        return (!(obj instanceof g)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    public void m() {
    }

    /* access modifiers changed from: protected */
    public String n() {
        Object obj = this.f2002a;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f2021b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    public boolean q(V v10) {
        if (v10 == null) {
            v10 = f2001h;
        }
        if (!f2000g.b(this, (Object) null, v10)) {
            return false;
        }
        h(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean r(Throwable th) {
        if (!f2000g.b(this, (Object) null, new d((Throwable) f(th)))) {
            return false;
        }
        h(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        Object obj = this.f2002a;
        return (obj instanceof c) && ((c) obj).f2007a;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            c(sb2);
        } else {
            try {
                str = n();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                c(sb2);
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
            Object obj2 = this.f2002a;
            if ((obj2 != null) && (!(obj2 instanceof g))) {
                return j(obj2);
            }
            i iVar = this.f2004c;
            if (iVar != i.f2022c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f2000g.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2002a;
                            } else {
                                p(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return j(obj);
                    }
                    iVar = this.f2004c;
                } while (iVar != i.f2022c);
            }
            return j(this.f2002a);
        }
        throw new InterruptedException();
    }
}
