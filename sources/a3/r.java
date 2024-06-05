package a3;

import k4.a;
import k4.n0;

/* compiled from: TrackSampleTable */
final class r {

    /* renamed from: a  reason: collision with root package name */
    public final o f356a;

    /* renamed from: b  reason: collision with root package name */
    public final int f357b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f358c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f359d;

    /* renamed from: e  reason: collision with root package name */
    public final int f360e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f361f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f362g;

    /* renamed from: h  reason: collision with root package name */
    public final long f363h;

    public r(o oVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z10 = false;
        a.a(iArr.length == jArr2.length);
        a.a(jArr.length == jArr2.length);
        a.a(iArr2.length == jArr2.length ? true : z10);
        this.f356a = oVar;
        this.f358c = jArr;
        this.f359d = iArr;
        this.f360e = i10;
        this.f361f = jArr2;
        this.f362g = iArr2;
        this.f363h = j10;
        this.f357b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int i10 = n0.i(this.f361f, j10, true, false); i10 >= 0; i10--) {
            if ((this.f362g[i10] & 1) != 0) {
                return i10;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int e10 = n0.e(this.f361f, j10, true, false); e10 < this.f361f.length; e10++) {
            if ((this.f362g[e10] & 1) != 0) {
                return e10;
            }
        }
        return -1;
    }
}
