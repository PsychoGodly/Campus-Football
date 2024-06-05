package z3;

import java.util.Collections;
import java.util.List;
import k4.a;
import y3.b;
import y3.h;

/* compiled from: CeaSubtitle */
final class f implements h {

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f24234a;

    public f(List<b> list) {
        this.f24234a = list;
    }

    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    public long c(int i10) {
        a.a(i10 == 0);
        return 0;
    }

    public List<b> d(long j10) {
        return j10 >= 0 ? this.f24234a : Collections.emptyList();
    }

    public int e() {
        return 1;
    }
}
