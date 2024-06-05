package g5;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import n5.b;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class x {

    /* renamed from: e  reason: collision with root package name */
    private static x f18155e;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f18156a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f18157b;

    /* renamed from: c  reason: collision with root package name */
    private r f18158c = new r(this, (q) null);

    /* renamed from: d  reason: collision with root package name */
    private int f18159d = 1;

    x(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f18157b = scheduledExecutorService;
        this.f18156a = context.getApplicationContext();
    }

    public static synchronized x b(Context context) {
        x xVar;
        synchronized (x.class) {
            if (f18155e == null) {
                zze.zza();
                f18155e = new x(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new b("MessengerIpcClient"))));
            }
            xVar = f18155e;
        }
        return xVar;
    }

    private final synchronized int f() {
        int i10;
        i10 = this.f18159d;
        this.f18159d = i10 + 1;
        return i10;
    }

    private final synchronized <T> Task<T> g(u<T> uVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(uVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 9);
            sb2.append("Queueing ");
            sb2.append(valueOf);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        if (!this.f18158c.g(uVar)) {
            r rVar = new r(this, (q) null);
            this.f18158c = rVar;
            rVar.g(uVar);
        }
        return uVar.f18152b.getTask();
    }

    public final Task<Void> c(int i10, Bundle bundle) {
        return g(new t(f(), 2, bundle));
    }

    public final Task<Bundle> d(int i10, Bundle bundle) {
        return g(new w(f(), 1, bundle));
    }
}
