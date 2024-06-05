package com.applovin.impl.sdk.ad;

import com.applovin.impl.ql;
import com.applovin.impl.sdk.utils.JsonUtils;
import n.a;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class u implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ u f11546a = new u();

    private /* synthetic */ u() {
    }

    public final Object apply(Object obj) {
        return JsonUtils.getBoolean(((ql) obj).a("video_button_properties", (JSONObject) null), "should_respect_whitelist_when_retrieving_video_button_html_from_url", Boolean.FALSE);
    }
}
