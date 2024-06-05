package com.onesignal;

import ja.c;
import ma.b;
import ma.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSOutcomeEvent */
public class i2 {

    /* renamed from: a  reason: collision with root package name */
    private c f27856a;

    /* renamed from: b  reason: collision with root package name */
    private JSONArray f27857b;

    /* renamed from: c  reason: collision with root package name */
    private String f27858c;

    /* renamed from: d  reason: collision with root package name */
    private long f27859d;

    /* renamed from: e  reason: collision with root package name */
    private Float f27860e;

    public i2(c cVar, JSONArray jSONArray, String str, long j10, float f10) {
        this.f27856a = cVar;
        this.f27857b = jSONArray;
        this.f27858c = str;
        this.f27859d = j10;
        this.f27860e = Float.valueOf(f10);
    }

    public static i2 a(b bVar) {
        JSONArray jSONArray;
        c cVar = c.UNATTRIBUTED;
        if (bVar.b() != null) {
            d b10 = bVar.b();
            if (b10.a() != null && b10.a().b() != null && b10.a().b().length() > 0) {
                cVar = c.DIRECT;
                jSONArray = b10.a().b();
                return new i2(cVar, jSONArray, bVar.a(), bVar.c(), bVar.d());
            } else if (!(b10.b() == null || b10.b().b() == null || b10.b().b().length() <= 0)) {
                cVar = c.INDIRECT;
                jSONArray = b10.b().b();
                return new i2(cVar, jSONArray, bVar.a(), bVar.c(), bVar.d());
            }
        }
        jSONArray = null;
        return new i2(cVar, jSONArray, bVar.a(), bVar.c(), bVar.d());
    }

    public String b() {
        return this.f27858c;
    }

    public JSONArray c() {
        return this.f27857b;
    }

    public c d() {
        return this.f27856a;
    }

    public long e() {
        return this.f27859d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i2 i2Var = (i2) obj;
        if (!this.f27856a.equals(i2Var.f27856a) || !this.f27857b.equals(i2Var.f27857b) || !this.f27858c.equals(i2Var.f27858c) || this.f27859d != i2Var.f27859d || !this.f27860e.equals(i2Var.f27860e)) {
            return false;
        }
        return true;
    }

    public float f() {
        return this.f27860e.floatValue();
    }

    public JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = this.f27857b;
        if (jSONArray != null && jSONArray.length() > 0) {
            jSONObject.put("notification_ids", this.f27857b);
        }
        jSONObject.put("id", this.f27858c);
        if (this.f27860e.floatValue() > 0.0f) {
            jSONObject.put("weight", this.f27860e);
        }
        long j10 = this.f27859d;
        if (j10 > 0) {
            jSONObject.put("timestamp", j10);
        }
        return jSONObject;
    }

    public int hashCode() {
        int i10;
        int i11 = 1;
        Object[] objArr = {this.f27856a, this.f27857b, this.f27858c, Long.valueOf(this.f27859d), this.f27860e};
        for (int i12 = 0; i12 < 5; i12++) {
            Object obj = objArr[i12];
            int i13 = i11 * 31;
            if (obj == null) {
                i10 = 0;
            } else {
                i10 = obj.hashCode();
            }
            i11 = i13 + i10;
        }
        return i11;
    }

    public String toString() {
        return "OutcomeEvent{session=" + this.f27856a + ", notificationIds=" + this.f27857b + ", name='" + this.f27858c + '\'' + ", timestamp=" + this.f27859d + ", weight=" + this.f27860e + '}';
    }
}
