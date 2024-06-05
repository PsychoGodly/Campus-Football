package k4;

import android.util.SparseBooleanArray;

/* compiled from: FlagSet */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final SparseBooleanArray f19732a;

    /* compiled from: FlagSet */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final SparseBooleanArray f19733a = new SparseBooleanArray();

        /* renamed from: b  reason: collision with root package name */
        private boolean f19734b;

        public b a(int i10) {
            a.f(!this.f19734b);
            this.f19733a.append(i10, true);
            return this;
        }

        public b b(l lVar) {
            for (int i10 = 0; i10 < lVar.c(); i10++) {
                a(lVar.b(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int a10 : iArr) {
                a(a10);
            }
            return this;
        }

        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public l e() {
            a.f(!this.f19734b);
            this.f19734b = true;
            return new l(this.f19733a);
        }
    }

    public boolean a(int i10) {
        return this.f19732a.get(i10);
    }

    public int b(int i10) {
        a.c(i10, 0, c());
        return this.f19732a.keyAt(i10);
    }

    public int c() {
        return this.f19732a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (n0.f19738a >= 24) {
            return this.f19732a.equals(lVar.f19732a);
        }
        if (c() != lVar.c()) {
            return false;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            if (b(i10) != lVar.b(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (n0.f19738a >= 24) {
            return this.f19732a.hashCode();
        }
        int c10 = c();
        for (int i10 = 0; i10 < c(); i10++) {
            c10 = (c10 * 31) + b(i10);
        }
        return c10;
    }

    private l(SparseBooleanArray sparseBooleanArray) {
        this.f19732a = sparseBooleanArray;
    }
}
