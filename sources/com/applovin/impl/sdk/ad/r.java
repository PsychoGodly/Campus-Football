package com.applovin.impl.sdk.ad;

import com.applovin.impl.ql;
import com.applovin.impl.sdk.utils.JsonUtils;
import n.a;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class r implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ r f11543a = new r();

    private /* synthetic */ r() {
    }

    public final Object apply(Object obj) {
        return JsonUtils.getBoolean(((ql) obj).a("video_button_properties", (JSONObject) null), "should_cache_video_button_html_assets", Boolean.FALSE);
    }
}
