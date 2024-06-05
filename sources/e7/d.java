package e7;

import b8.a;
import b8.b;
import java.util.Set;

/* compiled from: ComponentContainer */
public final /* synthetic */ class d {
    public static Object a(e eVar, f0 f0Var) {
        b b10 = eVar.b(f0Var);
        if (b10 == null) {
            return null;
        }
        return b10.get();
    }

    public static Object b(e eVar, Class cls) {
        return eVar.f(f0.b(cls));
    }

    public static a c(e eVar, Class cls) {
        return eVar.h(f0.b(cls));
    }

    public static b d(e eVar, Class cls) {
        return eVar.b(f0.b(cls));
    }

    public static Set e(e eVar, f0 f0Var) {
        return (Set) eVar.d(f0Var).get();
    }

    public static Set f(e eVar, Class cls) {
        return eVar.e(f0.b(cls));
    }
}
