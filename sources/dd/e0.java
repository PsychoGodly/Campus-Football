package dd;

import r6.i;
import r6.k;
import r6.o;

/* compiled from: InternalChannelz */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f32193a;

    /* renamed from: b  reason: collision with root package name */
    public final b f32194b;

    /* renamed from: c  reason: collision with root package name */
    public final long f32195c;

    /* renamed from: d  reason: collision with root package name */
    public final p0 f32196d;

    /* renamed from: e  reason: collision with root package name */
    public final p0 f32197e;

    /* compiled from: InternalChannelz */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f32198a;

        /* renamed from: b  reason: collision with root package name */
        private b f32199b;

        /* renamed from: c  reason: collision with root package name */
        private Long f32200c;

        /* renamed from: d  reason: collision with root package name */
        private p0 f32201d;

        /* renamed from: e  reason: collision with root package name */
        private p0 f32202e;

        public e0 a() {
            o.p(this.f32198a, "description");
            o.p(this.f32199b, "severity");
            o.p(this.f32200c, "timestampNanos");
            o.v(this.f32201d == null || this.f32202e == null, "at least one of channelRef and subchannelRef must be null");
            return new e0(this.f32198a, this.f32199b, this.f32200c.longValue(), this.f32201d, this.f32202e);
        }

        public a b(String str) {
            this.f32198a = str;
            return this;
        }

        public a c(b bVar) {
            this.f32199b = bVar;
            return this;
        }

        public a d(p0 p0Var) {
            this.f32202e = p0Var;
            return this;
        }

        public a e(long j10) {
            this.f32200c = Long.valueOf(j10);
            return this;
        }
    }

    /* compiled from: InternalChannelz */
    public enum b {
        CT_UNKNOWN,
        CT_INFO,
        CT_WARNING,
        CT_ERROR
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (!k.a(this.f32193a, e0Var.f32193a) || !k.a(this.f32194b, e0Var.f32194b) || this.f32195c != e0Var.f32195c || !k.a(this.f32196d, e0Var.f32196d) || !k.a(this.f32197e, e0Var.f32197e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return k.b(this.f32193a, this.f32194b, Long.valueOf(this.f32195c), this.f32196d, this.f32197e);
    }

    public String toString() {
        return i.c(this).d("description", this.f32193a).d("severity", this.f32194b).c("timestampNanos", this.f32195c).d("channelRef", this.f32196d).d("subchannelRef", this.f32197e).toString();
    }

    private e0(String str, b bVar, long j10, p0 p0Var, p0 p0Var2) {
        this.f32193a = str;
        this.f32194b = (b) o.p(bVar, "severity");
        this.f32195c = j10;
        this.f32196d = p0Var;
        this.f32197e = p0Var2;
    }
}
