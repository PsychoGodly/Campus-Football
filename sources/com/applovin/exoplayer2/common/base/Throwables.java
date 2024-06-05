package com.applovin.exoplayer2.common.base;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Throwables {
    private static final String JAVA_LANG_ACCESS_CLASSNAME = "sun.misc.JavaLangAccess";
    static final String SHARED_SECRETS_CLASSNAME = "sun.misc.SharedSecrets";
    /* access modifiers changed from: private */
    public static final Method getStackTraceDepthMethod;
    /* access modifiers changed from: private */
    public static final Method getStackTraceElementMethod;
    /* access modifiers changed from: private */
    public static final Object jla;

    class a extends AbstractList {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Throwable f6097a;

        a(Throwable th) {
            this.f6097a = th;
        }

        public int size() {
            return ((Integer) Throwables.invokeAccessibleNonThrowingMethod(Throwables.getStackTraceDepthMethod, Throwables.jla, this.f6097a)).intValue();
        }

        public StackTraceElement get(int i10) {
            return (StackTraceElement) Throwables.invokeAccessibleNonThrowingMethod(Throwables.getStackTraceElementMethod, Throwables.jla, this.f6097a, Integer.valueOf(i10));
        }
    }

    static {
        Method method;
        Object jla2 = getJLA();
        jla = jla2;
        Method method2 = null;
        if (jla2 == null) {
            method = null;
        } else {
            method = getGetMethod();
        }
        getStackTraceElementMethod = method;
        if (jla2 != null) {
            method2 = getSizeMethod();
        }
        getStackTraceDepthMethod = method2;
    }

    private Throwables() {
    }

    public static List<Throwable> getCausalChain(Throwable th) {
        Preconditions.checkNotNull(th);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th);
        boolean z10 = false;
        Throwable th2 = th;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(th);
            if (th != th2) {
                if (z10) {
                    th2 = th2.getCause();
                }
                z10 = !z10;
            } else {
                throw new IllegalArgumentException("Loop in causal chain detected.", th);
            }
        }
    }

    public static <X extends Throwable> X getCauseAs(Throwable th, Class<X> cls) {
        try {
            return (Throwable) cls.cast(th.getCause());
        } catch (ClassCastException e10) {
            e10.initCause(th);
            throw e10;
        }
    }

    private static Method getGetMethod() {
        return getJlaMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    private static Object getJLA() {
        try {
            return Class.forName(SHARED_SECRETS_CLASSNAME, false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method getJlaMethod(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName(JAVA_LANG_ACCESS_CLASSNAME, false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Throwable getRootCause(Throwable th) {
        boolean z10 = false;
        Throwable th2 = th;
        while (true) {
            Throwable cause = th.getCause();
            if (cause == null) {
                return th;
            }
            if (cause != th2) {
                if (z10) {
                    th2 = th2.getCause();
                }
                z10 = !z10;
                th = cause;
            } else {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause);
            }
        }
    }

    private static Method getSizeMethod() {
        try {
            Method jlaMethod = getJlaMethod("getStackTraceDepth", Throwable.class);
            if (jlaMethod == null) {
                return null;
            }
            jlaMethod.invoke(getJLA(), new Object[]{new Throwable()});
            return jlaMethod;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static String getStackTraceAsString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* access modifiers changed from: private */
    public static Object invokeAccessibleNonThrowingMethod(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw propagate(e11.getCause());
        }
    }

    private static List<StackTraceElement> jlaStackTrace(Throwable th) {
        Preconditions.checkNotNull(th);
        return new a(th);
    }

    public static List<StackTraceElement> lazyStackTrace(Throwable th) {
        if (lazyStackTraceIsLazy()) {
            return jlaStackTrace(th);
        }
        return Collections.unmodifiableList(Arrays.asList(th.getStackTrace()));
    }

    public static boolean lazyStackTraceIsLazy() {
        return (getStackTraceElementMethod == null || getStackTraceDepthMethod == null) ? false : true;
    }

    @Deprecated
    public static RuntimeException propagate(Throwable th) {
        throwIfUnchecked(th);
        throw new RuntimeException(th);
    }

    @Deprecated
    public static <X extends Throwable> void propagateIfInstanceOf(Throwable th, Class<X> cls) throws Throwable {
        if (th != null) {
            throwIfInstanceOf(th, cls);
        }
    }

    @Deprecated
    public static void propagateIfPossible(Throwable th) {
        if (th != null) {
            throwIfUnchecked(th);
        }
    }

    public static <X extends Throwable> void throwIfInstanceOf(Throwable th, Class<X> cls) throws Throwable {
        Preconditions.checkNotNull(th);
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    public static void throwIfUnchecked(Throwable th) {
        Preconditions.checkNotNull(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    public static <X extends Throwable> void propagateIfPossible(Throwable th, Class<X> cls) throws Throwable {
        propagateIfInstanceOf(th, cls);
        propagateIfPossible(th);
    }

    public static <X1 extends Throwable, X2 extends Throwable> void propagateIfPossible(Throwable th, Class<X1> cls, Class<X2> cls2) throws Throwable, Throwable {
        Preconditions.checkNotNull(cls2);
        propagateIfInstanceOf(th, cls);
        propagateIfPossible(th, cls2);
    }
}
