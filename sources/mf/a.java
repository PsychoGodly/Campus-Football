package mf;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* compiled from: BoundaryInterfaceReflectionUtil */
public class a {

    /* renamed from: mf.a$a  reason: collision with other inner class name */
    /* compiled from: BoundaryInterfaceReflectionUtil */
    private static class C0419a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final Object f36364a;

        public C0419a(Object obj) {
            this.f36364a = obj;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return a.d(method, this.f36364a.getClass().getClassLoader()).invoke(this.f36364a, objArr);
            } catch (InvocationTargetException e10) {
                throw e10.getTargetException();
            } catch (ReflectiveOperationException e11) {
                throw new RuntimeException("Reflection failed for method " + method, e11);
            }
        }
    }

    public static <T> T a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static boolean b(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (e()) {
                if (collection.contains(str + ":dev")) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static InvocationHandler c(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0419a(obj);
    }

    public static Method d(Method method, ClassLoader classLoader) throws ClassNotFoundException, NoSuchMethodException {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    private static boolean e() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }
}
