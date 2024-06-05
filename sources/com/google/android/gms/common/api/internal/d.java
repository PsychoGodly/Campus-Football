package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.q;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class d<R extends i, A extends a.b> extends BasePendingResult<R> {

    /* renamed from: q  reason: collision with root package name */
    private final a.c<A> f15085q;

    /* renamed from: r  reason: collision with root package name */
    private final a<?> f15086r;

    private void t(RemoteException remoteException) {
        u(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* access modifiers changed from: protected */
    public abstract void o(A a10) throws RemoteException;

    public final a<?> p() {
        return this.f15086r;
    }

    public final a.c<A> q() {
        return this.f15085q;
    }

    /* access modifiers changed from: protected */
    public void r(R r10) {
    }

    public final void s(A a10) throws DeadObjectException {
        try {
            o(a10);
        } catch (DeadObjectException e10) {
            t(e10);
            throw e10;
        } catch (RemoteException e11) {
            t(e11);
        }
    }

    public final void u(Status status) {
        q.b(!status.z(), "Failed result must not be success");
        i c10 = c(status);
        g(c10);
        r(c10);
    }
}
