package androidx.lifecycle;

import androidx.lifecycle.i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* compiled from: ClassesInfoCache */
final class b {

    /* renamed from: c  reason: collision with root package name */
    static b f3890c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, a> f3891a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Boolean> f3892b = new HashMap();

    @Deprecated
    /* compiled from: ClassesInfoCache */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        final Map<i.a, List<C0058b>> f3893a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<C0058b, i.a> f3894b;

        a(Map<C0058b, i.a> map) {
            this.f3894b = map;
            for (Map.Entry next : map.entrySet()) {
                i.a aVar = (i.a) next.getValue();
                List list = this.f3893a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f3893a.put(aVar, list);
                }
                list.add((C0058b) next.getKey());
            }
        }

        private static void b(List<C0058b> list, p pVar, i.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(pVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(p pVar, i.a aVar, Object obj) {
            b(this.f3893a.get(aVar), pVar, aVar, obj);
            b(this.f3893a.get(i.a.ON_ANY), pVar, aVar, obj);
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.b$b  reason: collision with other inner class name */
    /* compiled from: ClassesInfoCache */
    static final class C0058b {

        /* renamed from: a  reason: collision with root package name */
        final int f3895a;

        /* renamed from: b  reason: collision with root package name */
        final Method f3896b;

        C0058b(int i10, Method method) {
            this.f3895a = i10;
            this.f3896b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        public void a(p pVar, i.a aVar, Object obj) {
            try {
                int i10 = this.f3895a;
                if (i10 == 0) {
                    this.f3896b.invoke(obj, new Object[0]);
                } else if (i10 == 1) {
                    this.f3896b.invoke(obj, new Object[]{pVar});
                } else if (i10 == 2) {
                    this.f3896b.invoke(obj, new Object[]{pVar, aVar});
                }
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Failed to call observer method", e10.getCause());
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(e11);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0058b)) {
                return false;
            }
            C0058b bVar = (C0058b) obj;
            if (this.f3895a != bVar.f3895a || !this.f3896b.getName().equals(bVar.f3896b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f3895a * 31) + this.f3896b.getName().hashCode();
        }
    }

    b() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i10;
        a c10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c10 = c(superclass)) == null)) {
            hashMap.putAll(c10.f3894b);
        }
        for (Class c11 : cls.getInterfaces()) {
            for (Map.Entry next : c(c11).f3894b.entrySet()) {
                e(hashMap, (C0058b) next.getKey(), (i.a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            y yVar = (y) method.getAnnotation(y.class);
            if (yVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else if (p.class.isAssignableFrom(parameterTypes[0])) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                i.a value = yVar.value();
                if (parameterTypes.length > 1) {
                    if (!i.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == i.a.ON_ANY) {
                        i10 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new C0058b(i10, method), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f3891a.put(cls, aVar);
        this.f3892b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map<C0058b, i.a> map, C0058b bVar, i.a aVar, Class<?> cls) {
        i.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f3896b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public a c(Class<?> cls) {
        a aVar = this.f3891a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    public boolean d(Class<?> cls) {
        Boolean bool = this.f3892b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b10 = b(cls);
        for (Method annotation : b10) {
            if (((y) annotation.getAnnotation(y.class)) != null) {
                a(cls, b10);
                return true;
            }
        }
        this.f3892b.put(cls, Boolean.FALSE);
        return false;
    }
}
