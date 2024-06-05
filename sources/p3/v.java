package p3;

/* compiled from: MediaPeriodId */
public class v {

    /* renamed from: a  reason: collision with root package name */
    public final Object f21677a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21678b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21679c;

    /* renamed from: d  reason: collision with root package name */
    public final long f21680d;

    /* renamed from: e  reason: collision with root package name */
    public final int f21681e;

    public v(Object obj) {
        this(obj, -1);
    }

    public v a(Object obj) {
        if (this.f21677a.equals(obj)) {
            return this;
        }
        return new v(obj, this.f21678b, this.f21679c, this.f21680d, this.f21681e);
    }

    public boolean b() {
        return this.f21678b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f21677a.equals(vVar.f21677a) && this.f21678b == vVar.f21678b && this.f21679c == vVar.f21679c && this.f21680d == vVar.f21680d && this.f21681e == vVar.f21681e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f21677a.hashCode()) * 31) + this.f21678b) * 31) + this.f21679c) * 31) + ((int) this.f21680d)) * 31) + this.f21681e;
    }

    public v(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public v(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public v(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    protected v(v vVar) {
        this.f21677a = vVar.f21677a;
        this.f21678b = vVar.f21678b;
        this.f21679c = vVar.f21679c;
        this.f21680d = vVar.f21680d;
        this.f21681e = vVar.f21681e;
    }

    private v(Object obj, int i10, int i11, long j10, int i12) {
        this.f21677a = obj;
        this.f21678b = i10;
        this.f21679c = i11;
        this.f21680d = j10;
        this.f21681e = i12;
    }
}
