package com.unity3d.ads.core.domain;

import com.google.protobuf.i;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import sd.n;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$3", f = "HandleGatewayAndroidAdResponse.kt", l = {}, m = "invokeSuspend")
/* compiled from: HandleGatewayAndroidAdResponse.kt */
final class HandleGatewayAndroidAdResponse$invoke$3 extends l implements p<n<? extends byte[], ? extends Integer>, d<? super w>, Object> {
    final /* synthetic */ i $opportunityId;
    final /* synthetic */ String $placementId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HandleGatewayAndroidAdResponse this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HandleGatewayAndroidAdResponse$invoke$3(HandleGatewayAndroidAdResponse handleGatewayAndroidAdResponse, i iVar, String str, d<? super HandleGatewayAndroidAdResponse$invoke$3> dVar) {
        super(2, dVar);
        this.this$0 = handleGatewayAndroidAdResponse;
        this.$opportunityId = iVar;
        this.$placementId = str;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        HandleGatewayAndroidAdResponse$invoke$3 handleGatewayAndroidAdResponse$invoke$3 = new HandleGatewayAndroidAdResponse$invoke$3(this.this$0, this.$opportunityId, this.$placementId, dVar);
        handleGatewayAndroidAdResponse$invoke$3.L$0 = obj;
        return handleGatewayAndroidAdResponse$invoke$3;
    }

    public final Object invoke(n<byte[], Integer> nVar, d<? super w> dVar) {
        return ((HandleGatewayAndroidAdResponse$invoke$3) create(nVar, dVar)).invokeSuspend(w.f38141a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0052, code lost:
        if (r1 != null) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object unused = yd.d.c()
            int r0 = r6.label
            if (r0 != 0) goto L_0x0091
            sd.p.b(r7)
            java.lang.Object r7 = r6.L$0
            sd.n r7 = (sd.n) r7
            java.lang.Object r0 = r7.a()
            byte[] r0 = (byte[]) r0
            java.lang.Object r7 = r7.b()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse r1 = r6.this$0
            com.unity3d.ads.core.data.repository.CampaignRepository r1 = r1.campaignRepository
            com.google.protobuf.i r2 = r6.$opportunityId
            vb.a0 r1 = r1.getCampaign(r2)
            if (r1 == 0) goto L_0x0055
            vb.x$a r2 = vb.x.f39110b
            com.google.protobuf.z$a r1 = r1.b()
            java.lang.String r3 = "this.toBuilder()"
            kotlin.jvm.internal.m.d(r1, r3)
            vb.a0$a r1 = (vb.a0.a) r1
            vb.x r1 = r2.a(r1)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = ne.c.f36517g
            r2.<init>(r0, r3)
            com.google.protobuf.i r2 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64(r2)
            r1.b(r2)
            r1.c(r7)
            vb.a0 r1 = r1.a()
            if (r1 == 0) goto L_0x0055
            goto L_0x0083
        L_0x0055:
            java.lang.String r1 = r6.$placementId
            com.google.protobuf.i r2 = r6.$opportunityId
            vb.x$a r3 = vb.x.f39110b
            vb.a0$a r4 = vb.a0.m0()
            java.lang.String r5 = "newBuilder()"
            kotlin.jvm.internal.m.d(r4, r5)
            vb.x r3 = r3.a(r4)
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r5 = ne.c.f36517g
            r4.<init>(r0, r5)
            com.google.protobuf.i r0 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64(r4)
            r3.b(r0)
            r3.c(r7)
            r3.f(r1)
            r3.d(r2)
            vb.a0 r1 = r3.a()
        L_0x0083:
            com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse r7 = r6.this$0
            com.unity3d.ads.core.data.repository.CampaignRepository r7 = r7.campaignRepository
            com.google.protobuf.i r0 = r6.$opportunityId
            r7.setCampaign(r0, r1)
            sd.w r7 = sd.w.f38141a
            return r7
        L_0x0091:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
