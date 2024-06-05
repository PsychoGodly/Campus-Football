package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.internal.j;
import h5.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class l1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f15199a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m1 f15200b;

    l1(m1 m1Var, b bVar) {
        this.f15200b = m1Var;
        this.f15199a = bVar;
    }

    public final void run() {
        m1 m1Var = this.f15200b;
        i1 i1Var = (i1) m1Var.f15208f.f15116m.get(m1Var.f15204b);
        if (i1Var != null) {
            if (this.f15199a.z()) {
                this.f15200b.f15207e = true;
                if (this.f15200b.f15203a.requiresSignIn()) {
                    this.f15200b.h();
                    return;
                }
                try {
                    m1 m1Var2 = this.f15200b;
                    m1Var2.f15203a.getRemoteService((j) null, m1Var2.f15203a.getScopesForConnectionlessNonSignIn());
                } catch (SecurityException e10) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                    this.f15200b.f15203a.disconnect("Failed to get service from broker.");
                    i1Var.E(new b(10), (Exception) null);
                }
            } else {
                i1Var.E(this.f15199a, (Exception) null);
            }
        }
    }
}
