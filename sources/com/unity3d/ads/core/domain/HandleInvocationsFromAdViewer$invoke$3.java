package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.Invocation;
import fe.a;
import fe.p;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$3", f = "HandleInvocationsFromAdViewer.kt", l = {138}, m = "invokeSuspend")
/* compiled from: HandleInvocationsFromAdViewer.kt */
final class HandleInvocationsFromAdViewer$invoke$3 extends l implements p<Invocation, d<? super w>, Object> {
    final /* synthetic */ Map<String, a<ExposedFunction>> $definition;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HandleInvocationsFromAdViewer$invoke$3(Map<String, ? extends a<? extends ExposedFunction>> map, d<? super HandleInvocationsFromAdViewer$invoke$3> dVar) {
        super(2, dVar);
        this.$definition = map;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        HandleInvocationsFromAdViewer$invoke$3 handleInvocationsFromAdViewer$invoke$3 = new HandleInvocationsFromAdViewer$invoke$3(this.$definition, dVar);
        handleInvocationsFromAdViewer$invoke$3.L$0 = obj;
        return handleInvocationsFromAdViewer$invoke$3;
    }

    public final Object invoke(Invocation invocation, d<? super w> dVar) {
        return ((HandleInvocationsFromAdViewer$invoke$3) create(invocation, dVar)).invokeSuspend(w.f38141a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r1 = (com.unity3d.ads.adplayer.ExposedFunction) r1.invoke();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = yd.d.c()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L_0x0017
            if (r1 != r2) goto L_0x000f
            sd.p.b(r6)
            goto L_0x0044
        L_0x000f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0017:
            sd.p.b(r6)
            java.lang.Object r6 = r5.L$0
            com.unity3d.ads.adplayer.Invocation r6 = (com.unity3d.ads.adplayer.Invocation) r6
            java.util.Map<java.lang.String, fe.a<com.unity3d.ads.adplayer.ExposedFunction>> r1 = r5.$definition
            java.lang.String r3 = r6.getLocation()
            java.lang.Object r1 = r1.get(r3)
            fe.a r1 = (fe.a) r1
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r1.invoke()
            com.unity3d.ads.adplayer.ExposedFunction r1 = (com.unity3d.ads.adplayer.ExposedFunction) r1
            if (r1 != 0) goto L_0x0035
            goto L_0x0047
        L_0x0035:
            com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$3$1 r3 = new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$3$1
            r4 = 0
            r3.<init>(r1, r6, r4)
            r5.label = r2
            java.lang.Object r6 = r6.handle(r3, r5)
            if (r6 != r0) goto L_0x0044
            return r0
        L_0x0044:
            sd.w r6 = sd.w.f38141a
            return r6
        L_0x0047:
            sd.w r6 = sd.w.f38141a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
