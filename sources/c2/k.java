package c2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MetadataBackendRegistry */
class k implements e {

    /* renamed from: a  reason: collision with root package name */
    private final a f5605a;

    /* renamed from: b  reason: collision with root package name */
    private final i f5606b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, m> f5607c;

    /* compiled from: MetadataBackendRegistry */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f5608a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f5609b = null;

        a(Context context) {
            this.f5608a = context;
        }

        private Map<String, String> a(Context context) {
            Bundle d10 = d(context);
            if (d10 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d10.keySet()) {
                Object obj = d10.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String trim : ((String) obj).split(",", -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private Map<String, String> c() {
            if (this.f5609b == null) {
                this.f5609b = a(this.f5608a);
            }
            return this.f5609b;
        }

        private static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public d b(String str) {
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str2).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e10) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", new Object[]{str2}), e10);
                return null;
            } catch (IllegalAccessException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str2}), e11);
                return null;
            } catch (InstantiationException e12) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str2}), e12);
                return null;
            } catch (NoSuchMethodException e13) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str2}), e13);
                return null;
            } catch (InvocationTargetException e14) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str2}), e14);
                return null;
            }
        }
    }

    k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    public synchronized m get(String str) {
        if (this.f5607c.containsKey(str)) {
            return this.f5607c.get(str);
        }
        d b10 = this.f5605a.b(str);
        if (b10 == null) {
            return null;
        }
        m create = b10.create(this.f5606b.a(str));
        this.f5607c.put(str, create);
        return create;
    }

    k(a aVar, i iVar) {
        this.f5607c = new HashMap();
        this.f5605a = aVar;
        this.f5606b = iVar;
    }
}
