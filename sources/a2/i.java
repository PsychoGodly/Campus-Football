package a2;

import a2.o;

/* compiled from: AutoValue_NetworkConnectionInfo */
final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    private final o.c f127a;

    /* renamed from: b  reason: collision with root package name */
    private final o.b f128b;

    /* compiled from: AutoValue_NetworkConnectionInfo */
    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private o.c f129a;

        /* renamed from: b  reason: collision with root package name */
        private o.b f130b;

        b() {
        }

        public o a() {
            return new i(this.f129a, this.f130b);
        }

        public o.a b(o.b bVar) {
            this.f130b = bVar;
            return this;
        }

        public o.a c(o.c cVar) {
            this.f129a = cVar;
            return this;
        }
    }

    public o.b b() {
        return this.f128b;
    }

    public o.c c() {
        return this.f127a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.c cVar = this.f127a;
        if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
            o.b bVar = this.f128b;
            if (bVar == null) {
                if (oVar.b() == null) {
                    return true;
                }
            } else if (bVar.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f127a;
        int i10 = 0;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f128b;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f127a + ", mobileSubtype=" + this.f128b + "}";
    }

    private i(o.c cVar, o.b bVar) {
        this.f127a = cVar;
        this.f128b = bVar;
    }
}
