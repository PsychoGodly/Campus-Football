package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import h5.d;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class s<A extends a.b, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final d[] f15248a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15249b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15250c;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class a<A extends a.b, ResultT> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public p<A, TaskCompletionSource<ResultT>> f15251a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f15252b = true;

        /* renamed from: c  reason: collision with root package name */
        private d[] f15253c;

        /* renamed from: d  reason: collision with root package name */
        private int f15254d = 0;

        /* synthetic */ a(g2 g2Var) {
        }

        public s<A, ResultT> a() {
            q.b(this.f15251a != null, "execute parameter required");
            return new f2(this, this.f15253c, this.f15252b, this.f15254d);
        }

        public a<A, ResultT> b(p<A, TaskCompletionSource<ResultT>> pVar) {
            this.f15251a = pVar;
            return this;
        }

        public a<A, ResultT> c(boolean z10) {
            this.f15252b = z10;
            return this;
        }

        public a<A, ResultT> d(d... dVarArr) {
            this.f15253c = dVarArr;
            return this;
        }

        public a<A, ResultT> e(int i10) {
            this.f15254d = i10;
            return this;
        }
    }

    protected s(d[] dVarArr, boolean z10, int i10) {
        this.f15248a = dVarArr;
        boolean z11 = false;
        if (dVarArr != null && z10) {
            z11 = true;
        }
        this.f15249b = z11;
        this.f15250c = i10;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>((g2) null);
    }

    /* access modifiers changed from: protected */
    public abstract void b(A a10, TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException;

    public boolean c() {
        return this.f15249b;
    }

    public final int d() {
        return this.f15250c;
    }

    public final d[] e() {
        return this.f15248a;
    }
}
