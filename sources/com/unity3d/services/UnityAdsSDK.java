package com.unity3d.services;

import android.content.Context;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SetInitializationState;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.task.InitializeSDK;
import java.util.Map;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import oe.j;
import pe.c2;
import pe.p0;
import pe.r0;
import sd.g;
import sd.k;
import sd.s;
import sd.w;
import xd.d;

/* compiled from: UnityAdsSDK.kt */
public final class UnityAdsSDK implements IServiceComponent {
    public static final UnityAdsSDK INSTANCE;
    private static final g alternativeFlowReader$delegate;
    private static final g context$delegate;
    private static final g getAdObject$delegate;
    private static final g getAsyncHeaderBiddingToken$delegate;
    private static final g getHeaderBiddingToken$delegate;
    private static final g getInitializationState$delegate;
    private static final g initializeBoldSDK$delegate;
    private static final g initializeSDK$delegate;
    private static final g omFinishSession$delegate;
    private static final g sendDiagnosticEvent$delegate;
    private static final g setInitializationState$delegate;
    private static final g showBoldSDK$delegate;

    static {
        UnityAdsSDK unityAdsSDK = new UnityAdsSDK();
        INSTANCE = unityAdsSDK;
        k kVar = k.NONE;
        initializeSDK$delegate = i.b(kVar, new UnityAdsSDK$special$$inlined$inject$default$1(unityAdsSDK, MaxReward.DEFAULT_LABEL));
        alternativeFlowReader$delegate = i.b(kVar, new UnityAdsSDK$special$$inlined$inject$default$2(unityAdsSDK, MaxReward.DEFAULT_LABEL));
        initializeBoldSDK$delegate = i.b(kVar, new UnityAdsSDK$special$$inlined$inject$default$3(unityAdsSDK, MaxReward.DEFAULT_LABEL));
        showBoldSDK$delegate = i.b(kVar, new UnityAdsSDK$special$$inlined$inject$default$4(unityAdsSDK, MaxReward.DEFAULT_LABEL));
        getHeaderBiddingToken$delegate = i.b(kVar, new UnityAdsSDK$special$$inlined$inject$default$5(unityAdsSDK, MaxReward.DEFAULT_LABEL));
        getAsyncHeaderBiddingToken$delegate = i.b(kVar, new UnityAdsSDK$special$$inlined$inject$default$6(unityAdsSDK, MaxReward.DEFAULT_LABEL));
        getInitializationState$delegate = i.b(kVar, new UnityAdsSDK$special$$inlined$inject$default$7(unityAdsSDK, MaxReward.DEFAULT_LABEL));
        sendDiagnosticEvent$delegate = i.b(kVar, new UnityAdsSDK$special$$inlined$inject$default$8(unityAdsSDK, MaxReward.DEFAULT_LABEL));
        omFinishSession$delegate = i.b(kVar, new UnityAdsSDK$special$$inlined$inject$default$9(unityAdsSDK, MaxReward.DEFAULT_LABEL));
        getAdObject$delegate = i.b(kVar, new UnityAdsSDK$special$$inlined$inject$default$10(unityAdsSDK, MaxReward.DEFAULT_LABEL));
        setInitializationState$delegate = i.b(kVar, new UnityAdsSDK$special$$inlined$inject$default$11(unityAdsSDK, MaxReward.DEFAULT_LABEL));
        context$delegate = i.b(kVar, new UnityAdsSDK$special$$inlined$inject$default$12(unityAdsSDK, MaxReward.DEFAULT_LABEL));
    }

    private UnityAdsSDK() {
    }

