package ff;

import bf.a0;
import bf.t;
import lf.e;

/* compiled from: RealResponseBody */
public final class h extends a0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f32792a;

    /* renamed from: b  reason: collision with root package name */
    private final long f32793b;

    /* renamed from: c  reason: collision with root package name */
    private final e f32794c;

    public h(String str, long j10, e eVar) {
        this.f32792a = str;
        this.f32793b = j10;
        this.f32794c = eVar;
    }

    public long i() {
        return this.f32793b;
    }

    public t j() {
        String str = this.f32792a;
        if (str != null) {
            return t.d(str);
        }
        return null;
    }

    public e u() {
        return this.f32794c;
    }
}
