package k9;

import v8.f;

/* compiled from: DecodedNumeric */
final class p extends q {

    /* renamed from: b  reason: collision with root package name */
    private final int f29164b;

    /* renamed from: c  reason: collision with root package name */
    private final int f29165c;

    p(int i10, int i11, int i12) throws f {
        super(i10);
        if (i11 < 0 || i11 > 10 || i12 < 0 || i12 > 10) {
            throw f.a();
        }
        this.f29164b = i11;
        this.f29165c = i12;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f29164b;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f29165c;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f29164b == 10;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f29165c == 10;
    }
}
