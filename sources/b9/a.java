package b9;

/* compiled from: GenericGF */
public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f24274h = new a(4201, 4096, 1);

    /* renamed from: i  reason: collision with root package name */
    public static final a f24275i = new a(1033, 1024, 1);

    /* renamed from: j  reason: collision with root package name */
    public static final a f24276j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f24277k = new a(19, 16, 1);

    /* renamed from: l  reason: collision with root package name */
    public static final a f24278l = new a(285, 256, 0);

    /* renamed from: m  reason: collision with root package name */
    public static final a f24279m;

    /* renamed from: n  reason: collision with root package name */
    public static final a f24280n;

    /* renamed from: o  reason: collision with root package name */
    public static final a f24281o;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f24282a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f24283b;

    /* renamed from: c  reason: collision with root package name */
    private final b f24284c;

    /* renamed from: d  reason: collision with root package name */
    private final b f24285d;

    /* renamed from: e  reason: collision with root package name */
    private final int f24286e;

    /* renamed from: f  reason: collision with root package name */
    private final int f24287f;

    /* renamed from: g  reason: collision with root package name */
    private final int f24288g;

    static {
        a aVar = new a(67, 64, 1);
        f24276j = aVar;
        a aVar2 = new a(301, 256, 1);
        f24279m = aVar2;
        f24280n = aVar2;
        f24281o = aVar;
    }

    public a(int i10, int i11, int i12) {
        this.f24287f = i10;
        this.f24286e = i11;
        this.f24288g = i12;
        this.f24282a = new int[i11];
        this.f24283b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f24282a[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f24283b[this.f24282a[i15]] = i15;
        }
        this.f24284c = new b(this, new int[]{0});
        this.f24285d = new b(this, new int[]{1});
    }

    static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    /* access modifiers changed from: package-private */
    public b b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        } else if (i11 == 0) {
            return this.f24284c;
        } else {
            int[] iArr = new int[(i10 + 1)];
            iArr[0] = i11;
            return new b(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    public int c(int i10) {
        return this.f24282a[i10];
    }

    public int d() {
        return this.f24288g;
    }

    /* access modifiers changed from: package-private */
    public b e() {
        return this.f24285d;
    }

    public int f() {
        return this.f24286e;
    }

    /* access modifiers changed from: package-private */
    public b g() {
        return this.f24284c;
    }

    /* access modifiers changed from: package-private */
    public int h(int i10) {
        if (i10 != 0) {
            return this.f24282a[(this.f24286e - this.f24283b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    public int i(int i10) {
        if (i10 != 0) {
            return this.f24283b[i10];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public int j(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f24282a;
        int[] iArr2 = this.f24283b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f24286e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f24287f) + ',' + this.f24286e + ')';
    }
}
