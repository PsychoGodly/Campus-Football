package com.applovin.applovin_max;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import io.flutter.plugin.platform.e;
import io.flutter.plugin.platform.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.c;
import lc.j;
import lc.k;

public class AppLovinMAXNativeAdView implements f, MaxAdRevenueListener {
    private static final int ADVERTISER_VIEW_TAG = 8;
    private static final int BODY_VIEW_TAG = 4;
    private static final int CALL_TO_ACTION_VIEW_TAG = 5;
    private static final int ICON_VIEW_TAG = 3;
    private static final int MEDIA_VIEW_CONTAINER_TAG = 2;
    private static final int TITLE_LABEL_TAG = 1;
    private MaxNativeAdLoader adLoader;
    private final String adUnitId;
    private View advertiserView;
    private View bodyView;
    private View callToActionView;
    private final k channel;
    private final List<View> clickableViews = new ArrayList();
    private final Context context;
    private final String customData;
    private Map<String, Object> extraParameters;
    private ImageView iconView;
    private final AtomicBoolean isLoading = new AtomicBoolean();
    private Map<String, Object> localExtraParameters;
    private RelativeLayout mediaViewContainer;
    /* access modifiers changed from: private */
    public MaxAd nativeAd;
    private final FrameLayout nativeAdView;
    private FrameLayout optionsViewContainer;
    private final String placement;
    private final AppLovinSdk sdk;
    private View titleView;

    private class NativeAdListener extends MaxNativeAdListener {
        private NativeAdListener() {
        }

