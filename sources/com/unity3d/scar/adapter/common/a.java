package com.unity3d.scar.adapter.common;

/* compiled from: DispatchGroup */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private int f32016a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f32017b;

    public a() {
        this.f32016a = 0;
        this.f32016a = 0;
    }

    private void d() {
        Runnable runnable;
        if (this.f32016a <= 0 && (runnable = this.f32017b) != null) {
            runnable.run();
        }
    }

    public synchronized void a() {
        this.f32016a++;
    }

    public synchronized void b() {
        this.f32016a--;
        d();
    }

    public void c(Runnable runnable) {
        this.f32017b = runnable;
        d();
    }
}
