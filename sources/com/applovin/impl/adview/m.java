package com.applovin.impl.adview;

import android.webkit.WebSettings;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f6484a;

    public m(JSONObject jSONObject) {
        this.f6484a = jSONObject;
    }

    /* access modifiers changed from: package-private */
    public Integer a() {
        String string = JsonUtils.getString(this.f6484a, "mixed_content_mode", (String) null);
        if (StringUtils.isValidString(string)) {
            if ("always_allow".equalsIgnoreCase(string)) {
                return 0;
            }
            if ("never_allow".equalsIgnoreCase(string)) {
                return 1;
            }
            if ("compatibility_mode".equalsIgnoreCase(string)) {
                return 2;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public WebSettings.PluginState b() {
        String string = JsonUtils.getString(this.f6484a, "plugin_state", (String) null);
        if (StringUtils.isValidString(string)) {
            if ("on".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON;
            }
            if ("on_demand".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON_DEMAND;
            }
            if ("off".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.OFF;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Boolean c() {
        return JsonUtils.getBoolean(this.f6484a, "geolocation_enabled", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public Boolean d() {
        return JsonUtils.getBoolean(this.f6484a, "allow_content_access", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public Boolean e() {
        return JsonUtils.getBoolean(this.f6484a, "allow_file_access", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public Boolean f() {
        return JsonUtils.getBoolean(this.f6484a, "allow_file_access_from_file_urls", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public Boolean g() {
        return JsonUtils.getBoolean(this.f6484a, "allow_universal_access_from_file_urls", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public Boolean h() {
        return JsonUtils.getBoolean(this.f6484a, "display_zoom_controls", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public Boolean i() {
        return JsonUtils.getBoolean(this.f6484a, "load_with_overview_mode", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public Boolean j() {
        return JsonUtils.getBoolean(this.f6484a, "need_initial_focus", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public Boolean k() {
        return JsonUtils.getBoolean(this.f6484a, "offscreen_pre_raster", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public Boolean l() {
        return JsonUtils.getBoolean(this.f6484a, "save_form_data", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public Boolean m() {
        return JsonUtils.getBoolean(this.f6484a, "algorithmic_darkening_allowed", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public Boolean n() {
        return JsonUtils.getBoolean(this.f6484a, "block_network_image", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public Boolean o() {
        return JsonUtils.getBoolean(this.f6484a, "loads_images_automatically", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public Boolean p() {
        return JsonUtils.getBoolean(this.f6484a, "use_built_in_zoom_controls", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public Boolean q() {
        return JsonUtils.getBoolean(this.f6484a, "use_wide_view_port", (Boolean) null);
    }
}
