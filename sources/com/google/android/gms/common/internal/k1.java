package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import m5.m;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class k1 implements ServiceConnection, o1 {

    /* renamed from: a  reason: collision with root package name */
    private final Map f15427a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private int f15428b = 2;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15429c;

    /* renamed from: d  reason: collision with root package name */
    private IBinder f15430d;

    /* renamed from: f  reason: collision with root package name */
    private final j1 f15431f;

    /* renamed from: g  reason: collision with root package name */
    private ComponentName f15432g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ n1 f15433h;

    public k1(n1 n1Var, j1 j1Var) {
        this.f15433h = n1Var;
        this.f15431f = j1Var;
    }

    public final int a() {
        return this.f15428b;
    }

    public final ComponentName b() {
        return this.f15432g;
    }

    public final IBinder c() {
        return this.f15430d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f15427a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        this.f15428b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (m.m()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            n1 n1Var = this.f15433h;
            boolean d10 = n1Var.f15446j.d(n1Var.f15443g, str, this.f15431f.c(n1Var.f15443g), this, this.f15431f.a(), executor);
            this.f15429c = d10;
            if (d10) {
                this.f15433h.f15444h.sendMessageDelayed(this.f15433h.f15444h.obtainMessage(1, this.f15431f), this.f15433h.f15448l);
            } else {
                this.f15428b = 2;
                try {
                    n1 n1Var2 = this.f15433h;
                    n1Var2.f15446j.c(n1Var2.f15443g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f15427a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f15433h.f15444h.removeMessages(1, this.f15431f);
        n1 n1Var = this.f15433h;
        n1Var.f15446j.c(n1Var.f15443g, this);
        this.f15429c = false;
        this.f15428b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f15427a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f15427a.isEmpty();
    }

    public final boolean j() {
        return this.f15429c;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f15433h.f15442f) {
            this.f15433h.f15444h.removeMessages(1, this.f15431f);
            this.f15430d = iBinder;
            this.f15432g = componentName;
            for (ServiceConnection onServiceConnected : this.f15427a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f15428b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f15433h.f15442f) {
            this.f15433h.f15444h.removeMessages(1, this.f15431f);
            this.f15430d = null;
            this.f15432g = componentName;
            for (ServiceConnection onServiceDisconnected : this.f15427a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f15428b = 2;
        }
    }
}
