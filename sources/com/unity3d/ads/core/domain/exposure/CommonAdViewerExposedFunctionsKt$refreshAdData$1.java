package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.Refresh;

/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$refreshAdData$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ Refresh $refresh;

    CommonAdViewerExposedFunctionsKt$refreshAdData$1(Refresh refresh, AdObject adObject) {
        this.$refresh = refresh;
        this.$adObject = adObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object[] r6, xd.d<java.lang.Object> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            java.lang.String r3 = "adDataRefreshToken"
            r4 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            sd.p.b(r7)
            goto L_0x006e
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            sd.p.b(r7)
            int r7 = r6.length
            r2 = 0
            if (r7 != 0) goto L_0x003c
            r7 = 1
            goto L_0x003d
        L_0x003c:
            r7 = 0
        L_0x003d:
            if (r7 == 0) goto L_0x0042
            com.google.protobuf.i r6 = com.google.protobuf.i.f27039b
            goto L_0x0058
        L_0x0042:
            r6 = r6[r2]
            java.lang.String r7 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.m.c(r6, r7)
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            java.lang.String r6 = r6.optString(r3)
            java.lang.String r7 = "refreshToken"
            kotlin.jvm.internal.m.d(r6, r7)
            com.google.protobuf.i r6 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64(r6)
        L_0x0058:
            com.unity3d.ads.core.domain.Refresh r7 = r5.$refresh
            java.lang.String r2 = "refreshTokenByteString"
            kotlin.jvm.internal.m.d(r6, r2)
            com.unity3d.ads.core.data.model.AdObject r2 = r5.$adObject
            com.google.protobuf.i r2 = r2.getOpportunityId()
            r0.label = r4
            java.lang.Object r7 = r7.invoke(r6, r2, r0)
            if (r7 != r1) goto L_0x006e
            return r1
        L_0x006e:
            vb.e r7 = (vb.e) r7
            boolean r6 = r7.j0()
            if (r6 != 0) goto L_0x00b3
            java.util.Map r6 = td.j0.c()
            com.google.protobuf.i r0 = r7.f0()
            java.lang.String r1 = "adRefreshResponse.adData"
            kotlin.jvm.internal.m.d(r0, r1)
            java.lang.String r0 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64(r0)
            java.lang.String r1 = "adData"
            r6.put(r1, r0)
            com.google.protobuf.i r0 = r7.g0()
            java.lang.String r1 = "adRefreshResponse.adDataRefreshToken"
            kotlin.jvm.internal.m.d(r0, r1)
            java.lang.String r0 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64(r0)
            r6.put(r3, r0)
            com.google.protobuf.i r7 = r7.i0()
            java.lang.String r0 = "adRefreshResponse.trackingToken"
            kotlin.jvm.internal.m.d(r7, r0)
            java.lang.String r7 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64(r7)
            java.lang.String r0 = "trackingToken"
            r6.put(r0, r7)
            java.util.Map r6 = td.j0.b(r6)
            return r6
        L_0x00b3:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Refresh failed"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1.invoke(java.lang.Object[], xd.d):java.lang.Object");
    }
}
