package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import fe.p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import pe.p0;
import sd.o;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2", f = "InitializeStateComplete.kt", l = {}, m = "invokeSuspend")
/* compiled from: InitializeStateComplete.kt */
final class InitializeStateComplete$doWork$2 extends l implements p<p0, d<? super o<? extends w>>, Object> {
    final /* synthetic */ InitializeStateComplete.Params $params;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateComplete$doWork$2(InitializeStateComplete.Params params, d<? super InitializeStateComplete$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeStateComplete$doWork$2(this.$params, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super o<w>> dVar) {
        return ((InitializeStateComplete$doWork$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            InitializeStateComplete.Params params = this.$params;
            try {
                o.a aVar = o.f38128b;
                Class[] moduleConfigurationList = params.getConfig().getModuleConfigurationList();
                m.d(moduleConfigurationList, "params.config.moduleConfigurationList");
                for (Class moduleConfiguration : moduleConfigurationList) {
                    IModuleConfiguration moduleConfiguration2 = params.getConfig().getModuleConfiguration(moduleConfiguration);
                    if (moduleConfiguration2 != null) {
                        b.a(moduleConfiguration2.initCompleteState(params.getConfig()));
                    }
                }
                obj2 = o.b(w.f38141a);
            } catch (CancellationException e10) {
                throw e10;
            } catch (Throwable th) {
                o.a aVar2 = o.f38128b;
                obj2 = o.b(sd.p.a(th));
            }
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
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
