package kotlin.coroutines.jvm.internal;

import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.reflect.Method;
import kotlin.jvm.internal.m;

/* compiled from: DebugMetadata.kt */
final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f36029a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final a f36030b = new a((Method) null, (Method) null, (Method) null);

    /* renamed from: c  reason: collision with root package name */
    private static a f36031c;

    /* compiled from: DebugMetadata.kt */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Method f36032a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f36033b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f36034c;

        public a(Method method, Method method2, Method method3) {
            this.f36032a = method;
            this.f36033b = method2;
            this.f36034c = method3;
        }
    }

    private i() {
    }

    private final a a(a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(MediationMetaData.KEY_NAME, new Class[0]));
            f36031c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f36030b;
            f36031c = aVar3;
            return aVar3;
        }
    }

    public final String b(a aVar) {
        m.e(aVar, "continuation");
        a aVar2 = f36031c;
        if (aVar2 == null) {
            aVar2 = a(aVar);
        }
        if (aVar2 == f36030b) {
            return null;
        }
        Method method = aVar2.f36032a;
        Object invoke = method != null ? method.invoke(aVar.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar2.f36033b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar2.f36034c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
