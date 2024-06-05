package com.google.firebase.firestore;

/* compiled from: MemoryLruGcSettings */
public final class n0 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    private long f26514a;

    public long a() {
        return this.f26514a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n0.class == obj.getClass() && this.f26514a == ((n0) obj).f26514a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f26514a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public String toString() {
        return "MemoryLruGcSettings{cacheSize=" + a() + "}";
    }
}
