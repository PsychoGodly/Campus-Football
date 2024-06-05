package com.onesignal;

class OSPermissionChangedInternalObserver {
    OSPermissionChangedInternalObserver() {
    }

    static void a(l2 l2Var) {
        if (k3.x0().c(new m2(k3.f27911e0, (l2) l2Var.clone()))) {
            l2 l2Var2 = (l2) l2Var.clone();
            k3.f27911e0 = l2Var2;
            l2Var2.d();
        }
    }

    static void b(l2 l2Var) {
        if (!l2Var.a()) {
            l.d(0, k3.f27912f);
        }
        y3.y(k3.F());
    }

    /* access modifiers changed from: package-private */
    public void changed(l2 l2Var) {
        b(l2Var);
        a(l2Var);
    }
}
