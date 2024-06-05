package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.om.GetOmData;

/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$omGetData$1 implements ExposedFunction {
    final /* synthetic */ GetOmData $getOmData;

    CommonAdViewerExposedFunctionsKt$omGetData$1(GetOmData getOmData) {
        this.$getOmData = getOmData;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object[] r4, xd.d<java.lang.Object> r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1
            if (r4 == 0) goto L_0x0013
            r4 = r5
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 r4 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r4.label = r0
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 r4 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1
            r4.<init>(r3, r5)
        L_0x0018:
            java.lang.Object r5 = r4.result
            java.lang.Object r0 = yd.d.c()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 != r2) goto L_0x0029
            sd.p.b(r5)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            sd.p.b(r5)
            com.unity3d.ads.core.domain.om.GetOmData r5 = r3.$getOmData
            r4.label = r2
            java.lang.Object r5 = r5.invoke(r4)
            if (r5 != r0) goto L_0x003f
            return r0
        L_0x003f:
            com.unity3d.ads.core.data.model.OMData r5 = (com.unity3d.ads.core.data.model.OMData) r5
            java.util.Map r4 = td.j0.c()
            java.lang.String r0 = r5.getVersion()
            java.lang.String r1 = "version"
            r4.put(r1, r0)
            java.lang.String r0 = r5.getPartnerName()
            java.lang.String r1 = "partnerName"
            r4.put(r1, r0)
            java.lang.String r5 = r5.getPartnerVersion()
            java.lang.String r0 = "partnerVersion"
            r4.put(r0, r5)
            java.util.Map r4 = td.j0.b(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1.invoke(java.lang.Object[], xd.d):java.lang.Object");
    }
}
