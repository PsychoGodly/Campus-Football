package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class i4 extends h4 {
    public i4(JSONObject jSONObject, k kVar) {
        super(jSONObject, kVar);
    }

    public List e() {
        j4 a10;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f8216b, "transitions", (JSONArray) null);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (!(jSONObject == null || (a10 = j4.a(jSONObject, this.f8215a)) == null)) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    public String f() {
        return b("message");
    }

    public String g() {
        return b("title");
    }

    public String toString() {
        return "ConsentFlowState{id=" + b() + "type=" + c() + "isInitialState=" + d() + "title=" + g() + "message=" + f() + "actions=" + e() + "}";
    }
}
