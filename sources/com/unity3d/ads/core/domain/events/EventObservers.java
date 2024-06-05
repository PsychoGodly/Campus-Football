package com.unity3d.ads.core.domain.events;

import kotlin.jvm.internal.m;

/* compiled from: EventObservers.kt */
public final class EventObservers {
    private final DiagnosticEventObserver diagnosticEventObserver;
    private final OperativeEventObserver operativeEventObserver;
    private final TransactionEventObserver transactionEventObserver;

    public EventObservers(OperativeEventObserver operativeEventObserver2, DiagnosticEventObserver diagnosticEventObserver2, TransactionEventObserver transactionEventObserver2) {
        m.e(operativeEventObserver2, "operativeEventObserver");
        m.e(diagnosticEventObserver2, "diagnosticEventObserver");
        m.e(transactionEventObserver2, "transactionEventObserver");
        this.operativeEventObserver = operativeEventObserver2;
        this.diagnosticEventObserver = diagnosticEventObserver2;
        this.transactionEventObserver = transactionEventObserver2;
    }

    public final DiagnosticEventObserver getDiagnosticEventObserver() {
        return this.diagnosticEventObserver;
    }

    public final OperativeEventObserver getOperativeEventObserver() {
        return this.operativeEventObserver;
    }

    public final TransactionEventObserver getTransactionEventObserver() {
        return this.transactionEventObserver;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(xd.d<? super sd.w> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.events.EventObservers$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.unity3d.ads.core.domain.events.EventObservers$invoke$1 r0 = (com.unity3d.ads.core.domain.events.EventObservers$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.events.EventObservers$invoke$1 r0 = new com.unity3d.ads.core.domain.events.EventObservers$invoke$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            sd.p.b(r7)
            goto L_0x0073
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0037:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.events.EventObservers r2 = (com.unity3d.ads.core.domain.events.EventObservers) r2
            sd.p.b(r7)
            goto L_0x0065
        L_0x003f:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.events.EventObservers r2 = (com.unity3d.ads.core.domain.events.EventObservers) r2
            sd.p.b(r7)
            goto L_0x0058
        L_0x0047:
            sd.p.b(r7)
            com.unity3d.ads.core.domain.events.OperativeEventObserver r7 = r6.operativeEventObserver
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r2 = r6
        L_0x0058:
            com.unity3d.ads.core.domain.events.DiagnosticEventObserver r7 = r2.diagnosticEventObserver
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L_0x0065
            return r1
        L_0x0065:
            com.unity3d.ads.core.domain.events.TransactionEventObserver r7 = r2.transactionEventObserver
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L_0x0073
            return r1
        L_0x0073:
            sd.w r7 = sd.w.f38141a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.EventObservers.invoke(xd.d):java.lang.Object");
    }
}
