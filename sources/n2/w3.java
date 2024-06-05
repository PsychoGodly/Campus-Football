package n2;

import android.os.Bundle;
import k4.a;
import k4.n0;
import n2.h;
import r6.k;

/* compiled from: StarRating */
public final class w3 extends n3 {

    /* renamed from: f  reason: collision with root package name */
    private static final String f20739f = n0.r0(1);

    /* renamed from: g  reason: collision with root package name */
    private static final String f20740g = n0.r0(2);

    /* renamed from: h  reason: collision with root package name */
    public static final h.a<w3> f20741h = v3.f36466a;

    /* renamed from: c  reason: collision with root package name */
    private final int f20742c;

    /* renamed from: d  reason: collision with root package name */
    private final float f20743d;

    public w3(int i10) {
        a.b(i10 > 0, "maxStars must be a positive integer");
        this.f20742c = i10;
        this.f20743d = -1.0f;
    }

    /* access modifiers changed from: private */
    public static w3 d(Bundle bundle) {
        a.a(bundle.getInt(n3.f20599a, -1) == 2);
        int i10 = bundle.getInt(f20739f, 5);
        float f10 = bundle.getFloat(f20740g, -1.0f);
        if (f10 == -1.0f) {
            return new w3(i10);
        }
        return new w3(i10, f10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        if (this.f20742c == w3Var.f20742c && this.f20743d == w3Var.f20743d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return k.b(Integer.valueOf(this.f20742c), Float.valueOf(this.f20743d));
    }

    public w3(int i10, float f10) {
        boolean z10 = true;
        a.b(i10 > 0, "maxStars must be a positive integer");
        a.b((f10 < 0.0f || f10 > ((float) i10)) ? false : z10, "starRating is out of range [0, maxStars]");
        this.f20742c = i10;
        this.f20743d = f10;
    }
}
