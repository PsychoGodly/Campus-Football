package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import fe.t;
import sd.w;
import se.f;
import xd.d;

/* compiled from: LegacyShowUseCase.kt */
final class LegacyShowUseCase$invoke$4<T> implements f {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ String $placement;
    final /* synthetic */ t<String, UnityAds.UnityAdsShowError, String, Integer, String, d<? super w>, Object> $reportShowError;
    final /* synthetic */ long $startTime;
    final /* synthetic */ LegacyShowUseCase this$0;

    LegacyShowUseCase$invoke$4(LegacyShowUseCase legacyShowUseCase, long j10, String str, Listeners listeners, AdObject adObject, t<? super String, ? super UnityAds.UnityAdsShowError, ? super String, ? super Integer, ? super String, ? super d<? super w>, ? extends Object> tVar) {
        this.this$0 = legacyShowUseCase;
        this.$startTime = j10;
        this.$placement = str;
        this.$listeners = listeners;
        this.$adObject = adObject;
        this.$reportShowError = tVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fe A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(com.unity3d.ads.core.data.model.ShowEvent r9, xd.d<? super sd.w> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4$emit$1 r0 = (com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4$emit$1 r0 = new com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4$emit$1
            r0.<init>(r8, r10)
        L_0x0018:
            r7 = r0
            java.lang.Object r10 = r7.result
            java.lang.Object r0 = yd.d.c()
            int r1 = r7.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x0058
            if (r1 == r6) goto L_0x0054
            if (r1 == r5) goto L_0x0050
            if (r1 == r4) goto L_0x004c
            if (r1 == r3) goto L_0x003f
            if (r1 != r2) goto L_0x0037
            sd.p.b(r10)
            goto L_0x00ff
        L_0x0037:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003f:
            java.lang.Object r9 = r7.L$1
            com.unity3d.ads.core.data.model.ShowEvent r9 = (com.unity3d.ads.core.data.model.ShowEvent) r9
            java.lang.Object r1 = r7.L$0
            com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4 r1 = (com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4) r1
            sd.p.b(r10)
            goto L_0x00d6
        L_0x004c:
            sd.p.b(r10)
            goto L_0x00b4
        L_0x0050:
            sd.p.b(r10)
            goto L_0x0090
        L_0x0054:
            sd.p.b(r10)
            goto L_0x0074
        L_0x0058:
            sd.p.b(r10)
            boolean r10 = r9 instanceof com.unity3d.ads.core.data.model.ShowEvent.Started
            if (r10 == 0) goto L_0x0077
            com.unity3d.ads.core.domain.LegacyShowUseCase r9 = r8.this$0
            long r1 = r8.$startTime
            oe.j$a r10 = oe.j.a.c(r1)
            java.lang.String r1 = r8.$placement
            com.unity3d.ads.core.data.model.Listeners r2 = r8.$listeners
            r7.label = r6
            java.lang.Object r9 = r9.showStarted(r10, r1, r2, r7)
            if (r9 != r0) goto L_0x0074
            return r0
        L_0x0074:
            sd.w r9 = sd.w.f38141a
            return r9
        L_0x0077:
            boolean r10 = r9 instanceof com.unity3d.ads.core.data.model.ShowEvent.Clicked
            if (r10 == 0) goto L_0x0093
            com.unity3d.ads.core.domain.LegacyShowUseCase r9 = r8.this$0
            long r1 = r8.$startTime
            oe.j$a r10 = oe.j.a.c(r1)
            java.lang.String r1 = r8.$placement
            com.unity3d.ads.core.data.model.Listeners r2 = r8.$listeners
            r7.label = r5
            java.lang.Object r9 = r9.showClicked(r10, r1, r2, r7)
            if (r9 != r0) goto L_0x0090
            return r0
        L_0x0090:
            sd.w r9 = sd.w.f38141a
            return r9
        L_0x0093:
            boolean r10 = r9 instanceof com.unity3d.ads.core.data.model.ShowEvent.Completed
            if (r10 == 0) goto L_0x00b7
            com.unity3d.ads.core.domain.LegacyShowUseCase r1 = r8.this$0
            long r2 = r8.$startTime
            oe.j$a r2 = oe.j.a.c(r2)
            java.lang.String r3 = r8.$placement
            com.unity3d.ads.core.data.model.ShowEvent$Completed r9 = (com.unity3d.ads.core.data.model.ShowEvent.Completed) r9
            com.unity3d.ads.adplayer.model.ShowStatus r9 = r9.getStatus()
            com.unity3d.ads.core.data.model.Listeners r5 = r8.$listeners
            r7.label = r4
            r4 = r9
            r6 = r7
            java.lang.Object r9 = r1.showCompleted(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L_0x00b4
            return r0
        L_0x00b4:
            sd.w r9 = sd.w.f38141a
            return r9
        L_0x00b7:
            boolean r10 = r9 instanceof com.unity3d.ads.core.data.model.ShowEvent.Error
            if (r10 == 0) goto L_0x0102
            com.unity3d.ads.core.domain.LegacyShowUseCase r10 = r8.this$0
            vb.h2 r1 = vb.h2.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED
            r4 = r9
            com.unity3d.ads.core.data.model.ShowEvent$Error r4 = (com.unity3d.ads.core.data.model.ShowEvent.Error) r4
            java.lang.String r4 = r4.getMessage()
            com.unity3d.ads.core.data.model.AdObject r5 = r8.$adObject
            r7.L$0 = r8
            r7.L$1 = r9
            r7.label = r3
            java.lang.Object r10 = r10.sendOperativeError(r1, r4, r5, r7)
            if (r10 != r0) goto L_0x00d5
            return r0
        L_0x00d5:
            r1 = r8
        L_0x00d6:
            fe.t<java.lang.String, com.unity3d.ads.UnityAds$UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, xd.d<? super sd.w>, java.lang.Object> r1 = r1.$reportShowError
            com.unity3d.ads.core.data.model.ShowEvent$Error r9 = (com.unity3d.ads.core.data.model.ShowEvent.Error) r9
            java.lang.String r10 = r9.getReason()
            com.unity3d.ads.UnityAds$UnityAdsShowError r3 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR
            java.lang.String r4 = r9.getMessage()
            int r5 = r9.getErrorCode()
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.b.c(r5)
            java.lang.String r6 = r9.getMessage()
            r9 = 0
            r7.L$0 = r9
            r7.L$1 = r9
            r7.label = r2
            r2 = r10
            java.lang.Object r9 = r1.invoke(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L_0x00ff
            return r0
        L_0x00ff:
            sd.w r9 = sd.w.f38141a
            return r9
        L_0x0102:
            boolean r10 = r9 instanceof com.unity3d.ads.core.data.model.ShowEvent.CancelTimeout
            if (r10 == 0) goto L_0x0112
            com.unity3d.ads.core.domain.LegacyShowUseCase r9 = r8.this$0
            long r0 = r8.$startTime
            oe.j$a r10 = oe.j.a.c(r0)
            r9.cancelTimeout(r10)
            goto L_0x0125
        L_0x0112:
            boolean r9 = r9 instanceof com.unity3d.ads.core.data.model.ShowEvent.LeftApplication
            if (r9 == 0) goto L_0x0125
            com.unity3d.ads.core.domain.LegacyShowUseCase r9 = r8.this$0
            long r0 = r8.$startTime
            oe.j$a r10 = oe.j.a.c(r0)
            java.lang.String r0 = r8.$placement
            com.unity3d.ads.core.data.model.Listeners r1 = r8.$listeners
            r9.bannerLeftApplication(r10, r0, r1)
        L_0x0125:
            sd.w r9 = sd.w.f38141a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4.emit(com.unity3d.ads.core.data.model.ShowEvent, xd.d):java.lang.Object");
    }
}
