package c3;

import java.util.Arrays;
import k4.a;

/* compiled from: NalUnitTargetBuffer */
final class u {

    /* renamed from: a  reason: collision with root package name */
    private final int f5948a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5949b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5950c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f5951d;

    /* renamed from: e  reason: collision with root package name */
    public int f5952e;

    public u(int i10, int i11) {
        this.f5948a = i10;
        byte[] bArr = new byte[(i11 + 3)];
        this.f5951d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f5949b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f5951d;
            int length = bArr2.length;
            int i13 = this.f5952e;
            if (length < i13 + i12) {
                this.f5951d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f5951d, this.f5952e, i12);
            this.f5952e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f5949b) {
            return false;
        }
        this.f5952e -= i10;
        this.f5949b = false;
        this.f5950c = true;
        return true;
    }

    public boolean c() {
        return this.f5950c;
    }

    public void d() {
        this.f5949b = false;
        this.f5950c = false;
    }

    public void e(int i10) {
        boolean z10 = true;
        a.f(!this.f5949b);
        if (i10 != this.f5948a) {
            z10 = false;
        }
        this.f5949b = z10;
        if (z10) {
            this.f5952e = 3;
            this.f5950c = false;
        }
    }
}
