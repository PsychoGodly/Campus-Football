package k9;

/* compiled from: DecodedInformation */
final class o extends q {

    /* renamed from: b  reason: collision with root package name */
    private final String f29161b;

    /* renamed from: c  reason: collision with root package name */
    private final int f29162c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f29163d;

    o(int i10, String str) {
        super(i10);
        this.f29161b = str;
        this.f29163d = false;
        this.f29162c = 0;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f29161b;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f29162c;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f29163d;
    }

    o(int i10, String str, int i11) {
        super(i10);
        this.f29163d = true;
        this.f29162c = i11;
        this.f29161b = str;
    }
}
