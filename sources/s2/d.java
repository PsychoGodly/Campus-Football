package s2;

import java.util.Arrays;
import k4.n0;
import s2.b0;

/* compiled from: ChunkIndex */
public final class d implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f22386a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f22387b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f22388c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f22389d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f22390e;

    /* renamed from: f  reason: collision with root package name */
    private final long f22391f;

    public d(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f22387b = iArr;
        this.f22388c = jArr;
        this.f22389d = jArr2;
        this.f22390e = jArr3;
        int length = iArr.length;
        this.f22386a = length;
        if (length > 0) {
            this.f22391f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f22391f = 0;
        }
    }

    public int b(long j10) {
        return n0.i(this.f22390e, j10, true, true);
    }

    public boolean f() {
        return true;
    }

    public b0.a h(long j10) {
        int b10 = b(j10);
        c0 c0Var = new c0(this.f22390e[b10], this.f22388c[b10]);
        if (c0Var.f22384a >= j10 || b10 == this.f22386a - 1) {
            return new b0.a(c0Var);
        }
        int i10 = b10 + 1;
        return new b0.a(c0Var, new c0(this.f22390e[i10], this.f22388c[i10]));
    }

    public long i() {
        return this.f22391f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f22386a + ", sizes=" + Arrays.toString(this.f22387b) + ", offsets=" + Arrays.toString(this.f22388c) + ", timeUs=" + Arrays.toString(this.f22390e) + ", durationsUs=" + Arrays.toString(this.f22389d) + ")";
    }
}
