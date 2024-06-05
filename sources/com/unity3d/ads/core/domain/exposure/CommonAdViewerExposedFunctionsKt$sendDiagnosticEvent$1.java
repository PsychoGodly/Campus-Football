package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;

/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$sendDiagnosticEvent$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ SendDiagnosticEvent $sendDiagnosticEvent;

    CommonAdViewerExposedFunctionsKt$sendDiagnosticEvent$1(SendDiagnosticEvent sendDiagnosticEvent, AdObject adObject) {
        this.$sendDiagnosticEvent = sendDiagnosticEvent;
        this.$adObject = adObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0041, code lost:
        r10 = r10.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object[] r10, xd.d<? super sd.w> r11) {
        /*
            r9 = this;
            r11 = 0
            r11 = r10[r11]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.m.c(r11, r0)
            r2 = r11
            java.lang.String r2 = (java.lang.String) r2
            r11 = 1
            r11 = r10[r11]
            java.lang.String r0 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.m.c(r11, r0)
            org.json.JSONObject r11 = (org.json.JSONObject) r11
            java.util.Map r0 = td.j0.c()
            java.util.Iterator r1 = r11.keys()
            java.lang.String r3 = "tags.keys()"
            kotlin.jvm.internal.m.d(r1, r3)
        L_0x0022:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0036
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r11.getString(r3)
            r0.put(r3, r4)
            goto L_0x0022
        L_0x0036:
            java.util.Map r4 = td.j0.b(r0)
            r11 = 2
            java.lang.Object r10 = td.m.o(r10, r11)
            if (r10 == 0) goto L_0x0050
            java.lang.String r10 = r10.toString()
            if (r10 == 0) goto L_0x0050
            double r10 = java.lang.Double.parseDouble(r10)
            java.lang.Double r10 = kotlin.coroutines.jvm.internal.b.b(r10)
            goto L_0x0051
        L_0x0050:
            r10 = 0
        L_0x0051:
            r3 = r10
            com.unity3d.ads.core.domain.SendDiagnosticEvent r1 = r9.$sendDiagnosticEvent
            r5 = 0
            com.unity3d.ads.core.data.model.AdObject r6 = r9.$adObject
            r7 = 8
            r8 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r1, r2, r3, r4, r5, r6, r7, r8)
            sd.w r10 = sd.w.f38141a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendDiagnosticEvent$1.invoke(java.lang.Object[], xd.d):java.lang.Object");
    }
}
