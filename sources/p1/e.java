package p1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.work.p;

/* compiled from: NetworkStateTracker */
public class e extends d<n1.b> {

    /* renamed from: j  reason: collision with root package name */
    static final String f21116j = p.f("NetworkStateTracker");

    /* renamed from: g  reason: collision with root package name */
    private final ConnectivityManager f21117g = ((ConnectivityManager) this.f21110b.getSystemService("connectivity"));

    /* renamed from: h  reason: collision with root package name */
    private b f21118h;

    /* renamed from: i  reason: collision with root package name */
    private a f21119i;

    /* compiled from: NetworkStateTracker */
    private class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                p.c().a(e.f21116j, "Network broadcast received", new Throwable[0]);
                e eVar = e.this;
                eVar.d(eVar.g());
            }
        }
    }

    /* compiled from: NetworkStateTracker */
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            p.c().a(e.f21116j, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }

        public void onLost(Network network) {
            p.c().a(e.f21116j, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    public e(Context context, t1.a aVar) {
        super(context, aVar);
        if (j()) {
            this.f21118h = new b();
        } else {
            this.f21119i = new a();
        }
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public void e() {
        if (j()) {
            try {
                p.c().a(f21116j, "Registering network callback", new Throwable[0]);
                this.f21117g.registerDefaultNetworkCallback(this.f21118h);
            } catch (IllegalArgumentException | SecurityException e10) {
                p.c().b(f21116j, "Received exception while registering network callback", e10);
            }
        } else {
            p.c().a(f21116j, "Registering broadcast receiver", new Throwable[0]);
            this.f21110b.registerReceiver(this.f21119i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public void f() {
        if (j()) {
            try {
                p.c().a(f21116j, "Unregistering network callback", new Throwable[0]);
                this.f21117g.unregisterNetworkCallback(this.f21118h);
            } catch (IllegalArgumentException | SecurityException e10) {
                p.c().b(f21116j, "Received exception while unregistering network callback", e10);
            }
        } else {
            p.c().a(f21116j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f21110b.unregisterReceiver(this.f21119i);
        }
    }

    /* access modifiers changed from: package-private */
    public n1.b g() {
        NetworkInfo activeNetworkInfo = this.f21117g.getActiveNetworkInfo();
        boolean z10 = true;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean i10 = i();
        boolean a10 = androidx.core.net.a.a(this.f21117g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z10 = false;
        }
        return new n1.b(z11, i10, a10, z10);
    }

    /* renamed from: h */
    public n1.b b() {
        return g();
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f21117g.getNetworkCapabilities(this.f21117g.getActiveNetwork());
            if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
                return false;
            }
            return true;
        } catch (SecurityException e10) {
            p.c().b(f21116j, "Unable to validate active network", e10);
            return false;
        }
    }
}
