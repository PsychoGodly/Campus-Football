package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import e1.b;
import e1.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: AppInitializer */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f4804d;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f4805e = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Map<Class<?>, Object> f4806a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    final Set<Class<? extends e1.a<?>>> f4807b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    final Context f4808c;

    a(Context context) {
        this.f4808c = context.getApplicationContext();
    }

    private <T> T d(Class<? extends e1.a<?>> cls, Set<Class<?>> set) {
        T t10;
        if (g1.a.h()) {
            try {
                g1.a.c(cls.getSimpleName());
            } catch (Throwable th) {
                g1.a.f();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f4806a.containsKey(cls)) {
                set.add(cls);
                e1.a aVar = (e1.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends e1.a<?>>> dependencies = aVar.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class next : dependencies) {
                        if (!this.f4806a.containsKey(next)) {
                            d(next, set);
                        }
                    }
                }
                t10 = aVar.create(this.f4808c);
                set.remove(cls);
                this.f4806a.put(cls, t10);
            } else {
                t10 = this.f4806a.get(cls);
            }
            g1.a.f();
            return t10;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }

    public static a e(Context context) {
        if (f4804d == null) {
            synchronized (f4805e) {
                if (f4804d == null) {
                    f4804d = new a(context);
                }
            }
        }
        return f4804d;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        try {
            g1.a.c("Startup");
            b(this.f4808c.getPackageManager().getProviderInfo(new ComponentName(this.f4808c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            g1.a.f();
        } catch (PackageManager.NameNotFoundException e10) {
            throw new c((Throwable) e10);
        } catch (Throwable th) {
            g1.a.f();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Bundle bundle) {
        String string = this.f4808c.getString(b.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, (String) null))) {
                        Class<?> cls = Class.forName(str);
                        if (e1.a.class.isAssignableFrom(cls)) {
                            this.f4807b.add(cls);
                        }
                    }
                }
                for (Class<? extends e1.a<?>> d10 : this.f4807b) {
                    d(d10, hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new c((Throwable) e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public <T> T c(Class<? extends e1.a<?>> cls) {
        T t10;
        synchronized (f4805e) {
            t10 = this.f4806a.get(cls);
            if (t10 == null) {
                t10 = d(cls, new HashSet());
            }
        }
        return t10;
    }

    public <T> T f(Class<? extends e1.a<T>> cls) {
        return c(cls);
    }

    public boolean g(Class<? extends e1.a<?>> cls) {
        return this.f4807b.contains(cls);
    }
}
