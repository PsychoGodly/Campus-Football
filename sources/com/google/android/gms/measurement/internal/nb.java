package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final /* synthetic */ class nb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ w5 f24873a;

    public /* synthetic */ nb(w5 w5Var) {
        this.f24873a = w5Var;
    }

    public final void run() {
        w5 w5Var = this.f24873a;
        if (!w5Var.G().Q0()) {
            w5Var.zzj().G().a("registerTrigger called but app not eligible");
            return;
        }
        b7 C = w5Var.C();
        C.getClass();
        new Thread(new ob(C)).start();
    }
}
