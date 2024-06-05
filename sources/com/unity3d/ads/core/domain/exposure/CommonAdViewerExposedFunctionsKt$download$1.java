package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.CacheFile;

/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$download$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ CacheFile $cacheFile;

    CommonAdViewerExposedFunctionsKt$download$1(CacheFile cacheFile, AdObject adObject) {
        this.$cacheFile = cacheFile;
        this.$adObject = adObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object[] r9, xd.d<java.lang.Object> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1
            r0.<init>(r8, r10)
        L_0x0018:
            r6 = r0
            java.lang.Object r10 = r6.result
            java.lang.Object r0 = yd.d.c()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            java.lang.Object r9 = r6.L$0
            java.lang.String r9 = (java.lang.String) r9
            sd.p.b(r10)
            goto L_0x006b
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            sd.p.b(r10)
            r10 = 0
            r1 = r9[r10]
            java.lang.String r3 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.m.c(r1, r3)
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r3 = "url"
            java.lang.String r7 = r1.getString(r3)
            r4 = 2
            java.lang.Object r9 = td.m.o(r9, r4)
            r4 = r9
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            java.lang.String r9 = "priority"
            int r5 = r1.optInt(r9, r10)
            com.unity3d.ads.core.domain.CacheFile r1 = r8.$cacheFile
            kotlin.jvm.internal.m.d(r7, r3)
            com.unity3d.ads.core.data.model.AdObject r3 = r8.$adObject
            r6.L$0 = r7
            r6.label = r2
            r2 = r7
            java.lang.Object r10 = r1.invoke(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L_0x006a
            return r0
        L_0x006a:
            r9 = r7
        L_0x006b:
            com.unity3d.ads.core.data.model.CacheResult r10 = (com.unity3d.ads.core.data.model.CacheResult) r10
            boolean r0 = r10 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
            if (r0 == 0) goto L_0x009d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "unity-ads-cache://unity.ads.cache/"
            r9.append(r0)
            com.unity3d.ads.core.data.model.CacheResult$Success r10 = (com.unity3d.ads.core.data.model.CacheResult.Success) r10
            com.unity3d.ads.core.data.model.CachedFile r0 = r10.getCachedFile()
            java.lang.String r0 = r0.getName()
            r9.append(r0)
            r0 = 46
            r9.append(r0)
            com.unity3d.ads.core.data.model.CachedFile r10 = r10.getCachedFile()
            java.lang.String r10 = r10.getExtension()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            goto L_0x00a1
        L_0x009d:
            boolean r10 = r10 instanceof com.unity3d.ads.core.data.model.CacheResult.Failure
            if (r10 == 0) goto L_0x00a7
        L_0x00a1:
            java.lang.String r10 = "when (result) {\n        …sult.Failure -> url\n    }"
            kotlin.jvm.internal.m.d(r9, r10)
            return r9
        L_0x00a7:
            sd.l r9 = new sd.l
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1.invoke(java.lang.Object[], xd.d):java.lang.Object");
    }
}
