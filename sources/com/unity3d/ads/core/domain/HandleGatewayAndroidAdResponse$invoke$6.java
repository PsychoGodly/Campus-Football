package com.unity3d.ads.core.domain;

import com.google.protobuf.i;
import com.unity3d.ads.adplayer.AdPlayer;
import fe.p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.z;
import pe.p0;
import sd.w;
import vb.s;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$6", f = "HandleGatewayAndroidAdResponse.kt", l = {182}, m = "invokeSuspend")
/* compiled from: HandleGatewayAndroidAdResponse.kt */
final class HandleGatewayAndroidAdResponse$invoke$6 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ z<AdPlayer> $adPlayer;
    final /* synthetic */ i $opportunityId;
    final /* synthetic */ s $response;
    final /* synthetic */ CancellationException $t;
    int label;
    final /* synthetic */ HandleGatewayAndroidAdResponse this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HandleGatewayAndroidAdResponse$invoke$6(HandleGatewayAndroidAdResponse handleGatewayAndroidAdResponse, CancellationException cancellationException, i iVar, s sVar, z<AdPlayer> zVar, d<? super HandleGatewayAndroidAdResponse$invoke$6> dVar) {
        super(2, dVar);
        this.this$0 = handleGatewayAndroidAdResponse;
        this.$t = cancellationException;
        this.$opportunityId = iVar;
        this.$response = sVar;
        this.$adPlayer = zVar;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new HandleGatewayAndroidAdResponse$invoke$6(this.this$0, this.$t, this.$opportunityId, this.$response, this.$adPlayer, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((HandleGatewayAndroidAdResponse$invoke$6) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            HandleGatewayAndroidAdResponse handleGatewayAndroidAdResponse = this.this$0;
            CancellationException cancellationException = this.$t;
            this.label = 1;
            if (handleGatewayAndroidAdResponse.cleanup(cancellationException, this.$opportunityId, this.$response, (AdPlayer) this.$adPlayer.f36055a, this) == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            sd.p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return w.f38141a;
    }
}
