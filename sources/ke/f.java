package ke;

import kotlin.jvm.internal.h;

/* compiled from: PrimitiveRanges.kt */
public final class f extends d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f36023f = new a((h) null);

    /* renamed from: g  reason: collision with root package name */
    private static final f f36024g = new f(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public f(long j10, long j11) {
        super(j10, j11, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (!(b() == fVar.b() && e() == fVar.e())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean g(long j10) {
        return b() <= j10 && j10 <= e();
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (b() ^ (b() >>> 32))) + (e() ^ (e() >>> 32)));
    }

    public boolean isEmpty() {
        return b() > e();
    }

    public String toString() {
        return b() + ".." + e();
    }
}
