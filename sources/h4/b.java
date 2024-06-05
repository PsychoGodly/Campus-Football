package h4;

import java.util.Collections;
import java.util.List;
import k4.a;
import y3.h;

/* compiled from: Mp4WebvttSubtitle */
final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    private final List<y3.b> f18745a;

    public b(List<y3.b> list) {
        this.f18745a = Collections.unmodifiableList(list);
    }

    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    public long c(int i10) {
        a.a(i10 == 0);
        return 0;
    }

    public List<y3.b> d(long j10) {
        return j10 >= 0 ? this.f18745a : Collections.emptyList();
    }

    public int e() {
        return 1;
    }
}
