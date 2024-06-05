package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;

/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$omStartSession$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ AndroidOmStartSession $omStartSession;

    CommonAdViewerExposedFunctionsKt$omStartSession$1(AndroidOmStartSession androidOmStartSession, AdObject adObject) {
        this.$omStartSession = androidOmStartSession;
        this.$adObject = adObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object[] r5, xd.d<? super sd.w> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sd.p.b(r6)
            goto L_0x004b
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            sd.p.b(r6)
            r6 = 0
            r5 = r5[r6]
            java.lang.String r6 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.m.c(r5, r6)
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            com.unity3d.ads.core.domain.om.AndroidOmStartSession r6 = r4.$omStartSession
            com.unity3d.ads.core.data.model.AdObject r2 = r4.$adObject
            r0.label = r3
            java.lang.Object r5 = r6.invoke(r2, r5, r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            sd.w r5 = sd.w.f38141a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1.invoke(java.lang.Object[], xd.d):java.lang.Object");
    }
}
