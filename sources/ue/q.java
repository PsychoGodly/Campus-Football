package ue;

import sd.o;
import sd.p;

/* compiled from: FastServiceLoader.kt */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f38838a;

    static {
        Object obj;
        try {
            o.a aVar = o.f38128b;
            obj = o.b(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            o.a aVar2 = o.f38128b;
            obj = o.b(p.a(th));
        }
        f38838a = o.g(obj);
    }

    public static final boolean a() {
        return f38838a;
    }
}
