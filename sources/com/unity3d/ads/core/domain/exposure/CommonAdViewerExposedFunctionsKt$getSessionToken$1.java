package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import xd.d;

/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$getSessionToken$1 implements ExposedFunction {
    final /* synthetic */ SessionRepository $sessionRepository;

    CommonAdViewerExposedFunctionsKt$getSessionToken$1(SessionRepository sessionRepository) {
        this.$sessionRepository = sessionRepository;
    }

    public final Object invoke(Object[] objArr, d<Object> dVar) {
        return ProtobufExtensionsKt.toBase64(this.$sessionRepository.getSessionToken());
    }
}
