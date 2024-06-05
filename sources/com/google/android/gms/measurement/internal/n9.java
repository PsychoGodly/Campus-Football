package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class n9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f24864a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f24865b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f24866c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f24867d;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ lb f24868f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ v8 f24869g;

    n9(v8 v8Var, AtomicReference atomicReference, String str, String str2, String str3, lb lbVar) {
        this.f24869g = v8Var;
        this.f24864a = atomicReference;
        this.f24865b = str;
        this.f24866c = str2;
        this.f24867d = str3;
        this.f24868f = lbVar;
    }

    public final void run() {
        synchronized (this.f24864a) {
            try {
                i w10 = this.f24869g.f25132d;
                if (w10 == null) {
                    this.f24869g.zzj().B().d("(legacy) Failed to get conditional properties; not connected to service", n4.q(this.f24865b), this.f24866c, this.f24867d);
                    this.f24864a.set(Collections.emptyList());
                    this.f24864a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f24865b)) {
                    q.k(this.f24868f);
                    this.f24864a.set(w10.n(this.f24866c, this.f24867d, this.f24868f));
                } else {
                    this.f24864a.set(w10.q0(this.f24865b, this.f24866c, this.f24867d));
                }
                this.f24869g.b0();
                this.f24864a.notify();
            } catch (RemoteException e10) {
                try {
                    this.f24869g.zzj().B().d("(legacy) Failed to get conditional properties; remote exception", n4.q(this.f24865b), this.f24866c, e10);
                    this.f24864a.set(Collections.emptyList());
                    this.f24864a.notify();
                } catch (Throwable th) {
                    this.f24864a.notify();
                    throw th;
                }
            }
        }
    }
}
