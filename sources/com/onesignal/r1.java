package com.onesignal;

import com.onesignal.k3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageRedisplayStats */
class r1 {

    /* renamed from: a  reason: collision with root package name */
    private long f28106a;

    /* renamed from: b  reason: collision with root package name */
    private int f28107b;

    /* renamed from: c  reason: collision with root package name */
    private int f28108c;

    /* renamed from: d  reason: collision with root package name */
    private long f28109d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f28110e;

    r1() {
        this.f28106a = -1;
        this.f28107b = 0;
        this.f28108c = 1;
        this.f28109d = 0;
        this.f28110e = false;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f28107b;
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return this.f28106a;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f28107b++;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        if (this.f28106a < 0) {
            return true;
        }
        long b10 = k3.N0().b() / 1000;
        long j10 = b10 - this.f28106a;
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.a(r0Var, "OSInAppMessage lastDisplayTime: " + this.f28106a + " currentTimeInSeconds: " + b10 + " diffInSeconds: " + j10 + " displayDelay: " + this.f28109d);
        if (j10 >= this.f28109d) {
            return true;
        }
        return false;
    }

    public boolean e() {
        return this.f28110e;
    }

    /* access modifiers changed from: package-private */
    public void f(int i10) {
        this.f28107b = i10;
    }

    /* access modifiers changed from: package-private */
    public void g(r1 r1Var) {
        h(r1Var.b());
        f(r1Var.a());
    }

    /* access modifiers changed from: package-private */
    public void h(long j10) {
        this.f28106a = j10;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        boolean z10 = this.f28107b < this.f28108c;
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.a(r0Var, "OSInAppMessage shouldDisplayAgain: " + z10);
        return z10;
    }

    public String toString() {
        return "OSInAppMessageDisplayStats{lastDisplayTime=" + this.f28106a + ", displayQuantity=" + this.f28107b + ", displayLimit=" + this.f28108c + ", displayDelay=" + this.f28109d + '}';
    }

    r1(int i10, long j10) {
        this.f28106a = -1;
        this.f28107b = 0;
        this.f28108c = 1;
        this.f28109d = 0;
        this.f28110e = false;
        this.f28107b = i10;
        this.f28106a = j10;
    }

    r1(JSONObject jSONObject) throws JSONException {
        this.f28106a = -1;
        this.f28107b = 0;
        this.f28108c = 1;
        this.f28109d = 0;
        this.f28110e = false;
        this.f28110e = true;
        Object obj = jSONObject.get("limit");
        Object obj2 = jSONObject.get("delay");
        if (obj instanceof Integer) {
            this.f28108c = ((Integer) obj).intValue();
        }
        if (obj2 instanceof Long) {
            this.f28109d = ((Long) obj2).longValue();
        } else if (obj2 instanceof Integer) {
            this.f28109d = (long) ((Integer) obj2).intValue();
        }
    }
}
