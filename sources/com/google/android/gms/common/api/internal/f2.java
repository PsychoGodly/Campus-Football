package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import h5.d;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class f2 extends s {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ s.a f15125d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    f2(s.a aVar, d[] dVarArr, boolean z10, int i10) {
        super(dVarArr, z10, i10);
        this.f15125d = aVar;
    }

    /* access modifiers changed from: protected */
    public final void b(a.b bVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.f15125d.f15251a.accept(bVar, taskCompletionSource);
    }
}
