package e7;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ComponentDiscovery */
public final class g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f28758a;

    /* renamed from: b  reason: collision with root package name */
    private final c<T> f28759b;

    /* compiled from: ComponentDiscovery */
    private static class b implements c<Context> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<? extends Service> f28760a;

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f28760a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f28760a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        /* renamed from: c */
        public List<String> a(Context context) {
            Bundle b10 = b(context);
            if (b10 == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b10.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b10.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class<? extends Service> cls) {
            this.f28760a = cls;
        }
    }

    /* compiled from: ComponentDiscovery */
    interface c<T> {
        List<String> a(T t10);
    }

    g(T t10, c<T> cVar) {
        this.f28758a = t10;
        this.f28759b = cVar;
    }

    public static g<Context> c(Context context, Class<? extends Service> cls) {
        return new g<>(context, new b(cls));
    }

    /* access modifiers changed from: private */
    public static ComponentRegistrar d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new w(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}));
            return null;
        } catch (IllegalAccessException e10) {
            throw new w(String.format("Could not instantiate %s.", new Object[]{str}), e10);
        } catch (InstantiationException e11) {
            throw new w(String.format("Could not instantiate %s.", new Object[]{str}), e11);
        } catch (NoSuchMethodException e12) {
            throw new w(String.format("Could not instantiate %s", new Object[]{str}), e12);
        } catch (InvocationTargetException e13) {
            throw new w(String.format("Could not instantiate %s", new Object[]{str}), e13);
        }
    }

    public List<b8.b<ComponentRegistrar>> b() {
        ArrayList arrayList = new ArrayList();
        for (String fVar : this.f28759b.a(this.f28758a)) {
            arrayList.add(new f(fVar));
        }
        return arrayList;
    }
}
