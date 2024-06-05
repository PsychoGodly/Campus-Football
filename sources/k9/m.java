package k9;

/* compiled from: CurrentParsingState */
final class m {

    /* renamed from: a  reason: collision with root package name */
    private int f29154a = 0;

    /* renamed from: b  reason: collision with root package name */
    private a f29155b = a.NUMERIC;

    /* compiled from: CurrentParsingState */
    private enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    m() {
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f29154a;
    }

    /* access modifiers changed from: package-private */
    public void b(int i10) {
        this.f29154a += i10;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f29155b == a.ALPHA;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f29155b == a.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f29155b = a.ALPHA;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f29155b = a.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.f29155b = a.NUMERIC;
    }

    /* access modifiers changed from: package-private */
    public void h(int i10) {
        this.f29154a = i10;
    }
}
