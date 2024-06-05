package com.unity3d.ads.core.extensions;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import me.d;
import org.json.JSONObject;

/* compiled from: JSONObjectExtensions.kt */
public final class JSONObjectExtensionsKt {
    public static final Map<String, Object> toMap(JSONObject jSONObject) {
        m.e(jSONObject, "<this>");
        Iterator<String> keys = jSONObject.keys();
        m.d(keys, "keys()");
        d c10 = j.c(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : c10) {
            linkedHashMap.put(next, jSONObject.get((String) next));
        }
        return linkedHashMap;
    }
}
