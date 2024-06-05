package c2;

import b2.i;
import c2.f;
import com.applovin.mediation.MaxReward;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: AutoValue_BackendRequest */
final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Iterable<i> f5584a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f5585b;

    /* compiled from: AutoValue_BackendRequest */
    static final class b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private Iterable<i> f5586a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f5587b;

        b() {
        }

        public f a() {
            Iterable<i> iterable = this.f5586a;
            String str = MaxReward.DEFAULT_LABEL;
            if (iterable == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new a(this.f5586a, this.f5587b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f.a b(Iterable<i> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f5586a = iterable;
            return this;
        }

        public f.a c(byte[] bArr) {
            this.f5587b = bArr;
            return this;
        }
    }

    public Iterable<i> b() {
        return this.f5584a;
    }

    public byte[] c() {
        return this.f5585b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f5584a.equals(fVar.b())) {
            if (Arrays.equals(this.f5585b, fVar instanceof a ? ((a) fVar).f5585b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5584a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5585b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f5584a + ", extras=" + Arrays.toString(this.f5585b) + "}";
    }

    private a(Iterable<i> iterable, byte[] bArr) {
        this.f5584a = iterable;
        this.f5585b = bArr;
    }
}
