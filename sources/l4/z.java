package l4;

import android.os.Bundle;
import k4.n0;
import n2.h;

/* compiled from: VideoSize */
public final class z implements h {

    /* renamed from: f  reason: collision with root package name */
    public static final z f19998f = new z(0, 0);

    /* renamed from: g  reason: collision with root package name */
    private static final String f19999g = n0.r0(0);

    /* renamed from: h  reason: collision with root package name */
    private static final String f20000h = n0.r0(1);

    /* renamed from: i  reason: collision with root package name */
    private static final String f20001i = n0.r0(2);

    /* renamed from: j  reason: collision with root package name */
    private static final String f20002j = n0.r0(3);

    /* renamed from: k  reason: collision with root package name */
    public static final h.a<z> f20003k = y.f36087a;

    /* renamed from: a  reason: collision with root package name */
    public final int f20004a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20005b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20006c;

    /* renamed from: d  reason: collision with root package name */
    public final float f20007d;

    public z(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ z b(Bundle bundle) {
        return new z(bundle.getInt(f19999g, 0), bundle.getInt(f20000h, 0), bundle.getInt(f20001i, 0), bundle.getFloat(f20002j, 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f20004a == zVar.f20004a && this.f20005b == zVar.f20005b && this.f20006c == zVar.f20006c && this.f20007d == zVar.f20007d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((217 + this.f20004a) * 31) + this.f20005b) * 31) + this.f20006c) * 31) + Float.floatToRawIntBits(this.f20007d);
    }

    public z(int i10, int i11, int i12, float f10) {
        this.f20004a = i10;
        this.f20005b = i11;
        this.f20006c = i12;
        this.f20007d = f10;
    }
}
