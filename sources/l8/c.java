package l8;

import e7.e;
import e7.r;
import java.util.Iterator;
import java.util.Set;

/* compiled from: DefaultUserAgentPublisher */
public class c implements i {

    /* renamed from: a  reason: collision with root package name */
    private final String f29195a;

    /* renamed from: b  reason: collision with root package name */
    private final d f29196b;

    c(Set<f> set, d dVar) {
        this.f29195a = e(set);
        this.f29196b = dVar;
    }

    public static e7.c<i> c() {
        return e7.c.e(i.class).b(r.m(f.class)).f(b.f36088a).d();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i d(e eVar) {
        return new c(eVar.g(f.class), d.a());
    }

    private static String e(Set<f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb2.append(next.b());
            sb2.append('/');
            sb2.append(next.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public String a() {
        if (this.f29196b.b().isEmpty()) {
            return this.f29195a;
        }
        return this.f29195a + ' ' + e(this.f29196b.b());
    }
}
