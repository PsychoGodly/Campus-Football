package ue;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import pe.o2;

/* compiled from: MainDispatchers.kt */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f38787a;

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f38788b = m0.f("kotlinx.coroutines.fast.service.loader", true);

    /* renamed from: c  reason: collision with root package name */
    public static final o2 f38789c;

    static {
        a0 a0Var = new a0();
        f38787a = a0Var;
        f38789c = a0Var.a();
    }

    private a0() {
    }

    private final o2 a() {
        List<z> list;
        T t10;
        o2 e10;
        Class<z> cls = z.class;
        try {
            if (f38788b) {
                list = p.f38830a.c();
            } else {
                list = l.j(j.c(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            }
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                t10 = null;
            } else {
                t10 = it.next();
                if (it.hasNext()) {
                    int c10 = ((z) t10).c();
                    do {
                        T next = it.next();
                        int c11 = ((z) next).c();
                        if (c10 < c11) {
                            t10 = next;
                            c10 = c11;
                        }
                    } while (it.hasNext());
                }
            }
            z zVar = (z) t10;
            if (zVar == null || (e10 = b0.e(zVar, list)) == null) {
                return b0.b((Throwable) null, (String) null, 3, (Object) null);
            }
            return e10;
        } catch (Throwable th) {
            return b0.b(th, (String) null, 2, (Object) null);
        }
    }
}
