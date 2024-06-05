package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.properties.SdkProperties;
import fe.p;
import java.io.File;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import org.json.JSONObject;
import pe.p0;
import sd.o;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2", f = "ConfigFileFromLocalStorage.kt", l = {}, m = "invokeSuspend")
/* compiled from: ConfigFileFromLocalStorage.kt */
final class ConfigFileFromLocalStorage$doWork$2 extends l implements p<p0, d<? super o<? extends Configuration>>, Object> {
    final /* synthetic */ ConfigFileFromLocalStorage.Params $params;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConfigFileFromLocalStorage$doWork$2(ConfigFileFromLocalStorage.Params params, d<? super ConfigFileFromLocalStorage$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new ConfigFileFromLocalStorage$doWork$2(this.$params, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super o<? extends Configuration>> dVar) {
        return ((ConfigFileFromLocalStorage$doWork$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Configuration configuration;
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            ConfigFileFromLocalStorage.Params params = this.$params;
            try {
                o.a aVar = o.f38128b;
                File file = new File(SdkProperties.getLocalConfigurationFilepath());
                if (!file.exists()) {
                    configuration = params.getDefaultConfiguration();
                } else {
                    configuration = new Configuration(new JSONObject(e.e(file, (Charset) null, 1, (Object) null)));
                }
                obj2 = o.b(configuration);
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
