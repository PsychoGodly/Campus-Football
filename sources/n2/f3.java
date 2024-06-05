package n2;

import android.os.Bundle;
import k4.a;
import k4.n0;
import n2.h;

/* compiled from: PlaybackParameters */
public final class f3 implements h {

    /* renamed from: d  reason: collision with root package name */
    public static final f3 f20380d = new f3(1.0f);

    /* renamed from: f  reason: collision with root package name */
    private static final String f20381f = n0.r0(0);

    /* renamed from: g  reason: collision with root package name */
    private static final String f20382g = n0.r0(1);

    /* renamed from: h  reason: collision with root package name */
    public static final h.a<f3> f20383h = e3.f36385a;

    /* renamed from: a  reason: collision with root package name */
    public final float f20384a;

    /* renamed from: b  reason: collision with root package name */
    public final float f20385b;

    /* renamed from: c  reason: collision with root package name */
    private final int f20386c;

    public f3(float f10) {
        this(f10, 1.0f);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ f3 c(Bundle bundle) {
        return new f3(bundle.getFloat(f20381f, 1.0f), bundle.getFloat(f20382g, 1.0f));
    }

    public long b(long j10) {
        return j10 * ((long) this.f20386c);
    }

    public f3 d(float f10) {
        return new f3(f10, this.f20385b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f3.class != obj.getClass()) {
            return false;
        }
        f3 f3Var = (f3) obj;
        if (this.f20384a == f3Var.f20384a && this.f20385b == f3Var.f20385b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f20384a)) * 31) + Float.floatToRawIntBits(this.f20385b);
    }

    public String toString() {
        return n0.C("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f20384a), Float.valueOf(this.f20385b));
    }

    public f3(float f10, float f11) {
        boolean z10 = true;
        a.a(f10 > 0.0f);
        a.a(f11 <= 0.0f ? false : z10);
        this.f20384a = f10;
        this.f20385b = f11;
        this.f20386c = Math.round(f10 * 1000.0f);
    }
}
