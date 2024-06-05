package p2;

/* compiled from: AuxEffectInfo */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final int f21388a;

    /* renamed from: b  reason: collision with root package name */
    public final float f21389b;

    public y(int i10, float f10) {
        this.f21388a = i10;
        this.f21389b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f21388a == yVar.f21388a && Float.compare(yVar.f21389b, this.f21389b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f21388a) * 31) + Float.floatToIntBits(this.f21389b);
    }
}
