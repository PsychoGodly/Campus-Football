package com.applovin.impl;

import android.text.TextUtils;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.HashSet;
import java.util.Set;

public class aa {

    /* renamed from: b  reason: collision with root package name */
    private static final Set f6340b = new HashSet(32);

    /* renamed from: c  reason: collision with root package name */
    private static final Set f6341c = new HashSet(16);

    /* renamed from: d  reason: collision with root package name */
    public static final aa f6342d = a(ServiceProvider.NAMED_AD_REQ);

    /* renamed from: e  reason: collision with root package name */
    public static final aa f6343e = a("ad_imp");

    /* renamed from: f  reason: collision with root package name */
    public static final aa f6344f = a("max_ad_imp");

    /* renamed from: g  reason: collision with root package name */
    public static final aa f6345g = a("ad_session_start");

    /* renamed from: h  reason: collision with root package name */
    public static final aa f6346h = a("ad_imp_session");

    /* renamed from: i  reason: collision with root package name */
    public static final aa f6347i = a("max_ad_imp_session");

    /* renamed from: j  reason: collision with root package name */
    public static final aa f6348j = a("cached_files_expired");

    /* renamed from: k  reason: collision with root package name */
    public static final aa f6349k = a("cache_drop_count");

    /* renamed from: l  reason: collision with root package name */
    public static final aa f6350l = a("sdk_reset_state_count", true);

    /* renamed from: m  reason: collision with root package name */
    public static final aa f6351m = a("ad_response_process_failures", true);

    /* renamed from: n  reason: collision with root package name */
    public static final aa f6352n = a("response_process_failures", true);

    /* renamed from: o  reason: collision with root package name */
    public static final aa f6353o = a("incent_failed_to_display_count", true);

    /* renamed from: p  reason: collision with root package name */
    public static final aa f6354p = a("app_paused_and_resumed");

    /* renamed from: q  reason: collision with root package name */
    public static final aa f6355q = a("ad_rendered_with_mismatched_sdk_key", true);

    /* renamed from: r  reason: collision with root package name */
    public static final aa f6356r = a("ad_shown_outside_app_count");

    /* renamed from: s  reason: collision with root package name */
    public static final aa f6357s = a("med_ad_req");

    /* renamed from: t  reason: collision with root package name */
    public static final aa f6358t = a("med_ad_response_process_failures", true);

    /* renamed from: u  reason: collision with root package name */
    public static final aa f6359u = a("med_waterfall_ad_no_fill", true);

    /* renamed from: v  reason: collision with root package name */
    public static final aa f6360v = a("med_waterfall_ad_adapter_load_failed", true);

    /* renamed from: w  reason: collision with root package name */
    public static final aa f6361w = a("med_waterfall_ad_invalid_response", true);

    /* renamed from: a  reason: collision with root package name */
    private final String f6362a;

    static {
        a("fullscreen_ad_nil_vc_count");
        a("applovin_bundle_missing");
    }

    private aa(String str) {
        this.f6362a = str;
    }

    private static aa a(String str) {
        return a(str, false);
    }

    public String b() {
        return this.f6362a;
    }

    private static aa a(String str, boolean z10) {
        if (!TextUtils.isEmpty(str)) {
            Set set = f6340b;
            if (!set.contains(str)) {
                set.add(str);
                aa aaVar = new aa(str);
                if (z10) {
                    f6341c.add(aaVar);
                }
                return aaVar;
            }
            throw new IllegalArgumentException("Key has already been used: " + str);
        }
        throw new IllegalArgumentException("No key name specified");
    }

    public static Set a() {
        return f6341c;
    }
}
