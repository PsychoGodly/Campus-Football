package com.onesignal;

import com.applovin.mediation.MaxReward;
import org.json.JSONObject;

/* compiled from: OSSMSSubscriptionState */
public class q2 implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private h2<Object, q2> f28101a = new h2<>("changed", false);

    /* renamed from: b  reason: collision with root package name */
    private String f28102b;

    /* renamed from: c  reason: collision with root package name */
    private String f28103c;

    q2(boolean z10) {
        if (z10) {
            String str = t3.f28204a;
            this.f28102b = t3.f(str, "PREFS_OS_SMS_ID_LAST", (String) null);
            this.f28103c = t3.f(str, "PREFS_OS_SMS_NUMBER_LAST", (String) null);
            return;
        }
        this.f28102b = k3.C0();
        this.f28103c = y3.g().E();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        boolean z10 = (this.f28102b == null && this.f28103c == null) ? false : true;
        this.f28102b = null;
        this.f28103c = null;
        if (z10) {
            this.f28101a.c(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(q2 q2Var) {
        String str = this.f28102b;
        String str2 = MaxReward.DEFAULT_LABEL;
        if (str == null) {
            str = str2;
        }
        String str3 = q2Var.f28102b;
        if (str3 == null) {
            str3 = str2;
        }
        if (str.equals(str3)) {
            String str4 = this.f28103c;
            if (str4 == null) {
                str4 = str2;
            }
            String str5 = q2Var.f28103c;
            if (str5 != null) {
                str2 = str5;
            }
            return !str4.equals(str2);
        }
    }

    public h2<Object, q2> c() {
        return this.f28101a;
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
        return this.f28103c;
    }

    public String e() {
        return this.f28102b;
    }

    public boolean f() {
        return (this.f28102b == null || this.f28103c == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        String str = t3.f28204a;
        t3.m(str, "PREFS_OS_SMS_ID_LAST", this.f28102b);
        t3.m(str, "PREFS_OS_SMS_NUMBER_LAST", this.f28103c);
    }

    /* access modifiers changed from: package-private */
    public void i(String str) {
        boolean z10 = !str.equals(this.f28103c);
        this.f28103c = str;
        if (z10) {
            this.f28101a.c(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void j(String str) {
        boolean z10 = true;
        if (str != null ? str.equals(this.f28102b) : this.f28102b == null) {
            z10 = false;
        }
        this.f28102b = str;
        if (z10) {
            this.f28101a.c(this);
        }
    }

    public JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f28102b;
            if (str != null) {
                jSONObject.put("smsUserId", str);
            } else {
                jSONObject.put("smsUserId", JSONObject.NULL);
            }
            String str2 = this.f28103c;
            if (str2 != null) {
                jSONObject.put("smsNumber", str2);
            } else {
                jSONObject.put("smsNumber", JSONObject.NULL);
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
