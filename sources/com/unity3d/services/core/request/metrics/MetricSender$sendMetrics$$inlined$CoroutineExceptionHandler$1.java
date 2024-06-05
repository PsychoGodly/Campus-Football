package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.log.DeviceLog;
import java.util.List;
import pe.l0;
import xd.a;
import xd.g;

/* compiled from: CoroutineExceptionHandler.kt */
public final class MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1 extends a implements l0 {
    final /* synthetic */ List $metrics$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(l0.b bVar, List list) {
        super(bVar);
        this.$metrics$inlined = list;
    }

    public void handleException(g gVar, Throwable th) {
        DeviceLog.debug("Metric " + this.$metrics$inlined + " failed to send with error: " + th);
    }
}
