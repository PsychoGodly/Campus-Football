package lf;

/* compiled from: SegmentPool */
final class p {

    /* renamed from: a  reason: collision with root package name */
    static o f36290a;

    /* renamed from: b  reason: collision with root package name */
    static long f36291b;

    private p() {
    }

    static void a(o oVar) {
        if (oVar.f36288f != null || oVar.f36289g != null) {
            throw new IllegalArgumentException();
        } else if (!oVar.f36286d) {
            synchronized (p.class) {
                long j10 = f36291b;
                if (j10 + 8192 <= 65536) {
                    f36291b = j10 + 8192;
                    oVar.f36288f = f36290a;
                    oVar.f36285c = 0;
                    oVar.f36284b = 0;
                    f36290a = oVar;
                }
            }
        }
    }

    static o b() {
        synchronized (p.class) {
            o oVar = f36290a;
            if (oVar == null) {
                return new o();
            }
            f36290a = oVar.f36288f;
            oVar.f36288f = null;
            f36291b -= 8192;
            return oVar;
        }
    }
}
