package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.tasks.TaskCompletionSource;
import h5.d;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class p2 extends j2<Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final j.a<?> f15220c;

    public p2(j.a<?> aVar, TaskCompletionSource<Boolean> taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f15220c = aVar;
    }

    public final /* bridge */ /* synthetic */ void d(y yVar, boolean z10) {
    }

    public final boolean f(i1<?> i1Var) {
        if (i1Var.u().get(this.f15220c) == null) {
            return false;
        }
        throw null;
    }

    public final d[] g(i1<?> i1Var) {
        if (i1Var.u().get(this.f15220c) == null) {
            return null;
        }
        throw null;
    }

    public final void h(i1<?> i1Var) throws RemoteException {
        if (i1Var.u().remove(this.f15220c) == null) {
            this.f15165b.trySetResult(Boolean.FALSE);
        } else {
            i1Var.s();
            throw null;
        }
    }
}
