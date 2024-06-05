package com.unity3d.ads.adplayer;

import android.content.Context;
import android.webkit.WebView;
import androidx.core.view.a0;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import java.util.Map;
import kotlin.jvm.internal.m;
import pe.c2;
import pe.p0;
import pe.q0;
import pe.r0;
import sd.n;
import sd.w;
import se.e;
import xd.d;
import xd.g;

/* compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
public final class AndroidEmbeddableWebViewAdPlayer implements AdPlayer, EmbeddableAdPlayer {
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    /* access modifiers changed from: private */
    public final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;

    public AndroidEmbeddableWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer2, String str, AndroidWebViewContainer androidWebViewContainer, OpenMeasurementRepository openMeasurementRepository2) {
        m.e(webViewAdPlayer2, "webViewAdPlayer");
        m.e(str, "opportunityId");
        m.e(androidWebViewContainer, "webViewContainer");
        m.e(openMeasurementRepository2, "openMeasurementRepository");
        this.webViewAdPlayer = webViewAdPlayer2;
        this.opportunityId = str;
        this.webViewContainer = androidWebViewContainer;
        this.openMeasurementRepository = openMeasurementRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object destroy(xd.d<? super sd.w> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            sd.p.b(r9)
            goto L_0x0086
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0037:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) r2
            sd.p.b(r9)
            goto L_0x007a
        L_0x003f:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) r2
            sd.p.b(r9)
            goto L_0x006b
        L_0x0047:
            sd.p.b(r9)
            com.unity3d.ads.adplayer.WebViewAdPlayer r9 = r8.webViewAdPlayer
            r9.dispatchShowCompleted()
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r9 = r8.openMeasurementRepository
            java.lang.String r2 = r8.opportunityId
            com.google.protobuf.i r2 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859ByteString(r2)
            boolean r9 = r9.hasSessionFinished(r2)
            if (r9 == 0) goto L_0x006a
            r6 = 1000(0x3e8, double:4.94E-321)
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r9 = pe.a1.a(r6, r0)
            if (r9 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r2 = r8
        L_0x006b:
            com.unity3d.ads.adplayer.AndroidWebViewContainer r9 = r2.getWebViewContainer()
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r9 = r9.destroy(r0)
            if (r9 != r1) goto L_0x007a
            return r1
        L_0x007a:
            r9 = 0
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r9 = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r2, r0)
            if (r9 != r1) goto L_0x0086
            return r1
        L_0x0086:
            sd.w r9 = sd.w.f38141a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.destroy(xd.d):java.lang.Object");
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
        ShowOptions showOptions2 = showOptions;
        m.e(showOptions2, "showOptions");
        if (showOptions2 instanceof AndroidShowOptions) {
            Context context = ((AndroidShowOptions) showOptions2).getContext();
            BannerView bannerView = BannerViewCache.getInstance().getBannerView(ProtobufExtensionsKt.toUUID(ProtobufExtensionsKt.toISO8859ByteString(this.opportunityId)).toString());
            c2 unused = k.d(q0.b(), (g) null, (r0) null, new AndroidEmbeddableWebViewAdPlayer$show$1(this, context, bannerView, (d<? super AndroidEmbeddableWebViewAdPlayer$show$1>) null), 3, (Object) null);
            WebView webView = getWebViewContainer().getWebView();
            if (a0.Q(webView)) {
                c2 unused2 = k.d(this.webViewAdPlayer.getScope(), (g) null, (r0) null, new AndroidEmbeddableWebViewAdPlayer$show$2$1(this, showOptions2, (d<? super AndroidEmbeddableWebViewAdPlayer$show$2$1>) null), 3, (Object) null);
                if (!a0.Q(webView)) {
                    c2 unused3 = k.d(this.webViewAdPlayer.getScope(), (g) null, (r0) null, new AndroidEmbeddableWebViewAdPlayer$show$2$2$1(this, (d<? super AndroidEmbeddableWebViewAdPlayer$show$2$2$1>) null), 3, (Object) null);
                } else {
                    webView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$1$$inlined$doOnDetach$1(webView, this));
                }
            } else {
                webView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$1(webView, this, showOptions2));
            }
            c2 unused4 = k.d(q0.b(), (g) null, (r0) null, new AndroidEmbeddableWebViewAdPlayer$show$3(bannerView, this, (d<? super AndroidEmbeddableWebViewAdPlayer$show$3>) null), 3, (Object) null);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
