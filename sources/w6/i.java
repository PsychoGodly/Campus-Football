package w6;

import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ThreadFactoryBuilder */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private String f30823a = null;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f30824b = null;

    /* renamed from: c  reason: collision with root package name */
    private Integer f30825c = null;

    /* renamed from: d  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f30826d = null;

    /* renamed from: e  reason: collision with root package name */
    private ThreadFactory f30827e = null;

    /* compiled from: ThreadFactoryBuilder */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ThreadFactory f30828a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30829b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AtomicLong f30830c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Boolean f30831d;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Integer f30832f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f30833g;

        a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f30828a = threadFactory;
            this.f30829b = str;
            this.f30830c = atomicLong;
            this.f30831d = bool;
            this.f30832f = num;
            this.f30833g = uncaughtExceptionHandler;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f30828a.newThread(runnable);
            String str = this.f30829b;
            if (str != null) {
                AtomicLong atomicLong = this.f30830c;
                Objects.requireNonNull(atomicLong);
                AtomicLong atomicLong2 = atomicLong;
                newThread.setName(i.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f30831d;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f30832f;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f30833g;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    private static ThreadFactory c(i iVar) {
        String str = iVar.f30823a;
        Boolean bool = iVar.f30824b;
        Integer num = iVar.f30825c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = iVar.f30826d;
        ThreadFactory threadFactory = iVar.f30827e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactory, str, str != null ? new AtomicLong(0) : null, bool, num, uncaughtExceptionHandler);
    }

    /* access modifiers changed from: private */
    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory b() {
        return c(this);
    }

    public i e(boolean z10) {
        this.f30824b = Boolean.valueOf(z10);
        return this;
    }

    public i f(String str) {
        d(str, 0);
        this.f30823a = str;
        return this;
    }
}
