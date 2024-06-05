package ef;

import bf.s;
import bf.u;
import bf.x;
import bf.z;
import ff.g;
import java.io.IOException;

/* compiled from: ConnectInterceptor */
public final class a implements s {

    /* renamed from: a  reason: collision with root package name */
    public final u f32530a;

    public a(u uVar) {
        this.f32530a = uVar;
    }

    public z a(s.a aVar) throws IOException {
        g gVar = (g) aVar;
        x h10 = gVar.h();
        g k10 = gVar.k();
        return gVar.j(h10, k10, k10.i(this.f32530a, aVar, !h10.f().equals("GET")), k10.d());
    }
}
