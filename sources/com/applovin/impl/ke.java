package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinEventParameters;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import n.a;
import org.json.JSONArray;
import org.json.JSONObject;

public class ke {

    /* renamed from: a  reason: collision with root package name */
    protected final k f8971a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f8972b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f8973c = new Object();

    /* renamed from: d  reason: collision with root package name */
    protected final JSONObject f8974d;

    /* renamed from: f  reason: collision with root package name */
    protected final Object f8975f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private final Map f8976g;

    /* renamed from: h  reason: collision with root package name */
    private final ql f8977h;

    /* renamed from: i  reason: collision with root package name */
    protected final ql f8978i;

    /* renamed from: j  reason: collision with root package name */
    private String f8979j;

    /* renamed from: k  reason: collision with root package name */
    private String f8980k;

    public ke(Map map, JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        } else if (jSONObject != null) {
            this.f8971a = kVar;
            if (((Boolean) kVar.a(oj.f10390q6)).booleanValue()) {
                this.f8977h = new ql(jSONObject2);
                this.f8978i = new ql(jSONObject);
                this.f8972b = null;
                this.f8974d = null;
            } else {
                this.f8972b = jSONObject2;
                this.f8974d = jSONObject;
                this.f8977h = null;
                this.f8978i = null;
            }
            this.f8976g = map;
        } else {
            throw new IllegalArgumentException("No ad object specified");
        }
    }

    private int j() {
        return a("mute_state", b("mute_state", ((Integer) this.f8971a.a(qe.f10983u7)).intValue()));
    }

    /* access modifiers changed from: protected */
    public JSONObject a() {
        JSONObject jSONObject;
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            return qlVar.a();
        }
        synchronized (this.f8975f) {
            jSONObject = this.f8974d;
        }
        return jSONObject;
    }

    public String b() {
        return a("class", (String) null);
    }

    public String c() {
        return a(MediationMetaData.KEY_NAME, (String) null);
    }

    public String d() {
        if (c("consent_string")) {
            return a("consent_string", (String) null);
        }
        if (d("consent_string")) {
            return b("consent_string", (String) null);
        }
        return this.f8971a.m0().k();
    }

    public String e() {
        return this.f8980k;
    }

    public Bundle f() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), l());
    }

    public JSONObject g() {
        JSONObject jSONObject;
        ql qlVar = this.f8977h;
        if (qlVar != null) {
            return qlVar.a();
        }
        synchronized (this.f8973c) {
            jSONObject = this.f8972b;
        }
        return jSONObject;
    }

    public String getAdUnitId() {
        return b("ad_unit_id", MaxReward.DEFAULT_LABEL);
    }

    public String getPlacement() {
        return this.f8979j;
    }

    public long h() {
        return a("init_completion_delay_ms", -1);
    }

    public Map i() {
        return this.f8976g;
    }

    public String k() {
        return c().split("_")[0];
    }

    public Bundle l() {
        Bundle bundle;
        if (e("server_parameters") instanceof JSONObject) {
            ql qlVar = this.f8978i;
            if (qlVar != null) {
                bundle = (Bundle) qlVar.a((a) ty.f12455a);
            } else {
                bundle = JsonUtils.toBundle(a("server_parameters", (JSONObject) null));
            }
        } else {
            bundle = new Bundle();
        }
        int j10 = j();
        if (j10 != -1) {
            if (j10 == 2) {
                bundle.putBoolean("is_muted", this.f8971a.g0().isMuted());
            } else {
                bundle.putBoolean("is_muted", j10 == 0);
            }
        }
        if (!bundle.containsKey(AppLovinEventParameters.REVENUE_AMOUNT)) {
            bundle.putLong(AppLovinEventParameters.REVENUE_AMOUNT, b(AppLovinEventParameters.REVENUE_AMOUNT, 0));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", b("currency", MaxReward.DEFAULT_LABEL));
        }
        return bundle;
    }

    public long m() {
        return a("adapter_timeout_ms", ((Long) this.f8971a.a(qe.R6)).longValue());
    }

    public Boolean n() {
        String str = this.f8971a.g0().getExtraParameters().get("huc");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        if (c("huc")) {
            return a("huc", Boolean.FALSE);
        }
        return b("huc", (Boolean) null);
    }

    public Boolean o() {
        String str = this.f8971a.g0().getExtraParameters().get("aru");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        if (c("aru")) {
            return a("aru", Boolean.FALSE);
        }
        return b("aru", (Boolean) null);
    }

    public Boolean p() {
        String str = this.f8971a.g0().getExtraParameters().get("dns");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        if (c("dns")) {
            return a("dns", Boolean.FALSE);
        }
        return b("dns", (Boolean) null);
    }

    public boolean q() {
        return a("is_testing", Boolean.FALSE).booleanValue();
    }

    public boolean r() {
        return a("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + b() + "', adapterName='" + c() + "', isTesting=" + q() + '}';
    }

    /* access modifiers changed from: protected */
    public Boolean b(String str, Boolean bool) {
        Boolean bool2;
        ql qlVar = this.f8977h;
        if (qlVar != null) {
            return qlVar.a(str, bool);
        }
        synchronized (this.f8973c) {
            bool2 = JsonUtils.getBoolean(this.f8972b, str, bool);
        }
        return bool2;
    }

    /* access modifiers changed from: protected */
    public boolean c(String str) {
        boolean has;
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            return qlVar.a(str);
        }
        synchronized (this.f8975f) {
            has = this.f8974d.has(str);
        }
        return has;
    }

    /* access modifiers changed from: protected */
    public Object e(String str) {
        Object opt;
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            return qlVar.b(str);
        }
        synchronized (this.f8975f) {
            opt = this.f8974d.opt(str);
        }
        return opt;
    }

    public void f(String str) {
        this.f8980k = str;
    }

    /* access modifiers changed from: protected */
    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            return qlVar.a(str, bool);
        }
        synchronized (this.f8975f) {
            bool2 = JsonUtils.getBoolean(this.f8974d, str, bool);
        }
        return bool2;
    }

    /* access modifiers changed from: protected */
    public boolean d(String str) {
        boolean has;
        ql qlVar = this.f8977h;
        if (qlVar != null) {
            return qlVar.a(str);
        }
        synchronized (this.f8973c) {
            has = this.f8972b.has(str);
        }
        return has;
    }

    public void g(String str) {
        this.f8979j = str;
    }

    /* access modifiers changed from: protected */
    public float b(String str, float f10) {
        float f11;
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            return qlVar.a(str, f10);
        }
        synchronized (this.f8975f) {
            f11 = JsonUtils.getFloat(this.f8974d, str, f10);
        }
        return f11;
    }

    /* access modifiers changed from: protected */
    public void c(String str, int i10) {
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            qlVar.b(str, i10);
            return;
        }
        synchronized (this.f8975f) {
            JsonUtils.putInt(this.f8974d, str, i10);
        }
    }

    /* access modifiers changed from: protected */
    public double a(String str, float f10) {
        double d10;
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            return qlVar.a(str, (double) f10);
        }
        synchronized (this.f8975f) {
            d10 = JsonUtils.getDouble(this.f8974d, str, (double) f10);
        }
        return d10;
    }

    /* access modifiers changed from: protected */
    public int b(String str, int i10) {
        int i11;
        ql qlVar = this.f8977h;
        if (qlVar != null) {
            return qlVar.a(str, i10);
        }
        synchronized (this.f8973c) {
            i11 = JsonUtils.getInt(this.f8972b, str, i10);
        }
        return i11;
    }

    /* access modifiers changed from: protected */
    public void c(String str, long j10) {
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            qlVar.b(str, j10);
            return;
        }
        synchronized (this.f8975f) {
            JsonUtils.putLong(this.f8974d, str, j10);
        }
    }

    /* access modifiers changed from: protected */
    public int a(String str, int i10) {
        int i11;
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            return qlVar.a(str, i10);
        }
        synchronized (this.f8975f) {
            i11 = JsonUtils.getInt(this.f8974d, str, i10);
        }
        return i11;
    }

    /* access modifiers changed from: protected */
    public JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        ql qlVar = this.f8977h;
        if (qlVar != null) {
            return qlVar.a(str, jSONArray);
        }
        synchronized (this.f8973c) {
            jSONArray2 = JsonUtils.getJSONArray(this.f8972b, str, jSONArray);
        }
        return jSONArray2;
    }

    /* access modifiers changed from: protected */
    public void c(String str, String str2) {
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            qlVar.b(str, str2);
            return;
        }
        synchronized (this.f8975f) {
            JsonUtils.putString(this.f8974d, str, str2);
        }
    }

    /* access modifiers changed from: protected */
    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            return qlVar.a(str, jSONArray);
        }
        synchronized (this.f8975f) {
            jSONArray2 = JsonUtils.getJSONArray(this.f8974d, str, jSONArray);
        }
        return jSONArray2;
    }

    /* access modifiers changed from: protected */
    public long b(String str, long j10) {
        long j11;
        ql qlVar = this.f8977h;
        if (qlVar != null) {
            return qlVar.a(str, j10);
        }
        synchronized (this.f8973c) {
            j11 = JsonUtils.getLong(this.f8972b, str, j10);
        }
        return j11;
    }

    /* access modifiers changed from: protected */
    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            return qlVar.a(str, jSONObject);
        }
        synchronized (this.f8975f) {
            jSONObject2 = JsonUtils.getJSONObject(this.f8974d, str, jSONObject);
        }
        return jSONObject2;
    }

    public List b(String str) {
        List list;
        List list2;
        if (str != null) {
            ql qlVar = this.f8977h;
            if (qlVar != null) {
                list = qlVar.b(str, Collections.emptyList());
            } else {
                list = JsonUtils.optList(b(str, new JSONArray()), Collections.emptyList());
            }
            ql qlVar2 = this.f8978i;
            if (qlVar2 != null) {
                list2 = qlVar2.b(str, Collections.emptyList());
            } else {
                list2 = JsonUtils.optList(a(str, new JSONArray()), Collections.emptyList());
            }
            ArrayList arrayList = new ArrayList(list.size() + list2.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    /* access modifiers changed from: protected */
    public long a(String str, long j10) {
        long j11;
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            return qlVar.a(str, j10);
        }
        synchronized (this.f8975f) {
            j11 = JsonUtils.getLong(this.f8974d, str, j10);
        }
        return j11;
    }

    public String a(String str) {
        String a10 = a(str, MaxReward.DEFAULT_LABEL);
        if (StringUtils.isValidString(a10)) {
            return a10;
        }
        return b(str, MaxReward.DEFAULT_LABEL);
    }

    /* access modifiers changed from: protected */
    public String b(String str, String str2) {
        String string;
        ql qlVar = this.f8977h;
        if (qlVar != null) {
            return qlVar.a(str, str2);
        }
        synchronized (this.f8973c) {
            string = JsonUtils.getString(this.f8972b, str, str2);
        }
        return string;
    }

    /* access modifiers changed from: protected */
    public String a(String str, String str2) {
        String string;
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            return qlVar.a(str, str2);
        }
        synchronized (this.f8975f) {
            string = JsonUtils.getString(this.f8974d, str, str2);
        }
        return string;
    }

    /* access modifiers changed from: protected */
    public void a(String str, Object obj) {
        ql qlVar = this.f8978i;
        if (qlVar != null) {
            qlVar.a(str, obj);
            return;
        }
        synchronized (this.f8975f) {
            JsonUtils.putObject(this.f8974d, str, obj);
        }
    }
}
