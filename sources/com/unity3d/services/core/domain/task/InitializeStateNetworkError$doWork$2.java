package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.log.DeviceLog;
import fe.p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.g3;
import pe.p0;
import sd.o;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2", f = "InitializeStateNetworkError.kt", l = {39}, m = "invokeSuspend")
/* compiled from: InitializeStateNetworkError.kt */
final class InitializeStateNetworkError$doWork$2 extends l implements p<p0, d<? super o<? extends w>>, Object> {
    final /* synthetic */ InitializeStateNetworkError.Params $params;
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateNetworkError$doWork$2(InitializeStateNetworkError initializeStateNetworkError, InitializeStateNetworkError.Params params, d<? super InitializeStateNetworkError$doWork$2> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateNetworkError;
        this.$params = params;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeStateNetworkError$doWork$2(this.this$0, this.$params, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super o<w>> dVar) {
        return ((InitializeStateNetworkError$doWork$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        InitializeStateNetworkError initializeStateNetworkError;
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            InitializeStateNetworkError initializeStateNetworkError2 = this.this$0;
            InitializeStateNetworkError.Params params = this.$params;
            o.a aVar = o.f38128b;
            DeviceLog.error("Unity Ads init: network error, waiting for connection events");
            initializeStateNetworkError2.maximumConnectedEvents = params.getConfig().getMaximumConnectedEvents();
            initializeStateNetworkError2.connectedEventThreshold = params.getConfig().getConnectedEventThreshold();
            long networkErrorTimeout = params.getConfig().getNetworkErrorTimeout();
            InitializeStateNetworkError$doWork$2$1$success$1 initializeStateNetworkError$doWork$2$1$success$1 = new InitializeStateNetworkError$doWork$2$1$success$1(initializeStateNetworkError2, (d<? super InitializeStateNetworkError$doWork$2$1$success$1>) null);
            this.L$0 = initializeStateNetworkError2;
            this.label = 1;
            Object d10 = g3.d(networkErrorTimeout, initializeStateNetworkError$doWork$2$1$success$1, this);
            if (d10 == c10) {
                return c10;
            }
            initializeStateNetworkError = initializeStateNetworkError2;
            obj = d10;
        } else if (i10 == 1) {
            initializeStateNetworkError = (InitializeStateNetworkError) this.L$0;
            try {
                sd.p.b(obj);
            } catch (CancellationException e10) {
                throw e10;
            } catch (Throwable th) {
                o.a aVar2 = o.f38128b;
                obj2 = o.b(sd.p.a(th));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((w) obj) != null) {
            obj2 = o.b(w.f38141a);
            if (o.g(obj2)) {
                o.a aVar3 = o.f38128b;
                obj2 = o.b(obj2);
            } else {
                Throwable d11 = o.d(obj2);
                if (d11 != null) {
                    o.a aVar4 = o.f38128b;
                    obj2 = o.b(sd.p.a(d11));
                }
            }
            return o.a(obj2);
        }
        ConnectivityMonitor.removeListener(initializeStateNetworkError);
        throw new Exception("No connected events within the timeout!");
    }
}
