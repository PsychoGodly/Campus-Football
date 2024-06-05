package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzoh;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class ja {

    /* renamed from: a  reason: collision with root package name */
    private long f24727a;

    /* renamed from: b  reason: collision with root package name */
    protected long f24728b;

    /* renamed from: c  reason: collision with root package name */
    private final u f24729c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ da f24730d;

    public ja(da daVar) {
        this.f24730d = daVar;
        this.f24729c = new ma(this, daVar.f25124a);
        long b10 = daVar.zzb().b();
        this.f24727a = b10;
        this.f24728b = b10;
    }

    static /* synthetic */ void c(ja jaVar) {
        jaVar.f24730d.i();
        jaVar.d(false, false, jaVar.f24730d.zzb().b());
        jaVar.f24730d.j().q(jaVar.f24730d.zzb().b());
    }

    /* access modifiers changed from: package-private */
    public final long a(long j10) {
        long j11 = j10 - this.f24728b;
        this.f24728b = j10;
        return j11;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f24729c.a();
        this.f24727a = 0;
        this.f24728b = 0;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        this.f24730d.i();
        this.f24730d.q();
        if (!zzoh.zza() || !this.f24730d.a().n(e0.f24525q0) || this.f24730d.f25124a.k()) {
            this.f24730d.e().f25278p.b(this.f24730d.zzb().a());
        }
        long j11 = j10 - this.f24727a;
        if (z10 || j11 >= 1000) {
            if (!z11) {
                j11 = a(j10);
            }
            this.f24730d.zzj().F().b("Recording user engagement, ms", Long.valueOf(j11));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j11);
            ib.R(this.f24730d.n().x(!this.f24730d.a().L()), bundle, true);
            if (!z11) {
                this.f24730d.m().u0("auto", "_e", bundle);
            }
            this.f24727a = j10;
            this.f24729c.a();
            this.f24729c.b(3600000);
            return true;
        }
        this.f24730d.zzj().F().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void e(long j10) {
        this.f24729c.a();
    }

    /* access modifiers changed from: package-private */
    public final void f(long j10) {
        this.f24730d.i();
        this.f24729c.a();
        this.f24727a = j10;
        this.f24728b = j10;
    }
}
