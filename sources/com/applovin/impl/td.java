package com.applovin.impl;

public class td {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12394a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12395b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12396c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12397d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12398e;

    protected td(td tdVar) {
        this.f12394a = tdVar.f12394a;
        this.f12395b = tdVar.f12395b;
        this.f12396c = tdVar.f12396c;
        this.f12397d = tdVar.f12397d;
        this.f12398e = tdVar.f12398e;
    }

    public td a(Object obj) {
        if (this.f12394a.equals(obj)) {
            return this;
        }
        return new td(obj, this.f12395b, this.f12396c, this.f12397d, this.f12398e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td)) {
            return false;
        }
        td tdVar = (td) obj;
        if (this.f12394a.equals(tdVar.f12394a) && this.f12395b == tdVar.f12395b && this.f12396c == tdVar.f12396c && this.f12397d == tdVar.f12397d && this.f12398e == tdVar.f12398e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.f12394a.hashCode() + 527) * 31) + this.f12395b) * 31) + this.f12396c) * 31) + ((int) this.f12397d)) * 31) + this.f12398e;
    }

    public boolean a() {
        return this.f12395b != -1;
    }

    public td(Object obj) {
        this(obj, -1);
    }

    public td(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    private td(Object obj, int i10, int i11, long j10, int i12) {
        this.f12394a = obj;
        this.f12395b = i10;
        this.f12396c = i11;
        this.f12397d = j10;
        this.f12398e = i12;
    }

    public td(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public td(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }
}
