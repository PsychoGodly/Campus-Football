package io.flutter.plugin.editing;

import com.applovin.mediation.MaxReward;
import org.json.JSONException;
import org.json.JSONObject;
import xb.b;

/* compiled from: TextEditingDelta */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f33643a;

    /* renamed from: b  reason: collision with root package name */
    private CharSequence f33644b;

    /* renamed from: c  reason: collision with root package name */
    private int f33645c;

    /* renamed from: d  reason: collision with root package name */
    private int f33646d;

    /* renamed from: e  reason: collision with root package name */
    private int f33647e;

    /* renamed from: f  reason: collision with root package name */
    private int f33648f;

    /* renamed from: g  reason: collision with root package name */
    private int f33649g;

    /* renamed from: h  reason: collision with root package name */
    private int f33650h;

    public e(CharSequence charSequence, int i10, int i11, CharSequence charSequence2, int i12, int i13, int i14, int i15) {
        this.f33647e = i12;
        this.f33648f = i13;
        this.f33649g = i14;
        this.f33650h = i15;
        a(charSequence, charSequence2.toString(), i10, i11);
    }

    private void a(CharSequence charSequence, CharSequence charSequence2, int i10, int i11) {
        this.f33643a = charSequence;
        this.f33644b = charSequence2;
        this.f33645c = i10;
        this.f33646d = i11;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.f33643a.toString());
            jSONObject.put("deltaText", this.f33644b.toString());
            jSONObject.put("deltaStart", this.f33645c);
            jSONObject.put("deltaEnd", this.f33646d);
            jSONObject.put("selectionBase", this.f33647e);
            jSONObject.put("selectionExtent", this.f33648f);
            jSONObject.put("composingBase", this.f33649g);
            jSONObject.put("composingExtent", this.f33650h);
        } catch (JSONException e10) {
            b.b("TextEditingDelta", "unable to create JSONObject: " + e10);
        }
        return jSONObject;
    }

    public e(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        this.f33647e = i10;
        this.f33648f = i11;
        this.f33649g = i12;
        this.f33650h = i13;
        a(charSequence, MaxReward.DEFAULT_LABEL, -1, -1);
    }
}
