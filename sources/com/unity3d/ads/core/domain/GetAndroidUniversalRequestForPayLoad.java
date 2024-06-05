package com.unity3d.ads.core.domain;

import kotlin.jvm.internal.m;

/* compiled from: GetAndroidUniversalRequestForPayLoad.kt */
public final class GetAndroidUniversalRequestForPayLoad implements GetUniversalRequestForPayLoad {
    private final GetUniversalRequestSharedData getUniversalRequestSharedData;

    public GetAndroidUniversalRequestForPayLoad(GetUniversalRequestSharedData getUniversalRequestSharedData2) {
        m.e(getUniversalRequestSharedData2, "getUniversalRequestSharedData");
        this.getUniversalRequestSharedData = getUniversalRequestSharedData2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(vb.t3.b r6, xd.d<? super vb.t3> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.GetAndroidUniversalRequestForPayLoad$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.unity3d.ads.core.domain.GetAndroidUniversalRequestForPayLoad$invoke$1 r0 = (com.unity3d.ads.core.domain.GetAndroidUniversalRequestForPayLoad$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.GetAndroidUniversalRequestForPayLoad$invoke$1 r0 = new com.unity3d.ads.core.domain.GetAndroidUniversalRequestForPayLoad$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r6 = r0.L$3
            vb.o3$a r6 = (vb.o3.a) r6
            java.lang.Object r1 = r0.L$2
            vb.o3$a r1 = (vb.o3.a) r1
            java.lang.Object r2 = r0.L$1
            vb.o3$a r2 = (vb.o3.a) r2
            java.lang.Object r0 = r0.L$0
            vb.t3$b r0 = (vb.t3.b) r0
            sd.p.b(r7)
            goto L_0x006b
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            sd.p.b(r7)
            vb.o3$a$a r7 = vb.o3.a.f39053b
            vb.t3$a r2 = vb.t3.j0()
            java.lang.String r4 = "newBuilder()"
            kotlin.jvm.internal.m.d(r2, r4)
            vb.o3$a r7 = r7.a(r2)
            com.unity3d.ads.core.domain.GetUniversalRequestSharedData r2 = r5.getUniversalRequestSharedData
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r7
            r0.L$3 = r7
            r0.label = r3
            java.lang.Object r0 = r2.invoke(r0)
            if (r0 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r1 = r7
            r2 = r1
            r7 = r0
            r0 = r6
            r6 = r2
        L_0x006b:
            vb.t3$c r7 = (vb.t3.c) r7
            r6.d(r7)
            r1.c(r0)
            vb.t3 r6 = r2.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.GetAndroidUniversalRequestForPayLoad.invoke(vb.t3$b, xd.d):java.lang.Object");
    }
}
