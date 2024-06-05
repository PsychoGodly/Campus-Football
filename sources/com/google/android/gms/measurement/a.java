package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.b7;
import com.google.android.gms.measurement.internal.w5;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class a extends AppMeasurement.a {

    /* renamed from: a  reason: collision with root package name */
    private final w5 f24325a;

    /* renamed from: b  reason: collision with root package name */
    private final b7 f24326b;

    public a(w5 w5Var) {
        super();
        q.k(w5Var);
        this.f24325a = w5Var;
        this.f24326b = w5Var.C();
    }

    public final void a(String str, String str2, Bundle bundle) {
        this.f24325a.C().Q(str, str2, bundle);
    }

    public final List<Bundle> b(String str, String str2) {
        return this.f24326b.x(str, str2);
    }

    public final Map<String, Object> c(String str, String str2, boolean z10) {
        return this.f24326b.y(str, str2, z10);
    }

    public final void d(String str, String str2, Bundle bundle) {
        this.f24326b.s0(str, str2, bundle);
    }

    public final int zza(String str) {
        q.g(str);
        return 25;
    }

    public final void zzb(String str) {
        this.f24325a.t().u(str, this.f24325a.zzb().b());
    }

    public final void zzc(String str) {
        this.f24325a.t().y(str, this.f24325a.zzb().b());
    }

    public final String zzf() {
        return this.f24326b.d0();
    }

    public final String zzg() {
        return this.f24326b.e0();
    }

    public final String zzh() {
        return this.f24326b.f0();
    }

    public final String zzi() {
        return this.f24326b.d0();
    }

    public final long zza() {
        return this.f24325a.G().K0();
    }

    public final void zza(Bundle bundle) {
        this.f24326b.p0(bundle);
    }
}
