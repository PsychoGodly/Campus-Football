package n1;

/* compiled from: NetworkState */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f20118a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f20119b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20120c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f20121d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f20118a = z10;
        this.f20119b = z11;
        this.f20120c = z12;
        this.f20121d = z13;
    }

    public boolean a() {
        return this.f20118a;
    }

    public boolean b() {
        return this.f20120c;
    }

    public boolean c() {
        return this.f20121d;
    }

    public boolean d() {
        return this.f20119b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f20118a == bVar.f20118a && this.f20119b == bVar.f20119b && this.f20120c == bVar.f20120c && this.f20121d == bVar.f20121d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f20118a;
        if (this.f20119b) {
            i10 += 16;
        }
        if (this.f20120c) {
            i10 += 256;
        }
        return this.f20121d ? i10 + 4096 : i10;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f20118a), Boolean.valueOf(this.f20119b), Boolean.valueOf(this.f20120c), Boolean.valueOf(this.f20121d)});
    }
}
