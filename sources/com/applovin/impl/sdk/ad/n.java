package com.applovin.impl.sdk.ad;

import com.applovin.impl.ql;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.services.UnityAdsConstants;
import n.a;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ n f11539a = new n();

    private /* synthetic */ n() {
    }

    public final Object apply(Object obj) {
        return JsonUtils.getString(((ql) obj).a("video_button_properties", (JSONObject) null), "video_button_base_url", UnityAdsConstants.DefaultUrls.AD_ASSET_PATH);
    }
}
