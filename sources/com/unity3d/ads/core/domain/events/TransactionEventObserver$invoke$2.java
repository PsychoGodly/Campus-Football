package com.unity3d.ads.core.domain.events;

import fe.p;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import pe.q0;
import sd.w;
import se.g;
import se.v;
import se.z;
import vb.m3;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2", f = "TransactionEventObserver.kt", l = {}, m = "invokeSuspend")
/* compiled from: TransactionEventObserver.kt */
final class TransactionEventObserver$invoke$2 extends l implements p<p0, d<? super w>, Object> {
    int label;
    final /* synthetic */ TransactionEventObserver this$0;

    @f(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2$2", f = "TransactionEventObserver.kt", l = {44, 46, 55}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2$2  reason: invalid class name */
    /* compiled from: TransactionEventObserver.kt */
    static final class AnonymousClass2 extends l implements p<m3, d<? super w>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public final d<w> create(Object obj, d<?> dVar) {
            AnonymousClass2 r02 = new AnonymousClass2(transactionEventObserver, dVar);
            r02.L$0 = obj;
            return r02;
        }

        public final Object invoke(m3 m3Var, d<? super w> dVar) {
            return ((AnonymousClass2) create(m3Var, dVar)).invokeSuspend(w.f38141a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0085  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = yd.d.c()
                int r1 = r12.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x002a
                if (r1 == r4) goto L_0x0026
                if (r1 == r3) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                sd.p.b(r13)
                goto L_0x00ac
            L_0x0016:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x001e:
                java.lang.Object r1 = r12.L$0
                vb.t3 r1 = (vb.t3) r1
                sd.p.b(r13)
                goto L_0x007d
            L_0x0026:
                sd.p.b(r13)
                goto L_0x0058
            L_0x002a:
                sd.p.b(r13)
                java.lang.Object r13 = r12.L$0
                vb.m3 r13 = (vb.m3) r13
                vb.o3 r1 = vb.o3.f39052a
                vb.p3$a r1 = vb.p3.f39058b
                vb.t3$b$a r5 = vb.t3.b.q0()
                java.lang.String r6 = "newBuilder()"
                kotlin.jvm.internal.m.d(r5, r6)
                vb.p3 r1 = r1.a(r5)
                r1.k(r13)
                vb.t3$b r13 = r1.a()
                com.unity3d.ads.core.domain.events.TransactionEventObserver r1 = r1
                com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r1 = r1.getUniversalRequestForPayLoad
                r12.label = r4
                java.lang.Object r13 = r1.invoke(r13, r12)
                if (r13 != r0) goto L_0x0058
                return r0
            L_0x0058:
                r1 = r13
                vb.t3 r1 = (vb.t3) r1
                com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = r1
                com.unity3d.ads.gatewayclient.GatewayClient r4 = r13.gatewayClient
                r5 = 0
                com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = r1
                com.unity3d.ads.core.domain.GetRequestPolicy r13 = r13.getRequestPolicy
                com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()
                com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.TRANSACTION_EVENT
                r10 = 1
                r11 = 0
                r12.L$0 = r1
                r12.label = r3
                r6 = r1
                r9 = r12
                java.lang.Object r13 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L_0x007d
                return r0
            L_0x007d:
                vb.w3 r13 = (vb.w3) r13
                vb.d1 r13 = r13.g0()
                if (r13 == 0) goto L_0x00ac
                com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = r1
                com.unity3d.ads.core.data.datasource.ByteStringDataSource r13 = r13.iapTransactionStore
                vb.t3$c r1 = r1.i0()
                vb.g3 r1 = r1.o0()
                com.google.protobuf.t1 r1 = r1.i0()
                com.google.protobuf.i r1 = r1.e()
                java.lang.String r3 = "fullRequest.sharedData.t….timestamp.toByteString()"
                kotlin.jvm.internal.m.d(r1, r3)
                r3 = 0
                r12.L$0 = r3
                r12.label = r2
                java.lang.Object r13 = r13.set(r1, r12)
                if (r13 != r0) goto L_0x00ac
                return r0
            L_0x00ac:
                sd.w r13 = sd.w.f38141a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransactionEventObserver$invoke$2(TransactionEventObserver transactionEventObserver, d<? super TransactionEventObserver$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = transactionEventObserver;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new TransactionEventObserver$invoke$2(this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((TransactionEventObserver$invoke$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        Boolean bool;
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            v access$isRunning$p = this.this$0.isRunning;
            do {
                value = access$isRunning$p.getValue();
                bool = (Boolean) value;
                bool.booleanValue();
            } while (!access$isRunning$p.a(value, b.a(true)));
            if (bool.booleanValue()) {
                return w.f38141a;
            }
            z<m3> transactionEvents = this.this$0.transactionEventRepository.getTransactionEvents();
            final TransactionEventObserver transactionEventObserver = this.this$0;
            g.u(g.x(transactionEvents, new AnonymousClass2((d<? super AnonymousClass2>) null)), q0.a(this.this$0.defaultDispatcher));
            return w.f38141a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
