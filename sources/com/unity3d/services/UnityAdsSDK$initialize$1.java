package com.unity3d.services;

import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.services.core.domain.task.EmptyParams;
import com.unity3d.services.core.domain.task.InitializeSDK;
import fe.p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import pe.q0;
import sd.o;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.UnityAdsSDK$initialize$1", f = "UnityAdsSDK.kt", l = {79, 81}, m = "invokeSuspend")
/* compiled from: UnityAdsSDK.kt */
final class UnityAdsSDK$initialize$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ p0 $initScope;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UnityAdsSDK$initialize$1(p0 p0Var, d<? super UnityAdsSDK$initialize$1> dVar) {
        super(2, dVar);
        this.$initScope = p0Var;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new UnityAdsSDK$initialize$1(this.$initScope, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((UnityAdsSDK$initialize$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            UnityAdsSDK unityAdsSDK = UnityAdsSDK.INSTANCE;
            if (unityAdsSDK.getAlternativeFlowReader().invoke()) {
                InitializeBoldSDK access$getInitializeBoldSDK = unityAdsSDK.getInitializeBoldSDK();
                this.label = 1;
                if (access$getInitializeBoldSDK.invoke(this) == c10) {
                    return c10;
                }
            } else {
                InitializeSDK access$getInitializeSDK = unityAdsSDK.getInitializeSDK();
                EmptyParams emptyParams = EmptyParams.INSTANCE;
                this.label = 2;
                if (access$getInitializeSDK.m65invokegIAlus(emptyParams, this) == c10) {
                    return c10;
                }
            }
        } else if (i10 == 1) {
            sd.p.b(obj);
        } else if (i10 == 2) {
            sd.p.b(obj);
            ((o) obj).i();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q0.d(this.$initScope, (CancellationException) null, 1, (Object) null);
        return w.f38141a;
    }
}
