package com.applovin.impl.sdk;

import android.graphics.Color;
import com.applovin.impl.hg;
import com.applovin.impl.ig;
import com.applovin.impl.oj;
import com.applovin.impl.ql;
import com.applovin.impl.sdk.array.ArrayDirectDownloadAd;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxReward;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AppLovinAdBase implements hg, ArrayDirectDownloadAd {
    protected final JSONObject adObject;
    protected final Object adObjectLock = new Object();
    private final long createdAtMillis;
    protected final JSONObject fullResponse;
    protected final Object fullResponseLock = new Object();
    /* access modifiers changed from: protected */
    public final k sdk;
    protected final ql synchronizedAdObject;
    protected final ql synchronizedFullResponse;

    protected AppLovinAdBase(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        } else if (jSONObject2 == null) {
            throw new IllegalArgumentException("No response specified");
        } else if (kVar != null) {
            this.sdk = kVar;
            if (((Boolean) kVar.a(oj.f10390q6)).booleanValue()) {
                this.synchronizedAdObject = new ql(jSONObject);
                this.synchronizedFullResponse = new ql(jSONObject2);
                this.adObject = null;
                this.fullResponse = null;
            } else {
                this.adObject = jSONObject;
                this.fullResponse = jSONObject2;
                this.synchronizedAdObject = null;
                this.synchronizedFullResponse = null;
            }
            this.createdAtMillis = System.currentTimeMillis();
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* access modifiers changed from: protected */
    public boolean containsKeyForAdObject(String str) {
        boolean has;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return qlVar.a(str);
        }
        synchronized (this.adObjectLock) {
            has = this.adObject.has(str);
        }
        return has;
    }

    public String getAdDomain() {
        return getStringFromFullResponse("adomain", MaxReward.DEFAULT_LABEL);
    }

    public abstract /* synthetic */ ig getAdEventTracker();

    public abstract long getAdIdNumber();

    /* access modifiers changed from: protected */
    public boolean getBooleanFromAdObject(String str, Boolean bool) {
        boolean booleanValue;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return qlVar.a(str, bool).booleanValue();
        }
        synchronized (this.adObjectLock) {
            booleanValue = JsonUtils.getBoolean(this.adObject, str, bool).booleanValue();
        }
        return booleanValue;
    }

    /* access modifiers changed from: protected */
    public boolean getBooleanFromFullResponse(String str, boolean z10) {
        boolean booleanValue;
        ql qlVar = this.synchronizedFullResponse;
        if (qlVar != null) {
            return qlVar.a(str, Boolean.valueOf(z10)).booleanValue();
        }
        synchronized (this.fullResponseLock) {
            booleanValue = JsonUtils.getBoolean(this.fullResponse, str, Boolean.valueOf(z10)).booleanValue();
        }
        return booleanValue;
    }

    public String getClCode() {
        String stringFromAdObject = getStringFromAdObject("clcode", MaxReward.DEFAULT_LABEL);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return stringFromAdObject;
        }
        return getStringFromFullResponse("clcode", MaxReward.DEFAULT_LABEL);
    }

    /* access modifiers changed from: protected */
    public int getColorFromAdObject(String str, int i10) {
        String stringFromAdObject = getStringFromAdObject(str, (String) null);
        return StringUtils.isValidString(stringFromAdObject) ? Color.parseColor(stringFromAdObject) : i10;
    }

    public long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public String getDspId() {
        return getStringFromFullResponse("dsp_id", MaxReward.DEFAULT_LABEL);
    }

    public String getDspName() {
        return getStringFromFullResponse("dsp_name", MaxReward.DEFAULT_LABEL);
    }

    public long getFetchLatencyMillis() {
        return getLongFromFullResponse("ad_fetch_latency_millis", -1);
    }

    public long getFetchResponseSize() {
        return getLongFromFullResponse("ad_fetch_response_size", -1);
    }

    /* access modifiers changed from: protected */
    public float getFloatFromAdObject(String str, float f10) {
        float f11;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return qlVar.a(str, f10);
        }
        synchronized (this.adObjectLock) {
            f11 = JsonUtils.getFloat(this.adObject, str, f10);
        }
        return f11;
    }

    /* access modifiers changed from: protected */
    public int getIntFromAdObject(String str, int i10) {
        int i11;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return qlVar.a(str, i10);
        }
        synchronized (this.adObjectLock) {
            i11 = JsonUtils.getInt(this.adObject, str, i10);
        }
        return i11;
    }

    /* access modifiers changed from: protected */
    public List<Integer> getIntegerListFromAdObject(String str, List<Integer> list) {
        List<Integer> integerList;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return qlVar.a(str, (List) list);
        }
        synchronized (this.adObjectLock) {
            integerList = JsonUtils.getIntegerList(this.adObject, str, list);
        }
        return integerList;
    }

    /* access modifiers changed from: protected */
    public JSONArray getJsonArrayFromAdObject(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return qlVar.a(str, jSONArray);
        }
        synchronized (this.adObjectLock) {
            jSONArray2 = JsonUtils.getJSONArray(this.adObject, str, jSONArray);
        }
        return jSONArray2;
    }

    /* access modifiers changed from: protected */
    public JSONObject getJsonObjectFromAdObject(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return qlVar.a(str, jSONObject);
        }
        synchronized (this.adObjectLock) {
            jSONObject2 = JsonUtils.getJSONObject(this.adObject, str, jSONObject);
        }
        return jSONObject2;
    }

    /* access modifiers changed from: protected */
    public long getLongFromAdObject(String str, long j10) {
        long j11;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return qlVar.a(str, j10);
        }
        synchronized (this.adObjectLock) {
            j11 = JsonUtils.getLong(this.adObject, str, j10);
        }
        return j11;
    }

    /* access modifiers changed from: protected */
    public long getLongFromFullResponse(String str, long j10) {
        long j11;
        ql qlVar = this.synchronizedFullResponse;
        if (qlVar != null) {
            return qlVar.a(str, j10);
        }
        synchronized (this.fullResponseLock) {
            j11 = JsonUtils.getLong(this.fullResponse, str, j10);
        }
        return j11;
    }

    public abstract /* synthetic */ String getOpenMeasurementContentUrl();

    public abstract /* synthetic */ String getOpenMeasurementCustomReferenceData();

    public abstract /* synthetic */ List getOpenMeasurementVerificationScriptResources();

    public k getSdk() {
        return this.sdk;
    }

    /* access modifiers changed from: protected */
    public String getStringFromAdObject(String str, String str2) {
        String string;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return qlVar.a(str, str2);
        }
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, str, str2);
        }
        return string;
    }

    /* access modifiers changed from: protected */
    public String getStringFromFullResponse(String str, String str2) {
        String string;
        ql qlVar = this.synchronizedFullResponse;
        if (qlVar != null) {
            return qlVar.a(str, str2);
        }
        synchronized (this.fullResponseLock) {
            string = JsonUtils.getString(this.fullResponse, str, str2);
        }
        return string;
    }

    /* access modifiers changed from: protected */
    public List<String> getStringListFromAdObject(String str, List<String> list) {
        List<String> stringList;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return qlVar.b(str, (List) list);
        }
        synchronized (this.adObjectLock) {
            stringList = JsonUtils.getStringList(this.adObject, str, list);
        }
        return stringList;
    }

    public abstract /* synthetic */ boolean isOpenMeasurementEnabled();
}
