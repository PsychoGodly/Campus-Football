package com.applovin.impl;

import com.applovin.impl.mediation.g;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

public class ce extends ie {
    public ce(int i10, Map map, JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(i10, map, jSONObject, jSONObject2, (g) null, kVar);
    }

    public be a(g gVar) {
        return new ce(this, gVar);
    }

    public long k0() {
        long a10 = a("ad_refresh_ms", -1);
        if (a10 >= 0) {
            return a10;
        }
        return b("ad_refresh_ms", ((Long) this.f8971a.a(qe.S6)).longValue());
    }

    public long l0() {
        return zp.d(a("bg_color", (String) null));
    }

    public int m0() {
        int a10 = a("ad_view_height", -2);
        if (a10 != -2) {
            return a10;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getHeight();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public long n0() {
        return a("viewability_imp_delay_ms", ((Long) this.f8971a.a(oj.H1)).longValue());
    }

    public int o0() {
        int a10 = a("ad_view_width", -2);
        if (a10 != -2) {
            return a10;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getWidth();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public boolean p0() {
        return k0() >= 0;
    }

    public boolean q0() {
        return a("proe", (Boolean) this.f8971a.a(qe.f10982t7)).booleanValue();
    }

    private ce(ce ceVar, g gVar) {
        super(ceVar.I(), ceVar.i(), ceVar.a(), ceVar.g(), gVar, ceVar.f8971a);
    }
}
