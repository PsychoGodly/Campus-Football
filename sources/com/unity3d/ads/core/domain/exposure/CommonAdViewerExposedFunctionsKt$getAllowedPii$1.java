package com.unity3d.ads.core.domain.exposure;

import android.util.Base64;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import kotlin.jvm.internal.m;
import xd.d;

/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$getAllowedPii$1 implements ExposedFunction {
    final /* synthetic */ DeviceInfoRepository $deviceInfoRepository;

    CommonAdViewerExposedFunctionsKt$getAllowedPii$1(DeviceInfoRepository deviceInfoRepository) {
        this.$deviceInfoRepository = deviceInfoRepository;
    }

    public final Object invoke(Object[] objArr, d<Object> dVar) {
        String encodeToString = Base64.encodeToString(this.$deviceInfoRepository.getAllowedPii().getValue().i(), 2);
        m.d(encodeToString, "encodeToString(deviceInf…eArray(), Base64.NO_WRAP)");
        return encodeToString;
    }
}
