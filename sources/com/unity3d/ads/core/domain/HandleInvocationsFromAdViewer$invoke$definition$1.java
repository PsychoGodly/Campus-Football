package com.unity3d.ads.core.domain;

import com.applovin.mediation.MaxReward;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import fe.a;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.n;

/* compiled from: HandleInvocationsFromAdViewer.kt */
final class HandleInvocationsFromAdViewer$invoke$definition$1 extends n implements a<ExposedFunction> {
    final /* synthetic */ String $adDataObject;
    final /* synthetic */ String $adDataRefreshTokenObject;
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ String $impressionConfigObject;
    final /* synthetic */ HandleInvocationsFromAdViewer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HandleInvocationsFromAdViewer$invoke$definition$1(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, String str, String str2, String str3, AdObject adObject) {
        super(0);
        this.this$0 = handleInvocationsFromAdViewer;
        this.$adDataObject = str;
        this.$impressionConfigObject = str2;
        this.$adDataRefreshTokenObject = str3;
        this.$adObject = adObject;
    }

    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.m33getAdContextyLuu4LI((GetAndroidAdPlayerContext) this.this$0.getServiceProvider().getRegistry().getService(MaxReward.DEFAULT_LABEL, a0.b(GetAndroidAdPlayerContext.class)), this.$adDataObject, this.$impressionConfigObject, this.$adDataRefreshTokenObject, (IsOMActivated) this.this$0.getServiceProvider().getRegistry().getService(MaxReward.DEFAULT_LABEL, a0.b(IsOMActivated.class)), this.$adObject);
    }
}
