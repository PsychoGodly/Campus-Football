package com.startapp;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public class o7 {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<Integer, SensorEvent> f16227a = new HashMap<>();

    public JSONArray a() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (SensorEvent next : this.f16227a.values()) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            Sensor sensor = next.sensor;
            jSONObject2.put(MediationMetaData.KEY_NAME, sensor.getName());
            jSONObject2.put("vendor", sensor.getVendor());
            jSONObject2.put("version", sensor.getVersion());
            jSONObject2.put("maximum range", (double) sensor.getMaximumRange());
            jSONObject2.put("power", (double) sensor.getPower());
            jSONObject2.put("resolution", (double) sensor.getResolution());
            jSONObject2.put("accuracy", next.accuracy);
            jSONObject2.put("timestamp", next.timestamp);
            JSONArray jSONArray2 = new JSONArray();
            for (float f10 : next.values) {
                jSONArray2.put((double) f10);
            }
            jSONObject2.put("values", jSONArray2);
            jSONObject.put(String.valueOf(sensor.getType()), jSONObject2);
            jSONArray.put(jSONObject);
        }
        if (jSONArray.length() > 0) {
            return jSONArray;
        }
        return null;
    }
}
