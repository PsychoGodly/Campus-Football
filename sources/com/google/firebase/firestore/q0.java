package com.google.firebase.firestore;

/* compiled from: PersistentCacheSettings */
public final class q0 implements j0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f26521a;

    /* compiled from: PersistentCacheSettings */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private long f26522a;

        public q0 a() {
            return new q0(this.f26522a);
        }

        public b b(long j10) {
            this.f26522a = j10;
            return this;
        }

        private b() {
            this.f26522a = 104857600;
        }
    }

    public static b b() {
        return new b();
    }

    public long a() {
        return this.f26521a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q0.class == obj.getClass() && this.f26521a == ((q0) obj).f26521a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f26521a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public String toString() {
        return "PersistentCacheSettings{sizeBytes=" + this.f26521a + '}';
    }

    private q0(long j10) {
        this.f26521a = j10;
    }
}
