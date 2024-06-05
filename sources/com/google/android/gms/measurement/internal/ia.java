package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class ia {

    /* renamed from: a  reason: collision with root package name */
    private ha f24695a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ da f24696b;

    ia(da daVar) {
        this.f24696b = daVar;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f24696b.i();
        if (this.f24695a != null) {
            this.f24696b.f24484c.removeCallbacks(this.f24695a);
        }
        this.f24696b.e().f25281s.a(false);
        this.f24696b.y(false);
    }

    /* access modifiers changed from: package-private */
    public final void b(long j10) {
        this.f24695a = new ha(this, this.f24696b.zzb().a(), j10);
        this.f24696b.f24484c.postDelayed(this.f24695a, 2000);
    }
}
