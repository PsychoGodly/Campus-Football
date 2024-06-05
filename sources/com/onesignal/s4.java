package com.onesignal;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.onesignal.k3;
import com.onesignal.v3;
import com.onesignal.w4;
import com.onesignal.y3;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserStatePushSynchronizer */
class s4 extends w4 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static boolean f28177m;

    /* compiled from: UserStatePushSynchronizer */
    class a extends v3.g {
        a() {
        }

        /* access modifiers changed from: package-private */
        public void b(String str) {
            boolean unused = s4.f28177m = true;
            if (str == null || str.isEmpty()) {
                str = JsonUtils.EMPTY_JSON;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("tags")) {
                    synchronized (s4.this.f28360a) {
                        s4 s4Var = s4.this;
                        JSONObject y10 = s4Var.y(s4Var.A().l().e("tags"), s4.this.G().l().e("tags"), (JSONObject) null, (Set<String>) null);
                        s4.this.A().t("tags", jSONObject.optJSONObject("tags"));
                        s4.this.A().q();
                        s4.this.G().o(jSONObject, y10);
                        s4.this.G().q();
                    }
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    s4() {
        super(y3.d.PUSH);
    }

    /* access modifiers changed from: protected */
    public String B() {
        return k3.R0();
    }

    /* access modifiers changed from: protected */
    public k3.r0 C() {
        return k3.r0.ERROR;
    }

    /* access modifiers changed from: protected */
    public o4 P(String str, boolean z10) {
        return new r4(str, z10);
    }

    /* access modifiers changed from: protected */
    public void Q(JSONObject jSONObject) {
    }

    /* access modifiers changed from: package-private */
    public void V(String str) {
        k3.d2(str);
    }

    /* access modifiers changed from: protected */
    public void W() {
        D(0).c();
    }

    /* access modifiers changed from: package-private */
    public void g0(String str) {
        k3.O2(str);
    }

    public String j0() {
        return G().i().g("language", (String) null);
    }

    /* access modifiers changed from: package-private */
    public w4.e k0(boolean z10) {
        w4.e eVar;
        if (z10) {
            String R0 = k3.R0();
            String F0 = k3.F0();
            v3.f("players/" + R0 + "?app_id=" + F0, new a(), "CACHE_KEY_GET_TAGS");
        }
        synchronized (this.f28360a) {
            eVar = new w4.e(f28177m, f0.c(G().l(), "tags"));
        }
        return eVar;
    }

    public boolean l0() {
        return G().i().c("userSubscribePref", true);
    }

    /* access modifiers changed from: package-private */
    public void m0() {
        try {
            H().s("logoutEmail", Boolean.TRUE);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void n(JSONObject jSONObject) {
    }

    /* access modifiers changed from: package-private */
    public void n0() {
        o4 G = G();
        G.v("sms_auth_hash");
        G.w("sms_number");
        G.q();
        o4 A = A();
        A.v("sms_auth_hash");
        String f10 = A.l().f("sms_number");
        A.w("sms_number");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sms_number", f10);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        k3.r0 r0Var = k3.r0.INFO;
        k3.a(r0Var, "Device successfully logged out of SMS number: " + jSONObject);
        k3.Z0(jSONObject);
    }

    /* access modifiers changed from: package-private */
    public void o0(String str, String str2) {
        try {
            o4 H = H();
            H.s("email_auth_hash", str2);
            H.h(new JSONObject().put("email", str), (Set<String>) null);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void p0(boolean z10) {
        try {
            H().s("androidPermission", Boolean.valueOf(z10));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void q0(String str, String str2) {
        try {
            o4 H = H();
            H.s("sms_auth_hash", str2);
            H.h(new JSONObject().put("sms_number", str), (Set<String>) null);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void r0(boolean z10) {
        try {
            H().s("userSubscribePref", Boolean.valueOf(z10));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void s0(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("identifier", jSONObject.optString("identifier", (String) null));
            if (jSONObject.has("device_type")) {
                jSONObject2.put("device_type", jSONObject.optInt("device_type"));
            }
            jSONObject2.putOpt("parent_player_id", jSONObject.optString("parent_player_id", (String) null));
            H().h(jSONObject2, (Set<String>) null);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("subscribableStatus")) {
                jSONObject3.put("subscribableStatus", jSONObject.optInt("subscribableStatus"));
            }
            if (jSONObject.has("androidPermission")) {
                jSONObject3.put("androidPermission", jSONObject.optBoolean("androidPermission"));
            }
            H().g(jSONObject3, (Set<String>) null);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void w(JSONObject jSONObject) {
        if (jSONObject.has("email")) {
            k3.P();
        }
        if (jSONObject.has("sms_number")) {
            k3.T();
        }
    }
}
