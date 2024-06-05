package g4;

import java.util.Collections;
import java.util.List;
import k4.a;
import y3.h;

/* compiled from: Tx3gSubtitle */
final class b implements h {

    /* renamed from: b  reason: collision with root package name */
    public static final b f18104b = new b();

    /* renamed from: a  reason: collision with root package name */
    private final List<y3.b> f18105a;

    public b(y3.b bVar) {
        this.f18105a = Collections.singletonList(bVar);
    }

    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    public long c(int i10) {
        a.a(i10 == 0);
        return 0;
    }

    public List<y3.b> d(long j10) {
        return j10 >= 0 ? this.f18105a : Collections.emptyList();
    }

    public int e() {
        return 1;
    }

    private b() {
        this.f18105a = Collections.emptyList();
    }
}
