package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.repository.SessionRepository;

/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1 implements ExposedFunction {
    final /* synthetic */ SessionRepository $sessionRepository;

    CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1(SessionRepository sessionRepository) {
        this.$sessionRepository = sessionRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object[] r4, xd.d<java.lang.Object> r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1
            if (r4 == 0) goto L_0x0013
            r4 = r5
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 r4 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r4.label = r0
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 r4 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1
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
            com.unity3d.ads.core.data.repository.SessionRepository r5 = r3.$sessionRepository
            r4.label = r2
            java.lang.Object r5 = r5.getPrivacyFsm(r4)
            if (r5 != r0) goto L_0x003f
            return r0
        L_0x003f:
            com.google.protobuf.i r5 = (com.google.protobuf.i) r5
            java.lang.String r4 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1.invoke(java.lang.Object[], xd.d):java.lang.Object");
    }
}
