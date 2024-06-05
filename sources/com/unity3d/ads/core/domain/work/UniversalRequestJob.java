package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import kotlin.jvm.internal.m;
import sd.g;
import sd.k;
import xd.d;

/* compiled from: UniversalRequestJob.kt */
public abstract class UniversalRequestJob extends CoroutineWorker implements IServiceComponent {
    public RequestPolicy requestPolicy;
    private final g universalRequestDataSource$delegate;
    private final g universalRequestEventSender$delegate;
    private final WorkerParameters workerParams;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UniversalRequestJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        m.e(context, "context");
        m.e(workerParameters, "workerParams");
        this.workerParams = workerParameters;
        k kVar = k.NONE;
        this.universalRequestEventSender$delegate = i.b(kVar, new UniversalRequestJob$special$$inlined$inject$default$1(this, MaxReward.DEFAULT_LABEL));
        this.universalRequestDataSource$delegate = i.b(kVar, new UniversalRequestJob$special$$inlined$inject$default$2(this, MaxReward.DEFAULT_LABEL));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a7 A[Catch:{ all -> 0x0044 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object doWork$suspendImpl(com.unity3d.ads.core.domain.work.UniversalRequestJob r8, xd.d<? super androidx.work.ListenableWorker.a> r9) {
        /*
            boolean r0 = r9 instanceof com.unity3d.ads.core.domain.work.UniversalRequestJob$doWork$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.unity3d.ads.core.domain.work.UniversalRequestJob$doWork$1 r0 = (com.unity3d.ads.core.domain.work.UniversalRequestJob$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.work.UniversalRequestJob$doWork$1 r0 = new com.unity3d.ads.core.domain.work.UniversalRequestJob$doWork$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0052
            if (r2 == r5) goto L_0x0046
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            sd.p.b(r9)
            goto L_0x00d1
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0038:
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.work.UniversalRequestJob r2 = (com.unity3d.ads.core.domain.work.UniversalRequestJob) r2
            sd.p.b(r9)     // Catch:{ all -> 0x0044 }
            goto L_0x00a8
        L_0x0044:
            r9 = move-exception
            goto L_0x00af
        L_0x0046:
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.work.UniversalRequestJob r2 = (com.unity3d.ads.core.domain.work.UniversalRequestJob) r2
            sd.p.b(r9)
            goto L_0x0082
        L_0x0052:
            sd.p.b(r9)
            androidx.work.WorkerParameters r9 = r8.workerParams
            androidx.work.e r9 = r9.d()
            java.lang.String r2 = "universalRequestId"
            java.lang.String r9 = r9.l(r2)
            if (r9 != 0) goto L_0x006d
            androidx.work.ListenableWorker$a r8 = androidx.work.ListenableWorker.a.c()
            java.lang.String r9 = "success()"
            kotlin.jvm.internal.m.d(r8, r9)
            return r8
        L_0x006d:
            com.unity3d.ads.core.data.datasource.UniversalRequestDataSource r2 = r8.getUniversalRequestDataSource()
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r2 = r2.get(r0)
            if (r2 != r1) goto L_0x007e
            return r1
        L_0x007e:
            r7 = r2
            r2 = r8
            r8 = r9
            r9 = r7
        L_0x0082:
            e r9 = (defpackage.e) r9
            com.google.protobuf.i r9 = r9.i0(r8)
            vb.t3 r9 = vb.t3.k0(r9)
            sd.o$a r5 = sd.o.f38128b     // Catch:{ all -> 0x0044 }
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender r5 = r2.getUniversalRequestEventSender()     // Catch:{ all -> 0x0044 }
            java.lang.String r6 = "universalRequest"
            kotlin.jvm.internal.m.d(r9, r6)     // Catch:{ all -> 0x0044 }
            com.unity3d.ads.gatewayclient.RequestPolicy r6 = r2.getRequestPolicy()     // Catch:{ all -> 0x0044 }
            r0.L$0 = r2     // Catch:{ all -> 0x0044 }
            r0.L$1 = r8     // Catch:{ all -> 0x0044 }
            r0.label = r4     // Catch:{ all -> 0x0044 }
            java.lang.Object r9 = r5.invoke(r9, r6, r0)     // Catch:{ all -> 0x0044 }
            if (r9 != r1) goto L_0x00a8
            return r1
        L_0x00a8:
            sd.w r9 = sd.w.f38141a     // Catch:{ all -> 0x0044 }
            java.lang.Object r9 = sd.o.b(r9)     // Catch:{ all -> 0x0044 }
            goto L_0x00b9
        L_0x00af:
            sd.o$a r4 = sd.o.f38128b
            java.lang.Object r9 = sd.p.a(r9)
            java.lang.Object r9 = sd.o.b(r9)
        L_0x00b9:
            boolean r9 = sd.o.g(r9)
            if (r9 == 0) goto L_0x00db
            com.unity3d.ads.core.data.datasource.UniversalRequestDataSource r9 = r2.getUniversalRequestDataSource()
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r8 = r9.remove(r8, r0)
            if (r8 != r1) goto L_0x00d1
            return r1
        L_0x00d1:
            androidx.work.ListenableWorker$a r8 = androidx.work.ListenableWorker.a.c()
            java.lang.String r9 = "{\n            universalR…esult.success()\n        }"
            kotlin.jvm.internal.m.d(r8, r9)
            goto L_0x00e4
        L_0x00db:
            androidx.work.ListenableWorker$a r8 = androidx.work.ListenableWorker.a.b()
            java.lang.String r9 = "{\n            Result.retry()\n        }"
            kotlin.jvm.internal.m.d(r8, r9)
        L_0x00e4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.UniversalRequestJob.doWork$suspendImpl(com.unity3d.ads.core.domain.work.UniversalRequestJob, xd.d):java.lang.Object");
    }

    public Object doWork(d<? super ListenableWorker.a> dVar) {
        return doWork$suspendImpl(this, dVar);
    }

    public final RequestPolicy getRequestPolicy() {
        RequestPolicy requestPolicy2 = this.requestPolicy;
        if (requestPolicy2 != null) {
            return requestPolicy2;
        }
        m.t("requestPolicy");
        return null;
    }

    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public final UniversalRequestDataSource getUniversalRequestDataSource() {
        return (UniversalRequestDataSource) this.universalRequestDataSource$delegate.getValue();
    }

    public final UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender$delegate.getValue();
    }

    /* access modifiers changed from: protected */
    public final WorkerParameters getWorkerParams() {
        return this.workerParams;
    }

    public final void setRequestPolicy(RequestPolicy requestPolicy2) {
        m.e(requestPolicy2, "<set-?>");
        this.requestPolicy = requestPolicy2;
    }
}
