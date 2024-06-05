package com.unity3d.ads.core.extensions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ke.c;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import td.e0;

/* compiled from: JSONArrayExtensions.kt */
public final class JSONArrayExtensionsKt {
    public static final Map<String, List<String>> getHeadersMap(JSONArray jSONArray) {
        m.e(jSONArray, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            m.c(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            List list = (List) linkedHashMap.get(jSONArray2.getString(0));
            if (list == null) {
                list = new ArrayList();
            }
            String string = jSONArray2.getString(1);
            m.d(string, "header.getString(1)");
            list.add(string);
            String string2 = jSONArray2.getString(0);
            m.d(string2, "header.getString(0)");
            linkedHashMap.put(string2, list);
        }
        return linkedHashMap;
    }

    public static final Object[] toTypedArray(JSONArray jSONArray) {
        m.e(jSONArray, "<this>");
        c i10 = i.i(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(r.j(i10, 10));
        Iterator it = i10.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((e0) it).a()));
        }
        return arrayList.toArray(new Object[0]);
    }
}
