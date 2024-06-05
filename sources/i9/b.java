package i9;

/* compiled from: DataCharacter */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f29003a;

    /* renamed from: b  reason: collision with root package name */
    private final int f29004b;

    public b(int i10, int i11) {
        this.f29003a = i10;
        this.f29004b = i11;
    }

    public final int a() {
        return this.f29004b;
    }

    public final int b() {
        return this.f29003a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f29003a == bVar.f29003a && this.f29004b == bVar.f29004b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29003a ^ this.f29004b;
    }

    public final String toString() {
        return this.f29003a + "(" + this.f29004b + ')';
    }
}
