package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;

/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1 implements ExposedFunction {
    final /* synthetic */ SendPrivacyUpdateRequest $sendPrivacyUpdateRequest;

    CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        this.$sendPrivacyUpdateRequest = sendPrivacyUpdateRequest;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object[] r8, xd.d<java.lang.Object> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            java.lang.String r3 = "version"
            java.lang.String r4 = "content"
            r5 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r5) goto L_0x002d
            sd.p.b(r9)
            goto L_0x005e
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            sd.p.b(r9)
            r9 = 0
            r8 = r8[r9]
            java.lang.String r9 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.m.c(r8, r9)
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            java.lang.String r9 = r8.optString(r4)
            int r8 = r8.optInt(r3)
            com.unity3d.ads.core.domain.SendPrivacyUpdateRequest r2 = r7.$sendPrivacyUpdateRequest
            java.lang.String r6 = "privacyUpdateContentBase64"
            kotlin.jvm.internal.m.d(r9, r6)
            com.google.protobuf.i r9 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64(r9)
            r0.label = r5
            java.lang.Object r9 = r2.invoke(r8, r9, r0)
            if (r9 != r1) goto L_0x005e
            return r1
        L_0x005e:
            vb.r2 r9 = (vb.r2) r9
            java.util.Map r8 = td.j0.c()
            int r0 = r9.h0()
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.b.c(r0)
            r8.put(r3, r0)
            com.google.protobuf.i r9 = r9.f0()
            java.lang.String r0 = "response.content"
            kotlin.jvm.internal.m.d(r9, r0)
            java.lang.String r9 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64(r9)
            r8.put(r4, r9)
            java.util.Map r8 = td.j0.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1.invoke(java.lang.Object[], xd.d):java.lang.Object");
    }
}
