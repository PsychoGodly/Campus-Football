package b2;

import b2.n;
import com.applovin.mediation.MaxReward;
import java.util.Objects;
import z1.e;

/* compiled from: AutoValue_SendRequest */
final class c extends n {

    /* renamed from: a  reason: collision with root package name */
    private final o f5402a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5403b;

    /* renamed from: c  reason: collision with root package name */
    private final z1.c<?> f5404c;

    /* renamed from: d  reason: collision with root package name */
    private final e<?, byte[]> f5405d;

    /* renamed from: e  reason: collision with root package name */
    private final z1.b f5406e;

    /* compiled from: AutoValue_SendRequest */
    static final class b extends n.a {

        /* renamed from: a  reason: collision with root package name */
        private o f5407a;

        /* renamed from: b  reason: collision with root package name */
        private String f5408b;

        /* renamed from: c  reason: collision with root package name */
        private z1.c<?> f5409c;

        /* renamed from: d  reason: collision with root package name */
        private e<?, byte[]> f5410d;

        /* renamed from: e  reason: collision with root package name */
        private z1.b f5411e;

        b() {
        }

        public n a() {
            o oVar = this.f5407a;
            String str = MaxReward.DEFAULT_LABEL;
            if (oVar == null) {
                str = str + " transportContext";
            }
            if (this.f5408b == null) {
                str = str + " transportName";
            }
            if (this.f5409c == null) {
                str = str + " event";
            }
            if (this.f5410d == null) {
                str = str + " transformer";
            }
            if (this.f5411e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f5407a, this.f5408b, this.f5409c, this.f5410d, this.f5411e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public n.a b(z1.b bVar) {
            Objects.requireNonNull(bVar, "Null encoding");
            this.f5411e = bVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public n.a c(z1.c<?> cVar) {
            Objects.requireNonNull(cVar, "Null event");
            this.f5409c = cVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public n.a d(e<?, byte[]> eVar) {
            Objects.requireNonNull(eVar, "Null transformer");
            this.f5410d = eVar;
            return this;
        }

        public n.a e(o oVar) {
            Objects.requireNonNull(oVar, "Null transportContext");
            this.f5407a = oVar;
            return this;
        }

        public n.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f5408b = str;
            return this;
        }
    }

    public z1.b b() {
        return this.f5406e;
    }

    /* access modifiers changed from: package-private */
    public z1.c<?> c() {
        return this.f5404c;
    }

    /* access modifiers changed from: package-private */
    public e<?, byte[]> e() {
        return this.f5405d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f5402a.equals(nVar.f()) || !this.f5403b.equals(nVar.g()) || !this.f5404c.equals(nVar.c()) || !this.f5405d.equals(nVar.e()) || !this.f5406e.equals(nVar.b())) {
            return false;
        }
        return true;
    }

    public o f() {
        return this.f5402a;
    }

    public String g() {
        return this.f5403b;
    }

    public int hashCode() {
        return ((((((((this.f5402a.hashCode() ^ 1000003) * 1000003) ^ this.f5403b.hashCode()) * 1000003) ^ this.f5404c.hashCode()) * 1000003) ^ this.f5405d.hashCode()) * 1000003) ^ this.f5406e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f5402a + ", transportName=" + this.f5403b + ", event=" + this.f5404c + ", transformer=" + this.f5405d + ", encoding=" + this.f5406e + "}";
    }

    private c(o oVar, String str, z1.c<?> cVar, e<?, byte[]> eVar, z1.b bVar) {
        this.f5402a = oVar;
        this.f5403b = str;
        this.f5404c = cVar;
        this.f5405d = eVar;
        this.f5406e = bVar;
    }
}
