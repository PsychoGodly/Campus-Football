package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
import fe.p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.o;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$2", f = "InitializeStateCreate.kt", l = {}, m = "invokeSuspend")
/* compiled from: InitializeStateCreate.kt */
final class InitializeStateCreate$doWork$2 extends l implements p<p0, d<? super o<? extends Configuration>>, Object> {
    final /* synthetic */ InitializeStateCreate.Params $params;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateCreate$doWork$2(InitializeStateCreate.Params params, d<? super InitializeStateCreate$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeStateCreate$doWork$2(this.$params, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super o<? extends Configuration>> dVar) {
        return ((InitializeStateCreate$doWork$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Configuration config;
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            InitializeStateCreate.Params params = this.$params;
            try {
                o.a aVar = o.f38128b;
                DeviceLog.debug("Unity Ads init: creating webapp");
                config = params.getConfig();
                config.setWebViewData(params.getWebViewData());
                ErrorState create = WebViewApp.create(config, false);
                if (create == null) {
                    obj2 = o.b(config);
                    if (o.g(obj2)) {
                        o.a aVar2 = o.f38128b;
                        obj2 = o.b(obj2);
                    } else {
                        Throwable d10 = o.d(obj2);
                        if (d10 != null) {
                            o.a aVar3 = o.f38128b;
                            obj2 = o.b(sd.p.a(d10));
                        }
                    }
                    return o.a(obj2);
                }
                String str = "Unity Ads WebApp creation failed";
                if (WebViewApp.getCurrentApp().getWebAppFailureMessage() != null) {
                    str = WebViewApp.getCurrentApp().getWebAppFailureMessage();
                }
                DeviceLog.error(str);
                throw new InitializationException(create, new Exception(str), config);
            } catch (IllegalThreadStateException e10) {
                DeviceLog.exception("Illegal Thread", e10);
                throw new InitializationException(ErrorState.CreateWebApp, e10, config);
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th) {
                o.a aVar4 = o.f38128b;
                obj2 = o.b(sd.p.a(th));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
