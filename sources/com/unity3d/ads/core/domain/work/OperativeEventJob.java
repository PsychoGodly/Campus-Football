package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.services.core.di.ServiceProvider;
import kotlin.jvm.internal.m;
import sd.g;
import sd.k;
import xd.d;

/* compiled from: OperativeEventJob.kt */
public final class OperativeEventJob extends UniversalRequestJob {
    private final g getOperativeRequestPolicy$delegate = i.b(k.NONE, new OperativeEventJob$special$$inlined$inject$default$1(this, ServiceProvider.NAMED_OPERATIVE_REQ));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OperativeEventJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        m.e(context, "context");
        m.e(workerParameters, "workerParams");
    }

    private final GetRequestPolicy getGetOperativeRequestPolicy() {
        return (GetRequestPolicy) this.getOperativeRequestPolicy$delegate.getValue();
    }

    public Object doWork(d<? super ListenableWorker.a> dVar) {
        setRequestPolicy(getGetOperativeRequestPolicy().invoke());
        return super.doWork(dVar);
    }
}
