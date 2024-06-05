package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import n.a;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class iv implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ iv f8604a = new iv();

    private /* synthetic */ iv() {
    }

    public final Object apply(Object obj) {
        return JsonUtils.deepCopy(((ql) obj).a("ad_values", new JSONObject()));
    }
}
