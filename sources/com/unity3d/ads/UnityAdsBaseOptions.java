package com.unity3d.ads;

import com.unity3d.services.core.log.DeviceLog;
import org.json.JSONException;
import org.json.JSONObject;

public class UnityAdsBaseOptions {
    private String OBJECT_ID = "objectId";
    private JSONObject _data = new JSONObject();

    public JSONObject getData() {
        return this._data;
    }

    public String getObjectId() {
        try {
            return this._data.getString(this.OBJECT_ID);
        } catch (JSONException unused) {
            return null;
        }
    }

    public void set(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                this._data.put(str, str2);
            } catch (JSONException e10) {
                DeviceLog.exception("Failed to set Unity Ads options", e10);
            }
        }
    }

    public void setObjectId(String str) {
        set(this.OBJECT_ID, str);
    }
}
