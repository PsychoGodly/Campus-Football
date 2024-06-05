package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import n.a;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class gv implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ gv f8151a = new gv();

    private /* synthetic */ gv() {
    }

    public final Object apply(Object obj) {
        return JsonUtils.deepCopy(((ql) obj).a("revenue_parameters", new JSONObject()));
    }
}
