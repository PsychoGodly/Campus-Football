package b2;

import b2.o;
import com.applovin.mediation.MaxReward;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: AutoValue_TransportContext */
final class d extends o {

    /* renamed from: a  reason: collision with root package name */
    private final String f5412a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f5413b;

    /* renamed from: c  reason: collision with root package name */
    private final z1.d f5414c;

    /* compiled from: AutoValue_TransportContext */
    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private String f5415a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f5416b;

        /* renamed from: c  reason: collision with root package name */
        private z1.d f5417c;

        b() {
        }

        public o a() {
            String str = this.f5415a;
            String str2 = MaxReward.DEFAULT_LABEL;
            if (str == null) {
                str2 = str2 + " backendName";
            }
            if (this.f5417c == null) {
                str2 = str2 + " priority";
            }
            if (str2.isEmpty()) {
                return new d(this.f5415a, this.f5416b, this.f5417c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        public o.a b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f5415a = str;
            return this;
        }

        public o.a c(byte[] bArr) {
            this.f5416b = bArr;
            return this;
        }

        public o.a d(z1.d dVar) {
            Objects.requireNonNull(dVar, "Null priority");
            this.f5417c = dVar;
            return this;
        }
    }

    public String b() {
        return this.f5412a;
    }

    public byte[] c() {
        return this.f5413b;
    }

    public z1.d d() {
        return this.f5414c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f5412a.equals(oVar.b())) {
            if (!Arrays.equals(this.f5413b, oVar instanceof d ? ((d) oVar).f5413b : oVar.c()) || !this.f5414c.equals(oVar.d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f5412a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5413b)) * 1000003) ^ this.f5414c.hashCode();
    }

    private d(String str, byte[] bArr, z1.d dVar) {
        this.f5412a = str;
        this.f5413b = bArr;
        this.f5414c = dVar;
    }
}
