package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.ar;
import com.applovin.impl.bc;
import com.applovin.impl.bq;
import com.applovin.impl.cr;
import com.applovin.impl.lg;
import com.applovin.impl.ng;
import com.applovin.impl.oj;
import com.applovin.impl.ql;
import com.applovin.impl.s;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.up;
import com.applovin.impl.x3;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinPostbackListener;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class AppLovinNativeAdImpl extends AppLovinAdBase implements AppLovinNativeAd, View.OnClickListener, AppLovinTouchToClickListener.OnClickListener {
    private static final String AD_RESPONSE_TYPE_APPLOVIN = "applovin";
    private static final String AD_RESPONSE_TYPE_ORTB = "ortb";
    private static final String AD_RESPONSE_TYPE_UNDEFINED = "undefined";
    private static final String DEFAULT_APPLOVIN_PRIVACY_URL = "https://www.applovin.com/privacy/";
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private static final String TAG = "AppLovinNativeAd";
    private static final int VIEWABLE_MRC100_PERCENTAGE = 100;
    private static final int VIEWABLE_MRC50_PERCENTAGE = 50;
    private static final int VIEWABLE_MRC_REQUIRED_SECONDS = 1;
    private static final int VIEWABLE_VIDEO_MRC_REQUIRED_SECONDS = 2;
    private final lg adEventTracker;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final Uri clickDestinationBackupUri;
    private final Uri clickDestinationUri;
    private final List<String> clickTrackingUrls;
    private AppLovinNativeAdEventListener eventListener;
    private Uri iconUri;
    private final List<e> impressionRequests;
    private final AtomicBoolean impressionTracked;
    private final List<String> jsTrackers;
    private Uri mainImageUri;
    private AppLovinMediaView mediaView;
    private ViewGroup nativeAdView;
    private final b onAttachStateChangeHandler;
    private AppLovinOptionsView optionsView;
    private Uri privacyDestinationUri;
    private Uri privacyIconUri;
    private final List<View> registeredViews;
    private final Double starRating;
    private final String tag;
    private final String title;
    private final bq vastAd;
    private View videoView;
    private final c viewableMRC100Callback;
    private cr viewableMRC100Tracker;
    private final c viewableMRC50Callback;
    private cr viewableMRC50Tracker;
    private c viewableVideoMRC50Callback;
    private cr viewableVideoMRC50Tracker;

    public static class Builder {
        /* access modifiers changed from: private */
        public final JSONObject adObject;
        /* access modifiers changed from: private */
        public String advertiser;
        /* access modifiers changed from: private */
        public String body;
        /* access modifiers changed from: private */
        public String callToAction;
        /* access modifiers changed from: private */
        public Uri clickDestinationBackupUri;
        /* access modifiers changed from: private */
        public Uri clickDestinationUri;
        /* access modifiers changed from: private */
        public List<String> clickTrackingUrls;
        /* access modifiers changed from: private */
        public final JSONObject fullResponse;
        /* access modifiers changed from: private */
        public Uri iconUri;
        /* access modifiers changed from: private */
        public List<e> impressionRequests;
        /* access modifiers changed from: private */
        public List<String> jsTrackers;
        /* access modifiers changed from: private */
        public Uri mainImageUri;
        /* access modifiers changed from: private */
        public Uri privacyDestinationUri;
        /* access modifiers changed from: private */
        public Uri privacyIconUri;
        /* access modifiers changed from: private */
        public final k sdk;
        /* access modifiers changed from: private */
        public Double starRating;
        /* access modifiers changed from: private */
        public String title;
        /* access modifiers changed from: private */
        public bq vastAd;
        /* access modifiers changed from: private */
        public List<e> viewableMRC100Requests;
        /* access modifiers changed from: private */
        public List<e> viewableMRC50Requests;
        /* access modifiers changed from: private */
        public List<e> viewableVideo50Requests;

        public Builder(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.sdk = kVar;
        }

        public AppLovinNativeAdImpl build() {
            return new AppLovinNativeAdImpl(this, (a) null);
        }

        public Builder setAdvertiser(String str) {
            this.advertiser = str;
            return this;
        }

        public Builder setBody(String str) {
            this.body = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.callToAction = str;
            return this;
        }

        public Builder setClickDestinationBackupUri(Uri uri) {
            this.clickDestinationBackupUri = uri;
            return this;
        }

        public Builder setClickDestinationUri(Uri uri) {
            this.clickDestinationUri = uri;
            return this;
        }

        public Builder setClickTrackingUrls(List<String> list) {
            this.clickTrackingUrls = list;
            return this;
        }

        public Builder setIconUri(Uri uri) {
            this.iconUri = uri;
            return this;
        }

        public Builder setImpressionRequests(List<e> list) {
            this.impressionRequests = list;
            return this;
        }

        public Builder setJsTrackers(List<String> list) {
            this.jsTrackers = list;
            return this;
        }

        public Builder setMainImageUri(Uri uri) {
            this.mainImageUri = uri;
            return this;
        }

        public Builder setPrivacyDestinationUri(Uri uri) {
            this.privacyDestinationUri = uri;
            return this;
        }

        public Builder setPrivacyIconUri(Uri uri) {
            this.privacyIconUri = uri;
            return this;
        }

        public Builder setStarRating(Double d10) {
            this.starRating = d10;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setVastAd(bq bqVar) {
            this.vastAd = bqVar;
            return this;
        }

        public Builder setViewableMRC100Requests(List<e> list) {
            this.viewableMRC100Requests = list;
            return this;
        }

        public Builder setViewableMRC50Requests(List<e> list) {
            this.viewableMRC50Requests = list;
            return this;
        }

        public Builder setViewableVideo50Requests(List<e> list) {
            this.viewableVideo50Requests = list;
            return this;
        }
    }

    class a implements ArrayService.DirectDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Uri f11836a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Uri f11837b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f11838c;

        a(Uri uri, Uri uri2, Context context) {
            this.f11836a = uri;
            this.f11837b = uri2;
            this.f11838c = context;
        }

        public void onAppDetailsDismissed() {
        }

        public void onAppDetailsDisplayed() {
        }

        public void onFailure() {
            AppLovinNativeAdImpl.this.launchUri(this.f11836a, this.f11837b, this.f11838c);
        }
    }

    private static class b implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final AppLovinNativeAdImpl f11840a;

        public b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f11840a = appLovinNativeAdImpl;
        }

        /* access modifiers changed from: protected */
        public boolean a(Object obj) {
            return obj instanceof b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.a(this)) {
                return false;
            }
            AppLovinNativeAdImpl a10 = a();
            AppLovinNativeAdImpl a11 = bVar.a();
            return a10 != null ? a10.equals(a11) : a11 == null;
        }

        public int hashCode() {
            AppLovinNativeAdImpl a10 = a();
            return (a10 == null ? 43 : a10.hashCode()) + 59;
        }

        public void onViewAttachedToWindow(View view) {
            this.f11840a.maybeHandleOnAttachedToWindow(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }

        public String toString() {
            return "AppLovinNativeAdImpl.OnAttachStateChangeHandler(ad=" + a() + ")";
        }

        public AppLovinNativeAdImpl a() {
            return this.f11840a;
        }
    }

    private class c implements cr.a {

        /* renamed from: a  reason: collision with root package name */
        private final List f11841a;

        public c(List list) {
            this.f11841a = list;
        }

        /* access modifiers changed from: protected */
        public boolean a(Object obj) {
            return obj instanceof c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a(this)) {
                return false;
            }
            List a10 = a();
            List a11 = cVar.a();
            return a10 != null ? a10.equals(a11) : a11 == null;
        }

        public int hashCode() {
            List a10 = a();
            return (a10 == null ? 43 : a10.hashCode()) + 59;
        }

        public void onLogVisibilityImpression() {
            for (e dispatchPostbackRequest : this.f11841a) {
                AppLovinNativeAdImpl.this.sdk.a0().dispatchPostbackRequest(dispatchPostbackRequest, (AppLovinPostbackListener) null);
            }
        }

        public String toString() {
            return "AppLovinNativeAdImpl.VisibilityCallback(requests=" + a() + ")";
        }

        public List a() {
            return this.f11841a;
        }
    }

    /* synthetic */ AppLovinNativeAdImpl(Builder builder, a aVar) {
        this(builder);
    }

    private List<s> getDirectClickTrackingPostbacks() {
        List<s> a10;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a((n.a) new c(this));
        }
        synchronized (this.adObjectLock) {
            a10 = zp.a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), getClCode(), getStringFromAdObject("click_tracking_url", (String) null), this.sdk);
        }
        return a10;
    }

    private List<String> getPrivacySandboxClickAttributionUrls() {
        return getStringListFromAdObject("privacy_sandbox_click_attribution_urls", Collections.emptyList());
    }

    private List<String> getPrivacySandboxImpressionAttributionUrls() {
        return getStringListFromAdObject("privacy_sandbox_impression_attribution_urls", Collections.emptyList());
    }

    private boolean isDspAd() {
        return AD_RESPONSE_TYPE_ORTB.equalsIgnoreCase(getType());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List lambda$getDirectClickTrackingPostbacks$0(ql qlVar) {
        return zp.a(qlVar.a("click_tracking_urls", new JSONObject()), getClCode(), qlVar.a("click_tracking_url", (String) null), this.sdk);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List lambda$getOpenMeasurementVerificationScriptResources$1(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            try {
                URL url = new URL(JsonUtils.getString(jSONObject, "url", (String) null));
                String string = JsonUtils.getString(jSONObject, "vendor_key", (String) null);
                String string2 = JsonUtils.getString(jSONObject, "parameters", (String) null);
                if (!StringUtils.isValidString(string) || !StringUtils.isValidString(string2)) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                    i10++;
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                    i10++;
                }
            } catch (Throwable th) {
                this.sdk.L();
                if (t.a()) {
                    this.sdk.L().a(this.tag, "Failed to parse OMID verification script resource", th);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List lambda$getOpenMeasurementVerificationScriptResources$2(n.a aVar, ql qlVar) {
        return (List) aVar.apply(qlVar.a("omid_verification_script_resources", (JSONArray) null));
    }

    /* access modifiers changed from: private */
    public void launchUri(Uri uri, Uri uri2, Context context) {
        if (up.a(uri, context, this.sdk)) {
            this.sdk.L();
            if (t.a()) {
                t L = this.sdk.L();
                String str = this.tag;
                L.a(str, "Opening URL: " + uri);
            }
        } else if (up.a(uri2, context, this.sdk)) {
            this.sdk.L();
            if (t.a()) {
                t L2 = this.sdk.L();
                String str2 = this.tag;
                L2.a(str2, "Opening backup URL: " + uri2);
            }
        }
    }

    /* access modifiers changed from: private */
    public void maybeHandleOnAttachedToWindow(View view) {
        if (this.impressionTracked.compareAndSet(false, true)) {
            cr crVar = new cr(this.nativeAdView, this.sdk, this.viewableMRC50Callback);
            this.viewableMRC50Tracker = crVar;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            crVar.a(0, 50.0f, 50.0f, timeUnit.toMillis(1), this.nativeAdView);
            cr crVar2 = new cr(this.nativeAdView, this.sdk, this.viewableMRC100Callback);
            this.viewableMRC100Tracker = crVar2;
            crVar2.a(0, 100.0f, 100.0f, timeUnit.toMillis(1), this.nativeAdView);
            bq bqVar = this.vastAd;
            if (bqVar != null && bqVar.hasVideoUrl()) {
                cr crVar3 = new cr(this.nativeAdView, this.sdk, this.viewableVideoMRC50Callback);
                this.viewableVideoMRC50Tracker = crVar3;
                crVar3.a(0, 50.0f, 50.0f, timeUnit.toMillis(2), this.videoView);
            }
            List<String> list = this.jsTrackers;
            if (list != null) {
                for (String b10 : list) {
                    this.sdk.u0().b(b10);
                }
            }
            for (e dispatchPostbackRequest : this.impressionRequests) {
                this.sdk.a0().dispatchPostbackRequest(dispatchPostbackRequest, (AppLovinPostbackListener) null);
            }
            this.adEventTracker.a(view);
            this.adEventTracker.g();
            if (this.sdk.b0() != null) {
                this.sdk.b0().b((List) getPrivacySandboxImpressionAttributionUrls());
            }
        }
    }

    public void destroy() {
        unregisterViewsForInteraction();
        this.eventListener = null;
        this.adEventTracker.f();
    }

    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1);
    }

    public String getAdvertiser() {
        return this.advertiser;
    }

    public String getBody() {
        return this.body;
    }

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", (String) null);
    }

    public String getCallToAction() {
        return this.callToAction;
    }

    public Bundle getDirectDownloadParameters() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (Bundle) qlVar.a((n.a) f.f11875a);
        }
        return JsonUtils.toBundle(getJsonObjectFromAdObject("ah_parameters", (JSONObject) null));
    }

    public String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", (String) null);
    }

    public Uri getIconUri() {
        return this.iconUri;
    }

    public Uri getMainImageUri() {
        return this.mainImageUri;
    }

    public AppLovinMediaView getMediaView() {
        return this.mediaView;
    }

    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", (String) null);
    }

    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", MaxReward.DEFAULT_LABEL);
    }

    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        List<VerificationScriptResource> list;
        if (this.sdk.Y().e()) {
            return Collections.singletonList(VerificationScriptResource.createVerificationScriptResourceWithParameters(ng.c(), ng.b(), ng.a()));
        }
        d dVar = new d(this);
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a((n.a) new e(dVar));
        }
        synchronized (this.adObjectLock) {
            list = (List) dVar.apply(getJsonArrayFromAdObject("omid_verification_script_resources", (JSONArray) null));
        }
        return list;
    }

    public AppLovinOptionsView getOptionsView() {
        return this.optionsView;
    }

    public Uri getPrivacyDestinationUri() {
        return this.privacyDestinationUri;
    }

    public Uri getPrivacyIconUri() {
        return this.privacyIconUri;
    }

    public Double getStarRating() {
        return this.starRating;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return getStringFromAdObject("type", AD_RESPONSE_TYPE_UNDEFINED);
    }

    public bq getVastAd() {
        return this.vastAd;
    }

    /* access modifiers changed from: protected */
    public void handleNativeAdClick(Uri uri, Uri uri2, MotionEvent motionEvent, Context context) {
        if (this.sdk.b0() != null) {
            this.sdk.b0().b((List) getPrivacySandboxClickAttributionUrls(), (InputEvent) motionEvent);
        }
        handleNativeAdClick(uri, uri2, context);
    }

    public boolean isDirectDownloadEnabled() {
        return StringUtils.isValidString(getDirectDownloadToken());
    }

    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.Y().e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    public void onClick(View view) {
        Context context;
        this.sdk.L();
        if (t.a()) {
            this.sdk.L().a(this.tag, "Handle view clicked");
        }
        this.sdk.i().maybeSubmitPersistentPostbacks(getDirectClickTrackingPostbacks());
        if (((Boolean) this.sdk.a(oj.N)).booleanValue()) {
            context = ar.a((View) this.nativeAdView, this.sdk);
            if (context == null) {
                context = view.getContext();
            }
        } else {
            context = view.getContext();
        }
        handleNativeAdClick(this.clickDestinationUri, this.clickDestinationBackupUri, context);
    }

    public void registerViewsForInteraction(List<View> list, ViewGroup viewGroup) {
        this.nativeAdView = viewGroup;
        if (x3.e() && this.nativeAdView.isAttachedToWindow()) {
            maybeHandleOnAttachedToWindow(this.nativeAdView);
        } else if (x3.e() || this.nativeAdView.getParent() == null) {
            this.nativeAdView.addOnAttachStateChangeListener(this.onAttachStateChangeHandler);
        } else {
            maybeHandleOnAttachedToWindow(this.nativeAdView);
        }
        this.sdk.L();
        if (t.a()) {
            t L = this.sdk.L();
            String str = this.tag;
            L.a(str, "Registered ad view for impressions: " + this.nativeAdView);
        }
        if (this.clickDestinationUri == null && this.clickDestinationBackupUri == null) {
            this.sdk.L();
            if (t.a()) {
                this.sdk.L().a(this.tag, "Skipping click registration - no click URLs provided");
                return;
            }
            return;
        }
        for (View next : list) {
            if (next.hasOnClickListeners()) {
                this.sdk.L();
                if (t.a()) {
                    t L2 = this.sdk.L();
                    String str2 = this.tag;
                    L2.k(str2, "View has an onClickListener already - " + next);
                }
            }
            if (!next.isClickable()) {
                this.sdk.L();
                if (t.a()) {
                    t L3 = this.sdk.L();
                    String str3 = this.tag;
                    L3.k(str3, "View is not clickable - " + next);
                }
            }
            if (!next.isEnabled()) {
                this.sdk.L();
                if (t.a()) {
                    t L4 = this.sdk.L();
                    String str4 = this.tag;
                    L4.b(str4, "View is not enabled - " + next);
                }
            }
            if (next instanceof Button) {
                this.sdk.L();
                if (t.a()) {
                    t L5 = this.sdk.L();
                    String str5 = this.tag;
                    L5.a(str5, "Registering click for button: " + next);
                }
            } else {
                this.sdk.L();
                if (t.a()) {
                    t L6 = this.sdk.L();
                    String str6 = this.tag;
                    L6.a(str6, "Registering click for view: " + next);
                }
            }
            if (((Boolean) this.sdk.a(oj.S2)).booleanValue()) {
                next.setOnTouchListener(new AppLovinTouchToClickListener(this.sdk, oj.D0, viewGroup.getContext(), this));
            } else {
                next.setOnClickListener(this);
            }
            this.registeredViews.add(next);
        }
        this.sdk.L();
        if (t.a()) {
            t L7 = this.sdk.L();
            String str7 = this.tag;
            L7.a(str7, "Registered views: " + this.registeredViews);
        }
    }

    public void setEventListener(AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        this.eventListener = appLovinNativeAdEventListener;
    }

    public void setIconUri(Uri uri) {
        this.iconUri = uri;
    }

    public void setMainImageUri(Uri uri) {
        this.mainImageUri = uri;
    }

    public void setPrivacyIconUri(Uri uri) {
        this.privacyIconUri = uri;
    }

    public void setUpNativeAdViewComponents() {
        bq bqVar = this.vastAd;
        if (bqVar == null || !bqVar.hasVideoUrl()) {
            this.mediaView = new AppLovinMediaView(this, this.sdk, k.k());
        } else {
            try {
                this.mediaView = new AppLovinVastMediaView(this, this.sdk, k.k());
            } catch (Throwable th) {
                this.sdk.L();
                if (t.a()) {
                    this.sdk.L().d(this.tag, "Failed to create ExoPlayer VAST media view. Falling back to static image for media view.", th);
                }
                this.sdk.B().a(TAG, "createExoPlayerVASTMediaView", th);
                this.mediaView = new AppLovinMediaView(this, this.sdk, k.k());
            }
        }
        if (this.privacyDestinationUri != null) {
            this.optionsView = new AppLovinOptionsView(this, this.sdk, k.k());
            return;
        }
        this.sdk.L();
        if (t.a()) {
            this.sdk.L().a(this.tag, "Privacy icon will not render because no native ad privacy URL is provided.");
        }
    }

    public void setVideoView(View view) {
        this.videoView = view;
    }

    public String toString() {
        return "AppLovinNativeAd{adIdNumber=" + getAdIdNumber() + " - " + getTitle() + "}";
    }

    public void unregisterViewsForInteraction() {
        for (View next : this.registeredViews) {
            next.setOnTouchListener((View.OnTouchListener) null);
            next.setOnClickListener((View.OnClickListener) null);
        }
        this.sdk.L();
        if (t.a()) {
            t L = this.sdk.L();
            String str = this.tag;
            L.a(str, "Unregistered views: " + this.registeredViews);
        }
        this.registeredViews.clear();
        cr crVar = this.viewableMRC50Tracker;
        if (crVar != null) {
            crVar.b();
        }
        cr crVar2 = this.viewableMRC100Tracker;
        if (crVar2 != null) {
            crVar2.b();
        }
        cr crVar3 = this.viewableVideoMRC50Tracker;
        if (crVar3 != null) {
            crVar3.b();
        }
        ViewGroup viewGroup = this.nativeAdView;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this.onAttachStateChangeHandler);
            this.nativeAdView = null;
        }
        AppLovinMediaView appLovinMediaView = this.mediaView;
        if (appLovinMediaView != null) {
            appLovinMediaView.destroy();
        }
        AppLovinOptionsView appLovinOptionsView = this.optionsView;
        if (appLovinOptionsView != null) {
            appLovinOptionsView.destroy();
        }
    }

    private AppLovinNativeAdImpl(Builder builder) {
        super(builder.adObject, builder.fullResponse, builder.sdk);
        this.impressionTracked = new AtomicBoolean();
        this.registeredViews = new ArrayList();
        this.onAttachStateChangeHandler = new b(this);
        this.adEventTracker = new lg(this);
        this.title = builder.title;
        this.advertiser = builder.advertiser;
        this.body = builder.body;
        this.callToAction = builder.callToAction;
        this.iconUri = builder.iconUri;
        this.mainImageUri = builder.mainImageUri;
        this.privacyIconUri = builder.privacyIconUri;
        bq access$1000 = builder.vastAd;
        this.vastAd = access$1000;
        this.clickDestinationUri = builder.clickDestinationUri;
        this.clickDestinationBackupUri = builder.clickDestinationBackupUri;
        this.clickTrackingUrls = builder.clickTrackingUrls;
        this.jsTrackers = builder.jsTrackers;
        this.impressionRequests = builder.impressionRequests;
        Double access$1600 = builder.starRating;
        this.starRating = (access$1600 == null || access$1600.doubleValue() < 3.0d) ? null : access$1600;
        if (builder.privacyDestinationUri != null) {
            this.privacyDestinationUri = builder.privacyDestinationUri;
        } else if (!isDspAd() || getSdk().n0().c()) {
            this.privacyDestinationUri = Uri.parse(DEFAULT_APPLOVIN_PRIVACY_URL);
        }
        this.viewableMRC50Callback = new c(builder.viewableMRC50Requests);
        this.viewableMRC100Callback = new c(builder.viewableMRC100Requests);
        if (access$1000 != null && access$1000.hasVideoUrl()) {
            this.viewableVideoMRC50Callback = new c(builder.viewableVideo50Requests);
        }
        this.tag = "AppLovinNativeAd:" + getAdIdNumber();
    }

    public lg getAdEventTracker() {
        return this.adEventTracker;
    }

    private void handleNativeAdClick(Uri uri, Uri uri2, Context context) {
        for (String dispatchPostbackAsync : this.clickTrackingUrls) {
            this.sdk.a0().dispatchPostbackAsync(dispatchPostbackAsync, (AppLovinPostbackListener) null);
        }
        bc.b(this.eventListener, (AppLovinNativeAd) this);
        if (isDirectDownloadEnabled()) {
            this.sdk.l().startDirectInstallOrDownloadProcess(this, (Bundle) null, new a(uri, uri2, context));
        } else {
            launchUri(uri, uri2, context);
        }
    }

    public void onClick(View view, MotionEvent motionEvent) {
        Context context;
        this.sdk.L();
        if (t.a()) {
            this.sdk.L().a(this.tag, "Handle view clicked");
        }
        this.sdk.i().maybeSubmitPersistentPostbacks(getDirectClickTrackingPostbacks());
        if (((Boolean) this.sdk.a(oj.N)).booleanValue()) {
            context = ar.a((View) this.nativeAdView, this.sdk);
            if (context == null) {
                context = view.getContext();
            }
        } else {
            context = view.getContext();
        }
        handleNativeAdClick(this.clickDestinationUri, this.clickDestinationBackupUri, motionEvent, context);
    }
}
