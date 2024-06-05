package com.unity3d.ads.core.data.repository;

import fe.a;
import kotlin.jvm.internal.n;
import sd.w;

/* compiled from: AndroidDiagnosticEventRepository.kt */
final class AndroidDiagnosticEventRepository$configure$1 extends n implements a<w> {
    final /* synthetic */ AndroidDiagnosticEventRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidDiagnosticEventRepository$configure$1(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        super(0);
        this.this$0 = androidDiagnosticEventRepository;
    }

    public final void invoke() {
        this.this$0.flush();
    }
}
