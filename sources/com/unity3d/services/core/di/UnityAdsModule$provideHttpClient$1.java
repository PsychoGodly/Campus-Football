package com.unity3d.services.core.di;

import android.content.Context;
import bf.u;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.LegacyHttpClient;
import com.unity3d.services.core.network.core.OkHttp3Client;
import fe.p;
import java.util.Map;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import oe.e;
import oe.j;
import pe.g3;
import pe.p0;
import sd.w;
import xd.d;
import xd.g;

@f(c = "com.unity3d.services.core.di.UnityAdsModule$provideHttpClient$1", f = "UnityAdsModule.kt", l = {474}, m = "invokeSuspend")
/* compiled from: UnityAdsModule.kt */
final class UnityAdsModule$provideHttpClient$1 extends l implements p<p0, d<? super HttpClient>, Object> {
    final /* synthetic */ AlternativeFlowReader $alternativeFlowReader;
    final /* synthetic */ ConfigFileFromLocalStorage $configFileFromLocalStorage;
    final /* synthetic */ Context $context;
    final /* synthetic */ ISDKDispatchers $dispatchers;
    final /* synthetic */ SendDiagnosticEvent $sendDiagnosticEvent;
    long J$0;
    int label;
    final /* synthetic */ UnityAdsModule this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UnityAdsModule$provideHttpClient$1(AlternativeFlowReader alternativeFlowReader, SendDiagnosticEvent sendDiagnosticEvent, ISDKDispatchers iSDKDispatchers, UnityAdsModule unityAdsModule, Context context, ConfigFileFromLocalStorage configFileFromLocalStorage, d<? super UnityAdsModule$provideHttpClient$1> dVar) {
        super(2, dVar);
        this.$alternativeFlowReader = alternativeFlowReader;
        this.$sendDiagnosticEvent = sendDiagnosticEvent;
        this.$dispatchers = iSDKDispatchers;
        this.this$0 = unityAdsModule;
        this.$context = context;
        this.$configFileFromLocalStorage = configFileFromLocalStorage;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new UnityAdsModule$provideHttpClient$1(this.$alternativeFlowReader, this.$sendDiagnosticEvent, this.$dispatchers, this.this$0, this.$context, this.$configFileFromLocalStorage, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super HttpClient> dVar) {
        return ((UnityAdsModule$provideHttpClient$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        long j10;
        IExperiments experiments;
        Object c10 = d.c();
        int i10 = this.label;
        boolean z10 = true;
        if (i10 == 0) {
            sd.p.b(obj);
            if (this.$alternativeFlowReader.invoke()) {
                long a10 = j.f36786a.a();
                UnityAdsModule$provideHttpClient$1$client$1 unityAdsModule$provideHttpClient$1$client$1 = new UnityAdsModule$provideHttpClient$1$client$1(this.this$0, this.$context, this.$dispatchers, (d<? super UnityAdsModule$provideHttpClient$1$client$1>) null);
                this.J$0 = a10;
                this.label = 1;
                obj = g3.d(500, unityAdsModule$provideHttpClient$1$client$1, this);
                if (obj == c10) {
                    return c10;
                }
                j10 = a10;
            } else {
                Configuration configuration = (Configuration) j.b((g) null, new UnityAdsModule$provideHttpClient$1$config$1(this.$configFileFromLocalStorage, (d<? super UnityAdsModule$provideHttpClient$1$config$1>) null), 1, (Object) null);
                if (configuration == null || (experiments = configuration.getExperiments()) == null || !experiments.isOkHttpEnabled()) {
                    z10 = false;
                }
                if (z10) {
                    return new OkHttp3Client(this.$dispatchers, new u());
                }
                return new LegacyHttpClient(this.$dispatchers);
            }
        } else if (i10 == 1) {
            j10 = this.J$0;
            sd.p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        HttpClient httpClient = (HttpClient) obj;
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.$sendDiagnosticEvent, httpClient == null ? "native_cronet_failure_time" : "native_cronet_success_time", b.b(oe.b.A(j.a.f(j10), e.MILLISECONDS)), (Map) null, (Map) null, (AdObject) null, 28, (Object) null);
        if (httpClient == null) {
            return new OkHttp3Client(this.$dispatchers, new u());
        }
        return httpClient;
    }
}
