package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzpm;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final /* synthetic */ class ka implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ ha f24754a;

    public /* synthetic */ ka(ha haVar) {
        this.f24754a = haVar;
    }

    public final void run() {
        ha haVar = this.f24754a;
        ia iaVar = haVar.f24638c;
        long j10 = haVar.f24636a;
        long j11 = haVar.f24637b;
        iaVar.f24696b.i();
        iaVar.f24696b.zzj().A().a("Application going to the background");
        iaVar.f24696b.e().f25281s.a(true);
        iaVar.f24696b.y(true);
        if (!iaVar.f24696b.a().L()) {
            iaVar.f24696b.f24487f.e(j11);
            iaVar.f24696b.z(false, false, j11);
        }
        if (!zzpm.zza() || !iaVar.f24696b.a().n(e0.K0)) {
            iaVar.f24696b.m().N("auto", "_ab", j10, new Bundle());
        } else {
            iaVar.f24696b.zzj().E().b("Application backgrounded at: timestamp_millis", Long.valueOf(j10));
        }
    }
}
