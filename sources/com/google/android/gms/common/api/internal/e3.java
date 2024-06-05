package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import h5.b;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class e3 implements r1 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v f15100a;

    /* synthetic */ e3(v vVar, d3 d3Var) {
        this.f15100a = vVar;
    }

    public final void a(b bVar) {
        this.f15100a.f15283n.lock();
        try {
            this.f15100a.f15280k = bVar;
            v.v(this.f15100a);
        } finally {
            this.f15100a.f15283n.unlock();
        }
    }

    public final void b(Bundle bundle) {
        this.f15100a.f15283n.lock();
        try {
            v.u(this.f15100a, bundle);
            this.f15100a.f15280k = b.f18803f;
            v.v(this.f15100a);
        } finally {
            this.f15100a.f15283n.unlock();
        }
    }

    public final void c(int i10, boolean z10) {
        Lock p10;
        this.f15100a.f15283n.lock();
        try {
            v vVar = this.f15100a;
            if (!vVar.f15282m && vVar.f15281l != null) {
                if (vVar.f15281l.z()) {
                    this.f15100a.f15282m = true;
                    this.f15100a.f15275f.onConnectionSuspended(i10);
                    p10 = this.f15100a.f15283n;
                    p10.unlock();
                }
            }
            this.f15100a.f15282m = false;
            v.t(this.f15100a, i10, z10);
            p10 = this.f15100a.f15283n;
            p10.unlock();
        } catch (Throwable th) {
            this.f15100a.f15283n.unlock();
            throw th;
        }
    }
}
