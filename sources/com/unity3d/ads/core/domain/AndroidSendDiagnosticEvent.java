package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import kotlin.jvm.internal.m;

/* compiled from: AndroidSendDiagnosticEvent.kt */
public final class AndroidSendDiagnosticEvent implements SendDiagnosticEvent {
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;

    public AndroidSendDiagnosticEvent(DiagnosticEventRepository diagnosticEventRepository2, GetDiagnosticEventRequest getDiagnosticEventRequest2) {
        m.e(diagnosticEventRepository2, "diagnosticEventRepository");
        m.e(getDiagnosticEventRequest2, "getDiagnosticEventRequest");
        this.diagnosticEventRepository = diagnosticEventRepository2;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r15.isHeaderBidding();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void invoke(java.lang.String r11, java.lang.Double r12, java.util.Map<java.lang.String, java.lang.String> r13, java.util.Map<java.lang.String, java.lang.Integer> r14, com.unity3d.ads.core.data.model.AdObject r15) {
        /*
            r10 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.m.e(r11, r0)
            if (r15 == 0) goto L_0x0013
            java.lang.Boolean r0 = r15.isHeaderBidding()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.booleanValue()
            r6 = r0
            goto L_0x0015
        L_0x0013:
            r0 = 0
            r6 = 0
        L_0x0015:
            if (r15 == 0) goto L_0x001d
            com.google.protobuf.i r0 = r15.getOpportunityId()
            if (r0 != 0) goto L_0x001f
        L_0x001d:
            com.google.protobuf.i r0 = com.google.protobuf.i.f27039b
        L_0x001f:
            r7 = r0
            if (r15 == 0) goto L_0x0028
            java.lang.String r0 = r15.getPlacementId()
            if (r0 != 0) goto L_0x002a
        L_0x0028:
            java.lang.String r0 = ""
        L_0x002a:
            r8 = r0
            if (r15 == 0) goto L_0x0033
            vb.r0 r15 = r15.getAdType()
            if (r15 != 0) goto L_0x0035
        L_0x0033:
            vb.r0 r15 = vb.r0.DIAGNOSTIC_AD_TYPE_UNSPECIFIED
        L_0x0035:
            r9 = r15
            com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest r1 = r10.getDiagnosticEventRequest
            java.lang.String r15 = "opportunityId"
            kotlin.jvm.internal.m.d(r7, r15)
            r2 = r11
            r3 = r13
            r4 = r14
            r5 = r12
            vb.s0 r11 = r1.invoke(r2, r3, r4, r5, r6, r7, r8, r9)
            com.unity3d.ads.core.data.repository.DiagnosticEventRepository r12 = r10.diagnosticEventRepository
            r12.addDiagnosticEvent(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent.invoke(java.lang.String, java.lang.Double, java.util.Map, java.util.Map, com.unity3d.ads.core.data.model.AdObject):void");
    }
}
