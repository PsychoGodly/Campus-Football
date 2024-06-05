package com.applovin.impl.sdk.ad;

import com.applovin.impl.ql;
import com.applovin.impl.sdk.utils.JsonUtils;
import n.a;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class o implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ o f11540a = new o();

    private /* synthetic */ o() {
    }

    public final Object apply(Object obj) {
        return JsonUtils.getBoolean(((ql) obj).a("video_button_properties", (JSONObject) null), "should_cache_video_button_html_url_contents", Boolean.FALSE);
    }
}
