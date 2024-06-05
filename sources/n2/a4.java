package n2;

import android.os.Bundle;
import k4.a;
import k4.n0;
import n2.h;
import r6.k;

/* compiled from: ThumbRating */
public final class a4 extends n3 {

    /* renamed from: f  reason: collision with root package name */
    private static final String f20132f = n0.r0(1);

    /* renamed from: g  reason: collision with root package name */
    private static final String f20133g = n0.r0(2);

    /* renamed from: h  reason: collision with root package name */
    public static final h.a<a4> f20134h = z3.f36485a;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f20135c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f20136d;

    public a4() {
        this.f20135c = false;
        this.f20136d = false;
    }

    /* access modifiers changed from: private */
    public static a4 d(Bundle bundle) {
        a.a(bundle.getInt(n3.f20599a, -1) == 3);
        if (bundle.getBoolean(f20132f, false)) {
            return new a4(bundle.getBoolean(f20133g, false));
        }
        return new a4();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        if (this.f20136d == a4Var.f20136d && this.f20135c == a4Var.f20135c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return k.b(Boolean.valueOf(this.f20135c), Boolean.valueOf(this.f20136d));
    }

    public a4(boolean z10) {
        this.f20135c = true;
        this.f20136d = z10;
    }
}
