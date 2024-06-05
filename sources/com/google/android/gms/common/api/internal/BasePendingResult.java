package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.base.zaq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class BasePendingResult<R extends i> extends f<R> {

    /* renamed from: o  reason: collision with root package name */
    static final ThreadLocal<Boolean> f15031o = new y2();

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f15032p = 0;

    /* renamed from: a  reason: collision with root package name */
    private final Object f15033a = new Object();

    /* renamed from: b  reason: collision with root package name */
    protected final a<R> f15034b = new a<>(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    protected final WeakReference<GoogleApiClient> f15035c = new WeakReference<>((Object) null);

    /* renamed from: d  reason: collision with root package name */
    private final CountDownLatch f15036d = new CountDownLatch(1);

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList<f.a> f15037e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private j<? super R> f15038f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference<l2> f15039g = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public R f15040h;

    /* renamed from: i  reason: collision with root package name */
    private Status f15041i;

    /* renamed from: j  reason: collision with root package name */
    private volatile boolean f15042j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f15043k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f15044l;

    /* renamed from: m  reason: collision with root package name */
    private k f15045m;
    @KeepName
    private a3 mResultGuardian;

    /* renamed from: n  reason: collision with root package name */
    private boolean f15046n = false;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class a<R extends i> extends zaq {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(j<? super R> jVar, R r10) {
            int i10 = BasePendingResult.f15032p;
            sendMessage(obtainMessage(1, new Pair((j) q.k(jVar), r10)));
        }

        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                j jVar = (j) pair.first;
                i iVar = (i) pair.second;
                try {
                    jVar.a(iVar);
                } catch (RuntimeException e10) {
                    BasePendingResult.l(iVar);
                    throw e10;
                }
            } else if (i10 != 2) {
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Don't know how to handle message: ");
                sb2.append(i10);
                Log.wtf("BasePendingResult", sb2.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).d(Status.f15012k);
            }
        }
    }

    @Deprecated
    BasePendingResult() {
    }

    private final R h() {
        R r10;
        synchronized (this.f15033a) {
            q.o(!this.f15042j, "Result has already been consumed.");
            q.o(f(), "Result is not ready.");
            r10 = this.f15040h;
            this.f15040h = null;
            this.f15038f = null;
            this.f15042j = true;
        }
        l2 andSet = this.f15039g.getAndSet((Object) null);
        if (andSet != null) {
            andSet.f15201a.f15210a.remove(this);
        }
        return (i) q.k(r10);
    }

    private final void i(R r10) {
        this.f15040h = r10;
        this.f15041i = r10.p();
        this.f15045m = null;
        this.f15036d.countDown();
        if (this.f15043k) {
            this.f15038f = null;
        } else {
            j<? super R> jVar = this.f15038f;
            if (jVar != null) {
                this.f15034b.removeMessages(2);
                this.f15034b.a(jVar, h());
            } else if (this.f15040h instanceof g) {
                this.mResultGuardian = new a3(this, (z2) null);
            }
        }
        ArrayList<f.a> arrayList = this.f15037e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a(this.f15041i);
        }
        this.f15037e.clear();
    }

    public static void l(i iVar) {
        if (iVar instanceof g) {
            try {
                ((g) iVar).release();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(iVar)), e10);
            }
        }
    }

    public final void a(f.a aVar) {
        q.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f15033a) {
            if (f()) {
                aVar.a(this.f15041i);
            } else {
                this.f15037e.add(aVar);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f15033a
            monitor-enter(r0)
            boolean r1 = r2.f15043k     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0026
            boolean r1 = r2.f15042j     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0026
        L_0x000c:
            com.google.android.gms.common.internal.k r1 = r2.f15045m     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0013
            r1.cancel()     // Catch:{ RemoteException -> 0x0013 }
        L_0x0013:
            R r1 = r2.f15040h     // Catch:{ all -> 0x0028 }
            l(r1)     // Catch:{ all -> 0x0028 }
            r1 = 1
            r2.f15043k = r1     // Catch:{ all -> 0x0028 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f15013l     // Catch:{ all -> 0x0028 }
            com.google.android.gms.common.api.i r1 = r2.c(r1)     // Catch:{ all -> 0x0028 }
            r2.i(r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.b():void");
    }

    /* access modifiers changed from: protected */
    public abstract R c(Status status);

    @Deprecated
    public final void d(Status status) {
        synchronized (this.f15033a) {
            if (!f()) {
                g(c(status));
                this.f15044l = true;
            }
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f15033a) {
            z10 = this.f15043k;
        }
        return z10;
    }

    public final boolean f() {
        return this.f15036d.getCount() == 0;
    }

    public final void g(R r10) {
        synchronized (this.f15033a) {
            if (this.f15044l || this.f15043k) {
                l(r10);
                return;
            }
            f();
            q.o(!f(), "Results have already been set");
            q.o(!this.f15042j, "Result has already been consumed");
            i(r10);
        }
    }

    public final void k() {
        boolean z10 = true;
        if (!this.f15046n && !f15031o.get().booleanValue()) {
            z10 = false;
        }
        this.f15046n = z10;
    }

    public final boolean m() {
        boolean e10;
        synchronized (this.f15033a) {
            if (((GoogleApiClient) this.f15035c.get()) == null || !this.f15046n) {
                b();
            }
            e10 = e();
        }
        return e10;
    }

    public final void n(l2 l2Var) {
        this.f15039g.set(l2Var);
    }
}
