package s2;

import k4.a;
import k4.n0;
import s2.b0;

/* compiled from: IndexSeekMap */
public final class z implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f22487a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f22488b;

    /* renamed from: c  reason: collision with root package name */
    private final long f22489c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f22490d;

    public z(long[] jArr, long[] jArr2, long j10) {
        a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f22490d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f22487a = jArr;
            this.f22488b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f22487a = jArr3;
            long[] jArr4 = new long[i10];
            this.f22488b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f22489c = j10;
    }

    public boolean f() {
        return this.f22490d;
    }

    public b0.a h(long j10) {
        if (!this.f22490d) {
            return new b0.a(c0.f22383c);
        }
        int i10 = n0.i(this.f22488b, j10, true, true);
        c0 c0Var = new c0(this.f22488b[i10], this.f22487a[i10]);
        if (c0Var.f22384a == j10 || i10 == this.f22488b.length - 1) {
            return new b0.a(c0Var);
        }
        int i11 = i10 + 1;
        return new b0.a(c0Var, new c0(this.f22488b[i11], this.f22487a[i11]));
    }

    public long i() {
        return this.f22489c;
    }
}
