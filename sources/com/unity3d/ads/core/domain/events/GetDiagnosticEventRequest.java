package com.unity3d.ads.core.domain.events;

import com.google.protobuf.i;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import java.util.Map;
import kotlin.jvm.internal.m;
import vb.o0;
import vb.r0;
import vb.s0;
import vb.u0;

/* compiled from: GetDiagnosticEventRequest.kt */
public final class GetDiagnosticEventRequest {
    private final GetSharedDataTimestamps getSharedDataTimestamps;

    public GetDiagnosticEventRequest(GetSharedDataTimestamps getSharedDataTimestamps2) {
        m.e(getSharedDataTimestamps2, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps2;
    }

    public final s0 invoke(String str, Map<String, String> map, Map<String, Integer> map2, Double d10, boolean z10, i iVar, String str2, r0 r0Var) {
        m.e(str, "eventName");
        m.e(iVar, "opportunityId");
        m.e(str2, "placement");
        m.e(r0Var, "adType");
        o0.a aVar = o0.f39048b;
        s0.a y02 = s0.y0();
        m.d(y02, "newBuilder()");
        o0 a10 = aVar.a(y02);
        a10.i(u0.DIAGNOSTIC_EVENT_TYPE_CUSTOM);
        a10.n(this.getSharedDataTimestamps.invoke());
        a10.h(str);
        if (map != null) {
            a10.e(a10.c(), map);
        }
        if (map2 != null) {
            a10.d(a10.b(), map2);
        }
        if (d10 != null) {
            a10.m(d10.doubleValue());
        }
        a10.k(z10);
        a10.j(iVar);
        a10.l(str2);
        a10.g(r0Var);
        return a10.a();
    }
}
