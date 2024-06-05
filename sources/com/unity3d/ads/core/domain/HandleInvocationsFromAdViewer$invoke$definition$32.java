package com.unity3d.ads.core.domain;

import com.applovin.mediation.MaxReward;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import fe.a;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.n;

/* compiled from: HandleInvocationsFromAdViewer.kt */
final class HandleInvocationsFromAdViewer$invoke$definition$32 extends n implements a<ExposedFunction> {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ HandleInvocationsFromAdViewer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HandleInvocationsFromAdViewer$invoke$definition$32(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        super(0);
        this.this$0 = handleInvocationsFromAdViewer;
        this.$adObject = adObject;
    }

    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.omFinishSession((OmFinishSession) this.this$0.getServiceProvider().getRegistry().getService(MaxReward.DEFAULT_LABEL, a0.b(OmFinishSession.class)), this.$adObject);
    }
}
