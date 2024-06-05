package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.j;
import h5.b;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class m1 implements c.C0157c, d2 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a.f f15203a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final b<?> f15204b;

    /* renamed from: c  reason: collision with root package name */
    private j f15205c = null;

    /* renamed from: d  reason: collision with root package name */
    private Set<Scope> f15206d = null;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f15207e = false;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ f f15208f;

    public m1(f fVar, a.f fVar2, b<?> bVar) {
        this.f15208f = fVar;
        this.f15203a = fVar2;
        this.f15204b = bVar;
    }

    /* access modifiers changed from: private */
    public final void h() {
        j jVar;
        if (this.f15207e && (jVar = this.f15205c) != null) {
            this.f15203a.getRemoteService(jVar, this.f15206d);
        }
    }

    public final void a(b bVar) {
        this.f15208f.f15120q.post(new l1(this, bVar));
    }

    public final void b(b bVar) {
        i1 i1Var = (i1) this.f15208f.f15116m.get(this.f15204b);
        if (i1Var != null) {
            i1Var.F(bVar);
        }
    }

    public final void c(j jVar, Set<Scope> set) {
        if (jVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new b(4));
            return;
        }
        this.f15205c = jVar;
        this.f15206d = set;
        h();
    }
}
