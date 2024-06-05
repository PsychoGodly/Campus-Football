package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzps;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class la {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ da f24778a;

    la(da daVar) {
        this.f24778a = daVar;
    }

    private final void c(long j10, boolean z10) {
        this.f24778a.i();
        if (this.f24778a.f25124a.k()) {
            this.f24778a.e().f25278p.b(j10);
            this.f24778a.zzj().F().b("Session started, time", Long.valueOf(this.f24778a.zzb().b()));
            Long valueOf = Long.valueOf(j10 / 1000);
            this.f24778a.m().T("auto", "_sid", valueOf, j10);
            this.f24778a.e().f25279q.b(valueOf.longValue());
            this.f24778a.e().f25274l.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f24778a.a().n(e0.f24517m0) && z10) {
                bundle.putLong("_aib", 1);
            }
            this.f24778a.m().N("auto", "_s", j10, bundle);
            if (zznv.zza() && this.f24778a.a().n(e0.f24523p0)) {
                String a10 = this.f24778a.e().f25284v.a();
                if (!TextUtils.isEmpty(a10)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a10);
                    this.f24778a.m().N("auto", "_ssr", j10, bundle2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f24778a.i();
        if (this.f24778a.e().t(this.f24778a.zzb().a())) {
            this.f24778a.e().f25274l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f24778a.zzj().F().a("Detected application was in foreground");
                c(this.f24778a.zzb().a(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(long j10, boolean z10) {
        this.f24778a.i();
        this.f24778a.B();
        if (this.f24778a.e().t(j10)) {
            this.f24778a.e().f25274l.a(true);
            if (zzps.zza() && this.f24778a.a().n(e0.f24539x0)) {
                this.f24778a.k().D();
            }
        }
        this.f24778a.e().f25278p.b(j10);
        if (this.f24778a.e().f25274l.b()) {
            c(j10, z10);
        }
    }
}
