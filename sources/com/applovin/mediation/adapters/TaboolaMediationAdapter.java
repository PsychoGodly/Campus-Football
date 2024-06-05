package com.applovin.mediation.adapters;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.ul;
import com.applovin.impl.vl;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinSdk;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class TaboolaMediationAdapter extends MediationAdapterBase {
    private static final String ADAPTER_VERSION = "2.0.0";
    private static final AtomicBoolean initialized = new AtomicBoolean();
    /* access modifiers changed from: private */
    public static MaxAdapter.InitializationStatus status;
    private static ul taboolaApiService;
    /* access modifiers changed from: private */
    public AppLovinNativeAd loadedNativeAd;

    private class MaxAppLovinNativeAd extends MaxNativeAd {
        public MaxAppLovinNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
            AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) TaboolaMediationAdapter.this.loadedNativeAd;
            if (appLovinNativeAdImpl == null) {
                TaboolaMediationAdapter.this.e("Failed to register native ad view for interaction. Native ad is null");
                return;
            }
            TaboolaMediationAdapter taboolaMediationAdapter = TaboolaMediationAdapter.this;
            taboolaMediationAdapter.d("Preparing view for interaction: " + maxNativeAdView);
            ArrayList arrayList = new ArrayList(4);
            if (StringUtils.isValidString(getTitle()) && maxNativeAdView.getTitleTextView() != null) {
                TaboolaMediationAdapter taboolaMediationAdapter2 = TaboolaMediationAdapter.this;
                taboolaMediationAdapter2.d("Adding title TextView: " + maxNativeAdView.getTitleTextView());
                arrayList.add(maxNativeAdView.getTitleTextView());
            }
            if (StringUtils.isValidString(getBody()) && maxNativeAdView.getBodyTextView() != null) {
                TaboolaMediationAdapter taboolaMediationAdapter3 = TaboolaMediationAdapter.this;
                taboolaMediationAdapter3.d("Adding body TextView: " + maxNativeAdView.getBodyTextView());
                arrayList.add(maxNativeAdView.getBodyTextView());
            }
            if (StringUtils.isValidString(getCallToAction()) && maxNativeAdView.getCallToActionButton() != null) {
                TaboolaMediationAdapter taboolaMediationAdapter4 = TaboolaMediationAdapter.this;
                taboolaMediationAdapter4.d("Adding CTA button: " + maxNativeAdView.getCallToActionButton());
                TaboolaMediationAdapter taboolaMediationAdapter5 = TaboolaMediationAdapter.this;
                taboolaMediationAdapter5.d("CTA button is clickable: " + maxNativeAdView.getCallToActionButton().isClickable());
                TaboolaMediationAdapter taboolaMediationAdapter6 = TaboolaMediationAdapter.this;
                taboolaMediationAdapter6.d("CTA button is enabled: " + maxNativeAdView.getCallToActionButton().isEnabled());
                TaboolaMediationAdapter taboolaMediationAdapter7 = TaboolaMediationAdapter.this;
                taboolaMediationAdapter7.d("CTA button has onClickListeners: " + maxNativeAdView.getCallToActionButton().hasOnClickListeners());
                arrayList.add(maxNativeAdView.getCallToActionButton());
            }
            if (!(getIcon() == null || maxNativeAdView.getIconImageView() == null)) {
                TaboolaMediationAdapter taboolaMediationAdapter8 = TaboolaMediationAdapter.this;
                taboolaMediationAdapter8.d("Adding icon image view: " + maxNativeAdView.getIconImageView());
                arrayList.add(maxNativeAdView.getIconImageView());
            }
            appLovinNativeAdImpl.registerViewsForInteraction(arrayList, maxNativeAdView);
        }
    }

    public TaboolaMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    protected static Bundle getExtraInfo(AppLovinAd appLovinAd) {
        Bundle bundle = new Bundle(1);
        bundle.putBundle("ad_values", ((AppLovinAdImpl) appLovinAd).getMAXAdValues());
        return bundle;
    }

    protected static MaxAdapterError toMaxError(AppLovinError appLovinError) {
        MaxAdapterError maxAdapterError;
        if (appLovinError.getCode() == -1009) {
            maxAdapterError = MaxAdapterError.NO_CONNECTION;
        } else if (appLovinError.getCode() == 204) {
            maxAdapterError = MaxAdapterError.NO_FILL;
        } else if (appLovinError.getCode() >= 500) {
            maxAdapterError = MaxAdapterError.SERVER_ERROR;
        } else {
            maxAdapterError = MaxAdapterError.UNSPECIFIED;
        }
        return new MaxAdapterError(maxAdapterError.getCode(), maxAdapterError.getErrorMessage(), appLovinError.getCode(), appLovinError.getMessage());
    }

    public String getAdapterVersion() {
        return ADAPTER_VERSION;
    }

    public String getSdkVersion() {
        return "2.0";
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        if (initialized.compareAndSet(false, true)) {
            try {
                JSONObject jSONObject = new JSONObject(maxAdapterInitializationParameters.getServerParameters().getString("app_id", MaxReward.DEFAULT_LABEL));
                String string = JsonUtils.getString(jSONObject, "pub_id", (String) null);
                String string2 = JsonUtils.getString(jSONObject, "api_key", (String) null);
                String string3 = JsonUtils.getString(jSONObject, "base_url", (String) null);
                if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string)) {
                    MaxAdapter.InitializationStatus initializationStatus = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                    status = initializationStatus;
                    onCompletionListener.onCompletion(initializationStatus, "API Key or Publisher ID cannot be null.");
                    return;
                }
                status = MaxAdapter.InitializationStatus.INITIALIZING;
                ul ulVar = new ul(string2, string, string3, getWrappingSdk().a());
                taboolaApiService = ulVar;
                ulVar.a(maxAdapterInitializationParameters, (vl) new vl() {
                    public void onInitialized(boolean z10, String str) {
                        if (z10) {
                            TaboolaMediationAdapter.this.log("Taboola API successfully initialized");
                            MaxAdapter.InitializationStatus unused = TaboolaMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                        } else {
                            TaboolaMediationAdapter.this.log("Taboola API failed to initialized");
                            MaxAdapter.InitializationStatus unused2 = TaboolaMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                        }
                        onCompletionListener.onCompletion(TaboolaMediationAdapter.status, str);
                    }
                });
            } catch (JSONException unused) {
                MaxAdapter.InitializationStatus initializationStatus2 = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                status = initializationStatus2;
                onCompletionListener.onCompletion(initializationStatus2, "Failed to serialize app id json string.");
            }
        } else {
            onCompletionListener.onCompletion(status, (String) null);
        }
    }

    public void loadNativeAd(final MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        if (taboolaApiService == null) {
            log("Taboola Service is not initialized");
            maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        d("Loading native ad: " + thirdPartyAdPlacementId + "...");
        taboolaApiService.a(maxAdapterResponseParameters, (AppLovinNativeAdLoadListener) new AppLovinNativeAdLoadListener() {
            public void onNativeAdLoadFailed(AppLovinError appLovinError) {
                TaboolaMediationAdapter taboolaMediationAdapter = TaboolaMediationAdapter.this;
                taboolaMediationAdapter.d("Native ad: " + thirdPartyAdPlacementId + " failed to load with error: " + appLovinError.getMessage());
                maxNativeAdAdapterListener.onNativeAdLoadFailed(TaboolaMediationAdapter.toMaxError(appLovinError));
            }

            public void onNativeAdLoaded(AppLovinNativeAd appLovinNativeAd) {
                TaboolaMediationAdapter taboolaMediationAdapter = TaboolaMediationAdapter.this;
                taboolaMediationAdapter.d("Native ad loaded: " + thirdPartyAdPlacementId);
                if (!StringUtils.isValidString(BundleUtils.getString("template", MaxReward.DEFAULT_LABEL, maxAdapterResponseParameters.getServerParameters())) || !TextUtils.isEmpty(appLovinNativeAd.getTitle())) {
                    ((AppLovinNativeAdImpl) appLovinNativeAd).setEventListener(new AppLovinNativeAdEventListener() {
                        public void onNativeAdClicked(AppLovinNativeAd appLovinNativeAd) {
                            TaboolaMediationAdapter taboolaMediationAdapter = TaboolaMediationAdapter.this;
                            taboolaMediationAdapter.d("Native ad clicked: " + thirdPartyAdPlacementId);
                            maxNativeAdAdapterListener.onNativeAdClicked();
                        }
                    });
                    AppLovinNativeAd unused = TaboolaMediationAdapter.this.loadedNativeAd = appLovinNativeAd;
                    maxNativeAdAdapterListener.onNativeAdLoaded(new MaxAppLovinNativeAd(new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(appLovinNativeAd.getTitle()).setAdvertiser(appLovinNativeAd.getAdvertiser()).setBody(appLovinNativeAd.getBody()).setCallToAction(appLovinNativeAd.getCallToAction()).setIcon(new MaxNativeAd.MaxNativeAdImage(appLovinNativeAd.getIconUri())).setOptionsView(appLovinNativeAd.getOptionsView()).setMediaView(appLovinNativeAd.getMediaView()).setMainImage(new MaxNativeAd.MaxNativeAdImage(((AppLovinNativeAdImpl) appLovinNativeAd).getMainImageUri())).setMediaContentAspectRatio(appLovinNativeAd.getMediaView().getAspectRatio())), (Bundle) null);
                    return;
                }
                TaboolaMediationAdapter taboolaMediationAdapter2 = TaboolaMediationAdapter.this;
                taboolaMediationAdapter2.e("Native ad does not have required assets: " + thirdPartyAdPlacementId);
                maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
            }
        });
    }

    public void onDestroy() {
        AppLovinNativeAd appLovinNativeAd = this.loadedNativeAd;
        if (appLovinNativeAd instanceof AppLovinNativeAdImpl) {
            ((AppLovinNativeAdImpl) appLovinNativeAd).destroy();
            this.loadedNativeAd = null;
        }
    }
}
