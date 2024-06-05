package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.internal.q;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class n2<A extends d<? extends i, a.b>> extends q2 {

    /* renamed from: b  reason: collision with root package name */
    protected final A f15213b;

    public n2(int i10, A a10) {
        super(i10);
        this.f15213b = (d) q.l(a10, "Null methods are not runnable.");
    }

    public final void a(Status status) {
        try {
            this.f15213b.u(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb2.append(simpleName);
        sb2.append(": ");
        sb2.append(localizedMessage);
        try {
            this.f15213b.u(new Status(10, sb2.toString()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    public final void c(i1<?> i1Var) throws DeadObjectException {
        try {
            this.f15213b.s(i1Var.s());
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    public final void d(y yVar, boolean z10) {
        yVar.c(this.f15213b, z10);
    }
}
