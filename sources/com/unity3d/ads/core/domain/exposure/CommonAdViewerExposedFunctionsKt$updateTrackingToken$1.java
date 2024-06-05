package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import kotlin.jvm.internal.m;
import org.json.JSONObject;
import sd.w;
import xd.d;

/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$updateTrackingToken$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;

    CommonAdViewerExposedFunctionsKt$updateTrackingToken$1(AdObject adObject) {
        this.$adObject = adObject;
    }

    public final Object invoke(Object[] objArr, d<? super w> dVar) {
        boolean z10 = false;
        JSONObject jSONObject = objArr[0];
        m.c(jSONObject, "null cannot be cast to non-null type org.json.JSONObject");
        String optString = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
        if (optString == null || optString.length() == 0) {
            z10 = true;
        }
        if (!z10) {
            AdObject adObject = this.$adObject;
            m.d(optString, "token");
            adObject.setTrackingToken(ProtobufExtensionsKt.fromBase64(optString));
        }
        return w.f38141a;
    }
}
