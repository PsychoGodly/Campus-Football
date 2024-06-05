package kotlin.jvm.internal;

import com.applovin.mediation.MaxReward;
import le.c;
import le.d;
import le.e;
import le.g;
import le.i;

/* compiled from: Reflection */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final b0 f36036a;

    /* renamed from: b  reason: collision with root package name */
    private static final c[] f36037b = new c[0];

    static {
        b0 b0Var = null;
        try {
            b0Var = (b0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (b0Var == null) {
            b0Var = new b0();
        }
        f36036a = b0Var;
    }

    public static e a(j jVar) {
        return f36036a.a(jVar);
    }

    public static c b(Class cls) {
        return f36036a.b(cls);
    }

    public static d c(Class cls) {
        return f36036a.c(cls, MaxReward.DEFAULT_LABEL);
    }

    public static g d(o oVar) {
        return f36036a.d(oVar);
    }

    public static i e(s sVar) {
        return f36036a.e(sVar);
    }

    public static String f(i iVar) {
        return f36036a.f(iVar);
    }

    public static String g(n nVar) {
        return f36036a.g(nVar);
    }
}
