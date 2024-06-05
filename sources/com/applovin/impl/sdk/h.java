package com.applovin.impl.sdk;

import android.os.Bundle;
import android.view.View;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.ar;
import com.applovin.impl.be;
import com.applovin.impl.ce;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.de;
import com.applovin.impl.ee;
import com.applovin.impl.ie;
import com.applovin.impl.jo;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.t3;
import com.applovin.impl.ve;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class h implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* renamed from: a  reason: collision with root package name */
    private final k f11628a;

    /* renamed from: b  reason: collision with root package name */
    private final AppLovinCommunicator f11629b;

    h(k kVar) {
        this.f11628a = kVar;
        AppLovinCommunicator instance = AppLovinCommunicator.getInstance(k.k());
        this.f11629b = instance;
        if (((Boolean) kVar.a(oj.E6)).booleanValue()) {
            instance.a(kVar);
            instance.subscribe((AppLovinCommunicatorSubscriber) this, (List<String>) jo.f8792a);
        }
    }

    public void a(be beVar, String str) {
        if (((Boolean) this.f11628a.a(oj.E6)).booleanValue() && this.f11629b.hasSubscriber("ad_callback_blocked_after_hidden")) {
            Bundle a10 = a(beVar);
            a10.putString("callback_name", str);
            a(a10, "ad_callback_blocked_after_hidden");
        }
    }

    public void b(be beVar, String str) {
        if (((Boolean) this.f11628a.a(oj.E6)).booleanValue() && this.f11629b.hasSubscriber("max_ad_events")) {
            Bundle a10 = a(beVar);
            a10.putString("type", str);
            this.f11628a.L();
            if (t.a()) {
                t L = this.f11628a.L();
                L.a("CommunicatorService", "Sending \"max_ad_events\" message: " + a10);
            }
            a(a10, "max_ad_events");
        }
    }

    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        long j10;
        long j11;
        long j12;
        int i10;
        Map<String, Object> map;
        Map map2;
        Map map3;
        Map map4;
        if (((Boolean) this.f11628a.a(oj.E6)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map5 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString("id", MaxReward.DEFAULT_LABEL);
                if (!map5.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                    map5.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f11628a.d0());
                }
                this.f11628a.Z().e(new d.b().d(messageData.getString("url")).a(messageData.getString("backup_url")).b((Map) stringMap).c((Map) map5).a((Map) stringMap2).a(((Boolean) this.f11628a.a(oj.f10333j5)).booleanValue()).b(string).a());
            } else if ("send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
                String string2 = messageData2.getString("http_method", "POST");
                if (messageData2.containsKey("timeout_sec")) {
                    j10 = TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec"));
                } else {
                    j10 = ((Long) this.f11628a.a(oj.f10403s3)).longValue();
                }
                int i11 = messageData2.getInt("retry_count", ((Integer) this.f11628a.a(oj.f10411t3)).intValue());
                if (messageData2.containsKey("retry_delay_sec")) {
                    j11 = TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec"));
                } else {
                    j11 = ((Long) this.f11628a.a(oj.f10419u3)).longValue();
                }
                Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
                long j13 = j11;
                if ("GET".equalsIgnoreCase(string2)) {
                    if (messageData2.getBoolean("include_data_collector_info", true)) {
                        if (this.f11628a.y() != null) {
                            map4 = this.f11628a.y().a((Map) null, false, false);
                        } else {
                            map4 = this.f11628a.x().a((Map) null, false, false);
                        }
                        stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(map4)));
                    }
                    j12 = j10;
                    i10 = i11;
                    map = null;
                } else {
                    map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                    if (messageData2.getBoolean("include_data_collector_info", true)) {
                        if (this.f11628a.y() != null) {
                            map3 = this.f11628a.y().b();
                            map2 = this.f11628a.y().d();
                        } else {
                            map3 = this.f11628a.x().A();
                            map2 = this.f11628a.x().l();
                        }
                        if (!map2.containsKey("idfv") || !map2.containsKey("idfv_scope")) {
                            j12 = j10;
                            i10 = i11;
                        } else {
                            i10 = i11;
                            j12 = j10;
                            Integer num = (Integer) map2.get("idfv_scope");
                            num.intValue();
                            map2.remove("idfv");
                            map2.remove("idfv_scope");
                            map3.put("idfv", (String) map2.get("idfv"));
                            map3.put("idfv_scope", num);
                        }
                        map3.put("server_installed_at", this.f11628a.a(oj.f10407t));
                        map3.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f11628a.d0());
                        map.put("app", map3);
                        map.put("device", map2);
                    } else {
                        j12 = j10;
                        i10 = i11;
                    }
                }
                this.f11628a.l0().a((xl) new t3(appLovinCommunicatorMessage.getPublisherId(), a.a(this.f11628a).b(messageData2.getString("url")).a(messageData2.getString("backup_url")).b((Map) stringMap3).c(string2).a((Map) BundleUtils.toStringMap(messageData2.getBundle("headers"))).a(map != null ? new JSONObject(map) : null).c((int) j12).a(i10).b((int) j13).a((Object) new JSONObject()).a(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.f11628a), sm.b.OTHER);
            } else if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.f11628a.i().addCustomQueryParams(zp.a((Map) BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
            } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.f11628a.i().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
            } else if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.f11628a.S().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
            }
        }
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (((Boolean) this.f11628a.a(oj.E6)).booleanValue() && this.f11629b.hasSubscriber("safedk_init")) {
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f11628a.d0());
            bundle.putString("applovin_random_token", this.f11628a.c0());
            bundle.putString("compass_random_token", this.f11628a.p());
            bundle.putString("device_type", AppLovinSdkUtils.isTablet(k.k()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z10));
            bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(ve.a(this.f11628a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", (JSONObject) null);
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putString("user_id", this.f11628a.t0().c());
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject());
            if (!((Boolean) this.f11628a.a(oj.F6)).booleanValue()) {
                JSONObject jSONObject4 = new JSONObject();
                JsonUtils.putBoolean(jSONObject4, "deactivated", true);
                JsonUtils.putJSONObject(jSONObject3, "safeDKDeactivation", jSONObject4);
            }
            bundle2.putBundle("settings", JsonUtils.toBundle(jSONObject3));
            this.f11628a.L();
            if (t.a()) {
                t L = this.f11628a.L();
                L.a("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            a(bundle2, "safedk_init");
        }
    }

    public void b(be beVar) {
        if (((Boolean) this.f11628a.a(oj.E6)).booleanValue() && this.f11629b.hasSubscriber("max_revenue_events")) {
            Bundle a10 = a(beVar);
            a10.putAll(JsonUtils.toBundle(beVar.P()));
            a10.putString("country_code", this.f11628a.q().getCountryCode());
            if (this.f11628a.r0() != null) {
                BundleUtils.putStringIfValid("user_segment", this.f11628a.r0().getName(), a10);
            }
            a(a10, "max_revenue_events");
        }
    }

    public void b(String str, String str2) {
        if (((Boolean) this.f11628a.a(oj.E6)).booleanValue() && this.f11629b.hasSubscriber("user_info")) {
            Bundle bundle = new Bundle(2);
            bundle.putString("user_id", StringUtils.emptyIfNull(str));
            bundle.putString("applovin_random_token", str2);
            a(bundle, "user_info");
        }
    }

    public void b(List list) {
        if (!((Boolean) this.f11628a.a(oj.E6)).booleanValue() || !this.f11629b.hasSubscriber("test_mode_networks_updated")) {
            return;
        }
        if (list == null || list.isEmpty()) {
            a(Bundle.EMPTY, "test_mode_networks_updated");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("test_mode_networks", new ArrayList(list));
        a(bundle, "test_mode_networks_updated");
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (((Boolean) this.f11628a.a(oj.E6)).booleanValue() && this.f11629b.hasSubscriber("adapter_initialization_status")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            a(bundle, "adapter_initialization_status");
        }
    }

    public void a() {
        if (((Boolean) this.f11628a.a(oj.E6)).booleanValue() && this.f11629b.hasSubscriber("privacy_setting_updated")) {
            a(new Bundle(), "privacy_setting_updated");
        }
    }

    public void a(String str, String str2) {
        if (((Boolean) this.f11628a.a(oj.E6)).booleanValue() && this.f11629b.hasSubscriber("network_sdk_version_updated")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            a(bundle, "network_sdk_version_updated");
        }
    }

    public void a(List list) {
        if (!((Boolean) this.f11628a.a(oj.E6)).booleanValue() || !this.f11629b.hasSubscriber("live_networks_updated")) {
            return;
        }
        if (list == null || list.isEmpty()) {
            a(Bundle.EMPTY, "live_networks_updated");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("live_networks", new ArrayList(list));
        a(bundle, "live_networks_updated");
    }

    public void a(String str, String str2, String str3) {
        if (((Boolean) this.f11628a.a(oj.E6)).booleanValue() && this.f11629b.hasSubscriber("responses")) {
            String maybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String maybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", maybeConvertToIndentedString);
            bundle.putString("response", maybeConvertToIndentedString2);
            a(bundle, "responses");
        }
    }

    public void a(String str, String str2, int i10, Object obj, String str3, boolean z10) {
        if (((Boolean) this.f11628a.a(oj.E6)).booleanValue() && this.f11629b.hasSubscriber("receive_http_response")) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString("url", str2);
            bundle.putInt("code", i10);
            bundle.putBundle("body", JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z10);
            BundleUtils.putString("error_message", str3, bundle);
            a(bundle, "receive_http_response");
        }
    }

    public void a(Bundle bundle, String str) {
        if (((Boolean) this.f11628a.a(oj.E6)).booleanValue() && this.f11629b.hasSubscriber(str)) {
            this.f11629b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this));
        }
    }

    public boolean a(String str) {
        return jo.f8792a.contains(str);
    }

    private Bundle a(be beVar) {
        Bundle bundle = new Bundle();
        bundle.putString("id", beVar.Q());
        bundle.putString("network_name", beVar.c());
        bundle.putString("max_ad_unit_id", beVar.getAdUnitId());
        bundle.putString("third_party_ad_placement_id", beVar.S());
        bundle.putString("ad_format", beVar.getFormat().getLabel());
        BundleUtils.putStringIfValid("creative_id", beVar.getCreativeId(), bundle);
        BundleUtils.putStringIfValid("adomain", beVar.u(), bundle);
        BundleUtils.putStringIfValid("dsp_name", beVar.getDspName(), bundle);
        if (beVar.X()) {
            BundleUtils.putStringIfValid("hybrid_ad_format", beVar.H().getLabel(), bundle);
        }
        if (beVar.Y()) {
            bundle.putString("custom_js_network_name", beVar.getNetworkName());
        } else if ("CUSTOM_NETWORK_SDK".equalsIgnoreCase(beVar.c())) {
            bundle.putString("custom_sdk_network_name", beVar.getNetworkName());
        }
        bundle.putAll(JsonUtils.toBundle(beVar.w()));
        String str = "N/A";
        if (beVar instanceof ie) {
            View view = null;
            if (beVar instanceof ce) {
                view = ((ce) beVar).x();
            } else if (beVar instanceof ee) {
                ee eeVar = (ee) beVar;
                if (!eeVar.r0()) {
                    view = eeVar.l0() != null ? eeVar.l0() : eeVar.m0();
                }
            }
            if (view != null) {
                str = ar.a(view);
            }
            bundle.putString("ad_view", str);
        } else if (beVar instanceof de) {
            Bundle bundle2 = ((de) beVar).j0().getBundle("applovin_ad_view_info");
            bundle.putString("ad_view", BundleUtils.getString("ad_view_address", str, bundle2));
            bundle.putString("video_view", BundleUtils.getString("video_view_address", str, bundle2));
        }
        return bundle;
    }
}
