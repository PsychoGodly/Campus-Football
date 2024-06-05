package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class h3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f15137a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f15138b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ i3 f15139c;

    h3(i3 i3Var, LifecycleCallback lifecycleCallback, String str) {
        this.f15139c = i3Var;
        this.f15137a = lifecycleCallback;
        this.f15138b = str;
    }

    public final void run() {
        i3 i3Var = this.f15139c;
        if (i3Var.f15156b > 0) {
            this.f15137a.onCreate(i3Var.f15157c != null ? i3Var.f15157c.getBundle(this.f15138b) : null);
        }
        if (this.f15139c.f15156b >= 2) {
            this.f15137a.onStart();
        }
        if (this.f15139c.f15156b >= 3) {
            this.f15137a.onResume();
        }
        if (this.f15139c.f15156b >= 4) {
            this.f15137a.onStop();
        }
        if (this.f15139c.f15156b >= 5) {
            this.f15137a.onDestroy();
        }
    }
}
