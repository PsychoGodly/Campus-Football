package r7;

import java.util.List;
import u7.l;
import u7.t;
import v7.d;
import v7.e;
import v7.f;
import v7.m;
import v7.o;

/* compiled from: UserData */
public class r1 {

    /* renamed from: a  reason: collision with root package name */
    private final t f30005a;

    /* renamed from: b  reason: collision with root package name */
    private final d f30006b;

    /* renamed from: c  reason: collision with root package name */
    private final List<e> f30007c;

    r1(t tVar, d dVar, List<e> list) {
        this.f30005a = tVar;
        this.f30006b = dVar;
        this.f30007c = list;
    }

    public f a(l lVar, m mVar) {
        d dVar = this.f30006b;
        if (dVar == null) {
            return new o(lVar, this.f30005a, mVar, this.f30007c);
        }
        return new v7.l(lVar, this.f30005a, dVar, mVar, this.f30007c);
    }
}
