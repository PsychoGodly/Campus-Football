package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtils {
    public static final String EMPTY_JSON = "{}";

    private static List a(JSONArray jSONArray, List list) {
        if (jSONArray == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(a(jSONArray.get(i10)));
        }
        return arrayList;
    }

    public static boolean containsCaseInsensitiveString(String str, JSONArray jSONArray) {
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            try {
                Object obj = jSONArray.get(i10);
                if ((obj instanceof String) && ((String) obj).equalsIgnoreCase(str)) {
                    return true;
                }
                i10++;
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    public static boolean containsJSONObjectContainingInt(JSONArray jSONArray, int i10, String str) {
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                if (optJSONObject != null && optJSONObject.optInt(str) == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static JSONObject deepCopy(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    jSONObject2.put(next, deepCopy((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    jSONObject2.put(next, deepCopy((JSONArray) obj));
                } else {
                    jSONObject2.put(next, obj);
                }
            } catch (JSONException unused) {
                t.l("JsonUtils", "Failed to copy over item for key '" + next + "' to JSONObject deep copy");
            }
        }
        return jSONObject2;
    }

    public static JSONObject deserialize(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (Throwable th) {
            t.b("JsonUtils", "Failed to deserialize into JSON: " + str, th);
            return null;
        }
    }

    public static Boolean getBoolean(JSONObject jSONObject, String str, Boolean bool) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return bool;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (JSONException unused) {
            boolean z10 = true;
            if (getInt(jSONObject, str, (bool == null || !bool.booleanValue()) ? 0 : 1) <= 0) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static double getDouble(JSONObject jSONObject, String str, double d10) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return d10;
        }
        try {
            return jSONObject.getDouble(str);
        } catch (JSONException e10) {
            t.b("JsonUtils", "Failed to retrieve double property for key = " + str, e10);
            return d10;
        }
    }

    public static float getFloat(JSONObject jSONObject, String str, float f10) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return f10;
        }
        try {
            double d10 = jSONObject.getDouble(str);
            if (-3.4028234663852886E38d >= d10 || d10 >= 3.4028234663852886E38d) {
                return f10;
            }
            return (float) d10;
        } catch (JSONException e10) {
            t.b("JsonUtils", "Failed to retrieve float property for key = " + str, e10);
            return f10;
        }
    }

    public static int getInt(JSONObject jSONObject, String str, int i10) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return i10;
        }
        try {
            return jSONObject.getInt(str);
        } catch (JSONException e10) {
            t.b("JsonUtils", "Failed to retrieve int property for key = " + str, e10);
            return i10;
        }
    }

    public static Integer getInteger(JSONObject jSONObject, String str, Integer num) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return num;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (JSONException e10) {
            t.b("JsonUtils", "Failed to retrieve int property for key = " + str, e10);
            return num;
        }
    }

    public static List<Integer> getIntegerList(JSONObject jSONObject, String str, List<Integer> list) {
        JSONArray jSONArray = getJSONArray(jSONObject, str, (JSONArray) null);
        return jSONArray != null ? toIntegerList(jSONArray) : list;
    }

    public static JSONArray getJSONArray(JSONObject jSONObject, String str, JSONArray jSONArray) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return jSONArray;
        }
        try {
            return jSONObject.getJSONArray(str);
        } catch (JSONException e10) {
            t.b("JsonUtils", "Failed to retrieve JSON array for key = " + str, e10);
            return jSONArray;
        }
    }

    public static JSONObject getJSONObject(JSONObject jSONObject, String str) {
        return getJSONObject(jSONObject, str, (JSONObject) null);
    }

    public static List getList(JSONObject jSONObject, String str, List list) {
        try {
            JSONArray jSONArray = getJSONArray(jSONObject, str, (JSONArray) null);
            return jSONArray != null ? toList(jSONArray) : list;
        } catch (JSONException unused) {
            return list;
        }
    }

    public static long getLong(JSONObject jSONObject, String str, long j10) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return j10;
        }
        try {
            return jSONObject.getLong(str);
        } catch (JSONException e10) {
            t.b("JsonUtils", "Failed to retrieve long property for key = " + str, e10);
            return j10;
        }
    }

    public static Object getObject(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return obj;
        }
        try {
            Object obj2 = jSONObject.get(str);
            if (obj2 != null) {
                return obj2;
            }
            return obj;
        } catch (JSONException e10) {
            t.b("JsonUtils", "Failed to retrieve Object for key = " + str, e10);
            return obj;
        }
    }

    public static Object getObjectAtIndex(JSONArray jSONArray, int i10, Object obj) {
        if (jSONArray == null || jSONArray.length() <= i10) {
            return obj;
        }
        try {
            return jSONArray.get(i10);
        } catch (JSONException e10) {
            t.b("JsonUtils", "Failed to retrieve object at index " + i10 + " for JSON array", e10);
            return obj;
        }
    }

    public static String getString(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null) {
            return str2;
        }
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return str2;
        } catch (Exception e10) {
            t.b("JsonUtils", "Failed to retrieve string property for key = " + str, e10);
            return str2;
        }
    }

    public static List<String> getStringList(JSONObject jSONObject, String str, List<String> list) {
        JSONArray jSONArray = getJSONArray(jSONObject, str, (JSONArray) null);
        return jSONArray != null ? toStringList(jSONArray) : list;
    }

    public static JSONObject jsonObjectFromJsonString(String str, JSONObject jSONObject) {
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            t.b("JsonUtils", "Failed to convert JSON string '" + str + "' to JSONObject", e10);
            return jSONObject;
        }
    }

    public static String maybeConvertToIndentedString(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.toString(4);
        } catch (JSONException unused) {
            return jSONObject.toString();
        }
    }

    public static <T> List<T> optList(JSONArray jSONArray, List<T> list) {
        try {
            return a(jSONArray, list);
        } catch (JSONException unused) {
            return list;
        }
    }

    public static void putAll(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object object = getObject(jSONObject2, next, (Object) null);
                if (object != null) {
                    putObject(jSONObject, next, object);
                }
            }
        }
    }

    public static void putBoolean(JSONObject jSONObject, String str, boolean z10) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, z10);
            } catch (JSONException e10) {
                t.b("JsonUtils", "Failed to put boolean property for key = " + str, e10);
            }
        }
    }

    public static void putBooleanIfValid(JSONObject jSONObject, String str, Boolean bool) {
        if (StringUtils.isValidString(str) && bool != null) {
            putBoolean(jSONObject, str, bool.booleanValue());
        }
    }

    public static void putDouble(JSONObject jSONObject, String str, double d10) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, d10);
            } catch (JSONException e10) {
                t.b("JsonUtils", "Failed to put double property for key = " + str, e10);
            }
        }
    }

    public static void putInt(JSONObject jSONObject, String str, int i10) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, i10);
            } catch (JSONException e10) {
                t.b("JsonUtils", "Failed to put int property for key = " + str, e10);
            }
        }
    }

    public static void putJSONObject(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, jSONObject2);
            } catch (JSONException e10) {
                t.b("JsonUtils", "Failed to put JSON property for key = " + str, e10);
            }
        }
    }

    public static void putJSONObjectIfValid(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        if (jSONObject2 != null && jSONObject2.length() != 0) {
            putJSONObject(jSONObject, str, jSONObject2);
        }
    }

    public static void putJsonArray(JSONObject jSONObject, String str, JSONArray jSONArray) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, jSONArray);
            } catch (JSONException e10) {
                t.b("JsonUtils", "Failed to put JSONArray property for key = " + str, e10);
            }
        }
    }

    public static void putJsonArrayIfValid(JSONObject jSONObject, String str, JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            putJsonArray(jSONObject, str, jSONArray);
        }
    }

    public static void putLong(JSONObject jSONObject, String str, long j10) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, j10);
            } catch (JSONException e10) {
                t.b("JsonUtils", "Failed to put long property for key = " + str, e10);
            }
        }
    }

    public static void putObject(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException e10) {
                t.b("JsonUtils", "Failed to put Object property for key = " + str, e10);
            }
        }
    }

    public static void putString(JSONObject jSONObject, String str, String str2) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException e10) {
                t.b("JsonUtils", "Failed to put String property for key = " + str, e10);
            }
        }
    }

    public static void putStringIfValid(JSONArray jSONArray, String str) {
        if (StringUtils.isValidString(str)) {
            jSONArray.put(str);
        }
    }

    public static void removeObjectsForKeys(JSONObject jSONObject, String[] strArr) {
        for (String remove : strArr) {
            jSONObject.remove(remove);
        }
    }

    public static JSONObject shallowCopy(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject2.put(next, jSONObject.get(next));
            } catch (JSONException unused) {
                t.l("JsonUtils", "Failed to copy over item for key '" + next + "' to JSONObject copy");
            }
        }
        return jSONObject2;
    }

    public static Bundle toBundle(Object obj) {
        JSONObject jSONObject;
        if (obj instanceof JSONObject) {
            jSONObject = (JSONObject) obj;
        } else {
            if (obj instanceof String) {
                try {
                    jSONObject = new JSONObject((String) obj);
                } catch (JSONException unused) {
                }
            }
            jSONObject = null;
        }
        return toBundle(jSONObject);
    }

    public static List<Integer> toIntegerList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add((Integer) jSONArray.get(i10));
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    public static <T> List<T> toList(JSONArray jSONArray) throws JSONException {
        return a(jSONArray, new ArrayList());
    }

    public static List<String> toStringList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add((String) jSONArray.get(i10));
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    public static Map<String, String> toStringMap(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, a(jSONObject.get(next)).toString());
        }
        return hashMap;
    }

    public static Map<String, Object> toStringObjectMap(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, a(jSONObject.get(next)));
        }
        return hashMap;
    }

    public static Map<String, String> tryToStringMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object a10 = a(jSONObject.get(next));
                hashMap.put(next, a10 != null ? a10.toString() : null);
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }

    public static boolean valueExists(JSONObject jSONObject, String str) {
        return jSONObject != null && jSONObject.has(str);
    }

    public static JSONObject getJSONObject(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return jSONObject2;
        }
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException e10) {
            t.b("JsonUtils", "Failed to retrieve JSON property for key = " + str, e10);
            return jSONObject2;
        }
    }

    public static boolean valueExists(JSONArray jSONArray, Object obj) {
        if (!(jSONArray == null || obj == null)) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (obj.equals(getObjectAtIndex(jSONArray, i10, (Object) null))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String maybeConvertToIndentedString(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return new JSONObject(str).toString(i10);
        } catch (JSONException unused) {
            return str;
        }
    }

    public static void putStringIfValid(JSONObject jSONObject, String str, String str2) {
        if (StringUtils.isValidString(str) && StringUtils.isValidString(str2)) {
            putString(jSONObject, str, str2);
        }
    }

    private static Object a(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return toStringObjectMap((JSONObject) obj);
        }
        return obj instanceof JSONArray ? toList((JSONArray) obj) : obj;
    }

    public static Float getFloat(JSONObject jSONObject, String str, Float f10) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return f10;
        }
        try {
            double d10 = jSONObject.getDouble(str);
            if (-3.4028234663852886E38d >= d10 || d10 >= 3.4028234663852886E38d) {
                return f10;
            }
            return Float.valueOf((float) d10);
        } catch (JSONException e10) {
            t.b("JsonUtils", "Failed to retrieve float property for key = " + str, e10);
            return f10;
        }
    }

    public static JSONArray getJSONArray(Object obj) {
        if (obj == null) {
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(obj);
        return jSONArray;
    }

    public static JSONObject getJSONObject(JSONArray jSONArray, int i10, JSONObject jSONObject) {
        if (jSONArray == null || i10 >= jSONArray.length()) {
            return jSONObject;
        }
        try {
            return jSONArray.getJSONObject(i10);
        } catch (JSONException e10) {
            t.b("JsonUtils", "Failed to retrieve JSON object from array for index = " + i10, e10);
            return jSONObject;
        }
    }

    public static void putAll(JSONObject jSONObject, Map<String, ?> map) {
        if (jSONObject != null && map != null) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                if (value != null) {
                    putObject(jSONObject, str, value);
                }
            }
        }
    }

    public static Map<String, Object> toStringObjectMap(String str) {
        try {
            return toStringObjectMap(new JSONObject(str));
        } catch (JSONException e10) {
            t.b("JsonUtils", "Failed to convert json string '" + str + "' to map", e10);
            return new HashMap();
        }
    }

    public static Bundle toBundle(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (jSONObject.isNull(next)) {
                bundle.putString(next, (String) null);
            } else {
                Object opt = jSONObject.opt(next);
                if (opt instanceof JSONObject) {
                    bundle.putBundle(next, toBundle((JSONObject) opt));
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (jSONArray.length() == 0) {
                        bundle.putStringArrayList(next, new ArrayList(0));
                    } else if (getObjectAtIndex(jSONArray, 0, (Object) null) instanceof String) {
                        ArrayList arrayList = new ArrayList(jSONArray.length());
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            arrayList.add((String) getObjectAtIndex(jSONArray, i10, (Object) null));
                        }
                        bundle.putStringArrayList(next, arrayList);
                    } else {
                        bundle.putParcelableArrayList(next, toBundle(jSONArray));
                    }
                } else if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof String) {
                    bundle.putString(next, (String) opt);
                } else if (opt instanceof Integer) {
                    bundle.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Double) opt).doubleValue());
                }
            }
        }
        return bundle;
    }

    public static JSONArray deepCopy(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                Object obj = jSONArray.get(i10);
                if (obj instanceof JSONObject) {
                    jSONArray2.put(i10, deepCopy((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    jSONArray2.put(i10, deepCopy((JSONArray) obj));
                } else {
                    jSONArray2.put(i10, obj);
                }
            } catch (JSONException unused) {
                t.l("JsonUtils", "Failed to copy over item at index " + i10 + " to JSONArray deep copy");
            }
        }
        return jSONArray2;
    }

    public static ArrayList<Bundle> toBundle(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList<>();
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(toBundle(jSONArray.optJSONObject(i10)));
        }
        return arrayList;
    }
}
