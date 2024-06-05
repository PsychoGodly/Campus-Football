package x7;

import java.util.Objects;
import x7.w0;

/* compiled from: AutoValue_TestingHooks_ExistenceFilterMismatchInfo */
final class l extends w0.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f31064a;

    /* renamed from: b  reason: collision with root package name */
    private final int f31065b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31066c;

    /* renamed from: d  reason: collision with root package name */
    private final String f31067d;

    /* renamed from: e  reason: collision with root package name */
    private final w0.a f31068e;

    l(int i10, int i11, String str, String str2, w0.a aVar) {
        this.f31064a = i10;
        this.f31065b = i11;
        Objects.requireNonNull(str, "Null projectId");
        this.f31066c = str;
        Objects.requireNonNull(str2, "Null databaseId");
        this.f31067d = str2;
        this.f31068e = aVar;
    }

    /* access modifiers changed from: package-private */
    public w0.a a() {
        return this.f31068e;
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return this.f31067d;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f31065b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0.b)) {
            return false;
        }
        w0.b bVar = (w0.b) obj;
        if (this.f31064a == bVar.f() && this.f31065b == bVar.d() && this.f31066c.equals(bVar.g()) && this.f31067d.equals(bVar.c())) {
            w0.a aVar = this.f31068e;
            if (aVar == null) {
                if (bVar.a() == null) {
                    return true;
                }
            } else if (aVar.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f31064a;
    }

    /* access modifiers changed from: package-private */
    public String g() {
        return this.f31066c;
    }

    public int hashCode() {
        int hashCode = (((((((this.f31064a ^ 1000003) * 1000003) ^ this.f31065b) * 1000003) ^ this.f31066c.hashCode()) * 1000003) ^ this.f31067d.hashCode()) * 1000003;
        w0.a aVar = this.f31068e;
        return hashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "ExistenceFilterMismatchInfo{localCacheCount=" + this.f31064a + ", existenceFilterCount=" + this.f31065b + ", projectId=" + this.f31066c + ", databaseId=" + this.f31067d + ", bloomFilter=" + this.f31068e + "}";
    }
}
