package com.applovin.impl;

import com.applovin.impl.mediation.g;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

public abstract class ie extends be {
    protected ie(int i10, Map map, JSONObject jSONObject, JSONObject jSONObject2, g gVar, k kVar) {
        super(i10, map, jSONObject, jSONObject2, gVar, kVar);
    }

    public float c0() {
        return b("viewability_min_alpha", ((Float) this.f8971a.a(oj.Q1)).floatValue() / 100.0f);
    }

    public int d0() {
        return a("viewability_min_pixels", -1);
    }

    public int e0() {
        oj ojVar;
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            ojVar = oj.J1;
        } else if (format == MaxAdFormat.MREC) {
            ojVar = oj.L1;
        } else if (format == MaxAdFormat.LEADER) {
            ojVar = oj.N1;
        } else {
            ojVar = format == MaxAdFormat.NATIVE ? oj.P1 : null;
        }
        if (ojVar != null) {
            return a("viewability_min_height", ((Integer) this.f8971a.a(ojVar)).intValue());
        }
        return 0;
    }

    public float f0() {
        return b("viewability_min_percentage_dp", -1.0f);
    }

    public float g0() {
        return b("viewability_min_percentage_pixels", -1.0f);
    }

    public long h0() {
        return a("viewability_timer_min_visible_ms", ((Long) this.f8971a.a(oj.R1)).longValue());
    }

    public int i0() {
        oj ojVar;
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            ojVar = oj.I1;
        } else if (format == MaxAdFormat.MREC) {
            ojVar = oj.K1;
        } else if (format == MaxAdFormat.LEADER) {
            ojVar = oj.M1;
        } else {
            ojVar = format == MaxAdFormat.NATIVE ? oj.O1 : null;
        }
        if (ojVar != null) {
            return a("viewability_min_width", ((Integer) this.f8971a.a(ojVar)).intValue());
        }
        return 0;
    }

    public boolean j0() {
        return d0() >= 0 || f0() >= 0.0f || g0() >= 0.0f;
    }
}
