package com.applovin.impl.mediation;

import com.applovin.impl.de;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.w1;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final k f9545a;

    /* renamed from: b  reason: collision with root package name */
    private final t f9546b;

    /* renamed from: c  reason: collision with root package name */
    private final a f9547c;

    /* renamed from: d  reason: collision with root package name */
    private w1 f9548d;

    public interface a {
        void a(de deVar);
    }

    c(k kVar, a aVar) {
        this.f9545a = kVar;
        this.f9546b = kVar.L();
        this.f9547c = aVar;
    }

    public void a(de deVar, long j10) {
        if (t.a()) {
            t tVar = this.f9546b;
            tVar.a("AdHiddenCallbackTimeoutManager", "Scheduling in " + j10 + "ms...");
        }
        this.f9548d = w1.a(j10, this.f9545a, new m(this, deVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(de deVar) {
        if (t.a()) {
            this.f9546b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.f9547c.a(deVar);
    }

    public void a() {
        if (t.a()) {
            this.f9546b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        w1 w1Var = this.f9548d;
        if (w1Var != null) {
            w1Var.a();
            this.f9548d = null;
        }
    }
}
