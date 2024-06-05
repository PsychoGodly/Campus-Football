package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.applovin.impl.sdk.t;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CollectionUtils {
    public static <T> boolean addObjectIfExists(T t10, List<T> list) {
        if (t10 != null) {
            return list.add(t10);
        }
        return false;
    }

    public static List<String> explode(String str) {
        return explode(str, ",\\s*");
    }

    public static boolean getBoolean(Map<String, Object> map, String str) {
        return getBoolean(map, str, false);
    }

    public static HashMap<String, String> hashMap(String str, String str2) {
        return (HashMap) map(str, str2);
    }

    public static String implode(Collection<String> collection, int i10) {
        return implode(collection, ",", i10);
    }

    public static <K, V> boolean isEmpty(Map<K, V> map) {
        return map == null || map.isEmpty();
    }

    public static <K, V> Map<K, V> map(Map<K, V> map) {
        if (map == null) {
            return new HashMap();
        }
        return new HashMap(map);
    }

    public static void putBooleanIfValid(String str, Boolean bool, Map map) {
        if (StringUtils.isValidString(str) && bool != null) {
            map.put(str, bool);
        }
    }

    public static void putDoubleIfValid(String str, Double d10, Map map) {
        if (StringUtils.isValidString(str) && d10 != null) {
            map.put(str, d10);
        }
    }

    public static void putFloatIfValid(String str, Float f10, Map map) {
        if (StringUtils.isValidString(str) && f10 != null) {
            map.put(str, f10);
        }
    }

    public static void putIntegerIfValid(String str, Integer num, Map map) {
        if (StringUtils.isValidString(str) && num != null) {
            map.put(str, num);
        }
    }

    public static void putJsonArrayIfValid(String str, JSONArray jSONArray, Map map) {
        if (StringUtils.isValidString(str) && jSONArray != null && jSONArray.length() > 0) {
            map.put(str, jSONArray);
        }
    }

    public static void putLongIfValid(String str, Long l10, Map map) {
        if (StringUtils.isValidString(str) && l10 != null) {
            map.put(str, l10);
        }
    }

    public static void putObjectToStringIfValid(String str, Object obj, Map map) {
        if (obj != null) {
            putStringIfValid(str, obj.toString(), map);
        }
    }

    public static void putStringIfValid(String str, String str2, Map map) {
        if (StringUtils.isValidString(str) && StringUtils.isValidString(str2)) {
            map.put(str, str2);
        }
    }

    public static List<String> removeTrimmedEmptyStrings(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String trim : list) {
            String trim2 = trim.trim();
            if (!TextUtils.isEmpty(trim2)) {
                arrayList.add(trim2);
            }
        }
        return arrayList;
    }

    public static <T> List<T> synchronizedList() {
        return synchronizedList(-1);
    }

    public static Bundle toBundle(Map<String, ?> map) {
        if (map == null || map.size() == 0) {
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        for (String next : map.keySet()) {
            Object obj = map.get(next);
            if (obj instanceof Map) {
                bundle.putBundle(next, toBundle((Map) obj));
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof String) {
                bundle.putString(next, (String) obj);
            } else if (obj instanceof Integer) {
                bundle.putInt(next, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(next, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(next, ((Double) obj).doubleValue());
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(next, (Parcelable) obj);
            }
        }
        return bundle;
    }

    public static JSONArray toJSONArray(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (String put : strArr) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    public static JSONObject toJson(Map<String, ?> map) throws JSONException {
        if (map == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            jSONObject.put((String) next.getKey(), next.getValue());
        }
        return jSONObject;
    }

    public static String toJsonString(Map<String, Object> map, String str) {
        try {
            return toJson(map).toString();
        } catch (JSONException e10) {
            t.c("CollectionUtils", "Failed to convert map '" + map + "' to JSON string.", e10);
            return str;
        }
    }

    public static List<String> explode(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        return Arrays.asList(str.split(str2));
    }

    public static boolean getBoolean(Map<String, Object> map, String str, boolean z10) {
        if (map != null && map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                return Boolean.parseBoolean((String) obj);
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if (obj instanceof Number) {
                return ((Number) obj).intValue() >= 1;
            }
        }
        return z10;
    }

    public static String implode(Collection<String> collection, String str, int i10) {
        if (str == null) {
            throw new IllegalArgumentException("No glue specified");
        } else if (collection == null || collection.size() < 1) {
            return MaxReward.DEFAULT_LABEL;
        } else {
            StringBuilder sb2 = new StringBuilder();
            int i11 = 0;
            for (String next : collection) {
                if (i11 >= i10) {
                    break;
                }
                i11++;
                sb2.append(next);
                sb2.append(str);
            }
            if (sb2.length() > str.length()) {
                sb2.setLength(sb2.length() - str.length());
            }
            return sb2.toString();
        }
    }

    public static <E> boolean isEmpty(Collection<E> collection) {
        return collection == null || collection.isEmpty();
    }

    public static <T> List<T> synchronizedList(int i10) {
        if (i10 >= 0) {
            return Collections.synchronizedList(new ArrayList(i10));
        }
        return Collections.synchronizedList(new ArrayList());
    }

    public static <K, V> Map<K, V> map(K k10, V v10) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(k10, v10);
        return hashMap;
    }
}
