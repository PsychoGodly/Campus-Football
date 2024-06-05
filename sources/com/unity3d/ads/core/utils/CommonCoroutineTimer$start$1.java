package com.unity3d.ads.core.utils;

import fe.a;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1", f = "CommonCoroutineTimer.kt", l = {21, 24}, m = "invokeSuspend")
/* compiled from: CommonCoroutineTimer.kt */
final class CommonCoroutineTimer$start$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ a<w> $action;
    final /* synthetic */ long $delayStartMillis;
    final /* synthetic */ long $repeatMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonCoroutineTimer$start$1(long j10, a<w> aVar, long j11, d<? super CommonCoroutineTimer$start$1> dVar) {
        super(2, dVar);
        this.$delayStartMillis = j10;
        this.$action = aVar;
        this.$repeatMillis = j11;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        CommonCoroutineTimer$start$1 commonCoroutineTimer$start$1 = new CommonCoroutineTimer$start$1(this.$delayStartMillis, this.$action, this.$repeatMillis, dVar);
        commonCoroutineTimer$start$1.L$0 = obj;
        return commonCoroutineTimer$start$1;
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((CommonCoroutineTimer$start$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: pe.p0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = yd.d.c()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 == r3) goto L_0x000e
            if (r1 != r2) goto L_0x0016
        L_0x000e:
            java.lang.Object r1 = r6.L$0
            pe.p0 r1 = (pe.p0) r1
            sd.p.b(r7)
            goto L_0x0033
        L_0x0016:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001e:
            sd.p.b(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            pe.p0 r1 = (pe.p0) r1
            long r4 = r6.$delayStartMillis
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = pe.a1.a(r4, r6)
            if (r7 != r0) goto L_0x0033
            return r0
        L_0x0033:
            r7 = r6
        L_0x0034:
            boolean r3 = pe.q0.g(r1)
            if (r3 == 0) goto L_0x004c
            fe.a<sd.w> r3 = r7.$action
            r3.invoke()
            long r3 = r7.$repeatMillis
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r3 = pe.a1.a(r3, r7)
            if (r3 != r0) goto L_0x0034
            return r0
        L_0x004c:
            sd.w r7 = sd.w.f38141a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
