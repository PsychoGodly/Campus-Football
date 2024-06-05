package com.unity3d.services.core.di;

import android.content.Context;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.adplayer.GetAdAssetLoader;
import com.unity3d.ads.adplayer.GetAdAssetLoaderKt;
import com.unity3d.ads.adplayer.GetWebViewAssetLoaderKt;
import com.unity3d.ads.adplayer.GetWebViewCacheAssetLoader;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidMediationDataSource;
import com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStoreDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.FetchGLInfoDataMigration;
import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StoreDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.ads.core.data.repository.AndroidCampaignRepository;
import com.unity3d.ads.core.data.repository.AndroidDeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.AndroidLegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.AndroidSessionRepository;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.AndroidBoldExperimentHandler;
import com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.AndroidHandleOpenUrl;
import com.unity3d.ads.core.domain.AndroidLoad;
import com.unity3d.ads.core.domain.AndroidRefresh;
import com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent;
import com.unity3d.ads.core.domain.AndroidSendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.AndroidShow;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.BoldExperimentHandler;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.ClearCache;
import com.unity3d.ads.core.domain.CommonAwaitInitialization;
import com.unity3d.ads.core.domain.CommonCacheFile;
import com.unity3d.ads.core.domain.CommonClearCache;
import com.unity3d.ads.core.domain.CommonGetAdObject;
import com.unity3d.ads.core.domain.CommonGetAdPlayer;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonGetInitializationState;
import com.unity3d.ads.core.domain.CommonGetIsFileCache;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonSetInitializationState;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAdPlayer;
import com.unity3d.ads.core.domain.GetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAdRequest;
import com.unity3d.ads.core.domain.GetAdRequestPolicy;
import com.unity3d.ads.core.domain.GetAndroidAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAndroidAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAndroidAdPlayerContext;
import com.unity3d.ads.core.domain.GetAndroidAdRequest;
import com.unity3d.ads.core.domain.GetAndroidClientInfo;
import com.unity3d.ads.core.domain.GetAndroidInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetAndroidInitializationRequest;
import com.unity3d.ads.core.domain.GetAndroidLimitedSessionToken;
import com.unity3d.ads.core.domain.GetAndroidOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetAndroidUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetAndroidUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetClientInfo;
import com.unity3d.ads.core.domain.GetCommonWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitRequestPolicy;
import com.unity3d.ads.core.domain.GetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetInitializationRequest;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.domain.GetLimitedSessionToken;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetOperativeEventRequestPolicy;
import com.unity3d.ads.core.domain.GetOtherRequestPolicy;
import com.unity3d.ads.core.domain.GetPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.HandleAndroidGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleAndroidGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleGatewayAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.InitializeAndroidBoldSDK;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.Load;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.SetInitializationState;
import com.unity3d.ads.core.domain.Show;
import com.unity3d.ads.core.domain.TriggerAndroidInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializeListener;
import com.unity3d.ads.core.domain.events.DiagnosticEventObserver;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.events.GetAndroidTransactionData;
import com.unity3d.ads.core.domain.events.GetCommonTransactionRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.events.GetOperativeEventRequest;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.OperativeEventObserver;
import com.unity3d.ads.core.domain.events.TransactionEventObserver;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.domain.om.AndroidOmFinishSession;
import com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.CommonGetOmData;
import com.unity3d.ads.core.domain.om.CommonIsOMActivated;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier;
import com.unity3d.ads.core.utils.CommonCoroutineTimer;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.core.StoreEventListenerFactory;
import com.unity3d.services.store.core.StoreExceptionHandler;
import fe.a;
import fe.l;
import h0.d;
import h0.f;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import pe.c2;
import pe.k0;
import pe.l0;
import pe.p0;
import sd.w;
import vb.z1;

/* compiled from: ServiceProvider.kt */
final class ServiceProvider$initialize$1 extends n implements l<ServicesRegistry, w> {
    public static final ServiceProvider$initialize$1 INSTANCE = new ServiceProvider$initialize$1();

