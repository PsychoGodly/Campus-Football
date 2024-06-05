package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.q;
import h5.b;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class e0 implements x0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a1 f15089a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f15090b = false;

    public e0(a1 a1Var) {
        this.f15089a = a1Var;
    }

    public final void a(Bundle bundle) {
    }

    public final void b() {
        if (this.f15090b) {
            this.f15090b = false;
            this.f15089a.l(new d0(this, this));
        }
    }

    public final void c(b bVar, a<?> aVar, boolean z10) {
    }

    public final void d(int i10) {
        this.f15089a.k((b) null);
        this.f15089a.f15063p.c(i10, this.f15090b);
    }

    public final void e() {
    }

    public final boolean f() {
        if (this.f15090b) {
            return false;
        }
        Set<k2> set = this.f15089a.f15062o.f15315w;
        if (set == null || set.isEmpty()) {
            this.f15089a.k((b) null);
            return true;
        }
        this.f15090b = true;
        for (k2 f10 : set) {
            f10.f();
        }
        return false;
    }

    public final <A extends a.b, T extends d<? extends i, A>> T g(T t10) {
        try {
            this.f15089a.f15062o.f15316x.a(t10);
            w0 w0Var = this.f15089a.f15062o;
            a.f fVar = w0Var.f15307o.get(t10.q());
            q.l(fVar, "Appropriate Api was not requested.");
            if (fVar.isConnected() || !this.f15089a.f15055h.containsKey(t10.q())) {
                t10.s(fVar);
            } else {
                t10.u(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f15089a.l(new c0(this, this));
        }
        return t10;
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        if (this.f15090b) {
            this.f15090b = false;
            this.f15089a.f15062o.f15316x.b();
            f();
        }
    }
}
