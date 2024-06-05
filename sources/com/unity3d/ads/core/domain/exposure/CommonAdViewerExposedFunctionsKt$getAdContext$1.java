package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetAndroidAdPlayerContext;
import com.unity3d.ads.core.domain.om.IsOMActivated;

/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$getAdContext$1 implements ExposedFunction {
    final /* synthetic */ String $adData;
    final /* synthetic */ String $adDataRefreshToken;
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ GetAndroidAdPlayerContext $getAndroidAdPlayerContext;
    final /* synthetic */ String $impressionConfig;
    final /* synthetic */ IsOMActivated $isOMActivated;

    CommonAdViewerExposedFunctionsKt$getAdContext$1(String str, String str2, String str3, GetAndroidAdPlayerContext getAndroidAdPlayerContext, AdObject adObject, IsOMActivated isOMActivated) {
        this.$adData = str;
        this.$impressionConfig = str2;
        this.$adDataRefreshToken = str3;
        this.$getAndroidAdPlayerContext = getAndroidAdPlayerContext;
        this.$adObject = adObject;
        this.$isOMActivated = isOMActivated;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object[] r10, xd.d<java.lang.Object> r11) {
        /*
            r9 = this;
            boolean r10 = r11 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1
            if (r10 == 0) goto L_0x0013
            r10 = r11
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 r10 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1) r10
            int r0 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r10.label = r0
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 r10 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1
            r10.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r10.result
            java.lang.Object r0 = yd.d.c()
            int r1 = r10.label
            r2 = 1
            if (r1 == 0) goto L_0x0049
            if (r1 != r2) goto L_0x0041
            java.lang.Object r0 = r10.L$5
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = r10.L$4
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r10.L$3
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r4 = r10.L$2
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r10.L$1
            com.unity3d.ads.core.domain.om.IsOMActivated r5 = (com.unity3d.ads.core.domain.om.IsOMActivated) r5
            java.lang.Object r10 = r10.L$0
            com.unity3d.ads.core.data.model.AdObject r10 = (com.unity3d.ads.core.data.model.AdObject) r10
            sd.p.b(r11)
            goto L_0x0087
        L_0x0041:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0049:
            sd.p.b(r11)
            java.lang.String r11 = r9.$adData
            java.lang.String r1 = r9.$impressionConfig
            java.lang.String r3 = r9.$adDataRefreshToken
            com.unity3d.ads.core.domain.GetAndroidAdPlayerContext r4 = r9.$getAndroidAdPlayerContext
            com.unity3d.ads.core.data.model.AdObject r5 = r9.$adObject
            com.unity3d.ads.core.domain.om.IsOMActivated r6 = r9.$isOMActivated
            java.util.Map r7 = td.j0.c()
            java.lang.String r8 = "adData"
            r7.put(r8, r11)
            java.lang.String r11 = "impressionConfig"
            r7.put(r11, r1)
            java.lang.String r11 = "adDataRefreshToken"
            r7.put(r11, r3)
            java.lang.String r1 = "nativeContext"
            r10.L$0 = r5
            r10.L$1 = r6
            r10.L$2 = r7
            r10.L$3 = r7
            r10.L$4 = r1
            r10.L$5 = r7
            r10.label = r2
            java.lang.Object r11 = r4.invoke(r10)
            if (r11 != r0) goto L_0x0082
            return r0
        L_0x0082:
            r10 = r5
            r5 = r6
            r0 = r7
            r3 = r0
            r4 = r3
        L_0x0087:
            r0.put(r1, r11)
            com.unity3d.ads.UnityAdsLoadOptions r10 = r10.getLoadOptions()
            org.json.JSONObject r10 = r10.getData()
            if (r10 == 0) goto L_0x00e0
            int r11 = r10.length()
            if (r11 == 0) goto L_0x00e0
            java.util.Iterator r11 = r10.keys()
            java.lang.String r0 = "loadOptions.keys()"
            kotlin.jvm.internal.m.d(r11, r0)
            me.d r11 = me.j.c(r11)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x00b0:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x00db
            java.lang.Object r1 = r11.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = "adMarkup"
            boolean r6 = kotlin.jvm.internal.m.a(r1, r6)
            if (r6 != 0) goto L_0x00b0
            java.lang.String r6 = "objectId"
            boolean r6 = kotlin.jvm.internal.m.a(r1, r6)
            if (r6 == 0) goto L_0x00cd
            goto L_0x00b0
        L_0x00cd:
            java.lang.Object r6 = r10.get(r1)
            org.json.JSONObject r0 = r0.put(r1, r6)
            java.lang.String r1 = "acc.put(key, loadOptions[key])"
            kotlin.jvm.internal.m.d(r0, r1)
            goto L_0x00b0
        L_0x00db:
            java.lang.String r10 = "loadOptions"
            r3.put(r10, r0)
        L_0x00e0:
            boolean r10 = r5.invoke()
            if (r10 == 0) goto L_0x0107
            r10 = 2
            sd.n[] r10 = new sd.n[r10]
            r11 = 0
            java.lang.String r0 = "sessionFilePath"
            java.lang.String r1 = "unity-ads-cache://unity.ads.asset/ad-viewer/omid-session-client-v1.js"
            sd.n r0 = sd.s.a(r0, r1)
            r10[r11] = r0
            java.lang.String r11 = "serviceFilePath"
            java.lang.String r0 = "unity-ads-cache://unity.ads.asset/ad-viewer/omsdk-v1.js"
            sd.n r11 = sd.s.a(r11, r0)
            r10[r2] = r11
            java.util.Map r10 = td.k0.j(r10)
            java.lang.String r11 = "openMeasurement"
            r3.put(r11, r10)
        L_0x0107:
            java.util.Map r10 = td.j0.b(r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1.invoke(java.lang.Object[], xd.d):java.lang.Object");
    }
}
