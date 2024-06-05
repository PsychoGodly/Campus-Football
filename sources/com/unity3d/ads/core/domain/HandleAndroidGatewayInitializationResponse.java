package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.c2;
import pe.p0;
import pe.r0;
import sd.w;
import vb.p1;
import vb.z1;
import xd.d;
import xd.g;

/* compiled from: HandleAndroidGatewayInitializationResponse.kt */
public final class HandleAndroidGatewayInitializationResponse implements HandleGatewayInitializationResponse {
    private final p0 sdkScope;
    private final SessionRepository sessionRepository;
    private final TransactionEventManager transactionEventManager;
    /* access modifiers changed from: private */
    public final TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;

    public HandleAndroidGatewayInitializationResponse(TransactionEventManager transactionEventManager2, TriggerInitializationCompletedRequest triggerInitializationCompletedRequest2, SessionRepository sessionRepository2, p0 p0Var) {
        m.e(transactionEventManager2, "transactionEventManager");
        m.e(triggerInitializationCompletedRequest2, "triggerInitializationCompletedRequest");
        m.e(sessionRepository2, "sessionRepository");
        m.e(p0Var, "sdkScope");
        this.transactionEventManager = transactionEventManager2;
        this.triggerInitializationCompletedRequest = triggerInitializationCompletedRequest2;
        this.sessionRepository = sessionRepository2;
        this.sdkScope = p0Var;
    }

    public Object invoke(p1 p1Var, d<? super w> dVar) {
        if (!p1Var.k0()) {
            SessionRepository sessionRepository2 = this.sessionRepository;
            z1 h02 = p1Var.h0();
            m.d(h02, "response.nativeConfiguration");
            sessionRepository2.setNativeConfiguration(h02);
            if (p1Var.l0()) {
                String j02 = p1Var.j0();
                if (!(j02 == null || j02.length() == 0)) {
                    SessionRepository sessionRepository3 = this.sessionRepository;
                    String j03 = p1Var.j0();
                    m.d(j03, "response.universalRequestUrl");
                    sessionRepository3.setGatewayUrl(j03);
                }
            }
            if (p1Var.i0()) {
                c2 unused = k.d(this.sdkScope, (g) null, (r0) null, new HandleAndroidGatewayInitializationResponse$invoke$2(this, (d<? super HandleAndroidGatewayInitializationResponse$invoke$2>) null), 3, (Object) null);
            }
            if (p1Var.h0().q0()) {
                this.transactionEventManager.invoke();
            }
            return w.f38141a;
        }
        String h03 = p1Var.g0().h0();
        m.d(h03, "response.error.errorText");
        throw new InitializationException(h03, (Throwable) null, "gateway", p1Var.g0().h0(), 2, (h) null);
    }
}
