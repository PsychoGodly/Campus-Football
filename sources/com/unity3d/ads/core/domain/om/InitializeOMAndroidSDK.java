package com.unity3d.ads.core.domain.om;

import android.content.Context;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.jvm.internal.m;

/* compiled from: InitializeOMAndroidSDK.kt */
public final class InitializeOMAndroidSDK implements InitializeOMSDK {
    private final Context context;
    private final OpenMeasurementRepository omRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public InitializeOMAndroidSDK(Context context2, SendDiagnosticEvent sendDiagnosticEvent2, SessionRepository sessionRepository2, OpenMeasurementRepository openMeasurementRepository) {
        m.e(context2, "context");
        m.e(sendDiagnosticEvent2, "sendDiagnosticEvent");
        m.e(sessionRepository2, "sessionRepository");
        m.e(openMeasurementRepository, "omRepository");
        this.context = context2;
        this.sendDiagnosticEvent = sendDiagnosticEvent2;
        this.sessionRepository = sessionRepository2;
        this.omRepository = openMeasurementRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(xd.d<? super sd.w> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK$invoke$1 r0 = (com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK$invoke$1 r0 = new com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK$invoke$1
            r0.<init>(r14, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            long r1 = r0.J$0
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK r0 = (com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK) r0
            sd.p.b(r15)
            goto L_0x0069
        L_0x002f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0037:
            sd.p.b(r15)
            com.unity3d.ads.core.data.repository.SessionRepository r15 = r14.sessionRepository
            boolean r15 = r15.isOmEnabled()
            if (r15 == 0) goto L_0x00c9
            oe.j r15 = oe.j.f36786a
            long r4 = r15.a()
            com.unity3d.ads.core.domain.SendDiagnosticEvent r6 = r14.sendDiagnosticEvent
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 30
            r13 = 0
            java.lang.String r7 = "om_activate_started"
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r6, r7, r8, r9, r10, r11, r12, r13)
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r15 = r14.omRepository
            android.content.Context r2 = r14.context
            r0.L$0 = r14
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r15 = r15.activateOM(r2, r0)
            if (r15 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r0 = r14
            r1 = r4
        L_0x0069:
            com.unity3d.ads.core.data.model.OMResult r15 = (com.unity3d.ads.core.data.model.OMResult) r15
            boolean r3 = r15 instanceof com.unity3d.ads.core.data.model.OMResult.Success
            if (r3 == 0) goto L_0x0089
            com.unity3d.ads.core.domain.SendDiagnosticEvent r4 = r0.sendDiagnosticEvent
            oe.j$a r15 = oe.j.a.c(r1)
            double r0 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r15)
            java.lang.Double r6 = kotlin.coroutines.jvm.internal.b.b(r0)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 28
            r11 = 0
            java.lang.String r5 = "om_activate_success_time"
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x00c9
        L_0x0089:
            boolean r3 = r15 instanceof com.unity3d.ads.core.data.model.OMResult.Failure
            if (r3 == 0) goto L_0x00c9
            com.unity3d.ads.core.domain.SendDiagnosticEvent r4 = r0.sendDiagnosticEvent
            oe.j$a r0 = oe.j.a.c(r1)
            double r0 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r0)
            java.lang.Double r6 = kotlin.coroutines.jvm.internal.b.b(r0)
            java.util.Map r0 = td.j0.c()
            com.unity3d.ads.core.data.model.OMResult$Failure r15 = (com.unity3d.ads.core.data.model.OMResult.Failure) r15
            java.lang.String r1 = r15.getReason()
            java.lang.String r2 = "reason"
            r0.put(r2, r1)
            java.lang.String r1 = r15.getReasonDebug()
            if (r1 == 0) goto L_0x00b9
            java.lang.String r15 = r15.getReasonDebug()
            java.lang.String r1 = "reason_debug"
            r0.put(r1, r15)
        L_0x00b9:
            sd.w r15 = sd.w.f38141a
            java.util.Map r7 = td.j0.b(r0)
            r8 = 0
            r9 = 0
            r10 = 24
            r11 = 0
            java.lang.String r5 = "om_activate_failure_time"
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x00c9:
            sd.w r15 = sd.w.f38141a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK.invoke(xd.d):java.lang.Object");
    }
}
