package g5;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import l5.a;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class r implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    int f18143a = 0;

    /* renamed from: b  reason: collision with root package name */
    final Messenger f18144b = new Messenger(new zzf(Looper.getMainLooper(), new k(this)));

    /* renamed from: c  reason: collision with root package name */
    s f18145c;

    /* renamed from: d  reason: collision with root package name */
    final Queue<u<?>> f18146d = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    final SparseArray<u<?>> f18147f = new SparseArray<>();

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ x f18148g;

    /* synthetic */ r(x xVar, q qVar) {
        this.f18148g = xVar;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(int i10, String str) {
        b(i10, str, (Throwable) null);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(int i10, String str, Throwable th) {
        String str2;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Disconnected: ".concat(valueOf);
            } else {
                str2 = new String("Disconnected: ");
            }
            Log.d("MessengerIpcClient", str2);
        }
        int i11 = this.f18143a;
        if (i11 == 0) {
            throw new IllegalStateException();
        } else if (i11 == 1 || i11 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f18143a = 4;
            a.b().c(this.f18148g.f18156a, this);
            v vVar = new v(i10, str, th);
            for (u c10 : this.f18146d) {
                c10.c(vVar);
            }
            this.f18146d.clear();
            for (int i12 = 0; i12 < this.f18147f.size(); i12++) {
                this.f18147f.valueAt(i12).c(vVar);
            }
            this.f18147f.clear();
        } else if (i11 == 3) {
            this.f18143a = 4;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f18148g.f18157b.execute(new m(this));
    }

    /* access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.f18143a == 1) {
            a(1, "Timed out while binding");
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void e(int i10) {
        u uVar = this.f18147f.get(i10);
        if (uVar != null) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Timing out request: ");
            sb2.append(i10);
            Log.w("MessengerIpcClient", sb2.toString());
            this.f18147f.remove(i10);
            uVar.c(new v(3, "Timed out waiting for response", (Throwable) null));
            f();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void f() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f18143a     // Catch:{ all -> 0x0039 }
            r1 = 2
            if (r0 != r1) goto L_0x0037
            java.util.Queue<g5.u<?>> r0 = r2.f18146d     // Catch:{ all -> 0x0039 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0037
            android.util.SparseArray<g5.u<?>> r0 = r2.f18147f     // Catch:{ all -> 0x0039 }
            int r0 = r0.size()     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r1 = "Finished handling requests, unbinding"
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x0039 }
        L_0x0025:
            r0 = 3
            r2.f18143a = r0     // Catch:{ all -> 0x0039 }
            l5.a r0 = l5.a.b()     // Catch:{ all -> 0x0039 }
            g5.x r1 = r2.f18148g     // Catch:{ all -> 0x0039 }
            android.content.Context r1 = r1.f18156a     // Catch:{ all -> 0x0039 }
            r0.c(r1, r2)     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x0037:
            monitor-exit(r2)
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.r.f():void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean g(u<?> uVar) {
        int i10 = this.f18143a;
        if (i10 == 0) {
            this.f18146d.add(uVar);
            q.n(this.f18143a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f18143a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (!a.b().a(this.f18148g.f18156a, intent, this, 1)) {
                    a(0, "Unable to bind to service");
                } else {
                    this.f18148g.f18157b.schedule(new n(this), 30, TimeUnit.SECONDS);
                }
            } catch (SecurityException e10) {
                b(0, "Unable to bind to service", e10);
            }
        } else if (i10 == 1) {
            this.f18146d.add(uVar);
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            this.f18146d.add(uVar);
            c();
            return true;
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f18148g.f18157b.execute(new o(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f18148g.f18157b.execute(new l(this));
    }
}
