package r2;

import android.net.Uri;
import j4.l;
import j4.u;
import java.util.Map;
import k4.a;
import k4.n0;
import n2.z1;
import r2.h;
import s6.d1;
import v6.e;

/* compiled from: DefaultDrmSessionManagerProvider */
public final class l implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f22068a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private z1.f f22069b;

    /* renamed from: c  reason: collision with root package name */
    private y f22070c;

    /* renamed from: d  reason: collision with root package name */
    private l.a f22071d;

    /* renamed from: e  reason: collision with root package name */
    private String f22072e;

    private y b(z1.f fVar) {
        l.a aVar = this.f22071d;
        if (aVar == null) {
            aVar = new u.b().e(this.f22072e);
        }
        Uri uri = fVar.f20825c;
        l0 l0Var = new l0(uri == null ? null : uri.toString(), fVar.f20830h, aVar);
        d1<Map.Entry<String, String>> m10 = fVar.f20827e.entrySet().iterator();
        while (m10.hasNext()) {
            Map.Entry next = m10.next();
            l0Var.e((String) next.getKey(), (String) next.getValue());
        }
        h a10 = new h.b().e(fVar.f20823a, k0.f22064d).b(fVar.f20828f).c(fVar.f20829g).d(e.l(fVar.f20832j)).a(l0Var);
        a10.F(0, fVar.c());
        return a10;
    }

    public y a(z1 z1Var) {
        y yVar;
        a.e(z1Var.f20785b);
        z1.f fVar = z1Var.f20785b.f20861c;
        if (fVar == null || n0.f19738a < 18) {
            return y.f22097a;
        }
        synchronized (this.f22068a) {
            if (!n0.c(fVar, this.f22069b)) {
                this.f22069b = fVar;
                this.f22070c = b(fVar);
            }
            yVar = (y) a.e(this.f22070c);
        }
        return yVar;
    }
}
