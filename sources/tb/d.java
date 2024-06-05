package tb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import lc.d;

/* compiled from: ConnectivityBroadcastReceiver */
public class d extends BroadcastReceiver implements d.C0413d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f38545a;

    /* renamed from: b  reason: collision with root package name */
    private final a f38546b;

    /* renamed from: c  reason: collision with root package name */
    private d.b f38547c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f38548d = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f38549f;

    /* compiled from: ConnectivityBroadcastReceiver */
    class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        public void onAvailable(Network network) {
            d.this.i();
        }

        public void onLost(Network network) {
            d.this.j("none");
        }
    }

    public d(Context context, a aVar) {
        this.f38545a = context;
        this.f38546b = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f38547c.success(this.f38546b.b());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(String str) {
        this.f38547c.success(str);
    }

    /* access modifiers changed from: private */
    public void i() {
        this.f38548d.post(new b(this));
    }

    /* access modifiers changed from: private */
    public void j(String str) {
        this.f38548d.post(new c(this, str));
    }

    public void g(Object obj) {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                this.f38545a.unregisterReceiver(this);
            } catch (Exception unused) {
            }
        } else if (this.f38549f != null) {
            this.f38546b.a().unregisterNetworkCallback(this.f38549f);
            this.f38549f = null;
        }
    }

    public void h(Object obj, d.b bVar) {
        this.f38547c = bVar;
        if (Build.VERSION.SDK_INT >= 24) {
            this.f38549f = new a();
            this.f38546b.a().registerDefaultNetworkCallback(this.f38549f);
            return;
        }
        this.f38545a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void onReceive(Context context, Intent intent) {
        d.b bVar = this.f38547c;
        if (bVar != null) {
            bVar.success(this.f38546b.b());
        }
    }
}
