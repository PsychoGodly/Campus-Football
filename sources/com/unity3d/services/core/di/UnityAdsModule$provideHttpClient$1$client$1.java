package com.unity3d.services.core.di;

import android.content.Context;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.HttpClient;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.di.UnityAdsModule$provideHttpClient$1$client$1", f = "UnityAdsModule.kt", l = {475}, m = "invokeSuspend")
/* compiled from: UnityAdsModule.kt */
final class UnityAdsModule$provideHttpClient$1$client$1 extends l implements p<p0, d<? super HttpClient>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ISDKDispatchers $dispatchers;
    int label;
    final /* synthetic */ UnityAdsModule this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UnityAdsModule$provideHttpClient$1$client$1(UnityAdsModule unityAdsModule, Context context, ISDKDispatchers iSDKDispatchers, d<? super UnityAdsModule$provideHttpClient$1$client$1> dVar) {
        super(2, dVar);
        this.this$0 = unityAdsModule;
        this.$context = context;
        this.$dispatchers = iSDKDispatchers;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new UnityAdsModule$provideHttpClient$1$client$1(this.this$0, this.$context, this.$dispatchers, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super HttpClient> dVar) {
        return ((UnityAdsModule$provideHttpClient$1$client$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            UnityAdsModule unityAdsModule = this.this$0;
            Context context = this.$context;
            ISDKDispatchers iSDKDispatchers = this.$dispatchers;
            this.label = 1;
            obj = unityAdsModule.buildNetworkClient(context, iSDKDispatchers, this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            sd.p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
