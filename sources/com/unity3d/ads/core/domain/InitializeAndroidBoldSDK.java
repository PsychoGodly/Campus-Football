package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.log.DeviceLog;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import oe.i;
import pe.k0;
import sd.w;
import vb.x1;
import xd.d;

/* compiled from: InitializeAndroidBoldSDK.kt */
public final class InitializeAndroidBoldSDK implements InitializeBoldSDK {
    public static final Companion Companion = new Companion((h) null);
    public static final String MSG_GATEWAY_DENIED = "Gateway communication failure";
    public static final String MSG_NETWORK = "Network";
    public static final String MSG_TIMEOUT = "Timeout";
    public static final String MSG_UNKNOWN = "Initialization failure";
    private final ClearCache clearCache;
    private final k0 defaultDispatcher;
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final EventObservers eventObservers;
    /* access modifiers changed from: private */
    public final GatewayClient gatewayClient;
    /* access modifiers changed from: private */
    public final GetInitializationRequest getInitializeRequest;
    /* access modifiers changed from: private */
    public final GetRequestPolicy getRequestPolicy;
    /* access modifiers changed from: private */
    public final HandleGatewayInitializationResponse handleGatewayInitializationResponse;
    private final InitializeOMSDK initializeOM;
    private final ConfigurationReader legacyConfigurationReader;
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final StorageManager storageManager;
    private final TriggerInitializeListener triggerInitializeListener;

    /* compiled from: InitializeAndroidBoldSDK.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public InitializeAndroidBoldSDK(k0 k0Var, InitializeOMSDK initializeOMSDK, GetInitializationRequest getInitializationRequest, GetRequestPolicy getRequestPolicy2, ClearCache clearCache2, HandleGatewayInitializationResponse handleGatewayInitializationResponse2, GatewayClient gatewayClient2, SessionRepository sessionRepository2, EventObservers eventObservers2, TriggerInitializeListener triggerInitializeListener2, SendDiagnosticEvent sendDiagnosticEvent2, DiagnosticEventRepository diagnosticEventRepository2, StorageManager storageManager2, ConfigurationReader configurationReader, SDKPropertiesManager sDKPropertiesManager) {
        k0 k0Var2 = k0Var;
        InitializeOMSDK initializeOMSDK2 = initializeOMSDK;
        GetInitializationRequest getInitializationRequest2 = getInitializationRequest;
        GetRequestPolicy getRequestPolicy3 = getRequestPolicy2;
        ClearCache clearCache3 = clearCache2;
        HandleGatewayInitializationResponse handleGatewayInitializationResponse3 = handleGatewayInitializationResponse2;
        GatewayClient gatewayClient3 = gatewayClient2;
        SessionRepository sessionRepository3 = sessionRepository2;
        EventObservers eventObservers3 = eventObservers2;
        TriggerInitializeListener triggerInitializeListener3 = triggerInitializeListener2;
        SendDiagnosticEvent sendDiagnosticEvent3 = sendDiagnosticEvent2;
        DiagnosticEventRepository diagnosticEventRepository3 = diagnosticEventRepository2;
        StorageManager storageManager3 = storageManager2;
        ConfigurationReader configurationReader2 = configurationReader;
        SDKPropertiesManager sDKPropertiesManager2 = sDKPropertiesManager;
        m.e(k0Var2, "defaultDispatcher");
        m.e(initializeOMSDK2, "initializeOM");
        m.e(getInitializationRequest2, "getInitializeRequest");
        m.e(getRequestPolicy3, "getRequestPolicy");
        m.e(clearCache3, "clearCache");
        m.e(handleGatewayInitializationResponse3, "handleGatewayInitializationResponse");
        m.e(gatewayClient3, "gatewayClient");
        m.e(sessionRepository3, "sessionRepository");
        m.e(eventObservers3, "eventObservers");
        m.e(triggerInitializeListener3, "triggerInitializeListener");
        m.e(sendDiagnosticEvent3, "sendDiagnosticEvent");
        m.e(diagnosticEventRepository3, "diagnosticEventRepository");
        m.e(storageManager3, "storageManager");
        m.e(configurationReader2, "legacyConfigurationReader");
        m.e(sDKPropertiesManager2, "sdkPropertiesManager");
        this.defaultDispatcher = k0Var2;
        this.initializeOM = initializeOMSDK2;
        this.getInitializeRequest = getInitializationRequest2;
        this.getRequestPolicy = getRequestPolicy3;
        this.clearCache = clearCache3;
        this.handleGatewayInitializationResponse = handleGatewayInitializationResponse3;
        this.gatewayClient = gatewayClient3;
        this.sessionRepository = sessionRepository3;
        this.eventObservers = eventObservers3;
        this.triggerInitializeListener = triggerInitializeListener3;
        this.sendDiagnosticEvent = sendDiagnosticEvent3;
        this.diagnosticEventRepository = diagnosticEventRepository3;
        this.storageManager = storageManager3;
        this.legacyConfigurationReader = configurationReader2;
        this.sdkPropertiesManager = sDKPropertiesManager2;
    }

    /* access modifiers changed from: private */
    public final void checkCanInitialize() {
        if (!this.sessionRepository.getShouldInitialize()) {
            throw new InitializationException(MSG_GATEWAY_DENIED, (Throwable) null, "gateway", (String) null, 10, (h) null);
        }
    }

