package com.startapp;

import com.applovin.mediation.MaxReward;
import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* compiled from: Sta */
public class u4 {

    /* renamed from: a  reason: collision with root package name */
    public g3 f17363a = new g3();

    /* renamed from: b  reason: collision with root package name */
    public List<s4> f17364b;

    /* renamed from: c  reason: collision with root package name */
    public String f17365c = MaxReward.DEFAULT_LABEL;

    public void a(AdDetails adDetails) {
        s4 s4Var = new s4(adDetails);
        this.f17364b.add(s4Var);
        this.f17363a.a(this.f17364b.size() - 1, s4Var.f16374a, s4Var.f16382i);
    }

    public void a() {
        for (k7 next : this.f17363a.f15831a.values()) {
            if (next != null) {
                next.a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
            }
        }
    }

    public void a(c6 c6Var, boolean z10) {
        g3 g3Var = this.f17363a;
        g3Var.f15834d = c6Var;
        if (z10) {
            g3Var.f15833c.clear();
            g3Var.f15835e = 0;
            g3Var.f15836f.clear();
            HashMap<String, k7> hashMap = g3Var.f15831a;
            if (hashMap != null) {
                for (k7 next : hashMap.values()) {
                    if (next != null) {
                        next.a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
                    }
                }
                g3Var.f15831a.clear();
            }
        }
    }
}
