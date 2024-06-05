package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.utils.ContinuationFromCallback;
import com.unity3d.services.core.api.Storage;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.m;
import xd.d;
import xd.i;

/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$readStorage$1 implements ExposedFunction {
    public static final CommonAdViewerExposedFunctionsKt$readStorage$1 INSTANCE = new CommonAdViewerExposedFunctionsKt$readStorage$1();

    CommonAdViewerExposedFunctionsKt$readStorage$1() {
    }

    public final Object invoke(Object[] objArr, d<Object> dVar) {
        i iVar = new i(c.b(dVar));
        String str = objArr[0];
        m.c(str, "null cannot be cast to non-null type kotlin.String");
        Storage.read(str, new ContinuationFromCallback(iVar));
        Object a10 = iVar.a();
        if (a10 == d.c()) {
            h.c(dVar);
        }
        return a10;
    }
}
