package n2;

import android.os.Bundle;
import k4.n0;
import n2.h;

/* compiled from: Rating */
public abstract class n3 implements h {

    /* renamed from: a  reason: collision with root package name */
    static final String f20599a = n0.r0(0);

    /* renamed from: b  reason: collision with root package name */
    public static final h.a<n3> f20600b = m3.f36419a;

    n3() {
    }

    /* access modifiers changed from: private */
    public static n3 b(Bundle bundle) {
        int i10 = bundle.getInt(f20599a, -1);
        if (i10 == 0) {
            return u1.f20726h.a(bundle);
        }
        if (i10 == 1) {
            return a3.f20130f.a(bundle);
        }
        if (i10 == 2) {
            return w3.f20741h.a(bundle);
        }
        if (i10 == 3) {
            return a4.f20134h.a(bundle);
        }
        throw new IllegalArgumentException("Unknown RatingType: " + i10);
    }
}
