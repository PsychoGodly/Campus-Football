package l5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.o1;
import com.google.android.gms.common.internal.q;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import m5.m;
import o5.c;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f20008b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f20009c;

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap f20010a = new ConcurrentHashMap();

    private a() {
    }

    public static a b() {
        if (f20009c == null) {
            synchronized (f20008b) {
                if (f20009c == null) {
                    f20009c = new a();
                }
            }
        }
        a aVar = f20009c;
        q.k(aVar);
        return aVar;
    }

    private static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!g(serviceConnection)) {
            return h(context, intent, serviceConnection, i10, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f20010a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
        }
        try {
            boolean h10 = h(context, intent, serviceConnection, i10, executor);
            if (h10) {
                return h10;
            }
            return false;
        } finally {
            this.f20010a.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof o1);
    }

    private static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        if (!m.k() || executor == null) {
            return context.bindService(intent, serviceConnection, i10);
        }
        return context.bindService(intent, i10, executor, serviceConnection);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i10, true, (Executor) null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (!g(serviceConnection) || !this.f20010a.containsKey(serviceConnection)) {
            e(context, serviceConnection);
            return;
        }
        try {
            e(context, (ServiceConnection) this.f20010a.get(serviceConnection));
        } finally {
            this.f20010a.remove(serviceConnection);
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        return f(context, str, intent, serviceConnection, i10, true, executor);
    }
}
