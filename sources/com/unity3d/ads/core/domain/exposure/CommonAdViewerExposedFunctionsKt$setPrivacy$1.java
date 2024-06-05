package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.repository.SessionRepository;

/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$setPrivacy$1 implements ExposedFunction {
    final /* synthetic */ SessionRepository $sessionRepository;

    CommonAdViewerExposedFunctionsKt$setPrivacy$1(SessionRepository sessionRepository) {
        this.$sessionRepository = sessionRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object[] r5, xd.d<? super sd.w> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sd.p.b(r6)
            goto L_0x0057
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            sd.p.b(r6)
            com.unity3d.ads.core.data.repository.SessionRepository r6 = r4.$sessionRepository
            r2 = 0
            r5 = r5[r2]
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.m.c(r5, r2)
            java.lang.String r5 = (java.lang.String) r5
            r2 = 2
            byte[] r5 = android.util.Base64.decode(r5, r2)
            java.lang.String r2 = "decode(it[0] as String, Base64.NO_WRAP)"
            kotlin.jvm.internal.m.d(r5, r2)
            com.google.protobuf.i r5 = s8.a.a(r5)
            r0.label = r3
            java.lang.Object r5 = r6.setPrivacy(r5, r0)
            if (r5 != r1) goto L_0x0057
            return r1
        L_0x0057:
            sd.w r5 = sd.w.f38141a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1.invoke(java.lang.Object[], xd.d):java.lang.Object");
    }
}
