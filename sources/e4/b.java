package e4;

import java.util.Collections;
import java.util.List;
import k4.a;
import k4.n0;
import y3.h;

/* compiled from: SubripSubtitle */
final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    private final y3.b[] f17928a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f17929b;

    public b(y3.b[] bVarArr, long[] jArr) {
        this.f17928a = bVarArr;
        this.f17929b = jArr;
    }

    public int a(long j10) {
        int e10 = n0.e(this.f17929b, j10, false, false);
        if (e10 < this.f17929b.length) {
            return e10;
        }
        return -1;
    }

    public long c(int i10) {
        boolean z10 = true;
        a.a(i10 >= 0);
        if (i10 >= this.f17929b.length) {
            z10 = false;
        }
        a.a(z10);
        return this.f17929b[i10];
    }

    public List<y3.b> d(long j10) {
        int i10 = n0.i(this.f17929b, j10, true, false);
        if (i10 != -1) {
            y3.b[] bVarArr = this.f17928a;
            if (bVarArr[i10] != y3.b.f23820s) {
                return Collections.singletonList(bVarArr[i10]);
            }
        }
        return Collections.emptyList();
    }

    public int e() {
        return this.f17929b.length;
    }
}
