package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

public class c5 {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f6838a;

    public c5(JSONObject jSONObject) {
        this.f6838a = jSONObject;
    }

    private Integer a(String str) {
        if (str == null) {
            return null;
        }
        try {
            int identifier = k.k().getResources().getIdentifier(str, "anim", "android");
            if (identifier != 0) {
                return Integer.valueOf(identifier);
            }
            return null;
        } catch (Exception e10) {
            t.b("CustomTabsSettings", "Failed to get animation resource ID for: " + str, e10);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public String b() {
        return JsonUtils.getString(this.f6838a, "digital_asset_link_url", (String) null);
    }

    /* access modifiers changed from: protected */
    public Integer c() {
        return a(JsonUtils.getString(this.f6838a, "end_enter_animation", (String) null));
    }

    /* access modifiers changed from: protected */
    public Integer d() {
        return a(JsonUtils.getString(this.f6838a, "end_exit_animation", (String) null));
    }

    /* access modifiers changed from: protected */
    public Boolean e() {
        return JsonUtils.getBoolean(this.f6838a, "instant_apps_enabled", (Boolean) null);
    }

    /* access modifiers changed from: protected */
    public String f() {
        return JsonUtils.getString(this.f6838a, "referrer", (String) null);
    }

    /* access modifiers changed from: protected */
    public Integer g() {
        return JsonUtils.getInteger(this.f6838a, "session_url_relation", (Integer) null);
    }

    /* access modifiers changed from: protected */
    public Integer h() {
        return JsonUtils.getInteger(this.f6838a, "share_state", (Integer) null);
    }

    /* access modifiers changed from: protected */
    public Boolean i() {
        return JsonUtils.getBoolean(this.f6838a, "should_show_title", (Boolean) null);
    }

    /* access modifiers changed from: protected */
    public Integer j() {
        return a(JsonUtils.getString(this.f6838a, "start_enter_animation", (String) null));
    }

    /* access modifiers changed from: protected */
    public Integer k() {
        return a(JsonUtils.getString(this.f6838a, "start_exit_animation", (String) null));
    }

    /* access modifiers changed from: protected */
    public Integer l() {
        return JsonUtils.getInteger(this.f6838a, "toolbar_color", (Integer) null);
    }

    /* access modifiers changed from: protected */
    public Boolean m() {
        return JsonUtils.getBoolean(this.f6838a, "url_bar_hiding_enabled", (Boolean) null);
    }

    /* access modifiers changed from: protected */
    public Integer a() {
        return JsonUtils.getInteger(this.f6838a, "dark_mode_toolbar_color", (Integer) null);
    }
}
