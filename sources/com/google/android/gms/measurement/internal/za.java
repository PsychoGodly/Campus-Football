package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.q;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class za implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ lb f25328a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ va f25329b;

    za(va vaVar, lb lbVar) {
        this.f25329b = vaVar;
        this.f25328a = lbVar;
    }

    public final /* synthetic */ Object call() throws Exception {
        if (!this.f25329b.L((String) q.k(this.f25328a.f24779a)).y() || !y6.e(this.f25328a.f24800w).y()) {
            this.f25329b.zzj().F().a("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        r5 d10 = this.f25329b.d(this.f25328a);
        if (d10 != null) {
            return d10.u0();
        }
        this.f25329b.zzj().G().a("App info was null when attempting to get app instance id");
        return null;
    }
}
