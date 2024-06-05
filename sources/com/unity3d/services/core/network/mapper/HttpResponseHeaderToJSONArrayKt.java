package com.unity3d.services.core.network.mapper;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import org.json.JSONArray;

/* compiled from: HttpResponseHeaderToJSONArray.kt */
public final class HttpResponseHeaderToJSONArrayKt {
    public static final JSONArray toResponseHeadersMap(Map<String, ? extends List<String>> map) {
        Set<Map.Entry<String, ? extends List<String>>> entrySet;
        if (!(map == null || (entrySet = map.entrySet()) == null)) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : entrySet) {
                jSONArray = jSONArray.put(new JSONArray(q.f((String) entry.getKey(), (List) entry.getValue())));
                m.d(jSONArray, "acc.put(JSONArray(listOf(key, value)))");
            }
            if (jSONArray != null) {
                return jSONArray;
            }
        }
        return new JSONArray();
    }
}
