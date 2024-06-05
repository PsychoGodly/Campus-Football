package n9;

/* compiled from: ModulusGF */
public final class b {

    /* renamed from: f  reason: collision with root package name */
    public static final b f29471f = new b(929, 3);

    /* renamed from: a  reason: collision with root package name */
    private final int[] f29472a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f29473b;

    /* renamed from: c  reason: collision with root package name */
    private final c f29474c;

    /* renamed from: d  reason: collision with root package name */
    private final c f29475d;

    /* renamed from: e  reason: collision with root package name */
    private final int f29476e;

    private b(int i10, int i11) {
        this.f29476e = i10;
        this.f29472a = new int[i10];
        this.f29473b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f29472a[i13] = i12;
            i12 = (i12 * i11) % i10;
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f29473b[this.f29472a[i14]] = i14;
        }
        this.f29474c = new c(this, new int[]{0});
        this.f29475d = new c(this, new int[]{1});
    }

    /* access modifiers changed from: package-private */
    public int a(int i10, int i11) {
        return (i10 + i11) % this.f29476e;
    }

    /* access modifiers changed from: package-private */
    public c b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        } else if (i11 == 0) {
            return this.f29474c;
        } else {
            int[] iArr = new int[(i10 + 1)];
            iArr[0] = i11;
            return new c(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    public int c(int i10) {
        return this.f29472a[i10];
    }

    /* access modifiers changed from: package-private */
    public c d() {
        return this.f29475d;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f29476e;
    }

    /* access modifiers changed from: package-private */
    public c f() {
        return this.f29474c;
    }

    /* access modifiers changed from: package-private */
    public int g(int i10) {
        if (i10 != 0) {
            return this.f29472a[(this.f29476e - this.f29473b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    public int h(int i10) {
        if (i10 != 0) {
            return this.f29473b[i10];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public int i(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f29472a;
        int[] iArr2 = this.f29473b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f29476e - 1)];
    }

    /* access modifiers changed from: package-private */
    public int j(int i10, int i11) {
        int i12 = this.f29476e;
        return ((i10 + i12) - i11) % i12;
    }
}
