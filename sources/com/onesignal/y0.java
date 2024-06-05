package com.onesignal;

import com.applovin.mediation.MaxReward;
import org.json.JSONObject;

/* compiled from: OSEmailSubscriptionState */
public class y0 implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private h2<Object, y0> f28443a = new h2<>("changed", false);

    /* renamed from: b  reason: collision with root package name */
    private String f28444b;

    /* renamed from: c  reason: collision with root package name */
    private String f28445c;

    y0(boolean z10) {
        if (z10) {
            String str = t3.f28204a;
            this.f28444b = t3.f(str, "PREFS_ONESIGNAL_EMAIL_ID_LAST", (String) null);
            this.f28445c = t3.f(str, "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", (String) null);
            return;
        }
        this.f28444b = k3.i0();
        this.f28445c = y3.c().E();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        boolean z10 = (this.f28444b == null && this.f28445c == null) ? false : true;
        this.f28444b = null;
        this.f28445c = null;
        if (z10) {
            this.f28443a.c(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(y0 y0Var) {
        String str = this.f28444b;
        String str2 = MaxReward.DEFAULT_LABEL;
        if (str == null) {
            str = str2;
        }
        String str3 = y0Var.f28444b;
        if (str3 == null) {
            str3 = str2;
        }
        if (str.equals(str3)) {
            String str4 = this.f28445c;
            if (str4 == null) {
                str4 = str2;
            }
            String str5 = y0Var.f28445c;
            if (str5 != null) {
                str2 = str5;
            }
            return !str4.equals(str2);
        }
    }

    public String c() {
        return this.f28445c;
    }

    /* access modifiers changed from: protected */
    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String d() {
        return this.f28444b;
    }

    public h2<Object, y0> e() {
        return this.f28443a;
    }

    public boolean f() {
        return (this.f28444b == null || this.f28445c == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        String str = t3.f28204a;
        t3.m(str, "PREFS_ONESIGNAL_EMAIL_ID_LAST", this.f28444b);
        t3.m(str, "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", this.f28445c);
    }

    /* access modifiers changed from: package-private */
    public void i(String str) {
        boolean z10 = !str.equals(this.f28445c);
        this.f28445c = str;
        if (z10) {
            this.f28443a.c(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void j(String str) {
        boolean z10 = true;
        if (str != null ? str.equals(this.f28444b) : this.f28444b == null) {
            z10 = false;
        }
        this.f28444b = str;
        if (z10) {
            this.f28443a.c(this);
        }
    }

    public JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f28444b;
            if (str != null) {
                jSONObject.put("emailUserId", str);
            } else {
                jSONObject.put("emailUserId", JSONObject.NULL);
            }
            String str2 = this.f28445c;
            if (str2 != null) {
                jSONObject.put("emailAddress", str2);
            } else {
                jSONObject.put("emailAddress", JSONObject.NULL);
            }
            jSONObject.put("isSubscribed", f());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return k().toString();
    }
}
