package pe;

/* compiled from: JobSupport.kt */
final class l1 implements x1 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f37351a;

    public l1(boolean z10) {
        this.f37351a = z10;
    }

    public p2 b() {
        return null;
    }

    public boolean isActive() {
        return this.f37351a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(isActive() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
