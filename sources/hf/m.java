package hf;

import java.util.Arrays;

/* compiled from: Settings */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private int f33239a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f33240b = new int[10];

    /* access modifiers changed from: package-private */
    public void a() {
        this.f33239a = 0;
        Arrays.fill(this.f33240b, 0);
    }

    /* access modifiers changed from: package-private */
    public int b(int i10) {
        return this.f33240b[i10];
    }

    /* access modifiers changed from: package-private */
    public int c() {
        if ((this.f33239a & 2) != 0) {
            return this.f33240b[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        if ((this.f33239a & 128) != 0) {
            return this.f33240b[7];
        }
        return 65535;
    }

    /* access modifiers changed from: package-private */
    public int e(int i10) {
        return (this.f33239a & 16) != 0 ? this.f33240b[4] : i10;
    }

    /* access modifiers changed from: package-private */
    public int f(int i10) {
        return (this.f33239a & 32) != 0 ? this.f33240b[5] : i10;
    }

    /* access modifiers changed from: package-private */
    public boolean g(int i10) {
        return ((1 << i10) & this.f33239a) != 0;
    }

    /* access modifiers changed from: package-private */
    public void h(m mVar) {
        for (int i10 = 0; i10 < 10; i10++) {
            if (mVar.g(i10)) {
                i(i10, mVar.b(i10));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public m i(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f33240b;
            if (i10 < iArr.length) {
                this.f33239a = (1 << i10) | this.f33239a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return Integer.bitCount(this.f33239a);
    }
}
