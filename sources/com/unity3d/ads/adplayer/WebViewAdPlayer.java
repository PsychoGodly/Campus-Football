package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageEventInfo;
import fe.l;
import fe.p;
import kotlin.jvm.internal.m;
import pe.k0;
import pe.l0;
import pe.o0;
import pe.p0;
import pe.q0;
import sd.n;
import sd.w;
import se.e;
import se.f0;
import se.g;
import se.u;
import se.v;
import xd.d;

/* compiled from: WebViewAdPlayer.kt */
public final class WebViewAdPlayer implements AdPlayer {
    /* access modifiers changed from: private */
    public final WebViewBridge bridge;
    private final DeviceInfoRepository deviceInfoRepository;
    private final k0 dispatcher;
    /* access modifiers changed from: private */
    public final ExecuteAdViewerRequest executeAdViewerRequest;
    private final v<Boolean> isCompletedManually;
    private final e<String> onBroadcastEvents;
    private final e<LoadEvent> onLoadEvent;
    private final e<w> onRequestEvents;
    private final e<ShowEvent> onShowEvent;
    private final p0 scope;
    private final l0 scopeCancellationHandler;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    /* access modifiers changed from: private */
    public final l<StorageEventInfo, w> storageEventCallback;
    private final e<n<byte[], Integer>> updateCampaignState;
    private final WebViewContainer webViewContainer;

