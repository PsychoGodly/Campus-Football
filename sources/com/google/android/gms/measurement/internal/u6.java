package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
abstract class u6 extends v6 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f25097b;

    u6(w5 w5Var) {
        super(w5Var);
        this.f25124a.i();
    }

    /* access modifiers changed from: protected */
    public final void j() {
        if (!m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.f25097b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!n()) {
            this.f25124a.M();
            this.f25097b = true;
        }
    }

    public final void l() {
        if (!this.f25097b) {
            o();
            this.f25124a.M();
            this.f25097b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    public final boolean m() {
        return this.f25097b;
    }

    /* access modifiers changed from: protected */
    public abstract boolean n();

    /* access modifiers changed from: protected */
    public void o() {
    }
}
