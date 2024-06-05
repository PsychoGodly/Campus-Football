package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import kotlin.jvm.internal.m;
import vb.z0;
import xd.d;

/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$getConnectionType$1 implements ExposedFunction {
    final /* synthetic */ DeviceInfoRepository $deviceInfoRepository;

    CommonAdViewerExposedFunctionsKt$getConnectionType$1(DeviceInfoRepository deviceInfoRepository) {
        this.$deviceInfoRepository = deviceInfoRepository;
    }

    public final Object invoke(Object[] objArr, d<Object> dVar) {
        z0 v02 = this.$deviceInfoRepository.getDynamicDeviceInfo().v0();
        m.d(v02, "deviceInfoRepository.dyn…DeviceInfo.connectionType");
        return v02;
    }
}
