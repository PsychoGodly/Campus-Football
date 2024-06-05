package com.unity3d.ads.core.domain.events;

import com.google.protobuf.i;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import kotlin.jvm.internal.m;
import sd.w;
import vb.j2;
import xd.d;

/* compiled from: GetOperativeEventApi.kt */
public final class GetOperativeEventApi {
    private final OperativeEventRepository operativeEventRepository;
    private final GetOperativeEventRequest operativeEventRequest;

    public GetOperativeEventApi(OperativeEventRepository operativeEventRepository2, GetOperativeEventRequest getOperativeEventRequest) {
        m.e(operativeEventRepository2, "operativeEventRepository");
        m.e(getOperativeEventRequest, "operativeEventRequest");
        this.operativeEventRepository = operativeEventRepository2;
        this.operativeEventRequest = getOperativeEventRequest;
    }

    public static /* synthetic */ Object invoke$default(GetOperativeEventApi getOperativeEventApi, j2 j2Var, i iVar, i iVar2, i iVar3, String str, d dVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str = null;
        }
        return getOperativeEventApi.invoke(j2Var, iVar, iVar2, iVar3, str, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(vb.j2 r9, com.google.protobuf.i r10, com.google.protobuf.i r11, com.google.protobuf.i r12, java.lang.String r13, xd.d<? super sd.w> r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1 r0 = (com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1 r0 = new com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1
            r0.<init>(r8, r14)
        L_0x0018:
            r7 = r0
            java.lang.Object r14 = r7.result
            java.lang.Object r0 = yd.d.c()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            java.lang.Object r9 = r7.L$0
            com.unity3d.ads.core.domain.events.GetOperativeEventApi r9 = (com.unity3d.ads.core.domain.events.GetOperativeEventApi) r9
            sd.p.b(r14)
            goto L_0x004c
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            sd.p.b(r14)
            com.unity3d.ads.core.domain.events.GetOperativeEventRequest r1 = r8.operativeEventRequest
            r7.L$0 = r8
            r7.label = r2
            r2 = r9
            r3 = r11
            r4 = r10
            r5 = r12
            r6 = r13
            java.lang.Object r14 = r1.invoke(r2, r3, r4, r5, r6, r7)
            if (r14 != r0) goto L_0x004b
            return r0
        L_0x004b:
            r9 = r8
        L_0x004c:
            vb.i2 r14 = (vb.i2) r14
            com.unity3d.ads.core.data.repository.OperativeEventRepository r9 = r9.operativeEventRepository
            r9.addOperativeEvent(r14)
            sd.w r9 = sd.w.f38141a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke(vb.j2, com.google.protobuf.i, com.google.protobuf.i, com.google.protobuf.i, java.lang.String, xd.d):java.lang.Object");
    }

    public final Object invoke(j2 j2Var, AdObject adObject, i iVar, d<? super w> dVar) {
        Object invoke = invoke(j2Var, adObject.getOpportunityId(), adObject.getTrackingToken(), iVar, adObject.getPlayerServerId(), dVar);
        return invoke == d.c() ? invoke : w.f38141a;
    }
}
