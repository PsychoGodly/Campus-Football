package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import sd.w;
import xd.d;

/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$markCampaignStateShown$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ CampaignRepository $campaignRepository;

    CommonAdViewerExposedFunctionsKt$markCampaignStateShown$1(CampaignRepository campaignRepository, AdObject adObject) {
        this.$campaignRepository = campaignRepository;
        this.$adObject = adObject;
    }

    public final Object invoke(Object[] objArr, d<? super w> dVar) {
        this.$campaignRepository.setShowTimestamp(this.$adObject.getOpportunityId());
        return w.f38141a;
    }
}
