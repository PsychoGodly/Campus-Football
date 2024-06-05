package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import n.a;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class lv implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ lv f9280a = new lv();

    private /* synthetic */ lv() {
    }

    public final Object apply(Object obj) {
        return Double.valueOf(JsonUtils.getDouble(((ql) obj).a("revenue_parameters", (JSONObject) null), "revenue", -1.0d));
    }
}
