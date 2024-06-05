package dd;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* compiled from: ServiceProviders */
final class i1 {

    /* compiled from: ServiceProviders */
    class a implements Comparator<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f32223a;

        a(b bVar) {
            this.f32223a = bVar;
        }

        public int compare(T t10, T t11) {
            int b10 = this.f32223a.b(t10) - this.f32223a.b(t11);
            if (b10 != 0) {
                return b10;
            }
            return t10.getClass().getName().compareTo(t11.getClass().getName());
        }
    }

    /* compiled from: ServiceProviders */
    public interface b<T> {
        boolean a(T t10);

        int b(T t10);
    }

    private static <T> T a(Class<T> cls, Class<?> cls2) {
        try {
            return cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassCastException unused) {
            return null;
        } catch (Throwable th) {
            throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", new Object[]{cls2.getName(), th}), th);
        }
    }

    static <T> Iterable<T> b(Class<T> cls, Iterable<Class<?>> iterable) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> a10 : iterable) {
            T a11 = a(cls, a10);
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        return arrayList;
    }

    public static <T> Iterable<T> c(Class<T> cls, ClassLoader classLoader) {
        ServiceLoader<S> load = ServiceLoader.load(cls, classLoader);
        return !load.iterator().hasNext() ? ServiceLoader.load(cls) : load;
    }

    static boolean d(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Iterable<java.lang.Class<?>>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> java.util.List<T> e(java.lang.Class<T> r1, java.lang.Iterable<java.lang.Class<?>> r2, java.lang.ClassLoader r3, dd.i1.b<T> r4) {
        /*
            boolean r0 = d(r3)
            if (r0 == 0) goto L_0x000b
            java.lang.Iterable r1 = b(r1, r2)
            goto L_0x000f
        L_0x000b:
            java.lang.Iterable r1 = c(r1, r3)
        L_0x000f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0018:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x002d
            java.lang.Object r3 = r1.next()
            boolean r0 = r4.a(r3)
            if (r0 != 0) goto L_0x0029
            goto L_0x0018
        L_0x0029:
            r2.add(r3)
            goto L_0x0018
        L_0x002d:
            dd.i1$a r1 = new dd.i1$a
            r1.<init>(r4)
            java.util.Comparator r1 = java.util.Collections.reverseOrder(r1)
            java.util.Collections.sort(r2, r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.i1.e(java.lang.Class, java.lang.Iterable, java.lang.ClassLoader, dd.i1$b):java.util.List");
    }
}
