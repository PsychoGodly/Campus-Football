package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
abstract class y2 extends z3 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f25262b;

    y2(w5 w5Var) {
        super(w5Var);
        this.f25124a.i();
    }

    /* access modifiers changed from: protected */
    public final void q() {
        if (!u()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void r() {
        if (this.f25262b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!v()) {
            this.f25124a.M();
            this.f25262b = true;
        }
    }

    public final void s() {
        if (!this.f25262b) {
            t();
            this.f25124a.M();
            this.f25262b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    public void t() {
    }

    /* access modifiers changed from: package-private */
    public final boolean u() {
        return this.f25262b;
    }

    /* access modifiers changed from: protected */
    public abstract boolean v();
}
