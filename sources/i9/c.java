package i9;

import v8.p;

/* compiled from: FinderPattern */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f29005a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f29006b;

    /* renamed from: c  reason: collision with root package name */
    private final p[] f29007c;

    public c(int i10, int[] iArr, int i11, int i12, int i13) {
        this.f29005a = i10;
        this.f29006b = iArr;
        float f10 = (float) i13;
        this.f29007c = new p[]{new p((float) i11, f10), new p((float) i12, f10)};
    }

    public p[] a() {
        return this.f29007c;
    }

    public int[] b() {
        return this.f29006b;
    }

    public int c() {
        return this.f29005a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof c) && this.f29005a == ((c) obj).f29005a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f29005a;
    }
}
