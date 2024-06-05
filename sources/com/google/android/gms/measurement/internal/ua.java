package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
abstract class ua extends ra {

    /* renamed from: c  reason: collision with root package name */
    private boolean f25104c;

    ua(va vaVar) {
        super(vaVar);
        this.f25029b.m0();
    }

    /* access modifiers changed from: protected */
    public final void p() {
        if (!r()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void q() {
        if (!this.f25104c) {
            s();
            this.f25029b.l0();
            this.f25104c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    public final boolean r() {
        return this.f25104c;
    }

    /* access modifiers changed from: protected */
    public abstract boolean s();
}
