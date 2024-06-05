package com.unity3d.services.core.di;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.net.a;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.ByteStringSerializer;
import com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer;
import com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.INativeTokenGenerator;
import com.unity3d.services.ads.token.InMemoryAsyncTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.SDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import h0.g;
import i0.b;
import java.util.List;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.a0;
import pe.g1;
import pe.k0;
import pe.l0;
import pe.o0;
import pe.p;
import pe.p0;
import pe.q0;
import pe.z2;
import vb.a2;
import vb.b2;
import vb.c2;
import vb.f;
import vb.s2;
import vb.t2;
import vb.u1;
import vb.u2;
import vb.v0;
import vb.w1;
import vb.x1;
import vb.z1;
import xd.d;

/* compiled from: UnityAdsModule.kt */
public final class UnityAdsModule {
    /* access modifiers changed from: private */
    public final Object buildNetworkClient(Context context, ISDKDispatchers iSDKDispatchers, d<? super HttpClient> dVar) {
        p pVar = new p(c.b(dVar), 1);
        pVar.C();
        a.a(context).addOnCompleteListener(new UnityAdsModule$buildNetworkClient$2$1(context, pVar, iSDKDispatchers));
        Object z10 = pVar.z();
        if (z10 == d.c()) {
            h.c(dVar);
        }
        return z10;
    }

