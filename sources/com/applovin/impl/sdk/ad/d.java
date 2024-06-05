package com.applovin.impl.sdk.ad;

import com.applovin.impl.ql;
import com.applovin.impl.sdk.utils.JsonUtils;
import n.a;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f11520a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f11521b;

    public /* synthetic */ d(String str, String str2) {
        this.f11520a = str;
        this.f11521b = str2;
    }

    public final Object apply(Object obj) {
        return JsonUtils.getString(((ql) obj).a("ad_values", new JSONObject()), this.f11520a, this.f11521b);
    }
}
