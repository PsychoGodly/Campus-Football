package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.services.UnityAdsConstants;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import oe.j;
import pe.g3;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.InitializeAndroidBoldSDK$invoke$2", f = "InitializeAndroidBoldSDK.kt", l = {60, 74}, m = "invokeSuspend")
/* compiled from: InitializeAndroidBoldSDK.kt */
final class InitializeAndroidBoldSDK$invoke$2 extends l implements p<p0, d<? super w>, Object> {
    long J$0;
    int label;
    final /* synthetic */ InitializeAndroidBoldSDK this$0;

    @f(c = "com.unity3d.ads.core.domain.InitializeAndroidBoldSDK$invoke$2$1", f = "InitializeAndroidBoldSDK.kt", l = {61, 63, 65, 66}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.InitializeAndroidBoldSDK$invoke$2$1  reason: invalid class name */
    /* compiled from: InitializeAndroidBoldSDK.kt */
    static final class AnonymousClass1 extends l implements p<p0, d<? super w>, Object> {
        int label;

        public final d<w> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(initializeAndroidBoldSDK, dVar);
        }

        public final Object invoke(p0 p0Var, d<? super w> dVar) {
            return ((AnonymousClass1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0070 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x008e A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = yd.d.c()
                int r1 = r12.label
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x002d
                if (r1 == r5) goto L_0x0029
                if (r1 == r4) goto L_0x0025
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                sd.p.b(r13)
                goto L_0x008f
            L_0x0019:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0021:
                sd.p.b(r13)
                goto L_0x0071
            L_0x0025:
                sd.p.b(r13)
                goto L_0x004f
            L_0x0029:
                sd.p.b(r13)
                goto L_0x003b
            L_0x002d:
                sd.p.b(r13)
                com.unity3d.ads.core.domain.InitializeAndroidBoldSDK r13 = r1
                r12.label = r5
                java.lang.Object r13 = r13.initializationStart(r12)
                if (r13 != r0) goto L_0x003b
                return r0
            L_0x003b:
                com.unity3d.ads.core.domain.InitializeAndroidBoldSDK r13 = r1
                r13.checkCanInitialize()
                com.unity3d.ads.core.domain.InitializeAndroidBoldSDK r13 = r1
                com.unity3d.ads.core.domain.GetInitializationRequest r13 = r13.getInitializeRequest
                r12.label = r4
                java.lang.Object r13 = r13.invoke(r12)
                if (r13 != r0) goto L_0x004f
                return r0
            L_0x004f:
                r6 = r13
                vb.t3 r6 = (vb.t3) r6
                com.unity3d.ads.core.domain.InitializeAndroidBoldSDK r13 = r1
                com.unity3d.ads.core.domain.GetRequestPolicy r13 = r13.getRequestPolicy
                com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()
                com.unity3d.ads.core.domain.InitializeAndroidBoldSDK r13 = r1
                com.unity3d.ads.gatewayclient.GatewayClient r4 = r13.gatewayClient
                r5 = 0
                com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.INITIALIZATION
                r10 = 1
                r11 = 0
                r12.label = r3
                r9 = r12
                java.lang.Object r13 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L_0x0071
                return r0
            L_0x0071:
                vb.w3 r13 = (vb.w3) r13
                com.unity3d.ads.core.domain.InitializeAndroidBoldSDK r1 = r1
                com.unity3d.ads.core.domain.HandleGatewayInitializationResponse r1 = r1.handleGatewayInitializationResponse
                vb.w3$b r13 = r13.i0()
                vb.p1 r13 = r13.j0()
                java.lang.String r3 = "response.payload.initializationResponse"
                kotlin.jvm.internal.m.d(r13, r3)
                r12.label = r2
                java.lang.Object r13 = r1.invoke(r13, r12)
                if (r13 != r0) goto L_0x008f
                return r0
            L_0x008f:
                sd.w r13 = sd.w.f38141a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.InitializeAndroidBoldSDK$invoke$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeAndroidBoldSDK$invoke$2(InitializeAndroidBoldSDK initializeAndroidBoldSDK, d<? super InitializeAndroidBoldSDK$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = initializeAndroidBoldSDK;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeAndroidBoldSDK$invoke$2(this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((InitializeAndroidBoldSDK$invoke$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        long j10;
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            long a10 = j.f36786a.a();
            try {
                final InitializeAndroidBoldSDK initializeAndroidBoldSDK = this.this$0;
                AnonymousClass1 r10 = new AnonymousClass1((d<? super AnonymousClass1>) null);
                this.J$0 = a10;
                this.label = 1;
                if (g3.c(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, r10, this) == c10) {
                    return c10;
                }
                j10 = a10;
            } catch (Exception e10) {
                e = e10;
                j10 = a10;
                this.this$0.initializationFailure(j.a.c(j10), InitializationException.Companion.parseFrom(e));
                return w.f38141a;
            }
        } else if (i10 == 1) {
            j10 = this.J$0;
            try {
                sd.p.b(obj);
            } catch (Exception e11) {
                e = e11;
            }
        } else if (i10 == 2) {
            sd.p.b(obj);
            return w.f38141a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        InitializeAndroidBoldSDK initializeAndroidBoldSDK2 = this.this$0;
        j.a c11 = j.a.c(j10);
        this.label = 2;
        if (initializeAndroidBoldSDK2.initializationSuccess(c11, this) == c10) {
            return c10;
        }
        return w.f38141a;
    }
}
