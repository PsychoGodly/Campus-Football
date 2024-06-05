package com.unity3d.ads.core.domain.events;

import java.util.List;
import kotlin.jvm.internal.m;
import vb.p0;
import vb.s0;
import vb.t0;

/* compiled from: GetDiagnosticEventBatchRequest.kt */
public final class GetDiagnosticEventBatchRequest {
    public final t0 invoke(List<s0> list) {
        m.e(list, "diagnosticEvents");
        p0.a aVar = p0.f39055b;
        t0.a m02 = t0.m0();
        m.d(m02, "newBuilder()");
        p0 a10 = aVar.a(m02);
        a10.b(a10.d(), list);
        return a10.a();
    }
}
