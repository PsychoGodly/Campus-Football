package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import fe.a;
import kotlin.jvm.internal.n;

/* compiled from: HandleInvocationsFromAdViewer.kt */
final class HandleInvocationsFromAdViewer$invoke$definition$15 extends n implements a<ExposedFunction> {
    public static final HandleInvocationsFromAdViewer$invoke$definition$15 INSTANCE = new HandleInvocationsFromAdViewer$invoke$definition$15();

    HandleInvocationsFromAdViewer$invoke$definition$15() {
        super(0);
    }

    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.setStorage();
    }
}
