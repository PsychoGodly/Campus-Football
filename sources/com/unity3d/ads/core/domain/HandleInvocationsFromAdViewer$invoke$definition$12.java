package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import fe.a;
import kotlin.jvm.internal.n;

/* compiled from: HandleInvocationsFromAdViewer.kt */
final class HandleInvocationsFromAdViewer$invoke$definition$12 extends n implements a<ExposedFunction> {
    public static final HandleInvocationsFromAdViewer$invoke$definition$12 INSTANCE = new HandleInvocationsFromAdViewer$invoke$definition$12();

    HandleInvocationsFromAdViewer$invoke$definition$12() {
        super(0);
    }

    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.clearStorage();
    }
}
