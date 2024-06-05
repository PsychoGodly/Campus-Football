package z8;

/* compiled from: BitSource */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f31456a;

    /* renamed from: b  reason: collision with root package name */
    private int f31457b;

    /* renamed from: c  reason: collision with root package name */
    private int f31458c;

    public c(byte[] bArr) {
        this.f31456a = bArr;
    }

    public int a() {
        return ((this.f31456a.length - this.f31457b) * 8) - this.f31458c;
    }

    public int b() {
        return this.f31458c;
    }

    public int c() {
        return this.f31457b;
    }

    public int d(int i10) {
        if (i10 <= 0 || i10 > 32 || i10 > a()) {
            throw new IllegalArgumentException(String.valueOf(i10));
        }
        int i11 = this.f31458c;
        byte b10 = 0;
        if (i11 > 0) {
            int i12 = 8 - i11;
            int i13 = i10 < i12 ? i10 : i12;
            int i14 = i12 - i13;
            byte[] bArr = this.f31456a;
            int i15 = this.f31457b;
            int i16 = (((255 >> (8 - i13)) << i14) & bArr[i15]) >> i14;
            i10 -= i13;
            int i17 = i11 + i13;
            this.f31458c = i17;
            if (i17 == 8) {
                this.f31458c = 0;
                this.f31457b = i15 + 1;
            }
            b10 = i16;
        }
        if (i10 <= 0) {
            return b10;
        }
        while (i10 >= 8) {
            int i18 = b10 << 8;
            byte[] bArr2 = this.f31456a;
            int i19 = this.f31457b;
            b10 = (bArr2[i19] & 255) | i18;
            this.f31457b = i19 + 1;
            i10 -= 8;
        }
        if (i10 <= 0) {
            return b10;
        }
        int i20 = 8 - i10;
        int i21 = (b10 << i10) | ((((255 >> i20) << i20) & this.f31456a[this.f31457b]) >> i20);
        this.f31458c += i10;
        return i21;
    }
}
