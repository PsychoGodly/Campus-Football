package s2;

import com.applovin.mediation.MaxReward;

/* compiled from: SeekMap */
public interface b0 {

    /* compiled from: SeekMap */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final c0 f22379a;

        /* renamed from: b  reason: collision with root package name */
        public final c0 f22380b;

        public a(c0 c0Var) {
            this(c0Var, c0Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f22379a.equals(aVar.f22379a) || !this.f22380b.equals(aVar.f22380b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f22379a.hashCode() * 31) + this.f22380b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f22379a);
            if (this.f22379a.equals(this.f22380b)) {
                str = MaxReward.DEFAULT_LABEL;
            } else {
                str = ", " + this.f22380b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }

        public a(c0 c0Var, c0 c0Var2) {
            this.f22379a = (c0) k4.a.e(c0Var);
            this.f22380b = (c0) k4.a.e(c0Var2);
        }
    }

    /* compiled from: SeekMap */
    public static class b implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final long f22381a;

        /* renamed from: b  reason: collision with root package name */
        private final a f22382b;

        public b(long j10) {
            this(j10, 0);
        }

        public boolean f() {
            return false;
        }

        public a h(long j10) {
            return this.f22382b;
        }

        public long i() {
            return this.f22381a;
        }

        public b(long j10, long j11) {
            this.f22381a = j10;
            this.f22382b = new a(j11 == 0 ? c0.f22383c : new c0(0, j11));
        }
    }

    boolean f();

    a h(long j10);

    long i();
}
