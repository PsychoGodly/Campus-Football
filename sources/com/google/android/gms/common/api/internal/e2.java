package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.o0;
import com.google.android.gms.common.internal.q;
import h5.b;
import java.util.Set;
import u5.e;
import u5.f;
import v5.d;
import v5.l;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class e2 extends d implements GoogleApiClient.b, GoogleApiClient.c {

    /* renamed from: i  reason: collision with root package name */
    private static final a.C0154a<? extends f, u5.a> f15092i = e.f30580c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f15093a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f15094b;

    /* renamed from: c  reason: collision with root package name */
    private final a.C0154a<? extends f, u5.a> f15095c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Scope> f15096d;

    /* renamed from: f  reason: collision with root package name */
    private final com.google.android.gms.common.internal.d f15097f;

    /* renamed from: g  reason: collision with root package name */
    private f f15098g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public d2 f15099h;

    public e2(Context context, Handler handler, com.google.android.gms.common.internal.d dVar) {
        a.C0154a<? extends f, u5.a> aVar = f15092i;
        this.f15093a = context;
        this.f15094b = handler;
        this.f15097f = (com.google.android.gms.common.internal.d) q.l(dVar, "ClientSettings must not be null");
        this.f15096d = dVar.e();
        this.f15095c = aVar;
    }

    static /* bridge */ /* synthetic */ void B1(e2 e2Var, l lVar) {
        b v10 = lVar.v();
        if (v10.z()) {
            o0 o0Var = (o0) q.k(lVar.w());
            b v11 = o0Var.v();
            if (!v11.z()) {
                String valueOf = String.valueOf(v11);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                e2Var.f15099h.b(v11);
                e2Var.f15098g.disconnect();
                return;
            }
            e2Var.f15099h.c(o0Var.w(), e2Var.f15096d);
        } else {
            e2Var.f15099h.b(v10);
        }
        e2Var.f15098g.disconnect();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, u5.f] */
    public final void C1(d2 d2Var) {
        f fVar = this.f15098g;
        if (fVar != null) {
            fVar.disconnect();
        }
        this.f15097f.j(Integer.valueOf(System.identityHashCode(this)));
        a.C0154a aVar = this.f15095c;
        Context context = this.f15093a;
        Looper looper = this.f15094b.getLooper();
        com.google.android.gms.common.internal.d dVar = this.f15097f;
        this.f15098g = aVar.buildClient(context, looper, dVar, dVar.f(), (GoogleApiClient.b) this, (GoogleApiClient.c) this);
        this.f15099h = d2Var;
        Set<Scope> set = this.f15096d;
        if (set == null || set.isEmpty()) {
            this.f15094b.post(new b2(this));
        } else {
            this.f15098g.d();
        }
    }

    public final void D1() {
        f fVar = this.f15098g;
        if (fVar != null) {
            fVar.disconnect();
        }
    }

    public final void Q0(l lVar) {
        this.f15094b.post(new c2(this, lVar));
    }

    public final void onConnected(Bundle bundle) {
        this.f15098g.a(this);
    }

    public final void onConnectionFailed(b bVar) {
        this.f15099h.b(bVar);
    }

    public final void onConnectionSuspended(int i10) {
        this.f15098g.disconnect();
    }
}
