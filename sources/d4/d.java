package d4;

import java.util.Collections;
import java.util.List;
import k4.a;
import k4.n0;
import y3.b;
import y3.h;

/* compiled from: SsaSubtitle */
final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    private final List<List<b>> f17741a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Long> f17742b;

    public d(List<List<b>> list, List<Long> list2) {
        this.f17741a = list;
        this.f17742b = list2;
    }

    public int a(long j10) {
        int d10 = n0.d(this.f17742b, Long.valueOf(j10), false, false);
        if (d10 < this.f17742b.size()) {
            return d10;
        }
        return -1;
    }

    public long c(int i10) {
        boolean z10 = true;
        a.a(i10 >= 0);
        if (i10 >= this.f17742b.size()) {
            z10 = false;
        }
        a.a(z10);
        return this.f17742b.get(i10).longValue();
    }

    public List<b> d(long j10) {
        int f10 = n0.f(this.f17742b, Long.valueOf(j10), true, false);
        if (f10 == -1) {
            return Collections.emptyList();
        }
        return this.f17741a.get(f10);
    }

    public int e() {
        return this.f17742b.size();
    }
}
