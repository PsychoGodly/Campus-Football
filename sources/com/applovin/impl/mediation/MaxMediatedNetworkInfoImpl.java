package com.applovin.impl.mediation;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONObject;

public class MaxMediatedNetworkInfoImpl implements MaxMediatedNetworkInfo {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f9386a;

    public MaxMediatedNetworkInfoImpl(JSONObject jSONObject) {
        this.f9386a = jSONObject;
    }

    public String getAdapterClassName() {
        return JsonUtils.getString(this.f9386a, "class", MaxReward.DEFAULT_LABEL);
    }

    public String getAdapterVersion() {
        return JsonUtils.getString(this.f9386a, "version", MaxReward.DEFAULT_LABEL);
    }

    public String getName() {
        return JsonUtils.getString(this.f9386a, MediationMetaData.KEY_NAME, MaxReward.DEFAULT_LABEL);
    }

    public String getSdkVersion() {
        return JsonUtils.getString(this.f9386a, "sdk_version", MaxReward.DEFAULT_LABEL);
    }

    public String toString() {
        return "MaxMediatedNetworkInfo{name=" + getName() + ", adapterClassName=" + getAdapterClassName() + ", adapterVersion=" + getAdapterVersion() + ", sdkVersion=" + getSdkVersion() + '}';
    }
}
