package n2;

import android.os.Bundle;
import k4.a;
import k4.n0;
import n2.h;
import r6.k;

/* compiled from: PercentageRating */
public final class a3 extends n3 {

    /* renamed from: d  reason: collision with root package name */
    private static final String f20129d = n0.r0(1);

    /* renamed from: f  reason: collision with root package name */
    public static final h.a<a3> f20130f = z2.f36484a;

    /* renamed from: c  reason: collision with root package name */
    private final float f20131c;

    public a3() {
        this.f20131c = -1.0f;
    }

    /* access modifiers changed from: private */
    public static a3 d(Bundle bundle) {
        boolean z10 = true;
        if (bundle.getInt(n3.f20599a, -1) != 1) {
            z10 = false;
        }
        a.a(z10);
        float f10 = bundle.getFloat(f20129d, -1.0f);
        return f10 == -1.0f ? new a3() : new a3(f10);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof a3) && this.f20131c == ((a3) obj).f20131c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return k.b(Float.valueOf(this.f20131c));
    }

    public a3(float f10) {
        a.b(f10 >= 0.0f && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f20131c = f10;
    }
}
