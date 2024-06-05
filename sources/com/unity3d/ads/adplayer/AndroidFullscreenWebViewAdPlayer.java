package com.unity3d.ads.adplayer;

import android.content.Context;
import android.content.Intent;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.c2;
import pe.p0;
import pe.r0;
import re.a;
import sd.n;
import sd.w;
import se.b0;
import se.e;
import se.u;
import xd.d;
import xd.g;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
public final class AndroidFullscreenWebViewAdPlayer implements AdPlayer, FullscreenAdPlayer {
    public static final Companion Companion = new Companion((h) null);
    /* access modifiers changed from: private */
    public static final u<DisplayMessage> displayMessages = b0.b(0, 0, (a) null, 7, (Object) null);
    private final DeviceInfoRepository deviceInfoRepository;
    private final OpenMeasurementRepository openMeasurementRepository;
    /* access modifiers changed from: private */
    public final String opportunityId;
    private final SessionRepository sessionRepository;
    /* access modifiers changed from: private */
    public final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;

    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final u<DisplayMessage> getDisplayMessages() {
            return AndroidFullscreenWebViewAdPlayer.displayMessages;
        }
    }

    public AndroidFullscreenWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer2, String str, AndroidWebViewContainer androidWebViewContainer, DeviceInfoRepository deviceInfoRepository2, SessionRepository sessionRepository2, OpenMeasurementRepository openMeasurementRepository2) {
        m.e(webViewAdPlayer2, "webViewAdPlayer");
        m.e(str, "opportunityId");
        m.e(androidWebViewContainer, "webViewContainer");
        m.e(deviceInfoRepository2, "deviceInfoRepository");
        m.e(sessionRepository2, "sessionRepository");
        m.e(openMeasurementRepository2, "openMeasurementRepository");
        this.webViewAdPlayer = webViewAdPlayer2;
        this.opportunityId = str;
        this.webViewContainer = androidWebViewContainer;
        this.deviceInfoRepository = deviceInfoRepository2;
        this.sessionRepository = sessionRepository2;
        this.openMeasurementRepository = openMeasurementRepository2;
    }

    /* access modifiers changed from: private */
    public final c2 displayEventsRouter(DisplayMessage displayMessage) {
        return k.d(getScope(), (g) null, (r0) null, new AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(displayMessage, this, (d<? super AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final Object handleSessionChange(SessionChange sessionChange, d<? super w> dVar) {
        if (sessionChange instanceof SessionChange.UserConsentChange) {
            WebViewAdPlayer webViewAdPlayer2 = this.webViewAdPlayer;
            byte[] J = ((SessionChange.UserConsentChange) sessionChange).getValue().J();
            m.d(J, "change.value.toByteArray()");
            Object sendUserConsentChange = webViewAdPlayer2.sendUserConsentChange(J, dVar);
            return sendUserConsentChange == d.c() ? sendUserConsentChange : w.f38141a;
        } else if (!(sessionChange instanceof SessionChange.PrivacyFsmChange)) {
            return w.f38141a;
        } else {
            WebViewAdPlayer webViewAdPlayer3 = this.webViewAdPlayer;
            byte[] J2 = ((SessionChange.PrivacyFsmChange) sessionChange).getValue().J();
            m.d(J2, "change.value.toByteArray()");
            Object sendPrivacyFsmChange = webViewAdPlayer3.sendPrivacyFsmChange(J2, dVar);
            return sendPrivacyFsmChange == d.c() ? sendPrivacyFsmChange : w.f38141a;
        }
    }

    /* access modifiers changed from: private */
    public final Object handleVolumeSettingsChange(VolumeSettingsChange volumeSettingsChange, d<? super w> dVar) {
        if (volumeSettingsChange instanceof VolumeSettingsChange.MuteChange) {
            Object sendMuteChange = this.webViewAdPlayer.sendMuteChange(((VolumeSettingsChange.MuteChange) volumeSettingsChange).isMuted(), dVar);
            return sendMuteChange == d.c() ? sendMuteChange : w.f38141a;
        } else if (!(volumeSettingsChange instanceof VolumeSettingsChange.VolumeChange)) {
            return w.f38141a;
        } else {
            Object sendVolumeChange = this.webViewAdPlayer.sendVolumeChange(((VolumeSettingsChange.VolumeChange) volumeSettingsChange).getVolume(), dVar);
            return sendVolumeChange == d.c() ? sendVolumeChange : w.f38141a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0093 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object destroy(xd.d<? super sd.w> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0052
            if (r2 == r6) goto L_0x004a
            if (r2 == r5) goto L_0x0042
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            sd.p.b(r9)
            goto L_0x00a0
        L_0x0032:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003a:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            sd.p.b(r9)
            goto L_0x0094
        L_0x0042:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            sd.p.b(r9)
            goto L_0x0085
        L_0x004a:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            sd.p.b(r9)
            goto L_0x006a
        L_0x0052:
            sd.p.b(r9)
            se.u<com.unity3d.ads.adplayer.DisplayMessage> r9 = displayMessages
            com.unity3d.ads.adplayer.DisplayMessage$DisplayFinishRequest r2 = new com.unity3d.ads.adplayer.DisplayMessage$DisplayFinishRequest
            java.lang.String r7 = r8.opportunityId
            r2.<init>(r7)
            r0.L$0 = r8
            r0.label = r6
            java.lang.Object r9 = r9.emit(r2, r0)
            if (r9 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r2 = r8
        L_0x006a:
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r9 = r2.openMeasurementRepository
            java.lang.String r6 = r2.opportunityId
            com.google.protobuf.i r6 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859ByteString(r6)
            boolean r9 = r9.hasSessionFinished(r6)
            if (r9 == 0) goto L_0x0085
            r6 = 1000(0x3e8, double:4.94E-321)
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r9 = pe.a1.a(r6, r0)
            if (r9 != r1) goto L_0x0085
            return r1
        L_0x0085:
            com.unity3d.ads.adplayer.AndroidWebViewContainer r9 = r2.getWebViewContainer()
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r9 = r9.destroy(r0)
            if (r9 != r1) goto L_0x0094
            return r1
        L_0x0094:
            r9 = 0
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r9 = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r2, r0)
            if (r9 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            sd.w r9 = sd.w.f38141a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.destroy(xd.d):java.lang.Object");
    }

    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    public e<LoadEvent> getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    public e<ShowEvent> getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    public p0 getScope() {
        return this.webViewAdPlayer.getScope();
    }

    public e<n<byte[], Integer>> getUpdateCampaignState() {
        return this.webViewAdPlayer.getUpdateCampaignState();
    }

    public Object onAllowedPiiChange(byte[] bArr, d<? super w> dVar) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, dVar);
    }

    public Object onBroadcastEvent(String str, d<? super w> dVar) {
        return this.webViewAdPlayer.onBroadcastEvent(str, dVar);
    }

    public Object requestShow(Map<String, ? extends Object> map, d<? super w> dVar) {
        return this.webViewAdPlayer.requestShow(map, dVar);
    }

    public Object sendFocusChange(boolean z10, d<? super w> dVar) {
        return this.webViewAdPlayer.sendFocusChange(z10, dVar);
    }

    public Object sendMuteChange(boolean z10, d<? super w> dVar) {
        return this.webViewAdPlayer.sendMuteChange(z10, dVar);
    }

    public Object sendPrivacyFsmChange(byte[] bArr, d<? super w> dVar) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, dVar);
    }

    public Object sendUserConsentChange(byte[] bArr, d<? super w> dVar) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, dVar);
    }

    public Object sendVisibilityChange(boolean z10, d<? super w> dVar) {
        return this.webViewAdPlayer.sendVisibilityChange(z10, dVar);
    }

    public Object sendVolumeChange(double d10, d<? super w> dVar) {
        return this.webViewAdPlayer.sendVolumeChange(d10, dVar);
    }

    public void show(ShowOptions showOptions) {
        m.e(showOptions, "showOptions");
        if (showOptions instanceof AndroidShowOptions) {
            AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
            Context context = androidShowOptions.getContext();
            Intent intent = new Intent(context, FullScreenWebViewDisplay.class);
            intent.putExtra("opportunityId", this.opportunityId);
            Map<String, Object> unityAdsShowOptions = androidShowOptions.getUnityAdsShowOptions();
            if (unityAdsShowOptions != null) {
                intent.putExtra("showOptions", unityAdsShowOptions.toString());
            }
            intent.addFlags(268500992);
            se.g.u(se.g.x(new AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1(displayMessages, this), new AndroidFullscreenWebViewAdPlayer$show$2(this)), getScope());
            se.g.u(se.g.x(this.deviceInfoRepository.getVolumeSettingsChange(), new AndroidFullscreenWebViewAdPlayer$show$3(this)), getScope());
            se.g.u(se.g.x(new AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2(this.webViewAdPlayer.getOnShowEvent()), new AndroidFullscreenWebViewAdPlayer$show$5(this, (d<? super AndroidFullscreenWebViewAdPlayer$show$5>) null)), getScope());
            se.g.u(se.g.x(this.sessionRepository.getOnChange(), new AndroidFullscreenWebViewAdPlayer$show$6(this)), getScope());
            context.startActivity(intent);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
