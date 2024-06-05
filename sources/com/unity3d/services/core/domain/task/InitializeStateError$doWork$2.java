package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.log.DeviceLog;
import fe.p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.o;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateError$doWork$2", f = "InitializeStateError.kt", l = {}, m = "invokeSuspend")
/* compiled from: InitializeStateError.kt */
final class InitializeStateError$doWork$2 extends l implements p<p0, d<? super o<? extends w>>, Object> {
    final /* synthetic */ InitializeStateError.Params $params;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateError$doWork$2(InitializeStateError.Params params, d<? super InitializeStateError$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeStateError$doWork$2(this.$params, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super o<w>> dVar) {
        return ((InitializeStateError$doWork$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            InitializeStateError.Params params = this.$params;
            try {
                o.a aVar = o.f38128b;
                DeviceLog.error("Unity Ads init: halting init in " + params.getErrorState().getMetricName() + ": " + params.getException().getMessage());
                Class[] moduleConfigurationList = params.getConfig().getModuleConfigurationList();
                if (moduleConfigurationList == null) {
                    moduleConfigurationList = new Class[0];
                }
                for (Class moduleConfiguration : moduleConfigurationList) {
                    IModuleConfiguration moduleConfiguration2 = params.getConfig().getModuleConfiguration(moduleConfiguration);
                    if (moduleConfiguration2 != null) {
                        b.a(moduleConfiguration2.initErrorState(params.getConfig(), params.getErrorState(), params.getException().getMessage()));
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
