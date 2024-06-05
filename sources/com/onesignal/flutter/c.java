package com.onesignal.flutter;

import com.onesignal.i2;
import com.onesignal.k3;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.k;

/* compiled from: OneSignalOutcomeEventsController */
class c extends a implements k3.e1 {

    /* renamed from: d  reason: collision with root package name */
    private k.d f27791d;

    /* renamed from: f  reason: collision with root package name */
    private AtomicBoolean f27792f = new AtomicBoolean(false);

    c(lc.c cVar, k kVar, k.d dVar) {
        this.f27774c = cVar;
        this.f27773b = kVar;
        this.f27791d = dVar;
    }

    public void e(i2 i2Var) {
        if (!this.f27792f.getAndSet(true)) {
            if (i2Var == null) {
                r(this.f27791d, new HashMap());
            } else {
                r(this.f27791d, f.m(i2Var));
            }
        }
    }
}
