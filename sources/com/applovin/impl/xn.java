package com.applovin.impl;

import com.applovin.impl.l0;
import com.applovin.impl.sdk.h;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class xn {

    /* renamed from: a  reason: collision with root package name */
    private final k f13429a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13430b;

    /* renamed from: c  reason: collision with root package name */
    private List f13431c;

    public xn(k kVar) {
        this.f13429a = kVar;
        qj qjVar = qj.J;
        this.f13430b = ((Boolean) kVar.a(qjVar, (Object) Boolean.FALSE)).booleanValue() || t0.a(k.k()).a("applovin.sdk.is_test_environment") || AppLovinSdkUtils.isEmulator();
        kVar.c(qjVar);
    }

    private void e() {
        h o10 = this.f13429a.o();
        if (this.f13430b) {
            o10.b(this.f13431c);
        } else {
            o10.a(this.f13431c);
        }
    }

    public void a() {
        this.f13429a.b(qj.J, (Object) Boolean.TRUE);
    }

    public List b() {
        return this.f13431c;
    }

    public boolean c() {
        return this.f13430b;
    }

    public boolean d() {
        List list = this.f13431c;
        return list != null && !list.isEmpty();
    }

    public void a(String str) {
        if (StringUtils.isValidString(str)) {
            a(Collections.singletonList(str));
        } else {
            a((List) null);
        }
    }

    public void a(List list) {
        if (list != null || this.f13431c != null) {
            if (list == null || !list.equals(this.f13431c)) {
                this.f13431c = list;
                e();
            }
        }
    }

    public void a(JSONObject jSONObject) {
        String str;
        boolean z10;
        if (!this.f13430b) {
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray());
            String str2 = null;
            if (this.f13429a.y() != null) {
                n z11 = this.f13429a.z();
                z10 = z11.G();
                l0.a d10 = z11.d();
                str = d10 != null ? d10.a() : null;
                n.c h10 = z11.h();
                if (h10 != null) {
                    str2 = h10.a();
                }
            } else {
                l x10 = this.f13429a.x();
                z10 = x10.L();
                str = x10.f().a();
                l.b B = x10.B();
                if (B != null) {
                    str2 = B.f11725a;
                }
            }
            this.f13430b = z10 || JsonUtils.containsCaseInsensitiveString(str, jSONArray) || JsonUtils.containsCaseInsensitiveString(str2, jSONArray);
        }
    }
}
