package com.applovin.applovin_max;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinTargetingData;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import dc.a;
import ec.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lc.j;
import lc.k;

public class AppLovinMAX implements a, k.c, ec.a, MaxAdListener, MaxAdViewAdListener, MaxRewardedAdListener, MaxAdRevenueListener {
    private static final String SDK_TAG = "AppLovinSdk";
    private static final String TAG = "AppLovinMAX";
    private static final String USER_GEOGRAPHY_GDPR = "G";
    private static final String USER_GEOGRAPHY_OTHER = "O";
    private static final String USER_GEOGRAPHY_UNKNOWN = "U";
    public static AppLovinMAX instance;
    private Context applicationContext;
    private Boolean creativeDebuggerEnabledToSet;
    private String debugUserGeographyToSet;
    private final Map<String, String> extraParametersToSet = new HashMap(8);
    private List<String> initializationAdUnitIdsToSet;
    private boolean isPluginInitialized;
    private boolean isSdkInitialized;
    private c lastActivityPluginBinding;
    private Boolean locationCollectionEnabledToSet;
    private final List<String> mAdUnitIdsToShowAfterCreate = new ArrayList(2);
    private final Map<String, MaxAdFormat> mAdViewAdFormats = new HashMap(2);
    private final Map<String, String> mAdViewPositions = new HashMap(2);
    private final Map<String, MaxAdView> mAdViews = new HashMap(2);
    private final Map<String, MaxAppOpenAd> mAppOpenAds = new HashMap(2);
    private final Set<String> mDisabledAutoRefreshAdViewAdUnitIds = new HashSet(2);
    private final Map<String, MaxInterstitialAd> mInterstitials = new HashMap(2);
    private final Map<String, MaxRewardedAd> mRewardedAds = new HashMap(2);
    private Boolean mutedToSet;
    private Uri privacyPolicyURLToSet;
    private AppLovinSdk sdk;
    private AppLovinSdkConfiguration sdkConfiguration;
    private k sharedChannel;
    private String targetingEmailToSet;
    private String targetingGenderToSet;
    private List<String> targetingInterestsToSet;
    private List<String> targetingKeywordsToSet;
    private Integer targetingMaximumAdContentRatingToSet;
    private String targetingPhoneNumberToSet;
    private Integer targetingYearOfBirthToSet;
    private Boolean termsAndPrivacyPolicyFlowEnabledToSet;
    private Uri termsOfServiceURLToSet;
    private List<String> testDeviceAdvertisingIdsToSet;
    private String userIdToSet;
    private Boolean verboseLoggingToSet;

    protected static class AdViewSize {
        public final int heightDp;
        public final int widthDp;

        private AdViewSize(int i10, int i11) {
            this.widthDp = i10;
            this.heightDp = i11;
        }
    }

