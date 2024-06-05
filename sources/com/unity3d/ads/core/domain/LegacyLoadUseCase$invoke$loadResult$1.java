package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.LoadResult;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1", f = "LegacyLoadUseCase.kt", l = {110, 128, 135, 136}, m = "invokeSuspend")
/* compiled from: LegacyLoadUseCase.kt */
final class LegacyLoadUseCase$invoke$loadResult$1 extends l implements p<p0, d<? super LoadResult>, Object> {
    final /* synthetic */ String $adMarkup;
    final /* synthetic */ Context $context;
    final /* synthetic */ vb.p $gatewayBannerSize;
    final /* synthetic */ UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ String $placement;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LegacyLoadUseCase this$0;

    /* compiled from: LegacyLoadUseCase.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.unity3d.ads.core.data.model.InitializationState[] r0 = com.unity3d.ads.core.data.model.InitializationState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.unity3d.ads.core.data.model.InitializationState r1 = com.unity3d.ads.core.data.model.InitializationState.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.unity3d.ads.core.data.model.InitializationState r1 = com.unity3d.ads.core.data.model.InitializationState.FAILED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.unity3d.ads.core.data.model.InitializationState r1 = com.unity3d.ads.core.data.model.InitializationState.NOT_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.unity3d.ads.core.data.model.InitializationState r1 = com.unity3d.ads.core.data.model.InitializationState.INITIALIZING     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LegacyLoadUseCase$invoke$loadResult$1(String str, LegacyLoadUseCase legacyLoadUseCase, UnityAdsLoadOptions unityAdsLoadOptions, String str2, Context context, vb.p pVar, d<? super LegacyLoadUseCase$invoke$loadResult$1> dVar) {
        super(2, dVar);
        this.$placement = str;
        this.this$0 = legacyLoadUseCase;
        this.$loadOptions = unityAdsLoadOptions;
        this.$adMarkup = str2;
        this.$context = context;
        this.$gatewayBannerSize = pVar;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new LegacyLoadUseCase$invoke$loadResult$1(this.$placement, this.this$0, this.$loadOptions, this.$adMarkup, this.$context, this.$gatewayBannerSize, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super LoadResult> dVar) {
        return ((LegacyLoadUseCase$invoke$loadResult$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r8 = r22
            java.lang.Object r9 = yd.d.c()
            int r0 = r8.label
            r6 = 0
            r7 = 4
            r1 = 3
            r10 = 2
            r11 = 1
            if (r0 == 0) goto L_0x0049
            if (r0 == r11) goto L_0x003e
            if (r0 == r10) goto L_0x0037
            if (r0 == r1) goto L_0x0026
            if (r0 != r7) goto L_0x001e
            sd.p.b(r23)
            r0 = r23
            goto L_0x0167
        L_0x001e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0026:
            java.lang.Object r0 = r8.L$1
            wb.b r0 = (wb.b) r0
            java.lang.Object r1 = r8.L$0
            com.google.protobuf.i r1 = (com.google.protobuf.i) r1
            sd.p.b(r23)
            r4 = r0
            r3 = r1
            r0 = r23
            goto L_0x011b
        L_0x0037:
            sd.p.b(r23)
            r0 = r23
            goto L_0x01a1
        L_0x003e:
            java.lang.Object r0 = r8.L$0
            com.google.protobuf.i r0 = (com.google.protobuf.i) r0
            sd.p.b(r23)
            r2 = r23
        L_0x0047:
            r12 = r0
            goto L_0x00a5
        L_0x0049:
            sd.p.b(r23)
            java.lang.String r0 = r8.$placement
            if (r0 != 0) goto L_0x0064
            com.unity3d.ads.core.data.model.LoadResult$Failure r0 = new com.unity3d.ads.core.data.model.LoadResult$Failure
            com.unity3d.ads.UnityAds$UnityAdsLoadError r13 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT
            r15 = 0
            r17 = 0
            r18 = 20
            r19 = 0
            java.lang.String r14 = "[UnityAds] Placement ID cannot be null"
            java.lang.String r16 = "placement_null"
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            return r0
        L_0x0064:
            com.unity3d.ads.core.domain.LegacyLoadUseCase r0 = r8.this$0
            com.unity3d.ads.UnityAdsLoadOptions r2 = r8.$loadOptions
            java.lang.String r0 = r0.getOpportunityId(r2)
            if (r0 != 0) goto L_0x0082
            com.unity3d.ads.core.data.model.LoadResult$Failure r0 = new com.unity3d.ads.core.data.model.LoadResult$Failure
            com.unity3d.ads.UnityAds$UnityAdsLoadError r13 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT
            r15 = 0
            r17 = 0
            r18 = 20
            r19 = 0
            java.lang.String r14 = "[UnityAds] Object ID cannot be null"
            java.lang.String r16 = "no_opportunity_id"
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            return r0
        L_0x0082:
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            java.lang.String r2 = "fromString(opportunityId)"
            kotlin.jvm.internal.m.d(r0, r2)
            com.google.protobuf.i r0 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(r0)
            com.unity3d.ads.core.domain.LegacyLoadUseCase r2 = r8.this$0
            r2.opportunity = r0
            com.unity3d.ads.core.domain.LegacyLoadUseCase r2 = r8.this$0
            com.unity3d.ads.core.data.repository.AdRepository r2 = r2.adRepository
            r8.L$0 = r0
            r8.label = r11
            java.lang.Object r2 = r2.hasOpportunityId(r0, r8)
            if (r2 != r9) goto L_0x0047
            return r9
        L_0x00a5:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 == 0) goto L_0x00c0
            com.unity3d.ads.core.data.model.LoadResult$Failure r13 = new com.unity3d.ads.core.data.model.LoadResult$Failure
            com.unity3d.ads.UnityAds$UnityAdsLoadError r14 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT
            r16 = 0
            r18 = 0
            r19 = 20
            r20 = 0
            java.lang.String r15 = "[UnityAds] Object ID already used"
            java.lang.String r17 = "opportunity_id_used"
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
        L_0x00c0:
            com.unity3d.ads.core.domain.LegacyLoadUseCase r0 = r8.this$0
            java.lang.String r2 = r8.$adMarkup
            wb.b r13 = r0.getHeaderBiddingAdMarkup(r2)
            if (r13 != 0) goto L_0x00e5
            com.unity3d.ads.core.data.model.LoadResult$Failure r0 = new com.unity3d.ads.core.data.model.LoadResult$Failure
            com.unity3d.ads.UnityAds$UnityAdsLoadError r15 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR
            r17 = 0
            java.lang.String r1 = r8.$adMarkup
            if (r1 != 0) goto L_0x00d6
            java.lang.String r1 = ""
        L_0x00d6:
            r19 = r1
            r20 = 4
            r21 = 0
            java.lang.String r16 = "[UnityAds] Could not parse Ad Markup"
            java.lang.String r18 = "invalid_admarkup"
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            return r0
        L_0x00e5:
            com.unity3d.ads.core.domain.LegacyLoadUseCase r0 = r8.this$0
            com.unity3d.ads.core.domain.GetInitializationState r0 = r0.getInitializationState
            com.unity3d.ads.core.data.model.InitializationState r0 = r0.invoke()
            int[] r2 = com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r2[r0]
            if (r0 == r11) goto L_0x0183
            if (r0 == r10) goto L_0x0170
            if (r0 == r1) goto L_0x0170
            if (r0 != r7) goto L_0x016a
            com.unity3d.ads.core.domain.LegacyLoadUseCase r0 = r8.this$0
            com.unity3d.ads.core.domain.AwaitInitialization r0 = r0.awaitInitialization
            r2 = 0
            r4 = 1
            r5 = 0
            r8.L$0 = r12
            r8.L$1 = r13
            r8.label = r1
            r1 = r2
            r3 = r22
            java.lang.Object r0 = com.unity3d.ads.core.domain.AwaitInitialization.DefaultImpls.invoke$default(r0, r1, r3, r4, r5)
            if (r0 != r9) goto L_0x0119
            return r9
        L_0x0119:
            r3 = r12
            r4 = r13
        L_0x011b:
            com.unity3d.ads.core.data.model.InitializationState r0 = (com.unity3d.ads.core.data.model.InitializationState) r0
            if (r0 != 0) goto L_0x0121
            r0 = -1
            goto L_0x0129
        L_0x0121:
            int[] r1 = com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L_0x0129:
            if (r0 == r11) goto L_0x0149
            if (r0 != r10) goto L_0x0141
            com.unity3d.ads.core.data.model.LoadResult$Failure r0 = new com.unity3d.ads.core.data.model.LoadResult$Failure
            com.unity3d.ads.UnityAds$UnityAdsLoadError r13 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED
            r15 = 0
            r17 = 0
            r18 = 20
            r19 = 0
            java.lang.String r14 = "[UnityAds] SDK not initialized"
            java.lang.String r16 = "not_initialized"
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x01a3
        L_0x0141:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "awaitInitialization timeout"
            r0.<init>(r1)
            throw r0
        L_0x0149:
            com.unity3d.ads.core.domain.LegacyLoadUseCase r0 = r8.this$0
            com.unity3d.ads.core.domain.Load r0 = r0.load
            android.content.Context r1 = r8.$context
            java.lang.String r2 = r8.$placement
            vb.p r5 = r8.$gatewayBannerSize
            com.unity3d.ads.UnityAdsLoadOptions r10 = r8.$loadOptions
            r8.L$0 = r6
            r8.L$1 = r6
            r8.label = r7
            r6 = r10
            r7 = r22
            java.lang.Object r0 = r0.invoke(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r9) goto L_0x0167
            return r9
        L_0x0167:
            com.unity3d.ads.core.data.model.LoadResult r0 = (com.unity3d.ads.core.data.model.LoadResult) r0
            goto L_0x01a3
        L_0x016a:
            sd.l r0 = new sd.l
            r0.<init>()
            throw r0
        L_0x0170:
            com.unity3d.ads.core.data.model.LoadResult$Failure r0 = new com.unity3d.ads.core.data.model.LoadResult$Failure
            com.unity3d.ads.UnityAds$UnityAdsLoadError r10 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED
            r12 = 0
            r14 = 0
            r15 = 20
            r16 = 0
            java.lang.String r11 = "[UnityAds] SDK not initialized"
            java.lang.String r13 = "not_initialized"
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r0
        L_0x0183:
            com.unity3d.ads.core.domain.LegacyLoadUseCase r0 = r8.this$0
            com.unity3d.ads.core.domain.Load r0 = r0.load
            android.content.Context r1 = r8.$context
            java.lang.String r2 = r8.$placement
            vb.p r5 = r8.$gatewayBannerSize
            com.unity3d.ads.UnityAdsLoadOptions r7 = r8.$loadOptions
            r8.L$0 = r6
            r8.label = r10
            r3 = r12
            r4 = r13
            r6 = r7
            r7 = r22
            java.lang.Object r0 = r0.invoke(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r9) goto L_0x01a1
            return r9
        L_0x01a1:
            com.unity3d.ads.core.data.model.LoadResult r0 = (com.unity3d.ads.core.data.model.LoadResult) r0
        L_0x01a3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
