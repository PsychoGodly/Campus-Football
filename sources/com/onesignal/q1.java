package com.onesignal;

import com.onesignal.k3;

/* compiled from: OSInAppMessagePushPrompt */
public class q1 extends o1 {
    /* access modifiers changed from: private */
    public static /* synthetic */ void f(k3.z0 z0Var, boolean z10) {
        k3.g1 g1Var;
        if (z10) {
            g1Var = k3.g1.PERMISSION_GRANTED;
        } else {
            g1Var = k3.g1.PERMISSION_DENIED;
        }
        z0Var.a(g1Var);
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return "push";
    }

    /* access modifiers changed from: package-private */
    public void b(k3.z0 z0Var) {
        k3.E1(true, new p1(z0Var));
    }
}
