package androidx.lifecycle;

import com.applovin.mediation.MaxReward;
import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;

/* compiled from: Lifecycling.kt */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final u f3971a = new u();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<?>, Integer> f3972b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<?>, List<Constructor<? extends f>>> f3973c = new HashMap();

    private u() {
    }

    private final f a(Constructor<? extends f> constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(new Object[]{obj});
            m.d(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return (f) newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor<? extends f> b(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : MaxReward.DEFAULT_LABEL;
            m.d(name, "fullPackage");
            if (!(name.length() == 0)) {
                m.d(canonicalName, MediationMetaData.KEY_NAME);
                canonicalName = canonicalName.substring(name.length() + 1);
                m.d(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            m.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c10 = c(canonicalName);
            if (!(name.length() == 0)) {
                c10 = name + '.' + c10;
            }
            Class<?> cls2 = Class.forName(c10);
            m.c(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(new Class[]{cls});
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String c(String str) {
        m.e(str, "className");
        return o.p(str, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    private final int d(Class<?> cls) {
        Map<Class<?>, Integer> map = f3972b;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g10 = g(cls);
        map.put(cls, Integer.valueOf(g10));
        return g10;
    }

    private final boolean e(Class<?> cls) {
        return cls != null && o.class.isAssignableFrom(cls);
    }

    public static final m f(Object obj) {
        m.e(obj, "object");
        boolean z10 = obj instanceof m;
        boolean z11 = obj instanceof d;
        if (z10 && z11) {
            return new DefaultLifecycleObserverAdapter((d) obj, (m) obj);
        }
        if (z11) {
            return new DefaultLifecycleObserverAdapter((d) obj, (m) null);
        }
        if (z10) {
            return (m) obj;
        }
        Class<?> cls = obj.getClass();
        u uVar = f3971a;
        if (uVar.d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends f>> list = f3973c.get(cls);
        m.b(list);
        List list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(uVar.a((Constructor) list2.get(0), obj));
        }
        int size = list2.size();
        f[] fVarArr = new f[size];
        for (int i10 = 0; i10 < size; i10++) {
            fVarArr[i10] = f3971a.a((Constructor) list2.get(i10), obj);
        }
        return new CompositeGeneratedAdaptersObserver(fVarArr);
    }

    private final int g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends f> b10 = b(cls);
        if (b10 != null) {
            f3973c.put(cls, p.b(b10));
            return 2;
        } else if (b.f3890c.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (e(superclass)) {
                m.d(superclass, "superclass");
                if (d(superclass) == 1) {
                    return 1;
                }
                List<Constructor<? extends f>> list = f3973c.get(superclass);
                m.b(list);
                arrayList = new ArrayList(list);
            }
            Class[] interfaces = cls.getInterfaces();
            m.d(interfaces, "klass.interfaces");
            for (Class cls2 : interfaces) {
                if (e(cls2)) {
                    m.d(cls2, "intrface");
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List<Constructor<? extends f>> list2 = f3973c.get(cls2);
                    m.b(list2);
                    arrayList.addAll(list2);
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f3973c.put(cls, arrayList);
            return 2;
        }
    }
}
