package com.unity3d.services;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import fe.p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import pe.q0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.UnityAdsSDK$finishOMIDSession$1", f = "UnityAdsSDK.kt", l = {170, 171}, m = "invokeSuspend")
/* compiled from: UnityAdsSDK.kt */
final class UnityAdsSDK$finishOMIDSession$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ p0 $omidScope;
    final /* synthetic */ String $opportunityId;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UnityAdsSDK$finishOMIDSession$1(String str, p0 p0Var, d<? super UnityAdsSDK$finishOMIDSession$1> dVar) {
        super(2, dVar);
        this.$opportunityId = str;
        this.$omidScope = p0Var;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new UnityAdsSDK$finishOMIDSession$1(this.$opportunityId, this.$omidScope, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((UnityAdsSDK$finishOMIDSession$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            UnityAdsSDK unityAdsSDK = UnityAdsSDK.INSTANCE;
            if (unityAdsSDK.getAlternativeFlowReader().invoke()) {
                GetAdObject access$getGetAdObject = unityAdsSDK.getGetAdObject();
                String str = this.$opportunityId;
                this.label = 1;
                obj = access$getGetAdObject.invoke(str, this);
                if (obj == c10) {
                    return c10;
                }
            }
            q0.d(this.$omidScope, (CancellationException) null, 1, (Object) null);
            return w.f38141a;
        } else if (i10 == 1) {
            sd.p.b(obj);
        } else if (i10 == 2) {
            sd.p.b(obj);
            q0.d(this.$omidScope, (CancellationException) null, 1, (Object) null);
            return w.f38141a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AdObject adObject = (AdObject) obj;
        if (adObject != null) {
            OmFinishSession access$getOmFinishSession = UnityAdsSDK.INSTANCE.getOmFinishSession();
            this.label = 2;
            if (access$getOmFinishSession.invoke(adObject, this) == c10) {
                return c10;
            }
        }
        q0.d(this.$omidScope, (CancellationException) null, 1, (Object) null);
        return w.f38141a;
    }
}
