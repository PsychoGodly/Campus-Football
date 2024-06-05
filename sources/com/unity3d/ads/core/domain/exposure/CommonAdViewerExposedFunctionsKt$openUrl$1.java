package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import kotlin.jvm.internal.m;
import org.json.JSONObject;
import sd.w;
import xd.d;

/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$openUrl$1 implements ExposedFunction {
    final /* synthetic */ HandleOpenUrl $handleOpenUrl;

    CommonAdViewerExposedFunctionsKt$openUrl$1(HandleOpenUrl handleOpenUrl) {
        this.$handleOpenUrl = handleOpenUrl;
    }

    public final Object invoke(Object[] objArr, d<? super w> dVar) {
        String str = objArr[0];
        m.c(str, "null cannot be cast to non-null type kotlin.String");
        String str2 = str;
        Object o10 = m.o(objArr, 1);
        String str3 = null;
        JSONObject jSONObject = o10 instanceof JSONObject ? (JSONObject) o10 : null;
        if (jSONObject != null) {
            str3 = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
        }
        this.$handleOpenUrl.invoke(str2, str3);
        return w.f38141a;
    }
}
