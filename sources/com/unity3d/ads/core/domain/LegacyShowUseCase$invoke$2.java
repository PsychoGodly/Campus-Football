package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.AdObject;
import fe.t;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2", f = "LegacyShowUseCase.kt", l = {138, 144, 145}, m = "invokeSuspend")
/* compiled from: LegacyShowUseCase.kt */
final class LegacyShowUseCase$invoke$2 extends l implements fe.l<d<? super w>, Object> {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ boolean $isBanner;
    final /* synthetic */ String $placement;
    final /* synthetic */ t<String, UnityAds.UnityAdsShowError, String, Integer, String, d<? super w>, Object> $reportShowError;
    final /* synthetic */ boolean $useTimeout;
    int label;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LegacyShowUseCase$invoke$2(LegacyShowUseCase legacyShowUseCase, boolean z10, AdObject adObject, boolean z11, t<? super String, ? super UnityAds.UnityAdsShowError, ? super String, ? super Integer, ? super String, ? super d<? super w>, ? extends Object> tVar, String str, d<? super LegacyShowUseCase$invoke$2> dVar) {
        super(1, dVar);
        this.this$0 = legacyShowUseCase;
        this.$isBanner = z10;
        this.$adObject = adObject;
        this.$useTimeout = z11;
        this.$reportShowError = tVar;
        this.$placement = str;
    }

    public final d<w> create(d<?> dVar) {
        return new LegacyShowUseCase$invoke$2(this.this$0, this.$isBanner, this.$adObject, this.$useTimeout, this.$reportShowError, this.$placement, dVar);
    }

    public final Object invoke(d<? super w> dVar) {
        return ((LegacyShowUseCase$invoke$2) create(dVar)).invokeSuspend(w.f38141a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = yd.d.c()
            int r1 = r10.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 == r4) goto L_0x0022
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            sd.p.b(r11)
            goto L_0x009d
        L_0x0016:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x001e:
            sd.p.b(r11)
            goto L_0x0078
        L_0x0022:
            sd.p.b(r11)
            goto L_0x0063
        L_0x0026:
            sd.p.b(r11)
            com.unity3d.ads.core.domain.LegacyShowUseCase r11 = r10.this$0
            se.v r11 = r11.hasStarted
            java.lang.Object r11 = r11.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L_0x00a0
            com.unity3d.ads.core.domain.LegacyShowUseCase r11 = r10.this$0
            se.v r11 = r11.timeoutCancellationRequested
            java.lang.Object r11 = r11.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L_0x00a0
            boolean r11 = r10.$isBanner
            if (r11 == 0) goto L_0x0052
            goto L_0x00a0
        L_0x0052:
            com.unity3d.ads.core.domain.LegacyShowUseCase r11 = r10.this$0
            vb.h2 r1 = vb.h2.OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT
            com.unity3d.ads.core.data.model.AdObject r5 = r10.$adObject
            r10.label = r4
            java.lang.String r4 = "timeout"
            java.lang.Object r11 = r11.sendOperativeError(r1, r4, r5, r10)
            if (r11 != r0) goto L_0x0063
            return r0
        L_0x0063:
            boolean r11 = r10.$useTimeout
            if (r11 == 0) goto L_0x009d
            com.unity3d.ads.core.domain.LegacyShowUseCase r11 = r10.this$0
            com.unity3d.ads.core.domain.Show r11 = r11.show
            com.unity3d.ads.core.data.model.AdObject r1 = r10.$adObject
            r10.label = r3
            java.lang.Object r11 = r11.terminate(r1, r10)
            if (r11 != r0) goto L_0x0078
            return r0
        L_0x0078:
            fe.t<java.lang.String, com.unity3d.ads.UnityAds$UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, xd.d<? super sd.w>, java.lang.Object> r3 = r10.$reportShowError
            com.unity3d.ads.UnityAds$UnityAdsShowError r5 = com.unity3d.ads.UnityAds.UnityAdsShowError.TIMEOUT
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "[UnityAds] Timeout while trying to show "
            r11.append(r1)
            java.lang.String r1 = r10.$placement
            r11.append(r1)
            java.lang.String r6 = r11.toString()
            r7 = 0
            r8 = 0
            r10.label = r2
            java.lang.String r4 = "timeout"
            r9 = r10
            java.lang.Object r11 = r3.invoke(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L_0x009d
            return r0
        L_0x009d:
            sd.w r11 = sd.w.f38141a
            return r11
        L_0x00a0:
            sd.w r11 = sd.w.f38141a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
