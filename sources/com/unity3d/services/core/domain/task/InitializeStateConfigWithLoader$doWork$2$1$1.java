package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IConfigurationLoader;
import com.unity3d.services.core.configuration.IConfigurationLoaderListener;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1", f = "InitializeStateConfigWithLoader.kt", l = {}, m = "invokeSuspend")
/* compiled from: InitializeStateConfigWithLoader.kt */
final class InitializeStateConfigWithLoader$doWork$2$1$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ z<Configuration> $config;
    final /* synthetic */ z<IConfigurationLoader> $configurationLoader;
    final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateConfigWithLoader$doWork$2$1$1(z<IConfigurationLoader> zVar, z<Configuration> zVar2, InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, d<? super InitializeStateConfigWithLoader$doWork$2$1$1> dVar) {
        super(2, dVar);
        this.$configurationLoader = zVar;
        this.$config = zVar2;
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeStateConfigWithLoader$doWork$2$1$1(this.$configurationLoader, this.$config, this.this$0, this.$params, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((InitializeStateConfigWithLoader$doWork$2$1$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            final z<Configuration> zVar = this.$config;
            final InitializeStateConfigWithLoader initializeStateConfigWithLoader = this.this$0;
            final InitializeStateConfigWithLoader.Params params = this.$params;
            ((IConfigurationLoader) this.$configurationLoader.f36055a).loadConfiguration(new IConfigurationLoaderListener() {
                public void onError(String str) {
                    m.e(str, "errorMsg");
                    SDKMetricsSender access$getSdkMetricsSender$p = initializeStateConfigWithLoader.sdkMetricsSender;
                    Metric newEmergencySwitchOff = TSIMetric.newEmergencySwitchOff();
                    m.d(newEmergencySwitchOff, "newEmergencySwitchOff()");
                    access$getSdkMetricsSender$p.sendMetric(newEmergencySwitchOff);
                    throw new InitializationException(ErrorState.NetworkConfigRequest, new Exception(str), params.getConfig());
                }

                public void onSuccess(Configuration configuration) {
                    m.e(configuration, "configuration");
                    zVar.f36055a = configuration;
                    configuration.saveToDisk();
                    initializeStateConfigWithLoader.tokenStorage.setInitToken(((Configuration) zVar.f36055a).getUnifiedAuctionToken());
                }
            });
            return w.f38141a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