    ServiceProvider$initialize$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ServicesRegistry) obj);
        return w.f38141a;
    }

    public final void invoke(final ServicesRegistry servicesRegistry) {
        Class<FlattenerRulesUseCase> cls = FlattenerRulesUseCase.class;
        Class<CacheDataSource> cls2 = CacheDataSource.class;
        Class<JsonStorage> cls3 = JsonStorage.class;
        Class<k0> cls4 = k0.class;
        Class<GetRequestPolicy> cls5 = GetRequestPolicy.class;
        Class<ByteStringDataSource> cls6 = ByteStringDataSource.class;
        Class<p0> cls7 = p0.class;
        Class<f> cls8 = f.class;
        m.e(servicesRegistry, "$this$registry");
        final UnityAdsModule unityAdsModule = new UnityAdsModule();
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class)), i.a(AnonymousClass1.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, a0.b(cls4)), i.a(new a<k0>() {
            public final k0 invoke() {
                return unityAdsModule.mainDispatcher();
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, a0.b(cls4)), i.a(new a<k0>() {
            public final k0 invoke() {
                return unityAdsModule.defaultDispatcher();
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.IO_DISPATCHER, a0.b(cls4)), i.a(new a<k0>() {
            public final k0 invoke() {
                return unityAdsModule.ioDispatcher();
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class)), i.a(new a<ISDKDispatchers>() {
            public final ISDKDispatchers invoke() {
                return unityAdsModule.sdkDispatchers();
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SDKMetricsSender.class)), i.a(new a<SDKMetricsSender>() {
            public final SDKMetricsSender invoke() {
                return unityAdsModule.sdkMetrics();
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, a0.b(cls7)), ServiceFactoryKt.factoryOf(new a<p0>() {
            public final p0 invoke() {
                return unityAdsModule.initCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class))), (l0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, a0.b(l0.class))), (c2) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, a0.b(c2.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, a0.b(cls7)), ServiceFactoryKt.factoryOf(new a<p0>() {
            public final p0 invoke() {
                return unityAdsModule.loadCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class))), (l0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, a0.b(l0.class))), (c2) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, a0.b(c2.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, a0.b(cls7)), ServiceFactoryKt.factoryOf(new a<p0>() {
            public final p0 invoke() {
                return unityAdsModule.showCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class))), (l0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, a0.b(l0.class))), (c2) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, a0.b(c2.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, a0.b(cls7)), ServiceFactoryKt.factoryOf(new a<p0>() {
            public final p0 invoke() {
                return unityAdsModule.transactionCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class))), (l0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, a0.b(l0.class))), (c2) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, a0.b(c2.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_GET_TOKEN_SCOPE, a0.b(cls7)), ServiceFactoryKt.factoryOf(new a<p0>() {
            public final p0 invoke() {
                return unityAdsModule.getTokenCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class))), (l0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, a0.b(l0.class))), (c2) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, a0.b(c2.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_OMID_SCOPE, a0.b(cls7)), ServiceFactoryKt.factoryOf(new a<p0>() {
            public final p0 invoke() {
                return unityAdsModule.omidCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class))), (l0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, a0.b(l0.class))), (c2) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, a0.b(c2.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, a0.b(c2.class)), ServiceFactoryKt.factoryOf(new a<c2>() {
            public final c2 invoke() {
                return unityAdsModule.publicApiJob((DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DiagnosticEventRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, a0.b(cls8)), i.a(new a<f<c>>() {
            public final f<c> invoke() {
                return unityAdsModule.gatewayDataStore((Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))), (k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, a0.b(k0.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, a0.b(cls8)), i.a(new a<f<c>>() {
            public final f<c> invoke() {
                return unityAdsModule.privacyDataStore((Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))), (k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, a0.b(k0.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, a0.b(cls6)), i.a(new a<ByteStringDataSource>() {
            public final ByteStringDataSource invoke() {
                return unityAdsModule.privacyDataStore((f) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, a0.b(f.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, a0.b(cls8)), i.a(new a<f<c>>() {
            public final f<c> invoke() {
                return unityAdsModule.privacyFsmDataStore((Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))), (k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, a0.b(k0.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, a0.b(cls6)), i.a(new a<ByteStringDataSource>() {
            public final ByteStringDataSource invoke() {
                return unityAdsModule.privacyFsmDataStore((f) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, a0.b(f.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, a0.b(cls8)), i.a(new a<f<c>>() {
            public final f<c> invoke() {
                return unityAdsModule.nativeConfigurationDataStore((Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))), (k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, a0.b(k0.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, a0.b(cls6)), i.a(new a<ByteStringDataSource>() {
            public final ByteStringDataSource invoke() {
                return unityAdsModule.nativeConfigurationDataStore((f) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, a0.b(f.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, a0.b(cls8)), i.a(new a<f<c>>() {
            public final f<c> invoke() {
                return unityAdsModule.glInfoDataStore((Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))), (k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, a0.b(k0.class))), (d) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.PREF_GL_INFO, a0.b(d.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, a0.b(cls6)), i.a(new a<ByteStringDataSource>() {
            public final ByteStringDataSource invoke() {
                return unityAdsModule.glInfoDataStore((f) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, a0.b(f.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST, a0.b(cls8)), i.a(new a<f<e>>() {
            public final f<e> invoke() {
                return unityAdsModule.universalRequestDataStore((Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))), (k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, a0.b(k0.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, a0.b(cls8)), i.a(new a<f<c>>() {
            public final f<c> invoke() {
                return unityAdsModule.iapTransactionDataStore((Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))), (k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, a0.b(k0.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, a0.b(cls6)), i.a(new a<ByteStringDataSource>() {
            public final ByteStringDataSource invoke() {
                return unityAdsModule.iapTransactionDataStore((f) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, a0.b(f.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, a0.b(cls8)), i.a(new a<f<g>>() {
            public final f<g> invoke() {
                return unityAdsModule.webViewConfigurationDataStore((Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))), (k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, a0.b(k0.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AsyncTokenStorage.class)), i.a(new a<AsyncTokenStorage>() {
            public final AsyncTokenStorage invoke() {
                return unityAdsModule.asyncTokenStorage((TokenStorage) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(TokenStorage.class))), (SDKMetricsSender) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SDKMetricsSender.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(VolumeChangeMonitor.class)), i.a(new a<VolumeChangeMonitor>() {
            public final VolumeChangeMonitor invoke() {
                return unityAdsModule.volumeChangeMonitor((VolumeChange) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(VolumeChange.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey("PUBLIC", a0.b(cls3)), i.a(new a<JsonStorage>() {
            public final JsonStorage invoke() {
                return unityAdsModule.publicJsonStorage();
            }
        }));
        servicesRegistry.updateService(new ServiceKey("PRIVATE", a0.b(cls3)), i.a(new a<JsonStorage>() {
            public final JsonStorage invoke() {
                return unityAdsModule.privateJsonStorage();
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(z1.class)), i.a(new a<z1>() {
            public final z1 invoke() {
                return unityAdsModule.defaultNativeConfiguration();
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, a0.b(cls6)), i.a(new a<ByteStringDataSource>() {
            public final ByteStringDataSource invoke() {
                return unityAdsModule.gatewayCacheDataStore((f) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, a0.b(f.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(MeasurementsService.class)), i.a(new a<MeasurementsService>() {
            public final MeasurementsService invoke() {
                return unityAdsModule.measurementService((Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))), (ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(TopicsService.class)), i.a(new a<TopicsService>() {
            public final TopicsService invoke() {
                return unityAdsModule.topicsService((Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))), (ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(HttpClient.class)), i.a(new a<HttpClient>() {
            public final HttpClient invoke() {
                return unityAdsModule.provideHttpClient((ConfigFileFromLocalStorage) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ConfigFileFromLocalStorage.class))), (AlternativeFlowReader) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AlternativeFlowReader.class))), (ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class))), (Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AlternativeFlowReader.class)), i.a(new a<AlternativeFlowReader>() {
            public final AlternativeFlowReader invoke() {
                return new AlternativeFlowReader((ConfigurationReader) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ConfigurationReader.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GameServerIdReader.class)), i.a(new a<GameServerIdReader>() {
            public final GameServerIdReader invoke() {
                return new GameServerIdReader((JsonStorage) servicesRegistry.resolveService(new ServiceKey("PUBLIC", a0.b(JsonStorage.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(StoreDataSource.class)), i.a(new a<StoreDataSource>() {
            public final StoreDataSource invoke() {
                return new AndroidStoreDataSource((Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AnalyticsDataSource.class)), i.a(AnonymousClass39.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DeveloperConsentDataSource.class)), i.a(new a<DeveloperConsentDataSource>() {
            public final DeveloperConsentDataSource invoke() {
                return new AndroidDeveloperConsentDataSource((FlattenerRulesUseCase) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, a0.b(FlattenerRulesUseCase.class))), (JsonStorage) servicesRegistry.resolveService(new ServiceKey("PUBLIC", a0.b(JsonStorage.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DynamicDeviceInfoDataSource.class)), i.a(new a<DynamicDeviceInfoDataSource>() {
            public final DynamicDeviceInfoDataSource invoke() {
                return new AndroidDynamicDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))), (LifecycleDataSource) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(LifecycleDataSource.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(LegacyUserConsentDataSource.class)), i.a(new a<LegacyUserConsentDataSource>() {
            public final LegacyUserConsentDataSource invoke() {
                return new AndroidLegacyUserConsentDataSource((FlattenerRulesUseCase) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, a0.b(FlattenerRulesUseCase.class))), (JsonStorage) servicesRegistry.resolveService(new ServiceKey("PRIVATE", a0.b(JsonStorage.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(LifecycleDataSource.class)), i.a(AnonymousClass43.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_LOCAL, a0.b(cls2)), i.a(AnonymousClass44.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(MediationDataSource.class)), i.a(new a<MediationDataSource>() {
            public final MediationDataSource invoke() {
                return new AndroidMediationDataSource((JsonStorage) servicesRegistry.resolveService(new ServiceKey("PUBLIC", a0.b(JsonStorage.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(PrivacyDeviceInfoDataSource.class)), i.a(new a<PrivacyDeviceInfoDataSource>() {
            public final PrivacyDeviceInfoDataSource invoke() {
                return new AndroidPrivacyDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_REMOTE, a0.b(cls2)), i.a(new a<CacheDataSource>() {
            public final CacheDataSource invoke() {
                return new AndroidRemoteCacheDataSource((HttpClient) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(HttpClient.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(StaticDeviceInfoDataSource.class)), i.a(new a<StaticDeviceInfoDataSource>() {
            public final StaticDeviceInfoDataSource invoke() {
                return new AndroidStaticDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, a0.b(ByteStringDataSource.class))), (AnalyticsDataSource) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AnalyticsDataSource.class))), (StoreDataSource) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(StoreDataSource.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.PREF_GL_INFO, a0.b(d.class)), i.a(new a<d<c>>() {
            public final d<c> invoke() {
                return new FetchGLInfoDataMigration((GetOpenGLRendererInfo) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetOpenGLRendererInfo.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(UniversalRequestDataSource.class)), i.a(new a<UniversalRequestDataSource>() {
            public final UniversalRequestDataSource invoke() {
                return new UniversalRequestDataSource((f) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST, a0.b(f.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(WebviewConfigurationDataSource.class)), i.a(new a<WebviewConfigurationDataSource>() {
            public final WebviewConfigurationDataSource invoke() {
                return new WebviewConfigurationDataSource((f) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, a0.b(f.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(OmidManager.class)), i.a(AnonymousClass52.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SDKPropertiesManager.class)), i.a(AnonymousClass53.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(StorageManager.class)), i.a(AnonymousClass54.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(TransactionEventManager.class)), i.a(new a<TransactionEventManager>() {
            public final TransactionEventManager invoke() {
                return new TransactionEventManager((p0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, a0.b(p0.class))), (StoreMonitor) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(StoreMonitor.class))), (GetTransactionData) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetTransactionData.class))), (GetTransactionRequest) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetTransactionRequest.class))), (TransactionEventRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(TransactionEventRepository.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, a0.b(ByteStringDataSource.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AdRepository.class)), i.a(AnonymousClass56.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(CacheRepository.class)), i.a(new a<CacheRepository>() {
            public final CacheRepository invoke() {
                Class<CacheDataSource> cls = CacheDataSource.class;
                return new AndroidCacheRepository((k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, a0.b(k0.class))), (CacheDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_LOCAL, a0.b(cls))), (CacheDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_REMOTE, a0.b(cls))), (Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(CampaignRepository.class)), i.a(new a<CampaignRepository>() {
            public final CampaignRepository invoke() {
                return new AndroidCampaignRepository((GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetSharedDataTimestamps.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DeveloperConsentRepository.class)), i.a(new a<DeveloperConsentRepository>() {
            public final DeveloperConsentRepository invoke() {
                return new AndroidDeveloperConsentRepository((DeveloperConsentDataSource) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DeveloperConsentDataSource.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DeviceInfoRepository.class)), i.a(new a<DeviceInfoRepository>() {
            public final DeviceInfoRepository invoke() {
                return new AndroidDeviceInfoRepository((StaticDeviceInfoDataSource) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(StaticDeviceInfoDataSource.class))), (DynamicDeviceInfoDataSource) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DynamicDeviceInfoDataSource.class))), (PrivacyDeviceInfoDataSource) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(PrivacyDeviceInfoDataSource.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DiagnosticEventRepository.class)), i.a(new a<DiagnosticEventRepository>() {
            public final DiagnosticEventRepository invoke() {
                return new AndroidDiagnosticEventRepository((CoroutineTimer) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(CoroutineTimer.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(LegacyUserConsentRepository.class)), i.a(new a<LegacyUserConsentRepository>() {
            public final LegacyUserConsentRepository invoke() {
                return new AndroidLegacyUserConsentRepository((LegacyUserConsentDataSource) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(LegacyUserConsentDataSource.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(MediationRepository.class)), i.a(new a<MediationRepository>() {
            public final MediationRepository invoke() {
                return new AndroidMediationRepository((MediationDataSource) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(MediationDataSource.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(OpenMeasurementRepository.class)), i.a(new a<OpenMeasurementRepository>() {
            public final OpenMeasurementRepository invoke() {
                return new AndroidOpenMeasurementRepository((k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, a0.b(k0.class))), (OmidManager) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(OmidManager.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class)), i.a(new a<SessionRepository>() {
            public final SessionRepository invoke() {
                Class<ByteStringDataSource> cls = ByteStringDataSource.class;
                return new AndroidSessionRepository((ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, a0.b(cls))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, a0.b(cls))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, a0.b(cls))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, a0.b(cls))), (z1) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(z1.class))), (k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, a0.b(k0.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(TransactionEventRepository.class)), i.a(AnonymousClass66.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(OperativeEventRepository.class)), i.a(AnonymousClass67.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(BoldExperimentHandler.class)), i.a(new a<BoldExperimentHandler>() {
            public final BoldExperimentHandler invoke() {
                return new AndroidBoldExperimentHandler((ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, a0.b(ByteStringDataSource.class))), (k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, a0.b(k0.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ExecuteAdViewerRequest.class)), i.a(new a<ExecuteAdViewerRequest>() {
            public final ExecuteAdViewerRequest invoke() {
                return new AndroidExecuteAdViewerRequest((k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, a0.b(k0.class))), (HttpClient) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(HttpClient.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetByteStringId.class)), i.a(AnonymousClass70.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(HandleOpenUrl.class)), i.a(new a<HandleOpenUrl>() {
            public final HandleOpenUrl invoke() {
                return new AndroidHandleOpenUrl((Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Refresh.class)), i.a(new a<Refresh>() {
            public final Refresh invoke() {
                return new AndroidRefresh((k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, a0.b(k0.class))), (GetAdDataRefreshRequest) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetAdDataRefreshRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, a0.b(GetRequestPolicy.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GatewayClient.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class)), i.a(new a<SendDiagnosticEvent>() {
            public final SendDiagnosticEvent invoke() {
                return new AndroidSendDiagnosticEvent((DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DiagnosticEventRepository.class))), (GetDiagnosticEventRequest) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetDiagnosticEventRequest.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendWebViewClientErrorDiagnostics.class)), i.a(new a<SendWebViewClientErrorDiagnostics>() {
            public final SendWebViewClientErrorDiagnostics invoke() {
                return new AndroidSendWebViewClientErrorDiagnostics((SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Show.class)), i.a(new a<Show>() {
            public final Show invoke() {
                return new AndroidShow((AdRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AdRepository.class))), (GameServerIdReader) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GameServerIdReader.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(CacheFile.class)), i.a(new a<CacheFile>() {
            public final CacheFile invoke() {
                return new CommonCacheFile((CacheRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(CacheRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ClearCache.class)), i.a(new a<ClearCache>() {
            public final ClearCache invoke() {
                return new CommonClearCache((CacheRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(CacheRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetAdObject.class)), i.a(new a<GetAdObject>() {
            public final GetAdObject invoke() {
                return new CommonGetAdObject((AdRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AdRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetHeaderBiddingToken.class)), i.a(new a<GetHeaderBiddingToken>() {
            public final GetHeaderBiddingToken invoke() {
                return new CommonGetHeaderBiddingToken((GetByteStringId) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetByteStringId.class))), (GetClientInfo) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetClientInfo.class))), (GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetSharedDataTimestamps.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(CampaignRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetInitializationState.class)), i.a(new a<GetInitializationState>() {
            public final GetInitializationState invoke() {
                return new CommonGetInitializationState((SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetIsFileCache.class)), i.a(new a<GetIsFileCache>() {
            public final GetIsFileCache invoke() {
                return new CommonGetIsFileCache((CacheRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(CacheRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SetInitializationState.class)), i.a(new a<SetInitializationState>() {
            public final SetInitializationState invoke() {
                return new CommonSetInitializationState((SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, a0.b(cls5)), i.a(new a<GetRequestPolicy>() {
            public final GetRequestPolicy invoke() {
                return new GetAdRequestPolicy((SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetAdDataRefreshRequest.class)), i.a(new a<GetAdDataRefreshRequest>() {
            public final GetAdDataRefreshRequest invoke() {
                return new GetAndroidAdDataRefreshRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetUniversalRequestForPayLoad.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DeviceInfoRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(CampaignRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetAdPlayerConfigRequest.class)), i.a(new a<GetAdPlayerConfigRequest>() {
            public final GetAdPlayerConfigRequest invoke() {
                return new GetAndroidAdPlayerConfigRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetUniversalRequestForPayLoad.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetAndroidAdPlayerContext.class)), i.a(new a<GetAndroidAdPlayerContext>() {
            public final GetAndroidAdPlayerContext invoke() {
                return new GetAndroidAdPlayerContext((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetAdRequest.class)), i.a(new a<GetAdRequest>() {
            public final GetAdRequest invoke() {
                return new GetAndroidAdRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetUniversalRequestForPayLoad.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DeviceInfoRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(CampaignRepository.class))), (WebviewConfigurationDataSource) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(WebviewConfigurationDataSource.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetClientInfo.class)), i.a(new a<GetClientInfo>() {
            public final GetClientInfo invoke() {
                return new GetAndroidClientInfo((SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))), (MediationRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(MediationRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetInitializationCompletedRequest.class)), i.a(new a<GetInitializationCompletedRequest>() {
            public final GetInitializationCompletedRequest invoke() {
                return new GetAndroidInitializationCompletedRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetUniversalRequestForPayLoad.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DeviceInfoRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetInitializationRequest.class)), i.a(new a<GetInitializationRequest>() {
            public final GetInitializationRequest invoke() {
                return new GetAndroidInitializationRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetUniversalRequestForPayLoad.class))), (GetClientInfo) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetClientInfo.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DeviceInfoRepository.class))), (LegacyUserConsentRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(LegacyUserConsentRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetLimitedSessionToken.class)), i.a(new a<GetLimitedSessionToken>() {
            public final GetLimitedSessionToken invoke() {
                return new GetAndroidLimitedSessionToken((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))), (MediationRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(MediationRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetOpenGLRendererInfo.class)), i.a(new a<GetOpenGLRendererInfo>() {
            public final GetOpenGLRendererInfo invoke() {
                return new GetAndroidOpenGLRendererInfo((SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetSharedDataTimestamps.class)), i.a(AnonymousClass93.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetUniversalRequestForPayLoad.class)), i.a(new a<GetUniversalRequestForPayLoad>() {
            public final GetUniversalRequestForPayLoad invoke() {
                return new GetAndroidUniversalRequestForPayLoad((GetUniversalRequestSharedData) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetUniversalRequestSharedData.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetUniversalRequestSharedData.class)), i.a(new a<GetUniversalRequestSharedData>() {
            public final GetUniversalRequestSharedData invoke() {
                return new GetAndroidUniversalRequestSharedData((GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetSharedDataTimestamps.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DeviceInfoRepository.class))), (GetLimitedSessionToken) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetLimitedSessionToken.class))), (DeveloperConsentRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DeveloperConsentRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetCachedAsset.class)), i.a(new a<GetCachedAsset>() {
            public final GetCachedAsset invoke() {
                return new GetCachedAsset((CacheRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(CacheRepository.class))), (Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetWebViewBridgeUseCase.class)), i.a(new a<GetWebViewBridgeUseCase>() {
            public final GetWebViewBridgeUseCase invoke() {
                return new GetCommonWebViewBridgeUseCase((k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, a0.b(k0.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, a0.b(cls5)), i.a(new a<GetRequestPolicy>() {
            public final GetRequestPolicy invoke() {
                return new GetInitRequestPolicy((SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetLatestWebViewConfiguration.class)), i.a(new a<GetLatestWebViewConfiguration>() {
            public final GetLatestWebViewConfiguration invoke() {
                return new GetLatestWebViewConfiguration((WebviewConfigurationDataSource) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(WebviewConfigurationDataSource.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_OPERATIVE_REQ, a0.b(cls5)), i.a(new a<GetRequestPolicy>() {
            public final GetRequestPolicy invoke() {
                return new GetOperativeEventRequestPolicy((SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, a0.b(cls5)), i.a(new a<GetRequestPolicy>() {
            public final GetRequestPolicy invoke() {
                return new GetOtherRequestPolicy((SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetPrivacyUpdateRequest.class)), i.a(new a<GetPrivacyUpdateRequest>() {
            public final GetPrivacyUpdateRequest invoke() {
                return new GetPrivacyUpdateRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetUniversalRequestForPayLoad.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(HandleGatewayInitializationResponse.class)), i.a(new a<HandleGatewayInitializationResponse>() {
            public final HandleGatewayInitializationResponse invoke() {
                return new HandleAndroidGatewayInitializationResponse((TransactionEventManager) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(TransactionEventManager.class))), (TriggerInitializationCompletedRequest) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(TriggerInitializationCompletedRequest.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))), (p0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, a0.b(p0.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(HandleGatewayUniversalResponse.class)), i.a(new a<HandleGatewayUniversalResponse>() {
            public final HandleGatewayUniversalResponse invoke() {
                return new HandleAndroidGatewayUniversalResponse((SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DeviceInfoRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeBoldSDK.class)), i.a(new a<InitializeBoldSDK>() {
            public final InitializeBoldSDK invoke() {
                DiagnosticEventRepository diagnosticEventRepository = (DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DiagnosticEventRepository.class)));
                StorageManager storageManager = (StorageManager) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(StorageManager.class)));
                return new InitializeAndroidBoldSDK((k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, a0.b(k0.class))), (InitializeOMSDK) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeOMSDK.class))), (GetInitializationRequest) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetInitializationRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, a0.b(GetRequestPolicy.class))), (ClearCache) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ClearCache.class))), (HandleGatewayInitializationResponse) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(HandleGatewayInitializationResponse.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GatewayClient.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))), (EventObservers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(EventObservers.class))), (TriggerInitializeListener) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(TriggerInitializeListener.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class))), diagnosticEventRepository, storageManager, (ConfigurationReader) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ConfigurationReader.class))), (SDKPropertiesManager) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SDKPropertiesManager.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(LegacyShowUseCase.class)), i.a(new a<LegacyShowUseCase>() {
            public final LegacyShowUseCase invoke() {
                return new LegacyShowUseCase((k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, a0.b(k0.class))), (Show) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Show.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AdRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class))), (GetOperativeEventApi) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetOperativeEventApi.class))), (GetInitializationState) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetInitializationState.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendPrivacyUpdateRequest.class)), i.a(new a<SendPrivacyUpdateRequest>() {
            public final SendPrivacyUpdateRequest invoke() {
                return new SendPrivacyUpdateRequest((GetPrivacyUpdateRequest) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetPrivacyUpdateRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, a0.b(GetRequestPolicy.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GatewayClient.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(TriggerInitializationCompletedRequest.class)), i.a(new a<TriggerInitializationCompletedRequest>() {
            public final TriggerInitializationCompletedRequest invoke() {
                return new TriggerAndroidInitializationCompletedRequest((GetInitializationCompletedRequest) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetInitializationCompletedRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, a0.b(GetRequestPolicy.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GatewayClient.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(TriggerInitializeListener.class)), i.a(new a<TriggerInitializeListener>() {
            public final TriggerInitializeListener invoke() {
                return new TriggerInitializeListener((k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, a0.b(k0.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DiagnosticEventObserver.class)), i.a(new a<DiagnosticEventObserver>() {
            public final DiagnosticEventObserver invoke() {
                return new DiagnosticEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetUniversalRequestForPayLoad.class))), (GetDiagnosticEventBatchRequest) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetDiagnosticEventBatchRequest.class))), (k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, a0.b(k0.class))), (DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DiagnosticEventRepository.class))), (UniversalRequestDataSource) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(UniversalRequestDataSource.class))), (BackgroundWorker) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(BackgroundWorker.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(EventObservers.class)), i.a(new a<EventObservers>() {
            public final EventObservers invoke() {
                return new EventObservers((OperativeEventObserver) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(OperativeEventObserver.class))), (DiagnosticEventObserver) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DiagnosticEventObserver.class))), (TransactionEventObserver) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(TransactionEventObserver.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetTransactionData.class)), i.a(new a<GetTransactionData>() {
            public final GetTransactionData invoke() {
                return new GetAndroidTransactionData((GetByteStringId) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetByteStringId.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetTransactionRequest.class)), i.a(new a<GetTransactionRequest>() {
            public final GetTransactionRequest invoke() {
                return new GetCommonTransactionRequest((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DeviceInfoRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetDiagnosticEventBatchRequest.class)), i.a(AnonymousClass114.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetDiagnosticEventRequest.class)), i.a(new a<GetDiagnosticEventRequest>() {
            public final GetDiagnosticEventRequest invoke() {
                return new GetDiagnosticEventRequest((GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetSharedDataTimestamps.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetOperativeEventApi.class)), i.a(new a<GetOperativeEventApi>() {
            public final GetOperativeEventApi invoke() {
                return new GetOperativeEventApi((OperativeEventRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(OperativeEventRepository.class))), (GetOperativeEventRequest) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetOperativeEventRequest.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetOperativeEventRequest.class)), i.a(new a<GetOperativeEventRequest>() {
            public final GetOperativeEventRequest invoke() {
                return new GetOperativeEventRequest((GetByteStringId) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetByteStringId.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(CampaignRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(HandleGatewayEventResponse.class)), i.a(AnonymousClass118.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(OperativeEventObserver.class)), i.a(new a<OperativeEventObserver>() {
            public final OperativeEventObserver invoke() {
                return new OperativeEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetUniversalRequestForPayLoad.class))), (k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, a0.b(k0.class))), (OperativeEventRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(OperativeEventRepository.class))), (UniversalRequestDataSource) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(UniversalRequestDataSource.class))), (BackgroundWorker) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(BackgroundWorker.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(TransactionEventObserver.class)), i.a(new a<TransactionEventObserver>() {
            public final TransactionEventObserver invoke() {
                return new TransactionEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetUniversalRequestForPayLoad.class))), (k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, a0.b(k0.class))), (TransactionEventRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(TransactionEventRepository.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GatewayClient.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, a0.b(GetRequestPolicy.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, a0.b(ByteStringDataSource.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(UniversalRequestEventSender.class)), i.a(new a<UniversalRequestEventSender>() {
            public final UniversalRequestEventSender invoke() {
                return new UniversalRequestEventSender((GatewayClient) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GatewayClient.class))), (HandleGatewayEventResponse) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(HandleGatewayEventResponse.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(OmFinishSession.class)), i.a(new a<OmFinishSession>() {
            public final OmFinishSession invoke() {
                return new AndroidOmFinishSession((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(OmImpressionOccurred.class)), i.a(new a<OmImpressionOccurred>() {
            public final OmImpressionOccurred invoke() {
                return new AndroidOmImpressionOccurred((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AndroidOmInteraction.class)), i.a(new a<AndroidOmInteraction>() {
            public final AndroidOmInteraction invoke() {
                return new AndroidOmStartSession((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetOmData.class)), i.a(new a<GetOmData>() {
            public final GetOmData invoke() {
                return new CommonGetOmData((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(OpenMeasurementRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(IsOMActivated.class)), i.a(new a<IsOMActivated>() {
            public final IsOMActivated invoke() {
                return new CommonIsOMActivated((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(OpenMeasurementRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeOMSDK.class)), i.a(new a<InitializeOMSDK>() {
            public final InitializeOMSDK invoke() {
                return new InitializeOMAndroidSDK((Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))), (OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(OpenMeasurementRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, a0.b(cls)), i.a(AnonymousClass128.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, a0.b(cls)), i.a(AnonymousClass129.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(BackgroundWorker.class)), i.a(new a<BackgroundWorker>() {
            public final BackgroundWorker invoke() {
                return new BackgroundWorker((Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DiagnosticEventRequestWorkModifier.class)), i.a(new a<DiagnosticEventRequestWorkModifier>() {
            public final DiagnosticEventRequestWorkModifier invoke() {
                return new DiagnosticEventRequestWorkModifier((SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))), (LifecycleDataSource) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(LifecycleDataSource.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GatewayClient.class)), i.a(new a<GatewayClient>() {
            public final GatewayClient invoke() {
                return new CommonGatewayClient((HttpClient) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(HttpClient.class))), (HandleGatewayUniversalResponse) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(HandleGatewayUniversalResponse.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_SDK, a0.b(l0.class)), i.a(new a<l0>() {
            public final l0 invoke() {
                return new SDKErrorHandler((k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, a0.b(k0.class))), (AlternativeFlowReader) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AlternativeFlowReader.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class))), (SDKMetricsSender) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SDKMetricsSender.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(TokenStorage.class)), i.a(AnonymousClass134.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(VolumeChange.class)), i.a(AnonymousClass135.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ConfigFileFromLocalStorage.class)), i.a(new a<ConfigFileFromLocalStorage>() {
            public final ConfigFileFromLocalStorage invoke() {
                return new ConfigFileFromLocalStorage((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeSDK.class)), i.a(new a<InitializeSDK>() {
            public final InitializeSDK invoke() {
                return new InitializeSDK((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class))), (ConfigFileFromLocalStorage) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ConfigFileFromLocalStorage.class))), (InitializeStateReset) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeStateReset.class))), (InitializeStateError) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeStateError.class))), (InitializeStateConfig) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeStateConfig.class))), (InitializeStateCreate) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeStateCreate.class))), (InitializeStateLoadCache) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeStateLoadCache.class))), (InitializeStateLoadWeb) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeStateLoadWeb.class))), (InitializeStateComplete) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeStateComplete.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeStateComplete.class)), i.a(new a<InitializeStateComplete>() {
            public final InitializeStateComplete invoke() {
                return new InitializeStateComplete((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeStateConfig.class)), i.a(new a<InitializeStateConfig>() {
            public final InitializeStateConfig invoke() {
                return new InitializeStateConfig((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class))), (InitializeStateConfigWithLoader) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeStateConfigWithLoader.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeStateConfigWithLoader.class)), i.a(new a<InitializeStateConfigWithLoader>() {
            public final InitializeStateConfigWithLoader invoke() {
                return new InitializeStateConfigWithLoader((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class))), (InitializeStateNetworkError) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeStateNetworkError.class))), (TokenStorage) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(TokenStorage.class))), (SDKMetricsSender) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SDKMetricsSender.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeStateCreate.class)), i.a(new a<InitializeStateCreate>() {
            public final InitializeStateCreate invoke() {
                return new InitializeStateCreate((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeStateError.class)), i.a(new a<InitializeStateError>() {
            public final InitializeStateError invoke() {
                return new InitializeStateError((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeStateLoadCache.class)), i.a(new a<InitializeStateLoadCache>() {
            public final InitializeStateLoadCache invoke() {
                return new InitializeStateLoadCache((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeStateLoadWeb.class)), i.a(new a<InitializeStateLoadWeb>() {
            public final InitializeStateLoadWeb invoke() {
                return new InitializeStateLoadWeb((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class))), (InitializeStateNetworkError) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeStateNetworkError.class))), (HttpClient) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(HttpClient.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeStateReset.class)), i.a(new a<InitializeStateReset>() {
            public final InitializeStateReset invoke() {
                return new InitializeStateReset((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(StoreMonitor.class)), i.a(new a<StoreMonitor>() {
            public final StoreMonitor invoke() {
                return new StoreMonitor((StoreExceptionHandler) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(StoreExceptionHandler.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(StoreWebViewEventSender.class)), i.a(new a<StoreWebViewEventSender>() {
            public final StoreWebViewEventSender invoke() {
                return new StoreWebViewEventSender((IEventSender) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(IEventSender.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(StoreExceptionHandler.class)), i.a(AnonymousClass148.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(StoreEventListenerFactory.class)), i.a(new a<StoreEventListenerFactory>() {
            public final StoreEventListenerFactory invoke() {
                return new StoreEventListenerFactory((StoreWebViewEventSender) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(StoreWebViewEventSender.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ConfigurationReader.class)), i.a(AnonymousClass150.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AdPlayerScope.class)), ServiceFactoryKt.factoryOf(new a<AdPlayerScope>() {
            public final AdPlayerScope invoke() {
                return new AdPlayerScope((k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, a0.b(k0.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AndroidWebViewClient.class)), ServiceFactoryKt.factoryOf(new a<AndroidWebViewClient>() {
            public final AndroidWebViewClient invoke() {
                return new AndroidWebViewClient((GetWebViewCacheAssetLoader) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetWebViewCacheAssetLoader.class))), (GetAdAssetLoader) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetAdAssetLoader.class))), (GetCachedAsset) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetCachedAsset.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AndroidGetWebViewContainerUseCase.class)), ServiceFactoryKt.factoryOf(new a<AndroidGetWebViewContainerUseCase>() {
            public final AndroidGetWebViewContainerUseCase invoke() {
                Class<k0> cls = k0.class;
                return new AndroidGetWebViewContainerUseCase((Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))), (AndroidWebViewClient) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AndroidWebViewClient.class))), (SendWebViewClientErrorDiagnostics) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendWebViewClientErrorDiagnostics.class))), (k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, a0.b(cls))), (k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, a0.b(cls))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Load.class)), ServiceFactoryKt.factoryOf(new a<Load>() {
            public final Load invoke() {
                return new AndroidLoad((k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, a0.b(k0.class))), (GetAdRequest) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetAdRequest.class))), (GetAdPlayerConfigRequest) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetAdPlayerConfigRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, a0.b(GetRequestPolicy.class))), (HandleGatewayAdResponse) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(HandleGatewayAdResponse.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GatewayClient.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AdRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AwaitInitialization.class)), ServiceFactoryKt.factoryOf(new a<AwaitInitialization>() {
            public final AwaitInitialization invoke() {
                return new CommonAwaitInitialization((SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetAsyncHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new a<GetAsyncHeaderBiddingToken>() {
            public final GetAsyncHeaderBiddingToken invoke() {
                return new CommonInitAwaitingGetHeaderBiddingToken((GetHeaderBiddingToken) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetHeaderBiddingToken.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class))), (GetInitializationState) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetInitializationState.class))), (AwaitInitialization) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AwaitInitialization.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetAdPlayer.class)), ServiceFactoryKt.factoryOf(new a<GetAdPlayer>() {
            public final GetAdPlayer invoke() {
                return new CommonGetAdPlayer((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))), (ExecuteAdViewerRequest) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ExecuteAdViewerRequest.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class))), (k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, a0.b(k0.class))), (p0) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AdPlayerScope.class))), (OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(OpenMeasurementRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(HandleGatewayAdResponse.class)), ServiceFactoryKt.factoryOf(new a<HandleGatewayAdResponse>() {
            public final HandleGatewayAdResponse invoke() {
                return new HandleGatewayAndroidAdResponse((AdRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AdRepository.class))), (AndroidGetWebViewContainerUseCase) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AndroidGetWebViewContainerUseCase.class))), (GetWebViewBridgeUseCase) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetWebViewBridgeUseCase.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(DeviceInfoRepository.class))), (HandleInvocationsFromAdViewer) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(HandleInvocationsFromAdViewer.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(CampaignRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class))), (GetOperativeEventApi) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetOperativeEventApi.class))), (GetLatestWebViewConfiguration) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetLatestWebViewConfiguration.class))), (AdPlayerScope) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AdPlayerScope.class))), (GetAdPlayer) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetAdPlayer.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(HandleInvocationsFromAdViewer.class)), ServiceFactoryKt.factoryOf(AnonymousClass159.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(LegacyLoadUseCase.class)), ServiceFactoryKt.factoryOf(new a<LegacyLoadUseCase>() {
            public final LegacyLoadUseCase invoke() {
                return new LegacyLoadUseCase((k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, a0.b(k0.class))), (Load) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Load.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SendDiagnosticEvent.class))), (GetInitializationState) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetInitializationState.class))), (AwaitInitialization) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AwaitInitialization.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(SessionRepository.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(AdRepository.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(InitializeStateNetworkError.class)), ServiceFactoryKt.factoryOf(new a<InitializeStateNetworkError>() {
            public final InitializeStateNetworkError invoke() {
                return new InitializeStateNetworkError((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetAdAssetLoader.class)), i.a(new a<GetAdAssetLoader>() {
            public final GetAdAssetLoader invoke() {
                return GetAdAssetLoaderKt.provideGetAdCacheAssetLoader((Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(GetWebViewCacheAssetLoader.class)), i.a(new a<GetWebViewCacheAssetLoader>() {
            public final GetWebViewCacheAssetLoader invoke() {
                return GetWebViewAssetLoaderKt.provideGetWebViewCacheAssetLoader((Context) servicesRegistry.resolveService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(Context.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(MaxReward.DEFAULT_LABEL, a0.b(CoroutineTimer.class)), ServiceFactoryKt.factoryOf(new a<CoroutineTimer>() {
            public final CoroutineTimer invoke() {
                return new CommonCoroutineTimer((k0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, a0.b(k0.class))));
            }
        }));
    }
}
