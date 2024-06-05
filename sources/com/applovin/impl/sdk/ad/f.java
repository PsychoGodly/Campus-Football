package com.applovin.impl.sdk.ad;

import androidx.core.util.a;
import com.applovin.impl.ql;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f11525a;

    public /* synthetic */ f(String str) {
        this.f11525a = str;
    }

    public final void accept(Object obj) {
        JsonUtils.putString(((ql) obj).a("video_button_properties", (JSONObject) null), "video_button_html", this.f11525a);
    }
}
