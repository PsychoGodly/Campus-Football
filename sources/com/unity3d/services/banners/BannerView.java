package com.unity3d.services.banners;

import android.app.Activity;
import android.view.ViewManager;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import bb.c;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.webplayer.WebPlayerSettingsCache;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.banners.view.BannerWebPlayerContainer;
import com.unity3d.services.banners.view.ScarBannerContainer;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IInitializationListener;
import com.unity3d.services.core.configuration.InitializationNotificationCenter;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.UUID;
import org.json.JSONObject;

public class BannerView extends RelativeLayout {
    /* access modifiers changed from: private */
    public BannerWebPlayerContainer bannerWebPlayerContainer;
    private final GMAScarAdapterBridge gmaScarAdapterBridge = GMA.getInstance().getBridge();
    private IInitializationListener initializationListener;
    private IListener listener;
    private String placementId;
    private ScarBannerContainer scarBannerContainer;
    private UnityBannerSize size;
    /* access modifiers changed from: private */
    public String viewId = UUID.randomUUID().toString();

    public interface IListener {
        void onBannerClick(BannerView bannerView);

        void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo);

        void onBannerLeftApplication(BannerView bannerView);

        void onBannerLoaded(BannerView bannerView);

        void onBannerShown(BannerView bannerView);
    }

    public static abstract class Listener implements IListener {
        public void onBannerClick(BannerView bannerView) {
        }

        public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        }

        public void onBannerLeftApplication(BannerView bannerView) {
        }

        public void onBannerLoaded(BannerView bannerView) {
        }

        public void onBannerShown(BannerView bannerView) {
        }
    }

    public BannerView(Activity activity, String str, UnityBannerSize unityBannerSize) {
        super(activity);
        this.placementId = str;
        this.size = unityBannerSize;
        setupLayoutParams();
        setBackgroundColor(0);
        ClientProperties.setActivity(activity);
        BannerViewCache.getInstance().addBannerView(this);
    }

    /* access modifiers changed from: private */
    public void bridgeLoad() {
        BannerBridge.load(this.placementId, this.viewId, this.size, new UnityAdsLoadOptions());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addScarContainer$0() {
        addView(this.scarBannerContainer);
    }

    private void registerInitializeListener() {
        unregisterInitializeListener();
        this.initializationListener = new IInitializationListener() {
            public void onSdkInitializationFailed(String str, ErrorState errorState, int i10) {
                this.unregisterInitializeListener();
                if (this.getListener() != null) {
                    this.getListener().onBannerFailedToLoad(this, new BannerErrorInfo("UnityAds sdk initialization failed", BannerErrorCode.NATIVE_ERROR));
                }
            }

            public void onSdkInitialized() {
                this.unregisterInitializeListener();
                this.bridgeLoad();
            }
        };
        InitializationNotificationCenter.getInstance().addListener(this.initializationListener);
    }

    private void setupLayoutParams() {
        setLayoutParams(new RelativeLayout.LayoutParams(Math.round(ViewUtilities.pxFromDp(getContext(), (float) this.size.getWidth())), Math.round(ViewUtilities.pxFromDp(getContext(), (float) this.size.getHeight()))));
        setGravity(17);
        requestLayout();
    }

    /* access modifiers changed from: private */
    public void unregisterInitializeListener() {
        if (this.initializationListener != null) {
            InitializationNotificationCenter.getInstance().removeListener(this.initializationListener);
        }
        this.initializationListener = null;
    }

    public void addScarContainer() {
        this.scarBannerContainer = new ScarBannerContainer(getContext(), this.viewId);
        Utilities.runOnUiThread(new a(this));
    }

    public void destroy() {
        BannerViewCache.getInstance().removeBannerView(this.viewId);
        unregisterInitializeListener();
        UnityAdsSDK.INSTANCE.finishOMIDSession(this.viewId);
        BannerBridge.destroy(this.placementId);
        Utilities.runOnUiThread(new Runnable() {
            public void run() {
                ViewParent parent = this.getParent();
                if (parent != null && (parent instanceof ViewManager)) {
                    ((ViewManager) parent).removeView(this);
                }
            }
        });
        BannerWebPlayerContainer bannerWebPlayerContainer2 = this.bannerWebPlayerContainer;
        if (bannerWebPlayerContainer2 != null) {
            bannerWebPlayerContainer2.destroy();
        }
        ScarBannerContainer scarBannerContainer2 = this.scarBannerContainer;
        if (scarBannerContainer2 != null) {
            scarBannerContainer2.destroy();
        }
        DeviceLog.info("Banner [" + this.placementId + "] was destroyed");
        this.viewId = null;
        this.listener = null;
        this.bannerWebPlayerContainer = null;
    }

    public IListener getListener() {
        return this.listener;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public UnityBannerSize getSize() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public String getViewId() {
        return this.viewId;
    }

    public void load() {
        bridgeLoad();
    }

    /* access modifiers changed from: package-private */
    public void loadScarPlayer(String str, c cVar, UnityBannerSize unityBannerSize) {
        this.gmaScarAdapterBridge.loadBanner(getContext(), this, str, cVar, unityBannerSize);
    }

    /* access modifiers changed from: package-private */
    public void loadWebPlayer(final UnityBannerSize unityBannerSize) {
        Utilities.runOnUiThread(new Runnable() {
            public void run() {
                JSONObject webSettings = WebPlayerSettingsCache.getInstance().getWebSettings(this.viewId);
                JSONObject webPlayerSettings = WebPlayerSettingsCache.getInstance().getWebPlayerSettings(this.viewId);
                JSONObject webPlayerEventSettings = WebPlayerSettingsCache.getInstance().getWebPlayerEventSettings(this.viewId);
                if (this.bannerWebPlayerContainer == null) {
                    BannerWebPlayerContainer unused = this.bannerWebPlayerContainer = new BannerWebPlayerContainer(this.getContext(), this.viewId, webSettings, webPlayerSettings, webPlayerEventSettings, unityBannerSize);
                    BannerView bannerView = this;
                    bannerView.addView(bannerView.bannerWebPlayerContainer);
                    return;
                }
                this.bannerWebPlayerContainer.setWebPlayerSettings(webSettings, webPlayerSettings);
                this.bannerWebPlayerContainer.setWebPlayerEventSettings(webPlayerEventSettings);
            }
        });
    }

    public void setListener(IListener iListener) {
        this.listener = iListener;
    }

    private void bridgeLoad(UnityAdsLoadOptions unityAdsLoadOptions) {
        String objectId;
        if (!(unityAdsLoadOptions == null || (objectId = unityAdsLoadOptions.getObjectId()) == null)) {
            BannerViewCache instance = BannerViewCache.getInstance();
            instance.removeBannerView(this.viewId);
            this.viewId = objectId;
            instance.addBannerView(this);
        }
        BannerBridge.load(this.placementId, this.viewId, this.size, unityAdsLoadOptions);
    }

    public void load(UnityAdsLoadOptions unityAdsLoadOptions) {
        bridgeLoad(unityAdsLoadOptions);
    }
}
