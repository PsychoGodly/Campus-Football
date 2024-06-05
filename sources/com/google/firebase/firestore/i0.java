package com.google.firebase.firestore;

import q7.e;

/* compiled from: LoadBundleTaskProgress */
public final class i0 {

    /* renamed from: g  reason: collision with root package name */
    static final i0 f26481g = new i0(0, 0, 0, 0, (Exception) null, a.SUCCESS);

    /* renamed from: a  reason: collision with root package name */
    private final int f26482a;

    /* renamed from: b  reason: collision with root package name */
    private final int f26483b;

    /* renamed from: c  reason: collision with root package name */
    private final long f26484c;

    /* renamed from: d  reason: collision with root package name */
    private final long f26485d;

    /* renamed from: e  reason: collision with root package name */
    private final a f26486e;

    /* renamed from: f  reason: collision with root package name */
    private final Exception f26487f;

    /* compiled from: LoadBundleTaskProgress */
    public enum a {
        ERROR,
        RUNNING,
        SUCCESS
    }

    public i0(int i10, int i11, long j10, long j11, Exception exc, a aVar) {
        this.f26482a = i10;
        this.f26483b = i11;
        this.f26484c = j10;
        this.f26485d = j11;
        this.f26486e = aVar;
        this.f26487f = exc;
    }

    public static i0 a(e eVar) {
        return new i0(0, eVar.e(), 0, eVar.d(), (Exception) null, a.RUNNING);
    }

    public static i0 b(e eVar) {
        return new i0(eVar.e(), eVar.e(), eVar.d(), eVar.d(), (Exception) null, a.SUCCESS);
    }

    public long c() {
        return this.f26484c;
    }

    public int d() {
        return this.f26482a;
    }

    public a e() {
        return this.f26486e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i0.class != obj.getClass()) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (this.f26482a != i0Var.f26482a || this.f26483b != i0Var.f26483b || this.f26484c != i0Var.f26484c || this.f26485d != i0Var.f26485d || this.f26486e != i0Var.f26486e) {
            return false;
        }
        Exception exc = this.f26487f;
        Exception exc2 = i0Var.f26487f;
        if (exc != null) {
            return exc.equals(exc2);
        }
        if (exc2 == null) {
            return true;
        }
        return false;
    }

    public long f() {
        return this.f26485d;
    }

    public int g() {
        return this.f26483b;
    }

    public int hashCode() {
        long j10 = this.f26484c;
        long j11 = this.f26485d;
        int hashCode = ((((((((this.f26482a * 31) + this.f26483b) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f26486e.hashCode()) * 31;
        Exception exc = this.f26487f;
        return hashCode + (exc != null ? exc.hashCode() : 0);
    }
}
