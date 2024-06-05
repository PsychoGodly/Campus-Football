package x7;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import x7.n;
import y7.n;
import y7.v;

/* compiled from: AndroidConnectivityMonitor */
public final class j implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f31048a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectivityManager f31049b;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f31050c;

    /* renamed from: d  reason: collision with root package name */
    private final List<n<n.a>> f31051d = new ArrayList();

    /* compiled from: AndroidConnectivityMonitor */
    class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f31052a;

        a(AtomicBoolean atomicBoolean) {
            this.f31052a = atomicBoolean;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.f31052a.compareAndSet(true, false)) {
                j.this.l();
            }
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
            if (this.f31052a.compareAndSet(true, false)) {
                j.this.l();
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f31052a.compareAndSet(true, false)) {
                j.this.l();
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* compiled from: AndroidConnectivityMonitor */
    class b implements ComponentCallbacks2 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f31054a;

        b(AtomicBoolean atomicBoolean) {
            this.f31054a = atomicBoolean;
        }

        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
        }

        public void onTrimMemory(int i10) {
            if (i10 == 20) {
                this.f31054a.set(true);
            }
        }
    }

    /* compiled from: AndroidConnectivityMonitor */
    private class c extends ConnectivityManager.NetworkCallback {
        private c() {
        }

        public void onAvailable(Network network) {
            j.this.k(true);
        }

        public void onLost(Network network) {
            j.this.k(false);
        }

        /* synthetic */ c(j jVar, a aVar) {
            this();
        }
    }

    public j(Context context) {
        y7.b.d(context != null, "Context must be non-null", new Object[0]);
        this.f31048a = context;
        this.f31049b = (ConnectivityManager) context.getSystemService("connectivity");
        f();
        g();
    }

    private void f() {
        Application application = (Application) this.f31048a.getApplicationContext();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        application.registerActivityLifecycleCallbacks(new a(atomicBoolean));
        application.registerComponentCallbacks(new b(atomicBoolean));
    }

    private void g() {
        if (Build.VERSION.SDK_INT < 24 || this.f31049b == null) {
            d dVar = new d(this, (a) null);
            this.f31048a.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f31050c = new i(this, dVar);
            return;
        }
        c cVar = new c(this, (a) null);
        this.f31049b.registerDefaultNetworkCallback(cVar);
        this.f31050c = new h(this, cVar);
    }

    /* access modifiers changed from: private */
    public boolean h() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f31048a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(c cVar) {
        this.f31049b.unregisterNetworkCallback(cVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j(d dVar) {
        this.f31048a.unregisterReceiver(dVar);
    }

    /* access modifiers changed from: private */
    public void k(boolean z10) {
        synchronized (this.f31051d) {
            for (y7.n accept : this.f31051d) {
                accept.accept(z10 ? n.a.REACHABLE : n.a.UNREACHABLE);
            }
        }
    }

    public void a(y7.n<n.a> nVar) {
        synchronized (this.f31051d) {
            this.f31051d.add(nVar);
        }
    }

    public void l() {
        v.a("AndroidConnectivityMonitor", "App has entered the foreground.", new Object[0]);
        if (h()) {
            k(true);
        }
    }

    public void shutdown() {
        Runnable runnable = this.f31050c;
        if (runnable != null) {
            runnable.run();
            this.f31050c = null;
        }
    }

    /* compiled from: AndroidConnectivityMonitor */
    private class d extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private boolean f31057a;

        private d() {
            this.f31057a = false;
        }

        public void onReceive(Context context, Intent intent) {
            boolean e10 = j.this.h();
            if (j.this.h() && !this.f31057a) {
                j.this.k(true);
            } else if (!e10 && this.f31057a) {
                j.this.k(false);
            }
            this.f31057a = e10;
        }

        /* synthetic */ d(j jVar, a aVar) {
            this();
        }
    }
}
