package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import h5.b;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class g3 implements r1 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v f15130a;

    /* synthetic */ g3(v vVar, f3 f3Var) {
        this.f15130a = vVar;
    }

    public final void a(b bVar) {
        this.f15130a.f15283n.lock();
        try {
            this.f15130a.f15281l = bVar;
            v.v(this.f15130a);
        } finally {
            this.f15130a.f15283n.unlock();
        }
    }

    public final void b(Bundle bundle) {
        this.f15130a.f15283n.lock();
        try {
            this.f15130a.f15281l = b.f18803f;
            v.v(this.f15130a);
        } finally {
            this.f15130a.f15283n.unlock();
        }
    }

    public final void c(int i10, boolean z10) {
        Lock p10;
        this.f15130a.f15283n.lock();
        try {
            v vVar = this.f15130a;
            if (vVar.f15282m) {
                vVar.f15282m = false;
                v.t(this.f15130a, i10, z10);
                p10 = this.f15130a.f15283n;
            } else {
                vVar.f15282m = true;
                this.f15130a.f15274d.onConnectionSuspended(i10);
                p10 = this.f15130a.f15283n;
            }
            p10.unlock();
        } catch (Throwable th) {
            this.f15130a.f15283n.unlock();
            throw th;
        }
    }
}
