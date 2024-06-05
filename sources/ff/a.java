package ff;

import bf.k;
import bf.l;
import bf.s;
import bf.t;
import bf.x;
import bf.y;
import bf.z;
import cf.c;
import cf.d;
import java.io.IOException;
import java.util.List;
import lf.j;

/* compiled from: BridgeInterceptor */
public final class a implements s {

    /* renamed from: a  reason: collision with root package name */
    private final l f32772a;

    public a(l lVar) {
        this.f32772a = lVar;
    }

    private String b(List<k> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                sb2.append("; ");
            }
            k kVar = list.get(i10);
            sb2.append(kVar.c());
            sb2.append('=');
            sb2.append(kVar.k());
        }
        return sb2.toString();
    }

    public z a(s.a aVar) throws IOException {
        x h10 = aVar.h();
        x.a g10 = h10.g();
        y a10 = h10.a();
        if (a10 != null) {
            t b10 = a10.b();
            if (b10 != null) {
                g10.b("Content-Type", b10.toString());
            }
            long a11 = a10.a();
            if (a11 != -1) {
                g10.b("Content-Length", Long.toString(a11));
                g10.e("Transfer-Encoding");
            } else {
                g10.b("Transfer-Encoding", "chunked");
                g10.e("Content-Length");
            }
        }
        boolean z10 = false;
        if (h10.c("Host") == null) {
            g10.b("Host", c.s(h10.h(), false));
        }
        if (h10.c("Connection") == null) {
            g10.b("Connection", "Keep-Alive");
        }
        if (h10.c("Accept-Encoding") == null && h10.c("Range") == null) {
            z10 = true;
            g10.b("Accept-Encoding", "gzip");
        }
        List<k> b11 = this.f32772a.b(h10.h());
        if (!b11.isEmpty()) {
            g10.b("Cookie", b(b11));
        }
        if (h10.c("User-Agent") == null) {
            g10.b("User-Agent", d.a());
        }
        z d10 = aVar.d(g10.a());
        e.e(this.f32772a, h10.h(), d10.A());
        z.a p10 = d10.B().p(h10);
        if (z10 && "gzip".equalsIgnoreCase(d10.q("Content-Encoding")) && e.c(d10)) {
            j jVar = new j(d10.h().u());
            p10.j(d10.A().f().e("Content-Encoding").e("Content-Length").d());
            p10.b(new h(d10.q("Content-Type"), -1, lf.l.b(jVar)));
        }
        return p10.c();
    }
}
