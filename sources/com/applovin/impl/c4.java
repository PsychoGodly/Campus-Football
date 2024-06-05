package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import com.applovin.impl.b4;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class c4 {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f6832a = {7, 4, 2, 1, 11};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f6833b = {5, 6, 12, 10, 3, 9, 8, 14};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f6834c = {15, 13};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f6835d = {20};

    public static String a(String str, k kVar) {
        return a((String) kVar.a(oj.L0), str, kVar);
    }

    public static String b(String str, k kVar) {
        return a((String) kVar.a(oj.K0), str, kVar);
    }

    public static Map c(k kVar) {
        HashMap hashMap = new HashMap();
        String str = (String) kVar.a(oj.f10335k);
        if (StringUtils.isValidString(str)) {
            hashMap.put("device_token", str);
        } else if (!((Boolean) kVar.a(oj.f10333j5)).booleanValue()) {
            hashMap.put("api_key", kVar.d0());
        }
        if (kVar.y() != null) {
            hashMap.putAll(zp.a(kVar.y().a()));
        } else {
            hashMap.putAll(zp.a(kVar.x().e()));
        }
        return hashMap;
    }

    public static String d(k kVar) {
        return a((String) kVar.a(oj.J0), "4.0/ad", kVar);
    }

    public static String e(k kVar) {
        return a((String) kVar.a(oj.I0), "4.0/ad", kVar);
    }

    public static Long f(k kVar) {
        b4.d a10 = kVar.r().a();
        if (a10 == null) {
            return null;
        }
        double c10 = zp.c(a10.b());
        double d10 = zp.d(a10.a());
        if (d10 == 0.0d) {
            return null;
        }
        return Long.valueOf((long) (c10 / d10));
    }

    public static String g(k kVar) {
        NetworkInfo b10 = b(k.k());
        if (b10 == null) {
            return "unknown";
        }
        int type = b10.getType();
        int subtype = b10.getSubtype();
        if (type == 1) {
            return "wifi";
        }
        if (type != 0) {
            return "unknown";
        }
        if (a(subtype, f6832a)) {
            return "2g";
        }
        if (a(subtype, f6833b)) {
            return "3g";
        }
        if (a(subtype, f6834c)) {
            return "4g";
        }
        return a(subtype, f6835d) ? "5g" : "mobile";
    }

    public static int h(k kVar) {
        NetworkInfo b10 = b(k.k());
        if (b10 != null) {
            int type = b10.getType();
            int subtype = b10.getSubtype();
            if (type == 1) {
                return 2;
            }
            if (type == 0) {
                if (a(subtype, f6832a)) {
                    return 4;
                }
                if (a(subtype, f6833b)) {
                    return 5;
                }
                if (a(subtype, f6834c)) {
                    return 6;
                }
                return a(subtype, f6835d) ? 7 : 3;
            }
        }
        return 0;
    }

    public static String a(String str, String str2, k kVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        } else if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        } else if (kVar != null) {
            return str + str2;
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    public static String b(k kVar) {
        return a((String) kVar.a(oj.I0), ((Boolean) kVar.a(oj.f10387q3)).booleanValue() ? "5.0/ad" : "4.0/ad", kVar);
    }

    private static NetworkInfo b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static void b(JSONObject jSONObject, k kVar) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", (String) null);
        if (StringUtils.isValidString(string)) {
            kVar.b(qj.H, (Object) string);
            kVar.L();
            if (t.a()) {
                kVar.L().d("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    public static String a(k kVar) {
        return a((String) kVar.a(oj.J0), ((Boolean) kVar.a(oj.f10387q3)).booleanValue() ? "5.0/ad" : "4.0/ad", kVar);
    }

    public static void a(int i10, k kVar) {
        if (i10 == 401) {
            t.h("AppLovinSdk", "SDK key \"" + kVar.d0() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
        } else if (i10 == 418) {
            kVar.h0().a(oj.f10295f, (Object) Boolean.TRUE);
            kVar.h0().e();
        } else if (i10 < 400 || i10 >= 500) {
            if (i10 == -1 && ((Boolean) kVar.a(oj.f10311h)).booleanValue()) {
                kVar.U0();
            }
        } else if (((Boolean) kVar.a(oj.f10311h)).booleanValue()) {
            kVar.U0();
        }
    }

    public static void c(JSONObject jSONObject, k kVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        } else if (kVar != null) {
            try {
                if (jSONObject.has("settings")) {
                    pj h02 = kVar.h0();
                    if (!jSONObject.isNull("settings")) {
                        h02.a(jSONObject.getJSONObject("settings"));
                        h02.e();
                    }
                }
            } catch (JSONException e10) {
                kVar.L();
                if (t.a()) {
                    kVar.L().a("ConnectionUtils", "Unable to parse settings out of API response", e10);
                }
            }
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    private static boolean a(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context) {
        if (context.getSystemService("connectivity") == null) {
            return true;
        }
        NetworkInfo b10 = b(context);
        if (b10 != null) {
            return b10.isConnected();
        }
        return false;
    }

    public static byte[] a(InputStream inputStream, k kVar) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) kVar.a(oj.f10331j3)).intValue()];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static void a(JSONObject jSONObject, boolean z10, k kVar) {
        kVar.o().a(jSONObject, z10);
    }

    public static void a(JSONObject jSONObject, k kVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(k.k()).edit();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, (Object) null);
                if (object != null) {
                    sj.a(next, object, (SharedPreferences) null, edit);
                }
            }
            edit.apply();
        }
    }
}
