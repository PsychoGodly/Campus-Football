package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.q;
import java.util.concurrent.atomic.AtomicReference;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class z8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f25321a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ lb f25322b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Bundle f25323c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ v8 f25324d;

    z8(v8 v8Var, AtomicReference atomicReference, lb lbVar, Bundle bundle) {
        this.f25324d = v8Var;
        this.f25321a = atomicReference;
        this.f25322b = lbVar;
        this.f25323c = bundle;
    }

    public final void run() {
        synchronized (this.f25321a) {
            try {
                i w10 = this.f25324d.f25132d;
                if (w10 == null) {
                    this.f25324d.zzj().B().a("Failed to get trigger URIs; not connected to service");
                    this.f25321a.notify();
                    return;
                }
                q.k(this.f25322b);
                this.f25321a.set(w10.e1(this.f25322b, this.f25323c));
                this.f25324d.b0();
                this.f25321a.notify();
            } catch (RemoteException e10) {
                try {
                    this.f25324d.zzj().B().b("Failed to get trigger URIs; remote exception", e10);
                    this.f25321a.notify();
                } catch (Throwable th) {
                    this.f25321a.notify();
                    throw th;
                }
            }
        }
    }
}
