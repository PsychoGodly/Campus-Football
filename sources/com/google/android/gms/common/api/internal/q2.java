package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class q2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f15222a;

    public q2(int i10) {
        this.f15222a = i10;
    }

    static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(i1<?> i1Var) throws DeadObjectException;

    public abstract void d(y yVar, boolean z10);
}
