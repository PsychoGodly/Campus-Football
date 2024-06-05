package k4;

/* compiled from: Size */
public final class d0 {

    /* renamed from: c  reason: collision with root package name */
    public static final d0 f19685c = new d0(-1, -1);

    /* renamed from: d  reason: collision with root package name */
    public static final d0 f19686d = new d0(0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final int f19687a;

    /* renamed from: b  reason: collision with root package name */
    private final int f19688b;

    public d0(int i10, int i11) {
        a.a((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f19687a = i10;
        this.f19688b = i11;
    }

    public int a() {
        return this.f19688b;
    }

    public int b() {
        return this.f19687a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f19687a == d0Var.f19687a && this.f19688b == d0Var.f19688b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f19688b;
        int i11 = this.f19687a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f19687a + "x" + this.f19688b;
    }
}
