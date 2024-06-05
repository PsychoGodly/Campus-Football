package m9;

/* compiled from: Codeword */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private final int f29262a;

    /* renamed from: b  reason: collision with root package name */
    private final int f29263b;

    /* renamed from: c  reason: collision with root package name */
    private final int f29264c;

    /* renamed from: d  reason: collision with root package name */
    private final int f29265d;

    /* renamed from: e  reason: collision with root package name */
    private int f29266e = -1;

    d(int i10, int i11, int i12, int i13) {
        this.f29262a = i10;
        this.f29263b = i11;
        this.f29264c = i12;
        this.f29265d = i13;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f29264c;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f29263b;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f29266e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f29262a;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f29265d;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f29263b - this.f29262a;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return h(this.f29266e);
    }

    /* access modifiers changed from: package-private */
    public boolean h(int i10) {
        return i10 != -1 && this.f29264c == (i10 % 3) * 3;
    }

    /* access modifiers changed from: package-private */
    public void i(int i10) {
        this.f29266e = i10;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        this.f29266e = ((this.f29265d / 30) * 3) + (this.f29264c / 3);
    }

    public String toString() {
        return this.f29266e + "|" + this.f29265d;
    }
}
