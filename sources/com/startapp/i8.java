package com.startapp;

import com.startapp.k8;

/* compiled from: Sta */
public class i8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k8 f15927a;

    public i8(k8 k8Var) {
        this.f15927a = k8Var;
    }

    public void run() {
        k8 k8Var = this.f15927a;
        k8Var.getClass();
        try {
            if (k8Var.a() != null) {
                if (k8Var.f16055f == null) {
                    k8.c a10 = k8Var.a((Class<?>) null);
                    k8Var.f16055f = a10;
                    if (a10 != null) {
                        a10.a();
                    }
                }
            }
        } catch (Throwable th) {
            if (k8Var.a(1)) {
                i3.a(th);
            }
        }
    }
}
