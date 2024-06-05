package com.google.firebase.firestore;

import java.util.Objects;
import y7.x;

/* compiled from: FirebaseFirestoreSettings */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f26418a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f26419b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f26420c;

    /* renamed from: d  reason: collision with root package name */
    private final long f26421d;

    /* renamed from: e  reason: collision with root package name */
    private j0 f26422e;

    /* compiled from: FirebaseFirestoreSettings */
    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f26423a = "firestore.googleapis.com";
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f26424b = true;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public boolean f26425c = true;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public long f26426d = 104857600;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public j0 f26427e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f26428f = false;

        public a0 f() {
            if (this.f26424b || !this.f26423a.equals("firestore.googleapis.com")) {
                return new a0(this);
            }
            throw new IllegalStateException("You can't set the 'sslEnabled' setting unless you also set a non-default 'host'.");
        }

        public b g(String str) {
            this.f26423a = (String) x.c(str, "Provided host must not be null.");
            return this;
        }

        public b h(j0 j0Var) {
            if (this.f26428f) {
                throw new IllegalStateException("Deprecated setPersistenceEnabled() or setCacheSizeBytes() is already used, remove those first.");
            } else if ((j0Var instanceof k0) || (j0Var instanceof q0)) {
                this.f26427e = j0Var;
                return this;
            } else {
                throw new IllegalArgumentException("Only MemoryCacheSettings and PersistentCacheSettings are accepted");
            }
        }

        public b i(boolean z10) {
            this.f26424b = z10;
            return this;
        }
    }

    public j0 a() {
        return this.f26422e;
    }

    @Deprecated
    public long b() {
        j0 j0Var = this.f26422e;
        if (j0Var == null) {
            return this.f26421d;
        }
        if (j0Var instanceof q0) {
            return ((q0) j0Var).a();
        }
        k0 k0Var = (k0) j0Var;
        if (k0Var.a() instanceof n0) {
            return ((n0) k0Var.a()).a();
        }
        return -1;
    }

    public String c() {
        return this.f26418a;
    }

    @Deprecated
    public boolean d() {
        j0 j0Var = this.f26422e;
        if (j0Var != null) {
            return j0Var instanceof q0;
        }
        return this.f26420c;
    }

    public boolean e() {
        return this.f26419b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f26419b == a0Var.f26419b && this.f26420c == a0Var.f26420c && this.f26421d == a0Var.f26421d && this.f26418a.equals(a0Var.f26418a)) {
            return Objects.equals(this.f26422e, a0Var.f26422e);
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f26421d;
        int hashCode = ((((((this.f26418a.hashCode() * 31) + (this.f26419b ? 1 : 0)) * 31) + (this.f26420c ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        j0 j0Var = this.f26422e;
        return hashCode + (j0Var != null ? j0Var.hashCode() : 0);
    }

    public String toString() {
        if (("FirebaseFirestoreSettings{host=" + this.f26418a + ", sslEnabled=" + this.f26419b + ", persistenceEnabled=" + this.f26420c + ", cacheSizeBytes=" + this.f26421d + ", cacheSettings=" + this.f26422e) == null) {
            return "null";
        }
        return this.f26422e.toString() + "}";
    }

    private a0(b bVar) {
        this.f26418a = bVar.f26423a;
        this.f26419b = bVar.f26424b;
        this.f26420c = bVar.f26425c;
        this.f26421d = bVar.f26426d;
        this.f26422e = bVar.f26427e;
    }
}
