package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final /* synthetic */ class g7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ b7 f24600a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f24601b;

    public /* synthetic */ g7(b7 b7Var, String str) {
        this.f24600a = b7Var;
        this.f24601b = str;
    }

    public final void run() {
        b7 b7Var = this.f24600a;
        if (b7Var.k().F(this.f24601b)) {
            b7Var.k().D();
        }
    }
}