    private void createAdView(String str, MaxAdFormat maxAdFormat, String str2) {
        d("Creating " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\" and position: \"" + str2 + "\"");
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat, str2);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        retrieveAdView.setVisibility(8);
        if (retrieveAdView.getParent() == null) {
            Activity currentActivity = getCurrentActivity();
            RelativeLayout relativeLayout = new RelativeLayout(currentActivity);
            currentActivity.addContentView(relativeLayout, new LinearLayout.LayoutParams(-1, -1));
            relativeLayout.addView(retrieveAdView);
            this.mAdViewAdFormats.put(str, maxAdFormat);
            positionAdView(str, maxAdFormat);
        }
        retrieveAdView.loadAd();
        if (this.mDisabledAutoRefreshAdViewAdUnitIds.contains(str)) {
            retrieveAdView.stopAutoRefresh();
        }
        if (this.mAdUnitIdsToShowAfterCreate.contains(str)) {
            showAdView(str, maxAdFormat);
            this.mAdUnitIdsToShowAfterCreate.remove(str);
        }
    }

    private Map<String, Object> createAdWaterfallInfo(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        HashMap hashMap = new HashMap();
        if (maxAdWaterfallInfo == null) {
            return hashMap;
        }
        hashMap.put(MediationMetaData.KEY_NAME, maxAdWaterfallInfo.getName());
        hashMap.put("testName", maxAdWaterfallInfo.getTestName());
        ArrayList arrayList = new ArrayList();
        for (MaxNetworkResponseInfo createNetworkResponseInfo : maxAdWaterfallInfo.getNetworkResponses()) {
            arrayList.add(createNetworkResponseInfo(createNetworkResponseInfo));
        }
        hashMap.put("networkResponses", arrayList);
        hashMap.put("latencyMillis", Long.valueOf(maxAdWaterfallInfo.getLatencyMillis()));
        return hashMap;
    }

    private Map<String, Object> createNetworkResponseInfo(MaxNetworkResponseInfo maxNetworkResponseInfo) {
        HashMap hashMap = new HashMap();
        hashMap.put("adLoadState", Integer.valueOf(maxNetworkResponseInfo.getAdLoadState().ordinal()));
        MaxMediatedNetworkInfo mediatedNetwork = maxNetworkResponseInfo.getMediatedNetwork();
        if (mediatedNetwork != null) {
            HashMap hashMap2 = new HashMap(4);
            hashMap2.put(MediationMetaData.KEY_NAME, mediatedNetwork.getName());
            hashMap2.put("adapterClassName", mediatedNetwork.getAdapterClassName());
            hashMap2.put("adapterVersion", mediatedNetwork.getAdapterVersion());
            hashMap2.put("sdkVersion", mediatedNetwork.getSdkVersion());
            hashMap.put("mediatedNetwork", hashMap2);
        }
        Bundle credentials = maxNetworkResponseInfo.getCredentials();
        HashMap hashMap3 = new HashMap();
        for (String str : credentials.keySet()) {
            Object obj = credentials.get(str);
            if (obj instanceof String) {
                hashMap3.put(str, (String) obj);
            }
        }
        hashMap.put("credentials", hashMap3);
        MaxError error = maxNetworkResponseInfo.getError();
        if (error != null) {
            hashMap.put("error", getAdLoadFailedInfo(MaxReward.DEFAULT_LABEL, error));
        }
        hashMap.put("latencyMillis", Long.valueOf(maxNetworkResponseInfo.getLatencyMillis()));
        return hashMap;
    }

    public static void d(String str) {
        Log.d(SDK_TAG, "[AppLovinMAX] " + str);
    }

    private void destroyAdView(String str, MaxAdFormat maxAdFormat) {
        d("Destroying " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        ViewParent parent = retrieveAdView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(retrieveAdView);
        }
        retrieveAdView.setListener((MaxAdViewAdListener) null);
        retrieveAdView.setRevenueListener((MaxAdRevenueListener) null);
        retrieveAdView.destroy();
        this.mAdViews.remove(str);
        this.mAdViewAdFormats.remove(str);
        this.mAdViewPositions.remove(str);
    }

    public static void e(String str) {
        Log.e(SDK_TAG, "[AppLovinMAX] " + str);
    }

    public static AdViewSize getAdViewSize(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.LEADER == maxAdFormat) {
            return new AdViewSize(728, 90);
        }
        if (MaxAdFormat.BANNER == maxAdFormat) {
            return new AdViewSize(320, 50);
        }
        if (MaxAdFormat.MREC == maxAdFormat) {
            return new AdViewSize(300, 250);
        }
        throw new IllegalArgumentException("Invalid ad format");
    }

    private static AppLovinTargetingData.AdContentRating getAppLovinAdContentRating(int i10) {
        if (i10 == 1) {
            return AppLovinTargetingData.AdContentRating.ALL_AUDIENCES;
        }
        if (i10 == 2) {
            return AppLovinTargetingData.AdContentRating.EVERYONE_OVER_TWELVE;
        }
        if (i10 == 3) {
            return AppLovinTargetingData.AdContentRating.MATURE_AUDIENCES;
        }
        return AppLovinTargetingData.AdContentRating.NONE;
    }

    private static AppLovinSdkConfiguration.ConsentFlowUserGeography getAppLovinConsentFlowUserGeography(String str) {
        if (USER_GEOGRAPHY_GDPR.equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
        }
        if (USER_GEOGRAPHY_OTHER.equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER;
        }
        return AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    private static AppLovinTargetingData.Gender getAppLovinGender(String str) {
        if (str != null) {
            if ("F".equalsIgnoreCase(str)) {
                return AppLovinTargetingData.Gender.FEMALE;
            }
            if ("M".equalsIgnoreCase(str)) {
                return AppLovinTargetingData.Gender.MALE;
            }
            if (USER_GEOGRAPHY_OTHER.equalsIgnoreCase(str)) {
                return AppLovinTargetingData.Gender.OTHER;
            }
        }
        return AppLovinTargetingData.Gender.UNKNOWN;
    }

    private Activity getCurrentActivity() {
        c cVar = this.lastActivityPluginBinding;
        if (cVar != null) {
            return cVar.getActivity();
        }
        return null;
    }

    private Map<String, Object> getInitializationMessage() {
        HashMap hashMap = new HashMap(4);
        AppLovinSdkConfiguration appLovinSdkConfiguration = this.sdkConfiguration;
        if (appLovinSdkConfiguration != null) {
            hashMap.put("consentDialogState", Integer.valueOf(appLovinSdkConfiguration.getConsentDialogState().ordinal()));
            hashMap.put("countryCode", this.sdkConfiguration.getCountryCode());
            hashMap.put("isTestModeEnabled", Boolean.valueOf(this.sdkConfiguration.isTestModeEnabled()));
            hashMap.put("consentFlowUserGeography", getRawAppLovinConsentFlowUserGeography(this.sdkConfiguration.getConsentFlowUserGeography()));
        } else {
            hashMap.put("consentDialogState", Integer.valueOf(AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN.ordinal()));
        }
        return hashMap;
    }

    public static AppLovinMAX getInstance() {
        return instance;
    }

    private String getLocalExtraParameterKeyForAmazonResult(Object obj) {
        return "DTBAdResponse".equalsIgnoreCase(obj.getClass().getSimpleName()) ? "amazon_ad_response" : "amazon_ad_error";
    }

    private static Point getOffsetPixels(float f10, float f11, Context context) {
        return new Point(AppLovinSdkUtils.dpToPx(context, (int) f10), AppLovinSdkUtils.dpToPx(context, (int) f11));
    }

    private static String getRawAppLovinConsentFlowUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        if (AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR == consentFlowUserGeography) {
            return USER_GEOGRAPHY_GDPR;
        }
        return AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER == consentFlowUserGeography ? USER_GEOGRAPHY_OTHER : USER_GEOGRAPHY_UNKNOWN;
    }

    private void hideAdView(String str, MaxAdFormat maxAdFormat) {
        d("Hiding " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        this.mAdUnitIdsToShowAfterCreate.remove(str);
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        retrieveAdView.setVisibility(8);
        retrieveAdView.stopAutoRefresh();
    }

    private void initialize(String str, String str2, k.d dVar) {
        if (!this.isPluginInitialized) {
            this.isPluginInitialized = true;
            d("Initializing AppLovin MAX Flutter v" + str + "...");
            if (TextUtils.isEmpty(str2)) {
                try {
                    str2 = this.applicationContext.getPackageManager().getApplicationInfo(this.applicationContext.getPackageName(), 128).metaData.getString("applovin.sdk.key", MaxReward.DEFAULT_LABEL);
                } catch (Throwable th) {
                    e("Unable to retrieve SDK key from Android Manifest: " + th);
                }
                if (TextUtils.isEmpty(str2)) {
                    throw new IllegalStateException("Unable to initialize AppLovin SDK - no SDK key provided and not found in Android Manifest!");
                }
            }
            AppLovinSdkSettings appLovinSdkSettings = new AppLovinSdkSettings(this.applicationContext);
            List<String> list = this.initializationAdUnitIdsToSet;
            if (list != null) {
                appLovinSdkSettings.setInitializationAdUnitIds(list);
                this.initializationAdUnitIdsToSet = null;
            }
            if (this.termsAndPrivacyPolicyFlowEnabledToSet != null) {
                appLovinSdkSettings.getTermsAndPrivacyPolicyFlowSettings().setEnabled(this.termsAndPrivacyPolicyFlowEnabledToSet.booleanValue());
                this.termsAndPrivacyPolicyFlowEnabledToSet = null;
            }
            if (this.privacyPolicyURLToSet != null) {
                appLovinSdkSettings.getTermsAndPrivacyPolicyFlowSettings().setPrivacyPolicyUri(this.privacyPolicyURLToSet);
                this.privacyPolicyURLToSet = null;
            }
            if (this.termsOfServiceURLToSet != null) {
                appLovinSdkSettings.getTermsAndPrivacyPolicyFlowSettings().setTermsOfServiceUri(this.termsOfServiceURLToSet);
                this.termsOfServiceURLToSet = null;
            }
            if (AppLovinSdkUtils.isValidString(this.debugUserGeographyToSet)) {
                appLovinSdkSettings.getTermsAndPrivacyPolicyFlowSettings().setDebugUserGeography(getAppLovinConsentFlowUserGeography(this.debugUserGeographyToSet));
                this.debugUserGeographyToSet = null;
            }
            Boolean bool = this.mutedToSet;
            if (bool != null) {
                appLovinSdkSettings.setMuted(bool.booleanValue());
                this.mutedToSet = null;
            }
            List<String> list2 = this.testDeviceAdvertisingIdsToSet;
            if (list2 != null) {
                appLovinSdkSettings.setTestDeviceAdvertisingIds(list2);
                this.testDeviceAdvertisingIdsToSet = null;
            }
            Boolean bool2 = this.verboseLoggingToSet;
            if (bool2 != null) {
                appLovinSdkSettings.setVerboseLogging(bool2.booleanValue());
                this.verboseLoggingToSet = null;
            }
            Boolean bool3 = this.creativeDebuggerEnabledToSet;
            if (bool3 != null) {
                appLovinSdkSettings.setCreativeDebuggerEnabled(bool3.booleanValue());
                this.creativeDebuggerEnabledToSet = null;
            }
            Boolean bool4 = this.locationCollectionEnabledToSet;
            if (bool4 != null) {
                appLovinSdkSettings.setLocationCollectionEnabled(bool4.booleanValue());
                this.locationCollectionEnabledToSet = null;
            }
            setPendingExtraParametersIfNeeded(appLovinSdkSettings);
            AppLovinSdk instance2 = AppLovinSdk.getInstance(str2, appLovinSdkSettings, this.applicationContext);
            this.sdk = instance2;
            instance2.setPluginVersion("Flutter-" + str);
            this.sdk.setMediationProvider(AppLovinMediationProvider.MAX);
            if (AppLovinSdkUtils.isValidString(this.userIdToSet)) {
                this.sdk.setUserIdentifier(this.userIdToSet);
                this.userIdToSet = null;
            }
            if (this.targetingYearOfBirthToSet != null) {
                this.sdk.getTargetingData().setYearOfBirth(this.targetingYearOfBirthToSet.intValue() <= 0 ? null : this.targetingYearOfBirthToSet);
                this.targetingYearOfBirthToSet = null;
            }
            if (this.targetingGenderToSet != null) {
                this.sdk.getTargetingData().setGender(getAppLovinGender(this.targetingGenderToSet));
                this.targetingGenderToSet = null;
            }
            if (this.targetingMaximumAdContentRatingToSet != null) {
                this.sdk.getTargetingData().setMaximumAdContentRating(getAppLovinAdContentRating(this.targetingMaximumAdContentRatingToSet.intValue()));
                this.targetingMaximumAdContentRatingToSet = null;
            }
            if (this.targetingEmailToSet != null) {
                this.sdk.getTargetingData().setEmail(this.targetingEmailToSet);
                this.targetingEmailToSet = null;
            }
            if (this.targetingPhoneNumberToSet != null) {
                this.sdk.getTargetingData().setPhoneNumber(this.targetingPhoneNumberToSet);
                this.targetingPhoneNumberToSet = null;
            }
            if (this.targetingKeywordsToSet != null) {
                this.sdk.getTargetingData().setKeywords(this.targetingKeywordsToSet);
                this.targetingKeywordsToSet = null;
            }
            if (this.targetingInterestsToSet != null) {
                this.sdk.getTargetingData().setInterests(this.targetingInterestsToSet);
                this.targetingInterestsToSet = null;
            }
            this.sdk.initializeSdk((AppLovinSdk.SdkInitializationListener) new b(this, dVar));
        }
    }

    private boolean isInitialized() {
        return isInitialized((k.d) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$0(k.d dVar, AppLovinSdkConfiguration appLovinSdkConfiguration) {
        d("SDK initialized");
        this.sdkConfiguration = appLovinSdkConfiguration;
        this.isSdkInitialized = true;
        dVar.success(getInitializationMessage());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$showCmpForExistingUser$2(k.d dVar, AppLovinCmpError appLovinCmpError) {
        if (appLovinCmpError == null) {
            dVar.success((Object) null);
            return;
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put("code", Integer.valueOf(appLovinCmpError.getCode().getValue()));
        hashMap.put("message", appLovinCmpError.getMessage());
        hashMap.put("cmpCode", Integer.valueOf(appLovinCmpError.getCmpCode()));
        hashMap.put("cmpMessage", appLovinCmpError.getCmpMessage());
        dVar.success(hashMap);
    }

    private void loadAdView(String str, MaxAdFormat maxAdFormat) {
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
        } else if (this.mDisabledAutoRefreshAdViewAdUnitIds.contains(str)) {
            retrieveAdView.loadAd();
        } else if (retrieveAdView.getVisibility() != 0) {
            e("Auto-refresh will resume when the " + maxAdFormat.getLabel() + " ad is shown. You should only call LoadBanner() or LoadMRec() if you explicitly pause auto-refresh and want to manually load an ad.");
        } else {
            e("You must stop auto-refresh if you want to manually load " + maxAdFormat.getLabel() + " ads.");
        }
    }

    private void logInvalidAdFormat(MaxAdFormat maxAdFormat) {
        logStackTrace(new IllegalStateException("invalid ad format: " + maxAdFormat));
    }

    private void logStackTrace(Exception exc) {
        e(Log.getStackTraceString(exc));
    }

    private static void logUninitializedAccessError(String str) {
        logUninitializedAccessError(str, (k.d) null);
    }

    private void positionAdView(MaxAd maxAd) {
        positionAdView(maxAd.getAdUnitId(), maxAd.getFormat());
    }

    private MaxAdView retrieveAdView(String str, MaxAdFormat maxAdFormat) {
        return retrieveAdView(str, maxAdFormat, (String) null);
    }

    private MaxAppOpenAd retrieveAppOpenAd(String str) {
        MaxAppOpenAd maxAppOpenAd = this.mAppOpenAds.get(str);
        if (maxAppOpenAd != null) {
            return maxAppOpenAd;
        }
        MaxAppOpenAd maxAppOpenAd2 = new MaxAppOpenAd(str, this.sdk);
        maxAppOpenAd2.setListener(this);
        maxAppOpenAd2.setRevenueListener(this);
        this.mAppOpenAds.put(str, maxAppOpenAd2);
        return maxAppOpenAd2;
    }

    private MaxInterstitialAd retrieveInterstitial(String str) {
        MaxInterstitialAd maxInterstitialAd = this.mInterstitials.get(str);
        if (maxInterstitialAd != null) {
            return maxInterstitialAd;
        }
        MaxInterstitialAd maxInterstitialAd2 = new MaxInterstitialAd(str, this.sdk, getCurrentActivity());
        maxInterstitialAd2.setListener(this);
        maxInterstitialAd2.setRevenueListener(this);
        this.mInterstitials.put(str, maxInterstitialAd2);
        return maxInterstitialAd2;
    }

    private MaxRewardedAd retrieveRewardedAd(String str) {
        MaxRewardedAd maxRewardedAd = this.mRewardedAds.get(str);
        if (maxRewardedAd != null) {
            return maxRewardedAd;
        }
        MaxRewardedAd instance2 = MaxRewardedAd.getInstance(str, this.sdk, getCurrentActivity());
        instance2.setListener(this);
        instance2.setRevenueListener(this);
        this.mRewardedAds.put(str, instance2);
        return instance2;
    }

    private void setAdViewBackgroundColor(String str, MaxAdFormat maxAdFormat, String str2) {
        d("Setting " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\" to color: " + str2);
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        retrieveAdView.setBackgroundColor(Color.parseColor(str2));
    }

    private void setAdViewExtraParameters(String str, MaxAdFormat maxAdFormat, String str2, String str3) {
        MaxAdFormat maxAdFormat2;
        d("Setting " + maxAdFormat.getLabel() + " extra with key: \"" + str2 + "\" value: " + str3);
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        retrieveAdView.setExtraParameter(str2, str3);
        if ("force_banner".equalsIgnoreCase(str2) && MaxAdFormat.MREC != maxAdFormat) {
            if (Boolean.parseBoolean(str3)) {
                maxAdFormat2 = MaxAdFormat.BANNER;
            } else {
                maxAdFormat2 = getDeviceSpecificBannerAdViewAdFormat();
            }
            this.mAdViewAdFormats.put(str, maxAdFormat2);
            positionAdView(str, maxAdFormat2);
        }
    }

    private void setAdViewPlacement(String str, MaxAdFormat maxAdFormat, String str2) {
        d("Setting placement \"" + str2 + "\" for " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        retrieveAdView.setPlacement(str2);
    }

    private void setAmazonResult(Object obj, String str, MaxAdFormat maxAdFormat) {
        if (this.sdk == null) {
            logUninitializedAccessError("Failed to set Amazon result - SDK not initialized: " + str);
        } else if (obj == null) {
            e("Failed to set Amazon result - null value");
        } else {
            String localExtraParameterKeyForAmazonResult = getLocalExtraParameterKeyForAmazonResult(obj);
            if (maxAdFormat == MaxAdFormat.INTERSTITIAL) {
                MaxInterstitialAd retrieveInterstitial = retrieveInterstitial(str);
                if (retrieveInterstitial == null) {
                    e("Failed to set Amazon result - unable to find interstitial");
                } else {
                    retrieveInterstitial.setLocalExtraParameter(localExtraParameterKeyForAmazonResult, obj);
                }
            } else if (maxAdFormat == MaxAdFormat.REWARDED) {
                MaxRewardedAd retrieveRewardedAd = retrieveRewardedAd(str);
                if (retrieveRewardedAd == null) {
                    e("Failed to set Amazon result - unable to find rewarded ad");
                } else {
                    retrieveRewardedAd.setLocalExtraParameter(localExtraParameterKeyForAmazonResult, obj);
                }
            } else {
                MaxAdView instance2 = AppLovinMAXAdView.getInstance(str);
                if (instance2 == null) {
                    instance2 = retrieveAdView(str, maxAdFormat);
                }
                if (instance2 != null) {
                    instance2.setLocalExtraParameter(localExtraParameterKeyForAmazonResult, obj);
                    return;
                }
                e("Failed to set Amazon result - unable to find " + maxAdFormat);
            }
        }
    }

    private void setPendingExtraParametersIfNeeded(AppLovinSdkSettings appLovinSdkSettings) {
        if (this.extraParametersToSet.size() > 0) {
            for (String next : this.extraParametersToSet.keySet()) {
                appLovinSdkSettings.setExtraParameter(next, this.extraParametersToSet.get(next));
            }
            this.extraParametersToSet.clear();
        }
    }

    private void showAdView(String str, MaxAdFormat maxAdFormat) {
        d("Showing " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist for ad unit id " + str);
            this.mAdUnitIdsToShowAfterCreate.add(str);
            return;
        }
        retrieveAdView.setVisibility(0);
        retrieveAdView.startAutoRefresh();
        if (!this.mDisabledAutoRefreshAdViewAdUnitIds.contains(str)) {
            retrieveAdView.startAutoRefresh();
        }
    }

    private void startAdViewAutoRefresh(String str, MaxAdFormat maxAdFormat) {
        d("Starting " + maxAdFormat.getLabel() + " auto refresh for ad unit identifier \"" + str + "\"");
        this.mDisabledAutoRefreshAdViewAdUnitIds.remove(str);
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist for ad unit identifier \"" + str + "\"");
            return;
        }
        retrieveAdView.startAutoRefresh();
    }

    private void stopAdViewAutoRefresh(String str, MaxAdFormat maxAdFormat) {
        d("Stopping " + maxAdFormat.getLabel() + " auto refresh for ad unit identifier \"" + str + "\"");
        this.mDisabledAutoRefreshAdViewAdUnitIds.add(str);
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist for ad unit identifier \"" + str + "\"");
            return;
        }
        retrieveAdView.stopAutoRefresh();
    }

    private void updateAdViewPosition(String str, String str2, MaxAdFormat maxAdFormat) {
        d("Updating " + maxAdFormat.getLabel() + " position to \"" + str2 + "\" for ad unit id \"" + str + "\"");
        if (retrieveAdView(str, maxAdFormat) == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        String str3 = this.mAdViewPositions.get(str);
        if (str2 != null && !str2.equals(str3)) {
            this.mAdViewPositions.put(str, str2);
            positionAdView(str, maxAdFormat);
        }
    }

    public static void w(String str) {
        Log.w(SDK_TAG, "[AppLovinMAX] " + str);
    }

    public void clearAllTargetingData() {
        AppLovinSdk appLovinSdk = this.sdk;
        if (appLovinSdk == null) {
            logUninitializedAccessError("clearAllTargetingData");
        } else {
            appLovinSdk.getTargetingData().clearAll();
        }
    }

    public void createBanner(String str, String str2) {
        createAdView(str, getDeviceSpecificBannerAdViewAdFormat(), str2);
    }

    public void createMRec(String str, String str2) {
        createAdView(str, MaxAdFormat.MREC, str2);
    }

    public void destroyBanner(String str) {
        destroyAdView(str, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void destroyMRec(String str) {
        destroyAdView(str, MaxAdFormat.MREC);
    }

    public void fireCallback(String str, MaxAd maxAd, k kVar) {
        fireCallback(str, getAdInfo(maxAd), kVar);
    }

    public Map<String, Object> getAdDisplayFailedInfo(MaxAd maxAd, MaxError maxError) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("ad", getAdInfo(maxAd));
        hashMap.put("error", getAdLoadFailedInfo(maxAd.getAdUnitId(), maxError));
        return hashMap;
    }

    public Map<String, Object> getAdInfo(MaxAd maxAd) {
        HashMap hashMap = new HashMap(7);
        hashMap.put("adUnitId", maxAd.getAdUnitId());
        boolean isValidString = AppLovinSdkUtils.isValidString(maxAd.getCreativeId());
        String str = MaxReward.DEFAULT_LABEL;
        hashMap.put("creativeId", isValidString ? maxAd.getCreativeId() : str);
        hashMap.put("networkName", maxAd.getNetworkName());
        hashMap.put("placement", AppLovinSdkUtils.isValidString(maxAd.getPlacement()) ? maxAd.getPlacement() : str);
        hashMap.put("revenue", Double.valueOf(maxAd.getRevenue()));
        hashMap.put("revenuePrecision", maxAd.getRevenuePrecision());
        if (AppLovinSdkUtils.isValidString(maxAd.getDspName())) {
            str = maxAd.getDspName();
        }
        hashMap.put("dspName", str);
        hashMap.put("waterfall", createAdWaterfallInfo(maxAd.getWaterfall()));
        return hashMap;
    }

    public Map<String, Object> getAdLoadFailedInfo(String str, MaxError maxError) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("adUnitId", str);
        if (maxError != null) {
            hashMap.put("code", Integer.valueOf(maxError.getCode()));
            hashMap.put("message", maxError.getMessage());
            hashMap.put("waterfall", createAdWaterfallInfo(maxError.getWaterfall()));
        } else {
            hashMap.put("code", -1);
        }
        return hashMap;
    }

    public void getAdaptiveBannerHeightForWidth(double d10, k.d dVar) {
        dVar.success(Double.valueOf((double) getDeviceSpecificBannerAdViewAdFormat().getAdaptiveSize((int) d10, this.applicationContext).getHeight()));
    }

    public void getConsentDialogState(k.d dVar) {
        if (!isInitialized()) {
            dVar.success(Integer.valueOf(AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN.ordinal()));
        }
        dVar.success(Integer.valueOf(this.sdkConfiguration.getConsentDialogState().ordinal()));
    }

    public MaxAdFormat getDeviceSpecificBannerAdViewAdFormat() {
        return getDeviceSpecificBannerAdViewAdFormat(this.applicationContext);
    }

    public AppLovinSdk getSdk() {
        return this.sdk;
    }

    public void hasSupportedCmp(k.d dVar) {
        if (!this.isPluginInitialized) {
            logUninitializedAccessError("hasSupportedCmp", dVar);
        } else {
            dVar.success(Boolean.valueOf(this.sdk.getCmpService().hasSupportedCmp()));
        }
    }

    public void hasUserConsent(k.d dVar) {
        dVar.success(Boolean.valueOf(AppLovinPrivacySettings.hasUserConsent(this.applicationContext)));
    }

    public void hideBanner(String str) {
        hideAdView(str, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void hideMRec(String str) {
        hideAdView(str, MaxAdFormat.MREC);
    }

    public void isAgeRestrictedUser(k.d dVar) {
        dVar.success(Boolean.valueOf(AppLovinPrivacySettings.isAgeRestrictedUser(this.applicationContext)));
    }

    public void isAppOpenAdReady(String str, k.d dVar) {
        dVar.success(Boolean.valueOf(retrieveAppOpenAd(str).isReady()));
    }

    public void isDoNotSell(k.d dVar) {
        dVar.success(Boolean.valueOf(AppLovinPrivacySettings.isDoNotSell(this.applicationContext)));
    }

    public void isInterstitialReady(String str, k.d dVar) {
        dVar.success(Boolean.valueOf(retrieveInterstitial(str).isReady()));
    }

    public boolean isMuted() {
        if (!this.isPluginInitialized) {
            return false;
        }
        return this.sdk.getSettings().isMuted();
    }

    public void isRewardedAdReady(String str, k.d dVar) {
        dVar.success(Boolean.valueOf(retrieveRewardedAd(str).isReady()));
    }

    public void isTablet(k.d dVar) {
        dVar.success(Boolean.valueOf(AppLovinSdkUtils.isTablet(this.applicationContext)));
    }

    public void loadAppOpenAd(String str) {
        retrieveAppOpenAd(str).loadAd();
    }

    public void loadBanner(String str) {
        loadAdView(str, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void loadInterstitial(String str) {
        retrieveInterstitial(str).loadAd();
    }

    public void loadMRec(String str) {
        loadAdView(str, MaxAdFormat.MREC);
    }

    public void loadRewardedAd(String str) {
        retrieveRewardedAd(str).loadAd();
    }

    public void onAdClicked(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.BANNER == format || MaxAdFormat.LEADER == format) {
            str = "OnBannerAdClickedEvent";
        } else if (MaxAdFormat.MREC == format) {
            str = "OnMRecAdClickedEvent";
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialClickedEvent";
        } else if (MaxAdFormat.REWARDED == format) {
            str = "OnRewardedAdClickedEvent";
        } else if (MaxAdFormat.APP_OPEN == format) {
            str = "OnAppOpenAdClickedEvent";
        } else {
            logInvalidAdFormat(format);
            return;
        }
        fireCallback(str, getAdInfo(maxAd));
    }

    public void onAdCollapsed(MaxAd maxAd) {
        MaxAdFormat format = maxAd.getFormat();
        if (!format.isAdViewAd()) {
            logInvalidAdFormat(format);
        } else {
            fireCallback(MaxAdFormat.MREC == format ? "OnMRecAdCollapsedEvent" : "OnBannerAdCollapsedEvent", getAdInfo(maxAd));
        }
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (format == maxAdFormat || format == MaxAdFormat.REWARDED || format == MaxAdFormat.APP_OPEN) {
            if (maxAdFormat == format) {
                str = "OnInterstitialAdFailedToDisplayEvent";
            } else {
                str = MaxAdFormat.REWARDED == format ? "OnRewardedAdFailedToDisplayEvent" : "OnAppOpenAdFailedToDisplayEvent";
            }
            fireCallback(str, getAdDisplayFailedInfo(maxAd, maxError));
        }
    }

    public void onAdDisplayed(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (format == maxAdFormat || format == MaxAdFormat.REWARDED || format == MaxAdFormat.APP_OPEN) {
            if (maxAdFormat == format) {
                str = "OnInterstitialDisplayedEvent";
            } else {
                str = MaxAdFormat.REWARDED == format ? "OnRewardedAdDisplayedEvent" : "OnAppOpenAdDisplayedEvent";
            }
            fireCallback(str, getAdInfo(maxAd));
        }
    }

    public void onAdExpanded(MaxAd maxAd) {
        MaxAdFormat format = maxAd.getFormat();
        if (!format.isAdViewAd()) {
            logInvalidAdFormat(format);
        } else {
            fireCallback(MaxAdFormat.MREC == format ? "OnMrecAdExpandedEvent" : "OnBannerAdExpandedEvent", getAdInfo(maxAd));
        }
    }

    public void onAdHidden(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (format == maxAdFormat || format == MaxAdFormat.REWARDED || format == MaxAdFormat.APP_OPEN) {
            if (maxAdFormat == format) {
                str = "OnInterstitialHiddenEvent";
            } else {
                str = MaxAdFormat.REWARDED == format ? "OnRewardedAdHiddenEvent" : "OnAppOpenAdHiddenEvent";
            }
            fireCallback(str, getAdInfo(maxAd));
        }
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            logStackTrace(new IllegalArgumentException("adUnitId cannot be null"));
            return;
        }
        if (this.mAdViews.containsKey(str)) {
            str2 = MaxAdFormat.MREC == this.mAdViewAdFormats.get(str) ? "OnMRecAdLoadFailedEvent" : "OnBannerAdLoadFailedEvent";
        } else if (this.mInterstitials.containsKey(str)) {
            str2 = "OnInterstitialLoadFailedEvent";
        } else if (this.mRewardedAds.containsKey(str)) {
            str2 = "OnRewardedAdLoadFailedEvent";
        } else if (this.mAppOpenAds.containsKey(str)) {
            str2 = "OnAppOpenAdLoadFailedEvent";
        } else {
            logStackTrace(new IllegalStateException("invalid adUnitId: " + str));
            return;
        }
        fireCallback(str2, getAdLoadFailedInfo(str, maxError));
    }

    public void onAdLoaded(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (format.isAdViewAd()) {
            str = MaxAdFormat.MREC == format ? "OnMRecAdLoadedEvent" : "OnBannerAdLoadedEvent";
            if (AppLovinSdkUtils.isValidString(this.mAdViewPositions.get(maxAd.getAdUnitId()))) {
                positionAdView(maxAd);
            }
            MaxAdView retrieveAdView = retrieveAdView(maxAd.getAdUnitId(), format);
            if (!(retrieveAdView == null || retrieveAdView.getVisibility() == 0)) {
                retrieveAdView.stopAutoRefresh();
            }
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialLoadedEvent";
        } else if (MaxAdFormat.REWARDED == format) {
            str = "OnRewardedAdLoadedEvent";
        } else if (MaxAdFormat.APP_OPEN == format) {
            str = "OnAppOpenAdLoadedEvent";
        } else {
            logInvalidAdFormat(format);
            return;
        }
        fireCallback(str, getAdInfo(maxAd));
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.BANNER == format || MaxAdFormat.LEADER == format) {
            str = "OnBannerAdRevenuePaid";
        } else if (MaxAdFormat.MREC == format) {
            str = "OnMRecAdRevenuePaid";
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialAdRevenuePaid";
        } else if (MaxAdFormat.REWARDED == format) {
            str = "OnRewardedAdRevenuePaid";
        } else if (MaxAdFormat.APP_OPEN == format) {
            str = "OnAppOpenAdRevenuePaid";
        } else {
            logInvalidAdFormat(format);
            return;
        }
        fireCallback(str, getAdInfo(maxAd));
    }

    public void onAttachedToActivity(c cVar) {
        instance = this;
        this.lastActivityPluginBinding = cVar;
    }

    public void onAttachedToEngine(a.b bVar) {
        this.applicationContext = bVar.a();
        k kVar = new k(bVar.b(), "applovin_max");
        this.sharedChannel = kVar;
        kVar.e(this);
        bVar.e().a("applovin_max/adview", new AppLovinMAXAdViewFactory(bVar.b()));
        bVar.e().a("applovin_max/nativeadview", new AppLovinMAXNativeAdViewFactory(bVar.b()));
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.sharedChannel.e((k.c) null);
    }

    public void onMethodCall(j jVar, k.d dVar) {
        if (MobileAdsBridgeBase.initializeMethodName.equals(jVar.f36116a)) {
            initialize((String) jVar.a("plugin_version"), (String) jVar.a(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY), dVar);
        } else if ("isInitialized".equals(jVar.f36116a)) {
            isInitialized(dVar);
        } else if ("isTablet".equals(jVar.f36116a)) {
            isTablet(dVar);
        } else if ("showMediationDebugger".equals(jVar.f36116a)) {
            showMediationDebugger();
            dVar.success((Object) null);
        } else if ("getConsentDialogState".equals(jVar.f36116a)) {
            getConsentDialogState(dVar);
        } else if ("setHasUserConsent".equals(jVar.f36116a)) {
            setHasUserConsent(((Boolean) jVar.a("value")).booleanValue());
            dVar.success((Object) null);
        } else if ("hasUserConsent".equals(jVar.f36116a)) {
            hasUserConsent(dVar);
        } else if ("setIsAgeRestrictedUser".equals(jVar.f36116a)) {
            setIsAgeRestrictedUser(((Boolean) jVar.a("value")).booleanValue());
            dVar.success((Object) null);
        } else if ("isAgeRestrictedUser".equals(jVar.f36116a)) {
            isAgeRestrictedUser(dVar);
        } else if ("setDoNotSell".equals(jVar.f36116a)) {
            setDoNotSell(((Boolean) jVar.a("value")).booleanValue());
            dVar.success((Object) null);
        } else if ("isDoNotSell".equals(jVar.f36116a)) {
            isDoNotSell(dVar);
        } else if ("setUserId".equals(jVar.f36116a)) {
            setUserId((String) jVar.a("value"));
            dVar.success((Object) null);
        } else if ("setMuted".equals(jVar.f36116a)) {
            setMuted(((Boolean) jVar.a("value")).booleanValue());
            dVar.success((Object) null);
        } else if ("setVerboseLogging".equals(jVar.f36116a)) {
            setVerboseLogging(((Boolean) jVar.a("value")).booleanValue());
            dVar.success((Object) null);
        } else if ("setCreativeDebuggerEnabled".equals(jVar.f36116a)) {
            setCreativeDebuggerEnabled(((Boolean) jVar.a("value")).booleanValue());
            dVar.success((Object) null);
        } else if ("setTestDeviceAdvertisingIds".equals(jVar.f36116a)) {
            setTestDeviceAdvertisingIds((List) jVar.a("value"));
            dVar.success((Object) null);
        } else if ("setLocationCollectionEnabled".equals(jVar.f36116a)) {
            setLocationCollectionEnabled(((Boolean) jVar.a("value")).booleanValue());
            dVar.success((Object) null);
        } else if ("setExtraParameter".equals(jVar.f36116a)) {
            setExtraParameter((String) jVar.a("key"), (String) jVar.a("value"));
            dVar.success((Object) null);
        } else if ("setInitializationAdUnitIds".equals(jVar.f36116a)) {
            setInitializationAdUnitIds((List) jVar.a("value"));
            dVar.success((Object) null);
        } else if ("setTermsAndPrivacyPolicyFlowEnabled".equals(jVar.f36116a)) {
            setTermsAndPrivacyPolicyFlowEnabled(((Boolean) jVar.a("value")).booleanValue());
            dVar.success((Object) null);
        } else if ("setPrivacyPolicyUrl".equals(jVar.f36116a)) {
            setPrivacyPolicyUrl((String) jVar.a("value"));
            dVar.success((Object) null);
        } else if ("setTermsOfServiceUrl".equals(jVar.f36116a)) {
            setTermsOfServiceUrl((String) jVar.a("value"));
            dVar.success((Object) null);
        } else if ("setConsentFlowDebugUserGeography".equals(jVar.f36116a)) {
            setConsentFlowDebugUserGeography((String) jVar.a("value"));
            dVar.success((Object) null);
        } else if ("showCmpForExistingUser".equals(jVar.f36116a)) {
            showCmpForExistingUser(dVar);
        } else if ("hasSupportedCmp".equals(jVar.f36116a)) {
            hasSupportedCmp(dVar);
        } else if ("createBanner".equals(jVar.f36116a)) {
            createBanner((String) jVar.a("ad_unit_id"), (String) jVar.a("position"));
            dVar.success((Object) null);
        } else if ("setBannerBackgroundColor".equals(jVar.f36116a)) {
            setBannerBackgroundColor((String) jVar.a("ad_unit_id"), (String) jVar.a("hex_color_code"));
            dVar.success((Object) null);
        } else if ("setBannerPlacement".equals(jVar.f36116a)) {
            setBannerPlacement((String) jVar.a("ad_unit_id"), (String) jVar.a("placement"));
            dVar.success((Object) null);
        } else if ("updateBannerPosition".equals(jVar.f36116a)) {
            updateBannerPosition((String) jVar.a("ad_unit_id"), (String) jVar.a("position"));
            dVar.success((Object) null);
        } else if ("setBannerExtraParameter".equals(jVar.f36116a)) {
            setBannerExtraParameter((String) jVar.a("ad_unit_id"), (String) jVar.a("key"), (String) jVar.a("value"));
            dVar.success((Object) null);
        } else if ("showBanner".equals(jVar.f36116a)) {
            showBanner((String) jVar.a("ad_unit_id"));
            dVar.success((Object) null);
        } else if ("hideBanner".equals(jVar.f36116a)) {
            hideBanner((String) jVar.a("ad_unit_id"));
            dVar.success((Object) null);
        } else if ("startBannerAutoRefresh".equals(jVar.f36116a)) {
            startBannerAutoRefresh((String) jVar.a("ad_unit_id"));
            dVar.success((Object) null);
        } else if ("stopBannerAutoRefresh".equals(jVar.f36116a)) {
            stopBannerAutoRefresh((String) jVar.a("ad_unit_id"));
            dVar.success((Object) null);
        } else if ("loadBanner".equals(jVar.f36116a)) {
            loadBanner((String) jVar.a("ad_unit_id"));
            dVar.success((Object) null);
        } else if ("destroyBanner".equals(jVar.f36116a)) {
            destroyBanner((String) jVar.a("ad_unit_id"));
            dVar.success((Object) null);
        } else if ("getAdaptiveBannerHeightForWidth".equals(jVar.f36116a)) {
            getAdaptiveBannerHeightForWidth(((Double) jVar.a("width")).doubleValue(), dVar);
        } else if ("createMRec".equals(jVar.f36116a)) {
            createMRec((String) jVar.a("ad_unit_id"), (String) jVar.a("position"));
            dVar.success((Object) null);
        } else if ("setMRecPlacement".equals(jVar.f36116a)) {
            setMRecPlacement((String) jVar.a("ad_unit_id"), (String) jVar.a("placement"));
            dVar.success((Object) null);
        } else if ("updateMRecPosition".equals(jVar.f36116a)) {
            updateMRecPosition((String) jVar.a("ad_unit_id"), (String) jVar.a("position"));
            dVar.success((Object) null);
        } else if ("setMRecExtraParameter".equals(jVar.f36116a)) {
            setMRecExtraParameter((String) jVar.a("ad_unit_id"), (String) jVar.a("key"), (String) jVar.a("value"));
            dVar.success((Object) null);
        } else if ("showMRec".equals(jVar.f36116a)) {
            showMRec((String) jVar.a("ad_unit_id"));
            dVar.success((Object) null);
        } else if ("hideMRec".equals(jVar.f36116a)) {
            hideMRec((String) jVar.a("ad_unit_id"));
            dVar.success((Object) null);
        } else if ("startMRecAutoRefresh".equals(jVar.f36116a)) {
            startMRecAutoRefresh((String) jVar.a("ad_unit_id"));
            dVar.success((Object) null);
        } else if ("stopMRecAutoRefresh".equals(jVar.f36116a)) {
            stopMRecAutoRefresh((String) jVar.a("ad_unit_id"));
            dVar.success((Object) null);
        } else if ("loadMRec".equals(jVar.f36116a)) {
            loadMRec((String) jVar.a("ad_unit_id"));
            dVar.success((Object) null);
        } else if ("destroyMRec".equals(jVar.f36116a)) {
            destroyMRec((String) jVar.a("ad_unit_id"));
            dVar.success((Object) null);
        } else if ("loadInterstitial".equals(jVar.f36116a)) {
            loadInterstitial((String) jVar.a("ad_unit_id"));
            dVar.success((Object) null);
        } else if ("isInterstitialReady".equals(jVar.f36116a)) {
            isInterstitialReady((String) jVar.a("ad_unit_id"), dVar);
        } else if ("showInterstitial".equals(jVar.f36116a)) {
            showInterstitial((String) jVar.a("ad_unit_id"), (String) jVar.a("placement"), (String) jVar.a("custom_data"));
            dVar.success((Object) null);
        } else if ("setInterstitialExtraParameter".equals(jVar.f36116a)) {
            setInterstitialExtraParameter((String) jVar.a("ad_unit_id"), (String) jVar.a("key"), (String) jVar.a("value"));
            dVar.success((Object) null);
        } else if ("loadRewardedAd".equals(jVar.f36116a)) {
            loadRewardedAd((String) jVar.a("ad_unit_id"));
            dVar.success((Object) null);
        } else if ("isRewardedAdReady".equals(jVar.f36116a)) {
            isRewardedAdReady((String) jVar.a("ad_unit_id"), dVar);
        } else if ("showRewardedAd".equals(jVar.f36116a)) {
            showRewardedAd((String) jVar.a("ad_unit_id"), (String) jVar.a("placement"), (String) jVar.a("custom_data"));
            dVar.success((Object) null);
        } else if ("setRewardedAdExtraParameter".equals(jVar.f36116a)) {
            setRewardedAdExtraParameter((String) jVar.a("ad_unit_id"), (String) jVar.a("key"), (String) jVar.a("value"));
            dVar.success((Object) null);
        } else if ("loadAppOpenAd".equals(jVar.f36116a)) {
            loadAppOpenAd((String) jVar.a("ad_unit_id"));
            dVar.success((Object) null);
        } else if ("isAppOpenAdReady".equals(jVar.f36116a)) {
            isAppOpenAdReady((String) jVar.a("ad_unit_id"), dVar);
        } else if ("showAppOpenAd".equals(jVar.f36116a)) {
            showAppOpenAd((String) jVar.a("ad_unit_id"), (String) jVar.a("placement"), (String) jVar.a("custom_data"));
            dVar.success((Object) null);
        } else if ("setAppOpenAdExtraParameter".equals(jVar.f36116a)) {
            setAppOpenAdExtraParameter((String) jVar.a("ad_unit_id"), (String) jVar.a("key"), (String) jVar.a("value"));
            dVar.success((Object) null);
        } else if ("setTargetingDataYearOfBirth".equals(jVar.f36116a)) {
            setTargetingDataYearOfBirth(((Integer) jVar.a("value")).intValue());
            dVar.success((Object) null);
        } else if ("setTargetingDataGender".equals(jVar.f36116a)) {
            setTargetingDataGender((String) jVar.a("value"));
            dVar.success((Object) null);
        } else if ("setTargetingDataMaximumAdContentRating".equals(jVar.f36116a)) {
            setTargetingDataMaximumAdContentRating(((Integer) jVar.a("value")).intValue());
            dVar.success((Object) null);
        } else if ("setTargetingDataEmail".equals(jVar.f36116a)) {
            setTargetingDataEmail((String) jVar.a("value"));
            dVar.success((Object) null);
        } else if ("setTargetingDataPhoneNumber".equals(jVar.f36116a)) {
            setTargetingDataPhoneNumber((String) jVar.a("value"));
            dVar.success((Object) null);
        } else if ("setTargetingDataKeywords".equals(jVar.f36116a)) {
            setTargetingDataKeywords((List) jVar.a("value"));
            dVar.success((Object) null);
        } else if ("setTargetingDataInterests".equals(jVar.f36116a)) {
            setTargetingDataInterests((List) jVar.a("value"));
            dVar.success((Object) null);
        } else if ("clearAllTargetingData".equals(jVar.f36116a)) {
            clearAllTargetingData();
            dVar.success((Object) null);
        } else {
            dVar.notImplemented();
        }
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        instance = this;
    }

    public void onRewardedVideoCompleted(MaxAd maxAd) {
    }

    public void onRewardedVideoStarted(MaxAd maxAd) {
    }

    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        MaxAdFormat format = maxAd.getFormat();
        if (format != MaxAdFormat.REWARDED) {
            logInvalidAdFormat(format);
            return;
        }
        String label = maxReward != null ? maxReward.getLabel() : MaxReward.DEFAULT_LABEL;
        int amount = maxReward != null ? maxReward.getAmount() : 0;
        try {
            Map<String, Object> adInfo = getAdInfo(maxAd);
            adInfo.put("rewardLabel", label);
            adInfo.put("rewardAmount", Integer.valueOf(amount));
            fireCallback("OnRewardedAdReceivedRewardEvent", adInfo);
        } catch (Throwable unused) {
        }
    }

    public void setAmazonBannerResult(Object obj, String str) {
        setAmazonResult(obj, str, MaxAdFormat.BANNER);
    }

    public void setAmazonInterstitialResult(Object obj, String str) {
        setAmazonResult(obj, str, MaxAdFormat.INTERSTITIAL);
    }

    public void setAmazonMRecResult(Object obj, String str) {
        setAmazonResult(obj, str, MaxAdFormat.MREC);
    }

    public void setAmazonRewardedResult(Object obj, String str) {
        setAmazonResult(obj, str, MaxAdFormat.REWARDED);
    }

    public void setAppOpenAdExtraParameter(String str, String str2, String str3) {
        retrieveAppOpenAd(str).setExtraParameter(str2, str3);
    }

    public void setBannerBackgroundColor(String str, String str2) {
        setAdViewBackgroundColor(str, getDeviceSpecificBannerAdViewAdFormat(), str2);
    }

    public void setBannerExtraParameter(String str, String str2, String str3) {
        setAdViewExtraParameters(str, getDeviceSpecificBannerAdViewAdFormat(), str2, str3);
    }

    public void setBannerPlacement(String str, String str2) {
        setAdViewPlacement(str, getDeviceSpecificBannerAdViewAdFormat(), str2);
    }

    public void setConsentFlowDebugUserGeography(String str) {
        this.debugUserGeographyToSet = str;
    }

    public void setCreativeDebuggerEnabled(boolean z10) {
        if (this.isPluginInitialized) {
            this.sdk.getSettings().setCreativeDebuggerEnabled(z10);
            this.creativeDebuggerEnabledToSet = null;
            return;
        }
        this.creativeDebuggerEnabledToSet = Boolean.valueOf(z10);
    }

    public void setDoNotSell(boolean z10) {
        AppLovinPrivacySettings.setDoNotSell(z10, this.applicationContext);
    }

    public void setExtraParameter(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            e("ERROR: Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        AppLovinSdk appLovinSdk = this.sdk;
        if (appLovinSdk != null) {
            AppLovinSdkSettings settings = appLovinSdk.getSettings();
            settings.setExtraParameter(str, str2);
            setPendingExtraParametersIfNeeded(settings);
            return;
        }
        this.extraParametersToSet.put(str, str2);
    }

    public void setHasUserConsent(boolean z10) {
        AppLovinPrivacySettings.setHasUserConsent(z10, this.applicationContext);
    }

    public void setInitializationAdUnitIds(List<String> list) {
        this.initializationAdUnitIdsToSet = new ArrayList(list);
    }

    public void setInterstitialExtraParameter(String str, String str2, String str3) {
        retrieveInterstitial(str).setExtraParameter(str2, str3);
    }

    public void setIsAgeRestrictedUser(boolean z10) {
        AppLovinPrivacySettings.setIsAgeRestrictedUser(z10, this.applicationContext);
    }

    public void setLocationCollectionEnabled(boolean z10) {
        if (this.isPluginInitialized) {
            this.sdk.getSettings().setLocationCollectionEnabled(z10);
            this.locationCollectionEnabledToSet = null;
            return;
        }
        this.locationCollectionEnabledToSet = Boolean.valueOf(z10);
    }

    public void setMRecExtraParameter(String str, String str2, String str3) {
        setAdViewExtraParameters(str, MaxAdFormat.MREC, str2, str3);
    }

    public void setMRecPlacement(String str, String str2) {
        setAdViewPlacement(str, MaxAdFormat.MREC, str2);
    }

    public void setMuted(boolean z10) {
        if (this.isPluginInitialized) {
            this.sdk.getSettings().setMuted(z10);
            this.mutedToSet = null;
            return;
        }
        this.mutedToSet = Boolean.valueOf(z10);
    }

    public void setPrivacyPolicyUrl(String str) {
        this.privacyPolicyURLToSet = Uri.parse(str);
    }

    public void setRewardedAdExtraParameter(String str, String str2, String str3) {
        retrieveRewardedAd(str).setExtraParameter(str2, str3);
    }

    public void setTargetingDataEmail(String str) {
        AppLovinSdk appLovinSdk = this.sdk;
        if (appLovinSdk == null) {
            this.targetingEmailToSet = str;
        } else {
            appLovinSdk.getTargetingData().setEmail(str);
        }
    }

    public void setTargetingDataGender(String str) {
        AppLovinSdk appLovinSdk = this.sdk;
        if (appLovinSdk == null) {
            this.targetingGenderToSet = str;
        } else {
            appLovinSdk.getTargetingData().setGender(getAppLovinGender(str));
        }
    }

    public void setTargetingDataInterests(List<String> list) {
        AppLovinSdk appLovinSdk = this.sdk;
        if (appLovinSdk == null) {
            this.targetingInterestsToSet = list;
        } else {
            appLovinSdk.getTargetingData().setInterests(list);
        }
    }

    public void setTargetingDataKeywords(List<String> list) {
        AppLovinSdk appLovinSdk = this.sdk;
        if (appLovinSdk == null) {
            this.targetingKeywordsToSet = list;
        } else {
            appLovinSdk.getTargetingData().setKeywords(list);
        }
    }

    public void setTargetingDataMaximumAdContentRating(int i10) {
        AppLovinSdk appLovinSdk = this.sdk;
        if (appLovinSdk == null) {
            this.targetingMaximumAdContentRatingToSet = Integer.valueOf(i10);
        } else {
            appLovinSdk.getTargetingData().setMaximumAdContentRating(getAppLovinAdContentRating(i10));
        }
    }

    public void setTargetingDataPhoneNumber(String str) {
        AppLovinSdk appLovinSdk = this.sdk;
        if (appLovinSdk == null) {
            this.targetingPhoneNumberToSet = str;
        } else {
            appLovinSdk.getTargetingData().setPhoneNumber(str);
        }
    }

    public void setTargetingDataYearOfBirth(int i10) {
        AppLovinSdk appLovinSdk = this.sdk;
        if (appLovinSdk == null) {
            this.targetingYearOfBirthToSet = Integer.valueOf(i10);
        } else {
            appLovinSdk.getTargetingData().setYearOfBirth(i10 <= 0 ? null : Integer.valueOf(i10));
        }
    }

    public void setTermsAndPrivacyPolicyFlowEnabled(boolean z10) {
        this.termsAndPrivacyPolicyFlowEnabledToSet = Boolean.valueOf(z10);
    }

    public void setTermsOfServiceUrl(String str) {
        this.termsOfServiceURLToSet = Uri.parse(str);
    }

    public void setTestDeviceAdvertisingIds(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (this.isPluginInitialized) {
            this.sdk.getSettings().setTestDeviceAdvertisingIds(arrayList);
            this.testDeviceAdvertisingIdsToSet = null;
            return;
        }
        this.testDeviceAdvertisingIdsToSet = arrayList;
    }

    public void setUserId(String str) {
        if (this.isPluginInitialized) {
            this.sdk.setUserIdentifier(str);
            this.userIdToSet = null;
            return;
        }
        this.userIdToSet = str;
    }

    public void setVerboseLogging(boolean z10) {
        if (this.isPluginInitialized) {
            this.sdk.getSettings().setVerboseLogging(z10);
            this.verboseLoggingToSet = null;
            return;
        }
        this.verboseLoggingToSet = Boolean.valueOf(z10);
    }

    public void showAppOpenAd(String str, String str2, String str3) {
        retrieveAppOpenAd(str).showAd(str2, str3);
    }

    public void showBanner(String str) {
        showAdView(str, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void showCmpForExistingUser(k.d dVar) {
        if (!this.isPluginInitialized) {
            logUninitializedAccessError("showCmpForExistingUser", dVar);
        } else {
            this.sdk.getCmpService().showCmpForExistingUser(getCurrentActivity(), new a(dVar));
        }
    }

    public void showConsentDialog(k.d dVar) {
        AppLovinSdk appLovinSdk = this.sdk;
        if (appLovinSdk == null) {
            logUninitializedAccessError("showConsentDialog");
        } else {
            appLovinSdk.getUserService().showConsentDialog(getCurrentActivity(), new c(dVar));
        }
    }

    public void showInterstitial(String str, String str2, String str3) {
        retrieveInterstitial(str).showAd(str2, str3);
    }

    public void showMRec(String str) {
        showAdView(str, MaxAdFormat.MREC);
    }

    public void showMediationDebugger() {
        AppLovinSdk appLovinSdk = this.sdk;
        if (appLovinSdk == null) {
            logUninitializedAccessError("showMediationDebugger");
        } else {
            appLovinSdk.showMediationDebugger();
        }
    }

    public void showRewardedAd(String str, String str2, String str3) {
        retrieveRewardedAd(str).showAd(str2, str3);
    }

    public void startBannerAutoRefresh(String str) {
        startAdViewAutoRefresh(str, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void startMRecAutoRefresh(String str) {
        startAdViewAutoRefresh(str, MaxAdFormat.MREC);
    }

    public void stopBannerAutoRefresh(String str) {
        stopAdViewAutoRefresh(str, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void stopMRecAutoRefresh(String str) {
        stopAdViewAutoRefresh(str, MaxAdFormat.MREC);
    }

    public void updateBannerPosition(String str, String str2) {
        updateAdViewPosition(str, str2, getDeviceSpecificBannerAdViewAdFormat());
    }

    public void updateMRecPosition(String str, String str2) {
        updateAdViewPosition(str, str2, MaxAdFormat.MREC);
    }

    public static MaxAdFormat getDeviceSpecificBannerAdViewAdFormat(Context context) {
        return AppLovinSdkUtils.isTablet(context) ? MaxAdFormat.LEADER : MaxAdFormat.BANNER;
    }

    private boolean isInitialized(k.d dVar) {
        boolean z10 = this.isPluginInitialized && this.isSdkInitialized;
        if (dVar != null) {
            dVar.success(Boolean.valueOf(z10));
        }
        return z10;
    }

    private static void logUninitializedAccessError(String str, k.d dVar) {
        String str2 = "ERROR: Failed to execute " + str + "() - please ensure the AppLovin MAX Flutter plugin has been initialized by calling 'AppLovinMAX.initialize(...);'!";
        if (dVar == null) {
            e(str2);
        } else {
            dVar.error(TAG, str2, (Object) null);
        }
    }

    private void positionAdView(String str, MaxAdFormat maxAdFormat) {
        int i10;
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        String str2 = this.mAdViewPositions.get(str);
        RelativeLayout relativeLayout = (RelativeLayout) retrieveAdView.getParent();
        if (relativeLayout == null) {
            e(maxAdFormat.getLabel() + "'s parent does not exist");
            return;
        }
        AdViewSize adViewSize = getAdViewSize(maxAdFormat);
        int dpToPx = AppLovinSdkUtils.dpToPx(getCurrentActivity(), adViewSize.widthDp);
        int dpToPx2 = AppLovinSdkUtils.dpToPx(getCurrentActivity(), adViewSize.heightDp);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) retrieveAdView.getLayoutParams();
        layoutParams.height = dpToPx2;
        retrieveAdView.setLayoutParams(layoutParams);
        retrieveAdView.setRotation(0.0f);
        retrieveAdView.setTranslationX(0.0f);
        int i11 = 0;
        layoutParams.setMargins(0, 0, 0, 0);
        if ("centered".equalsIgnoreCase(str2)) {
            i10 = 17;
        } else {
            if (str2.contains("top")) {
                i11 = 48;
            } else if (str2.contains("bottom")) {
                i11 = 80;
            }
            if (str2.contains("center")) {
                i10 = i11 | 1;
                if (MaxAdFormat.MREC != maxAdFormat) {
                    dpToPx = -1;
                }
                layoutParams.width = dpToPx;
            } else {
                layoutParams.width = dpToPx;
                if (str2.contains("left")) {
                    i10 = i11 | 3;
                } else {
                    i10 = str2.contains("right") ? i11 | 5 : i11;
                }
            }
        }
        relativeLayout.setGravity(i10);
    }

    public void fireCallback(String str, Map<String, Object> map) {
        fireCallback(str, map, this.sharedChannel);
    }

    public MaxAdView retrieveAdView(String str, MaxAdFormat maxAdFormat, String str2) {
        MaxAdView maxAdView = this.mAdViews.get(str);
        if (maxAdView != null || str2 == null) {
            return maxAdView;
        }
        MaxAdView maxAdView2 = new MaxAdView(str, maxAdFormat, this.sdk, getCurrentActivity());
        maxAdView2.setListener(this);
        maxAdView2.setRevenueListener(this);
        this.mAdViews.put(str, maxAdView2);
        this.mAdViewPositions.put(str, str2);
        maxAdView2.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
        return maxAdView2;
    }

    public void fireCallback(String str, Map<String, Object> map, k kVar) {
        kVar.c(str, map);
    }
}
