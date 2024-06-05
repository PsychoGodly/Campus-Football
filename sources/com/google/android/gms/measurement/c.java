package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.List;
import java.util.Map;
import r5.a0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class c extends AppMeasurement.a {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f24327a;

    public c(a0 a0Var) {
        super();
        q.k(a0Var);
        this.f24327a = a0Var;
    }

    public final void a(String str, String str2, Bundle bundle) {
        this.f24327a.a(str, str2, bundle);
    }

    public final List<Bundle> b(String str, String str2) {
        return this.f24327a.b(str, str2);
    }

    public final Map<String, Object> c(String str, String str2, boolean z10) {
        return this.f24327a.c(str, str2, z10);
    }

    public final void d(String str, String str2, Bundle bundle) {
        this.f24327a.d(str, str2, bundle);
    }

    public final int zza(String str) {
        return this.f24327a.zza(str);
    }

    public final void zzb(String str) {
        this.f24327a.zzb(str);
    }

    public final void zzc(String str) {
        this.f24327a.zzc(str);
    }

    public final String zzf() {
        return this.f24327a.zzf();
    }

    public final String zzg() {
        return this.f24327a.zzg();
    }

    public final String zzh() {
        return this.f24327a.zzh();
    }

    public final String zzi() {
        return this.f24327a.zzi();
    }

    public final long zza() {
        return this.f24327a.zza();
    }

    public final void zza(Bundle bundle) {
        this.f24327a.zza(bundle);
    }
}
