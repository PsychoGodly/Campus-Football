package b2;

import java.util.Arrays;
import java.util.Objects;
import z1.b;

/* compiled from: EncodedPayload */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final b f5432a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f5433b;

    public h(b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f5432a = bVar;
        this.f5433b = bArr;
    }

    public byte[] a() {
        return this.f5433b;
    }

    public b b() {
        return this.f5432a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f5432a.equals(hVar.f5432a)) {
            return false;
        }
        return Arrays.equals(this.f5433b, hVar.f5433b);
    }

    public int hashCode() {
        return ((this.f5432a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5433b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f5432a + ", bytes=[...]}";
    }
}
