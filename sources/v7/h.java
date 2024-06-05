package v7;

import com.google.protobuf.i;
import g7.c;
import java.util.List;
import u7.j;
import u7.l;
import u7.w;
import y7.b;

/* compiled from: MutationBatchResult */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final g f30707a;

    /* renamed from: b  reason: collision with root package name */
    private final w f30708b;

    /* renamed from: c  reason: collision with root package name */
    private final List<i> f30709c;

    /* renamed from: d  reason: collision with root package name */
    private final i f30710d;

    /* renamed from: e  reason: collision with root package name */
    private final c<l, w> f30711e;

    private h(g gVar, w wVar, List<i> list, i iVar, c<l, w> cVar) {
        this.f30707a = gVar;
        this.f30708b = wVar;
        this.f30709c = list;
        this.f30710d = iVar;
        this.f30711e = cVar;
    }

    public static h a(g gVar, w wVar, List<i> list, i iVar) {
        b.d(gVar.h().size() == list.size(), "Mutations sent %d must equal results received %d", Integer.valueOf(gVar.h().size()), Integer.valueOf(list.size()));
        c<l, w> c10 = j.c();
        List<f> h10 = gVar.h();
        c<l, w> cVar = c10;
        for (int i10 = 0; i10 < h10.size(); i10++) {
            cVar = cVar.h(h10.get(i10).g(), list.get(i10).b());
        }
        return new h(gVar, wVar, list, iVar, cVar);
    }

    public g b() {
        return this.f30707a;
    }

    public w c() {
        return this.f30708b;
    }

    public c<l, w> d() {
        return this.f30711e;
    }

    public List<i> e() {
        return this.f30709c;
    }

    public i f() {
        return this.f30710d;
    }
}
