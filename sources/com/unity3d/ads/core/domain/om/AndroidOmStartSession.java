package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.jvm.internal.m;

/* compiled from: AndroidOmStartSession.kt */
public final class AndroidOmStartSession extends AndroidOmInteraction {
    private final OpenMeasurementRepository openMeasurementRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidOmStartSession(OpenMeasurementRepository openMeasurementRepository2, SendDiagnosticEvent sendDiagnosticEvent2) {
        m.e(openMeasurementRepository2, "openMeasurementRepository");
        m.e(sendDiagnosticEvent2, "sendDiagnosticEvent");
        this.openMeasurementRepository = openMeasurementRepository2;
        this.sendDiagnosticEvent = sendDiagnosticEvent2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(com.unity3d.ads.core.data.model.AdObject r11, org.json.JSONObject r12, xd.d<? super sd.w> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.unity3d.ads.core.domain.om.AndroidOmStartSession$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.unity3d.ads.core.domain.om.AndroidOmStartSession$invoke$1 r0 = (com.unity3d.ads.core.domain.om.AndroidOmStartSession$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.om.AndroidOmStartSession$invoke$1 r0 = new com.unity3d.ads.core.domain.om.AndroidOmStartSession$invoke$1
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r11 = r0.L$1
            com.unity3d.ads.core.data.model.AdObject r11 = (com.unity3d.ads.core.data.model.AdObject) r11
            java.lang.Object r12 = r0.L$0
            com.unity3d.ads.core.domain.om.AndroidOmStartSession r12 = (com.unity3d.ads.core.domain.om.AndroidOmStartSession) r12
            sd.p.b(r13)
            goto L_0x0058
        L_0x0031:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0039:
            sd.p.b(r13)
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r13 = r10.openMeasurementRepository
            com.google.protobuf.i r2 = r11.getOpportunityId()
            android.webkit.WebView r4 = r10.getWebview(r11)
            com.unity3d.ads.core.data.model.OmidOptions r12 = r10.getOMidOptions(r12)
            r0.L$0 = r10
            r0.L$1 = r11
            r0.label = r3
            java.lang.Object r13 = r13.startSession(r2, r4, r12, r0)
            if (r13 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r12 = r10
        L_0x0058:
            r7 = r11
            com.unity3d.ads.core.data.model.OMResult r13 = (com.unity3d.ads.core.data.model.OMResult) r13
            boolean r11 = r13 instanceof com.unity3d.ads.core.data.model.OMResult.Success
            if (r11 == 0) goto L_0x006d
            com.unity3d.ads.core.domain.SendDiagnosticEvent r2 = r12.sendDiagnosticEvent
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 14
            r9 = 0
            java.lang.String r3 = "om_session_start_success"
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00a1
        L_0x006d:
            boolean r11 = r13 instanceof com.unity3d.ads.core.data.model.OMResult.Failure
            if (r11 == 0) goto L_0x00a1
            com.unity3d.ads.core.domain.SendDiagnosticEvent r2 = r12.sendDiagnosticEvent
            r4 = 0
            java.util.Map r11 = td.j0.c()
            com.unity3d.ads.core.data.model.OMResult$Failure r13 = (com.unity3d.ads.core.data.model.OMResult.Failure) r13
            java.lang.String r12 = r13.getReason()
            java.lang.String r0 = "reason"
            r11.put(r0, r12)
            java.lang.String r12 = r13.getReasonDebug()
            if (r12 == 0) goto L_0x0092
            java.lang.String r12 = r13.getReasonDebug()
            java.lang.String r13 = "reason_debug"
            r11.put(r13, r12)
        L_0x0092:
            sd.w r12 = sd.w.f38141a
            java.util.Map r5 = td.j0.b(r11)
            r6 = 0
            r8 = 10
            r9 = 0
            java.lang.String r3 = "om_session_start_failure"
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x00a1:
            sd.w r11 = sd.w.f38141a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.om.AndroidOmStartSession.invoke(com.unity3d.ads.core.data.model.AdObject, org.json.JSONObject, xd.d):java.lang.Object");
    }
}
