package hd;

/* compiled from: Settings */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private int f33061a;

    /* renamed from: b  reason: collision with root package name */
    private int f33062b;

    /* renamed from: c  reason: collision with root package name */
    private int f33063c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f33064d = new int[10];

    public int a(int i10) {
        return this.f33064d[i10];
    }

    /* access modifiers changed from: package-private */
    public int b() {
        if ((this.f33061a & 2) != 0) {
            return this.f33064d[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int c(int i10) {
        return (this.f33061a & 32) != 0 ? this.f33064d[5] : i10;
    }

    public boolean d(int i10) {
        return ((1 << i10) & this.f33061a) != 0;
    }

    public i e(int i10, int i11, int i12) {
        int[] iArr = this.f33064d;
        if (i10 >= iArr.length) {
            return this;
        }
        int i13 = 1 << i10;
        this.f33061a |= i13;
        if ((i11 & 1) != 0) {
            this.f33062b |= i13;
        } else {
            this.f33062b &= ~i13;
        }
        if ((i11 & 2) != 0) {
            this.f33063c |= i13;
        } else {
            this.f33063c &= ~i13;
        }
        iArr[i10] = i12;
        return this;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return Integer.bitCount(this.f33061a);
    }
}
