package com.applovin.impl.sdk.ad;

import com.applovin.impl.ql;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxReward;
import n.a;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class v implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ v f11547a = new v();

    private /* synthetic */ v() {
    }

    public final Object apply(Object obj) {
        return JsonUtils.getString(((ql) obj).a("video_button_properties", (JSONObject) null), "video_button_html_url", MaxReward.DEFAULT_LABEL);
    }
}
