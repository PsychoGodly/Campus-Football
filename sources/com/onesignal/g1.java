package com.onesignal;

import android.os.Build;
import ka.a;

/* compiled from: OSInAppMessageControllerFactory */
class g1 {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f27817b = new Object();

    /* renamed from: a  reason: collision with root package name */
    private f1 f27818a;

    g1() {
    }

    public f1 a(r3 r3Var, z2 z2Var, v1 v1Var, t2 t2Var, a aVar) {
        if (this.f27818a == null) {
            synchronized (f27817b) {
                if (this.f27818a == null) {
                    if (Build.VERSION.SDK_INT <= 18) {
                        this.f27818a = new h1((r3) null, z2Var, v1Var, t2Var, aVar);
                    } else {
                        this.f27818a = new f1(r3Var, z2Var, v1Var, t2Var, aVar);
                    }
                }
            }
        }
        return this.f27818a;
    }
}
