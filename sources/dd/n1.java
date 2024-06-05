package dd;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import r6.o;

/* compiled from: SynchronizationContext */
public final class n1 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f32301a;

    /* renamed from: b  reason: collision with root package name */
    private final Queue<Runnable> f32302b = new ConcurrentLinkedQueue();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<Thread> f32303c = new AtomicReference<>();

    /* compiled from: SynchronizationContext */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f32304a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f32305b;

        a(c cVar, Runnable runnable) {
            this.f32304a = cVar;
            this.f32305b = runnable;
        }

        public void run() {
            n1.this.execute(this.f32304a);
        }

        public String toString() {
            return this.f32305b.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    /* compiled from: SynchronizationContext */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f32307a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f32308b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f32309c;

        b(c cVar, Runnable runnable, long j10) {
            this.f32307a = cVar;
            this.f32308b = runnable;
            this.f32309c = j10;
        }

        public void run() {
            n1.this.execute(this.f32307a);
        }

        public String toString() {
            return this.f32308b.toString() + "(scheduled in SynchronizationContext with delay of " + this.f32309c + ")";
        }
    }

    /* compiled from: SynchronizationContext */
    private static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final Runnable f32311a;

        /* renamed from: b  reason: collision with root package name */
        boolean f32312b;

        /* renamed from: c  reason: collision with root package name */
        boolean f32313c;

        c(Runnable runnable) {
            this.f32311a = (Runnable) o.p(runnable, "task");
        }

        public void run() {
            if (!this.f32312b) {
                this.f32313c = true;
                this.f32311a.run();
            }
        }
    }

    /* compiled from: SynchronizationContext */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final c f32314a;

        /* renamed from: b  reason: collision with root package name */
        private final ScheduledFuture<?> f32315b;

        /* synthetic */ d(c cVar, ScheduledFuture scheduledFuture, a aVar) {
            this(cVar, scheduledFuture);
        }

        public void a() {
            this.f32314a.f32312b = true;
            this.f32315b.cancel(false);
        }

        public boolean b() {
            c cVar = this.f32314a;
            return !cVar.f32313c && !cVar.f32312b;
        }

        private d(c cVar, ScheduledFuture<?> scheduledFuture) {
            this.f32314a = (c) o.p(cVar, "runnable");
            this.f32315b = (ScheduledFuture) o.p(scheduledFuture, "future");
        }
    }

    public n1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f32301a = (Thread.UncaughtExceptionHandler) o.p(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    public final void a() {
        while (this.f32303c.compareAndSet((Object) null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable poll = this.f32302b.poll();
                    if (poll != null) {
                        poll.run();
                    } else {
                        this.f32303c.set((Object) null);
                        if (this.f32302b.isEmpty()) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    this.f32303c.set((Object) null);
                    throw th;
                }
            }
        }
    }

    public final void b(Runnable runnable) {
        this.f32302b.add((Runnable) o.p(runnable, "runnable is null"));
    }

    public final d c(Runnable runnable, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.schedule(new a(cVar, runnable), j10, timeUnit), (a) null);
    }

    public final d d(Runnable runnable, long j10, long j11, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.scheduleWithFixedDelay(new b(cVar, runnable, j11), j10, j11, timeUnit), (a) null);
    }

    public void e() {
        o.v(Thread.currentThread() == this.f32303c.get(), "Not called from the SynchronizationContext");
    }

    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }
}
