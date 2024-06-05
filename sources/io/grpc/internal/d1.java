package io.grpc.internal;

import java.util.logging.Level;
import java.util.logging.Logger;
import r6.o;
import r6.x;

/* compiled from: LogExceptionRunnable */
public final class d1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f34862b = Logger.getLogger(d1.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f34863a;

    public d1(Runnable runnable) {
        this.f34863a = (Runnable) o.p(runnable, "task");
    }

    public void run() {
        try {
            this.f34863a.run();
        } catch (Throwable th) {
            Logger logger = f34862b;
            Level level = Level.SEVERE;
            logger.log(level, "Exception while executing runnable " + this.f34863a, th);
            x.f(th);
            throw new AssertionError(th);
        }
    }

    public String toString() {
        return "LogExceptionRunnable(" + this.f34863a + ")";
    }
}
