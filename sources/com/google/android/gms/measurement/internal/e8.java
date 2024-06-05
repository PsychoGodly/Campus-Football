package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class e8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ v f24560a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b7 f24561b;

    e8(b7 b7Var, v vVar) {
        this.f24561b = b7Var;
        this.f24560a = vVar;
    }

    public final void run() {
        if (this.f24561b.e().u(this.f24560a)) {
            this.f24561b.o().P(false);
        } else {
            this.f24561b.zzj().E().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.f24560a.a()));
        }
    }
}
