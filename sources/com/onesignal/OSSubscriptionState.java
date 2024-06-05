package com.onesignal;

import com.applovin.mediation.MaxReward;
import org.json.JSONException;
import org.json.JSONObject;

public class OSSubscriptionState implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private h2<Object, OSSubscriptionState> f27512a = new h2<>("changed", false);

    /* renamed from: b  reason: collision with root package name */
    private String f27513b;

    /* renamed from: c  reason: collision with root package name */
    private String f27514c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f27515d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f27516f;

    OSSubscriptionState(boolean z10, boolean z11) {
        if (z10) {
            String str = t3.f28204a;
            this.f27516f = t3.b(str, "ONESIGNAL_SUBSCRIPTION_LAST", true);
            this.f27513b = t3.f(str, "ONESIGNAL_PLAYER_ID_LAST", (String) null);
            this.f27514c = t3.f(str, "ONESIGNAL_PUSH_TOKEN_LAST", (String) null);
            this.f27515d = t3.b(str, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", false);
            return;
        }
        this.f27516f = !y3.k();
        this.f27513b = k3.R0();
        this.f27514c = y3.f();
        this.f27515d = z11;
    }

    private void i(boolean z10) {
        boolean f10 = f();
        this.f27515d = z10;
        if (f10 != f()) {
            this.f27512a.c(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(OSSubscriptionState oSSubscriptionState) {
        if (this.f27516f == oSSubscriptionState.f27516f) {
            String str = this.f27513b;
            String str2 = MaxReward.DEFAULT_LABEL;
            if (str == null) {
                str = str2;
            }
            String str3 = oSSubscriptionState.f27513b;
            if (str3 == null) {
                str3 = str2;
            }
            if (str.equals(str3)) {
                String str4 = this.f27514c;
                if (str4 == null) {
                    str4 = str2;
                }
                String str5 = oSSubscriptionState.f27514c;
                if (str5 != null) {
                    str2 = str5;
                }
                return !str4.equals(str2) || this.f27515d != oSSubscriptionState.f27515d;
            }
        }
    }

    public h2<Object, OSSubscriptionState> b() {
        return this.f27512a;
    }

    public String c() {
        return this.f27514c;
    }

    /* access modifiers changed from: package-private */
    public void changed(l2 l2Var) {
        i(l2Var.a());
    }

    /* access modifiers changed from: protected */
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String d() {
        return this.f27513b;
    }

    public boolean e() {
        return this.f27516f;
    }

    public boolean f() {
        return this.f27513b != null && this.f27514c != null && !this.f27516f && this.f27515d;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        String str = t3.f28204a;
        t3.j(str, "ONESIGNAL_SUBSCRIPTION_LAST", this.f27516f);
        t3.m(str, "ONESIGNAL_PLAYER_ID_LAST", this.f27513b);
        t3.m(str, "ONESIGNAL_PUSH_TOKEN_LAST", this.f27514c);
        t3.j(str, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", this.f27515d);
    }

    /* access modifiers changed from: package-private */
    public void j(boolean z10) {
        boolean z11 = this.f27516f != z10;
        this.f27516f = z10;
        if (z11) {
            this.f27512a.c(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void k(String str) {
        if (str != null) {
            boolean z10 = !str.equals(this.f27514c);
            this.f27514c = str;
            if (z10) {
                this.f27512a.c(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l(String str) {
        boolean z10 = true;
        if (str != null ? str.equals(this.f27513b) : this.f27513b == null) {
            z10 = false;
        }
        this.f27513b = str;
        if (z10) {
            this.f27512a.c(this);
        }
    }

    public JSONObject m() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f27513b;
            if (str != null) {
                jSONObject.put("userId", str);
            } else {
                jSONObject.put("userId", JSONObject.NULL);
            }
            String str2 = this.f27514c;
            if (str2 != null) {
                jSONObject.put("pushToken", str2);
            } else {
                jSONObject.put("pushToken", JSONObject.NULL);
            }
            jSONObject.put("isPushDisabled", e());
            jSONObject.put("isSubscribed", f());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return m().toString();
    }
}
