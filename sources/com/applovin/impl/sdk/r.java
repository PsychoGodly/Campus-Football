package com.applovin.impl.sdk;

import com.applovin.impl.kn;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sm;
import com.applovin.impl.xl;
import java.util.concurrent.TimeUnit;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f12024a;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(k kVar) {
        if (!f12024a) {
            kVar.B().a(o.b.INTEGRATION_ERROR, "no_ads_loaded");
        }
    }

    public static void b(k kVar) {
        Long l10 = (Long) kVar.a(qe.H7);
        if (l10.longValue() > 0) {
            kVar.l0().a((xl) new kn(kVar, true, "submitIntegrationErrorReport", new q1(kVar)), sm.b.OTHER, TimeUnit.SECONDS.toMillis(l10.longValue()));
        }
    }

    public static void a() {
        f12024a = true;
    }
}
