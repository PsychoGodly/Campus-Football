package e7;

/* compiled from: Dependency */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final f0<?> f28789a;

    /* renamed from: b  reason: collision with root package name */
    private final int f28790b;

    /* renamed from: c  reason: collision with root package name */
    private final int f28791c;

    private r(Class<?> cls, int i10, int i11) {
        this(f0.b(cls), i10, i11);
    }

    public static r a(Class<?> cls) {
        return new r(cls, 0, 2);
    }

    private static String b(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    @Deprecated
    public static r h(Class<?> cls) {
        return new r(cls, 0, 0);
    }

    public static r i(Class<?> cls) {
        return new r(cls, 0, 1);
    }

    public static r j(f0<?> f0Var) {
        return new r(f0Var, 1, 0);
    }

    public static r k(Class<?> cls) {
        return new r(cls, 1, 0);
    }

    public static r l(Class<?> cls) {
        return new r(cls, 1, 1);
    }

    public static r m(Class<?> cls) {
        return new r(cls, 2, 0);
    }

    public f0<?> c() {
        return this.f28789a;
    }

    public boolean d() {
        return this.f28791c == 2;
    }

    public boolean e() {
        return this.f28791c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f28789a.equals(rVar.f28789a) && this.f28790b == rVar.f28790b && this.f28791c == rVar.f28791c) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.f28790b == 1;
    }

    public boolean g() {
        return this.f28790b == 2;
    }

    public int hashCode() {
        return ((((this.f28789a.hashCode() ^ 1000003) * 1000003) ^ this.f28790b) * 1000003) ^ this.f28791c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f28789a);
        sb2.append(", type=");
        int i10 = this.f28790b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(b(this.f28791c));
        sb2.append("}");
        return sb2.toString();
    }

    private r(f0<?> f0Var, int i10, int i11) {
        this.f28789a = (f0) e0.c(f0Var, "Null dependency anInterface.");
        this.f28790b = i10;
        this.f28791c = i11;
    }
}
