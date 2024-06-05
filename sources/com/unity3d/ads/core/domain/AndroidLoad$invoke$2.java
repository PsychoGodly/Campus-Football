package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.i;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.LoadResult;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import wb.b;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.AndroidLoad$invoke$2", f = "AndroidLoad.kt", l = {53, 55, 60, 62, 85, 88}, m = "invokeSuspend")
/* compiled from: AndroidLoad.kt */
final class AndroidLoad$invoke$2 extends l implements p<p0, d<? super LoadResult>, Object> {
    final /* synthetic */ vb.p $bannerSize;
    final /* synthetic */ Context $context;
    final /* synthetic */ b $headerBiddingAdMarkup;
    final /* synthetic */ UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ i $opportunityId;
    final /* synthetic */ String $placement;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ AndroidLoad this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidLoad$invoke$2(AndroidLoad androidLoad, vb.p pVar, b bVar, String str, i iVar, UnityAdsLoadOptions unityAdsLoadOptions, Context context, d<? super AndroidLoad$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = androidLoad;
        this.$bannerSize = pVar;
        this.$headerBiddingAdMarkup = bVar;
        this.$placement = str;
        this.$opportunityId = iVar;
        this.$loadOptions = unityAdsLoadOptions;
        this.$context = context;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidLoad$invoke$2(this.this$0, this.$bannerSize, this.$headerBiddingAdMarkup, this.$placement, this.$opportunityId, this.$loadOptions, this.$context, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super LoadResult> dVar) {
        return ((AndroidLoad$invoke$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b9, code lost:
        r3 = r9.this$0.getRequestPolicy.invoke();
        r0 = r9.this$0.gatewayClient;
        r4 = com.unity3d.ads.core.data.model.OperationType.LOAD;
        r9.L$0 = r13;
        r9.I$0 = (int) r12;
        r9.label = 2;
        r0 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r0, (java.lang.String) null, (vb.t3) r0, r3, r4, r21, 1, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00de, code lost:
        if (r0 != r10) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e0, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e1, code lost:
        r1 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e2, code lost:
        r0 = ((vb.w3) r0).i0().h0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ec, code lost:
        r3 = r0;
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011a, code lost:
        r3 = r9.this$0.getRequestPolicy.invoke();
        r0 = r9.this$0.gatewayClient;
        r4 = com.unity3d.ads.core.data.model.OperationType.LOAD_HEADER_BIDDING;
        r9.L$0 = r13;
        r9.I$0 = (int) r12;
        r9.label = 4;
        r0 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r0, (java.lang.String) null, (vb.t3) r0, r3, r4, r21, 1, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x013f, code lost:
        if (r0 != r10) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0141, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0142, code lost:
        r1 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0143, code lost:
        r0 = (vb.w3) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0149, code lost:
        if (r0.j0() == false) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0165, code lost:
        return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, (java.lang.Throwable) null, "gateway", r0.g0().h0(), 4, (kotlin.jvm.internal.h) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0166, code lost:
        r0 = r0.i0().g0();
        r2 = r9.$headerBiddingAdMarkup;
        r3 = vb.q.f39060b;
        r4 = vb.s.v0();
        kotlin.jvm.internal.m.d(r4, "newBuilder()");
        r3 = r3.a(r4);
        r4 = r2.f0();
        kotlin.jvm.internal.m.d(r4, "headerBiddingAdMarkup.adData");
        r3.b(r4);
        r3.d(r2.g0());
        r2 = r0.k0();
        kotlin.jvm.internal.m.d(r2, "response.trackingToken");
        r3.h(r2);
        r2 = r0.i0();
        kotlin.jvm.internal.m.d(r2, "response.impressionConfiguration");
        r3.f(r2);
        r3.g(r0.j0());
        r2 = r0.l0();
        kotlin.jvm.internal.m.d(r2, "response.webviewConfiguration");
        r3.i(r2);
        r2 = r0.f0();
        kotlin.jvm.internal.m.d(r2, "response.adDataRefreshToken");
        r3.c(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01cd, code lost:
        if (r0.m0() == false) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01cf, code lost:
        r0 = r0.h0();
        kotlin.jvm.internal.m.d(r0, "response.error");
        r3.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01db, code lost:
        r0 = r3.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01e1, code lost:
        r0 = r9.this$0.handleGatewayAdResponse;
        r1 = r9.$loadOptions;
        r2 = r9.$opportunityId;
        kotlin.jvm.internal.m.d(r3, "response");
        r4 = r9.$context;
        r5 = r9.$placement;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01f4, code lost:
        if (r12 == 0) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01f6, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01f8, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01f9, code lost:
        r9.L$0 = null;
        r9.label = 5;
        r0 = r0.invoke(r1, r2, r3, r4, r5, r6, r7, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0205, code lost:
        if (r0 != r10) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0207, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0208, code lost:
        r0 = (com.unity3d.ads.core.data.model.LoadResult) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x020c, code lost:
        if ((r0 instanceof com.unity3d.ads.core.data.model.LoadResult.Success) == false) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x020e, code lost:
        r0 = r9.this$0.adRepository;
        r1 = r9.$opportunityId;
        r9.label = 6;
        r0 = r0.getAd(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x021d, code lost:
        if (r0 != r10) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x021f, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0220, code lost:
        r0 = (com.unity3d.ads.core.data.model.AdObject) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0222, code lost:
        if (r0 != null) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x023f, code lost:
        if ((r0 instanceof com.unity3d.ads.core.data.model.LoadResult.Failure) == false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0247, code lost:
        throw new sd.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.ads.core.data.model.LoadResult.MSG_AD_OBJECT, (java.lang.Throwable) null, "ad_object_not_found", (java.lang.String) null, 20, (kotlin.jvm.internal.h) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return new com.unity3d.ads.core.data.model.LoadResult.Success(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r9 = r21
            java.lang.Object r10 = yd.d.c()
            int r0 = r9.label
            r8 = 0
            r11 = 1
            switch(r0) {
                case 0: goto L_0x005c;
                case 1: goto L_0x004e;
                case 2: goto L_0x0040;
                case 3: goto L_0x0031;
                case 4: goto L_0x0023;
                case 5: goto L_0x001c;
                case 6: goto L_0x0015;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0015:
            sd.p.b(r22)
            r0 = r22
            goto L_0x0220
        L_0x001c:
            sd.p.b(r22)
            r0 = r22
            goto L_0x0208
        L_0x0023:
            int r0 = r9.I$0
            java.lang.Object r1 = r9.L$0
            vb.r0 r1 = (vb.r0) r1
            sd.p.b(r22)
            r12 = r0
            r0 = r22
            goto L_0x0143
        L_0x0031:
            int r0 = r9.I$0
            java.lang.Object r1 = r9.L$0
            vb.r0 r1 = (vb.r0) r1
            sd.p.b(r22)
            r12 = r0
            r13 = r1
            r0 = r22
            goto L_0x011a
        L_0x0040:
            int r0 = r9.I$0
            java.lang.Object r1 = r9.L$0
            vb.r0 r1 = (vb.r0) r1
            sd.p.b(r22)
            r12 = r0
            r0 = r22
            goto L_0x00e2
        L_0x004e:
            int r0 = r9.I$0
            java.lang.Object r1 = r9.L$0
            vb.r0 r1 = (vb.r0) r1
            sd.p.b(r22)
            r12 = r0
            r13 = r1
            r0 = r22
            goto L_0x00b9
        L_0x005c:
            sd.p.b(r22)
            com.unity3d.ads.core.domain.AndroidLoad r0 = r9.this$0
            com.unity3d.ads.core.data.repository.SessionRepository r0 = r0.sessionRepository
            boolean r0 = r0.isSdkInitialized()
            if (r0 != 0) goto L_0x007e
            com.unity3d.ads.core.data.model.LoadResult$Failure r0 = new com.unity3d.ads.core.data.model.LoadResult$Failure
            com.unity3d.ads.UnityAds$UnityAdsLoadError r13 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 22
            r19 = 0
            java.lang.String r16 = "not_initialized"
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            return r0
        L_0x007e:
            vb.p r0 = r9.$bannerSize
            if (r0 == 0) goto L_0x0084
            r0 = 1
            goto L_0x0085
        L_0x0084:
            r0 = 0
        L_0x0085:
            if (r0 == 0) goto L_0x008a
            vb.r0 r1 = vb.r0.DIAGNOSTIC_AD_TYPE_BANNER
            goto L_0x008c
        L_0x008a:
            vb.r0 r1 = vb.r0.DIAGNOSTIC_AD_TYPE_FULLSCREEN
        L_0x008c:
            wb.b r2 = r9.$headerBiddingAdMarkup
            com.google.protobuf.i r2 = r2.f0()
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r11
            if (r2 != 0) goto L_0x00f0
            com.unity3d.ads.core.domain.AndroidLoad r3 = r9.this$0
            r3.incrementLoadRequestCount(r0)
            com.unity3d.ads.core.domain.AndroidLoad r0 = r9.this$0
            com.unity3d.ads.core.domain.GetAdRequest r0 = r0.getAdRequest
            java.lang.String r3 = r9.$placement
            com.google.protobuf.i r4 = r9.$opportunityId
            vb.p r5 = r9.$bannerSize
            r9.L$0 = r1
            r9.I$0 = r2
            r9.label = r11
            java.lang.Object r0 = r0.invoke(r3, r4, r5, r9)
            if (r0 != r10) goto L_0x00b7
            return r10
        L_0x00b7:
            r13 = r1
            r12 = r2
        L_0x00b9:
            r2 = r0
            vb.t3 r2 = (vb.t3) r2
            com.unity3d.ads.core.domain.AndroidLoad r0 = r9.this$0
            com.unity3d.ads.core.domain.GetRequestPolicy r0 = r0.getRequestPolicy
            com.unity3d.ads.gatewayclient.RequestPolicy r3 = r0.invoke()
            com.unity3d.ads.core.domain.AndroidLoad r0 = r9.this$0
            com.unity3d.ads.gatewayclient.GatewayClient r0 = r0.gatewayClient
            r1 = 0
            com.unity3d.ads.core.data.model.OperationType r4 = com.unity3d.ads.core.data.model.OperationType.LOAD
            r6 = 1
            r7 = 0
            r9.L$0 = r13
            r9.I$0 = r12
            r5 = 2
            r9.label = r5
            r5 = r21
            java.lang.Object r0 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r10) goto L_0x00e1
            return r10
        L_0x00e1:
            r1 = r13
        L_0x00e2:
            vb.w3 r0 = (vb.w3) r0
            vb.w3$b r0 = r0.i0()
            vb.s r0 = r0.h0()
        L_0x00ec:
            r3 = r0
            r6 = r1
            goto L_0x01e1
        L_0x00f0:
            com.unity3d.ads.core.domain.AndroidLoad r3 = r9.this$0
            r3.incrementLoadRequestAdmCount(r0)
            com.unity3d.ads.core.domain.AndroidLoad r0 = r9.this$0
            com.unity3d.ads.core.domain.GetAdPlayerConfigRequest r0 = r0.getAdPlayerConfigRequest
            java.lang.String r3 = r9.$placement
            com.google.protobuf.i r4 = r9.$opportunityId
            wb.b r5 = r9.$headerBiddingAdMarkup
            com.google.protobuf.i r5 = r5.h0()
            java.lang.String r6 = "headerBiddingAdMarkup.configurationToken"
            kotlin.jvm.internal.m.d(r5, r6)
            r9.L$0 = r1
            r9.I$0 = r2
            r6 = 3
            r9.label = r6
            java.lang.Object r0 = r0.invoke(r3, r4, r5, r9)
            if (r0 != r10) goto L_0x0118
            return r10
        L_0x0118:
            r13 = r1
            r12 = r2
        L_0x011a:
            r2 = r0
            vb.t3 r2 = (vb.t3) r2
            com.unity3d.ads.core.domain.AndroidLoad r0 = r9.this$0
            com.unity3d.ads.core.domain.GetRequestPolicy r0 = r0.getRequestPolicy
            com.unity3d.ads.gatewayclient.RequestPolicy r3 = r0.invoke()
            com.unity3d.ads.core.domain.AndroidLoad r0 = r9.this$0
            com.unity3d.ads.gatewayclient.GatewayClient r0 = r0.gatewayClient
            r1 = 0
            com.unity3d.ads.core.data.model.OperationType r4 = com.unity3d.ads.core.data.model.OperationType.LOAD_HEADER_BIDDING
            r6 = 1
            r7 = 0
            r9.L$0 = r13
            r9.I$0 = r12
            r5 = 4
            r9.label = r5
            r5 = r21
            java.lang.Object r0 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r10) goto L_0x0142
            return r10
        L_0x0142:
            r1 = r13
        L_0x0143:
            vb.w3 r0 = (vb.w3) r0
            boolean r2 = r0.j0()
            if (r2 == 0) goto L_0x0166
            com.unity3d.ads.core.data.model.LoadResult$Failure r1 = new com.unity3d.ads.core.data.model.LoadResult$Failure
            com.unity3d.ads.UnityAds$UnityAdsLoadError r14 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR
            r16 = 0
            vb.d1 r0 = r0.g0()
            java.lang.String r18 = r0.h0()
            r19 = 4
            r20 = 0
            java.lang.String r15 = "Internal error"
            java.lang.String r17 = "gateway"
            r13 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x0166:
            vb.w3$b r0 = r0.i0()
            vb.k r0 = r0.g0()
            wb.b r2 = r9.$headerBiddingAdMarkup
            vb.q$a r3 = vb.q.f39060b
            vb.s$a r4 = vb.s.v0()
            java.lang.String r5 = "newBuilder()"
            kotlin.jvm.internal.m.d(r4, r5)
            vb.q r3 = r3.a(r4)
            com.google.protobuf.i r4 = r2.f0()
            java.lang.String r5 = "headerBiddingAdMarkup.adData"
            kotlin.jvm.internal.m.d(r4, r5)
            r3.b(r4)
            int r2 = r2.g0()
            r3.d(r2)
            com.google.protobuf.i r2 = r0.k0()
            java.lang.String r4 = "response.trackingToken"
            kotlin.jvm.internal.m.d(r2, r4)
            r3.h(r2)
            com.google.protobuf.i r2 = r0.i0()
            java.lang.String r4 = "response.impressionConfiguration"
            kotlin.jvm.internal.m.d(r2, r4)
            r3.f(r2)
            int r2 = r0.j0()
            r3.g(r2)
            vb.y3 r2 = r0.l0()
            java.lang.String r4 = "response.webviewConfiguration"
            kotlin.jvm.internal.m.d(r2, r4)
            r3.i(r2)
            com.google.protobuf.i r2 = r0.f0()
            java.lang.String r4 = "response.adDataRefreshToken"
            kotlin.jvm.internal.m.d(r2, r4)
            r3.c(r2)
            boolean r2 = r0.m0()
            if (r2 == 0) goto L_0x01db
            vb.d1 r0 = r0.h0()
            java.lang.String r2 = "response.error"
            kotlin.jvm.internal.m.d(r0, r2)
            r3.e(r0)
        L_0x01db:
            vb.s r0 = r3.a()
            goto L_0x00ec
        L_0x01e1:
            com.unity3d.ads.core.domain.AndroidLoad r0 = r9.this$0
            com.unity3d.ads.core.domain.HandleGatewayAdResponse r0 = r0.handleGatewayAdResponse
            com.unity3d.ads.UnityAdsLoadOptions r1 = r9.$loadOptions
            com.google.protobuf.i r2 = r9.$opportunityId
            java.lang.String r4 = "response"
            kotlin.jvm.internal.m.d(r3, r4)
            android.content.Context r4 = r9.$context
            java.lang.String r5 = r9.$placement
            if (r12 == 0) goto L_0x01f8
            r7 = 1
            goto L_0x01f9
        L_0x01f8:
            r7 = 0
        L_0x01f9:
            r8 = 0
            r9.L$0 = r8
            r8 = 5
            r9.label = r8
            r8 = r21
            java.lang.Object r0 = r0.invoke(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r10) goto L_0x0208
            return r10
        L_0x0208:
            com.unity3d.ads.core.data.model.LoadResult r0 = (com.unity3d.ads.core.data.model.LoadResult) r0
            boolean r1 = r0 instanceof com.unity3d.ads.core.data.model.LoadResult.Success
            if (r1 == 0) goto L_0x023d
            com.unity3d.ads.core.domain.AndroidLoad r0 = r9.this$0
            com.unity3d.ads.core.data.repository.AdRepository r0 = r0.adRepository
            com.google.protobuf.i r1 = r9.$opportunityId
            r2 = 6
            r9.label = r2
            java.lang.Object r0 = r0.getAd(r1, r9)
            if (r0 != r10) goto L_0x0220
            return r10
        L_0x0220:
            com.unity3d.ads.core.data.model.AdObject r0 = (com.unity3d.ads.core.data.model.AdObject) r0
            if (r0 != 0) goto L_0x0236
            com.unity3d.ads.core.data.model.LoadResult$Failure r0 = new com.unity3d.ads.core.data.model.LoadResult$Failure
            com.unity3d.ads.UnityAds$UnityAdsLoadError r2 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR
            r4 = 0
            r6 = 0
            r7 = 20
            r8 = 0
            java.lang.String r3 = "[UnityAds] Ad not found"
            java.lang.String r5 = "ad_object_not_found"
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0241
        L_0x0236:
            com.unity3d.ads.core.data.model.LoadResult$Success r1 = new com.unity3d.ads.core.data.model.LoadResult$Success
            r1.<init>(r0)
            r0 = r1
            goto L_0x0241
        L_0x023d:
            boolean r1 = r0 instanceof com.unity3d.ads.core.data.model.LoadResult.Failure
            if (r1 == 0) goto L_0x0242
        L_0x0241:
            return r0
        L_0x0242:
            sd.l r0 = new sd.l
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
