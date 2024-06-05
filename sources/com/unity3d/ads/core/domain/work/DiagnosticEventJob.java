package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.services.core.di.ServiceProvider;
import kotlin.jvm.internal.m;
import sd.g;
import sd.k;

/* compiled from: DiagnosticEventJob.kt */
public final class DiagnosticEventJob extends UniversalRequestJob {
    private final g diagnosticEventRequestWorkModifier$delegate;
    private final g getDiagnosticRequestPolicy$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiagnosticEventJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        m.e(context, "context");
        m.e(workerParameters, "workerParams");
        k kVar = k.NONE;
        this.getDiagnosticRequestPolicy$delegate = i.b(kVar, new DiagnosticEventJob$special$$inlined$inject$default$1(this, ServiceProvider.NAMED_OTHER_REQ));
        this.diagnosticEventRequestWorkModifier$delegate = i.b(kVar, new DiagnosticEventJob$special$$inlined$inject$default$2(this, MaxReward.DEFAULT_LABEL));
    }

    private final DiagnosticEventRequestWorkModifier getDiagnosticEventRequestWorkModifier() {
        return (DiagnosticEventRequestWorkModifier) this.diagnosticEventRequestWorkModifier$delegate.getValue();
    }

    private final GetRequestPolicy getGetDiagnosticRequestPolicy() {
        return (GetRequestPolicy) this.getDiagnosticRequestPolicy$delegate.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c4 A[PHI: r10 
      PHI: (r10v2 java.lang.Object) = (r10v5 java.lang.Object), (r10v1 java.lang.Object) binds: [B:29:0x00c1, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doWork(xd.d<? super androidx.work.ListenableWorker.a> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1 r0 = (com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1 r0 = new com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r6) goto L_0x0041
            if (r2 == r5) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            sd.p.b(r10)
            goto L_0x00c4
        L_0x0031:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0039:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.work.DiagnosticEventJob r2 = (com.unity3d.ads.core.domain.work.DiagnosticEventJob) r2
            sd.p.b(r10)
            goto L_0x00ae
        L_0x0041:
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r0.L$0
            com.unity3d.ads.core.domain.work.DiagnosticEventJob r6 = (com.unity3d.ads.core.domain.work.DiagnosticEventJob) r6
            sd.p.b(r10)
            goto L_0x007c
        L_0x004d:
            sd.p.b(r10)
            androidx.work.WorkerParameters r10 = r9.getWorkerParams()
            androidx.work.e r10 = r10.d()
            java.lang.String r2 = "universalRequestId"
            java.lang.String r2 = r10.l(r2)
            if (r2 != 0) goto L_0x006a
            androidx.work.ListenableWorker$a r10 = androidx.work.ListenableWorker.a.c()
            java.lang.String r0 = "success()"
            kotlin.jvm.internal.m.d(r10, r0)
            return r10
        L_0x006a:
            com.unity3d.ads.core.data.datasource.UniversalRequestDataSource r10 = r9.getUniversalRequestDataSource()
            r0.L$0 = r9
            r0.L$1 = r2
            r0.label = r6
            java.lang.Object r10 = r10.get(r0)
            if (r10 != r1) goto L_0x007b
            return r1
        L_0x007b:
            r6 = r9
        L_0x007c:
            e r10 = (defpackage.e) r10
            com.google.protobuf.i r10 = r10.i0(r2)
            vb.t3 r10 = vb.t3.k0(r10)
            com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier r7 = r6.getDiagnosticEventRequestWorkModifier()
            java.lang.String r8 = "universalRequest"
            kotlin.jvm.internal.m.d(r10, r8)
            vb.t3 r10 = r7.invoke(r10)
            com.unity3d.ads.core.data.datasource.UniversalRequestDataSource r7 = r6.getUniversalRequestDataSource()
            com.google.protobuf.i r10 = r10.e()
            java.lang.String r8 = "modifiedUniversalRequest.toByteString()"
            kotlin.jvm.internal.m.d(r10, r8)
            r0.L$0 = r6
            r0.L$1 = r3
            r0.label = r5
            java.lang.Object r10 = r7.set(r2, r10, r0)
            if (r10 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            r2 = r6
        L_0x00ae:
            com.unity3d.ads.core.domain.GetRequestPolicy r10 = r2.getGetDiagnosticRequestPolicy()
            com.unity3d.ads.gatewayclient.RequestPolicy r10 = r10.invoke()
            r2.setRequestPolicy(r10)
            r0.L$0 = r3
            r0.label = r4
            java.lang.Object r10 = super.doWork(r0)
            if (r10 != r1) goto L_0x00c4
            return r1
        L_0x00c4:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.DiagnosticEventJob.doWork(xd.d):java.lang.Object");
    }
}
