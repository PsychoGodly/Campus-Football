package io.grpc.internal;

import dd.e0;
import dd.f;
import dd.j0;
import java.text.MessageFormat;
import java.util.logging.Level;
import r6.o;

/* compiled from: ChannelLoggerImpl */
final class n extends f {

    /* renamed from: a  reason: collision with root package name */
    private final o f35198a;

    /* renamed from: b  reason: collision with root package name */
    private final l2 f35199b;

    /* compiled from: ChannelLoggerImpl */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f35200a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                dd.f$a[] r0 = dd.f.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35200a = r0
                dd.f$a r1 = dd.f.a.ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35200a     // Catch:{ NoSuchFieldError -> 0x001d }
                dd.f$a r1 = dd.f.a.WARNING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35200a     // Catch:{ NoSuchFieldError -> 0x0028 }
                dd.f$a r1 = dd.f.a.INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.n.a.<clinit>():void");
        }
    }

    n(o oVar, l2 l2Var) {
        this.f35198a = (o) o.p(oVar, "tracer");
        this.f35199b = (l2) o.p(l2Var, "time");
    }

    private boolean c(f.a aVar) {
        return aVar != f.a.DEBUG && this.f35198a.c();
    }

    static void d(j0 j0Var, f.a aVar, String str) {
        Level f10 = f(aVar);
        if (o.f35213f.isLoggable(f10)) {
            o.d(j0Var, f10, str);
        }
    }

    static void e(j0 j0Var, f.a aVar, String str, Object... objArr) {
        Level f10 = f(aVar);
        if (o.f35213f.isLoggable(f10)) {
            o.d(j0Var, f10, MessageFormat.format(str, objArr));
        }
    }

    private static Level f(f.a aVar) {
        int i10 = a.f35200a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return Level.FINE;
        }
        if (i10 != 3) {
            return Level.FINEST;
        }
        return Level.FINER;
    }

    private static e0.b g(f.a aVar) {
        int i10 = a.f35200a[aVar.ordinal()];
        if (i10 == 1) {
            return e0.b.CT_ERROR;
        }
        if (i10 != 2) {
            return e0.b.CT_INFO;
        }
        return e0.b.CT_WARNING;
    }

    private void h(f.a aVar, String str) {
        if (aVar != f.a.DEBUG) {
            this.f35198a.f(new e0.a().b(str).c(g(aVar)).e(this.f35199b.a()).a());
        }
    }

    public void a(f.a aVar, String str) {
        d(this.f35198a.b(), aVar, str);
        if (c(aVar)) {
            h(aVar, str);
        }
    }

    public void b(f.a aVar, String str, Object... objArr) {
        String str2;
        Level f10 = f(aVar);
        if (c(aVar) || o.f35213f.isLoggable(f10)) {
            str2 = MessageFormat.format(str, objArr);
        } else {
            str2 = null;
        }
        a(aVar, str2);
    }
}
