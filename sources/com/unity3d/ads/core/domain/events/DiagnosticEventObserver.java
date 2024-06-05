package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import kotlin.jvm.internal.m;
import pe.i;
import pe.k0;
import sd.w;
import se.v;
import xd.d;

/* compiled from: DiagnosticEventObserver.kt */
public final class DiagnosticEventObserver {
    /* access modifiers changed from: private */
    public final BackgroundWorker backgroundWorker;
    /* access modifiers changed from: private */
    public final k0 defaultDispatcher;
    /* access modifiers changed from: private */
    public final DiagnosticEventRepository diagnosticEventRepository;
    /* access modifiers changed from: private */
    public final GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest;
    /* access modifiers changed from: private */
    public final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    /* access modifiers changed from: private */
    public final v<Boolean> isRunning = se.k0.a(Boolean.FALSE);
    /* access modifiers changed from: private */
    public final UniversalRequestDataSource universalRequestDataSource;

    public DiagnosticEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2, GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest2, k0 k0Var, DiagnosticEventRepository diagnosticEventRepository2, UniversalRequestDataSource universalRequestDataSource2, BackgroundWorker backgroundWorker2) {
        m.e(getUniversalRequestForPayLoad2, "getUniversalRequestForPayLoad");
        m.e(getDiagnosticEventBatchRequest2, "getDiagnosticEventBatchRequest");
        m.e(k0Var, "defaultDispatcher");
        m.e(diagnosticEventRepository2, "diagnosticEventRepository");
        m.e(universalRequestDataSource2, "universalRequestDataSource");
        m.e(backgroundWorker2, "backgroundWorker");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad2;
        this.getDiagnosticEventBatchRequest = getDiagnosticEventBatchRequest2;
        this.defaultDispatcher = k0Var;
        this.diagnosticEventRepository = diagnosticEventRepository2;
        this.universalRequestDataSource = universalRequestDataSource2;
        this.backgroundWorker = backgroundWorker2;
    }

    public final Object invoke(d<? super w> dVar) {
        Object g10 = i.g(this.defaultDispatcher, new DiagnosticEventObserver$invoke$2(this, (d<? super DiagnosticEventObserver$invoke$2>) null), dVar);
        return g10 == d.c() ? g10 : w.f38141a;
    }
}
