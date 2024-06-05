package n2;

/* compiled from: RendererConfiguration */
public final class s3 {

    /* renamed from: b  reason: collision with root package name */
    public static final s3 f20722b = new s3(false);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f20723a;

    public s3(boolean z10) {
        this.f20723a = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s3.class == obj.getClass() && this.f20723a == ((s3) obj).f20723a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f20723a ^ true ? 1 : 0;
    }
}