    private final Map<String, String> getTags(InitializationException initializationException) {
        Map c10 = j0.c();
        c10.put("operation", OperationType.INITIALIZATION.toString());
        c10.put("reason", initializationException.getReason());
        if (initializationException.getReasonDebug() != null) {
            c10.put("reason_debug", initializationException.getReasonDebug());
        }
        return j0.b(c10);
    }

    /* access modifiers changed from: private */
    public final void initializationFailure(i iVar, InitializationException initializationException) {
        DeviceLog.debug("Unity Ads Initialization Failure: " + initializationException.getMessage());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialize_task_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), getTags(initializationException), (Map) null, (AdObject) null, 24, (Object) null);
        this.triggerInitializeListener.error(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, initializationException.getMessage());
        this.sessionRepository.setInitializationState(InitializationState.FAILED);
        this.sdkPropertiesManager.setInitialized(false);
        setupDiagnosticEvents();
    }

    /* access modifiers changed from: private */
    public final Object initializationStart(d<? super w> dVar) {
        DeviceLog.debug("Unity Ads Initialization Start");
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialization_started", (Double) null, (Map) null, (Map) null, (AdObject) null, 30, (Object) null);
        this.sessionRepository.setInitializationState(InitializationState.INITIALIZING);
        Object invoke = this.eventObservers.invoke(dVar);
        return invoke == d.c() ? invoke : w.f38141a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0098 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object initializationSuccess(oe.i r17, xd.d<? super sd.w> r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.InitializeAndroidBoldSDK$initializationSuccess$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.unity3d.ads.core.domain.InitializeAndroidBoldSDK$initializationSuccess$1 r2 = (com.unity3d.ads.core.domain.InitializeAndroidBoldSDK$initializationSuccess$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.unity3d.ads.core.domain.InitializeAndroidBoldSDK$initializationSuccess$1 r2 = new com.unity3d.ads.core.domain.InitializeAndroidBoldSDK$initializationSuccess$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = yd.d.c()
            int r4 = r2.label
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x004f
            if (r4 == r7) goto L_0x0047
            if (r4 == r6) goto L_0x003f
            if (r4 != r5) goto L_0x0037
            java.lang.Object r2 = r2.L$0
            com.unity3d.ads.core.domain.InitializeAndroidBoldSDK r2 = (com.unity3d.ads.core.domain.InitializeAndroidBoldSDK) r2
            sd.p.b(r1)
            goto L_0x009a
        L_0x0037:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003f:
            java.lang.Object r4 = r2.L$0
            com.unity3d.ads.core.domain.InitializeAndroidBoldSDK r4 = (com.unity3d.ads.core.domain.InitializeAndroidBoldSDK) r4
            sd.p.b(r1)
            goto L_0x008c
        L_0x0047:
            java.lang.Object r4 = r2.L$0
            com.unity3d.ads.core.domain.InitializeAndroidBoldSDK r4 = (com.unity3d.ads.core.domain.InitializeAndroidBoldSDK) r4
            sd.p.b(r1)
            goto L_0x007f
        L_0x004f:
            sd.p.b(r1)
            java.lang.String r1 = "Unity Ads Initialization Success"
            com.unity3d.services.core.log.DeviceLog.debug(r1)
            com.unity3d.ads.core.domain.SendDiagnosticEvent r8 = r0.sendDiagnosticEvent
            double r9 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r17)
            java.lang.Double r10 = kotlin.coroutines.jvm.internal.b.b(r9)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 28
            r15 = 0
            java.lang.String r9 = "native_initialize_task_success_time"
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r8, r9, r10, r11, r12, r13, r14, r15)
            com.unity3d.ads.core.data.manager.StorageManager r1 = r0.storageManager
            r1.hasInitialized()
            com.unity3d.ads.core.domain.om.InitializeOMSDK r1 = r0.initializeOM
            r2.L$0 = r0
            r2.label = r7
            java.lang.Object r1 = r1.invoke(r2)
            if (r1 != r3) goto L_0x007e
            return r3
        L_0x007e:
            r4 = r0
        L_0x007f:
            com.unity3d.ads.core.domain.ClearCache r1 = r4.clearCache
            r2.L$0 = r4
            r2.label = r6
            java.lang.Object r1 = r1.invoke(r2)
            if (r1 != r3) goto L_0x008c
            return r3
        L_0x008c:
            com.unity3d.ads.core.data.repository.SessionRepository r1 = r4.sessionRepository
            r2.L$0 = r4
            r2.label = r5
            java.lang.Object r1 = r1.persistNativeConfiguration(r2)
            if (r1 != r3) goto L_0x0099
            return r3
        L_0x0099:
            r2 = r4
        L_0x009a:
            com.unity3d.services.core.configuration.ConfigurationReader r1 = r2.legacyConfigurationReader
            com.unity3d.services.core.configuration.Configuration r1 = r1.getCurrentConfiguration()
            r1.deleteFromDisk()
            com.unity3d.ads.core.domain.TriggerInitializeListener r1 = r2.triggerInitializeListener
            r1.success()
            com.unity3d.ads.core.data.repository.SessionRepository r1 = r2.sessionRepository
            com.unity3d.ads.core.data.model.InitializationState r3 = com.unity3d.ads.core.data.model.InitializationState.INITIALIZED
            r1.setInitializationState(r3)
            com.unity3d.ads.core.data.manager.SDKPropertiesManager r1 = r2.sdkPropertiesManager
            r1.setInitialized(r7)
            r2.setupDiagnosticEvents()
            sd.w r1 = sd.w.f38141a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.InitializeAndroidBoldSDK.initializationSuccess(oe.i, xd.d):java.lang.Object");
    }

    private final void setupDiagnosticEvents() {
        x1 p02 = this.sessionRepository.getNativeConfiguration().p0();
        DiagnosticEventRepository diagnosticEventRepository2 = this.diagnosticEventRepository;
        m.d(p02, "config");
        diagnosticEventRepository2.configure(p02);
    }

    public Object invoke(d<? super w> dVar) {
        Object g10 = pe.i.g(this.defaultDispatcher, new InitializeAndroidBoldSDK$invoke$2(this, (d<? super InitializeAndroidBoldSDK$invoke$2>) null), dVar);
        return g10 == d.c() ? g10 : w.f38141a;
    }
}
