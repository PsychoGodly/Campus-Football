package n2;

import android.os.Bundle;
import k4.n0;
import n2.h;

/* compiled from: DeviceInfo */
public final class o implements h {

    /* renamed from: d  reason: collision with root package name */
    public static final o f20601d = new o(0, 0, 0);

    /* renamed from: f  reason: collision with root package name */
    private static final String f20602f = n0.r0(0);

    /* renamed from: g  reason: collision with root package name */
    private static final String f20603g = n0.r0(1);

    /* renamed from: h  reason: collision with root package name */
    private static final String f20604h = n0.r0(2);

    /* renamed from: i  reason: collision with root package name */
    public static final h.a<o> f20605i = n.f36420a;

    /* renamed from: a  reason: collision with root package name */
    public final int f20606a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20607b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20608c;

    public o(int i10, int i11, int i12) {
        this.f20606a = i10;
        this.f20607b = i11;
        this.f20608c = i12;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ o b(Bundle bundle) {
        return new o(bundle.getInt(f20602f, 0), bundle.getInt(f20603g, 0), bundle.getInt(f20604h, 0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f20606a == oVar.f20606a && this.f20607b == oVar.f20607b && this.f20608c == oVar.f20608c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f20606a) * 31) + this.f20607b) * 31) + this.f20608c;
    }
}
