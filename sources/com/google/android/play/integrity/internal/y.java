package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
public final class y {

    /* renamed from: o  reason: collision with root package name */
    private static final Map f26092o = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f26093a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final n f26094b;

    /* renamed from: c  reason: collision with root package name */
    private final String f26095c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final List f26096d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final Set f26097e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Object f26098f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f26099g;

    /* renamed from: h  reason: collision with root package name */
    private final Intent f26100h;

    /* renamed from: i  reason: collision with root package name */
    private final WeakReference f26101i;

    /* renamed from: j  reason: collision with root package name */
    private final IBinder.DeathRecipient f26102j = new q(this);

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f26103k = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public ServiceConnection f26104l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public IInterface f26105m;

    /* renamed from: n  reason: collision with root package name */
    private final q f26106n;

    public y(Context context, n nVar, String str, Intent intent, q qVar, t tVar, byte[] bArr) {
        this.f26093a = context;
        this.f26094b = nVar;
        this.f26095c = "IntegrityService";
        this.f26100h = intent;
        this.f26106n = qVar;
        this.f26101i = new WeakReference((Object) null);
    }

    public static /* synthetic */ void h(y yVar) {
        yVar.f26094b.d("reportBinderDeath", new Object[0]);
        t tVar = (t) yVar.f26101i.get();
        if (tVar != null) {
            yVar.f26094b.d("calling onBinderDied", new Object[0]);
            tVar.a();
        } else {
            yVar.f26094b.d("%s : Binder has died.", yVar.f26095c);
            for (o a10 : yVar.f26096d) {
                a10.a(yVar.s());
            }
            yVar.f26096d.clear();
        }
        yVar.t();
    }

    static /* bridge */ /* synthetic */ void m(y yVar, o oVar) {
        if (yVar.f26105m == null && !yVar.f26099g) {
            yVar.f26094b.d("Initiate binding to the service.", new Object[0]);
            yVar.f26096d.add(oVar);
            x xVar = new x(yVar, (w) null);
            yVar.f26104l = xVar;
            yVar.f26099g = true;
            if (!yVar.f26093a.bindService(yVar.f26100h, xVar, 1)) {
                yVar.f26094b.d("Failed to bind to the service.", new Object[0]);
                yVar.f26099g = false;
                for (o a10 : yVar.f26096d) {
                    a10.a(new z());
                }
                yVar.f26096d.clear();
            }
        } else if (yVar.f26099g) {
            yVar.f26094b.d("Waiting to bind to the service.", new Object[0]);
            yVar.f26096d.add(oVar);
        } else {
            oVar.run();
        }
    }

    static /* bridge */ /* synthetic */ void n(y yVar) {
        yVar.f26094b.d("linkToDeath", new Object[0]);
        try {
            yVar.f26105m.asBinder().linkToDeath(yVar.f26102j, 0);
        } catch (RemoteException e10) {
            yVar.f26094b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void o(y yVar) {
        yVar.f26094b.d("unlinkToDeath", new Object[0]);
        yVar.f26105m.asBinder().unlinkToDeath(yVar.f26102j, 0);
    }

    private final RemoteException s() {
        if (Build.VERSION.SDK_INT < 15) {
            return new RemoteException();
        }
        return new RemoteException(String.valueOf(this.f26095c).concat(" : Binder has died."));
    }

    /* access modifiers changed from: private */
    public final void t() {
        synchronized (this.f26098f) {
            for (TaskCompletionSource trySetException : this.f26097e) {
                trySetException.trySetException(s());
            }
            this.f26097e.clear();
        }
    }

    public final Handler c() {
        Handler handler;
        Map map = f26092o;
        synchronized (map) {
            if (!map.containsKey(this.f26095c)) {
                HandlerThread handlerThread = new HandlerThread(this.f26095c, 10);
                handlerThread.start();
                map.put(this.f26095c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f26095c);
        }
        return handler;
    }

    public final IInterface e() {
        return this.f26105m;
    }

    public final void p(o oVar, TaskCompletionSource taskCompletionSource) {
        synchronized (this.f26098f) {
            this.f26097e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new p(this, taskCompletionSource));
        }
        synchronized (this.f26098f) {
            if (this.f26103k.getAndIncrement() > 0) {
                this.f26094b.a("Already connected to the service.", new Object[0]);
            }
        }
        c().post(new r(this, oVar.c(), oVar));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void q(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f26098f) {
            this.f26097e.remove(taskCompletionSource);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        c().post(new com.google.android.play.integrity.internal.s(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(com.google.android.gms.tasks.TaskCompletionSource r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f26098f
            monitor-enter(r0)
            java.util.Set r1 = r3.f26097e     // Catch:{ all -> 0x0039 }
            r1.remove(r4)     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            java.lang.Object r4 = r3.f26098f
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f26103k     // Catch:{ all -> 0x0036 }
            int r0 = r0.get()     // Catch:{ all -> 0x0036 }
            if (r0 <= 0) goto L_0x0028
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f26103k     // Catch:{ all -> 0x0036 }
            int r0 = r0.decrementAndGet()     // Catch:{ all -> 0x0036 }
            if (r0 <= 0) goto L_0x0028
            com.google.android.play.integrity.internal.n r0 = r3.f26094b     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "Leaving the connection open for other ongoing calls."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0036 }
            r0.d(r1, r2)     // Catch:{ all -> 0x0036 }
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            return
        L_0x0028:
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            com.google.android.play.integrity.internal.s r4 = new com.google.android.play.integrity.internal.s
            r4.<init>(r3)
            android.os.Handler r0 = r3.c()
            r0.post(r4)
            return
        L_0x0036:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            throw r0
        L_0x0039:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.integrity.internal.y.r(com.google.android.gms.tasks.TaskCompletionSource):void");
    }
}
