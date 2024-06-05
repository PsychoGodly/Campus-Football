package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.GetIsFileCache;
import kotlin.jvm.internal.m;
import xd.d;

/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$isFileCached$1 implements ExposedFunction {
    final /* synthetic */ GetIsFileCache $getIfFileCache;

    CommonAdViewerExposedFunctionsKt$isFileCached$1(GetIsFileCache getIsFileCache) {
        this.$getIfFileCache = getIsFileCache;
    }

    public final Object invoke(Object[] objArr, d<Object> dVar) {
        String str = objArr[0];
        m.c(str, "null cannot be cast to non-null type kotlin.String");
        return this.$getIfFileCache.invoke(str, dVar);
    }
}
