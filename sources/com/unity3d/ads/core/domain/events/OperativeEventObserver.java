package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import kotlin.jvm.internal.m;
import pe.i;
import pe.k0;
import sd.w;
import se.v;
import xd.d;

/* compiled from: OperativeEventObserver.kt */
public final class OperativeEventObserver {
    /* access modifiers changed from: private */
    public final BackgroundWorker backgroundWorker;
    /* access modifiers changed from: private */
    public final k0 defaultDispatcher;
    /* access modifiers changed from: private */
    public final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    /* access modifiers changed from: private */
    public final v<Boolean> isRunning = se.k0.a(Boolean.FALSE);
    /* access modifiers changed from: private */
    public final OperativeEventRepository operativeEventRepository;
    /* access modifiers changed from: private */
    public final UniversalRequestDataSource universalRequestDataSource;

    public OperativeEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2, k0 k0Var, OperativeEventRepository operativeEventRepository2, UniversalRequestDataSource universalRequestDataSource2, BackgroundWorker backgroundWorker2) {
        m.e(getUniversalRequestForPayLoad2, "getUniversalRequestForPayLoad");
        m.e(k0Var, "defaultDispatcher");
        m.e(operativeEventRepository2, "operativeEventRepository");
        m.e(universalRequestDataSource2, "universalRequestDataSource");
        m.e(backgroundWorker2, "backgroundWorker");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad2;
        this.defaultDispatcher = k0Var;
        this.operativeEventRepository = operativeEventRepository2;
        this.universalRequestDataSource = universalRequestDataSource2;
        this.backgroundWorker = backgroundWorker2;
    }

    public final Object invoke(d<? super w> dVar) {
        Object g10 = i.g(this.defaultDispatcher, new OperativeEventObserver$invoke$2(this, (d<? super OperativeEventObserver$invoke$2>) null), dVar);
        return g10 == d.c() ? g10 : w.f38141a;
    }
}
