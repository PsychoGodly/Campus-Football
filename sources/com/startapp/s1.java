package com.startapp;

import android.net.ConnectivityManager;

/* compiled from: Sta */
public class s1 implements ConnectivityManager.OnNetworkActiveListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t1 f16372a;

    public s1(t1 t1Var) {
        this.f16372a = t1Var;
    }

    public void onNetworkActive() {
        t1 t1Var = this.f16372a;
        synchronized (t1Var.f17279c) {
            for (i2<Void> a10 : t1Var.f17279c) {
                a10.a();
            }
        }
    }
}
