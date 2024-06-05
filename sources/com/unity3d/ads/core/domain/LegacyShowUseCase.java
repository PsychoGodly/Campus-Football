package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import fe.t;
import java.util.Map;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import oe.i;
import pe.k0;
import sd.s;
import sd.w;
import se.v;
import vb.d2;
import vb.g2;
import vb.h2;
import vb.j2;
import xd.d;

/* compiled from: LegacyShowUseCase.kt */
public final class LegacyShowUseCase {
    public static final Companion Companion = new Companion((h) null);
    public static final String KEY_OBJECT_ID = "objectId";
    public static final String MESSAGE_AD_PLAYER_UNAVAILABLE = "Ad player is unavailable.";
    public static final String MESSAGE_ALREADY_SHOWING = "Can't show a new ad unit when ad unit is already open";
    public static final String MESSAGE_NO_AD_OBJECT = "No ad object found for opportunity id: ";
    public static final String MESSAGE_OPPORTUNITY_ID = "No valid opportunity id provided";
    public static final String MESSAGE_OPT_TIMEOUT = "timeout";
    public static final String MESSAGE_TIMEOUT = "[UnityAds] Timeout while trying to show ";
    public static final String MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING = "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad";
    /* access modifiers changed from: private */
    public AdObject adObject;
    private final AdRepository adRepository;
    /* access modifiers changed from: private */
    public final k0 dispatcher;
    private final GetInitializationState getInitializationState;
    private final GetOperativeEventApi getOperativeEventApi;
    /* access modifiers changed from: private */
    public final v<Boolean> hasStarted;
    /* access modifiers changed from: private */
    public volatile boolean isFullscreenAdShowing;
    private String placement;
    /* access modifiers changed from: private */
    public final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    /* access modifiers changed from: private */
    public final Show show;
    /* access modifiers changed from: private */
    public final v<Boolean> timeoutCancellationRequested;
    private UnityAdsShowOptions unityAdsShowOptions;

    /* compiled from: LegacyShowUseCase.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public LegacyShowUseCase(k0 k0Var, Show show2, AdRepository adRepository2, SendDiagnosticEvent sendDiagnosticEvent2, GetOperativeEventApi getOperativeEventApi2, GetInitializationState getInitializationState2, SessionRepository sessionRepository2) {
        m.e(k0Var, "dispatcher");
        m.e(show2, "show");
        m.e(adRepository2, "adRepository");
        m.e(sendDiagnosticEvent2, "sendDiagnosticEvent");
        m.e(getOperativeEventApi2, "getOperativeEventApi");
        m.e(getInitializationState2, "getInitializationState");
        m.e(sessionRepository2, "sessionRepository");
        this.dispatcher = k0Var;
        this.show = show2;
        this.adRepository = adRepository2;
        this.sendDiagnosticEvent = sendDiagnosticEvent2;
        this.getOperativeEventApi = getOperativeEventApi2;
        this.getInitializationState = getInitializationState2;
        this.sessionRepository = sessionRepository2;
        Boolean bool = Boolean.FALSE;
        this.hasStarted = se.k0.a(bool);
        this.timeoutCancellationRequested = se.k0.a(bool);
    }

    /* access modifiers changed from: private */
    public final void bannerLeftApplication(i iVar, String str, Listeners listeners) {
        DeviceLog.debug("Unity Ads Show Left Application for placement " + str);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_left_app", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), (Map) null, (Map) null, this.adObject, 12, (Object) null);
        listeners.onLeftApplication(str);
    }

