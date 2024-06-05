package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import n.a;
import org.json.JSONArray;
import org.json.JSONObject;

public class ql {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f11028a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f11029b = new Object();

    public ql(JSONObject jSONObject) {
        this.f11028a = jSONObject;
    }

    public Object a(a aVar) {
        Object apply;
        synchronized (this.f11029b) {
            apply = aVar.apply(this);
        }
        return apply;
    }

    public List b(String str, List list) {
        List<String> stringList;
        synchronized (this.f11029b) {
            stringList = JsonUtils.getStringList(this.f11028a, str, list);
        }
        return stringList;
    }

    public void c(String str) {
        synchronized (this.f11029b) {
            this.f11028a.remove(str);
        }
    }

    public String toString() {
        String jSONObject;
        synchronized (this.f11029b) {
            jSONObject = this.f11028a.toString();
        }
        return jSONObject;
    }

    public void a(androidx.core.util.a aVar) {
        synchronized (this.f11029b) {
            aVar.accept(this);
        }
    }

    public Object b(String str) {
        Object opt;
        synchronized (this.f11029b) {
            opt = this.f11028a.opt(str);
        }
        return opt;
    }

    public void b(String str, int i10) {
        synchronized (this.f11029b) {
            JsonUtils.putInt(this.f11028a, str, i10);
        }
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f11029b) {
            bool2 = JsonUtils.getBoolean(this.f11028a, str, bool);
        }
        return bool2;
    }

    public double a(String str, double d10) {
        double d11;
        synchronized (this.f11029b) {
            d11 = JsonUtils.getDouble(this.f11028a, str, d10);
        }
        return d11;
    }

    public void b(String str, long j10) {
        synchronized (this.f11029b) {
            JsonUtils.putLong(this.f11028a, str, j10);
        }
    }

    public float a(String str, float f10) {
        float f11;
        synchronized (this.f11029b) {
            f11 = JsonUtils.getFloat(this.f11028a, str, f10);
        }
        return f11;
    }

    public void b(String str, String str2) {
        synchronized (this.f11029b) {
            JsonUtils.putString(this.f11028a, str, str2);
        }
    }

    public int a(String str, int i10) {
        int i11;
        synchronized (this.f11029b) {
            i11 = JsonUtils.getInt(this.f11028a, str, i10);
        }
        return i11;
    }

    public List a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.f11029b) {
            integerList = JsonUtils.getIntegerList(this.f11028a, str, list);
        }
        return integerList;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f11029b) {
            jSONArray2 = JsonUtils.getJSONArray(this.f11028a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f11029b) {
            jSONObject2 = JsonUtils.getJSONObject(this.f11028a, str, jSONObject);
        }
        return jSONObject2;
    }

    public long a(String str, long j10) {
        long j11;
        synchronized (this.f11029b) {
            j11 = JsonUtils.getLong(this.f11028a, str, j10);
        }
        return j11;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.f11029b) {
            string = JsonUtils.getString(this.f11028a, str, str2);
        }
        return string;
    }

    public boolean a(String str) {
        boolean has;
        synchronized (this.f11029b) {
            has = this.f11028a.has(str);
        }
        return has;
    }

    public void a(String str, boolean z10) {
        synchronized (this.f11029b) {
            JsonUtils.putBoolean(this.f11028a, str, z10);
        }
    }

    public void a(String str, Object obj) {
        synchronized (this.f11029b) {
            JsonUtils.putObject(this.f11028a, str, obj);
        }
    }

    public JSONObject a() {
        JSONObject deepCopy;
        synchronized (this.f11029b) {
            deepCopy = JsonUtils.deepCopy(this.f11028a);
        }
        return deepCopy;
    }
}
