package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class pj {

    /* renamed from: a  reason: collision with root package name */
    protected final k f10679a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f10680b;

    /* renamed from: c  reason: collision with root package name */
    protected final SharedPreferences f10681c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f10682d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Object f10683e = new Object();

    public pj(k kVar) {
        this.f10679a = kVar;
        Context k10 = k.k();
        this.f10680b = k10;
        this.f10681c = k10.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(oj.class.getName());
            Class.forName(qe.class.getName());
        } catch (Throwable unused) {
        }
        d();
    }

    public void a() {
        synchronized (this.f10683e) {
            this.f10682d.clear();
        }
        this.f10679a.a(this.f10681c);
    }

    public List b(oj ojVar) {
        ArrayList arrayList = new ArrayList(6);
        for (String formatFromString : c(ojVar)) {
            arrayList.add(MaxAdFormat.formatFromString(formatFromString));
        }
        return arrayList;
    }

    public List c(oj ojVar) {
        return CollectionUtils.explode((String) a(ojVar));
    }

    public void d() {
        String b10 = b();
        synchronized (this.f10683e) {
            for (oj ojVar : oj.c()) {
                try {
                    String b11 = ojVar.b();
                    Object a10 = this.f10679a.a(b10 + b11, (Object) null, ojVar.a().getClass(), this.f10681c);
                    if (a10 != null) {
                        this.f10682d.put(ojVar.b(), a10);
                    }
                } catch (Throwable th) {
                    t.c("SettingsManager", "Unable to load \"" + ojVar.b() + "\"", th);
                    this.f10679a.B().a("SettingsManager", "initSettings", th);
                }
            }
        }
    }

    public void e() {
        String b10 = b();
        synchronized (this.f10683e) {
            SharedPreferences.Editor edit = this.f10681c.edit();
            for (oj ojVar : oj.c()) {
                Object obj = this.f10682d.get(ojVar.b());
                if (obj != null) {
                    this.f10679a.a(b10 + ojVar.b(), obj, edit);
                }
            }
            edit.apply();
        }
    }

    public boolean c() {
        return this.f10679a.g0().isVerboseLoggingEnabled() || ((Boolean) a(oj.f10343l)).booleanValue();
    }

    private String b() {
        return "com.applovin.sdk." + zp.e(this.f10679a.d0()) + ".";
    }

    public Object a(oj ojVar) {
        if (ojVar != null) {
            synchronized (this.f10683e) {
                Object obj = this.f10682d.get(ojVar.b());
                if (obj == null) {
                    Object a10 = ojVar.a();
                    return a10;
                }
                Object a11 = ojVar.a(obj);
                return a11;
            }
        }
        throw new IllegalArgumentException("No setting type specified");
    }

    private static Object a(String str, JSONObject jSONObject, Object obj) {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }

    public void a(JSONObject jSONObject) {
        synchronized (this.f10683e) {
            boolean booleanValue = JsonUtils.getBoolean(jSONObject, oj.K.b(), Boolean.FALSE).booleanValue();
            HashMap hashMap = booleanValue ? new HashMap() : null;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && next.length() > 0) {
                    try {
                        oj a10 = a(next, (oj) null);
                        if (a10 != null) {
                            Object a11 = booleanValue ? a(a10) : null;
                            Object a12 = a(next, jSONObject, a10.a());
                            this.f10682d.put(a10.b(), a12);
                            if (a10 == oj.E5) {
                                this.f10682d.put(oj.F5.b(), Long.valueOf(System.currentTimeMillis()));
                            }
                            if (booleanValue && !a12.equals(a11)) {
                                hashMap.put(a10, a11);
                            }
                        }
                    } catch (JSONException e10) {
                        t.c("SettingsManager", "Unable to parse JSON settingsValues array", e10);
                        this.f10679a.B().a("SettingsManager", "loadSettingsException", (Throwable) e10);
                    } catch (Throwable th) {
                        t.c("SettingsManager", "Unable to convert setting object ", th);
                        this.f10679a.B().a("SettingsManager", "loadSettingsThrowable", th);
                    }
                }
            }
            if (booleanValue && hashMap.size() > 0) {
                lc lcVar = new lc();
                lcVar.a("========== UPDATED SETTINGS ==========");
                for (oj ojVar : hashMap.keySet()) {
                    String b10 = ojVar.b();
                    lcVar.a(b10, a(ojVar) + " (" + hashMap.get(ojVar) + ")");
                }
                lcVar.a("========== END ==========");
                this.f10679a.L();
                if (t.a()) {
                    this.f10679a.L().a("SettingsManager", lcVar.toString());
                }
            }
        }
    }

    public oj a(String str, oj ojVar) {
        synchronized (this.f10683e) {
            for (oj ojVar2 : oj.c()) {
                if (ojVar2.b().equals(str)) {
                    return ojVar2;
                }
            }
            return ojVar;
        }
    }

    public void a(oj ojVar, Object obj) {
        if (ojVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        } else if (obj != null) {
            synchronized (this.f10683e) {
                this.f10682d.put(ojVar.b(), obj);
            }
        } else {
            throw new IllegalArgumentException("No new value specified");
        }
    }
}
