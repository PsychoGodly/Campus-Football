package r9;

import v8.p;

/* compiled from: FinderPattern */
public final class d extends p {

    /* renamed from: c  reason: collision with root package name */
    private final float f30103c;

    /* renamed from: d  reason: collision with root package name */
    private final int f30104d;

    d(float f10, float f11, float f12) {
        this(f10, f11, f12, 1);
    }

    /* access modifiers changed from: package-private */
    public boolean f(float f10, float f11, float f12) {
        if (Math.abs(f11 - d()) > f10 || Math.abs(f12 - c()) > f10) {
            return false;
        }
        float abs = Math.abs(f10 - this.f30103c);
        if (abs <= 1.0f || abs <= this.f30103c) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public d g(float f10, float f11, float f12) {
        int i10 = this.f30104d;
        int i11 = i10 + 1;
        float c10 = (((float) i10) * c()) + f11;
        float f13 = (float) i11;
        return new d(c10 / f13, ((((float) this.f30104d) * d()) + f10) / f13, ((((float) this.f30104d) * this.f30103c) + f12) / f13, i11);
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f30104d;
    }

    public float i() {
        return this.f30103c;
    }

    private d(float f10, float f11, float f12, int i10) {
        super(f10, f11);
        this.f30103c = f12;
        this.f30104d = i10;
    }
}
