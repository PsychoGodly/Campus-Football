package pe;

import xd.g;

/* compiled from: Unconfined.kt */
public final class h3 extends k0 {

    /* renamed from: b  reason: collision with root package name */
    public static final h3 f37319b = new h3();

    private h3() {
    }

    public void X0(g gVar, Runnable runnable) {
        l3 l3Var = (l3) gVar.get(l3.f37359b);
        if (l3Var != null) {
            l3Var.f37360a = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public boolean Z0(g gVar) {
        return false;
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
