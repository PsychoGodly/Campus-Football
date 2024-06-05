package com.unity3d.services.core.di;

import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import fe.l;
import kotlin.jvm.internal.n;
import sd.w;

/* compiled from: UnityAdsModule.kt */
final class UnityAdsModule$publicApiJob$1$1 extends n implements l<Throwable, w> {
    final /* synthetic */ DiagnosticEventRepository $diagnosticEventRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UnityAdsModule$publicApiJob$1$1(DiagnosticEventRepository diagnosticEventRepository) {
        super(1);
        this.$diagnosticEventRepository = diagnosticEventRepository;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return w.f38141a;
    }

    public final void invoke(Throwable th) {
        this.$diagnosticEventRepository.flush();
    }
}
