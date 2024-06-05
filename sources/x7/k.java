package x7;

import x7.w0;

/* compiled from: AutoValue_TestingHooks_ExistenceFilterBloomFilterInfo */
final class k extends w0.a {

    /* renamed from: a  reason: collision with root package name */
    private final m f31059a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f31060b;

    /* renamed from: c  reason: collision with root package name */
    private final int f31061c;

    /* renamed from: d  reason: collision with root package name */
    private final int f31062d;

    /* renamed from: e  reason: collision with root package name */
    private final int f31063e;

    k(m mVar, boolean z10, int i10, int i11, int i12) {
        this.f31059a = mVar;
        this.f31060b = z10;
        this.f31061c = i10;
        this.f31062d = i11;
        this.f31063e = i12;
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f31060b;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f31062d;
    }

    /* access modifiers changed from: package-private */
    public m c() {
        return this.f31059a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0.a)) {
            return false;
        }
        w0.a aVar = (w0.a) obj;
        m mVar = this.f31059a;
        if (mVar != null ? mVar.equals(aVar.c()) : aVar.c() == null) {
            if (this.f31060b == aVar.a() && this.f31061c == aVar.f() && this.f31062d == aVar.b() && this.f31063e == aVar.g()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f31061c;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f31063e;
    }

    public int hashCode() {
        m mVar = this.f31059a;
        return (((((((((mVar == null ? 0 : mVar.hashCode()) ^ 1000003) * 1000003) ^ (this.f31060b ? 1231 : 1237)) * 1000003) ^ this.f31061c) * 1000003) ^ this.f31062d) * 1000003) ^ this.f31063e;
    }

    public String toString() {
        return "ExistenceFilterBloomFilterInfo{bloomFilter=" + this.f31059a + ", applied=" + this.f31060b + ", hashCount=" + this.f31061c + ", bitmapLength=" + this.f31062d + ", padding=" + this.f31063e + "}";
    }
}
