package gd;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: OptionalMethod */
public class g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f32893a;

    /* renamed from: b  reason: collision with root package name */
    private final String f32894b;

    /* renamed from: c  reason: collision with root package name */
    private final Class[] f32895c;

    public g(Class<?> cls, String str, Class... clsArr) {
        this.f32893a = cls;
        this.f32894b = str;
        this.f32895c = clsArr;
    }

    private Method a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f32894b;
        if (str == null) {
            return null;
        }
        Method b10 = b(cls, str, this.f32895c);
        if (b10 == null || (cls2 = this.f32893a) == null || cls2.isAssignableFrom(b10.getReturnType())) {
            return b10;
        }
        return null;
    }

    private static Method b(Class<?> cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return b(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public Object c(T t10, Object... objArr) throws InvocationTargetException {
        Method a10 = a(t10.getClass());
        if (a10 != null) {
            try {
                return a10.invoke(t10, objArr);
            } catch (IllegalAccessException e10) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a10);
                assertionError.initCause(e10);
                throw assertionError;
            }
        } else {
            throw new AssertionError("Method " + this.f32894b + " not supported for object " + t10);
        }
    }

    public Object d(T t10, Object... objArr) throws InvocationTargetException {
        Method a10 = a(t10.getClass());
        if (a10 == null) {
            return null;
        }
        try {
            return a10.invoke(t10, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public Object e(T t10, Object... objArr) {
        try {
            return d(t10, objArr);
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object f(T t10, Object... objArr) {
        try {
            return c(t10, objArr);
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public boolean g(T t10) {
        return a(t10.getClass()) != null;
    }
}
