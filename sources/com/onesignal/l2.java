package com.onesignal;

import org.json.JSONObject;

/* compiled from: OSPermissionState */
public class l2 implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private h2<Object, l2> f28035a = new h2<>("changed", false);

    /* renamed from: b  reason: collision with root package name */
    private boolean f28036b;

    l2(boolean z10) {
        if (z10) {
            this.f28036b = t3.b(t3.f28204a, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", false);
        } else {
            e();
        }
    }

    private void f(boolean z10) {
        boolean z11 = this.f28036b != z10;
        this.f28036b = z10;
        if (z11) {
            this.f28035a.c(this);
        }
    }

    public boolean a() {
        return this.f28036b;
    }

    /* access modifiers changed from: package-private */
    public boolean b(l2 l2Var) {
        return this.f28036b != l2Var.f28036b;
    }

    public h2<Object, l2> c() {
        return this.f28035a;
    }

    /* access modifiers changed from: protected */
    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        t3.j(t3.f28204a, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", this.f28036b);
    }

    /* access modifiers changed from: package-private */
    public void e() {
        f(OSUtils.a(k3.f27912f));
    }

    public JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("areNotificationsEnabled", this.f28036b);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return g().toString();
    }
}
