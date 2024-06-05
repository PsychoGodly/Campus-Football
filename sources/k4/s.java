package k4;

import java.util.Arrays;

/* compiled from: LongArray */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private int f19771a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f19772b;

    public s() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f19771a;
        long[] jArr = this.f19772b;
        if (i10 == jArr.length) {
            this.f19772b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f19772b;
        int i11 = this.f19771a;
        this.f19771a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long b(int i10) {
        if (i10 >= 0 && i10 < this.f19771a) {
            return this.f19772b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f19771a);
    }

    public int c() {
        return this.f19771a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f19772b, this.f19771a);
    }

    public s(int i10) {
        this.f19772b = new long[i10];
    }
}
