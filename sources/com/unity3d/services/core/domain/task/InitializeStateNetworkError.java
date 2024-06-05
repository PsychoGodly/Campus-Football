package com.unity3d.services.core.domain.task;

import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.connectivity.IConnectivityListener;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import kotlin.jvm.internal.m;
import sd.o;
import sd.w;
import xd.d;

/* compiled from: InitializeStateNetworkError.kt */
public final class InitializeStateNetworkError extends MetricTask<Params, w> implements IConnectivityListener {
    /* access modifiers changed from: private */
    public int connectedEventThreshold = 10000;
    private d<? super w> continuation;
    private final ISDKDispatchers dispatchers;
    private long lastConnectedEventTimeMs;
    /* access modifiers changed from: private */
    public int maximumConnectedEvents = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
    private int receivedConnectedEvents;

    /* compiled from: InitializeStateNetworkError.kt */
    public static final class Params implements BaseParams {
        private final Configuration config;

        public Params(Configuration configuration) {
            m.e(configuration, "config");
            this.config = configuration;
        }

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                configuration = params.config;
            }
            return params.copy(configuration);
        }

        public final Configuration component1() {
            return this.config;
        }

        public final Params copy(Configuration configuration) {
            m.e(configuration, "config");
            return new Params(configuration);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Params) && m.a(this.config, ((Params) obj).config);
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        public String toString() {
            return "Params(config=" + this.config + ')';
        }
    }

    public InitializeStateNetworkError(ISDKDispatchers iSDKDispatchers) {
        m.e(iSDKDispatchers, "dispatchers");
        this.dispatchers = iSDKDispatchers;
    }

    private final boolean shouldHandleConnectedEvent() {
        return System.currentTimeMillis() - this.lastConnectedEventTimeMs >= ((long) this.connectedEventThreshold) && this.receivedConnectedEvents <= this.maximumConnectedEvents;
    }

    /* access modifiers changed from: private */
    public final void startListening(d<? super w> dVar) {
        this.continuation = dVar;
        ConnectivityMonitor.addListener(this);
    }

    public String getMetricName() {
        return getMetricNameForInitializeTask("error_network");
    }

    public void onConnected() {
        this.receivedConnectedEvents++;
        DeviceLog.debug("Unity Ads init got connected event");
        if (shouldHandleConnectedEvent()) {
            d<? super w> dVar = this.continuation;
            if (dVar != null) {
                o.a aVar = o.f38128b;
                dVar.resumeWith(o.b(w.f38141a));
            }
            this.continuation = null;
        }
        if (this.receivedConnectedEvents > this.maximumConnectedEvents) {
            ConnectivityMonitor.removeListener(this);
        }
        this.lastConnectedEventTimeMs = System.currentTimeMillis();
    }

    public void onDisconnected() {
        DeviceLog.debug("Unity Ads init got disconnected event");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: doWork-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m59doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params r6, xd.d<? super sd.o<sd.w>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$1 r0 = (com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$1 r0 = new com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sd.p.b(r7)
            goto L_0x0049
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            sd.p.b(r7)
            com.unity3d.services.core.domain.ISDKDispatchers r7 = r5.dispatchers
            pe.k0 r7 = r7.getDefault()
            com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2 r2 = new com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.label = r3
            java.lang.Object r7 = pe.i.g(r7, r2, r0)
            if (r7 != r1) goto L_0x0049
            return r1
        L_0x0049:
            sd.o r7 = (sd.o) r7
            java.lang.Object r6 = r7.i()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateNetworkError.m59doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateNetworkError$Params, xd.d):java.lang.Object");
    }
}
