package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class g1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h1 f15129a;

    g1(h1 h1Var) {
        this.f15129a = h1Var;
    }

    public final void run() {
        i1 i1Var = this.f15129a.f15134a;
        i1Var.f15142b.disconnect(i1Var.f15142b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
