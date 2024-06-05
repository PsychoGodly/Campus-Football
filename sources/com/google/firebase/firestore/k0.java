package com.google.firebase.firestore;

/* compiled from: MemoryCacheSettings */
public final class k0 implements j0 {

    /* renamed from: a  reason: collision with root package name */
    private m0 f26499a;

    /* compiled from: MemoryCacheSettings */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private m0 f26500a;

        public k0 a() {
            return new k0(this.f26500a);
        }

        private b() {
            this.f26500a = l0.a().a();
        }
    }

    public static b b() {
        return new b();
    }

    public m0 a() {
        return this.f26499a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        return a().equals(((k0) obj).a());
    }

    public int hashCode() {
        return this.f26499a.hashCode();
    }

    public String toString() {
        return "MemoryCacheSettings{gcSettings=" + a() + "}";
    }

    private k0(m0 m0Var) {
        this.f26499a = m0Var;
    }
}
