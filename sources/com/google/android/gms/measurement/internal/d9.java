package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.q;
import java.util.concurrent.atomic.AtomicReference;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class d9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f24481a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ lb f24482b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ v8 f24483c;

    d9(v8 v8Var, AtomicReference atomicReference, lb lbVar) {
        this.f24483c = v8Var;
        this.f24481a = atomicReference;
        this.f24482b = lbVar;
    }

    public final void run() {
        synchronized (this.f24481a) {
            try {
                if (!this.f24483c.e().E().y()) {
                    this.f24483c.zzj().H().a("Analytics storage consent denied; will not get app instance id");
                    this.f24483c.m().M((String) null);
                    this.f24483c.e().f25269g.b((String) null);
                    this.f24481a.set((Object) null);
                    this.f24481a.notify();
                    return;
                }
                i w10 = this.f24483c.f25132d;
                if (w10 == null) {
                    this.f24483c.zzj().B().a("Failed to get app instance id");
                    this.f24481a.notify();
                    return;
                }
                q.k(this.f24482b);
                this.f24481a.set(w10.Z(this.f24482b));
                String str = (String) this.f24481a.get();
                if (str != null) {
                    this.f24483c.m().M(str);
                    this.f24483c.e().f25269g.b(str);
                }
                this.f24483c.b0();
                this.f24481a.notify();
            } catch (RemoteException e10) {
                try {
                    this.f24483c.zzj().B().b("Failed to get app instance id", e10);
                    this.f24481a.notify();
                } catch (Throwable th) {
                    this.f24481a.notify();
                    throw th;
                }
            }
        }
    }
}
