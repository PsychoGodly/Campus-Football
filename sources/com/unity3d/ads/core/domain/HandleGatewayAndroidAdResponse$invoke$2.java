package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayer;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import sd.w;
import vb.v;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$2", f = "HandleGatewayAndroidAdResponse.kt", l = {123}, m = "invokeSuspend")
/* compiled from: HandleGatewayAndroidAdResponse.kt */
final class HandleGatewayAndroidAdResponse$invoke$2 extends l implements p<v, d<? super w>, Object> {
    final /* synthetic */ z<AdPlayer> $adPlayer;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HandleGatewayAndroidAdResponse$invoke$2(z<AdPlayer> zVar, d<? super HandleGatewayAndroidAdResponse$invoke$2> dVar) {
        super(2, dVar);
        this.$adPlayer = zVar;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        HandleGatewayAndroidAdResponse$invoke$2 handleGatewayAndroidAdResponse$invoke$2 = new HandleGatewayAndroidAdResponse$invoke$2(this.$adPlayer, dVar);
        handleGatewayAndroidAdResponse$invoke$2.L$0 = obj;
        return handleGatewayAndroidAdResponse$invoke$2;
    }

    public final Object invoke(v vVar, d<? super w> dVar) {
        return ((HandleGatewayAndroidAdResponse$invoke$2) create(vVar, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            byte[] i11 = ((v) this.L$0).i();
            m.d(i11, "it.toByteArray()");
            this.label = 1;
            if (((AdPlayer) this.$adPlayer.f36055a).onAllowedPiiChange(i11, this) == c10) {
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
