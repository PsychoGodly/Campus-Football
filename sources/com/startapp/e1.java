package com.startapp;

import android.bluetooth.BluetoothDevice;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Sta */
public class e1 {

    /* renamed from: a  reason: collision with root package name */
    public Set<BluetoothDevice> f15776a;

    /* renamed from: b  reason: collision with root package name */
    public Set<BluetoothDevice> f15777b;

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            Set<BluetoothDevice> set = this.f15776a;
            if (set != null && set.size() > 0) {
                jSONObject.put("paired", a(this.f15776a));
            }
            Set<BluetoothDevice> set2 = this.f15777b;
            if (set2 != null && set2.size() > 0) {
                jSONObject.put("available", a(this.f15777b));
            }
        } catch (Exception unused) {
        }
        if (jSONObject.length() > 0) {
            return jSONObject;
        }
        return null;
    }

    public final JSONArray a(Set<BluetoothDevice> set) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (BluetoothDevice next : set) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bluetoothClass", next.getBluetoothClass().getDeviceClass());
                jSONObject.put(MediationMetaData.KEY_NAME, next.getName());
                jSONObject.put("mac", next.getAddress());
                jSONObject.put("bondState", next.getBondState());
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        } catch (Exception unused) {
            return null;
        }
    }
}
