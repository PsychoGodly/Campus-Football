package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.tasks.TaskCompletionSource;
import h5.d;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class o2<ResultT> extends s1 {

    /* renamed from: b  reason: collision with root package name */
    private final s<a.b, ResultT> f15215b;

    /* renamed from: c  reason: collision with root package name */
    private final TaskCompletionSource<ResultT> f15216c;

    /* renamed from: d  reason: collision with root package name */
    private final r f15217d;

    public o2(int i10, s<a.b, ResultT> sVar, TaskCompletionSource<ResultT> taskCompletionSource, r rVar) {
        super(i10);
        this.f15216c = taskCompletionSource;
        this.f15215b = sVar;
        this.f15217d = rVar;
        if (i10 == 2 && sVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(Status status) {
        this.f15216c.trySetException(this.f15217d.a(status));
    }

    public final void b(Exception exc) {
        this.f15216c.trySetException(exc);
    }

    public final void c(i1<?> i1Var) throws DeadObjectException {
        try {
            this.f15215b.b(i1Var.s(), this.f15216c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(q2.e(e11));
        } catch (RuntimeException e12) {
            this.f15216c.trySetException(e12);
        }
    }

    public final void d(y yVar, boolean z10) {
        yVar.d(this.f15216c, z10);
    }

    public final boolean f(i1<?> i1Var) {
        return this.f15215b.c();
    }

    public final d[] g(i1<?> i1Var) {
        return this.f15215b.e();
    }
}
