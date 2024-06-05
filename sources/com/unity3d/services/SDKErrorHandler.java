package com.unity3d.services;

import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import fe.p;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.c2;
import pe.k0;
import pe.l0;
import pe.o0;
import pe.p0;
import pe.q0;
import pe.r0;
import xd.d;
import xd.g;

/* compiled from: SDKErrorHandler.kt */
public final class SDKErrorHandler implements l0 {
    public static final Companion Companion = new Companion((h) null);
    public static final String UNITY_PACKAGE = "com.unity3d";
    public static final String UNKNOWN_FILE = "unknown";
    private final AlternativeFlowReader alternativeFlowReader;
    private final k0 ioDispatcher;
    private final l0.b key = l0.A1;
    private final p0 scope;
    private final SDKMetricsSender sdkMetricsSender;
    /* access modifiers changed from: private */
    public final SendDiagnosticEvent sendDiagnosticEvent;

    /* compiled from: SDKErrorHandler.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public SDKErrorHandler(k0 k0Var, AlternativeFlowReader alternativeFlowReader2, SendDiagnosticEvent sendDiagnosticEvent2, SDKMetricsSender sDKMetricsSender) {
        m.e(k0Var, "ioDispatcher");
        m.e(alternativeFlowReader2, "alternativeFlowReader");
        m.e(sendDiagnosticEvent2, "sendDiagnosticEvent");
        m.e(sDKMetricsSender, "sdkMetricsSender");
        this.ioDispatcher = k0Var;
        this.alternativeFlowReader = alternativeFlowReader2;
        this.sendDiagnosticEvent = sendDiagnosticEvent2;
        this.sdkMetricsSender = sDKMetricsSender;
        this.scope = q0.h(q0.a(k0Var), new o0("SDKErrorHandler"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r2 = r2.X0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String retrieveCoroutineName(xd.g r2) {
        /*
            r1 = this;
            pe.o0$a r0 = pe.o0.f37377b
            xd.g$b r2 = r2.get(r0)
            pe.o0 r2 = (pe.o0) r2
            if (r2 == 0) goto L_0x0010
            java.lang.String r2 = r2.X0()
            if (r2 != 0) goto L_0x0012
        L_0x0010:
            java.lang.String r2 = "unknown"
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.SDKErrorHandler.retrieveCoroutineName(xd.g):java.lang.String");
    }

    private final void sendDiagnostic(String str, String str2, String str3) {
        c2 unused = k.d(this.scope, (g) null, (r0) null, new SDKErrorHandler$sendDiagnostic$1(this, str, str2, str3, (d<? super SDKErrorHandler$sendDiagnostic$1>) null), 3, (Object) null);
    }

    private final void sendMetric(Metric metric) {
        this.sdkMetricsSender.sendMetric(metric);
    }

    public <R> R fold(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return l0.a.a(this, r10, pVar);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        return l0.a.b(this, cVar);
    }

    public void handleException(g gVar, Throwable th) {
        String str;
        m.e(gVar, "context");
        m.e(th, "exception");
        String retrieveCoroutineName = retrieveCoroutineName(gVar);
        if (th instanceof NullPointerException) {
            str = "native_exception_npe";
        } else if (th instanceof OutOfMemoryError) {
            str = "native_exception_oom";
        } else if (th instanceof IllegalStateException) {
            str = "native_exception_ise";
        } else if (th instanceof SecurityException) {
            str = "native_exception_se";
        } else {
            str = th instanceof RuntimeException ? "native_exception_re" : "native_exception";
        }
        String str2 = str;
        boolean invoke = this.alternativeFlowReader.invoke();
        String retrieveUnityCrashValue = ExceptionExtensionsKt.retrieveUnityCrashValue(th);
        DeviceLog.error("Unity Ads SDK encountered an exception: " + retrieveUnityCrashValue);
        if (invoke) {
            sendDiagnostic(str2, retrieveUnityCrashValue, retrieveCoroutineName);
        } else {
            sendMetric(new Metric(str2, retrieveUnityCrashValue, (Map) null, 4, (h) null));
        }
    }

    public g minusKey(g.c<?> cVar) {
        return l0.a.c(this, cVar);
    }

    public g plus(g gVar) {
        return l0.a.d(this, gVar);
    }

    public l0.b getKey() {
        return this.key;
    }
}
