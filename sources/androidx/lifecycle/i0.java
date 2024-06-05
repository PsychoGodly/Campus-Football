package androidx.lifecycle;

import android.app.Application;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: SavedStateViewModelFactory.kt */
public final class i0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final List<Class<?>> f3931a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final List<Class<?>> f3932b;

    static {
        Class<d0> cls = d0.class;
        f3931a = q.f(Application.class, cls);
        f3932b = p.b(cls);
    }

    public static final <T> Constructor<T> c(Class<T> cls, List<? extends Class<?>> list) {
        m.e(cls, "modelClass");
        m.e(list, InAppPurchaseMetaData.KEY_SIGNATURE);
        Constructor<T>[] constructors = cls.getConstructors();
        m.d(constructors, "modelClass.constructors");
        int length = constructors.length;
        int i10 = 0;
        while (i10 < length) {
            Constructor<T> constructor = constructors[i10];
            Class[] parameterTypes = constructor.getParameterTypes();
            m.d(parameterTypes, "constructor.parameterTypes");
            List R = m.R(parameterTypes);
            if (m.a(list, R)) {
                m.c(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            } else if (list.size() != R.size() || !R.containsAll(list)) {
                i10++;
            } else {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends k0> T d(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        m.e(cls, "modelClass");
        m.e(constructor, "constructor");
        m.e(objArr, "params");
        try {
            return (k0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
