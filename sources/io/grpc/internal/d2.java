package io.grpc.internal;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import r6.o;

/* compiled from: SerializingExecutor */
public final class d2 implements Executor, Runnable {

    /* renamed from: d  reason: collision with root package name */
    private static final Logger f34864d = Logger.getLogger(d2.class.getName());

    /* renamed from: f  reason: collision with root package name */
    private static final b f34865f = c();

    /* renamed from: a  reason: collision with root package name */
    private Executor f34866a;

    /* renamed from: b  reason: collision with root package name */
    private final Queue<Runnable> f34867b = new ConcurrentLinkedQueue();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public volatile int f34868c = 0;

    /* compiled from: SerializingExecutor */
    private static abstract class b {
        private b() {
        }

        public abstract boolean a(d2 d2Var, int i10, int i11);

        public abstract void b(d2 d2Var, int i10);
    }

    /* compiled from: SerializingExecutor */
    private static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicIntegerFieldUpdater<d2> f34869a;

        public boolean a(d2 d2Var, int i10, int i11) {
            return this.f34869a.compareAndSet(d2Var, i10, i11);
        }

        public void b(d2 d2Var, int i10) {
            this.f34869a.set(d2Var, i10);
        }

        private c(AtomicIntegerFieldUpdater<d2> atomicIntegerFieldUpdater) {
            super();
            this.f34869a = atomicIntegerFieldUpdater;
        }
    }

    /* compiled from: SerializingExecutor */
    private static final class d extends b {
        private d() {
            super();
        }

        public boolean a(d2 d2Var, int i10, int i11) {
            synchronized (d2Var) {
                if (d2Var.f34868c != i10) {
                    return false;
                }
                int unused = d2Var.f34868c = i11;
                return true;
            }
        }

        public void b(d2 d2Var, int i10) {
            synchronized (d2Var) {
                int unused = d2Var.f34868c = i10;
            }
        }
    }

    public d2(Executor executor) {
        o.p(executor, "'executor' must not be null.");
        this.f34866a = executor;
    }

    private static b c() {
        try {
            return new c(AtomicIntegerFieldUpdater.newUpdater(d2.class, "c"));
        } catch (Throwable th) {
            f34864d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            return new d();
        }
    }

    private void d(Runnable runnable) {
        if (f34865f.a(this, 0, -1)) {
            try {
                this.f34866a.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f34867b.remove(runnable);
                }
                f34865f.b(this, 0);
                throw th;
            }
        }
    }

    public void execute(Runnable runnable) {
        this.f34867b.add((Runnable) o.p(runnable, "'r' must not be null."));
        d(runnable);
    }

    public void run() {
        Runnable poll;
        try {
            Executor executor = this.f34866a;
            while (executor == this.f34866a && (poll = this.f34867b.poll()) != null) {
                poll.run();
            }
            f34865f.b(this, 0);
            if (!this.f34867b.isEmpty()) {
                d((Runnable) null);
            }
        } catch (RuntimeException e10) {
            Logger logger = f34864d;
            Level level = Level.SEVERE;
            logger.log(level, "Exception while executing runnable " + poll, e10);
        } catch (Throwable th) {
            f34865f.b(this, 0);
            throw th;
        }
    }
}
