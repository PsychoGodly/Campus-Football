package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class j3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f15166a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f15167b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k3 f15168c;

    j3(k3 k3Var, LifecycleCallback lifecycleCallback, String str) {
        this.f15168c = k3Var;
        this.f15166a = lifecycleCallback;
        this.f15167b = str;
    }

    public final void run() {
        k3 k3Var = this.f15168c;
        if (k3Var.f15183d0 > 0) {
            this.f15166a.onCreate(k3Var.f15184e0 != null ? k3Var.f15184e0.getBundle(this.f15167b) : null);
        }
        if (this.f15168c.f15183d0 >= 2) {
            this.f15166a.onStart();
        }
        if (this.f15168c.f15183d0 >= 3) {
            this.f15166a.onResume();
        }
        if (this.f15168c.f15183d0 >= 4) {
            this.f15166a.onStop();
        }
        if (this.f15168c.f15183d0 >= 5) {
            this.f15166a.onDestroy();
        }
    }
}
