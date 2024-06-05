package com.unity3d.ads.core.extensions;

import com.unity3d.services.store.JsonSerializable;
import java.util.List;
import kotlin.jvm.internal.m;
import org.json.JSONArray;

/* compiled from: JsonSerializableExtensions.kt */
public final class JsonSerializableExtensionsKt {
    public static final JSONArray toJsonArray(List<? extends JsonSerializable> list) {
        m.e(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        for (JsonSerializable json : list) {
            jSONArray.put(json.toJson());
        }
        return jSONArray;
    }
}
