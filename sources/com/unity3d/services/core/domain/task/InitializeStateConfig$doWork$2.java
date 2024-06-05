package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import fe.p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.o;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateConfig$doWork$2", f = "InitializeStateConfig.kt", l = {30}, m = "invokeSuspend")
/* compiled from: InitializeStateConfig.kt */
final class InitializeStateConfig$doWork$2 extends l implements p<p0, d<? super o<? extends Configuration>>, Object> {
    final /* synthetic */ InitializeStateConfig.Params $params;
    int label;
    final /* synthetic */ InitializeStateConfig this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateConfig$doWork$2(InitializeStateConfig.Params params, InitializeStateConfig initializeStateConfig, d<? super InitializeStateConfig$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
        this.this$0 = initializeStateConfig;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeStateConfig$doWork$2(this.$params, this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super o<? extends Configuration>> dVar) {
        return ((InitializeStateConfig$doWork$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            InitializeStateConfig.Params params = this.$params;
            InitializeStateConfig initializeStateConfig = this.this$0;
            o.a aVar = o.f38128b;
            DeviceLog.info("Unity Ads init: load configuration from " + SdkProperties.getConfigUrl());
            Configuration configuration = new Configuration(SdkProperties.getConfigUrl(), params.getConfig().getExperimentsReader());
            InitializeStateConfigWithLoader access$getInitializeStateConfigWithLoader$p = initializeStateConfig.initializeStateConfigWithLoader;
            InitializeStateConfigWithLoader.Params params2 = new InitializeStateConfigWithLoader.Params(configuration);
            this.label = 1;
            obj3 = access$getInitializeStateConfigWithLoader$p.m49invokegIAlus((BaseParams) params2, (d) this);
            if (obj3 == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            try {
                sd.p.b(obj);
                obj3 = ((o) obj).i();
            } catch (CancellationException e10) {
                throw e10;
            } catch (Throwable th) {
                o.a aVar2 = o.f38128b;
                obj2 = o.b(sd.p.a(th));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sd.p.b(obj3);
        obj2 = o.b((Configuration) obj3);
        if (o.g(obj2)) {
            o.a aVar3 = o.f38128b;
            obj2 = o.b(obj2);
        } else {
            Throwable d10 = o.d(obj2);
            if (d10 != null) {
                o.a aVar4 = o.f38128b;
                obj2 = o.b(sd.p.a(d10));
            }
        }
        return o.a(obj2);
    }
}
