package r1;

/* compiled from: SystemIdInfo */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f21903a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21904b;

    public g(String str, int i10) {
        this.f21903a = str;
        this.f21904b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f21904b != gVar.f21904b) {
            return false;
        }
        return this.f21903a.equals(gVar.f21903a);
    }

    public int hashCode() {
        return (this.f21903a.hashCode() * 31) + this.f21904b;
    }
}
