package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ba {

    /* renamed from: a  reason: collision with root package name */
    private final k f6679a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f6680b = new HashMap();

    public ba(k kVar) {
        if (kVar != null) {
            this.f6679a = kVar;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        try {
            this.f6679a.b(qj.f11022z, (Object) c().toString());
        } catch (Throwable th) {
            this.f6679a.L();
            if (t.a()) {
                this.f6679a.L().a("GlobalStatsManager", "Unable to save stats", th);
            }
        }
    }

    private void f() {
        this.f6679a.l0().a((Runnable) new rt(this), sm.b.OTHER);
    }

    public void a() {
        synchronized (this.f6680b) {
            this.f6680b.clear();
        }
        f();
    }

    public void b() {
        synchronized (this.f6680b) {
            for (aa b10 : aa.a()) {
                this.f6680b.remove(b10.b());
            }
            f();
        }
    }

    public JSONObject c() {
        JSONObject jSONObject;
        synchronized (this.f6680b) {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f6680b.entrySet()) {
                JsonUtils.putLong(jSONObject, (String) entry.getKey(), ((Long) entry.getValue()).longValue());
            }
        }
        return jSONObject;
    }

    public void e() {
        try {
            JSONObject jSONObject = new JSONObject((String) this.f6679a.a(qj.f11022z, (Object) JsonUtils.EMPTY_JSON));
            synchronized (this.f6680b) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        this.f6680b.put(next, Long.valueOf(jSONObject.getLong(next)));
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            this.f6679a.L();
            if (t.a()) {
                this.f6679a.L().a("GlobalStatsManager", "Unable to load stats", th);
            }
        }
    }

    public void a(aa aaVar) {
        synchronized (this.f6680b) {
            this.f6680b.remove(aaVar.b());
        }
        f();
    }

    public long b(aa aaVar) {
        long longValue;
        synchronized (this.f6680b) {
            Long l10 = (Long) this.f6680b.get(aaVar.b());
            if (l10 == null) {
                l10 = 0L;
            }
            longValue = l10.longValue();
        }
        return longValue;
    }

    public long c(aa aaVar) {
        return a(aaVar, 1);
    }

    /* access modifiers changed from: package-private */
    public long a(aa aaVar, long j10) {
        long longValue;
        synchronized (this.f6680b) {
            Long l10 = (Long) this.f6680b.get(aaVar.b());
            if (l10 == null) {
                l10 = 0L;
            }
            longValue = l10.longValue() + j10;
            this.f6680b.put(aaVar.b(), Long.valueOf(longValue));
        }
        f();
        return longValue;
    }

    public void b(aa aaVar, long j10) {
        synchronized (this.f6680b) {
            this.f6680b.put(aaVar.b(), Long.valueOf(j10));
        }
        f();
    }
}
