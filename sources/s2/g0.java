package s2;

/* compiled from: VorbisBitArray */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f22417a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22418b;

    /* renamed from: c  reason: collision with root package name */
    private int f22419c;

    /* renamed from: d  reason: collision with root package name */
    private int f22420d;

    public g0(byte[] bArr) {
        this.f22417a = bArr;
        this.f22418b = bArr.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f22418b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r2 = this;
            int r0 = r2.f22419c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f22418b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f22420d
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            k4.a.f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.g0.a():void");
    }

    public int b() {
        return (this.f22419c * 8) + this.f22420d;
    }

    public boolean c() {
        boolean z10 = (((this.f22417a[this.f22419c] & 255) >> this.f22420d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f22419c;
        int min = Math.min(i10, 8 - this.f22420d);
        int i12 = i11 + 1;
        int i13 = ((this.f22417a[i11] & 255) >> this.f22420d) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (this.f22417a[i12] & 255) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & (-1 >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f22419c + i11;
        this.f22419c = i12;
        int i13 = this.f22420d + (i10 - (i11 * 8));
        this.f22420d = i13;
        if (i13 > 7) {
            this.f22419c = i12 + 1;
            this.f22420d = i13 - 8;
        }
        a();
    }
}
