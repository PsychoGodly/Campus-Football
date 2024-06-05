package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
abstract class j2<T> extends s1 {

    /* renamed from: b  reason: collision with root package name */
    protected final TaskCompletionSource<T> f15165b;

    public j2(int i10, TaskCompletionSource<T> taskCompletionSource) {
        super(i10);
        this.f15165b = taskCompletionSource;
    }

    public final void a(Status status) {
        this.f15165b.trySetException(new b(status));
    }

    public final void b(Exception exc) {
        this.f15165b.trySetException(exc);
    }

    public final void c(i1<?> i1Var) throws DeadObjectException {
        try {
            h(i1Var);
        } catch (DeadObjectException e10) {
            a(q2.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(q2.e(e11));
        } catch (RuntimeException e12) {
            this.f15165b.trySetException(e12);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void h(i1<?> i1Var) throws RemoteException;
}
