package com.unity3d.ads.core.domain.exposure;

import com.google.protobuf.z;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.m;
import org.json.JSONObject;
import sd.w;
import vb.t;
import vb.v;
import xd.d;

/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$setAllowedPii$1 implements ExposedFunction {
    final /* synthetic */ DeviceInfoRepository $deviceInfoRepository;

    CommonAdViewerExposedFunctionsKt$setAllowedPii$1(DeviceInfoRepository deviceInfoRepository) {
        this.$deviceInfoRepository = deviceInfoRepository;
    }

    public final Object invoke(Object[] objArr, d<? super w> dVar) {
        v value;
        t a10;
        JSONObject jSONObject = objArr[0];
        m.c(jSONObject, "null cannot be cast to non-null type org.json.JSONObject");
        JSONObject jSONObject2 = jSONObject;
        se.v<v> allowedPii = this.$deviceInfoRepository.getAllowedPii();
        do {
            value = allowedPii.getValue();
            t.a aVar = t.f39082b;
            z.a d02 = value.b();
            m.d(d02, "this.toBuilder()");
            a10 = aVar.a((v.a) d02);
            new CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$2(a10).set(b.a(jSONObject2.optBoolean("idfa")));
            new CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$4(a10).set(b.a(jSONObject2.optBoolean("idfv")));
        } while (!allowedPii.a(value, a10.a()));
        return w.f38141a;
    }
}
