package ed;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import dd.g;
import dd.k0;
import dd.p;
import dd.u0;
import dd.v0;
import dd.w0;
import dd.y;
import dd.z0;
import java.util.concurrent.TimeUnit;
import r6.o;

/* compiled from: AndroidChannelBuilder */
public final class a extends y<a> {

    /* renamed from: c  reason: collision with root package name */
    private static final w0 f32515c = j();

    /* renamed from: a  reason: collision with root package name */
    private final v0<?> f32516a;

    /* renamed from: b  reason: collision with root package name */
    private Context f32517b;

    /* compiled from: AndroidChannelBuilder */
    static final class b extends u0 {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final u0 f32518a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final Context f32519b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final ConnectivityManager f32520c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f32521d = new Object();

        /* renamed from: e  reason: collision with root package name */
        private Runnable f32522e;

        /* renamed from: ed.a$b$a  reason: collision with other inner class name */
        /* compiled from: AndroidChannelBuilder */
        class C0366a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f32523a;

            C0366a(c cVar) {
                this.f32523a = cVar;
            }

            public void run() {
                b.this.f32520c.unregisterNetworkCallback(this.f32523a);
            }
        }

        /* renamed from: ed.a$b$b  reason: collision with other inner class name */
        /* compiled from: AndroidChannelBuilder */
        class C0367b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f32525a;

            C0367b(d dVar) {
                this.f32525a = dVar;
            }

            public void run() {
                b.this.f32519b.unregisterReceiver(this.f32525a);
            }
        }

        /* compiled from: AndroidChannelBuilder */
        private class c extends ConnectivityManager.NetworkCallback {
            private c() {
            }

            public void onAvailable(Network network) {
                b.this.f32518a.j();
            }

            public void onBlockedStatusChanged(Network network, boolean z10) {
                if (!z10) {
                    b.this.f32518a.j();
                }
            }
        }

        /* compiled from: AndroidChannelBuilder */
        private class d extends BroadcastReceiver {

            /* renamed from: a  reason: collision with root package name */
            private boolean f32528a;

            private d() {
                this.f32528a = false;
            }

            public void onReceive(Context context, Intent intent) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                boolean z10 = this.f32528a;
                boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                this.f32528a = z11;
                if (z11 && !z10) {
                    b.this.f32518a.j();
                }
            }
        }

        b(u0 u0Var, Context context) {
            this.f32518a = u0Var;
            this.f32519b = context;
            if (context != null) {
                this.f32520c = (ConnectivityManager) context.getSystemService("connectivity");
                try {
                    r();
                } catch (SecurityException e10) {
                    Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e10);
                }
            } else {
                this.f32520c = null;
            }
        }

        private void r() {
            if (Build.VERSION.SDK_INT < 24 || this.f32520c == null) {
                d dVar = new d();
                this.f32519b.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f32522e = new C0367b(dVar);
                return;
            }
            c cVar = new c();
            this.f32520c.registerDefaultNetworkCallback(cVar);
            this.f32522e = new C0366a(cVar);
        }

        private void s() {
            synchronized (this.f32521d) {
                Runnable runnable = this.f32522e;
                if (runnable != null) {
                    runnable.run();
                    this.f32522e = null;
                }
            }
        }

        public String a() {
            return this.f32518a.a();
        }

        public <RequestT, ResponseT> g<RequestT, ResponseT> f(z0<RequestT, ResponseT> z0Var, dd.c cVar) {
            return this.f32518a.f(z0Var, cVar);
        }

        public boolean i(long j10, TimeUnit timeUnit) throws InterruptedException {
            return this.f32518a.i(j10, timeUnit);
        }

        public void j() {
            this.f32518a.j();
        }

        public p k(boolean z10) {
            return this.f32518a.k(z10);
        }

        public void l(p pVar, Runnable runnable) {
            this.f32518a.l(pVar, runnable);
        }

        public u0 m() {
            s();
            return this.f32518a.m();
        }

        public u0 n() {
            s();
            return this.f32518a.n();
        }
    }

    private a(v0<?> v0Var) {
        this.f32516a = (v0) o.p(v0Var, "delegateBuilder");
    }

    private static w0 j() {
        try {
            try {
                w0 w0Var = (w0) fd.g.class.asSubclass(w0.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                if (k0.a(w0Var)) {
                    return w0Var;
                }
                Log.w("AndroidChannelBuilder", "OkHttpChannelProvider.isAvailable() returned false");
                return null;
            } catch (Exception e10) {
                Log.w("AndroidChannelBuilder", "Failed to construct OkHttpChannelProvider", e10);
                return null;
            }
        } catch (ClassCastException e11) {
            Log.w("AndroidChannelBuilder", "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e11);
            return null;
        }
    }

    public static a k(v0<?> v0Var) {
        return new a(v0Var);
    }

    public u0 a() {
        return new b(this.f32516a.a(), this.f32517b);
    }

    /* access modifiers changed from: protected */
    public v0<?> e() {
        return this.f32516a;
    }

    public a i(Context context) {
        this.f32517b = context;
        return this;
    }
}
