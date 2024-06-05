package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.IConfigurationLoader;
import com.unity3d.services.core.configuration.IConfigurationLoaderListener;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.extensions.AbortRetryException;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import pe.i;
import pe.k0;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1", f = "InitializeStateConfigWithLoader.kt", l = {69}, m = "invokeSuspend")
/* compiled from: InitializeStateConfigWithLoader.kt */
final class InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 extends l implements p<Integer, d<? super w>, Object> {
    final /* synthetic */ z<Configuration> $config;
    final /* synthetic */ z<IConfigurationLoader> $configurationLoader;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    @f(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1$1", f = "InitializeStateConfigWithLoader.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1$1  reason: invalid class name */
    /* compiled from: InitializeStateConfigWithLoader.kt */
    static final class AnonymousClass1 extends l implements p<p0, d<? super w>, Object> {
        int label;

        public final d<w> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(zVar, zVar2, initializeStateConfigWithLoader, dVar);
        }

        public final Object invoke(p0 p0Var, d<? super w> dVar) {
            return ((AnonymousClass1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                sd.p.b(obj);
                final z<Configuration> zVar = zVar2;
                final InitializeStateConfigWithLoader initializeStateConfigWithLoader = initializeStateConfigWithLoader;
                ((IConfigurationLoader) zVar.f36055a).loadConfiguration(new IConfigurationLoaderListener() {
                    public void onError(String str) {
                        m.e(str, "errorMsg");
                        SDKMetricsSender access$getSdkMetricsSender$p = initializeStateConfigWithLoader.sdkMetricsSender;
                        Metric newEmergencySwitchOff = TSIMetric.newEmergencySwitchOff();
                        m.d(newEmergencySwitchOff, "newEmergencySwitchOff()");
                        access$getSdkMetricsSender$p.sendMetric(newEmergencySwitchOff);
                        throw new AbortRetryException(str);
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(InitializeStateConfigWithLoader initializeStateConfigWithLoader, z<IConfigurationLoader> zVar, z<Configuration> zVar2, d<? super InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateConfigWithLoader;
        this.$configurationLoader = zVar;
        this.$config = zVar2;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 initializeStateConfigWithLoader$doWork$2$1$configResult$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(this.this$0, this.$configurationLoader, this.$config, dVar);
        initializeStateConfigWithLoader$doWork$2$1$configResult$1$1.I$0 = ((Number) obj).intValue();
        return initializeStateConfigWithLoader$doWork$2$1$configResult$1$1;
    }

    public final Object invoke(int i10, d<? super w> dVar) {
        return ((InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1) create(Integer.valueOf(i10), dVar)).invokeSuspend(w.f38141a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (d<? super w>) (d) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            if (this.I$0 > 0) {
                InitializeEventsMetricSender.getInstance().onRetryConfig();
            }
            k0 io2 = this.this$0.dispatchers.getIo();
            final z<IConfigurationLoader> zVar = this.$configurationLoader;
            final z<Configuration> zVar2 = this.$config;
            final InitializeStateConfigWithLoader initializeStateConfigWithLoader = this.this$0;
            AnonymousClass1 r12 = new AnonymousClass1((d<? super AnonymousClass1>) null);
            this.label = 1;
            if (i.g(io2, r12, this) == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            sd.p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return w.f38141a;
    }
}
