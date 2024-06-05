package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.q;
import h5.b;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class g0 implements c.C0157c {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<r0> f15126a;

    /* renamed from: b  reason: collision with root package name */
    private final a<?> f15127b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15128c;

    public g0(r0 r0Var, a<?> aVar, boolean z10) {
        this.f15126a = new WeakReference<>(r0Var);
        this.f15127b = aVar;
        this.f15128c = z10;
    }

    public final void a(b bVar) {
        Lock y10;
        r0 r0Var = (r0) this.f15126a.get();
        if (r0Var != null) {
            q.o(Looper.myLooper() == r0Var.f15223a.f15062o.f(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            r0Var.f15224b.lock();
            try {
                if (!r0Var.n(0)) {
                    y10 = r0Var.f15224b;
                } else {
                    if (!bVar.z()) {
                        r0Var.l(bVar, this.f15127b, this.f15128c);
                    }
                    if (r0Var.o()) {
                        r0Var.m();
                    }
                    y10 = r0Var.f15224b;
                }
                y10.unlock();
            } catch (Throwable th) {
                r0Var.f15224b.unlock();
                throw th;
            }
        }
    }
}
