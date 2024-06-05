package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import kotlin.coroutines.jvm.internal.b;
import xd.d;

/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$getDeviceMaxVolume$1 implements ExposedFunction {
    final /* synthetic */ DeviceInfoRepository $deviceInfoRepository;

    CommonAdViewerExposedFunctionsKt$getDeviceMaxVolume$1(DeviceInfoRepository deviceInfoRepository) {
        this.$deviceInfoRepository = deviceInfoRepository;
    }

    public final Object invoke(Object[] objArr, d<Object> dVar) {
        return b.b(this.$deviceInfoRepository.getDynamicDeviceInfo().u0().q0());
    }
}
