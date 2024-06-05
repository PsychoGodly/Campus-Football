package com.applovin.impl.sdk.ad;

import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import com.applovin.impl.adview.e;
import com.applovin.impl.adview.m;
import com.applovin.impl.c5;
import com.applovin.impl.ch;
import com.applovin.impl.ig;
import com.applovin.impl.oj;
import com.applovin.impl.ql;
import com.applovin.impl.rq;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.tr;
import com.applovin.impl.x3;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.unity3d.services.UnityAdsConstants;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class b extends AppLovinAdImpl {

    /* renamed from: f  reason: collision with root package name */
    private final List f11490f = CollectionUtils.synchronizedList();

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f11491g = new AtomicBoolean();

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f11492h = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    private final AtomicReference f11493i = new AtomicReference();

    /* renamed from: j  reason: collision with root package name */
    private final Bundle f11494j = new Bundle();

    /* renamed from: k  reason: collision with root package name */
    private d f11495k;

    /* renamed from: com.applovin.impl.sdk.ad.b$b  reason: collision with other inner class name */
    public enum C0137b {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    public enum c {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    public class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f11504a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11505b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11506c;

        /* renamed from: d  reason: collision with root package name */
        public final int f11507d;

        /* renamed from: e  reason: collision with root package name */
        public final int f11508e;

        private d() {
            this.f11504a = AppLovinSdkUtils.dpToPx(k.k(), b.this.m());
            this.f11505b = AppLovinSdkUtils.dpToPx(k.k(), b.this.o());
            this.f11506c = AppLovinSdkUtils.dpToPx(k.k(), b.this.k());
            this.f11507d = AppLovinSdkUtils.dpToPx(k.k(), ((Integer) b.this.sdk.a(oj.C1)).intValue());
            this.f11508e = AppLovinSdkUtils.dpToPx(k.k(), ((Integer) b.this.sdk.a(oj.B1)).intValue());
        }
    }

    public enum e {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(jSONObject, jSONObject2, kVar);
    }

    private List J() {
        return getIntegerListFromAdObject("multi_close_style", (List<Integer>) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(ql qlVar) {
        return zp.a(qlVar.a("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List b(ql qlVar) {
        return zp.a(qlVar.a("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Map c(ql qlVar) {
        try {
            return JsonUtils.toStringMap(qlVar.a("custom_tabs_http_headers", new JSONObject()));
        } catch (JSONException e10) {
            this.sdk.L();
            if (t.a()) {
                this.sdk.L().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e10);
            }
            return new HashMap();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List d(ql qlVar) {
        return zp.a(qlVar.a("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List e(ql qlVar) {
        return zp.a(qlVar.a("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List g(ql qlVar) {
        return zp.a(qlVar.a("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ c5 h(ql qlVar) {
        JSONObject a10 = qlVar.a("custom_tabs_settings", (JSONObject) null);
        if (a10 != null) {
            return new c5(a10);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List i(ql qlVar) {
        return zp.a(qlVar.a("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List j(ql qlVar) {
        return zp.a(qlVar.a("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List l(ql qlVar) {
        return zp.a(qlVar.a("imp_urls", new JSONObject()), getClCode(), (Map) null, (String) null, Q(), Q0(), this.sdk);
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
                    this.sdk.L().a("DirectAd", "Failed to parse OMID verification script resource", th);
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
    public static /* synthetic */ Map m(ql qlVar) {
        try {
            return JsonUtils.toStringMap(qlVar.a("http_headers_for_postbacks", new JSONObject()));
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    private String o0() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", (String) null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ rq q(ql qlVar) {
        return new rq(qlVar.a("video_button_properties", (JSONObject) null), this.sdk);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List r(ql qlVar) {
        return zp.a(qlVar.a("video_end_urls", new JSONObject()), getClCode(), o0(), this.sdk);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ m s(ql qlVar) {
        JSONObject a10 = qlVar.a("web_view_settings", (JSONObject) null);
        if (a10 != null) {
            return new m(a10);
        }
        return null;
    }

    public List A() {
        return getStringListFromAdObject("custom_tabs_warmup_urls", Collections.emptyList());
    }

    public boolean A0() {
        return getBooleanFromAdObject("custom_tabs_enabled", Boolean.FALSE);
    }

    public boolean B() {
        return getBooleanFromAdObject("dismiss_on_skip", Boolean.FALSE);
    }

    public boolean B0() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", Boolean.FALSE);
    }

    public int C() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    public boolean C0() {
        return getBooleanFromAdObject("lock_current_orientation", Boolean.FALSE);
    }

    public int D() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public AtomicBoolean D0() {
        return this.f11491g;
    }

    public int E() {
        return zp.a(getIntFromAdObject("graphic_completion_percent", -1), 90);
    }

    public boolean E0() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.a(oj.f10394r2));
    }

    public List F() {
        List a10;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a((n.a) new y(this));
        }
        synchronized (this.adObjectLock) {
            a10 = zp.a(getJsonObjectFromAdObject("imp_urls", new JSONObject()), getClCode(), (Map) null, (String) null, Q(), Q0(), this.sdk);
        }
        return a10;
    }

    public boolean F0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE);
    }

    public boolean G() {
        return getBooleanFromAdObject("playback_requires_user_action", Boolean.TRUE);
    }

    public abstract boolean G0();

    public String H() {
        return getStringFromFullResponse("event_id", (String) null);
    }

    public boolean H0() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", Boolean.valueOf(zp.h(k.k()) || zp.f(k.k()) || ((Boolean) this.sdk.a(oj.f10366n6)).booleanValue()));
    }

    public List I() {
        List<Integer> J = J();
        if (J == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(J.size());
        for (Integer intValue : J) {
            arrayList.add(a(intValue.intValue()));
        }
        return arrayList;
    }

    public boolean I0() {
        return getBooleanFromAdObject("web_video", Boolean.FALSE);
    }

    public abstract void J0();

    public List K() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", (List<Integer>) null);
    }

    public boolean K0() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", Boolean.FALSE);
    }

    public Uri L() {
        String stringFromAdObject = getStringFromAdObject("mute_image", "https://assets.applovin.com/sound_off.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean L0() {
        return getBooleanFromAdObject("should_apply_web_view_settings_to_web_view_button", (Boolean) this.sdk.a(oj.f10398r6));
    }

    public String M() {
        return getStringFromAdObject("nia_button_title", MaxReward.DEFAULT_LABEL);
    }

    public boolean M0() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return ((Boolean) qlVar.a((n.a) r.f11543a)).booleanValue();
        }
        return JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", (JSONObject) null), "should_cache_video_button_html_assets", Boolean.FALSE).booleanValue();
    }

    public String N() {
        return getStringFromAdObject("nia_message", MaxReward.DEFAULT_LABEL);
    }

    public boolean N0() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return ((Boolean) qlVar.a((n.a) o.f11540a)).booleanValue();
        }
        return JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", (JSONObject) null), "should_cache_video_button_html_url_contents", Boolean.FALSE).booleanValue();
    }

    public String O() {
        return getStringFromAdObject("nia_title", MaxReward.DEFAULT_LABEL);
    }

    public boolean O0() {
        return this.f11492h.get();
    }

    public abstract String P();

    public boolean P0() {
        return getBooleanFromAdObject("custom_tabs_should_track_events", Boolean.FALSE);
    }

    public Map Q() {
        Map<String, String> map;
        HashMap hashMap = new HashMap();
        try {
            ql qlVar = this.synchronizedAdObject;
            if (qlVar != null) {
                map = (Map) qlVar.a((n.a) s.f11544a);
            } else {
                map = JsonUtils.toStringMap(getJsonObjectFromAdObject("http_headers_for_postbacks", new JSONObject()));
            }
            hashMap.putAll(map);
        } catch (JSONException e10) {
            this.sdk.L();
            if (t.a()) {
                this.sdk.L().a("DirectAd", "Failed to retrieve http headers for postbacks", e10);
            }
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", Boolean.FALSE)) {
            hashMap.put("User-Agent", tr.a());
        }
        return hashMap;
    }

    public boolean Q0() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", Boolean.FALSE);
    }

    public C0137b R() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", (String) null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return C0137b.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return C0137b.DO_NOT_DISMISS;
            }
        }
        return C0137b.UNSPECIFIED;
    }

    public boolean R0() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", Boolean.FALSE);
    }

    public int S() {
        return getColorFromAdObject("postitial_progress_bar_color", -922746881);
    }

    public boolean S0() {
        return getBooleanFromAdObject("avoms", Boolean.FALSE);
    }

    public long T() {
        return getLongFromAdObject("postitial_progress_bar_total_ms", -1);
    }

    public boolean T0() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", Boolean.TRUE);
    }

    public long U() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1;
    }

    public boolean U0() {
        return getBooleanFromAdObject("require_interaction_for_click", Boolean.FALSE);
    }

    public int V() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public boolean V0() {
        return getBooleanFromAdObject("sruifwvc", Boolean.FALSE);
    }

    public List W() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", (String) null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    public boolean W0() {
        return getBooleanFromAdObject("respect_adview_fully_watched", Boolean.FALSE);
    }

    public List X() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", (String) null);
        if (stringFromAdObject != null) {
            return CollectionUtils.explode(stringFromAdObject);
        }
        return this.sdk.c(oj.Z0);
    }

    public boolean X0() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return ((Boolean) qlVar.a((n.a) u.f11546a)).booleanValue();
        }
        return JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", (JSONObject) null), "should_respect_whitelist_when_retrieving_video_button_html_from_url", Boolean.FALSE).booleanValue();
    }

    public String Y() {
        return getStringFromAdObject("text_rewarded_inter_alert_body", MaxReward.DEFAULT_LABEL);
    }

    public boolean Y0() {
        return getBooleanFromAdObject("show_nia", Boolean.FALSE);
    }

    public String Z() {
        return getStringFromAdObject("text_rewarded_inter_alert_ok_action", "OK!");
    }

    public boolean Z0() {
        return getBooleanFromAdObject("show_rewarded_interstitial_overlay_alert", Boolean.valueOf(AppLovinAdType.AUTO_INCENTIVIZED == getType()));
    }

    public String a0() {
        return getStringFromAdObject("text_rewarded_inter_alert_title", "Watch a video to earn a reward!");
    }

    public boolean a1() {
        return getBooleanFromAdObject("sscomt", Boolean.FALSE);
    }

    public e.a b0() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? n() : a(intFromAdObject);
    }

    public boolean b1() {
        String str = this.sdk.g0().getExtraParameters().get("should_use_exoplayer_if_available");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return getBooleanFromAdObject("suep", Boolean.FALSE);
    }

    public List c0() {
        return getStringListFromAdObject("substrings_for_disabled_click_logic", Collections.emptyList());
    }

    public boolean c1() {
        return getBooleanFromAdObject("upiosp", Boolean.FALSE);
    }

    public c d0() {
        c cVar = c.DEFAULT;
        String upperCase = getStringFromAdObject("ad_target", cVar.toString()).toUpperCase(Locale.ENGLISH);
        if ("ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase)) {
            return c.ACTIVITY_PORTRAIT;
        }
        return "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? c.ACTIVITY_LANDSCAPE : cVar;
    }

    public Uri e0() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "https://assets.applovin.com/sound_on.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public ch f() {
        return (ch) this.f11493i.getAndSet((Object) null);
    }

    public String f0() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (String) qlVar.a((n.a) n.f11539a);
        }
        return JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", (JSONObject) null), "video_button_base_url", UnityAdsConstants.DefaultUrls.AD_ASSET_PATH);
    }

    public String g0() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (String) qlVar.a((n.a) p.f11541a);
        }
        return JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", (JSONObject) null), "video_button_html", MaxReward.DEFAULT_LABEL);
    }

    public abstract ig getAdEventTracker();

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", (String) null);
    }

    public Bundle getDirectDownloadParameters() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (Bundle) qlVar.a((n.a) t.f11545a);
        }
        return JsonUtils.toBundle(getJsonObjectFromAdObject("ah_parameters", (JSONObject) null));
    }

    public String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", (String) null);
    }

    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", (String) null);
    }

    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", MaxReward.DEFAULT_LABEL);
    }

    public List getOpenMeasurementVerificationScriptResources() {
        List list;
        j jVar = new j(this);
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a((n.a) new m(jVar));
        }
        synchronized (this.adObjectLock) {
            list = (List) jVar.apply(getJsonArrayFromAdObject("omid_verification_script_resources", (JSONArray) null));
        }
        return list;
    }

    public List getPrivacySandboxImpressionAttributionUrls() {
        List<String> stringListFromAdObject = getStringListFromAdObject("privacy_sandbox_impression_attribution_urls", Collections.emptyList());
        if (stringListFromAdObject.isEmpty()) {
            return stringListFromAdObject;
        }
        ArrayList arrayList = new ArrayList(stringListFromAdObject.size());
        String clCode = getClCode();
        for (String replace : stringListFromAdObject) {
            arrayList.add(replace.replace("{CLCODE}", clCode));
        }
        return arrayList;
    }

    public String h0() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (String) qlVar.a((n.a) v.f11547a);
        }
        return JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", (JSONObject) null), "video_button_html_url", MaxReward.DEFAULT_LABEL);
    }

    public rq i0() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (rq) qlVar.a((n.a) new h(this));
        }
        return new rq(getJsonObjectFromAdObject("video_button_properties", (JSONObject) null), this.sdk);
    }

    public boolean isDirectDownloadEnabled() {
        return StringUtils.isValidString(getDirectDownloadToken());
    }

    public abstract boolean isOpenMeasurementEnabled();

    public abstract Uri j();

    public abstract Uri j0();

    public long k0() {
        return getLongFromAdObject("close_delay", 0);
    }

    public long l0() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5));
    }

    public int m0() {
        return zp.a(getIntFromAdObject("video_completion_percent", -1));
    }

    public List n0() {
        List a10;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a((n.a) new d0(this));
        }
        synchronized (this.adObjectLock) {
            a10 = zp.a(getJsonObjectFromAdObject("video_end_urls", new JSONObject()), getClCode(), o0(), this.sdk);
        }
        return a10;
    }

    public e p0() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", (String) null);
        if ("top".equals(stringFromAdObject)) {
            return e.TOP;
        }
        if ("bottom".equals(stringFromAdObject)) {
            return e.BOTTOM;
        }
        if ("left".equals(stringFromAdObject)) {
            return e.LEFT;
        }
        if ("right".equals(stringFromAdObject)) {
            return e.RIGHT;
        }
        return e.RESIZE_ASPECT;
    }

    public int q0() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    public boolean r0() {
        return getBooleanFromAdObject("progress_bar_enabled", Boolean.FALSE);
    }

    public abstract Uri s0();

    public int t0() {
        int i10;
        if (zp.a(getSize())) {
            i10 = 1;
        } else {
            i10 = ((Boolean) this.sdk.a(oj.S5)).booleanValue() ? 0 : -1;
        }
        return getIntFromAdObject("whalt", i10);
    }

    public m u0() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (m) qlVar.a((n.a) w.f11548a);
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", (JSONObject) null);
        if (jsonObjectFromAdObject != null) {
            return new m(jsonObjectFromAdObject);
        }
        return null;
    }

    public List v0() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", (String) null));
    }

    public List w() {
        List a10;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a((n.a) new b0(this));
        }
        synchronized (this.adObjectLock) {
            a10 = zp.a(getJsonObjectFromAdObject("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a10;
    }

    public List w0() {
        return CollectionUtils.explode(getStringFromAdObject("wls", MaxReward.DEFAULT_LABEL));
    }

    public c5 x() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (c5) qlVar.a((n.a) x.f11549a);
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("custom_tabs_settings", (JSONObject) null);
        if (jsonObjectFromAdObject != null) {
            return new c5(jsonObjectFromAdObject);
        }
        return null;
    }

    public boolean x0() {
        return getBooleanFromAdObject("bvde", (Boolean) this.sdk.a(oj.Y5));
    }

    public List y() {
        List a10;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a((n.a) new e0(this));
        }
        synchronized (this.adObjectLock) {
            a10 = zp.a(getJsonObjectFromAdObject("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a10;
    }

    public boolean y0() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.a(oj.f10290e2));
    }

    public List z() {
        List a10;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a((n.a) new f0(this));
        }
        synchronized (this.adObjectLock) {
            a10 = zp.a(getJsonObjectFromAdObject("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a10;
    }

    public boolean z0() {
        return getBooleanFromAdObject("custom_tabs_client_warmup_enabled", Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List f(ql qlVar) {
        return zp.a(qlVar.a("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(MotionEvent motionEvent, boolean z10, boolean z11, ql qlVar) {
        return zp.a(qlVar.a("click_tracking_urls", new JSONObject()), a(motionEvent, z10, z11), c(motionEvent, z10, z11), Q(), Q0(), this.sdk);
    }

    public long d() {
        return getLongFromAdObject("ad_reshow_delay_on_app_launch_ms", -1);
    }

    public Bundle e() {
        return this.f11494j;
    }

    public List g() {
        List a10;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a((n.a) new z(this));
        }
        synchronized (this.adObjectLock) {
            a10 = zp.a(getJsonObjectFromAdObject("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a10;
    }

    public String h() {
        String stringFromAdObject = getStringFromAdObject("base_url", UnityAdsConstants.DefaultUrls.AD_ASSET_PATH);
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    public List i() {
        return this.f11490f;
    }

    public int k() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.a(oj.f10298f2)).intValue());
    }

    public d l() {
        if (this.f11495k == null) {
            this.f11495k = new d();
        }
        return this.f11495k;
    }

    public int m() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.a(oj.f10306g2)).intValue());
    }

    public e.a n() {
        List J = J();
        int intFromAdObject = getIntFromAdObject("close_style", (J == null || J.size() <= 0) ? -1 : ((Integer) J.get(0)).intValue());
        return intFromAdObject == -1 ? a(hasVideoUrl()) : a(intFromAdObject);
    }

    public int o() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.a(oj.f10314h2)).intValue());
    }

    public long p() {
        List K = K();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (K == null || K.size() <= 0) ? 0 : (long) ((Integer) K.get(0)).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0;
        }
        return longFromAdObject;
    }

    public int q() {
        return getColorFromAdObject("countdown_color", -922746881);
    }

    public int r() {
        return getIntFromAdObject("countdown_length", 0);
    }

    public Bundle s() {
        Map map;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            map = (Map) qlVar.a((n.a) new a0(this));
        } else {
            try {
                map = JsonUtils.toStringMap(getJsonObjectFromAdObject("custom_tabs_http_headers", new JSONObject()));
            } catch (JSONException e10) {
                this.sdk.L();
                if (t.a()) {
                    this.sdk.L().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e10);
                }
                map = new HashMap();
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (getBooleanFromAdObject("custom_tabs_should_use_webview_ua", Boolean.FALSE)) {
            bundle.putString("User-Agent", tr.a());
        }
        return bundle;
    }

    public List t() {
        List a10;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a((n.a) new i(this));
        }
        synchronized (this.adObjectLock) {
            a10 = zp.a(getJsonObjectFromAdObject("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a10;
    }

    public List u() {
        List a10;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a((n.a) new c0(this));
        }
        synchronized (this.adObjectLock) {
            a10 = zp.a(getJsonObjectFromAdObject("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a10;
    }

    public List v() {
        List a10;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a((n.a) new g(this));
        }
        synchronized (this.adObjectLock) {
            a10 = zp.a(getJsonObjectFromAdObject("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a10;
    }

    public void b(boolean z10) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.a("html_resources_cached", z10);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putBoolean(this.adObject, "html_resources_cached", z10);
        }
    }

    public List c() {
        List a10;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a((n.a) new q(this));
        }
        synchronized (this.adObjectLock) {
            a10 = zp.a(getJsonObjectFromAdObject("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a10;
    }

    public List d(MotionEvent motionEvent, boolean z10, boolean z11) {
        List<String> stringListFromAdObject = getStringListFromAdObject("privacy_sandbox_click_attribution_urls", Collections.emptyList());
        if (stringListFromAdObject.isEmpty()) {
            return stringListFromAdObject;
        }
        Map a10 = a(motionEvent, z10, z11);
        ArrayList arrayList = new ArrayList(stringListFromAdObject.size());
        for (String replace : stringListFromAdObject) {
            arrayList.add(StringUtils.replace(replace, a10));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(MotionEvent motionEvent, boolean z10, ql qlVar) {
        return zp.a(qlVar.a("video_click_tracking_urls", new JSONObject()), a(motionEvent, true, z10), (String) null, Q(), Q0(), this.sdk);
    }

    private String c(MotionEvent motionEvent, boolean z10, boolean z11) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", (String) null);
        Map a10 = a(motionEvent, z10, z11);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, a10);
        }
        return null;
    }

    public List b(MotionEvent motionEvent, boolean z10, boolean z11) {
        List a10;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a((n.a) new l(this, motionEvent, z10, z11));
        }
        synchronized (this.adObjectLock) {
            a10 = zp.a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), a(motionEvent, z10, z11), c(motionEvent, z10, z11), Q(), Q0(), this.sdk);
        }
        return a10;
    }

    public void a(ch chVar) {
        this.f11493i.set(chVar);
    }

    public void c(Uri uri) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.b("unmute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "unmute_image", uri.toString());
        }
    }

    public void a(Uri uri) {
        this.f11490f.add(uri);
    }

    public void a(String str) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.a((androidx.core.util.a) new f(str));
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(getJsonObjectFromAdObject("video_button_properties", (JSONObject) null), "video_button_html", str);
        }
    }

    public void b(Uri uri) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.b("mute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "mute_image", uri.toString());
        }
    }

    public List a(MotionEvent motionEvent, boolean z10) {
        List list;
        List a10;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            list = (List) qlVar.a((n.a) new k(this, motionEvent, z10));
        } else {
            synchronized (this.adObjectLock) {
                a10 = zp.a(getJsonObjectFromAdObject("video_click_tracking_urls", new JSONObject()), a(motionEvent, true, z10), (String) null, Q(), Q0(), this.sdk);
            }
            list = a10;
        }
        return list.isEmpty() ? b(motionEvent, true, z10) : list;
    }

    public void b() {
        this.f11492h.set(true);
    }

    private Map a(MotionEvent motionEvent, boolean z10, boolean z11) {
        Point b10 = x3.b(k.k());
        HashMap hashMap = new HashMap(7);
        hashMap.put("{CLCODE}", getClCode());
        float f10 = -1.0f;
        hashMap.put("{CLICK_X}", String.valueOf(motionEvent != null ? motionEvent.getRawX() : -1.0f));
        if (motionEvent != null) {
            f10 = motionEvent.getRawY();
        }
        hashMap.put("{CLICK_Y}", String.valueOf(f10));
        hashMap.put("{SCREEN_WIDTH}", String.valueOf(b10.x));
        hashMap.put("{SCREEN_HEIGHT}", String.valueOf(b10.y));
        hashMap.put("{IS_VIDEO_CLICK}", String.valueOf(z10));
        hashMap.put("{IS_INSTALL}", String.valueOf(z11));
        return hashMap;
    }

    private e.a a(boolean z10) {
        return z10 ? e.a.WHITE_ON_TRANSPARENT : e.a.WHITE_ON_BLACK;
    }

    /* access modifiers changed from: protected */
    public e.a a(int i10) {
        if (i10 == 1) {
            return e.a.WHITE_ON_TRANSPARENT;
        }
        if (i10 == 2) {
            return e.a.INVISIBLE;
        }
        if (i10 == 3) {
            return e.a.TRANSPARENT_SKIP;
        }
        return e.a.WHITE_ON_BLACK;
    }
}
