package io.grpc.internal;

import dd.e0;
import dd.f;
import dd.j0;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: ChannelTracer */
final class o {

    /* renamed from: f  reason: collision with root package name */
    static final Logger f35213f = Logger.getLogger(f.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final Object f35214a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final j0 f35215b;

    /* renamed from: c  reason: collision with root package name */
    private final Collection<e0> f35216c;

    /* renamed from: d  reason: collision with root package name */
    private final long f35217d;

    /* renamed from: e  reason: collision with root package name */
    private int f35218e;

    /* compiled from: ChannelTracer */
    class a extends ArrayDeque<e0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f35219a;

        a(int i10) {
            this.f35219a = i10;
        }

        /* renamed from: b */
        public boolean add(e0 e0Var) {
            if (size() == this.f35219a) {
                removeFirst();
            }
            o.a(o.this);
            return super.add(e0Var);
        }
    }

    /* compiled from: ChannelTracer */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f35221a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                dd.e0$b[] r0 = dd.e0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35221a = r0
                dd.e0$b r1 = dd.e0.b.CT_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35221a     // Catch:{ NoSuchFieldError -> 0x001d }
                dd.e0$b r1 = dd.e0.b.CT_WARNING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.o.b.<clinit>():void");
        }
    }

    o(j0 j0Var, int i10, long j10, String str) {
        r6.o.p(str, "description");
        this.f35215b = (j0) r6.o.p(j0Var, "logId");
        if (i10 > 0) {
            this.f35216c = new a(i10);
        } else {
            this.f35216c = null;
        }
        this.f35217d = j10;
        e0.a aVar = new e0.a();
        e(aVar.b(str + " created").c(e0.b.CT_INFO).e(j10).a());
    }

    static /* synthetic */ int a(o oVar) {
        int i10 = oVar.f35218e;
        oVar.f35218e = i10 + 1;
        return i10;
    }

    static void d(j0 j0Var, Level level, String str) {
        Logger logger = f35213f;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + j0Var + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    /* access modifiers changed from: package-private */
    public j0 b() {
        return this.f35215b;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        boolean z10;
        synchronized (this.f35214a) {
            z10 = this.f35216c != null;
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void e(e0 e0Var) {
        Level level;
        int i10 = b.f35221a[e0Var.f32194b.ordinal()];
        if (i10 == 1) {
            level = Level.FINE;
        } else if (i10 != 2) {
            level = Level.FINEST;
        } else {
            level = Level.FINER;
        }
        f(e0Var);
        d(this.f35215b, level, e0Var.f32193a);
    }

    /* access modifiers changed from: package-private */
    public void f(e0 e0Var) {
        synchronized (this.f35214a) {
            Collection<e0> collection = this.f35216c;
            if (collection != null) {
                collection.add(e0Var);
            }
        }
    }
}
