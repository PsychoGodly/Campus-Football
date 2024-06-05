package s7;

import java.util.Arrays;
import java.util.Objects;
import u7.l;

/* compiled from: AutoValue_IndexEntry */
final class a extends e {

    /* renamed from: a  reason: collision with root package name */
    private final int f30290a;

    /* renamed from: b  reason: collision with root package name */
    private final l f30291b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f30292c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f30293d;

    a(int i10, l lVar, byte[] bArr, byte[] bArr2) {
        this.f30290a = i10;
        Objects.requireNonNull(lVar, "Null documentKey");
        this.f30291b = lVar;
        Objects.requireNonNull(bArr, "Null arrayValue");
        this.f30292c = bArr;
        Objects.requireNonNull(bArr2, "Null directionalValue");
        this.f30293d = bArr2;
    }

    public byte[] d() {
        return this.f30292c;
    }

    public byte[] e() {
        return this.f30293d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f30290a == eVar.g() && this.f30291b.equals(eVar.f())) {
            boolean z10 = eVar instanceof a;
            if (Arrays.equals(this.f30292c, z10 ? ((a) eVar).f30292c : eVar.d())) {
                if (Arrays.equals(this.f30293d, z10 ? ((a) eVar).f30293d : eVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    public l f() {
        return this.f30291b;
    }

    public int g() {
        return this.f30290a;
    }

    public int hashCode() {
        return ((((((this.f30290a ^ 1000003) * 1000003) ^ this.f30291b.hashCode()) * 1000003) ^ Arrays.hashCode(this.f30292c)) * 1000003) ^ Arrays.hashCode(this.f30293d);
    }

    public String toString() {
        return "IndexEntry{indexId=" + this.f30290a + ", documentKey=" + this.f30291b + ", arrayValue=" + Arrays.toString(this.f30292c) + ", directionalValue=" + Arrays.toString(this.f30293d) + "}";
    }
}
