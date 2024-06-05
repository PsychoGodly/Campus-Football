package com.applovin.impl.sdk.ad;

import com.applovin.impl.ql;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxReward;
import n.a;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ p f11541a = new p();

    private /* synthetic */ p() {
    }

    public final Object apply(Object obj) {
        return JsonUtils.getString(((ql) obj).a("video_button_properties", (JSONObject) null), "video_button_html", MaxReward.DEFAULT_LABEL);
    }
}
