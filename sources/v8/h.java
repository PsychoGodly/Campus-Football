package v8;

/* compiled from: LuminanceSource */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private final int f30759a;

    /* renamed from: b  reason: collision with root package name */
    private final int f30760b;

    protected h(int i10, int i11) {
        this.f30759a = i10;
        this.f30760b = i11;
    }

    public final int a() {
        return this.f30760b;
    }

    public abstract byte[] b();

    public abstract byte[] c(int i10, byte[] bArr);

    public final int d() {
        return this.f30759a;
    }

    public h e() {
        return new g(this);
    }

    public boolean f() {
        return false;
    }

    public h g() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i10 = this.f30759a;
        byte[] bArr = new byte[i10];
        StringBuilder sb2 = new StringBuilder(this.f30760b * (i10 + 1));
        for (int i11 = 0; i11 < this.f30760b; i11++) {
            bArr = c(i11, bArr);
            for (int i12 = 0; i12 < this.f30759a; i12++) {
                byte b10 = bArr[i12] & 255;
                sb2.append(b10 < 64 ? '#' : b10 < 128 ? '+' : b10 < 192 ? '.' : ' ');
            }
            sb2.append(10);
        }
        return sb2.toString();
    }
}
