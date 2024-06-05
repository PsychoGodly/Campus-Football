package a2;

import a2.k;

/* compiled from: AutoValue_ClientInfo */
final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    private final k.b f94a;

    /* renamed from: b  reason: collision with root package name */
    private final a f95b;

    /* compiled from: AutoValue_ClientInfo */
    static final class b extends k.a {

        /* renamed from: a  reason: collision with root package name */
        private k.b f96a;

        /* renamed from: b  reason: collision with root package name */
        private a f97b;

        b() {
        }

        public k a() {
            return new e(this.f96a, this.f97b);
        }

        public k.a b(a aVar) {
            this.f97b = aVar;
            return this;
        }

        public k.a c(k.b bVar) {
            this.f96a = bVar;
            return this;
        }
    }

    public a b() {
        return this.f95b;
    }

    public k.b c() {
        return this.f94a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.b bVar = this.f94a;
        if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
            a aVar = this.f95b;
            if (aVar == null) {
                if (kVar.b() == null) {
                    return true;
                }
            } else if (aVar.equals(kVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f94a;
        int i10 = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        a aVar = this.f95b;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f94a + ", androidClientInfo=" + this.f95b + "}";
    }

    private e(k.b bVar, a aVar) {
        this.f94a = bVar;
        this.f95b = aVar;
    }
}
