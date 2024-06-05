package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import n.a;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class kv implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ kv f9099a = new kv();

    private /* synthetic */ kv() {
    }

    public final Object apply(Object obj) {
        return JsonUtils.deepCopy(((ql) obj).a("publisher_extra_info", new JSONObject()));
    }
}
