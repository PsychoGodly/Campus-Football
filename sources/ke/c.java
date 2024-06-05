package ke;

import kotlin.jvm.internal.h;

/* compiled from: PrimitiveRanges.kt */
public final class c extends a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f36013f = new a((h) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final c f36014g = new c(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final c a() {
            return c.f36014g;
        }
    }

    public c(int i10, int i11) {
        super(i10, i11, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(b() == cVar.b() && e() == cVar.e())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (b() * 31) + e();
    }

    public boolean isEmpty() {
        return b() > e();
    }

    public boolean m(int i10) {
        return b() <= i10 && i10 <= e();
    }

    public Integer n() {
        return Integer.valueOf(e());
    }

    public Integer o() {
        return Integer.valueOf(b());
    }

    public String toString() {
        return b() + ".." + e();
    }
}
