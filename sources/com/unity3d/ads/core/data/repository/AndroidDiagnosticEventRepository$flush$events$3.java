package com.unity3d.ads.core.data.repository;

import fe.l;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import vb.s0;

/* compiled from: AndroidDiagnosticEventRepository.kt */
final class AndroidDiagnosticEventRepository$flush$events$3 extends n implements l<s0, Boolean> {
    final /* synthetic */ AndroidDiagnosticEventRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidDiagnosticEventRepository$flush$events$3(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        super(1);
        this.this$0 = androidDiagnosticEventRepository;
    }

    public final Boolean invoke(s0 s0Var) {
        m.e(s0Var, "it");
        return Boolean.valueOf(!this.this$0.blockedEvents.contains(s0Var.p0()));
    }
}
