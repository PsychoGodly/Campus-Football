package k4;

import java.util.Arrays;

/* compiled from: TimedValueQueue */
public final class i0<V> {

    /* renamed from: a  reason: collision with root package name */
    private long[] f19716a;

    /* renamed from: b  reason: collision with root package name */
    private V[] f19717b;

    /* renamed from: c  reason: collision with root package name */
    private int f19718c;

    /* renamed from: d  reason: collision with root package name */
    private int f19719d;

    public i0() {
        this(10);
    }

    private void b(long j10, V v10) {
        int i10 = this.f19718c;
        int i11 = this.f19719d;
        V[] vArr = this.f19717b;
        int length = (i10 + i11) % vArr.length;
        this.f19716a[length] = j10;
        vArr[length] = v10;
        this.f19719d = i11 + 1;
    }

    private void d(long j10) {
        int i10 = this.f19719d;
        if (i10 > 0) {
            if (j10 <= this.f19716a[((this.f19718c + i10) - 1) % this.f19717b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f19717b.length;
        if (this.f19719d >= length) {
            int i10 = length * 2;
            long[] jArr = new long[i10];
            V[] f10 = f(i10);
            int i11 = this.f19718c;
            int i12 = length - i11;
            System.arraycopy(this.f19716a, i11, jArr, 0, i12);
            System.arraycopy(this.f19717b, this.f19718c, f10, 0, i12);
            int i13 = this.f19718c;
            if (i13 > 0) {
                System.arraycopy(this.f19716a, 0, jArr, i12, i13);
                System.arraycopy(this.f19717b, 0, f10, i12, this.f19718c);
            }
            this.f19716a = jArr;
            this.f19717b = f10;
            this.f19718c = 0;
        }
    }

    private static <V> V[] f(int i10) {
        return new Object[i10];
    }

    private V g(long j10, boolean z10) {
        V v10 = null;
        long j11 = Long.MAX_VALUE;
        while (this.f19719d > 0) {
            long j12 = j10 - this.f19716a[this.f19718c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            v10 = j();
            j11 = j12;
        }
        return v10;
    }

    private V j() {
        a.f(this.f19719d > 0);
        V[] vArr = this.f19717b;
        int i10 = this.f19718c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f19718c = (i10 + 1) % vArr.length;
        this.f19719d--;
        return v10;
    }

    public synchronized void a(long j10, V v10) {
        d(j10);
        e();
        b(j10, v10);
    }

    public synchronized void c() {
        this.f19718c = 0;
        this.f19719d = 0;
        Arrays.fill(this.f19717b, (Object) null);
    }

    public synchronized V h() {
        return this.f19719d == 0 ? null : j();
    }

    public synchronized V i(long j10) {
        return g(j10, true);
    }

    public synchronized int k() {
        return this.f19719d;
    }

    public i0(int i10) {
        this.f19716a = new long[i10];
        this.f19717b = f(i10);
    }
}
