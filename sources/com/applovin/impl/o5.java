package com.applovin.impl;

public final class o5 {

    /* renamed from: a  reason: collision with root package name */
    public final String f10063a;

    /* renamed from: b  reason: collision with root package name */
    public final d9 f10064b;

    /* renamed from: c  reason: collision with root package name */
    public final d9 f10065c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10066d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10067e;

    public o5(String str, d9 d9Var, d9 d9Var2, int i10, int i11) {
        a1.a(i10 == 0 || i11 == 0);
        this.f10063a = a1.a(str);
        this.f10064b = (d9) a1.a((Object) d9Var);
        this.f10065c = (d9) a1.a((Object) d9Var2);
        this.f10066d = i10;
        this.f10067e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o5.class != obj.getClass()) {
            return false;
        }
        o5 o5Var = (o5) obj;
        if (this.f10066d != o5Var.f10066d || this.f10067e != o5Var.f10067e || !this.f10063a.equals(o5Var.f10063a) || !this.f10064b.equals(o5Var.f10064b) || !this.f10065c.equals(o5Var.f10065c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((this.f10066d + 527) * 31) + this.f10067e) * 31) + this.f10063a.hashCode()) * 31) + this.f10064b.hashCode()) * 31) + this.f10065c.hashCode();
    }
}
