package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.repository.SessionRepository;
import sd.w;
import xd.d;

/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$incrementBannerImpressionCount$1 implements ExposedFunction {
    final /* synthetic */ SessionRepository $sessionRepository;

    CommonAdViewerExposedFunctionsKt$incrementBannerImpressionCount$1(SessionRepository sessionRepository) {
        this.$sessionRepository = sessionRepository;
    }

    public final Object invoke(Object[] objArr, d<? super w> dVar) {
        this.$sessionRepository.incrementBannerImpressionCount();
        return w.f38141a;
    }
}
