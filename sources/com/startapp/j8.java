package com.startapp;

import com.startapp.k8;

/* compiled from: Sta */
public class j8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k8 f15981a;

    public j8(k8 k8Var) {
        this.f15981a = k8Var;
    }

    public void run() {
        k8 k8Var = this.f15981a;
        k8Var.getClass();
        try {
            k8.c cVar = k8Var.f16055f;
            if (cVar != null) {
                cVar.b();
                k8Var.f16055f = null;
            }
        } catch (Throwable th) {
            if (k8Var.a(4)) {
                i3.a(th);
            }
        }
    }
}
