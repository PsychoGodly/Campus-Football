package r9;

import v8.p;

/* compiled from: AlignmentPattern */
public final class a extends p {

    /* renamed from: c  reason: collision with root package name */
    private final float f30091c;

    a(float f10, float f11, float f12) {
        super(f10, f11);
        this.f30091c = f12;
    }

    /* access modifiers changed from: package-private */
    public boolean f(float f10, float f11, float f12) {
        if (Math.abs(f11 - d()) > f10 || Math.abs(f12 - c()) > f10) {
            return false;
        }
        float abs = Math.abs(f10 - this.f30091c);
        if (abs <= 1.0f || abs <= this.f30091c) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public a g(float f10, float f11, float f12) {
        return new a((c() + f11) / 2.0f, (d() + f10) / 2.0f, (this.f30091c + f12) / 2.0f);
    }
}
