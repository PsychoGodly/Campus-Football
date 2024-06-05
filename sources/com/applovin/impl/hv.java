package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxReward;
import n.a;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class hv implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ hv f8372a = new hv();

    private /* synthetic */ hv() {
    }

    public final Object apply(Object obj) {
        return JsonUtils.getString(((ql) obj).a("revenue_parameters", (JSONObject) null), "precision", MaxReward.DEFAULT_LABEL);
    }
}