        public void onNativeAdClicked(MaxAd maxAd) {
            AppLovinMAXNativeAdView.this.sendEvent("OnNativeAdClickedEvent", maxAd);
        }

        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            AppLovinMAXNativeAdView appLovinMAXNativeAdView = AppLovinMAXNativeAdView.this;
            appLovinMAXNativeAdView.handleAdLoadFailed("Failed to load native ad for Ad Unit ID " + str + " with error: " + maxError, maxError);
        }

        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            AppLovinMAX.d("Native ad loaded: " + maxAd);
            if (maxNativeAdView != null) {
                AppLovinMAXNativeAdView.this.handleAdLoadFailed("Native ad is of template type, failing ad load...", (MaxError) null);
                return;
            }
            AppLovinMAXNativeAdView.this.maybeDestroyCurrentAd();
            MaxAd unused = AppLovinMAXNativeAdView.this.nativeAd = maxAd;
            AppLovinMAXNativeAdView.this.sendAdLoadedReactNativeEventForAd(maxAd.getNativeAd());
        }
    }

    public AppLovinMAXNativeAdView(int i10, String str, String str2, String str3, Map<String, Object> map, Map<String, Object> map2, c cVar, AppLovinSdk appLovinSdk, Context context2) {
        this.adUnitId = str;
        this.placement = str2;
        this.customData = str3;
        this.sdk = appLovinSdk;
        this.context = context2;
        this.extraParameters = map;
        this.localExtraParameters = map2;
        k kVar = new k(cVar, "applovin_max/nativeadview_" + i10);
        this.channel = kVar;
        kVar.e(new d(this));
        this.nativeAdView = new FrameLayout(context2);
        loadAd();
    }

    private void addAdvertiserView(j jVar, MaxAd maxAd) {
        if (maxAd != null && maxAd.getNativeAd().getAdvertiser() != null) {
            if (this.advertiserView == null) {
                View view = new View(this.context);
                this.advertiserView = view;
                view.setTag(8);
                this.nativeAdView.addView(this.advertiserView);
            }
            this.clickableViews.add(this.advertiserView);
            updateViewLayout(this.nativeAdView, this.advertiserView, getRect(jVar));
        }
    }

    private void addBodyView(j jVar, MaxAd maxAd) {
        if (maxAd != null && maxAd.getNativeAd().getBody() != null) {
            if (this.bodyView == null) {
                View view = new View(this.context);
                this.bodyView = view;
                view.setTag(4);
                this.nativeAdView.addView(this.bodyView);
            }
            this.clickableViews.add(this.bodyView);
            updateViewLayout(this.nativeAdView, this.bodyView, getRect(jVar));
        }
    }

    private void addCallToActionView(j jVar, MaxAd maxAd) {
        if (maxAd != null && maxAd.getNativeAd().getCallToAction() != null) {
            if (this.callToActionView == null) {
                View view = new View(this.context);
                this.callToActionView = view;
                view.setTag(5);
                this.nativeAdView.addView(this.callToActionView);
            }
            this.clickableViews.add(this.callToActionView);
            updateViewLayout(this.nativeAdView, this.callToActionView, getRect(jVar));
        }
    }

    private void addIconView(j jVar, MaxAd maxAd) {
        if (maxAd != null) {
            MaxNativeAd.MaxNativeAdImage icon = maxAd.getNativeAd().getIcon();
            if (icon == null) {
                ImageView imageView = this.iconView;
                if (imageView != null) {
                    imageView.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            if (this.iconView == null) {
                ImageView imageView2 = new ImageView(this.context);
                this.iconView = imageView2;
                imageView2.setTag(3);
                this.nativeAdView.addView(this.iconView);
            }
            this.clickableViews.add(this.iconView);
            updateViewLayout(this.nativeAdView, this.iconView, getRect(jVar));
            if (icon.getUri() != null) {
                AppLovinSdkUtils.setImageUrl(icon.getUri().toString(), this.iconView, this.sdk);
            } else if (icon.getDrawable() != null) {
                this.iconView.setImageDrawable(icon.getDrawable());
            }
        }
    }

    private void addMediaView(j jVar, MaxAd maxAd) {
        View mediaView;
        if (maxAd != null && (mediaView = maxAd.getNativeAd().getMediaView()) != null) {
            if (this.mediaViewContainer == null) {
                RelativeLayout relativeLayout = new RelativeLayout(this.context);
                this.mediaViewContainer = relativeLayout;
                relativeLayout.setId(2);
                this.mediaViewContainer.setTag(2);
                this.nativeAdView.addView(this.mediaViewContainer);
            }
            Rect rect = getRect(jVar);
            if (mediaView.getParent() == null) {
                this.mediaViewContainer.addView(mediaView, new RelativeLayout.LayoutParams(-1, -1));
            }
            updateViewLayout(this.nativeAdView, this.mediaViewContainer, rect);
        }
    }

    private void addOptionsView(j jVar, MaxAd maxAd) {
        View optionsView;
        if (maxAd != null && (optionsView = maxAd.getNativeAd().getOptionsView()) != null) {
            if (this.optionsViewContainer == null) {
                FrameLayout frameLayout = new FrameLayout(this.context);
                this.optionsViewContainer = frameLayout;
                this.nativeAdView.addView(frameLayout);
            }
            if (optionsView.getParent() == null) {
                this.optionsViewContainer.addView(optionsView);
                optionsView.getLayoutParams().height = -1;
                optionsView.getLayoutParams().width = -1;
            }
            updateViewLayout(this.nativeAdView, this.optionsViewContainer, getRect(jVar));
        }
    }

    private void addTitleView(j jVar, MaxAd maxAd) {
        if (maxAd != null && maxAd.getNativeAd().getTitle() != null) {
            if (this.titleView == null) {
                View view = new View(this.context);
                this.titleView = view;
                view.setTag(1);
                this.nativeAdView.addView(this.titleView);
            }
            this.clickableViews.add(this.titleView);
            updateViewLayout(this.nativeAdView, this.titleView, getRect(jVar));
        }
    }

    private Rect getRect(j jVar) {
        int intValue = ((Integer) jVar.a("x")).intValue();
        int intValue2 = ((Integer) jVar.a("y")).intValue();
        return new Rect(intValue, intValue2, ((Integer) jVar.a("width")).intValue() + intValue, ((Integer) jVar.a("height")).intValue() + intValue2);
    }

    /* access modifiers changed from: private */
    public void handleAdLoadFailed(String str, MaxError maxError) {
        this.isLoading.set(false);
        AppLovinMAX.e(str);
        AppLovinMAX.getInstance().fireCallback("OnNativeAdLoadFailedEvent", AppLovinMAX.getInstance().getAdLoadFailedInfo(this.adUnitId, maxError), this.channel);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(j jVar, k.d dVar) {
        if ("addTitleView".equals(jVar.f36116a)) {
            MaxAd maxAd = this.nativeAd;
            if (maxAd != null) {
                addTitleView(jVar, maxAd);
            }
            dVar.success((Object) null);
        } else if ("addAdvertiserView".equals(jVar.f36116a)) {
            MaxAd maxAd2 = this.nativeAd;
            if (maxAd2 != null) {
                addAdvertiserView(jVar, maxAd2);
            }
            dVar.success((Object) null);
        } else if ("addBodyView".equals(jVar.f36116a)) {
            MaxAd maxAd3 = this.nativeAd;
            if (maxAd3 != null) {
                addBodyView(jVar, maxAd3);
            }
            dVar.success((Object) null);
        } else if ("addCallToActionView".equals(jVar.f36116a)) {
            MaxAd maxAd4 = this.nativeAd;
            if (maxAd4 != null) {
                addCallToActionView(jVar, maxAd4);
            }
            dVar.success((Object) null);
        } else if ("addIconView".equals(jVar.f36116a)) {
            MaxAd maxAd5 = this.nativeAd;
            if (maxAd5 != null) {
                addIconView(jVar, maxAd5);
            }
            dVar.success((Object) null);
        } else if ("addOptionsView".equals(jVar.f36116a)) {
            MaxAd maxAd6 = this.nativeAd;
            if (maxAd6 != null) {
                addOptionsView(jVar, maxAd6);
            }
            dVar.success((Object) null);
        } else if ("addMediaView".equals(jVar.f36116a)) {
            MaxAd maxAd7 = this.nativeAd;
            if (maxAd7 != null) {
                addMediaView(jVar, maxAd7);
            }
            dVar.success((Object) null);
        } else if ("renderAd".equals(jVar.f36116a)) {
            MaxAd maxAd8 = this.nativeAd;
            if (maxAd8 != null) {
                renderAd(maxAd8);
            }
            dVar.success((Object) null);
        } else if ("loadAd".equals(jVar.f36116a)) {
            loadAd();
            dVar.success((Object) null);
        } else {
            dVar.notImplemented();
        }
    }

    private void loadAd() {
        if (this.isLoading.compareAndSet(false, true)) {
            AppLovinMAX.d("Loading a native ad for Ad Unit ID: " + this.adUnitId + "...");
            MaxNativeAdLoader maxNativeAdLoader = this.adLoader;
            if (maxNativeAdLoader == null || !this.adUnitId.equals(maxNativeAdLoader.getAdUnitId())) {
                MaxNativeAdLoader maxNativeAdLoader2 = new MaxNativeAdLoader(this.adUnitId, this.sdk, this.context);
                this.adLoader = maxNativeAdLoader2;
                maxNativeAdLoader2.setRevenueListener(this);
                this.adLoader.setNativeAdListener(new NativeAdListener());
            }
            this.adLoader.setPlacement(this.placement);
            this.adLoader.setCustomData(this.customData);
            Map<String, Object> map = this.extraParameters;
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    this.adLoader.setExtraParameter((String) next.getKey(), (String) next.getValue());
                }
            }
            Map<String, Object> map2 = this.localExtraParameters;
            if (map2 != null) {
                for (Map.Entry next2 : map2.entrySet()) {
                    this.adLoader.setLocalExtraParameter((String) next2.getKey(), next2.getValue());
                }
            }
            this.adLoader.loadAd();
            return;
        }
        AppLovinMAX.e("Ignoring request to load native ad for Ad Unit ID " + this.adUnitId + ", another ad load in progress");
    }

    /* access modifiers changed from: private */
    public void maybeDestroyCurrentAd() {
        if (this.nativeAd != null) {
            RelativeLayout relativeLayout = this.mediaViewContainer;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
            FrameLayout frameLayout = this.optionsViewContainer;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            this.adLoader.destroy(this.nativeAd);
            this.nativeAd = null;
        }
        this.clickableViews.clear();
    }

    private void renderAd(MaxAd maxAd) {
        MaxNativeAdLoader maxNativeAdLoader;
        if (maxAd == null || (maxNativeAdLoader = this.adLoader) == null) {
            AppLovinMAX.e("Attempting to render ad before ad has been loaded for Ad Unit ID " + this.adUnitId);
        } else {
            maxNativeAdLoader.a(this.clickableViews, this.nativeAdView, maxAd);
            this.adLoader.b(maxAd);
        }
        this.isLoading.set(false);
    }

    /* access modifiers changed from: private */
    public void sendAdLoadedReactNativeEventForAd(MaxNativeAd maxNativeAd) {
        HashMap hashMap = new HashMap(10);
        hashMap.put("title", maxNativeAd.getTitle());
        hashMap.put("advertiser", maxNativeAd.getAdvertiser());
        hashMap.put("body", maxNativeAd.getBody());
        hashMap.put("callToAction", maxNativeAd.getCallToAction());
        if (maxNativeAd.getStarRating() != null) {
            hashMap.put("starRating", maxNativeAd.getStarRating());
        }
        if (maxNativeAd.getMediaContentAspectRatio() > 0.0f) {
            hashMap.put("mediaContentAspectRatio", Float.valueOf(maxNativeAd.getMediaContentAspectRatio()));
        }
        boolean z10 = true;
        hashMap.put("isIconImageAvailable", Boolean.valueOf(maxNativeAd.getIcon() != null));
        hashMap.put("isOptionsViewAvailable", Boolean.valueOf(maxNativeAd.getOptionsView() != null));
        if (maxNativeAd.getMediaView() == null) {
            z10 = false;
        }
        hashMap.put("isMediaViewAvailable", Boolean.valueOf(z10));
        Map<String, Object> adInfo = AppLovinMAX.getInstance().getAdInfo(this.nativeAd);
        adInfo.put("nativeAd", hashMap);
        AppLovinMAX.getInstance().fireCallback("OnNativeAdLoadedEvent", adInfo, this.channel);
    }

    /* access modifiers changed from: private */
    public void sendEvent(String str, MaxAd maxAd) {
        AppLovinMAX.getInstance().fireCallback(str, maxAd, this.channel);
    }

    private void updateViewLayout(ViewGroup viewGroup, View view, Rect rect) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
        layoutParams.leftMargin = rect.left;
        layoutParams.topMargin = rect.top;
        viewGroup.updateViewLayout(view, layoutParams);
    }

    public void dispose() {
        maybeDestroyCurrentAd();
        View view = this.titleView;
        if (view != null) {
            this.nativeAdView.removeView(view);
        }
        View view2 = this.advertiserView;
        if (view2 != null) {
            this.nativeAdView.removeView(view2);
        }
        View view3 = this.bodyView;
        if (view3 != null) {
            this.nativeAdView.removeView(view3);
        }
        View view4 = this.callToActionView;
        if (view4 != null) {
            this.nativeAdView.removeView(view4);
        }
        ImageView imageView = this.iconView;
        if (imageView != null) {
            this.nativeAdView.removeView(imageView);
        }
        MaxNativeAdLoader maxNativeAdLoader = this.adLoader;
        if (maxNativeAdLoader != null) {
            maxNativeAdLoader.destroy();
            this.adLoader = null;
        }
        k kVar = this.channel;
        if (kVar != null) {
            kVar.e((k.c) null);
        }
    }

    public View getView() {
        return this.nativeAdView;
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        sendEvent("OnNativeAdRevenuePaidEvent", maxAd);
    }

    public void onFlutterViewAttached(View view) {
    }

    public void onFlutterViewDetached() {
    }

    public /* bridge */ /* synthetic */ void onInputConnectionLocked() {
        e.c(this);
    }

    public /* bridge */ /* synthetic */ void onInputConnectionUnlocked() {
        e.d(this);
    }
}
