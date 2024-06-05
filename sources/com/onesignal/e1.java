package com.onesignal;

import com.onesignal.x4;
import kotlin.jvm.internal.m;
import org.json.JSONObject;

/* compiled from: OSInAppMessageContent.kt */
public class e1 {

    /* renamed from: a  reason: collision with root package name */
    private String f27659a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f27660b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f27661c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f27662d;

    /* renamed from: e  reason: collision with root package name */
    private x4.m f27663e;

    /* renamed from: f  reason: collision with root package name */
    private Double f27664f;

    /* renamed from: g  reason: collision with root package name */
    private int f27665g;

    public e1(JSONObject jSONObject) {
        boolean z10;
        m.e(jSONObject, "jsonObject");
        this.f27659a = jSONObject.optString("html");
        this.f27664f = Double.valueOf(jSONObject.optDouble("display_duration"));
        JSONObject optJSONObject = jSONObject.optJSONObject("styles");
        boolean z11 = false;
        if (optJSONObject == null) {
            z10 = false;
        } else {
            z10 = optJSONObject.optBoolean("remove_height_margin", false);
        }
        this.f27660b = !z10;
        this.f27661c = !(optJSONObject != null ? optJSONObject.optBoolean("remove_width_margin", false) : z11);
        this.f27662d = !this.f27660b;
    }

    public final String a() {
        return this.f27659a;
    }

    public final Double b() {
        return this.f27664f;
    }

    public final x4.m c() {
        return this.f27663e;
    }

    public final int d() {
        return this.f27665g;
    }

    public final boolean e() {
        return this.f27660b;
    }

    public final boolean f() {
        return this.f27661c;
    }

    public final boolean g() {
        return this.f27662d;
    }

    public final void h(String str) {
        this.f27659a = str;
    }

    public final void i(x4.m mVar) {
        this.f27663e = mVar;
    }

    public final void j(int i10) {
        this.f27665g = i10;
    }
}
