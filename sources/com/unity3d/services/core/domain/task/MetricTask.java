package com.unity3d.services.core.domain.task;

import com.applovin.mediation.MaxReward;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.domain.task.BaseTask;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import sd.o;
import xd.d;

/* compiled from: MetricTask.kt */
public abstract class MetricTask<P extends BaseParams, R> implements BaseTask<P, R> {
    private long duration;
    private String taskStatus = "unknown";

    private final void captureMetric(Object obj) {
        this.taskStatus = o.g(obj) ? "success" : "failure";
        sendMetric();
    }

    private final Metric getMetric() {
        return new Metric(getMetricName(), Long.valueOf(this.duration), getMetricTagsForState());
    }

    private final Map<String, String> getMetricTagsForState() {
        Map<String, String> retryTags = InitializeEventsMetricSender.getInstance().getRetryTags();
        m.d(retryTags, "getInstance().retryTags");
        return retryTags;
    }

    private final SDKMetricsSender getSDKMetrics() {
        return (SDKMetricsSender) getServiceProvider().getRegistry().getService(MaxReward.DEFAULT_LABEL, a0.b(SDKMetricsSender.class));
    }

    private final int getStatePrefixLength() {
        return 15;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: invoke-gIAlu-s$suspendImpl  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object m64invokegIAlus$suspendImpl(com.unity3d.services.core.domain.task.MetricTask<? super P, R> r8, P r9, xd.d<? super sd.o<? extends R>> r10) {
        /*
            boolean r0 = r10 instanceof com.unity3d.services.core.domain.task.MetricTask$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.unity3d.services.core.domain.task.MetricTask$invoke$1 r0 = (com.unity3d.services.core.domain.task.MetricTask$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.services.core.domain.task.MetricTask$invoke$1 r0 = new com.unity3d.services.core.domain.task.MetricTask$invoke$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0051
            if (r2 != r3) goto L_0x0049
            long r8 = r0.J$0
            java.lang.Object r1 = r0.L$4
            java.util.concurrent.TimeUnit r1 = (java.util.concurrent.TimeUnit) r1
            java.lang.Object r2 = r0.L$3
            com.unity3d.services.core.domain.task.MetricTask r2 = (com.unity3d.services.core.domain.task.MetricTask) r2
            java.lang.Object r3 = r0.L$2
            kotlin.jvm.internal.z r3 = (kotlin.jvm.internal.z) r3
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.internal.z r4 = (kotlin.jvm.internal.z) r4
            java.lang.Object r0 = r0.L$0
            com.unity3d.services.core.domain.task.MetricTask r0 = (com.unity3d.services.core.domain.task.MetricTask) r0
            sd.p.b(r10)
            sd.o r10 = (sd.o) r10
            java.lang.Object r10 = r10.i()
            r6 = r8
            r8 = r2
            r9 = r4
            r4 = r6
            goto L_0x0079
        L_0x0049:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0051:
            sd.p.b(r10)
            kotlin.jvm.internal.z r10 = new kotlin.jvm.internal.z
            r10.<init>()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r4 = java.lang.System.nanoTime()
            r0.L$0 = r8
            r0.L$1 = r10
            r0.L$2 = r10
            r0.L$3 = r8
            r0.L$4 = r2
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r9 = com.unity3d.services.core.domain.task.BaseTask.DefaultImpls.m36invokegIAlus(r8, r9, r0)
            if (r9 != r1) goto L_0x0074
            return r1
        L_0x0074:
            r0 = r8
            r3 = r10
            r1 = r2
            r10 = r9
            r9 = r3
        L_0x0079:
            r3.f36055a = r10
            sd.w r10 = sd.w.f38141a
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r4
            long r1 = r1.toMillis(r2)
            r8.duration = r1
            T r8 = r9.f36055a
            r0.captureMetric(r8)
            T r8 = r9.f36055a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.MetricTask.m64invokegIAlus$suspendImpl(com.unity3d.services.core.domain.task.MetricTask, com.unity3d.services.core.domain.task.BaseParams, xd.d):java.lang.Object");
    }

    private final void sendMetric() {
        String metricName = getMetricName();
        if (!(metricName == null || metricName.length() == 0)) {
            getSDKMetrics().sendMetric(getMetric());
        }
    }

    public final long getDuration() {
        return this.duration;
    }

    public String getMetricName() {
        return null;
    }

    public final String getMetricNameForInitializeTask(String str) {
        m.e(str, MediationMetaData.KEY_NAME);
        return "native_" + str + "_task_" + this.taskStatus + "_time";
    }

    public final String getMetricNameForTask(Object obj) {
        m.e(obj, "task");
        String simpleName = obj.getClass().getSimpleName();
        m.d(simpleName, "className");
        if (simpleName.length() == 0) {
            return null;
        }
        m.d(simpleName, "className");
        String substring = simpleName.substring(getStatePrefixLength());
        m.d(substring, "this as java.lang.String).substring(startIndex)");
        String lowerCase = substring.toLowerCase(Locale.ROOT);
        m.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        StringBuilder sb2 = new StringBuilder(7 + lowerCase.length() + 6);
        sb2.append("native_");
        sb2.append(lowerCase);
        sb2.append("_state");
        return sb2.toString();
    }

    public IServiceProvider getServiceProvider() {
        return BaseTask.DefaultImpls.getServiceProvider(this);
    }

    public final String getTaskStatus() {
        return this.taskStatus;
    }

    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    public Object m65invokegIAlus(P p10, d<? super o<? extends R>> dVar) {
        return m64invokegIAlus$suspendImpl(this, p10, dVar);
    }

    public final void setDuration(long j10) {
        this.duration = j10;
    }

    public final void setTaskStatus(String str) {
        m.e(str, "<set-?>");
        this.taskStatus = str;
    }
}