    private final String fetchToken(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = str;
        long a10 = j.f36786a.a();
        SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_gateway_token_started", (Double) null, k0.j(s.a("sync", str6), s.a("state", getGetInitializationState().invoke().toString())), (Map) null, (AdObject) null, 26, (Object) null);
        String str7 = null;
        if (getGetInitializationState().invoke() != InitializationState.INITIALIZED) {
            str3 = "not_initialized";
            str2 = null;
        } else {
            try {
                str4 = null;
                str7 = getGetHeaderBiddingToken().invoke();
                str5 = null;
            } catch (Exception e10) {
                str5 = ExceptionExtensionsKt.retrieveUnityCrashValue(e10);
                str4 = "uncaught_exception";
            }
            String str8 = str4;
            str2 = str5;
            str3 = str8;
        }
        SendDiagnosticEvent sendDiagnosticEvent = getSendDiagnosticEvent();
        String str9 = str7 == null ? "native_gateway_token_failure_time" : "native_gateway_token_success_time";
        Double valueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(j.a.c(a10)));
        Map c10 = j0.c();
        c10.put("sync", str6);
        c10.put("state", INSTANCE.getGetInitializationState().invoke().toString());
        if (str3 != null) {
            String str10 = (String) c10.put("reason", str3);
        }
        if (str2 != null) {
            c10.put("reason_debug", str2);
        }
        w wVar = w.f38141a;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str9, valueOf, j0.b(c10), (Map) null, (AdObject) null, 24, (Object) null);
        return str7;
    }

    /* access modifiers changed from: private */
    public final AlternativeFlowReader getAlternativeFlowReader() {
        return (AlternativeFlowReader) alternativeFlowReader$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final Context getContext() {
        return (Context) context$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final GetAdObject getGetAdObject() {
        return (GetAdObject) getAdObject$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final GetAsyncHeaderBiddingToken getGetAsyncHeaderBiddingToken() {
        return (GetAsyncHeaderBiddingToken) getAsyncHeaderBiddingToken$delegate.getValue();
    }

    private final GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return (GetHeaderBiddingToken) getHeaderBiddingToken$delegate.getValue();
    }

    private final GetInitializationState getGetInitializationState() {
        return (GetInitializationState) getInitializationState$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final InitializeBoldSDK getInitializeBoldSDK() {
        return (InitializeBoldSDK) initializeBoldSDK$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final InitializeSDK getInitializeSDK() {
        return (InitializeSDK) initializeSDK$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final OmFinishSession getOmFinishSession() {
        return (OmFinishSession) omFinishSession$delegate.getValue();
    }

    private final SendDiagnosticEvent getSendDiagnosticEvent() {
        return (SendDiagnosticEvent) sendDiagnosticEvent$delegate.getValue();
    }

    private final SetInitializationState getSetInitializationState() {
        return (SetInitializationState) setInitializationState$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final LegacyShowUseCase getShowBoldSDK() {
        return (LegacyShowUseCase) showBoldSDK$delegate.getValue();
    }

    public static /* synthetic */ c2 load$default(UnityAdsSDK unityAdsSDK, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            unityBannerSize = null;
        }
        return unityAdsSDK.load(str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize);
    }

    public final void finishOMIDSession(String str) {
        m.e(str, "opportunityId");
        p0 p0Var = (p0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_OMID_SCOPE, a0.b(p0.class));
        c2 unused = k.d(p0Var, (xd.g) null, (r0) null, new UnityAdsSDK$finishOMIDSession$1(str, p0Var, (d<? super UnityAdsSDK$finishOMIDSession$1>) null), 3, (Object) null);
    }

    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public final String getToken() {
        return fetchToken("true");
    }

    public final void initialize() {
        getSetInitializationState().invoke(InitializationState.INITIALIZING);
        p0 p0Var = (p0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_INIT_SCOPE, a0.b(p0.class));
        c2 unused = k.d(p0Var, (xd.g) null, (r0) null, new UnityAdsSDK$initialize$1(p0Var, (d<? super UnityAdsSDK$initialize$1>) null), 3, (Object) null);
    }

    public final boolean isAlternativeFlowEnabled() {
        return getAlternativeFlowReader().invoke();
    }

    public final c2 load(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize) {
        m.e(unityAdsLoadOptions, HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        p0 p0Var = (p0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_LOAD_SCOPE, a0.b(p0.class));
        return k.d(p0Var, (xd.g) null, (r0) null, new UnityAdsSDK$load$1(str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, p0Var, (d<? super UnityAdsSDK$load$1>) null), 3, (Object) null);
    }

    public final c2 show(String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners) {
        m.e(listeners, "listener");
        p0 p0Var = (p0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_SHOW_SCOPE, a0.b(p0.class));
        return k.d(p0Var, (xd.g) null, (r0) null, new UnityAdsSDK$show$1(str, unityAdsShowOptions, listeners, p0Var, (d<? super UnityAdsSDK$show$1>) null), 3, (Object) null);
    }

    public final void getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        p0 p0Var = (p0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_GET_TOKEN_SCOPE, a0.b(p0.class));
        c2 unused = k.d(p0Var, (xd.g) null, (r0) null, new UnityAdsSDK$getToken$1(iUnityAdsTokenListener, p0Var, (d<? super UnityAdsSDK$getToken$1>) null), 3, (Object) null);
    }
}
