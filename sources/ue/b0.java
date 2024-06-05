package ue;

import java.util.List;
import pe.o2;
import sd.d;

/* compiled from: MainDispatchers.kt */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f38791a = true;

    private static final c0 a(Throwable th, String str) {
        if (f38791a) {
            return new c0(th, str);
        }
        if (th != null) {
            throw th;
        }
        d();
        throw new d();
    }

    static /* synthetic */ c0 b(Throwable th, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(o2 o2Var) {
        return o2Var.b1() instanceof c0;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final o2 e(z zVar, List<? extends z> list) {
        try {
            return zVar.b(list);
        } catch (Throwable th) {
            return a(th, zVar.a());
        }
    }
}