    private final w1 getDefaultAdOperations() {
        f.a aVar = f.f38941b;
        w1.a l02 = w1.l0();
        m.d(l02, "newBuilder()");
        f a10 = aVar.a(l02);
        a10.c(30000);
        a10.d(10000);
        a10.b(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
        return a10.a();
    }

    private final a2 getDefaultRequestPolicy() {
        s2.a aVar = s2.f39080b;
        a2.a k02 = a2.k0();
        m.d(k02, "newBuilder()");
        s2 a10 = aVar.a(k02);
        a10.b(getDefaultRequestRetryPolicy());
        a10.c(getDefaultRequestTimeoutPolicy());
        return a10.a();
    }

    private final b2 getDefaultRequestRetryPolicy() {
        t2.a aVar = t2.f39084b;
        b2.a r02 = b2.r0();
        m.d(r02, "newBuilder()");
        t2 a10 = aVar.a(r02);
        a10.b(UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
        a10.f(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        a10.c(0.1f);
        a10.g(false);
        a10.d(1000);
        a10.e(2.0f);
        return a10.a();
    }

    private final c2 getDefaultRequestTimeoutPolicy() {
        u2.a aVar = u2.f39095b;
        c2.a n02 = c2.n0();
        m.d(n02, "newBuilder()");
        u2 a10 = aVar.a(n02);
        a10.b(10000);
        a10.d(10000);
        a10.e(10000);
        a10.c(10000);
        return a10.a();
    }

    private final ByteStringDataSource provideByteStringDataSource(h0.f<c> fVar) {
        return new AndroidByteStringDataSource(fVar);
    }

    private final h0.f<c> provideByteStringDataStore(Context context, k0 k0Var, String str) {
        return g.b(g.f18454a, new ByteStringSerializer(), (b) null, (List) null, q0.a(k0Var.plus(z2.b((pe.c2) null, 1, (Object) null))), new UnityAdsModule$provideByteStringDataStore$1(context, str), 4, (Object) null);
    }

    private final JsonStorage provideJsonStorage(StorageManager.StorageType storageType) {
        if (StorageManager.init(ClientProperties.getApplicationContext())) {
            Storage storage = StorageManager.getStorage(storageType);
            m.d(storage, "getStorage(storageType)");
            return storage;
        }
        throw new IllegalStateException("StorageManager failed to initialize".toString());
    }

    public final Context androidContext() {
        Context applicationContext = ClientProperties.getApplicationContext();
        m.d(applicationContext, "getApplicationContext()");
        return applicationContext;
    }

    public final AsyncTokenStorage asyncTokenStorage(TokenStorage tokenStorage, SDKMetricsSender sDKMetricsSender) {
        m.e(tokenStorage, "tokenStorage");
        m.e(sDKMetricsSender, "sdkMetricsSender");
        return new InMemoryAsyncTokenStorage((INativeTokenGenerator) null, new Handler(Looper.getMainLooper()), sDKMetricsSender, tokenStorage);
    }

    public final ByteStringDataSource auidDataStore(h0.f<c> fVar) {
        m.e(fVar, "dataStore");
        return provideByteStringDataSource(fVar);
    }

    public final k0 defaultDispatcher() {
        return g1.a();
    }

    public final z1 defaultNativeConfiguration() {
        u1.a aVar = u1.f39093b;
        z1.a w02 = z1.w0();
        m.d(w02, "newBuilder()");
        u1 a10 = aVar.a(w02);
        a10.b(getDefaultAdOperations());
        a10.e(getDefaultRequestPolicy());
        a10.c(getDefaultRequestPolicy());
        a10.g(getDefaultRequestPolicy());
        a10.f(getDefaultRequestPolicy());
        v0.a aVar2 = v0.f39099b;
        x1.c p02 = x1.p0();
        m.d(p02, "newBuilder()");
        v0 a11 = aVar2.a(p02);
        a11.b(true);
        a11.d(10);
        a11.c(30000);
        a11.e(false);
        a10.d(a11.a());
        return a10.a();
    }

    public final ByteStringDataSource gatewayCacheDataStore(h0.f<c> fVar) {
        m.e(fVar, "dataStore");
        return provideByteStringDataSource(fVar);
    }

    public final h0.f<c> gatewayDataStore(Context context, k0 k0Var) {
        m.e(context, "context");
        m.e(k0Var, "dispatcher");
        return provideByteStringDataStore(context, k0Var, ServiceProvider.DATA_STORE_GATEWAY_CACHE);
    }

    public final p0 getTokenCoroutineScope(ISDKDispatchers iSDKDispatchers, l0 l0Var, pe.c2 c2Var) {
        m.e(iSDKDispatchers, "dispatchers");
        m.e(l0Var, "errorHandler");
        m.e(c2Var, "parentJob");
        return q0.a(c2Var.plus(iSDKDispatchers.getMain()).plus(new o0(ServiceProvider.NAMED_GET_TOKEN_SCOPE)).plus(l0Var));
    }

    public final h0.f<c> glInfoDataStore(Context context, k0 k0Var, h0.d<c> dVar) {
        m.e(context, "context");
        m.e(k0Var, "dispatcher");
        m.e(dVar, "fetchGLInfo");
        return g.b(g.f18454a, new ByteStringSerializer(), (b) null, p.b(dVar), q0.a(k0Var.plus(z2.b((pe.c2) null, 1, (Object) null))), new UnityAdsModule$glInfoDataStore$1(context), 2, (Object) null);
    }

    public final h0.f<c> iapTransactionDataStore(Context context, k0 k0Var) {
        m.e(context, "context");
        m.e(k0Var, "dispatcher");
        return provideByteStringDataStore(context, k0Var, ServiceProvider.DATA_STORE_IAP_TRANSACTION);
    }

    public final ByteStringDataSource idfiDataStore(h0.f<c> fVar) {
        m.e(fVar, "dataStore");
        return provideByteStringDataSource(fVar);
    }

    public final p0 initCoroutineScope(ISDKDispatchers iSDKDispatchers, l0 l0Var, pe.c2 c2Var) {
        m.e(iSDKDispatchers, "dispatchers");
        m.e(l0Var, "errorHandler");
        m.e(c2Var, "parentJob");
        return q0.a(c2Var.plus(iSDKDispatchers.getDefault()).plus(new o0(ServiceProvider.NAMED_INIT_SCOPE)).plus(l0Var));
    }

    public final k0 ioDispatcher() {
        return g1.b();
    }

    public final p0 loadCoroutineScope(ISDKDispatchers iSDKDispatchers, l0 l0Var, pe.c2 c2Var) {
        m.e(iSDKDispatchers, "dispatchers");
        m.e(l0Var, "errorHandler");
        m.e(c2Var, "parentJob");
        return q0.a(c2Var.plus(iSDKDispatchers.getDefault()).plus(new o0(ServiceProvider.NAMED_LOAD_SCOPE)).plus(l0Var));
    }

    public final k0 mainDispatcher() {
        return g1.c();
    }

    public final MeasurementsService measurementService(Context context, ISDKDispatchers iSDKDispatchers) {
        m.e(context, "context");
        m.e(iSDKDispatchers, "dispatchers");
        return new MeasurementsService(context, iSDKDispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public final h0.f<c> nativeConfigurationDataStore(Context context, k0 k0Var) {
        m.e(context, "context");
        m.e(k0Var, "dispatcher");
        return provideByteStringDataStore(context, k0Var, ServiceProvider.DATA_STORE_NATIVE_CONFIG);
    }

    public final p0 omidCoroutineScope(ISDKDispatchers iSDKDispatchers, l0 l0Var, pe.c2 c2Var) {
        m.e(iSDKDispatchers, "dispatchers");
        m.e(l0Var, "errorHandler");
        m.e(c2Var, "parentJob");
        return q0.a(c2Var.plus(iSDKDispatchers.getMain()).plus(new o0(ServiceProvider.NAMED_OMID_SCOPE)).plus(l0Var));
    }

    public final h0.f<c> privacyDataStore(Context context, k0 k0Var) {
        m.e(context, "context");
        m.e(k0Var, "dispatcher");
        return provideByteStringDataStore(context, k0Var, ServiceProvider.DATA_STORE_PRIVACY);
    }

    public final h0.f<c> privacyFsmDataStore(Context context, k0 k0Var) {
        m.e(context, "context");
        m.e(k0Var, "dispatcher");
        return provideByteStringDataStore(context, k0Var, ServiceProvider.DATA_STORE_PRIVACY_FSM);
    }

    public final JsonStorage privateJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PRIVATE);
    }

    public final HttpClient provideHttpClient(ConfigFileFromLocalStorage configFileFromLocalStorage, AlternativeFlowReader alternativeFlowReader, ISDKDispatchers iSDKDispatchers, SendDiagnosticEvent sendDiagnosticEvent, Context context) {
        m.e(configFileFromLocalStorage, "configFileFromLocalStorage");
        m.e(alternativeFlowReader, "alternativeFlowReader");
        m.e(iSDKDispatchers, "dispatchers");
        m.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        m.e(context, "context");
        return (HttpClient) j.b((xd.g) null, new UnityAdsModule$provideHttpClient$1(alternativeFlowReader, sendDiagnosticEvent, iSDKDispatchers, this, context, configFileFromLocalStorage, (d<? super UnityAdsModule$provideHttpClient$1>) null), 1, (Object) null);
    }

    public final pe.c2 publicApiJob(DiagnosticEventRepository diagnosticEventRepository) {
        m.e(diagnosticEventRepository, "diagnosticEventRepository");
        a0 b10 = i2.b((pe.c2) null, 1, (Object) null);
        b10.u(new UnityAdsModule$publicApiJob$1$1(diagnosticEventRepository));
        return b10;
    }

    public final JsonStorage publicJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PUBLIC);
    }

    public final ISDKDispatchers sdkDispatchers() {
        return new SDKDispatchers();
    }

    public final SDKMetricsSender sdkMetrics() {
        SDKMetricsSender instance = SDKMetrics.getInstance();
        m.d(instance, "getInstance()");
        return instance;
    }

    public final p0 showCoroutineScope(ISDKDispatchers iSDKDispatchers, l0 l0Var, pe.c2 c2Var) {
        m.e(iSDKDispatchers, "dispatchers");
        m.e(l0Var, "errorHandler");
        m.e(c2Var, "parentJob");
        return q0.a(c2Var.plus(iSDKDispatchers.getDefault()).plus(new o0(ServiceProvider.NAMED_SHOW_SCOPE)).plus(l0Var));
    }

    public final TopicsService topicsService(Context context, ISDKDispatchers iSDKDispatchers) {
        m.e(context, "context");
        m.e(iSDKDispatchers, "dispatchers");
        return new TopicsService(context, iSDKDispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public final p0 transactionCoroutineScope(ISDKDispatchers iSDKDispatchers, l0 l0Var, pe.c2 c2Var) {
        m.e(iSDKDispatchers, "dispatchers");
        m.e(l0Var, "errorHandler");
        m.e(c2Var, "parentJob");
        return q0.a(c2Var.plus(iSDKDispatchers.getMain()).plus(new o0(ServiceProvider.NAMED_TRANSACTION_SCOPE)).plus(l0Var));
    }

    public final h0.f<e> universalRequestDataStore(Context context, k0 k0Var) {
        m.e(context, "context");
        m.e(k0Var, "dispatcher");
        return g.b(g.f18454a, new UniversalRequestStoreSerializer(), (b) null, (List) null, q0.a(k0Var.plus(z2.b((pe.c2) null, 1, (Object) null))), new UnityAdsModule$universalRequestDataStore$1(context), 4, (Object) null);
    }

    public final VolumeChangeMonitor volumeChangeMonitor(VolumeChange volumeChange) {
        m.e(volumeChange, "volumeChange");
        return new VolumeChangeMonitor(SharedInstances.INSTANCE.getWebViewEventSender(), volumeChange);
    }

    public final h0.f<g> webViewConfigurationDataStore(Context context, k0 k0Var) {
        m.e(context, "context");
        m.e(k0Var, "dispatcher");
        return g.b(g.f18454a, new WebViewConfigurationStoreSerializer(), (b) null, (List) null, q0.a(k0Var.plus(z2.b((pe.c2) null, 1, (Object) null))), new UnityAdsModule$webViewConfigurationDataStore$1(context), 4, (Object) null);
    }

    public final ByteStringDataSource iapTransactionDataStore(h0.f<c> fVar) {
        m.e(fVar, "dataStore");
        return provideByteStringDataSource(fVar);
    }

    public final ByteStringDataSource nativeConfigurationDataStore(h0.f<c> fVar) {
        m.e(fVar, "dataStore");
        return provideByteStringDataSource(fVar);
    }

    public final ByteStringDataSource privacyDataStore(h0.f<c> fVar) {
        m.e(fVar, "dataStore");
        return provideByteStringDataSource(fVar);
    }

    public final ByteStringDataSource privacyFsmDataStore(h0.f<c> fVar) {
        m.e(fVar, "dataStore");
        return provideByteStringDataSource(fVar);
    }

    public final ByteStringDataSource glInfoDataStore(h0.f<c> fVar) {
        m.e(fVar, "dataStore");
        return provideByteStringDataSource(fVar);
    }
}
