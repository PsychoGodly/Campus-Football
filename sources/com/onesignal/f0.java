package com.onesignal;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxReward;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JSONUtils */
class f0 {
    static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            try {
                int i11 = 0;
                while (i11 < jSONArray2.length()) {
                    if (e(jSONArray.get(i10)).equals(e(jSONArray2.get(i11)))) {
                        i10++;
                    } else {
                        i11++;
                    }
                }
                return false;
            } catch (JSONException e10) {
                e10.printStackTrace();
                return false;
            }
        }
        return true;
    }

    static JSONObject b(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject jSONObject4;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject2 == null) {
            return jSONObject3;
        }
        Iterator<String> keys = jSONObject2.keys();
        if (jSONObject3 != null) {
            jSONObject4 = jSONObject3;
        } else {
            jSONObject4 = new JSONObject();
        }
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                Object obj = jSONObject2.get(next);
                if (jSONObject.has(next)) {
                    if (obj instanceof JSONObject) {
                        String jSONObject5 = b(jSONObject.getJSONObject(next), (JSONObject) obj, (jSONObject3 == null || !jSONObject3.has(next)) ? null : jSONObject3.getJSONObject(next), set).toString();
                        if (!jSONObject5.equals(JsonUtils.EMPTY_JSON)) {
                            jSONObject4.put(next, new JSONObject(jSONObject5));
                        }
                    } else if (obj instanceof JSONArray) {
                        d(next, (JSONArray) obj, jSONObject.getJSONArray(next), jSONObject4);
                    } else if (set == null || !set.contains(next)) {
                        Object obj2 = jSONObject.get(next);
                        if (!obj.equals(obj2)) {
                            if (!(obj2 instanceof Number) || !(obj instanceof Number)) {
                                jSONObject4.put(next, obj);
                            } else if (((Number) obj2).doubleValue() != ((Number) obj).doubleValue()) {
                                jSONObject4.put(next, obj);
                            }
                        }
                    } else {
                        jSONObject4.put(next, obj);
                    }
                } else if (obj instanceof JSONObject) {
                    jSONObject4.put(next, new JSONObject(obj.toString()));
                } else if (obj instanceof JSONArray) {
                    d(next, (JSONArray) obj, (JSONArray) null, jSONObject4);
                } else {
                    jSONObject4.put(next, obj);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return jSONObject4;
    }

    static JSONObject c(c0 c0Var, String str) {
        if (!c0Var.a(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject e10 = c0Var.e(str);
        Iterator<String> keys = e10.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = e10.get(next);
                if (!MaxReward.DEFAULT_LABEL.equals(obj)) {
                    jSONObject.put(next, obj);
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    private static void d(String str, JSONArray jSONArray, JSONArray jSONArray2, JSONObject jSONObject) throws JSONException {
        String str2;
        if (str.endsWith("_a") || str.endsWith("_d")) {
            jSONObject.put(str, jSONArray);
            return;
        }
        String f10 = f(jSONArray);
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        if (jSONArray2 == null) {
            str2 = null;
        } else {
            str2 = f(jSONArray2);
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String str3 = (String) jSONArray.get(i10);
            if (jSONArray2 == null || !str2.contains(str3)) {
                jSONArray3.put(str3);
            }
        }
        if (jSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                String string = jSONArray2.getString(i11);
                if (!f10.contains(string)) {
                    jSONArray4.put(string);
                }
            }
        }
        if (!jSONArray3.toString().equals("[]")) {
            jSONObject.put(str + "_a", jSONArray3);
        }
        if (!jSONArray4.toString().equals("[]")) {
            jSONObject.put(str + "_d", jSONArray4);
        }
    }

    public static Object e(Object obj) {
        Class<?> cls = obj.getClass();
        if (cls.equals(Integer.class)) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        return cls.equals(Float.class) ? Double.valueOf((double) ((Float) obj).floatValue()) : obj;
    }

    static String f(JSONArray jSONArray) {
        int i10 = 0;
        String str = "[";
        while (i10 < jSONArray.length()) {
            try {
                str = str + "\"" + jSONArray.getString(i10) + "\"";
                i10++;
            } catch (JSONException unused) {
            }
        }
        return str + "]";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r1 = r3.group(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String g(org.json.JSONObject r3) {
        /*
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "external_user_id"
            boolean r3 = r3.has(r1)
            if (r3 == 0) goto L_0x0033
            java.lang.String r3 = "(?<=\"external_user_id\":\").*?(?=\")"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r1 = r3.find()
            if (r1 == 0) goto L_0x0033
            r1 = 0
            java.lang.String r1 = r3.group(r1)
            if (r1 == 0) goto L_0x0033
            java.lang.String r0 = "\\/"
            java.lang.String r2 = "/"
            java.lang.String r0 = r1.replace(r0, r2)
            java.lang.String r0 = java.util.regex.Matcher.quoteReplacement(r0)
            java.lang.String r0 = r3.replaceAll(r0)
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.f0.g(org.json.JSONObject):java.lang.String");
    }
}
