package com.onesignal;

import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageOutcome */
public class l1 {

    /* renamed from: a  reason: collision with root package name */
    private String f28032a;

    /* renamed from: b  reason: collision with root package name */
    private float f28033b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f28034c;

    l1(JSONObject jSONObject) throws JSONException {
        this.f28032a = jSONObject.getString(MediationMetaData.KEY_NAME);
        this.f28033b = jSONObject.has("weight") ? (float) jSONObject.getDouble("weight") : 0.0f;
        this.f28034c = jSONObject.has("unique") && jSONObject.getBoolean("unique");
    }

    public String a() {
        return this.f28032a;
    }

    public float b() {
        return this.f28033b;
    }

    public boolean c() {
        return this.f28034c;
    }

    public String toString() {
        return "OSInAppMessageOutcome{name='" + this.f28032a + '\'' + ", weight=" + this.f28033b + ", unique=" + this.f28034c + '}';
    }
}