    /* access modifiers changed from: private */
    public final void cancelTimeout(i iVar) {
        this.timeoutCancellationRequested.setValue(Boolean.TRUE);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_cancel_timeout", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), (Map) null, (Map) null, this.adObject, 12, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r3 = r3.opt("objectId");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getOpportunityId(com.unity3d.ads.UnityAdsShowOptions r3) {
        /*
            r2 = this;
            org.json.JSONObject r3 = r3.getData()
            r0 = 0
            if (r3 == 0) goto L_0x0014
            java.lang.String r1 = "objectId"
            java.lang.Object r3 = r3.opt(r1)
            if (r3 == 0) goto L_0x0014
            java.lang.String r3 = r3.toString()
            goto L_0x0015
        L_0x0014:
            r3 = r0
        L_0x0015:
            java.util.UUID r3 = java.util.UUID.fromString(r3)     // Catch:{ all -> 0x001d }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x001d }
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.getOpportunityId(com.unity3d.ads.UnityAdsShowOptions):java.lang.String");
    }

    /* access modifiers changed from: private */
    public final Map<String, String> getTags(String str, Integer num, String str2) {
        Map<String, String> l10 = k0.l(s.a("operation", OperationType.SHOW.toString()), s.a("reason", str), s.a("show_has_started", String.valueOf(this.hasStarted.getValue().booleanValue())));
        if (num != null) {
            String put = l10.put("reason_code", String.valueOf(num.intValue()));
        }
        if (str2 != null) {
            l10.put("reason_debug", str2);
        }
        return l10;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getTmpAdObject(xd.d<? super com.unity3d.ads.core.data.model.AdObject> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.core.domain.LegacyShowUseCase$getTmpAdObject$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.unity3d.ads.core.domain.LegacyShowUseCase$getTmpAdObject$1 r0 = (com.unity3d.ads.core.domain.LegacyShowUseCase$getTmpAdObject$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.LegacyShowUseCase$getTmpAdObject$1 r0 = new com.unity3d.ads.core.domain.LegacyShowUseCase$getTmpAdObject$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.LegacyShowUseCase r0 = (com.unity3d.ads.core.domain.LegacyShowUseCase) r0
            sd.p.b(r14)
            goto L_0x005d
        L_0x002d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0035:
            sd.p.b(r14)
            com.unity3d.ads.UnityAdsShowOptions r14 = r13.unityAdsShowOptions
            if (r14 == 0) goto L_0x0041
            java.lang.String r14 = r13.getOpportunityId(r14)
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            java.util.UUID r14 = java.util.UUID.fromString(r14)
            java.lang.String r2 = "fromString(opportunityId)"
            kotlin.jvm.internal.m.d(r14, r2)
            com.google.protobuf.i r14 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(r14)
            com.unity3d.ads.core.data.repository.AdRepository r2 = r13.adRepository
            r0.L$0 = r13
            r0.label = r3
            java.lang.Object r14 = r2.getAd(r14, r0)
            if (r14 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r0 = r13
        L_0x005d:
            com.unity3d.ads.core.data.model.AdObject r14 = (com.unity3d.ads.core.data.model.AdObject) r14
            if (r14 == 0) goto L_0x0062
            return r14
        L_0x0062:
            com.unity3d.ads.UnityAdsShowOptions r14 = r0.unityAdsShowOptions
            if (r14 != 0) goto L_0x006b
            com.unity3d.ads.UnityAdsShowOptions r14 = new com.unity3d.ads.UnityAdsShowOptions
            r14.<init>()
        L_0x006b:
            com.unity3d.ads.core.data.model.AdObject r12 = new com.unity3d.ads.core.data.model.AdObject
            java.lang.String r14 = r0.getOpportunityId(r14)
            if (r14 == 0) goto L_0x0079
            com.google.protobuf.i r14 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859ByteString(r14)
            if (r14 != 0) goto L_0x007b
        L_0x0079:
            com.google.protobuf.i r14 = com.google.protobuf.i.f27039b
        L_0x007b:
            r2 = r14
            java.lang.String r14 = "getOpportunityId(showOpt…ing() ?: ByteString.EMPTY"
            kotlin.jvm.internal.m.d(r2, r14)
            java.lang.String r14 = r0.placement
            if (r14 != 0) goto L_0x0087
            java.lang.String r14 = ""
        L_0x0087:
            r3 = r14
            com.google.protobuf.i r4 = com.google.protobuf.i.f27039b
            java.lang.String r14 = "EMPTY"
            kotlin.jvm.internal.m.d(r4, r14)
            r5 = 0
            r6 = 0
            com.unity3d.ads.UnityAdsLoadOptions r7 = new com.unity3d.ads.UnityAdsLoadOptions
            r7.<init>()
            r14 = 0
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r14)
            vb.r0 r9 = vb.r0.DIAGNOSTIC_AD_TYPE_UNSPECIFIED
            r10 = 16
            r11 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.getTmpAdObject(xd.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Object sendOperativeError(h2 h2Var, String str, AdObject adObject2, d<? super w> dVar) {
        d2.a aVar = d2.f38934b;
        g2.a h02 = g2.h0();
        m.d(h02, "newBuilder()");
        d2 a10 = aVar.a(h02);
        a10.b(h2Var);
        a10.c(str);
        g2 a11 = a10.a();
        GetOperativeEventApi getOperativeEventApi2 = this.getOperativeEventApi;
        j2 j2Var = j2.OPERATIVE_EVENT_TYPE_SHOW_ERROR;
        com.google.protobuf.i e10 = a11.e();
        m.d(e10, "errorData.toByteString()");
        Object invoke = getOperativeEventApi2.invoke(j2Var, adObject2, e10, dVar);
        return invoke == d.c() ? invoke : w.f38141a;
    }

    /* access modifiers changed from: private */
    public final Object showClicked(i iVar, String str, Listeners listeners, d<? super w> dVar) {
        DeviceLog.debug("Unity Ads Show Clicked for placement " + str);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_clicked", b.b(TimeExtensionsKt.elapsedMillis(iVar)), (Map) null, (Map) null, this.adObject, 12, (Object) null);
        Object g10 = pe.i.g(this.dispatcher, new LegacyShowUseCase$showClicked$2(listeners, str, (d<? super LegacyShowUseCase$showClicked$2>) null), dVar);
        return g10 == d.c() ? g10 : w.f38141a;
    }

    /* access modifiers changed from: private */
    public final Object showCompleted(i iVar, String str, ShowStatus showStatus, Listeners listeners, d<? super w> dVar) {
        DeviceLog.debug("Unity Ads Show Completed for placement " + str);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_success_time", b.b(TimeExtensionsKt.elapsedMillis(iVar)), (Map) null, (Map) null, this.adObject, 12, (Object) null);
        Object g10 = pe.i.g(this.dispatcher, new LegacyShowUseCase$showCompleted$2(listeners, str, showStatus, (d<? super LegacyShowUseCase$showCompleted$2>) null), dVar);
        return g10 == d.c() ? g10 : w.f38141a;
    }

    private final t<String, UnityAds.UnityAdsShowError, String, Integer, String, d<? super w>, Object> showError(i iVar, String str, Listeners listeners) {
        return new LegacyShowUseCase$showError$1(str, this, iVar, listeners, (d<? super LegacyShowUseCase$showError$1>) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object showStart(xd.d<? super sd.w> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.LegacyShowUseCase$showStart$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.unity3d.ads.core.domain.LegacyShowUseCase$showStart$1 r0 = (com.unity3d.ads.core.domain.LegacyShowUseCase$showStart$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.LegacyShowUseCase$showStart$1 r0 = new com.unity3d.ads.core.domain.LegacyShowUseCase$showStart$1
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.SendDiagnosticEvent r0 = (com.unity3d.ads.core.domain.SendDiagnosticEvent) r0
            sd.p.b(r10)
            goto L_0x0051
        L_0x0031:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0039:
            sd.p.b(r10)
            com.unity3d.ads.core.domain.SendDiagnosticEvent r10 = r9.sendDiagnosticEvent
            java.lang.String r2 = "native_show_started"
            r0.L$0 = r10
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r0 = r9.getTmpAdObject(r0)
            if (r0 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r1 = r2
            r8 = r0
            r0 = r10
            r10 = r8
        L_0x0051:
            r4 = 0
            r3 = 0
            r2 = 0
            r5 = r10
            com.unity3d.ads.core.data.model.AdObject r5 = (com.unity3d.ads.core.data.model.AdObject) r5
            r6 = 14
            r7 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r0, r1, r2, r3, r4, r5, r6, r7)
            sd.w r10 = sd.w.f38141a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.showStart(xd.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Object showStarted(i iVar, String str, Listeners listeners, d<? super w> dVar) {
        DeviceLog.debug("Unity Ads Show WV Start for placement " + str);
        this.hasStarted.setValue(b.a(true));
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_wv_started", b.b(TimeExtensionsKt.elapsedMillis(iVar)), (Map) null, (Map) null, this.adObject, 12, (Object) null);
        Object g10 = pe.i.g(this.dispatcher, new LegacyShowUseCase$showStarted$2(listeners, str, (d<? super LegacyShowUseCase$showStarted$2>) null), dVar);
        return g10 == d.c() ? g10 : w.f38141a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02fe, code lost:
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02ff, code lost:
        if (r1 != 0) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0301, code lost:
        r2.isFullscreenAdShowing = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0306, code lost:
        return sd.w.f38141a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ea, code lost:
        r3 = oe.j.a.c(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ee, code lost:
        if (r10 != null) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f0, code lost:
        r9 = com.applovin.mediation.MaxReward.DEFAULT_LABEL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f3, code lost:
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f4, code lost:
        r3 = r1.showError(r3, r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f8, code lost:
        if (r10 != null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fa, code lost:
        r7 = com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
        r11.L$0 = null;
        r11.L$1 = null;
        r11.L$2 = null;
        r11.L$3 = null;
        r11.L$4 = null;
        r11.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0114, code lost:
        if (r3.invoke("placement_null", r7, com.unity3d.ads.core.data.model.LoadResult.MSG_PLACEMENT_NULL, null, null, r11) != r4) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0116, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0119, code lost:
        return sd.w.f38141a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0122, code lost:
        if (r1.getInitializationState.invoke() == com.unity3d.ads.core.data.model.InitializationState.INITIALIZED) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0124, code lost:
        r7 = com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_INITIALIZED;
        r11.L$0 = null;
        r11.L$1 = null;
        r11.L$2 = null;
        r11.L$3 = null;
        r11.L$4 = null;
        r11.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x013e, code lost:
        if (r3.invoke("not_initialized", r7, com.unity3d.ads.core.data.model.LoadResult.MSG_NOT_INITIALIZED, null, null, r11) != r4) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0140, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0143, code lost:
        return sd.w.f38141a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0144, code lost:
        if (r2 == null) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0146, code lost:
        r9 = r1.getOpportunityId(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014b, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014c, code lost:
        if (r9 != null) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014e, code lost:
        r7 = com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
        r11.L$0 = null;
        r11.L$1 = null;
        r11.L$2 = null;
        r11.L$3 = null;
        r11.L$4 = null;
        r11.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0168, code lost:
        if (r3.invoke("no_opportunity_id", r7, MESSAGE_OPPORTUNITY_ID, null, null, r11) != r4) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x016a, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016d, code lost:
        return sd.w.f38141a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016e, code lost:
        r15 = java.util.UUID.fromString(r9);
        kotlin.jvm.internal.m.d(r15, "fromString(opportunityId)");
        r6 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(r15);
        r15 = r1.adRepository;
        r11.L$0 = r1;
        r11.L$1 = r12;
        r11.L$2 = r10;
        r11.L$3 = r2;
        r11.L$4 = r5;
        r11.L$5 = r3;
        r11.L$6 = r9;
        r11.J$0 = r13;
        r11.label = 5;
        r6 = r15.getAd(r6, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0194, code lost:
        if (r6 != r4) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0196, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0197, code lost:
        r18 = r13;
        r14 = r12;
        r12 = r2;
        r2 = r1;
        r1 = r5;
        r5 = r9;
        r9 = r3;
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01a0, code lost:
        r3 = (com.unity3d.ads.core.data.model.AdObject) r3;
        r2.adObject = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a4, code lost:
        if (r3 != null) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01a6, code lost:
        r7 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
        r1 = MESSAGE_NO_AD_OBJECT + r5;
        r11.L$0 = null;
        r11.L$1 = null;
        r11.L$2 = null;
        r11.L$3 = null;
        r11.L$4 = null;
        r11.L$5 = null;
        r11.L$6 = null;
        r11.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01d5, code lost:
        if (r9.invoke("ad_object_not_found", r7, r1, null, null, r11) != r4) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01d7, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01da, code lost:
        return sd.w.f38141a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01db, code lost:
        r5 = r3.getAdPlayer();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01df, code lost:
        if (r5 == null) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01e1, code lost:
        r5 = r5.getScope();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01e5, code lost:
        if (r5 == null) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01eb, code lost:
        if (pe.q0.g(r5) != false) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ed, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ef, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01f0, code lost:
        if (r5 == false) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01f2, code lost:
        r7 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
        r11.L$0 = null;
        r11.L$1 = null;
        r11.L$2 = null;
        r11.L$3 = null;
        r11.L$4 = null;
        r11.L$5 = null;
        r11.L$6 = null;
        r11.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0211, code lost:
        if (r9.invoke("ad_player_scope_not_active", r7, MESSAGE_AD_PLAYER_UNAVAILABLE, null, null, r11) != r4) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0213, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0216, code lost:
        return sd.w.f38141a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0217, code lost:
        r5 = r3.getAdPlayer() instanceof com.unity3d.ads.adplayer.EmbeddableAdPlayer;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x021d, code lost:
        if (r5 != false) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0221, code lost:
        if (r2.isFullscreenAdShowing == false) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0223, code lost:
        r7 = com.unity3d.ads.UnityAds.UnityAdsShowError.ALREADY_SHOWING;
        r11.L$0 = null;
        r11.L$1 = null;
        r11.L$2 = null;
        r11.L$3 = null;
        r11.L$4 = null;
        r11.L$5 = null;
        r11.L$6 = null;
        r11.label = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0243, code lost:
        if (r9.invoke("already_showing", r7, MESSAGE_ALREADY_SHOWING, null, null, r11) != r4) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0245, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0248, code lost:
        return sd.w.f38141a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0257, code lost:
        if (r2.sessionRepository.getNativeConfiguration().s0().i0() == false) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0261, code lost:
        if (kotlin.jvm.internal.m.a(r3.getPlacementId(), r10) != false) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0263, code lost:
        r7 = com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
        r11.L$0 = null;
        r11.L$1 = null;
        r11.L$2 = null;
        r11.L$3 = null;
        r11.L$4 = null;
        r11.L$5 = null;
        r11.L$6 = null;
        r11.label = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0283, code lost:
        if (r9.invoke("placement_validation", r7, MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING, null, null, r11) != r4) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0285, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0288, code lost:
        return sd.w.f38141a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0289, code lost:
        r6 = (long) r2.sessionRepository.getNativeConfiguration().l0().k0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0298, code lost:
        if (r5 != false) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x029a, code lost:
        r2.isFullscreenAdShowing = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x029d, code lost:
        r6 = se.g.f(com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter$default(r2.show.invoke(r14, r3, r12), r6, false, new com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2(r2, r5, r3, true, r9, r10, (xd.d<? super com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2>) null), 2, (java.lang.Object) null), new com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3(r9, r5, r2, (xd.d<? super com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3>) null));
        r16 = new com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4(r2, r18, r10, r1, r3, r9);
        r11.L$0 = r2;
        r11.L$1 = null;
        r11.L$2 = null;
        r11.L$3 = null;
        r11.L$4 = null;
        r11.L$5 = null;
        r11.L$6 = null;
        r11.I$0 = r5 ? 1 : 0;
        r11.label = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02fb, code lost:
        if (r6.collect(r16, r11) != r4) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02fd, code lost:
        return r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(android.content.Context r31, java.lang.String r32, com.unity3d.ads.UnityAdsShowOptions r33, com.unity3d.ads.core.data.model.Listeners r34, xd.d<? super sd.w> r35) {
        /*
            r30 = this;
            r0 = r30
            r1 = r32
            r2 = r33
            r3 = r35
            boolean r4 = r3 instanceof com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$1
            if (r4 == 0) goto L_0x001b
            r4 = r3
            com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$1 r4 = (com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.label = r5
            goto L_0x0020
        L_0x001b:
            com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$1 r4 = new com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$1
            r4.<init>(r0, r3)
        L_0x0020:
            r11 = r4
            java.lang.Object r3 = r11.result
            java.lang.Object r4 = yd.d.c()
            int r5 = r11.label
            r7 = 1
            r8 = 0
            switch(r5) {
                case 0: goto L_0x00ac;
                case 1: goto L_0x008c;
                case 2: goto L_0x0087;
                case 3: goto L_0x0082;
                case 4: goto L_0x007d;
                case 5: goto L_0x0055;
                case 6: goto L_0x0050;
                case 7: goto L_0x004b;
                case 8: goto L_0x0046;
                case 9: goto L_0x0041;
                case 10: goto L_0x0036;
                default: goto L_0x002e;
            }
        L_0x002e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0036:
            int r1 = r11.I$0
            java.lang.Object r2 = r11.L$0
            com.unity3d.ads.core.domain.LegacyShowUseCase r2 = (com.unity3d.ads.core.domain.LegacyShowUseCase) r2
            sd.p.b(r3)
            goto L_0x02ff
        L_0x0041:
            sd.p.b(r3)
            goto L_0x0286
        L_0x0046:
            sd.p.b(r3)
            goto L_0x0246
        L_0x004b:
            sd.p.b(r3)
            goto L_0x0214
        L_0x0050:
            sd.p.b(r3)
            goto L_0x01d8
        L_0x0055:
            long r1 = r11.J$0
            java.lang.Object r5 = r11.L$6
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r9 = r11.L$5
            fe.t r9 = (fe.t) r9
            java.lang.Object r10 = r11.L$4
            com.unity3d.ads.core.data.model.Listeners r10 = (com.unity3d.ads.core.data.model.Listeners) r10
            java.lang.Object r12 = r11.L$3
            com.unity3d.ads.UnityAdsShowOptions r12 = (com.unity3d.ads.UnityAdsShowOptions) r12
            java.lang.Object r13 = r11.L$2
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r11.L$1
            android.content.Context r14 = (android.content.Context) r14
            java.lang.Object r15 = r11.L$0
            com.unity3d.ads.core.domain.LegacyShowUseCase r15 = (com.unity3d.ads.core.domain.LegacyShowUseCase) r15
            sd.p.b(r3)
            r18 = r1
            r1 = r10
            r10 = r13
            r2 = r15
            goto L_0x01a0
        L_0x007d:
            sd.p.b(r3)
            goto L_0x016b
        L_0x0082:
            sd.p.b(r3)
            goto L_0x0141
        L_0x0087:
            sd.p.b(r3)
            goto L_0x0117
        L_0x008c:
            long r1 = r11.J$0
            java.lang.Object r5 = r11.L$4
            com.unity3d.ads.core.data.model.Listeners r5 = (com.unity3d.ads.core.data.model.Listeners) r5
            java.lang.Object r9 = r11.L$3
            com.unity3d.ads.UnityAdsShowOptions r9 = (com.unity3d.ads.UnityAdsShowOptions) r9
            java.lang.Object r10 = r11.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r12 = r11.L$1
            android.content.Context r12 = (android.content.Context) r12
            java.lang.Object r13 = r11.L$0
            com.unity3d.ads.core.domain.LegacyShowUseCase r13 = (com.unity3d.ads.core.domain.LegacyShowUseCase) r13
            sd.p.b(r3)
            r28 = r1
            r2 = r9
            r1 = r13
            r13 = r28
            goto L_0x00ea
        L_0x00ac:
            sd.p.b(r3)
            oe.j r3 = oe.j.f36786a
            long r9 = r3.a()
            r0.placement = r1
            r0.unityAdsShowOptions = r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unity Ads Show Start for placement "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.unity3d.services.core.log.DeviceLog.debug(r3)
            r11.L$0 = r0
            r3 = r31
            r11.L$1 = r3
            r11.L$2 = r1
            r11.L$3 = r2
            r5 = r34
            r11.L$4 = r5
            r11.J$0 = r9
            r11.label = r7
            java.lang.Object r12 = r0.showStart(r11)
            if (r12 != r4) goto L_0x00e6
            return r4
        L_0x00e6:
            r12 = r3
            r13 = r9
            r10 = r1
            r1 = r0
        L_0x00ea:
            oe.j$a r3 = oe.j.a.c(r13)
            if (r10 != 0) goto L_0x00f3
            java.lang.String r9 = ""
            goto L_0x00f4
        L_0x00f3:
            r9 = r10
        L_0x00f4:
            fe.t r3 = r1.showError(r3, r9, r5)
            if (r10 != 0) goto L_0x011a
            com.unity3d.ads.UnityAds$UnityAdsShowError r7 = com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT
            r9 = 0
            r10 = 0
            r11.L$0 = r8
            r11.L$1 = r8
            r11.L$2 = r8
            r11.L$3 = r8
            r11.L$4 = r8
            r1 = 2
            r11.label = r1
            java.lang.String r6 = "placement_null"
            java.lang.String r8 = "[UnityAds] Placement ID cannot be null"
            r5 = r3
            java.lang.Object r1 = r5.invoke(r6, r7, r8, r9, r10, r11)
            if (r1 != r4) goto L_0x0117
            return r4
        L_0x0117:
            sd.w r1 = sd.w.f38141a
            return r1
        L_0x011a:
            com.unity3d.ads.core.domain.GetInitializationState r9 = r1.getInitializationState
            com.unity3d.ads.core.data.model.InitializationState r9 = r9.invoke()
            com.unity3d.ads.core.data.model.InitializationState r15 = com.unity3d.ads.core.data.model.InitializationState.INITIALIZED
            if (r9 == r15) goto L_0x0144
            com.unity3d.ads.UnityAds$UnityAdsShowError r7 = com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_INITIALIZED
            r9 = 0
            r10 = 0
            r11.L$0 = r8
            r11.L$1 = r8
            r11.L$2 = r8
            r11.L$3 = r8
            r11.L$4 = r8
            r1 = 3
            r11.label = r1
            java.lang.String r6 = "not_initialized"
            java.lang.String r8 = "[UnityAds] SDK not initialized"
            r5 = r3
            java.lang.Object r1 = r5.invoke(r6, r7, r8, r9, r10, r11)
            if (r1 != r4) goto L_0x0141
            return r4
        L_0x0141:
            sd.w r1 = sd.w.f38141a
            return r1
        L_0x0144:
            if (r2 == 0) goto L_0x014b
            java.lang.String r9 = r1.getOpportunityId(r2)
            goto L_0x014c
        L_0x014b:
            r9 = r8
        L_0x014c:
            if (r9 != 0) goto L_0x016e
            com.unity3d.ads.UnityAds$UnityAdsShowError r7 = com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT
            r9 = 0
            r10 = 0
            r11.L$0 = r8
            r11.L$1 = r8
            r11.L$2 = r8
            r11.L$3 = r8
            r11.L$4 = r8
            r1 = 4
            r11.label = r1
            java.lang.String r6 = "no_opportunity_id"
            java.lang.String r8 = "No valid opportunity id provided"
            r5 = r3
            java.lang.Object r1 = r5.invoke(r6, r7, r8, r9, r10, r11)
            if (r1 != r4) goto L_0x016b
            return r4
        L_0x016b:
            sd.w r1 = sd.w.f38141a
            return r1
        L_0x016e:
            java.util.UUID r15 = java.util.UUID.fromString(r9)
            java.lang.String r6 = "fromString(opportunityId)"
            kotlin.jvm.internal.m.d(r15, r6)
            com.google.protobuf.i r6 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(r15)
            com.unity3d.ads.core.data.repository.AdRepository r15 = r1.adRepository
            r11.L$0 = r1
            r11.L$1 = r12
            r11.L$2 = r10
            r11.L$3 = r2
            r11.L$4 = r5
            r11.L$5 = r3
            r11.L$6 = r9
            r11.J$0 = r13
            r7 = 5
            r11.label = r7
            java.lang.Object r6 = r15.getAd(r6, r11)
            if (r6 != r4) goto L_0x0197
            return r4
        L_0x0197:
            r18 = r13
            r14 = r12
            r12 = r2
            r2 = r1
            r1 = r5
            r5 = r9
            r9 = r3
            r3 = r6
        L_0x01a0:
            com.unity3d.ads.core.data.model.AdObject r3 = (com.unity3d.ads.core.data.model.AdObject) r3
            r2.adObject = r3
            if (r3 != 0) goto L_0x01db
            com.unity3d.ads.UnityAds$UnityAdsShowError r7 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No ad object found for opportunity id: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r10 = 0
            r11.L$0 = r8
            r11.L$1 = r8
            r11.L$2 = r8
            r11.L$3 = r8
            r11.L$4 = r8
            r11.L$5 = r8
            r11.L$6 = r8
            r3 = 6
            r11.label = r3
            java.lang.String r6 = "ad_object_not_found"
            r5 = r9
            r8 = r1
            r9 = r2
            java.lang.Object r1 = r5.invoke(r6, r7, r8, r9, r10, r11)
            if (r1 != r4) goto L_0x01d8
            return r4
        L_0x01d8:
            sd.w r1 = sd.w.f38141a
            return r1
        L_0x01db:
            com.unity3d.ads.adplayer.AdPlayer r5 = r3.getAdPlayer()
            if (r5 == 0) goto L_0x01ef
            pe.p0 r5 = r5.getScope()
            if (r5 == 0) goto L_0x01ef
            boolean r5 = pe.q0.g(r5)
            if (r5 != 0) goto L_0x01ef
            r5 = 1
            goto L_0x01f0
        L_0x01ef:
            r5 = 0
        L_0x01f0:
            if (r5 == 0) goto L_0x0217
            com.unity3d.ads.UnityAds$UnityAdsShowError r7 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR
            r1 = 0
            r10 = 0
            r11.L$0 = r8
            r11.L$1 = r8
            r11.L$2 = r8
            r11.L$3 = r8
            r11.L$4 = r8
            r11.L$5 = r8
            r11.L$6 = r8
            r2 = 7
            r11.label = r2
            java.lang.String r6 = "ad_player_scope_not_active"
            java.lang.String r8 = "Ad player is unavailable."
            r5 = r9
            r9 = r1
            java.lang.Object r1 = r5.invoke(r6, r7, r8, r9, r10, r11)
            if (r1 != r4) goto L_0x0214
            return r4
        L_0x0214:
            sd.w r1 = sd.w.f38141a
            return r1
        L_0x0217:
            com.unity3d.ads.adplayer.AdPlayer r5 = r3.getAdPlayer()
            boolean r5 = r5 instanceof com.unity3d.ads.adplayer.EmbeddableAdPlayer
            if (r5 != 0) goto L_0x0249
            boolean r6 = r2.isFullscreenAdShowing
            if (r6 == 0) goto L_0x0249
            com.unity3d.ads.UnityAds$UnityAdsShowError r7 = com.unity3d.ads.UnityAds.UnityAdsShowError.ALREADY_SHOWING
            r1 = 0
            r10 = 0
            r11.L$0 = r8
            r11.L$1 = r8
            r11.L$2 = r8
            r11.L$3 = r8
            r11.L$4 = r8
            r11.L$5 = r8
            r11.L$6 = r8
            r2 = 8
            r11.label = r2
            java.lang.String r6 = "already_showing"
            java.lang.String r8 = "Can't show a new ad unit when ad unit is already open"
            r5 = r9
            r9 = r1
            java.lang.Object r1 = r5.invoke(r6, r7, r8, r9, r10, r11)
            if (r1 != r4) goto L_0x0246
            return r4
        L_0x0246:
            sd.w r1 = sd.w.f38141a
            return r1
        L_0x0249:
            com.unity3d.ads.core.data.repository.SessionRepository r6 = r2.sessionRepository
            vb.z1 r6 = r6.getNativeConfiguration()
            vb.y1 r6 = r6.s0()
            boolean r6 = r6.i0()
            if (r6 == 0) goto L_0x0289
            java.lang.String r6 = r3.getPlacementId()
            boolean r6 = kotlin.jvm.internal.m.a(r6, r10)
            if (r6 != 0) goto L_0x0289
            com.unity3d.ads.UnityAds$UnityAdsShowError r7 = com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT
            r1 = 0
            r10 = 0
            r11.L$0 = r8
            r11.L$1 = r8
            r11.L$2 = r8
            r11.L$3 = r8
            r11.L$4 = r8
            r11.L$5 = r8
            r11.L$6 = r8
            r2 = 9
            r11.label = r2
            java.lang.String r6 = "placement_validation"
            java.lang.String r8 = "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad"
            r5 = r9
            r9 = r1
            java.lang.Object r1 = r5.invoke(r6, r7, r8, r9, r10, r11)
            if (r1 != r4) goto L_0x0286
            return r4
        L_0x0286:
            sd.w r1 = sd.w.f38141a
            return r1
        L_0x0289:
            com.unity3d.ads.core.data.repository.SessionRepository r6 = r2.sessionRepository
            vb.z1 r6 = r6.getNativeConfiguration()
            vb.w1 r6 = r6.l0()
            int r6 = r6.k0()
            long r6 = (long) r6
            if (r5 != 0) goto L_0x029d
            r13 = 1
            r2.isFullscreenAdShowing = r13
        L_0x029d:
            com.unity3d.ads.core.domain.Show r13 = r2.show
            se.e r12 = r13.invoke(r14, r3, r12)
            r13 = 0
            com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2 r14 = new com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2
            r24 = 1
            r27 = 0
            r20 = r14
            r21 = r2
            r22 = r5
            r23 = r3
            r25 = r9
            r26 = r10
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r25 = 2
            r26 = 0
            r20 = r12
            r21 = r6
            r23 = r13
            r24 = r14
            se.e r6 = com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter$default(r20, r21, r23, r24, r25, r26)
            com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3 r7 = new com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3
            r7.<init>(r9, r5, r2, r8)
            se.e r6 = se.g.f(r6, r7)
            com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4 r7 = new com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4
            r16 = r7
            r17 = r2
            r20 = r10
            r21 = r1
            r22 = r3
            r23 = r9
            r16.<init>(r17, r18, r20, r21, r22, r23)
            r11.L$0 = r2
            r11.L$1 = r8
            r11.L$2 = r8
            r11.L$3 = r8
            r11.L$4 = r8
            r11.L$5 = r8
            r11.L$6 = r8
            r11.I$0 = r5
            r1 = 10
            r11.label = r1
            java.lang.Object r1 = r6.collect(r7, r11)
            if (r1 != r4) goto L_0x02fe
            return r4
        L_0x02fe:
            r1 = r5
        L_0x02ff:
            if (r1 != 0) goto L_0x0304
            r1 = 0
            r2.isFullscreenAdShowing = r1
        L_0x0304:
            sd.w r1 = sd.w.f38141a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.invoke(android.content.Context, java.lang.String, com.unity3d.ads.UnityAdsShowOptions, com.unity3d.ads.core.data.model.Listeners, xd.d):java.lang.Object");
    }
}
