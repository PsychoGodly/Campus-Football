package com.unity3d.services.core.request.metrics;

import com.applovin.mediation.MaxReward;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.BodyType;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import fe.p;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import org.json.JSONObject;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1", f = "MetricSender.kt", l = {65}, m = "invokeSuspend")
/* compiled from: MetricSender.kt */
final class MetricSender$sendMetrics$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ List<Metric> $metrics;
    int label;
    final /* synthetic */ MetricSender this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MetricSender$sendMetrics$1(MetricSender metricSender, List<Metric> list, d<? super MetricSender$sendMetrics$1> dVar) {
        super(2, dVar);
        this.this$0 = metricSender;
        this.$metrics = list;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new MetricSender$sendMetrics$1(this.this$0, this.$metrics, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((MetricSender$sendMetrics$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object c10 = d.c();
        int i10 = this.label;
        boolean z10 = true;
        if (i10 == 0) {
            sd.p.b(obj);
            String jSONObject = new JSONObject(new MetricsContainer(this.this$0.metricSampleRate, this.this$0.commonTags, this.$metrics, this.this$0.sessionToken).toMap()).toString();
            m.d(jSONObject, "JSONObject(container.toMap()).toString()");
            String metricEndPoint = this.this$0.getMetricEndPoint();
            if (metricEndPoint == null) {
                metricEndPoint = MaxReward.DEFAULT_LABEL;
            }
            HttpRequest httpRequest = new HttpRequest(metricEndPoint, (String) null, RequestType.POST, jSONObject, (Map) null, (Map) null, (BodyType) null, (String) null, (Integer) null, 0, 0, 0, 0, false, (OperationType) null, (File) null, 0, 131058, (h) null);
            HttpClient access$getHttpClient$p = this.this$0.httpClient;
            this.label = 1;
            obj2 = access$getHttpClient$p.execute(httpRequest, this);
            if (obj2 == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            sd.p.b(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        HttpResponse httpResponse = (HttpResponse) obj2;
        if (httpResponse.getStatusCode() / 100 != 2) {
            z10 = false;
        }
        if (z10) {
            DeviceLog.debug("Metric " + this.$metrics + " sent to " + this.this$0.getMetricEndPoint());
        } else {
            DeviceLog.debug("Metric " + this.$metrics + " failed to send with response code: " + httpResponse.getStatusCode());
        }
        return w.f38141a;
    }
}
