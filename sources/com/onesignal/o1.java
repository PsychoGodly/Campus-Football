package com.onesignal;

import com.onesignal.k3;

/* compiled from: OSInAppMessagePrompt */
public abstract class o1 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f28074a = false;

    o1() {
    }

    /* access modifiers changed from: package-private */
    public abstract String a();

    /* access modifiers changed from: package-private */
    public abstract void b(k3.z0 z0Var);

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f28074a;
    }

    /* access modifiers changed from: package-private */
    public void d(boolean z10) {
        this.f28074a = z10;
    }

    public String toString() {
        return "OSInAppMessagePrompt{key=" + a() + " prompted=" + this.f28074a + '}';
    }
}