    public WebViewAdPlayer(WebViewBridge webViewBridge, DeviceInfoRepository deviceInfoRepository2, SessionRepository sessionRepository2, ExecuteAdViewerRequest executeAdViewerRequest2, k0 k0Var, SendDiagnosticEvent sendDiagnosticEvent2, WebViewContainer webViewContainer2, p0 p0Var) {
        m.e(webViewBridge, "bridge");
        m.e(deviceInfoRepository2, "deviceInfoRepository");
        m.e(sessionRepository2, "sessionRepository");
        m.e(executeAdViewerRequest2, "executeAdViewerRequest");
        m.e(k0Var, "dispatcher");
        m.e(sendDiagnosticEvent2, "sendDiagnosticEvent");
        m.e(webViewContainer2, "webViewContainer");
        m.e(p0Var, "adPlayerScope");
        this.bridge = webViewBridge;
        this.deviceInfoRepository = deviceInfoRepository2;
        this.sessionRepository = sessionRepository2;
        this.executeAdViewerRequest = executeAdViewerRequest2;
        this.dispatcher = k0Var;
        this.sendDiagnosticEvent = sendDiagnosticEvent2;
        this.webViewContainer = webViewContainer2;
        v<Boolean> a10 = se.k0.a(Boolean.FALSE);
        this.isCompletedManually = a10;
        WebViewAdPlayer$storageEventCallback$1 webViewAdPlayer$storageEventCallback$1 = new WebViewAdPlayer$storageEventCallback$1(this);
        this.storageEventCallback = webViewAdPlayer$storageEventCallback$1;
        WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 = new WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1(l0.A1, this);
        this.scopeCancellationHandler = webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1;
        this.scope = q0.h(q0.h(q0.h(p0Var, k0Var), new o0("WebViewAdPlayer")), webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1);
        this.onShowEvent = g.s(new WebViewAdPlayer$special$$inlined$map$1(new WebViewAdPlayer$special$$inlined$filter$1(webViewBridge.getOnInvocation())), a10, new WebViewAdPlayer$onShowEvent$3((d<? super WebViewAdPlayer$onShowEvent$3>) null));
        this.onLoadEvent = g.C(g.A(new WebViewAdPlayer$special$$inlined$map$2(new WebViewAdPlayer$special$$inlined$filter$2(webViewBridge.getOnInvocation())), getScope(), f0.f38194a.a(), 1), 1);
        this.updateCampaignState = new WebViewAdPlayer$special$$inlined$map$3(new WebViewAdPlayer$special$$inlined$filter$3(webViewBridge.getOnInvocation()));
        WebViewAdPlayer$special$$inlined$map$4 webViewAdPlayer$special$$inlined$map$4 = new WebViewAdPlayer$special$$inlined$map$4(new WebViewAdPlayer$special$$inlined$filter$4(webViewBridge.getOnInvocation()));
        this.onBroadcastEvents = webViewAdPlayer$special$$inlined$map$4;
        WebViewAdPlayer$special$$inlined$map$5 webViewAdPlayer$special$$inlined$map$5 = new WebViewAdPlayer$special$$inlined$map$5(new WebViewAdPlayer$special$$inlined$filter$5(webViewBridge.getOnInvocation()), this);
        this.onRequestEvents = webViewAdPlayer$special$$inlined$map$5;
        Storage.Companion.addStorageEventCallback(webViewAdPlayer$storageEventCallback$1);
        AdPlayer.Companion companion = AdPlayer.Companion;
        g.u(g.x(webViewAdPlayer$special$$inlined$map$4, new p<String, d<? super w>, Object>(companion.getBroadcastEventChannel()) {
            public final Object invoke(String str, d<? super w> dVar) {
                return ((u) this.receiver).emit(str, dVar);
            }
        }), getScope());
        g.u(webViewAdPlayer$special$$inlined$map$5, getScope());
        g.u(g.x(companion.getBroadcastEventChannel(), new p<String, d<? super w>, Object>(this) {
            public final Object invoke(String str, d<? super w> dVar) {
                return ((WebViewAdPlayer) this.receiver).onBroadcastEvent(str, dVar);
            }
        }), getScope());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object sendEvent(fe.a<? extends com.unity3d.ads.adplayer.model.WebViewEvent> r18, xd.d<? super sd.w> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1 r2 = (com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1 r2 = new com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = yd.d.c()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0045
            if (r4 == r6) goto L_0x0039
            if (r4 != r5) goto L_0x0031
            sd.p.b(r1)
            goto L_0x00b9
        L_0x0031:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0039:
            java.lang.Object r4 = r2.L$1
            fe.a r4 = (fe.a) r4
            java.lang.Object r7 = r2.L$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r7 = (com.unity3d.ads.adplayer.WebViewAdPlayer) r7
            sd.p.b(r1)
            goto L_0x005c
        L_0x0045:
            sd.p.b(r1)
            se.e r1 = r17.getOnLoadEvent()
            r2.L$0 = r0
            r4 = r18
            r2.L$1 = r4
            r2.label = r6
            java.lang.Object r1 = se.g.B(r1, r2)
            if (r1 != r3) goto L_0x005b
            return r3
        L_0x005b:
            r7 = r0
        L_0x005c:
            com.unity3d.ads.adplayer.model.LoadEvent r1 = (com.unity3d.ads.adplayer.model.LoadEvent) r1
            boolean r8 = r1 instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error
            if (r8 == 0) goto L_0x00a3
            com.unity3d.ads.core.domain.SendDiagnosticEvent r9 = r7.sendDiagnosticEvent
            r11 = 0
            r2 = 3
            sd.n[] r2 = new sd.n[r2]
            r3 = 0
            java.lang.String r4 = "reason"
            java.lang.String r7 = "adviewer"
            sd.n r4 = sd.s.a(r4, r7)
            r2[r3] = r4
            com.unity3d.ads.adplayer.model.LoadEvent$Error r1 = (com.unity3d.ads.adplayer.model.LoadEvent.Error) r1
            java.lang.String r3 = r1.getMessage()
            java.lang.String r4 = "reason_debug"
            sd.n r3 = sd.s.a(r4, r3)
            r2[r6] = r3
            int r1 = r1.getErrorCode()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "reason_code"
            sd.n r1 = sd.s.a(r3, r1)
            r2[r5] = r1
            java.util.Map r12 = td.k0.j(r2)
            r13 = 0
            r14 = 0
            r15 = 26
            r16 = 0
            java.lang.String r10 = "bridge_send_event_failed"
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r9, r10, r11, r12, r13, r14, r15, r16)
            sd.w r1 = sd.w.f38141a
            return r1
        L_0x00a3:
            java.lang.Object r1 = r4.invoke()
            com.unity3d.ads.adplayer.model.WebViewEvent r1 = (com.unity3d.ads.adplayer.model.WebViewEvent) r1
            com.unity3d.ads.adplayer.WebViewBridge r4 = r7.bridge
            r6 = 0
            r2.L$0 = r6
            r2.L$1 = r6
            r2.label = r5
            java.lang.Object r1 = r4.sendEvent(r1, r2)
            if (r1 != r3) goto L_0x00b9
            return r3
        L_0x00b9:
            sd.w r1 = sd.w.f38141a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer.sendEvent(fe.a, xd.d):java.lang.Object");
    }

    public Object destroy(d<? super w> dVar) {
        return AdPlayer.DefaultImpls.destroy(this, dVar);
    }

    public void dispatchShowCompleted() {
        this.isCompletedManually.setValue(Boolean.TRUE);
    }

    public e<LoadEvent> getOnLoadEvent() {
        return this.onLoadEvent;
    }

    public final e<w> getOnRequestEvents() {
        return this.onRequestEvents;
    }

    public e<ShowEvent> getOnShowEvent() {
        return this.onShowEvent;
    }

    public p0 getScope() {
        return this.scope;
    }

    public e<n<byte[], Integer>> getUpdateCampaignState() {
        return this.updateCampaignState;
    }

    public WebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    public Object onAllowedPiiChange(byte[] bArr, d<? super w> dVar) {
        Object sendEvent = sendEvent(new WebViewAdPlayer$onAllowedPiiChange$2(bArr), dVar);
        return sendEvent == d.c() ? sendEvent : w.f38141a;
    }

    public Object onBroadcastEvent(String str, d<? super w> dVar) {
        Object sendEvent = sendEvent(new WebViewAdPlayer$onBroadcastEvent$2(str), dVar);
        return sendEvent == d.c() ? sendEvent : w.f38141a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0189 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object requestShow(java.util.Map<java.lang.String, ? extends java.lang.Object> r13, xd.d<? super sd.w> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$requestShow$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.unity3d.ads.adplayer.WebViewAdPlayer$requestShow$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$requestShow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.adplayer.WebViewAdPlayer$requestShow$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$requestShow$1
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0075
            if (r2 == r6) goto L_0x0056
            if (r2 == r5) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            sd.p.b(r14)
            goto L_0x018a
        L_0x0031:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0039:
            java.lang.Object r13 = r0.L$5
            org.json.JSONObject r13 = (org.json.JSONObject) r13
            java.lang.Object r2 = r0.L$4
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r0.L$3
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            java.lang.Object r7 = r0.L$2
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.Object r8 = r0.L$1
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r9 = r0.L$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r9 = (com.unity3d.ads.adplayer.WebViewAdPlayer) r9
            sd.p.b(r14)
            goto L_0x00fe
        L_0x0056:
            java.lang.Object r13 = r0.L$5
            org.json.JSONObject r13 = (org.json.JSONObject) r13
            java.lang.Object r2 = r0.L$4
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r7 = r0.L$3
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.Object r8 = r0.L$2
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            java.lang.Object r9 = r0.L$1
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r10 = r0.L$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r10 = (com.unity3d.ads.adplayer.WebViewAdPlayer) r10
            sd.p.b(r14)
            r11 = r7
            r7 = r2
            r2 = r11
            goto L_0x00d6
        L_0x0075:
            sd.p.b(r14)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r14 = r12.deviceInfoRepository
            vb.a1 r14 = r14.getDynamicDeviceInfo()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r7 = r12.deviceInfoRepository
            java.lang.String r7 = r7.getOrientation()
            java.lang.String r8 = "orientation"
            r2.put(r8, r7)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r7 = r12.deviceInfoRepository
            java.lang.String r7 = r7.getConnectionTypeStr()
            java.lang.String r8 = "connectionType"
            r2.put(r8, r7)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r7 = r12.deviceInfoRepository
            int r7 = r7.getRingerMode()
            if (r7 == r5) goto L_0x00a3
            r7 = 1
            goto L_0x00a4
        L_0x00a3:
            r7 = 0
        L_0x00a4:
            java.lang.String r8 = "isMuted"
            r2.put(r8, r7)
            vb.a1$a r14 = r14.u0()
            double r7 = r14.r0()
            java.lang.String r14 = "volume"
            r2.put(r14, r7)
            java.lang.String r14 = "privacy"
            com.unity3d.ads.core.data.repository.SessionRepository r7 = r12.sessionRepository
            r0.L$0 = r12
            r0.L$1 = r13
            r0.L$2 = r2
            r0.L$3 = r2
            r0.L$4 = r14
            r0.L$5 = r2
            r0.label = r6
            java.lang.Object r7 = r7.getPrivacy(r0)
            if (r7 != r1) goto L_0x00cf
            return r1
        L_0x00cf:
            r10 = r12
            r9 = r13
            r13 = r2
            r8 = r13
            r11 = r7
            r7 = r14
            r14 = r11
        L_0x00d6:
            com.google.protobuf.i r14 = (com.google.protobuf.i) r14
            java.lang.String r14 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64(r14)
            r13.put(r7, r14)
            java.lang.String r13 = "privacyFsm"
            com.unity3d.ads.core.data.repository.SessionRepository r14 = r10.sessionRepository
            r0.L$0 = r10
            r0.L$1 = r9
            r0.L$2 = r8
            r0.L$3 = r2
            r0.L$4 = r13
            r0.L$5 = r2
            r0.label = r5
            java.lang.Object r14 = r14.getPrivacyFsm(r0)
            if (r14 != r1) goto L_0x00f8
            return r1
        L_0x00f8:
            r5 = r2
            r7 = r8
            r8 = r9
            r9 = r10
            r2 = r13
            r13 = r5
        L_0x00fe:
            com.google.protobuf.i r14 = (com.google.protobuf.i) r14
            java.lang.String r14 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64(r14)
            r13.put(r2, r14)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r13 = r9.deviceInfoRepository
            se.v r13 = r13.getAllowedPii()
            java.lang.Object r13 = r13.getValue()
            vb.v r13 = (vb.v) r13
            com.google.protobuf.i r13 = r13.e()
            java.lang.String r14 = "deviceInfoRepository.all…dPii.value.toByteString()"
            kotlin.jvm.internal.m.d(r13, r14)
            java.lang.String r13 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64(r13)
            java.lang.String r14 = "allowedPii"
            r5.put(r14, r13)
            if (r8 == 0) goto L_0x016a
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            java.util.Set r14 = r8.entrySet()
            java.util.Iterator r14 = r14.iterator()
        L_0x0134:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x0159
            java.lang.Object r2 = r14.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r8 = r2.getKey()
            java.lang.String r10 = "objectId"
            boolean r8 = kotlin.jvm.internal.m.a(r8, r10)
            r8 = r8 ^ r6
            if (r8 == 0) goto L_0x0134
            java.lang.Object r8 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r13.put(r8, r2)
            goto L_0x0134
        L_0x0159:
            boolean r14 = r13.isEmpty()
            r14 = r14 ^ r6
            if (r14 == 0) goto L_0x016a
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>(r13)
            java.lang.String r13 = "showOptions"
            r5.put(r13, r14)
        L_0x016a:
            com.unity3d.ads.adplayer.WebViewBridge r13 = r9.bridge
            java.lang.Object[] r14 = new java.lang.Object[r6]
            r14[r3] = r7
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.L$3 = r2
            r0.L$4 = r2
            r0.L$5 = r2
            r0.label = r4
            java.lang.String r2 = "webview"
            java.lang.String r3 = "show"
            java.lang.Object r13 = r13.request(r2, r3, r14, r0)
            if (r13 != r1) goto L_0x018a
            return r1
        L_0x018a:
            sd.w r13 = sd.w.f38141a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer.requestShow(java.util.Map, xd.d):java.lang.Object");
    }

    public Object sendFocusChange(boolean z10, d<? super w> dVar) {
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendFocusChange$2(z10), dVar);
        return sendEvent == d.c() ? sendEvent : w.f38141a;
    }

    public Object sendMuteChange(boolean z10, d<? super w> dVar) {
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendMuteChange$2(z10), dVar);
        return sendEvent == d.c() ? sendEvent : w.f38141a;
    }

    public Object sendPrivacyFsmChange(byte[] bArr, d<? super w> dVar) {
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendPrivacyFsmChange$2(bArr), dVar);
        return sendEvent == d.c() ? sendEvent : w.f38141a;
    }

    public Object sendUserConsentChange(byte[] bArr, d<? super w> dVar) {
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendUserConsentChange$2(bArr), dVar);
        return sendEvent == d.c() ? sendEvent : w.f38141a;
    }

    public Object sendVisibilityChange(boolean z10, d<? super w> dVar) {
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendVisibilityChange$2(z10), dVar);
        return sendEvent == d.c() ? sendEvent : w.f38141a;
    }

    public Object sendVolumeChange(double d10, d<? super w> dVar) {
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendVolumeChange$2(d10), dVar);
        return sendEvent == d.c() ? sendEvent : w.f38141a;
    }

    public void show(ShowOptions showOptions) {
        AdPlayer.DefaultImpls.show(this, showOptions);
    }
}
