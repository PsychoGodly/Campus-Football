package com.unity3d.services.core.di;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.h;
import pe.p0;
import sd.o;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.di.UnityAdsModule$provideHttpClient$1$config$1", f = "UnityAdsModule.kt", l = {482}, m = "invokeSuspend")
/* compiled from: UnityAdsModule.kt */
final class UnityAdsModule$provideHttpClient$1$config$1 extends l implements p<p0, d<? super Configuration>, Object> {
    final /* synthetic */ ConfigFileFromLocalStorage $configFileFromLocalStorage;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UnityAdsModule$provideHttpClient$1$config$1(ConfigFileFromLocalStorage configFileFromLocalStorage, d<? super UnityAdsModule$provideHttpClient$1$config$1> dVar) {
        super(2, dVar);
        this.$configFileFromLocalStorage = configFileFromLocalStorage;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        UnityAdsModule$provideHttpClient$1$config$1 unityAdsModule$provideHttpClient$1$config$1 = new UnityAdsModule$provideHttpClient$1$config$1(this.$configFileFromLocalStorage, dVar);
        unityAdsModule$provideHttpClient$1$config$1.L$0 = obj;
        return unityAdsModule$provideHttpClient$1$config$1;
    }

    public final Object invoke(p0 p0Var, d<? super Configuration> dVar) {
        return ((UnityAdsModule$provideHttpClient$1$config$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        Object c10 = d.c();
        int i10 = this.label;
        Configuration configuration = null;
        if (i10 == 0) {
            sd.p.b(obj);
            p0 p0Var = (p0) this.L$0;
            ConfigFileFromLocalStorage configFileFromLocalStorage = this.$configFileFromLocalStorage;
            o.a aVar = o.f38128b;
            ConfigFileFromLocalStorage.Params params = new ConfigFileFromLocalStorage.Params((Configuration) null, 1, (h) null);
            this.label = 1;
            obj3 = configFileFromLocalStorage.m65invokegIAlus(params, this);
            if (obj3 == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            try {
                sd.p.b(obj);
                obj3 = ((o) obj).i();
            } catch (Throwable th) {
                o.a aVar2 = o.f38128b;
                obj2 = o.b(sd.p.a(th));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = o.b(o.a(obj3));
        if (o.f(obj2)) {
            obj2 = null;
        }
        o oVar = (o) obj2;
        if (oVar == null) {
            return null;
        }
        Object i11 = oVar.i();
        if (!o.f(i11)) {
            configuration = i11;
        }
        return configuration;
    }
}
