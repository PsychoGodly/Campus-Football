package com.unity3d.services.ads.gmascar;

import android.content.Context;
import bb.d;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.scar.adapter.common.f;
import com.unity3d.scar.adapter.common.m;
import com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory;
import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.ads.gmascar.finder.GMAInitializer;
import com.unity3d.services.ads.gmascar.finder.PresenceDetector;
import com.unity3d.services.ads.gmascar.finder.ScarVersionFinder;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.ads.gmascar.handlers.SignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.timer.DefaultIntervalTimerFactory;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.ArrayDeque;
import java.util.Arrays;

public class GMAScarAdapterBridge {
    private final AdapterStatusBridge _adapterStatusBridge;
    private final GMAEventSender _gmaEventSender;
    private final GMAInitializer _gmaInitializer;
    private final InitializeListenerBridge _initializationListenerBridge;
    private final InitializationStatusBridge _initializationStatusBridge;
    private final MobileAdsBridgeBase _mobileAdsBridge;
    private final PresenceDetector _presenceDetector;
    private f _scarAdapter;
    private final ScarAdapterFactory _scarAdapterFactory;
    private final ScarVersionFinder _scarVersionFinder;
    private final WebViewErrorHandler _webViewErrorHandler;

    public GMAScarAdapterBridge(MobileAdsBridgeBase mobileAdsBridgeBase, InitializeListenerBridge initializeListenerBridge, InitializationStatusBridge initializationStatusBridge, AdapterStatusBridge adapterStatusBridge, WebViewErrorHandler webViewErrorHandler, ScarAdapterFactory scarAdapterFactory, GMAEventSender gMAEventSender) {
        this._initializationStatusBridge = initializationStatusBridge;
        this._initializationListenerBridge = initializeListenerBridge;
        this._adapterStatusBridge = adapterStatusBridge;
        this._webViewErrorHandler = webViewErrorHandler;
        this._scarAdapterFactory = scarAdapterFactory;
        this._mobileAdsBridge = mobileAdsBridgeBase;
        this._gmaEventSender = gMAEventSender;
        PresenceDetector presenceDetector = new PresenceDetector(mobileAdsBridgeBase, initializeListenerBridge, initializationStatusBridge, adapterStatusBridge);
        this._presenceDetector = presenceDetector;
        GMAInitializer gMAInitializer = new GMAInitializer(mobileAdsBridgeBase, initializeListenerBridge, initializationStatusBridge, adapterStatusBridge, gMAEventSender);
        this._gmaInitializer = gMAInitializer;
        this._scarVersionFinder = new ScarVersionFinder(mobileAdsBridgeBase, presenceDetector, gMAInitializer, gMAEventSender);
    }

    private f getScarAdapterObject() {
        MobileAdsBridgeBase mobileAdsBridgeBase;
        if (this._scarAdapter == null && (mobileAdsBridgeBase = this._mobileAdsBridge) != null) {
            this._scarAdapter = this._scarAdapterFactory.createScarAdapter(mobileAdsBridgeBase.getAdapterVersion(this._scarVersionFinder.getVersionCode()), this._webViewErrorHandler);
        }
        return this._scarAdapter;
    }

    private EventSubject getScarEventSubject(Integer num) {
        return new EventSubject(new ArrayDeque(Arrays.asList(new c[]{c.FIRST_QUARTILE, c.MIDPOINT, c.THIRD_QUARTILE, c.LAST_QUARTILE})), num, new DefaultIntervalTimerFactory());
    }

    private void loadInterstitialAd(bb.c cVar) {
        this._scarAdapter.f(ClientProperties.getApplicationContext(), cVar, new ScarInterstitialAdHandler(cVar, getScarEventSubject(cVar.e()), this._gmaEventSender));
    }

    private void loadRewardedAd(bb.c cVar) {
        this._scarAdapter.d(ClientProperties.getApplicationContext(), cVar, new ScarRewardedAdHandler(cVar, getScarEventSubject(cVar.e()), this._gmaEventSender));
    }

    public void getSCARBiddingSignals(boolean z10, BiddingSignalsHandler biddingSignalsHandler) {
        MobileAdsBridgeBase mobileAdsBridgeBase = this._mobileAdsBridge;
        if (mobileAdsBridgeBase == null || !mobileAdsBridgeBase.hasSCARBiddingSupport()) {
            biddingSignalsHandler.onSignalsCollectionFailed("SCAR bidding unsupported.");
            return;
        }
        f scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject != null) {
            scarAdapterObject.b(ClientProperties.getApplicationContext(), z10, biddingSignalsHandler);
        } else {
            biddingSignalsHandler.onSignalsCollectionFailed("Could not create SCAR adapter object.");
        }
    }

    public void getSCARSignal(String str, d dVar) {
        this._scarAdapter = getScarAdapterObject();
        SignalsHandler signalsHandler = new SignalsHandler(this._gmaEventSender);
        f fVar = this._scarAdapter;
        if (fVar != null) {
            fVar.a(ClientProperties.getApplicationContext(), str, dVar, signalsHandler);
        } else {
            this._webViewErrorHandler.handleError((m) b.e("Could not create SCAR adapter object"));
        }
    }

    public void getVersion() {
        this._scarVersionFinder.getVersion();
    }

    public boolean hasSCARBiddingSupport() {
        MobileAdsBridgeBase mobileAdsBridgeBase = this._mobileAdsBridge;
        if (mobileAdsBridgeBase == null || !mobileAdsBridgeBase.hasSCARBiddingSupport()) {
            return false;
        }
        f scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject != null) {
            return true;
        }
        return false;
    }

    public void initializeScar() {
        if (this._presenceDetector.areGMAClassesPresent()) {
            this._gmaEventSender.send(c.SCAR_PRESENT, new Object[0]);
            this._gmaInitializer.initializeGMA();
            return;
        }
        this._webViewErrorHandler.handleError((m) new b(c.SCAR_NOT_PRESENT, new Object[0]));
    }

    public boolean isInitialized() {
        return this._gmaInitializer.isInitialized();
    }

    public void load(boolean z10, String str, String str2, String str3, String str4, int i10) {
        bb.c cVar = new bb.c(str, str2, str4, str3, Integer.valueOf(i10));
        f scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject == null) {
            this._webViewErrorHandler.handleError((m) b.c(cVar, "Scar Adapter object is null"));
        } else if (z10) {
            loadInterstitialAd(cVar);
        } else {
            loadRewardedAd(cVar);
        }
    }

    public void loadBanner(Context context, BannerView bannerView, String str, bb.c cVar, UnityBannerSize unityBannerSize) {
        this._scarAdapter = getScarAdapterObject();
        ScarBannerAdHandler scarBannerAdHandler = new ScarBannerAdHandler(str);
        f fVar = this._scarAdapter;
        if (fVar != null) {
            fVar.e(context, bannerView, cVar, unityBannerSize.getWidth(), unityBannerSize.getHeight(), scarBannerAdHandler);
            return;
        }
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_LOAD_FAILED, str);
    }

    public void show(String str, String str2, boolean z10) {
        bb.c cVar = new bb.c(str, str2);
        f scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject != null) {
            scarAdapterObject.c(ClientProperties.getActivity(), str2, str);
        } else {
            this._webViewErrorHandler.handleError((m) b.d(cVar, "Scar Adapter object is null"));
        }
    }
}
