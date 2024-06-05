package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import fe.a;
import kotlin.jvm.internal.n;

/* compiled from: HandleInvocationsFromAdViewer.kt */
final class HandleInvocationsFromAdViewer$invoke$definition$25 extends n implements a<ExposedFunction> {
    final /* synthetic */ AdObject $adObject;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HandleInvocationsFromAdViewer$invoke$definition$25(AdObject adObject) {
        super(0);
        this.$adObject = adObject;
    }

    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.updateTrackingToken(this.$adObject);
    }
}
