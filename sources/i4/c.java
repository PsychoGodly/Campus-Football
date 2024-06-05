package i4;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import k4.a;
import k4.n0;
import n2.r1;
import p3.x0;
import r3.f;
import r3.n;

/* compiled from: BaseTrackSelection */
public abstract class c implements s {

    /* renamed from: a  reason: collision with root package name */
    protected final x0 f18956a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f18957b;

    /* renamed from: c  reason: collision with root package name */
    protected final int[] f18958c;

    /* renamed from: d  reason: collision with root package name */
    private final int f18959d;

    /* renamed from: e  reason: collision with root package name */
    private final r1[] f18960e;

    /* renamed from: f  reason: collision with root package name */
    private final long[] f18961f;

    /* renamed from: g  reason: collision with root package name */
    private int f18962g;

    public c(x0 x0Var, int... iArr) {
        this(x0Var, iArr, 0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int w(r1 r1Var, r1 r1Var2) {
        return r1Var2.f20650i - r1Var.f20650i;
    }

    public final x0 a() {
        return this.f18956a;
    }

    public final r1 b(int i10) {
        return this.f18960e[i10];
    }

    public final int c(r1 r1Var) {
        for (int i10 = 0; i10 < this.f18957b; i10++) {
            if (this.f18960e[i10] == r1Var) {
                return i10;
            }
        }
        return -1;
    }

    public void d() {
    }

    public /* synthetic */ boolean e(long j10, f fVar, List list) {
        return r.d(this, j10, fVar, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f18956a != cVar.f18956a || !Arrays.equals(this.f18958c, cVar.f18958c)) {
            return false;
        }
        return true;
    }

    public boolean g(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean h10 = h(i10, elapsedRealtime);
        int i11 = 0;
        while (i11 < this.f18957b && !h10) {
            h10 = i11 != i10 && !h(i11, elapsedRealtime);
            i11++;
        }
        if (!h10) {
            return false;
        }
        long[] jArr = this.f18961f;
        jArr[i10] = Math.max(jArr[i10], n0.b(elapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    public boolean h(int i10, long j10) {
        return this.f18961f[i10] > j10;
    }

    public int hashCode() {
        if (this.f18962g == 0) {
            this.f18962g = (System.identityHashCode(this.f18956a) * 31) + Arrays.hashCode(this.f18958c);
        }
        return this.f18962g;
    }

    public /* synthetic */ void i(boolean z10) {
        r.b(this, z10);
    }

    public void j() {
    }

    public final int l(int i10) {
        return this.f18958c[i10];
    }

    public final int length() {
        return this.f18958c.length;
    }

    public int m(long j10, List<? extends n> list) {
        return list.size();
    }

    public final int n() {
        return this.f18958c[f()];
    }

    public final r1 o() {
        return this.f18960e[f()];
    }

    public void q(float f10) {
    }

    public /* synthetic */ void s() {
        r.a(this);
    }

    public /* synthetic */ void t() {
        r.c(this);
    }

    public final int u(int i10) {
        for (int i11 = 0; i11 < this.f18957b; i11++) {
            if (this.f18958c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public c(x0 x0Var, int[] iArr, int i10) {
        int i11 = 0;
        a.f(iArr.length > 0);
        this.f18959d = i10;
        this.f18956a = (x0) a.e(x0Var);
        int length = iArr.length;
        this.f18957b = length;
        this.f18960e = new r1[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f18960e[i12] = x0Var.b(iArr[i12]);
        }
        Arrays.sort(this.f18960e, b.f33272a);
        this.f18958c = new int[this.f18957b];
        while (true) {
            int i13 = this.f18957b;
            if (i11 < i13) {
                this.f18958c[i11] = x0Var.c(this.f18960e[i11]);
                i11++;
            } else {
                this.f18961f = new long[i13];
                return;
            }
        }
    }
}
