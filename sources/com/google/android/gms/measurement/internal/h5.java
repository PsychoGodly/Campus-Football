package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzpy;
import l5.a;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class h5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzby f24623a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ServiceConnection f24624b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f5 f24625c;

    h5(f5 f5Var, zzby zzby, ServiceConnection serviceConnection) {
        this.f24625c = f5Var;
        this.f24623a = zzby;
        this.f24624b = serviceConnection;
    }

    public final void run() {
        f5 f5Var = this.f24625c;
        g5 g5Var = f5Var.f24577b;
        String a10 = f5Var.f24576a;
        zzby zzby = this.f24623a;
        ServiceConnection serviceConnection = this.f24624b;
        Bundle a11 = g5Var.a(a10, zzby);
        g5Var.f24597a.zzl().i();
        g5Var.f24597a.L();
        if (a11 != null) {
            long j10 = a11.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j10 == 0) {
                g5Var.f24597a.zzj().G().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a11.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    g5Var.f24597a.zzj().B().a("No referrer defined in Install Referrer response");
                } else {
                    g5Var.f24597a.zzj().F().b("InstallReferrer API result", string);
                    ib G = g5Var.f24597a.G();
                    Bundle x10 = G.x(Uri.parse("?" + string), zzpy.zza() && g5Var.f24597a.u().n(e0.F0), zzoi.zza() && g5Var.f24597a.u().n(e0.f24492a1));
                    if (x10 == null) {
                        g5Var.f24597a.zzj().B().a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = x10.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j11 = a11.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j11 == 0) {
                                g5Var.f24597a.zzj().B().a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                x10.putLong("click_timestamp", j11);
                            }
                        }
                        if (j10 == g5Var.f24597a.A().f25268f.a()) {
                            g5Var.f24597a.zzj().F().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (g5Var.f24597a.k()) {
                            g5Var.f24597a.A().f25268f.b(j10);
                            g5Var.f24597a.zzj().F().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            x10.putString("_cis", "referrer API v2");
                            g5Var.f24597a.C().R("auto", "_cmp", x10, a10);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            a.b().c(g5Var.f24597a.zza(), serviceConnection);
        }
    }
}
