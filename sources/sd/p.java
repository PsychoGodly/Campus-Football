package sd;

import kotlin.jvm.internal.m;
import sd.o;

/* compiled from: Result.kt */
public final class p {
    public static final Object a(Throwable th) {
        m.e(th, "exception");
        return new o.b(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof o.b) {
            throw ((o.b) obj).f38130a;
        }
    }
}
